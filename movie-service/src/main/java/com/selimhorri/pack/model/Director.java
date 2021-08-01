package com.selimhorri.pack.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class Director implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer directorId;
	private String fname;
	private String lname;
	
	@JsonFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate hiredate;
	
	// private Set<Movie> movies;
	
}







