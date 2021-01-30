package fr.cinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cinema.models.Film;
import fr.cinema.repositories.FilmRepository;
import fr.cinema.repositories.RestRepository;

@Service
public class FilmService extends RestService<Film, String> {
	
	@Autowired
	private FilmRepository repository;
	
	@Override
	protected RestRepository<Film> repository() {
		return this.repository;
	}
}
