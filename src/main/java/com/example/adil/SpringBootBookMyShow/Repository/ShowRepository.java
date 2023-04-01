package com.example.adil.SpringBootBookMyShow.Repository;

import com.example.adil.SpringBootBookMyShow.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}
