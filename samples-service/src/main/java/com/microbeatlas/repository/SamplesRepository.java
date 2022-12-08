package com.microbeatlas.repository;

import com.microbeatlas.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplesRepository extends JpaRepository<Sample, String> {
}
