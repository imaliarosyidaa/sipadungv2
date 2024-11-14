package com.polstat.sipadungv2.controller;

import com.polstat.sipadungv2.dto.UserDto;
import com.polstat.sipadungv2.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows10
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    //@Secured("MAHASISWA")
    //@PreAuthorize("hasRole('ADMIN')")
    @Operation(summary = "Get a List of Users")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200",description = "OK. Get all users successfully",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = Page.class))}),
        @ApiResponse(responseCode = "401",description = "Invalid credentials",
                content = @Content)})
    @GetMapping("/view")
    public List<UserDto> getUsers(){
        return userService.findAllUsers();
    }

    @Operation(summary = "Get user by Id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200",description = "OK. Get user by Id successfully.",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = Page.class))}),
        @ApiResponse(responseCode = "401",description = "Invalid credentials",
                content = @Content)})
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id){
        UserDto userDto = userService.findUserById(id);
        if (userDto != null){
            return ResponseEntity.ok().body(userDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @Operation(summary = "Create a new User")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200",description = "OK. Created a new succesfully",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = Page.class))}),
        @ApiResponse(responseCode = "401",description = "Invalid credentials",
                content = @Content)})
    @PostMapping("/add")
    public UserDto createUser(@RequestBody UserDto userDto){
        UserDto newUser = userService.createUser(userDto);
        return newUser;
    }
    
    @Operation(summary = "Delete User")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200",description = "User has been deleted",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = Page.class))}),
        @ApiResponse(responseCode = "401",description = "Invalid credentials",
                content = @Content)})
    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        UserDto userDto = userService.findUserById(id);
        userService.deleteUser(userDto);
        return ResponseEntity.ok("User has been delete");
    }
    
    @Operation(summary = "Update User")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200",description = "User updated successfully.",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = Page.class))}),
        @ApiResponse(responseCode = "401",description = "Invalid credentials",
                content = @Content)})
    @PatchMapping("/update/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
//        UserDto userById = userService.findUserById(id);    
//        userById.setEmail(userDto.getEmail());
//        userById.setPassword(userById.getPassword());
        UserDto updatedUser = userService.updateUser(userDto);
        return ResponseEntity.ok(updatedUser);
    }
}
