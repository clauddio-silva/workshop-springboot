package com.educandoweb.course.services;

import com.educandoweb.course.repositories.GeolocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeolocationService {

    @Autowired
    private GeolocationRepository geolocationRepository;
}
