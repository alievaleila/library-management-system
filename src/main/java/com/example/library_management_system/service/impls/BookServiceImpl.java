package com.example.library_management_system.service.impls;

import com.example.library_management_system.dto.request.BookRequest;
import com.example.library_management_system.dto.response.BookResponse;
import com.example.library_management_system.service.BookService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    @Override
    public @Nullable List<BookResponse> getAll() {
        return List.of();
    }

    @Override
    public BookResponse save(BookRequest request) {
        return null;
    }
}
