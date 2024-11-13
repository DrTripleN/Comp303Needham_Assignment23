package com.example.nathanielneedham_comp303_assignment3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BloodBankService {
    private Map<Integer, BloodBank> bloodBanks = new HashMap<>();
    private int currentId = 1;

    public List<BloodBank> getAllBloodBanks() {
        return new ArrayList<>(bloodBanks.values());
    }

    public BloodBank getBloodBankById(int id) {
        return bloodBanks.get(id);
    }

    public BloodBank createBloodBank(BloodBank bloodBank) {
        bloodBank.setId(currentId++);
        bloodBanks.put(bloodBank.getId(), bloodBank);
        return bloodBank;
    }

    public BloodBank updateBloodBank(int id, BloodBank bloodBank) {
        bloodBank.setId(id);
        bloodBanks.put(id, bloodBank);
        return bloodBank;
    }

    public void deleteBloodBank(int id) {
        bloodBanks.remove(id);
    }
}
