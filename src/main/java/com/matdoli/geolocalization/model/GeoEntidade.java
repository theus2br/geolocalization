package com.matdoli.geolocalization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "geolocalizacao")
public class GeoEntidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(name= "nome_usuario")
	String nomeUsuario;
	
	String latitude;
	String longitude;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public GeoEntidade() {
		// TODO Auto-generated constructor stub
	}
	public GeoEntidade(Long id, String nomeUsuario, String latitude, String longitude) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
}
