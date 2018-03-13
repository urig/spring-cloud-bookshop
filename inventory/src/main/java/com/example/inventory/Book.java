package com.example.inventory;

import java.math.BigDecimal;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String author;
	private BigDecimal price;
	private int numberOfCopies;

	public Book() {
	}

	public Book(long id, String title, String author, BigDecimal price, int numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.numberOfCopies = numberOfCopies;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
}
