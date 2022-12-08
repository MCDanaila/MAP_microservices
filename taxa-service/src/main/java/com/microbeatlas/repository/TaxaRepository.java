package com.microbeatlas.repository;

import com.microbeatlas.model.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaRepository extends JpaRepository<Taxa, String> {
}
