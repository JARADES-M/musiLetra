package com.jarades.musiletra.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Playlist {

	@Id @GeneratedValue
	private Integer id;
	private String name;
	@ManyToOne
	private List<Music> musics;
	@ManyToOne
	private List<Reputation> reputation;

	public Playlist() {
		super();
	}

	public Playlist(String name, List<Music> musics, List<Reputation> reputation) {
		super();
		this.name = name;
		this.musics = musics;
		this.reputation = reputation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Music> getMusics() {
		return musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public List<Reputation> getReputation() {
		return reputation;
	}

	public void setReputation(List<Reputation> reputation) {
		this.reputation = reputation;
	}

}
