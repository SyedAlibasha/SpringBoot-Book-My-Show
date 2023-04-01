package com.example.adil.SpringBootBookMyShow.Service;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TheaterResponseDto;

public interface TheaterService {
    TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto);

    TheaterResponseDto getTheater(int id);

}
