package com.m24.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.m24.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	Book findByBookId(long bookId);

	@Modifying
	@Query("update Book b set b.bookNumber = b.bookNumber-1 where b.bookId = ?1")
	int setBookNumber(long bookId);
}
