package com.example.library_management_system.service;

import com.example.library_management_system.dto.request.CategoryRequest;
import com.example.library_management_system.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {

    List<CategoryResponse> getAll();

    CategoryResponse save(CategoryRequest request);
}
