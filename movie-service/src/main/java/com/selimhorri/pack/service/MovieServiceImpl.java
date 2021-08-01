package com.selimhorri.pack.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.selimhorri.pack.constant.BackendApiUrlConstant;
import com.selimhorri.pack.model.Movie;
import com.selimhorri.pack.model.DtoCollection;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
	
	private static final String API_URL = BackendApiUrlConstant.DaoServiceDevApiUrlConstant.API_URL + "/movies";
	private final RestTemplate restTemplate;
	
	@Override
	public List<Movie> findAll() {
		return this.restTemplate.exchange(
				API_URL,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<DtoCollection<Movie>>() {})
			.getBody()
			.getCollection();
	}
	
	@Override
	public Movie findById(Integer movieId) {
		return this.restTemplate.getForObject(API_URL + "/" + movieId, Movie.class);
	}
	
	@Override
	public Movie save(Movie movie) {
		return this.restTemplate.postForObject(API_URL, movie, Movie.class);
	}
	
	@Override
	public Movie update(Movie movie) {
		return this.restTemplate.exchange(
				API_URL,
				HttpMethod.PUT,
				new HttpEntity<Movie>(movie),
				Movie.class)
			.getBody();
	}
	
	@Override
	public void deleteById(Integer movieId) {
		this.restTemplate.delete(API_URL + "/" + movieId);
	}
	
	
	
}







