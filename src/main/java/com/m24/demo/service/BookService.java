package com.m24.demo.service;

import org.springframework.data.domain.Page;

import com.m24.demo.entity.Book;

public interface BookService {

	Book findByBookId(long id);

	Page<Book> findAll(int offset, int limit);
   
	Book save(Book book);

}
