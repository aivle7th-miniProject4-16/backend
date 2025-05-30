package com.aivle.miniproject3.service;

import com.aivle.miniproject3.domain.Book;
import com.aivle.miniproject3.dto.StatusDTO;

public interface BookService1 {

    StatusDTO insertBook(Book book);

    Book findBook(Long id);

    StatusDTO updateBook(Long id, Book book);

    StatusDTO deleteBook(Long id);
}
