package com.barbershop.spring_boot_essentials.repository;

import com.barbershop.spring_boot_essentials.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
