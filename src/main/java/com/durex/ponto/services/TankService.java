package com.durex.ponto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durex.ponto.dto.TankDTO;
import com.durex.ponto.entities.Tank;
import com.durex.ponto.repositories.TankRepository;

@Service
public class TankService {
	
	@Autowired
	private TankRepository tankRepository;
	
	public List<TankDTO> findAll() {
		var result = tankRepository.findAll();
		return result.stream().map(x -> new TankDTO(x)).toList();
		
	}

}
