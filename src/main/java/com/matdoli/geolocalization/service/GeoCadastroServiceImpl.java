package com.matdoli.geolocalization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.repository.GeoRepository;
import com.matdoli.geolocalization.resources.model.GeoResource;

import br.com.nutrition.exception.NutricionistaResourceException;

@Service
public class GeoCadastroServiceImpl {

	@Autowired
	private GeoRepository geoRepository;
	
    @Autowired
    private GeoConversor service;

    public void cadastro(GeoResource geoResources) {

        try {
            GeoEntidade nutricionista = service
                    .conversor(geoResources);
            geoRepository.saveAndFlush(nutricionista);
        } catch (NutricionistaResourceException e) {
        	System.out.println("Erro ao cadastrar usuario");
        }
    }
	
	
}
