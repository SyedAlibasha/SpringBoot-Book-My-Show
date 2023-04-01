package com.example.adil.SpringBootBookMyShow.Repository;

import com.example.adil.SpringBootBookMyShow.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
