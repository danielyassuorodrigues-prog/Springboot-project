package com.barbershop.spring_boot_essentials.controller;


import com.barbershop.spring_boot_essentials.entities.Appointment;
import com.barbershop.spring_boot_essentials.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @GetMapping
    public List<Appointment> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Appointment findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Appointment insert(@RequestBody Appointment appointment) {
        return service.insert(appointment);
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable Long id){
        service.deletedById(id);
    }

    @PutMapping("/{id}")
    public Appointment update(@PathVariable Long id, @RequestBody Appointment appointment) {
        return service.update(id, appointment);
    }











}
