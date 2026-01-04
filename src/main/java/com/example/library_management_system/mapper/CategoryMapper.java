package com.example.library_management_system.mapper;

import com.example.library_management_system.dto.request.CategoryRequest;
import com.example.library_management_system.dto.response.CategoryResponse;
import com.example.library_management_system.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryResponse toResponse(Category category);

    Category toEntity(CategoryRequest categoryRequest);

}
