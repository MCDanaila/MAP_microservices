package com.microbeatlas.service;

import com.microbeatlas.model.Sample;
import com.microbeatlas.repository.SamplesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class SamplesService {

	private final SamplesRepository samplesRepository;

	public Page<Sample> findAll(Pageable limit) {
		return samplesRepository.findAll(limit);
	}

	public Optional<Sample> findById(String sid) {
		return samplesRepository.findById(sid);
	}
}
