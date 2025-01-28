package com.durex.ponto.dto;

import com.durex.ponto.entities.Tank;

public class TankDTO {

	private Long id;	
	private String description;
	private Integer volume;
	private Integer height;
	private Integer width;
	private Integer length;
	
	public TankDTO() {
		
	}
	
	public TankDTO(Long id, String description, Integer volume, Integer height, Integer width, Integer length) {
		super();
		this.id = id;
		this.description = description;
		this.volume = volume;
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public TankDTO(Tank entity) {
		super();
		this.id = entity.getId();
		this.description = entity.getDescription();
		this.volume = entity.getVolume();
		this.height = entity.getHeight();
		this.width = entity.getWidth();
		this.length = entity.getLength();
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Integer getVolume() {
		return volume;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWidth() {
		return width;
	}

	public Integer getLength() {
		return length;
	}
	
}
