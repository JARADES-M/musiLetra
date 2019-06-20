package com.jarades.musiletra.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jarades.musiletra.models.Artist;
import com.jarades.musiletra.models.Music;
import com.jarades.musiletra.models.Playlist;
import com.jarades.musiletra.repositories.ArtistRepo;
import com.jarades.musiletra.repositories.MusicRepo;
import com.jarades.musiletra.repositories.PlaylistRepo;

public class MusiLetraService {

	@Autowired
	private MusicRepo musicRepo;
	@Autowired
	private ArtistRepo artistRepo;
	@Autowired
	private PlaylistRepo playlistRepo;

	// Music
	public Music saveMusic(Music music) {
		return musicRepo.save(music);
	}

	public Optional<Music> getMusicById(Integer id) {
		return musicRepo.findById(id);
	}

	// Artist
	public Artist saveArtist(Artist artist) {
		return artistRepo.save(artist);
	}

	public Optional<Artist> getArtistById(Integer id) {
		return artistRepo.findById(id);
	}

	// Artist
	public Playlist savePlaylist(Playlist playlist) {
		return playlistRepo.save(playlist);
	}

	public Optional<Playlist> getPlaylistById(Integer id) {
		return playlistRepo.findById(id);
	}

}
