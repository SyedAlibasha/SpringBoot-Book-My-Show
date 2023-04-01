package com.example.adil.SpringBootBookMyShow.Controller;

import com.example.adil.SpringBootBookMyShow.Dto.BookTicketRequestDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.example.adil.SpringBootBookMyShow.Service.Impl.TicketServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("ticket")
public class TicketController {
    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("get/{id}")
    public TicketResponseDto getTicketById(@PathVariable Integer id){

        return ticketService.getTicket(id);
    }

    @PostMapping("/add")
    public TicketResponseDto addTicket(@RequestBody() BookTicketRequestDto bookTicketRequestDto){


        log.info("In controller");
        return ticketService.bookTicket(bookTicketRequestDto);

    }

}
