package com.example.adil.SpringBootBookMyShow.Controller;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.example.adil.SpringBootBookMyShow.Service.Impl.TheaterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("theater")
public class TheaterController {
    @Autowired
    TheaterServiceImpl theaterService;


    @PostMapping("add")
    public TheaterResponseDto addTheater(@RequestBody() TheaterEntryDto theaterEntryDto){

        return theaterService.addTheater(theaterEntryDto);

    }
}
