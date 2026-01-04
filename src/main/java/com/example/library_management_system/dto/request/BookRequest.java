package com.example.library_management_system.dto.request;

import lombok.Data;

@Data
public class BookRequest {

    private String title;
    private String author;
    private String isbn;
    private Long categoryId;
}
