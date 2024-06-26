package peter.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peter.models.Book;
import peter.repositories.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepository;
    public List<Book> list() {
        return bookRepository.findAll();
    }
}