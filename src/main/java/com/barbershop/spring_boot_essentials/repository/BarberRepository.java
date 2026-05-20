package com.barbershop.spring_boot_essentials.repository;

import com.barbershop.spring_boot_essentials.entities.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Long> {
}
