package com.matdoli.geolocalization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.resources.model.GeoResource;
import com.matdoli.geolocalization.service.GeoServiceImpl;

@RestController
@RequestMapping(path ="/postgres")
public class GeoController {
	
	@Autowired
	private GeoServiceImpl buscarGeoImpl;
	
	
	@GetMapping(path = "/geolocalizacao")
	public List<GeoEntidade> buscarAllGeo(){
		return buscarGeoImpl.buscarTodasGeo();
	}
	
	 @PostMapping(path = "/geolocalizacao/save")
	    public void salvarGeolocalizacao(
	            @RequestBody GeoResource nutricionista) {
	        serviceCadastro.cadastro(nutricionista);
	    }
}
}