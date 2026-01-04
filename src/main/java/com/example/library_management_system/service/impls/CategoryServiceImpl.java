package com.example.library_management_system.service.impls;

import com.example.library_management_system.dto.request.CategoryRequest;
import com.example.library_management_system.dto.response.CategoryResponse;
import com.example.library_management_system.repository.CategoryRepository;
import com.example.library_management_system.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAll() {

    }

    @Override
    public CategoryResponse save(CategoryRequest request) {

    }
}
