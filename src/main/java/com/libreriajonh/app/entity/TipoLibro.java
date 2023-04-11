package com.libreriajonh.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

public class TipoLibro  implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(unique= true,length = 50, nullable = false)
	private String tipolibro;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipolibro() {
		return tipolibro;
	}
	public void setTipolibro(String tipolibro) {
		this.tipolibro = tipolibro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
