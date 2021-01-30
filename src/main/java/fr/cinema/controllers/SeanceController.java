package fr.cinema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cinema.models.Seance;
import fr.cinema.services.RestService;
import fr.cinema.services.SeanceService;

@RequestMapping("seances")
@RestController
public class SeanceController extends Controller<Seance, String> {

	@Autowired
	private SeanceService service;

	@Override
	protected RestService<Seance, String> restService() {
		return this.service;
	}
}
