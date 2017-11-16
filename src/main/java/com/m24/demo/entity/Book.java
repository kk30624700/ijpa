package com.m24.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long bookId;// 图书ID

    private String bookName;// 图书名称

    private int bookNumber;// 馆藏数量

    public Book(int i, String string, int j) {
    	this.bookId = i;
    	this.bookName = string;
    	this.bookNumber = j;
    }
    
    public Book() {
    	super();
    }
    
	public long getBookId() {
		return bookId;
	}


	public void setBookId(long bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	@Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookNumber=" + bookNumber + ", bookNumber=" + bookNumber + "]";
    }
}
