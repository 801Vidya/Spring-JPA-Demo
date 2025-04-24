package com.book.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.entity.Book;
import com.book.demo.service.BookService;

@RestController
@RequestMapping("/api/Book")
public class BookController {

	  private final BookService bookService;

	    public BookController(BookService bookService) {
	        this.bookService = bookService;
	    }

	    @GetMapping
	    public List<Book> getAllBooks() {
	        return bookService.getAllBooks();
	    }

	    @PostMapping
	    public Book addBook(@RequestBody Book book) {
	        return bookService.saveBook(book);
	    }

	    @GetMapping("/{id}")
	    public Book getBookById(@PathVariable Long id) {
	        return bookService.getBookById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBook(@PathVariable Long id) {
	        bookService.deleteBook(id);
	    }
}
