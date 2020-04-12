package com.example.spring.mongodb.resource;

import com.example.spring.mongodb.model.Book;
import com.example.spring.mongodb.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository repository;

    @PostMapping("/addBook")
    public  String saveBook(@RequestBody Book book){
        repository.save(book);
        return "added book with id :" ;// +     book.getId();
    }

@GetMapping("/findAllBooks")
    public List<Book> getBooks(){
        return repository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id){
            return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteBook(@PathVariable int id){
        repository.deleteById(id);
        return "Book deleted id :" + id;
    }

}
