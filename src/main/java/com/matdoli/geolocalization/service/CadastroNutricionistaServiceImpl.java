package com.matdoli.geolocalization.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matdoli.geolocalization.exception.NutricionistaResourceException;
import com.matdoli.geolocalization.repository.GeoRepository;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;
import br.com.nutrition.resource.model.NutricionistaResource;

@Service
public class CadastroNutricionistaServiceImpl {

    private static final Logger LOG = Logger
            .getLogger(CadastroNutricionistaServiceImpl.class);

    @Autowired
    private GeoRepository geoRepository;

    @Autowired
    private NutricionistaConversor service;

    public void cadastro(NutricionistaResource nutricionistaResource) {

        try {
            Nutricionista nutricionista = service
                    .conversor(nutricionistaResource);
            nutricionistaRepository.saveAndFlush(nutricionista);
        } catch (NutricionistaResourceException e) {
            LOG.error("Erro ao salvar o nutricionista: " + e.getMessage(), e);
        }
    }

}
