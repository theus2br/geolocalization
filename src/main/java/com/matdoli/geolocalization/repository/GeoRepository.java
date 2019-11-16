package com.matdoli.geolocalization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matdoli.geolocalization.model.GeoEntidade;

public interface GeoRepository
    extends JpaRepository<GeoEntidade, Long> {

}

