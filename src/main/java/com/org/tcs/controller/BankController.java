package com.org.tcs.controller;

import com.org.tcs.model.Bank;
import com.org.tcs.repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class BankController {
   // CRUD
    @Autowired
   BankRepo bankRepo;

    @PostMapping("/create")
    public void createBank(@RequestBody Bank bank){
        bankRepo.save(bank);
    }
    @GetMapping("/getAll")
    public List<Bank> getAll(){
       return bankRepo.findAll();
    }
}
