package lesson4.hw4.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookRepository bookRepository;
    BookService bookService;
    List<Book> list;
    Book book;

    @Test
    @BeforeEach
    void testInit() {
        bookRepository = mock(BookRepository.class);
        list = new ArrayList<>();
        book = new Book("1", "Book1", "Author1");
        list.add(book);
        list.add(new Book("1", "Book1", "Author1"));

        when(bookRepository.findAll()).thenReturn(list);
        when(bookRepository.findById(anyString())).thenReturn(book);

        bookService = new BookService(bookRepository);

    }

    @Test
    void testBookRepositoryFindAll() {
        assertEquals(bookService.findAllBooks(), list);
    }

    @Test
    void testBookRepositoryFindById() {
        assertEquals(bookService.findBookById("5"), book);
    }

}