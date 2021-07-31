package com.selimhorri.pack.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
public class Director {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "director_id")
	private Integer directorId;
	
	private String fname;
	
	private String lname;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate hiredate;
	
}







