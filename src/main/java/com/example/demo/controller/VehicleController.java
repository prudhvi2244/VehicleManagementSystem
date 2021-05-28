package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

	@GetMapping(value = "/allVehicles")
	public String getVehicles()
	{
		return "<h3 style='color:red;text-align:center'>All Vehicles</h3>";
	}
	
}
