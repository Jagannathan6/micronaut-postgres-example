package micronaut.postgres.example.domain;

import micronaut.postgres.example.entity.Book;
import micronaut.postgres.example.entity.Employee;

public class Response {
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    private Book book;
    private  Employee employee;

}
