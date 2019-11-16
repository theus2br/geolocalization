package com.matdoli.geolocalization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.resources.model.GeoResource;
import com.matdoli.geolocalization.service.GeoBuscarService;
import com.matdoli.geolocalization.service.GeoCadastroServiceImpl;
import com.matdoli.geolocalization.service.GeoServiceImpl;

@RestController
@RequestMapping(path = "/postgres")
public class GeoController {

	@Autowired
	private GeoServiceImpl buscarGeoImpl;

	@Autowired
	private GeoCadastroServiceImpl cadastroService;
	
	@Autowired
	private GeoBuscarService buscarService;
	
	@GetMapping(path = "/geolocalizacao")
	public List<GeoEntidade> buscarAllGeo() {
		return buscarGeoImpl.buscarTodasGeo();
	}

	@PostMapping(path = "/geolocalizacao/save")
	public void salvarGeolocalizacao(@RequestBody GeoResource geolocalizacao) {
		cadastroService.cadastro(geolocalizacao);
	}
	
	@GetMapping(path = "/geolocalizacao/id/{id}")
	public GeoEntidade buscarPorId(@PathVariable(name="id", required = true) Long id) {
		return buscarService.buscarPorId(id);
	}

}
