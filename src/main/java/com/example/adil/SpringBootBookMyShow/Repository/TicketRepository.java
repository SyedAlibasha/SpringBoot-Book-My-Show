package com.example.adil.SpringBootBookMyShow.Repository;

import com.example.adil.SpringBootBookMyShow.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}
