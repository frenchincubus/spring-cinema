package fr.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.cinema.services.RestService;

public abstract class Controller<T, U> {
	
	@Autowired
	protected abstract RestService<T, U> restService();

	@GetMapping()
	public List<T> getAll() {
		return this.restService().getAll();
	}
	
	@PostMapping
	public T add(@RequestBody T object) {
		return this.restService().add(object);
	}
	
	@PutMapping("/{id}")
	public T update(@RequestBody T object, @PathVariable String id) {
		return this.restService().update(object);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		this.restService().delete(id);
	}
	
	@GetMapping("object/{id}")
	public T findById(@PathVariable String id) {
		return this.restService().findById(id);
	}
}
