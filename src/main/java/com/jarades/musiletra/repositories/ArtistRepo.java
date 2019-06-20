package com.jarades.musiletra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarades.musiletra.models.Artist;

public interface ArtistRepo extends JpaRepository<Artist, Integer> {
	

}
