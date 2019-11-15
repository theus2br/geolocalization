package com.matdoli.geolocalization.service;

import org.springframework.stereotype.Component;

import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.resources.model.GeoResource;

import br.com.nutrition.exception.NutricionistaResourceException;

@Component
public class GeoConversor {

    public GeoEntidade conversor(GeoResource geoResource)
            throws NutricionistaResourceException {

        try {
        	GeoEntidade geoEntidade = new GeoEntidade();
            Long idGeo = checkIdGeo(
                    geoResource.getId());

            geoEntidade.setId(idGeo);
            geoEntidade.setNomeUsuario(geoResource.getNomeUsuario());
            geoEntidade.setLatitude(geoResource.getLatitude());
            geoEntidade.setLongitude(geoResource.getLongitude());
            
            return geoEntidade;

        } catch (Exception e) {
            throw new NutricionistaResourceException(
                    "Falha ao converter o resource para entidade, resouce: "
                            + geoResource);
        }

    }

    private Long checkIdGeo(String idGeo) {
        return Long.parseLong(idGeo);
    }
  
}