package com.example.adil.SpringBootBookMyShow.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class UserEntity {
    @Id// denotes this is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// this will generate the value for primary key
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) //bidirectional mapping//(Cascade)->Denotes this s a parent
    private List<TicketEntity> ticketEntities;

}
