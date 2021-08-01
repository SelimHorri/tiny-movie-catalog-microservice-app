package com.selimhorri.pack.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.pack.model.dto.DtoCollection;
import com.selimhorri.pack.model.entity.Director;
import com.selimhorri.pack.service.DirectorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = {"/directors"})
@RequiredArgsConstructor
public class DirectorResource {
	
	private final DirectorService directorService;
	
	@GetMapping
	public ResponseEntity<DtoCollection<Director>> findAll() {
		return new ResponseEntity<>(new DtoCollection<>(this.directorService.findAll()), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{directorId}"})
	public ResponseEntity<Director> findById(@PathVariable("directorId") final String directorId) {
		return new ResponseEntity<>(this.directorService.findById(Integer.parseInt(directorId)), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Director> save(@RequestBody final Director director) {
		return new ResponseEntity<>(this.directorService.save(director), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Director> update(@RequestBody final Director director) {
		return new ResponseEntity<>(this.directorService.update(director), HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{directorId}"})
	public ResponseEntity<Boolean> deleteById(@PathVariable("directorId") final String directorId) {
		this.directorService.deleteById(Integer.parseInt(directorId));
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	
	
}








