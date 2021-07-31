package com.selimhorri.pack.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.selimhorri.pack.model.entity.Movie;
import com.selimhorri.pack.repository.MovieRepository;
import com.selimhorri.pack.service.MovieService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
	
	private final MovieRepository movieRepository;
	
	@Override
	public List<Movie> findAll() {
		return this.movieRepository.findAll();
	}
	
	@Override
	public List<Movie> findAll(final Pageable pageable) {
		return this.movieRepository.findAll(pageable).toList();
	}
	
	@Override
	public Movie findById(final Integer movieId) {
		return this.movieRepository.findById(movieId).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Movie save(final Movie movie) {
		return this.movieRepository.save(movie);
	}
	
	@Override
	public Movie update(final Movie movie) {
		return this.movieRepository.save(movie);
	}
	
	@Override
	public void deleteById(final Integer movieId) {
		this.movieRepository.deleteById(movieId);
	}
	
	
	
}









