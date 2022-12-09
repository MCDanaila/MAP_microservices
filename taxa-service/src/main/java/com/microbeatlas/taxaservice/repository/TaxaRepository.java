package com.microbeatlas.taxaservice.repository;

import com.microbeatlas.taxaservice.model.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaRepository extends JpaRepository<Taxa, String> {
}
