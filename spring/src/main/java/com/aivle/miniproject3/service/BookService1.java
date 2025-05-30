package com.aivle.miniproject3.service;

import com.aivle.miniproject3.domain.Book;
import com.aivle.miniproject3.dto.StatusDTO;

import java.util.List;

public interface BookService1 {

    List<Book> findBooks();

    StatusDTO insertBook(Book book);

    Book findBook(Long id);

    StatusDTO updateBook(Long id, Book book);

    StatusDTO deleteBook(Long id);


}
