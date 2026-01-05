package com.example.library_management_system.service.impls;

import com.example.library_management_system.dto.request.BookRequest;
import com.example.library_management_system.dto.response.BookResponse;
import com.example.library_management_system.entity.Book;
import com.example.library_management_system.entity.Category;
import com.example.library_management_system.exception.ResourceNotFoundException;
import com.example.library_management_system.mapper.BookMapper;
import com.example.library_management_system.repository.BookRepository;
import com.example.library_management_system.repository.CategoryRepository;
import com.example.library_management_system.service.BookService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final CategoryRepository categoryRepository;

    @Override
    public @Nullable List<BookResponse> getAll() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(bookMapper::toResponse).toList();
    }

    @Override
    public BookResponse save(BookRequest request) {
        Book book = bookMapper.toEntity(request);
        Category category = categoryRepository
                .findById(request.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id."));
        book.setCategory(category);
        Book savedBook = bookRepository.save(book);
        return bookMapper.toResponse(savedBook);
    }

    @Override
    public @Nullable BookResponse getById(Long id) {

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
