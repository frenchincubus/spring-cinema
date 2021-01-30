package fr.cinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cinema.models.Salle;
import fr.cinema.repositories.RestRepository;
import fr.cinema.repositories.SalleRepository;

@Service
public class SalleService extends RestService<Salle, String> {
	
	@Autowired
	private SalleRepository repository;
	
	@Override
	protected RestRepository<Salle> repository() {
		return this.repository;
	}
}
