package com.example.adil.SpringBootBookMyShow.Controller;

import com.example.adil.SpringBootBookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.adil.SpringBootBookMyShow.Dto.ResponseDto.UserResponseDto;
import com.example.adil.SpringBootBookMyShow.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody() UserEntryDto userEntryDto){

        userService.addUser(userEntryDto);

        return new ResponseEntity("User Added..", HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable(value = "id")int id){

        UserResponseDto userResponseDto = userService.getUser(id);
        return new ResponseEntity<>(userResponseDto,HttpStatus.OK);
    }

}
