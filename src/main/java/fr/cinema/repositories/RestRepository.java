package fr.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RestRepository<T> extends MongoRepository<T, String> {
}
