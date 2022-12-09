package com.microbeatlas.samplesservice.repository;

import com.microbeatlas.samplesservice.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplesRepository extends JpaRepository<Sample, String> {
}
