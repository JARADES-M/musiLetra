package com.jarades.musiletra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarades.musiletra.models.Playlist;

public interface PlaylistRepo extends JpaRepository<Playlist, Integer> {

}
