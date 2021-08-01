package com.selimhorri.pack.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class Movie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer movieId;
	private String title;
	private Double imdbRating;
	private Director director;
	
}





