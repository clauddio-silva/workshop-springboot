package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Geolocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeolocationRepository extends JpaRepository<Geolocation, Long> {
}
