package com.selimhorri.pack.service;

import java.util.List;

import com.selimhorri.pack.model.Director;

public interface DirectorService {
	
	List<Director> findAll();
	Director findById(final Integer directorId);
	Director save(final Director director);
	Director update(final Director director);
	void deleteById(final Integer directorId);
	
}






