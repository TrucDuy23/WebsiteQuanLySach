package com.example.QuanLySachTT.Service;

import com.example.QuanLySachTT.Model.BorrowRecord;
import com.example.QuanLySachTT.Repository.BorrowRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BorrowRecordService {
    @Autowired
    private BorrowRecordRepository borrowRecordRepository;

    public List<BorrowRecord> findAll() {
        return borrowRecordRepository.findAll();
    }

    public BorrowRecord saveRecord(BorrowRecord record) {
        return borrowRecordRepository.save(record);
    }
}
