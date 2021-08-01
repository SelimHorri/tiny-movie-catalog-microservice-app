package com.selimhorri.pack.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "directors")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class Director implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "director_id")
	private Integer directorId;
	
	private String fname;
	
	private String lname;
	
	@JsonFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate hiredate;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "director", cascade = CascadeType.ALL)
	private Set<Movie> movies;
	
}







