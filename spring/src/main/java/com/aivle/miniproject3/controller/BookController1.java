package com.aivle.miniproject3.controller;

import com.aivle.miniproject3.domain.Book;
import com.aivle.miniproject3.dto.StatusDTO;
import com.aivle.miniproject3.service.BookService1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController1 {

    private final BookService1 bookService1;

    @GetMapping
    public List<Book> getBooks(){
        return bookService1.findBooks();
    }

    @PostMapping
    public StatusDTO insertBook(@RequestBody Book book){
        return bookService1.insertBook(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService1.findBook(id);
    }

    @GetMapping("/{id}/update")
    public Book getBookUpdate(@PathVariable Long id){
        return bookService1.findBook(id);
    }

    @PutMapping("/{id}/update")
    public StatusDTO updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService1.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public StatusDTO deleteBook(@PathVariable Long id){
        return bookService1.deleteBook(id);
    }

}
