package com.matdoli.geolocalization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matdoli.geolocalization.model.GeoEntidade;
import com.matdoli.geolocalization.repository.GeoRepository;

@Service
public class GeoServiceImpl {

	@Autowired
	private GeoRepository geoRepository;
	
	public List<GeoEntidade> buscarTodasGeo(){
		List<GeoEntidade> listGeolocalization = geoRepository.findAll();
        return listGeolocalization;
	}
	
	
}
