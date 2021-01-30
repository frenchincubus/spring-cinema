package fr.cinema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cinema.models.Salle;
import fr.cinema.services.RestService;
import fr.cinema.services.SalleService;

@RequestMapping("salles")
@RestController
public class SalleController extends Controller<Salle, String> {

	@Autowired
	private SalleService service;

	@Override
	protected RestService<Salle, String> restService() {
		return this.service;
	}
}
