package com.matdoli.geolocalization.resources.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoResource {
	
	@JsonProperty("nome_usuario")
	String nomeUsuario;
	
	@JsonProperty("latitude")
	String latitude;
	
	@JsonProperty("longitude")
	String longitude;

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
