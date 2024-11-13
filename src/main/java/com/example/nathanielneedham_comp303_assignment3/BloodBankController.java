package com.example.nathanielneedham_comp303_assignment3;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloodbanks")
public class BloodBankController {
    private final BloodBankService bloodBankService;

    public BloodBankController(BloodBankService bloodBankService) {
        this.bloodBankService = bloodBankService;
    }

    @GetMapping
    public List<BloodBank> getAllbloodBanks() {
        return bloodBankService.getAllBloodBanks();
    }

    @GetMapping("/{id}")
    public BloodBank getbloodBankById(@PathVariable int id) {
        return bloodBankService.getBloodBankById(id);
    }

    @PostMapping
    public BloodBank createbloodBank(@RequestBody BloodBank bloodBank) {
        return bloodBankService.createBloodBank(bloodBank);
    }

    @PutMapping("/{id}")
    public BloodBank updatebloodBank(@PathVariable int id, @RequestBody BloodBank bloodBank) {
        return bloodBankService.updateBloodBank(id, bloodBank);
    }

    @DeleteMapping("/{id}")
    public void deletebloodBank(@PathVariable int id) {
        bloodBankService.deleteBloodBank(id);
    }
}
