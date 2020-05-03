package micronaut.postgres.example.repository;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import micronaut.postgres.example.entity.Book;

import java.util.List;

@Repository
public interface BookNativeRepository {

    @Query(value = "select * from book", nativeQuery = true)
    List<Book> findAllBooks();

}
