package com.jarades.musiletra.models;

// implements comparable
public class Music {

	private Integer id;
	private String musicName;
	private String musicSpotifyId;

	public Music() {
		super();
	}

	public Music(String musicName, String musicSpotifyId) {
		super();
		this.musicName = musicName;
		this.musicSpotifyId = musicSpotifyId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicSpotifyId() {
		return musicSpotifyId;
	}

	public void setMusicSpotifyId(String musicSpotifyId) {
		this.musicSpotifyId = musicSpotifyId;
	}

}
