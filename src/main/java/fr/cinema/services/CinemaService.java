package fr.cinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cinema.models.Cinema;
import fr.cinema.repositories.RestRepository;

@Service
public class CinemaService extends RestService<Cinema, String> {
	
	@Autowired
	private RestRepository<Cinema> repository;
	
	@Override
	protected RestRepository<Cinema> repository() {
		return this.repository;
	}
}
