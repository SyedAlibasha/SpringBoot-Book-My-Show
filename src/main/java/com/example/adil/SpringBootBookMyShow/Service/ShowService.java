package com.example.adil.SpringBootBookMyShow.Service;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.ShowEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.ShowResponseDto;

public interface ShowService {
    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    //Get show
    //Complete
}
