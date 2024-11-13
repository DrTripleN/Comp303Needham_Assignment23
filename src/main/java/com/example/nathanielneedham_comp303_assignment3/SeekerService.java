package com.example.nathanielneedham_comp303_assignment3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SeekerService {
    private Map<Integer, Seeker> seekers = new HashMap<>();
    private int currentId = 1;

    public List<Seeker> getAllSeekers() {
        return new ArrayList<>(seekers.values());
    }

    public Seeker getSeekerById(int id) {
        return seekers.get(id);
    }

    public Seeker createSeeker(Seeker seeker) {
        seeker.setId(currentId++);
        seekers.put(seeker.getId(), seeker);
        return seeker;
    }

    public Seeker updateSeeker(int id, Seeker seeker) {
        seeker.setId(id);
        seekers.put(id, seeker);
        return seeker;
    }

    public void deleteSeeker(int id) {
        seekers.remove(id);
    }
}
