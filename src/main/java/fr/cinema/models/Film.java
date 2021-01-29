package fr.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("film")
public class Film {
	@Id
	private String id;
	private String nom;
	private int duree;
}
