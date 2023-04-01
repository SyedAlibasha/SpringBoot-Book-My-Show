package com.example.adil.SpringBootBookMyShow.Service;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.UserResponseDto;

public interface UserService {
//Designing part

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);
}
