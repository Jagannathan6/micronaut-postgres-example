package micronaut.postgres.example.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import micronaut.postgres.example.domain.Response;
import micronaut.postgres.example.entity.Book;
import micronaut.postgres.example.entity.Employee;
import micronaut.postgres.example.repository.BookRepository;
import micronaut.postgres.example.service.RepoService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Controller("/v1")
public class MicronautDataController {

    @Inject
    RepoService repoService;

    @Inject
    BookRepository bookRepository;

    private String getRandomString() {
        return UUID.randomUUID().toString();
    }

    @Get
    public List<Book> getBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @Post
    public Response addBook()  {

       Book book = new Book();
       book.setBookId(getRandomString());
       book.setBookName(getRandomString());

        Employee employee = new Employee();
        employee.setLoginId(getRandomString());
        employee.setName(getRandomString());

        return repoService.save(book, employee);

    }


    @Get(value = "/native/books")
    public List<Book> getNativeBookInfo() {
        return repoService.findBooks();
    }
}

