package fr.cinema.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("cinema")
public class Cinema {
	@Id
	private String id;
	private String nom;
	@DBRef
	private List<Film> films;
	@DBRef
	private List<Seance> seances;
}
