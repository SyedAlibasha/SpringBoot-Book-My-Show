package com.example.adil.SpringBootBookMyShow.Dto.EntryDto;

import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@Getter
@Setter
public class ShowEntryDto {
    @NotNull
    LocalDate showDate;

    @NotNull
    LocalTime showTime;

    @NotNull
    MovieResponseDto movieResponseDto;

    @NotNull
    TheaterResponseDto theaterResponseDto;
}
