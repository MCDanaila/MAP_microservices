package com.microbeatlas.samplesservice.service;

import com.microbeatlas.samplesservice.dto.TaxonDto;
import com.microbeatlas.samplesservice.model.Sample;
import com.microbeatlas.samplesservice.repository.SamplesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class SamplesService {

	private final SamplesRepository samplesRepository;
	private final WebClient.Builder webClientBuilder;
	public Page<Sample> findAll(Pageable limit) {
		return samplesRepository.findAll(limit);
	}

	public Optional<Sample> findById(String sid) {
		return samplesRepository.findById(sid);
	}

	public TaxonDto getTaxon(String tid) {
		TaxonDto taxonDto =  webClientBuilder.build().get()
				.uri("http://taxa-service/api/taxa/",
						uriBuilder -> uriBuilder.path(tid).build())
				.retrieve()
				.bodyToMono(TaxonDto.class)
				.block();
		log.info(String.valueOf(taxonDto));
		return taxonDto;
	}
}
