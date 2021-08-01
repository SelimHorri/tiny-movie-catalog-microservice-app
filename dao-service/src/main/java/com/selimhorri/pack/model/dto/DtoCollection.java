package com.selimhorri.pack.model.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public final class DtoCollection<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<T> collection;
	
}
