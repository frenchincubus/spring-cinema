package fr.cinema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cinema.models.Cinema;
import fr.cinema.services.CinemaService;
import fr.cinema.services.RestService;

@RequestMapping("cinemas")
@RestController
public class CinemaController extends Controller<Cinema, String> {

	@Autowired
	private CinemaService service;

	@Override
	protected RestService<Cinema, String> restService() {
		return this.service;
	}
}
