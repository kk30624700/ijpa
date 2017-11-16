package com.m24.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.demo.entity.Book;
import com.m24.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService service;
	
	@RequestMapping(value="findByBookId/{id}")
	public Book findByBookId(@PathVariable long id) {
		return service.findByBookId(id);
	}

	@RequestMapping("/findAll/{offset}/{limit}")
	public Page<Book> findAll(@PathVariable int offset, @PathVariable int limit) {
		return service.findAll(offset, limit);
	}

	@RequestMapping("/save")
	public Book save(Book book) {
		return service.save(book);
	}
}
