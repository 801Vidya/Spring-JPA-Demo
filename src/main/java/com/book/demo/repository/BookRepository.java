package com.book.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.book.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	

}
