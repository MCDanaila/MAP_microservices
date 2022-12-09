package com.microbeatlas.taxaservice.service;

import com.microbeatlas.taxaservice.dto.TaxonDto;
import com.microbeatlas.taxaservice.model.Taxa;
import com.microbeatlas.taxaservice.repository.TaxaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TaxaService {

	private final TaxaRepository taxaRepository;

	public Page<Taxa> findAll(Pageable limit) {
		return taxaRepository.findAll(limit);
	}

	public TaxonDto findById(String tid) {
		return taxaRepository.findById(tid).stream()
				.map(taxon -> TaxonDto.builder()
								.taxon_id(taxon.getTaxon_id())
								.taxonomy(taxon.getTaxonomy())
								.species(taxon.getSpecies())
								.build()
				).findFirst().get();
	}
}
