package com.example.library_management_system.service;

import com.example.library_management_system.dto.request.BookRequest;
import com.example.library_management_system.dto.response.BookResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookService {

    @Nullable
    List<BookResponse> getAll();

    BookResponse save(BookRequest request);
}
