package com.example.library_management_system.service.impls;

import com.example.library_management_system.dto.request.CategoryRequest;
import com.example.library_management_system.dto.response.CategoryResponse;
import com.example.library_management_system.entity.Category;
import com.example.library_management_system.mapper.CategoryMapper;
import com.example.library_management_system.repository.CategoryRepository;
import com.example.library_management_system.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryResponse> getAll() {
        List<Category>categories=categoryRepository.findAll();
        return categories.stream().map(categoryMapper::toResponse).toList();
    }

    @Override
    public CategoryResponse save(CategoryRequest request) {
        Category category=categoryMapper.toEntity(request);
        Category savedCategory=categoryRepository.save(category);
        return categoryMapper.toResponse(savedCategory);
    }
}
