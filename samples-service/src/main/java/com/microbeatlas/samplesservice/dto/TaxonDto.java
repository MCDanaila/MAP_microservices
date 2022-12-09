package com.microbeatlas.samplesservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaxonDto {
	private String taxon_id;
	private String taxonomy;
	private String species;
}
