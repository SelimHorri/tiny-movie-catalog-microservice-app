package com.selimhorri.pack.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.selimhorri.pack.model.entity.Director;
import com.selimhorri.pack.repository.DirectorRepository;
import com.selimhorri.pack.service.DirectorService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {
	
	private final DirectorRepository directorRepository;
	
	@Override
	public List<Director> findAll() {
		return this.directorRepository.findAll();
	}
	
	@Override
	public List<Director> findAll(final Pageable pageable) {
		return this.directorRepository.findAll(pageable).toList();
	}
	
	@Override
	public Director findById(final Integer directorId) {
		return this.directorRepository.findById(directorId).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Director save(final Director director) {
		return this.directorRepository.save(director);
	}
	
	@Override
	public Director update(final Director director) {
		return this.directorRepository.save(director);
	}
	
	@Override
	public void deleteById(final Integer directorId) {
		this.directorRepository.deleteById(directorId);
	}
	
	
	
}









