package com.aivle.miniproject3.controller;

import com.aivle.miniproject3.domain.Book;
import com.aivle.miniproject3.dto.StatusDTO;
import com.aivle.miniproject3.service.BookService1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController1 {

    private final BookService1 bookService;

    @PostMapping
    public StatusDTO insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @GetMapping("/{id}/update")
    public Book getBook(@PathVariable Long id){
        return bookService.findBook(id);
    }

    @PutMapping("/{id}/update")
    public StatusDTO updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public StatusDTO deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);
    }

}
