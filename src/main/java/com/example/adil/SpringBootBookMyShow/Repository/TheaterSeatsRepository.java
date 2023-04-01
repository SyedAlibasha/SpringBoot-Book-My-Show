package com.example.adil.SpringBootBookMyShow.Repository;

import com.example.adil.SpringBootBookMyShow.Model.TheaterSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface TheaterSeatsRepository extends JpaRepository<TheaterSeatsEntity,Integer> {
}
