package com.microbeatlas.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "samples")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Sample {
	@Id
	@Column(name = "sid")
	private String sid;

	//@FullTextField()
	@Column(name = "name")
	private String name;

	//@FullTextField()
	@Column(name = "rids")
	private String rids;

	@Column(name = "num_rids")
	private Integer num_rids;

	@Column(name = "lat")
	private Float lat;

	@Column(name = "lon")
	private Float lon;

	//@FullTextField()
	@Column(name = "keywords_clean")
	private String keywords_clean;

	//@FullTextField()
	@Column(name = "taxa_stats")
	private String taxa_stats;

	@Column(name = "sample_env")
	private String sample_env;

	@Column(name = "meta")
	@Lob
	private byte[] meta;
	//private String meta;

	//@FullTextField()
	@Column(name = "projects")
	private String projects;

	//@FullTextField()
	@Column(name = "publications")
	private String publications;

	@Column(name = "num_hq_runs")
	private Integer num_hq_runs;
}
