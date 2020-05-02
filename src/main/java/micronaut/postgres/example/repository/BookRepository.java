package micronaut.postgres.example.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import micronaut.postgres.example.entity.Book;

@Repository
public interface BookRepository  extends CrudRepository<Book, String> {

    Book findByBookId(String loginId);

}

