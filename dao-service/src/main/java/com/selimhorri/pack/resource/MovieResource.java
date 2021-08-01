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
import com.selimhorri.pack.model.entity.Movie;
import com.selimhorri.pack.service.MovieService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = {"/movies"})
@RequiredArgsConstructor
public class MovieResource {
	
	private final MovieService movieService;
	
	@GetMapping
	public ResponseEntity<DtoCollection<Movie>> findAll() {
		return new ResponseEntity<>(new DtoCollection<>(this.movieService.findAll()), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{movieId}"})
	public ResponseEntity<Movie> findById(@PathVariable("movieId") final String movieId) {
		return new ResponseEntity<>(this.movieService.findById(Integer.parseInt(movieId)), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Movie> save(@RequestBody final Movie movie) {
		return new ResponseEntity<>(this.movieService.save(movie), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Movie> update(@RequestBody final Movie movie) {
		return new ResponseEntity<>(this.movieService.update(movie), HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{movieId}"})
	public ResponseEntity<Boolean> deleteById(@PathVariable("movieId") final String movieId) {
		this.movieService.deleteById(Integer.parseInt(movieId));
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	
	
}








