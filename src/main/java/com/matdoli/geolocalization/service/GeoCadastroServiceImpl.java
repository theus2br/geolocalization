package com.matdoli.geolocalization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matdoli.geolocalization.exception.GeolocalizationResourceException;
import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.repository.GeoRepository;
import com.matdoli.geolocalization.resources.model.GeoResource;

@Service
public class GeoCadastroServiceImpl {

	@Autowired
	private GeoRepository geoRepository;
	
    @Autowired
    private GeoConversor service;

    public void cadastro(GeoResource geoResources) {

        try {
            GeoEntidade geolocalizacao = service
                    .conversor(geoResources);
            geoRepository.saveAndFlush(geolocalizacao);
        } catch (GeolocalizationResourceException e) {
        	System.out.println("Erro ao cadastrar geolocalizacao");
        }
    }
	
	
}
