package com.example.QuanLySachTT.Repository;

import com.example.QuanLySachTT.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
