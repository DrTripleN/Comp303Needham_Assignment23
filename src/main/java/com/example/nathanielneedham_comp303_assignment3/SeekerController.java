package com.example.nathanielneedham_comp303_assignment3;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seekers")
public class SeekerController {
    private final SeekerService seekerService;

    public SeekerController(SeekerService seekerService) {
        this.seekerService = seekerService;
    }

    @GetMapping
    public List<Seeker> getAllSeekers() {
        return seekerService.getAllSeekers();
    }

    @GetMapping("/{id}")
    public Seeker getSeekerById(@PathVariable int id) {
        return seekerService.getSeekerById(id);
    }

    @PostMapping
    public Seeker createSeeker(@RequestBody Seeker seeker) {
        return seekerService.createSeeker(seeker);
    }

    @PutMapping("/{id}")
    public Seeker updateSeeker(@PathVariable int id, @RequestBody Seeker seeker) {
        return seekerService.updateSeeker(id, seeker);
    }

    @DeleteMapping("/{id}")
    public void deleteSeeker(@PathVariable int id) {
        seekerService.deleteSeeker(id);
    }
}
