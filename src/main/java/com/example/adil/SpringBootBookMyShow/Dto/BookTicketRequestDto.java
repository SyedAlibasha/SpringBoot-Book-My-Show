package com.example.adil.SpringBootBookMyShow.Dto;

import com.example.adil.SpringBootBookMyShow.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookTicketRequestDto {
    int id; // user id
    int showId;
    SeatType seatType;
    Set<String> requestedSeats;
}
