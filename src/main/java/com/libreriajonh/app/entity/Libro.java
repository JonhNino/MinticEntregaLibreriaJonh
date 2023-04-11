package com.libreriajonh.app.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="libro")
public class Libro implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(unique= true,length = 50, nullable = false)
	private String isbn;
	@NotEmpty
	@Column(unique= true,length = 50, nullable = false)
	private String titulo;
	@NotEmpty	
	private String editorial;
	@NotEmpty
	@Column(unique= true,length = 50, nullable = false)
	private String pais;
	@NotEmpty
	@Column(unique= true,length = 50, nullable = false)
	private String tipolibro;
	@NotEmpty
	@Column(length = 50, nullable = false)
	private String edicion;
	@NotNull
	@Column(name="fechalanzamiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechalanzamiento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTipolibro() {
		return tipolibro;
	}
	public void setTipolibro(String tipolibro) {
		this.tipolibro = tipolibro;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public Date getFechalanzamiento() {
		return fechalanzamiento;
	}
	public void setFechalanzamiento(Date fechalanzamiento) {
		this.fechalanzamiento = fechalanzamiento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 

}
