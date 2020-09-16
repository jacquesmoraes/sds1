package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platforms;

public class GameDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private long id;
	private String title;
	private Platforms platform;
	
	public GameDTO() {
		
	}
	public GameDTO(Game entity) {
		id= entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
				
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platforms getPlatform() {
		return platform;
	}

	public void setPlatform(Platforms platform) {
		this.platform = platform;
	}
	
	

}
