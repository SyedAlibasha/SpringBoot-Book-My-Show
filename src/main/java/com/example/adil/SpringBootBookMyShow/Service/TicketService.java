package com.example.adil.SpringBootBookMyShow.Service;

import com.example.adil.SpringBootBookMyShow.Dto.BookTicketRequestDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TicketResponseDto;

public interface TicketService {
    TicketResponseDto getTicket(int id); //H.W (Hint is same as you do in GetMovie)

    TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
