package com.jarades.musiletra.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Artist {

	@Id @GeneratedValue
	private Integer id;
	private String artistName;
	private String artistSpotifyId;
	@ManyToOne
	private List<Reputation> reputation;

	public Artist() {
		super();
	}

	public Artist(String artistName, String artistSpotifyId, List<Reputation> reputation) {
		super();
		this.artistName = artistName;
		this.artistSpotifyId = artistSpotifyId;
		this.reputation = reputation;
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

	public List<Reputation> getReputation() {
		return reputation;
	}

	public void setReputation(List<Reputation> reputation) {
		this.reputation = reputation;
	}

}
