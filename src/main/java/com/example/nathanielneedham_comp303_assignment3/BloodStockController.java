package com.example.nathanielneedham_comp303_assignment3;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloodstock")
public class BloodStockController {
    private final BloodStockService bloodStockService;

    public BloodStockController(BloodStockService bloodStockService) {
        this.bloodStockService = bloodStockService;
    }

    @GetMapping
    public List<BloodStock> getAllbloodStocks() {
        return bloodStockService.getAllBloodStocks();
    }

    @GetMapping("/{id}")
    public BloodStock getbloodStockById(@PathVariable int id) {
        return bloodStockService.getBloodStockById(id);
    }

    @PostMapping
    public BloodStock createbloodStock(@RequestBody BloodStock bloodStock) {
        return bloodStockService.createBloodStock(bloodStock);
    }

    @PutMapping("/{id}")
    public BloodStock updatebloodStock(@PathVariable int id, @RequestBody BloodStock bloodStock) {
        return bloodStockService.updateBloodStock(id, bloodStock);
    }

    @DeleteMapping("/{id}")
    public void deletebloodStock(@PathVariable int id) {
        bloodStockService.deleteBloodStock(id);
    }
}
