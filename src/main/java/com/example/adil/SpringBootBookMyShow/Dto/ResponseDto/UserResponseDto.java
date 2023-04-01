package com.example.adil.SpringBootBookMyShow.Dto.ResponseDto;

import com.example.adil.SpringBootBookMyShow.Dto.TicketDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponseDto {
    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;
}
