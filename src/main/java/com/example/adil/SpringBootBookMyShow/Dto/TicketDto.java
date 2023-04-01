package com.example.adil.SpringBootBookMyShow.Dto;

import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {
    int id;

    String alloted_seats;

    double amount;

    ShowResponseDto showDto;

    @NotNull
    UserResponseDto userDto; //Mandatory for me to fill this userDto Value
}
