package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class MusicalInstrument {

	private @Id @GeneratedValue Long id;
	private String name;
	private Double price;

	private MusicalInstrument () {}

	public MusicalInstrument (String name, Double price) {
		this.name = name;
		this.price = price;
	}
}