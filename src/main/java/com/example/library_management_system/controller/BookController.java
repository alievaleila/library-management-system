package com.example.library_management_system.controller;

import com.example.library_management_system.dto.request.BookRequest;
import com.example.library_management_system.dto.response.BookResponse;
import com.example.library_management_system.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAll() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @PostMapping
    public ResponseEntity<BookResponse> create(@RequestBody BookRequest request) {
        return new ResponseEntity<>(bookService.save(request), HttpStatus.CREATED);
    }
}
