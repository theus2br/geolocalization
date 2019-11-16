package com.matdoli.geolocalization.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matdoli.geolocalization.exception.GeolocalizationResourceException;
import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.repository.GeoRepository;
import com.matdoli.geolocalization.resources.model.GeoResource;

@Service
public class GeoBuscarService {

	@Autowired
	private GeoRepository geoRepository;

    @Autowired
    private GeoConversor service;
    
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
	
	public GeoEntidade alterarPorId(Long id, GeoResource geoResources) throws GeolocalizationResourceException {
		 GeoEntidade geolocalizacao = service.conversor(geoResources);
		 geoRepository.saveAndFlush(geolocalizacao);
		 return geolocalizacao;
	}

}
