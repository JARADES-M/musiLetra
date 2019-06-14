package com.jarades.musiletra.models;

public class Artist {

	private Integer id;
	private String artistName;
	private String artistSpotifyId;

	public Artist() {
		super();
	}

	public Artist(String artistName, String artistSpotifyId) {
		super();
		this.artistName = artistName;
		this.artistSpotifyId = artistSpotifyId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getArtistSpotifyId() {
		return artistSpotifyId;
	}

	public void setArtistSpotifyId(String artistSpotifyId) {
		this.artistSpotifyId = artistSpotifyId;
	}

}
