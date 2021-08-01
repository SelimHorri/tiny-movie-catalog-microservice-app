package com.selimhorri.pack.service;

import java.util.List;

import com.selimhorri.pack.model.Movie;

public interface MovieService {
	
	List<Movie> findAll();
	Movie findById(final Integer movieId);
	Movie save(final Movie movie);
	Movie update(final Movie movie);
	void deleteById(final Integer movieId);
	
}






