package com.example.adil.SpringBootBookMyShow.Service;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.MovieEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.MovieResponseDto;

public interface MovieService {
    //Add movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);


    //get movie
    MovieResponseDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);
}
