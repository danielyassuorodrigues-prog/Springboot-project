package com.barbershop.spring_boot_essentials.repository;

import com.barbershop.spring_boot_essentials.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
