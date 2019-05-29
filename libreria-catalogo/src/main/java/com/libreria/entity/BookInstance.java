package com.libreria.entity;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BookInstance {

	private Boolean restricted;
	
	private String isbn;
	
	private String instanceId;
}
