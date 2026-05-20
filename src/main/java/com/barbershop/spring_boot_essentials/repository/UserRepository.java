package com.barbershop.spring_boot_essentials.repository;

import com.barbershop.spring_boot_essentials.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
