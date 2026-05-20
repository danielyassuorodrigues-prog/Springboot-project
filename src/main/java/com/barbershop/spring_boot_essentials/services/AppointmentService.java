package com.barbershop.spring_boot_essentials.services;

import com.barbershop.spring_boot_essentials.entities.Appointment;
import com.barbershop.spring_boot_essentials.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository repository;

    public List<Appointment>findAll(){
        return repository.findAll();
    }

    public Appointment findById(Long id){
        Optional<Appointment> obj = repository.findById(id);

        return obj.orElseThrow(
                () -> new RuntimeException("Appointment not found")
        );
    }

    public Appointment insert(Appointment appointment) {
        return repository.save(appointment);
    }

    public void deletedById(Long id) {
        repository.deleteById(id);
    }

    public Appointment update(Long id, Appointment obj) {
        Appointment entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Appointment not found"));

        updateData(entity, obj);

        return repository.save(entity);
    }

    private void updateData(Appointment entity, Appointment obj) {
        entity.setClientName(obj.getClientName());
        entity.setPhone(obj.getPhone());
        entity.setService(obj.getService());
        entity.setDate(obj.getDate());
        entity.setHour(obj.getHour());
    }



}
