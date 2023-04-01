package com.example.adil.SpringBootBookMyShow.Dto.ResponseDto;

import com.example.adil.SpringBootBookMyShow.Enums.TheaterType;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheaterResponseDto {
    @NotNull
    int id;

    String name;
    String address;
    String city;
    TheaterType type;
    //Show Entity
}
