package com.jarades.musiletra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarades.musiletra.models.Music;

public interface MusicRepo extends JpaRepository<Music, Integer> {

}
