package com.example.adil.SpringBootBookMyShow.Repository;

import com.example.adil.SpringBootBookMyShow.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}
