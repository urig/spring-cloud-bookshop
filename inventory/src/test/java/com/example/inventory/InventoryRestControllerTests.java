package com.example.inventory;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Optional;
import org.junit.Test;

public class InventoryRestControllerTests {

	@Test
	public void getBookById_bookisFoundAndHasOneCopy_bookIsReturned() {
		// Arrange
		long bookId = 1L;
		BookRepository bookRepository = mock(BookRepository.class);
		Book expected = new Book(bookId, "Moby Dick", "Herman Melville", new BigDecimal(100), 1);
		when(bookRepository.findById(bookId)).thenReturn(Optional.of(expected));
		InventoryRestController target = new InventoryRestController(bookRepository);
		
		// Act
		Book actual = target.getBookById(bookId);
		
		// Assert
		assertThat(actual).isEqualTo(expected);
	}

}
