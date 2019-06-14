package com.jarades.musiletra.models;

import java.util.List;

public class Playlist {

	private Integer id;
	private String name;
	private List<Music> musics;

	public Playlist() {
		super();
	}

	public Playlist(String name, List<Music> musics) {
		super();
		this.name = name;
		this.musics = musics;
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

}
