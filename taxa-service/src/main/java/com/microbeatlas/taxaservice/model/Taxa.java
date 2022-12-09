package com.microbeatlas.taxaservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
