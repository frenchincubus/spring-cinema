package fr.cinema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cinema.models.Film;
import fr.cinema.services.FilmService;
import fr.cinema.services.RestService;

@RequestMapping("films")
@RestController
public class FilmController extends Controller<Film, String> {

	@Autowired
	private FilmService service;

	@Override
	protected RestService<Film, String> restService() {
		return this.service;
	}
	
	
}
