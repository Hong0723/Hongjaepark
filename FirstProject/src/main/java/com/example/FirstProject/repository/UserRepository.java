package com.example.FirstProject.repository;

import com.example.FirstProject.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser,Long> {
}
