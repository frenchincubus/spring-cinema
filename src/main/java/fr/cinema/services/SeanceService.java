package fr.cinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cinema.models.Seance;
import fr.cinema.repositories.RestRepository;
import fr.cinema.repositories.SeanceRepository;

@Service
public class SeanceService extends RestService<Seance, String>{

	@Autowired
	private SeanceRepository repository;
	
	@Override
	protected RestRepository<Seance> repository() {
		return this.repository;
	}
}
