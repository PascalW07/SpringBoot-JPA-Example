package com.pascal.springbootjpaexample.service;

import com.pascal.springbootjpaexample.dto.BookModel;
import com.pascal.springbootjpaexample.repository.BookModelRepository;
import org.springframework.stereotype.Service;

@Service
public class BookModelService {
    // constructor injection
    // https://reflectoring.io/constructor-injection/
    private final BookModelRepository bookModelRepository;

    public BookModelService(BookModelRepository bookModelRepository) {
        this.bookModelRepository = bookModelRepository;
    }

    public Iterable<BookModel> findAll(){
        System.out.println(bookModelRepository.findAll());
        return bookModelRepository.findAll();
    }
}
