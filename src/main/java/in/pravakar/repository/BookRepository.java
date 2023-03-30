package in.pravakar.repository;

import org.springframework.data.repository.CrudRepository;

import in.pravakar.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {

}
