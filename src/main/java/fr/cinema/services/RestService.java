package fr.cinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import fr.cinema.repositories.RestRepository;

@Service
public abstract class RestService<T, U> {
	
	@Autowired
	protected abstract RestRepository<T> repository();
	
	public List<T> getAll() {
		return this.repository().findAll();
	}
	
	public T add(T object) {
		return this.repository().insert(object);
	}
	
	public T update(T object) {
		return this.repository().save(object);
	}
	
	public void delete(String id) {
		this.repository().deleteById(id);
	}
	
	public T findById(String id) {
		return this.repository().findById(id)
				.orElseThrow(
						()-> new ResponseStatusException(HttpStatus.NOT_FOUND)
						);
	}
}
