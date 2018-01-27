package org.tektutor.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tektutor.data.jpa.service.Hotel;
import org.tektutor.data.jpa.service.HotelRepository;

@RestController
public class CityController {

	@Autowired
	HotelRepository hotelRepository;
	
	@RequestMapping("/hotels")
	public List<Hotel> getHotels() {
		return hotelRepository.findAll();
	}

	@RequestMapping("/")
	public String getHome() {
		return "hotels";
	}
	
}
