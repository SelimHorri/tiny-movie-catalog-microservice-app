package com.selimhorri.pack.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.selimhorri.pack.model.entity.Movie;

public interface MovieService {
	
	List<Movie> findAll();
	List<Movie> findAll(final Pageable pageable);
	Movie findById(final Integer movieId);
	Movie save(final Movie movie);
	Movie update(final Movie movie);
	void deleteById(final Integer movieId);
	
}






