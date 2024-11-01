package com.example.QuanLySachTT.Controller;

import com.example.QuanLySachTT.Model.BorrowRecord;
import com.example.QuanLySachTT.Service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    private BorrowRecordService borrowRecordService;

    @GetMapping
    public String listBorrows(Model model) {
        model.addAttribute("borrowRecords", borrowRecordService.findAll());
        return "borrow/list";
    }

    @PostMapping("/request")
    public String requestBorrow(@ModelAttribute BorrowRecord borrowRecord) {
        borrowRecordService.saveRecord(borrowRecord);
        return "redirect:/borrow";
    }
}