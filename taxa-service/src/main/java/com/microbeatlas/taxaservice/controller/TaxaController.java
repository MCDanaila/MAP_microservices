package com.microbeatlas.taxaservice.controller;

import com.microbeatlas.taxaservice.dto.TaxonDto;
import com.microbeatlas.taxaservice.model.Taxa;
import com.microbeatlas.taxaservice.service.TaxaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taxa")
@RequiredArgsConstructor
public class TaxaController {

	private final TaxaService taxaService;

	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public String welcome() {
		return "Taxa controller running!!!!!";
	}

	@GetMapping("/all")
	public List<Taxa> index(){
		Pageable limit = PageRequest.of(0,50);
		return taxaService.findAll(limit).toList();
	}

	@GetMapping("/{tid}")
	public TaxonDto getTaxon(@PathVariable(name = "tid") String sid){
		return taxaService.findById(sid);
	}

}
