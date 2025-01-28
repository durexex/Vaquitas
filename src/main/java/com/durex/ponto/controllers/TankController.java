package com.durex.ponto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durex.ponto.dto.TankDTO;
import com.durex.ponto.services.TankService;

@RestController
@RequestMapping(value = "/Tanks")
public class TankController {
	
	@Autowired
	private TankService tankService;
	
	@GetMapping
	public List<TankDTO> findAll(){
		return tankService.findAll();		
	}

}
