package com.example.inventory;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class InventoryRestController {

	private BookRepository bookRepository;

	@Autowired
	public InventoryRestController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@GetMapping()
	public List<Book> getBooks() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@GetMapping(path = "/{bookId}")
	public Book getBookById(@PathVariable Long bookId) {
		Book book = bookRepository.findById(bookId).orElse(null);
		if (book != null && book.getNumberOfCopies() > 0) {
			return book;
		} else {
			return null;
		}
	}

}

