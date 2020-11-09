package com.proyectosj4sas.app.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Obrero implements Serializable {

	private Long id;
	private Obra obraObrero;
	private Trabajador trabajador;
	private static final long serialVersionUID = 1L;

}