package com.aivle.miniproject3.service;

import com.aivle.miniproject3.domain.Book;
import com.aivle.miniproject3.dto.StatusDTO;
import com.aivle.miniproject3.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    @Override
    public StatusDTO insertBook(Book book) {
        Book b = bookRepository.save(book);

        return new StatusDTO("success", "등록 완료", b.getCreatedAt(), b.getUpdatedAt());
    }

    @Override
    public Book findBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public StatusDTO updateBook(Long id, Book book) {
        Book b = findBook(id);

        if(b == null){
            return new StatusDTO("error", "존재하지 않는 도서", null, null);
        }

        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setContent(book.getContent());
        b.setCoverImageUrl(book.getCoverImageUrl());

        bookRepository.save(b);
        return new StatusDTO("success", "수정 완료", b.getCreatedAt(), b.getUpdatedAt());
    }

    @Override
    public StatusDTO deleteBook(Long id) {
        Book b = findBook(id);

        if(b == null){
            return new StatusDTO("error", "도서를 찾을 수 없습니다", null, null);
        }

        bookRepository.deleteById(id);

        return new StatusDTO("success", "삭제 완료", b.getCreatedAt(), b.getUpdatedAt());
    }

}
