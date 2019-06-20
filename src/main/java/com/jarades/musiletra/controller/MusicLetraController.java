package com.jarades.musiletra.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jarades.musiletra.models.Artist;
import com.jarades.musiletra.models.Music;
import com.jarades.musiletra.models.Playlist;
import com.jarades.musiletra.services.MusiLetraService;

@RestController
public class MusicLetraController {
	
	private MusiLetraService musiLetraService;
	
	
	@PostMapping("/music")
	public Music saveMusic(@RequestBody Music music) {
		return musiLetraService.saveMusic(music);
	}

	@GetMapping("/music/{id}")
	public Optional<Music> getMusicById(@PathVariable("id") Integer id) {
		return musiLetraService.getMusicById(id);
	}

	// Artist
	@PostMapping("/artist")
	public Artist saveArtist(@RequestBody Artist artist) {
		return musiLetraService.saveArtist(artist);
	}

	@GetMapping("/artist/{id}")
	public Optional<Artist> getArtistById(@PathVariable("id") Integer id) {
		return musiLetraService.getArtistById(id);
	}

	// Artist
	@PostMapping("/playlist")
	public Playlist savePlaylist(@RequestBody Playlist playlist) {
		return musiLetraService.savePlaylist(playlist);
	}
	
	@GetMapping("/playlist/{id}")
	public Optional<Playlist> getPlaylistById(@PathVariable("id") Integer id) {
		return musiLetraService.getPlaylistById(id);
	}

}
