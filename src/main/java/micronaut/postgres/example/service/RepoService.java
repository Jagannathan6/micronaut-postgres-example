package micronaut.postgres.example.service;

import micronaut.postgres.example.domain.Response;
import micronaut.postgres.example.entity.Book;
import micronaut.postgres.example.entity.Employee;
import micronaut.postgres.example.repository.BookRepository;
import micronaut.postgres.example.repository.EmployeeRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Singleton
public class RepoService {

    @Inject
    BookRepository bookRepository;

    @Inject
    EmployeeRepository employeeRepository;

    @Transactional
    public Response save(Book book, Employee employee) {
        Response response = new Response();
        Book book1 = bookRepository.save(book);

        System.err.println(book1.getBookId() + "   " + book1.getBookName());
        response.setEmployee(employeeRepository.save(employee));
        return response;
    }
}
