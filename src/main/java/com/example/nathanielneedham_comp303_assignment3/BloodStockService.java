package com.example.nathanielneedham_comp303_assignment3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BloodStockService {

    private Map<Integer, BloodStock> bloodStocks = new HashMap<>();
    private int currentId = 1;

    public List<BloodStock> getAllBloodStocks() {
        return new ArrayList<>(bloodStocks.values());
    }

    public BloodStock getBloodStockById(int id) {
        return bloodStocks.get(id);
    }

    public BloodStock createBloodStock(BloodStock bloodStock) {
        bloodStock.setId(currentId++);
        bloodStocks.put(bloodStock.getId(), bloodStock);
        return bloodStock;
    }

    public BloodStock updateBloodStock(int id, BloodStock bloodStock) {
        bloodStock.setId(id);
        bloodStocks.put(id, bloodStock);
        return bloodStock;
    }

    public void deleteBloodStock(int id) {
        bloodStocks.remove(id);
    }
}