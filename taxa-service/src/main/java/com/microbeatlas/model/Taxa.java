package com.microbeatlas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "taxa")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Taxa {

	@Id
	@Column(name = "taxon_id")
	private String taxon_id;

	@Column(name = "taxonomy")
	private String taxonomy;

	@Column(name = "species")
	private String species;
}
