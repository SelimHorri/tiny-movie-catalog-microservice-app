package com.selimhorri.pack.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.selimhorri.pack.constant.BackendApiUrlConstant;
import com.selimhorri.pack.model.Director;
import com.selimhorri.pack.model.DtoCollection;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {
	
	private static final String API_URL = BackendApiUrlConstant.DaoServiceDevApiUrlConstant.API_URL + "/directors";
	private final RestTemplate restTemplate;
	
	@Override
	public List<Director> findAll() {
		return this.restTemplate.exchange(
				API_URL,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<DtoCollection<Director>>() {})
			.getBody()
			.getCollection();
	}
	
	@Override
	public Director findById(Integer directorId) {
		return this.restTemplate.getForObject(API_URL + "/" + directorId, Director.class);
	}
	
	@Override
	public Director save(Director director) {
		return this.restTemplate.postForObject(API_URL, director, Director.class);
	}
	
	@Override
	public Director update(Director director) {
		return this.restTemplate.exchange(
				API_URL,
				HttpMethod.PUT,
				new HttpEntity<Director>(director),
				Director.class)
			.getBody();
	}
	
	@Override
	public void deleteById(Integer directorId) {
		this.restTemplate.delete(API_URL + "/" + directorId);
	}
	
	
	
}







