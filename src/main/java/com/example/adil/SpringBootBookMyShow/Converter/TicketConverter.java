package com.example.adil.SpringBootBookMyShow.Converter;

import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.example.adil.SpringBootBookMyShow.Model.TicketEntity;

public class TicketConverter {
    public static TicketResponseDto convertEntityToDto(TicketEntity ticketEntity){

        return TicketResponseDto.builder().id((int) ticketEntity.getId()).amount(ticketEntity.getAmount())
                .alloted_seats(ticketEntity.getAllottedSeats())
                .build();

    }
}
