package com.selimhorri.pack.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.selimhorri.pack.model.entity.Director;

public interface DirectorService {
	
	List<Director> findAll();
	List<Director> findAll(final Pageable pageable);
	Director findById(final Integer directorId);
	Director save(final Director director);
	Director update(final Director director);
	void deleteById(final Integer directorId);
	
}






