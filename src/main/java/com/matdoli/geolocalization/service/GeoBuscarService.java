package com.matdoli.geolocalization.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.repository.GeoRepository;

@Service
public class GeoBuscarService {

	@Autowired
	private GeoRepository geoRepository;

	public GeoEntidade buscarPorId(Long id) {

		Optional<GeoEntidade> OptionalGeo = geoRepository.findById(id);
		GeoEntidade geo = new GeoEntidade();

		geo = OptionalGeo.get();

		return geo;
	}

	public void deletarPorId(Long id) {

		Optional<GeoEntidade> optionalGeo = geoRepository.findById(id);
		geoRepository.delete(optionalGeo.get());
		
	}

}
