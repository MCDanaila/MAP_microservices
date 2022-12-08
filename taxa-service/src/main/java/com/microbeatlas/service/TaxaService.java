package com.microbeatlas.service;

import com.microbeatlas.model.Taxa;
import com.microbeatlas.repository.TaxaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TaxaService {

	private final TaxaRepository taxaRepository;

	public Page<Taxa> findAll(Pageable limit) {
		return taxaRepository.findAll(limit);
	}

	public Optional<Taxa> findById(String tid) {
		return taxaRepository.findById(tid);
	}
}
