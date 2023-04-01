package com.example.adil.SpringBootBookMyShow.Service.Impl;

import com.example.adil.SpringBootBookMyShow.Converter.UserConverter;
import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.UserResponseDto;
import com.example.adil.SpringBootBookMyShow.Model.UserEntity;
import com.example.adil.SpringBootBookMyShow.Repository.UserRepository;
import com.example.adil.SpringBootBookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserEntryDto userEntryDto) {

        UserEntity userEntity = UserConverter.convertDtoToEntity(userEntryDto); //Cleaner
        userRepository.save(userEntity);
    }

    @Override
    public UserResponseDto getUser(int id) {

        UserEntity user = new UserEntity(); //By default user.

        UserEntity userEntity = userRepository.findById(id).get();//.get()-> is a function which throuws the error is Id is null otherwise return the value

        UserResponseDto userResponseDto = UserConverter.convertEntityToDto(userEntity);

        return userResponseDto;
    }
}
