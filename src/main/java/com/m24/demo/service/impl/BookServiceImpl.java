package com.m24.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.m24.demo.entity.Book;
import com.m24.demo.repository.BookRepository;
import com.m24.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository repository;
	
	@Override
	@Cacheable("book")
	@Transactional(rollbackFor= {IllegalArgumentException.class}, isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRES_NEW)
	public Book findByBookId(long id) {
//		save(new Book(3, "book3", 100));
//		throw new IllegalArgumentException();
		return repository.findByBookId(id);
	}

	@Override
	@Transactional(noRollbackFor= {IllegalArgumentException.class}, isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRES_NEW)
	public Page<Book> findAll(int offset, int limit) {
//		save(new Book(4, "book4", 100));
//		throw new IllegalArgumentException();
		return repository.findAll(new PageRequest(offset, limit));
	}

	@Override
	@CachePut(value="book", key="#result.bookId")
	@Transactional(noRollbackFor= {IllegalArgumentException.class}, isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
	public Book save(Book book) {
		return repository.save(book);
	}

}
