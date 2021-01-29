package fr.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("salle")
public class Salle {

	@Id
	private String id;
	private int numero;
	private int nbPlaces;
}
