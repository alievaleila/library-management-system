package com.example.library_management_system.dto.response;

import lombok.Data;

@Data
public class BookResponse {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String categoryName;
}
