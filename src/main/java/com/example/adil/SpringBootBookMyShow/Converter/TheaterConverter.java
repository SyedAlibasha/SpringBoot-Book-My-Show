package com.example.adil.SpringBootBookMyShow.Converter;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.example.adil.SpringBootBookMyShow.Model.TheaterEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConverter {
    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().address(theaterEntryDto.getAddress())
                .city(theaterEntryDto.getCity()).name(theaterEntryDto.getName()).build();


    }

    public static TheaterResponseDto convertEntityToDto(TheaterEntity theaterEntity){

        return TheaterResponseDto.builder().id(theaterEntity.getId()).name(theaterEntity.getName())
                .city(theaterEntity.getCity()).address(theaterEntity.getAddress())
                .type(theaterEntity.getType())
                .build();
    }
}
