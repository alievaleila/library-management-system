package com.example.library_management_system.mapper;

import com.example.library_management_system.dto.request.BookRequest;
import com.example.library_management_system.dto.response.BookResponse;
import com.example.library_management_system.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target= "categoryName", source= "category.name")
    BookResponse toResponse(Book book);

    @Mapping(target="category", ignore=true)
    Book toEntity(BookRequest request);
}
