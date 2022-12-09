package com.microbeatlas.samplesservice.controller;

import com.microbeatlas.samplesservice.dto.TaxonDto;
import com.microbeatlas.samplesservice.model.Sample;
import com.microbeatlas.samplesservice.service.SamplesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/samples")
@RequiredArgsConstructor
public class SamplesController {

	private final SamplesService samplesService;

	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public String welcome() {
		return "Samples service running!!!!!";
	}

	@GetMapping("/all")
	public List<Sample> index(){
		Pageable limit = PageRequest.of(0,50);
		return samplesService.findAll(limit).toList();
	}

	@GetMapping("/{sid}")
	public Optional<Sample> getSample(@PathVariable(name = "sid") String sid){
		return samplesService.findById(sid);
	}

	@GetMapping("/taxa/{tid}")
	public TaxonDto getTaxon(@PathVariable(name = "tid") String tid){
		return samplesService.getTaxon(tid);
	}
}
