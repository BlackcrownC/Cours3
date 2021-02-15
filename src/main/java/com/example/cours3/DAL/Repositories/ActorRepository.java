package com.example.cours3.DAL.Repositories;

import com.example.cours3.BLL.Models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
