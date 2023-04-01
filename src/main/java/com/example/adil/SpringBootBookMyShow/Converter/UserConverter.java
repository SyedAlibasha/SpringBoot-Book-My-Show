package com.example.adil.SpringBootBookMyShow.Converter;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.UserResponseDto;
import com.example.adil.SpringBootBookMyShow.Model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        //.builder() is a method

        //I need to create the User
        return UserEntity.builder().name(userEntryDto.getName()).mobile(userEntryDto.getMobNo()).build();


        //Second method for creating the object ??
        //Using the new keyword

    }

    public static UserResponseDto convertEntityToDto(UserEntity user){

        return UserResponseDto.builder().id(user.getId()).name(user.getName())
                .mobNo(user.getMobile()).build();

    }


}
