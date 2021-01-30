package fr.cinema.models;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Document("seance")
public class Seance {
	
	@Id
	private String id;
	private String date;
	@DBRef
	private Map<Salle, Film> films;
	
}
