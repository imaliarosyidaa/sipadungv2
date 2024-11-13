/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.polstat.sipadungv2.service;

import java.util.List;
import com.polstat.sipadungv2.dto.UserDto;
import com.polstat.sipadungv2.entity.User;


/**
 *
 * @author Windows10
 */
public interface UserService {
    
    //tambah user baru
    public UserDto createUser(UserDto userDto);
    
    //cari user berdasarkan email
    public UserDto findUserByEmail(String email);
    
    //get semua daftar user
    public List<UserDto> findAllUsers();
    
    //get user berdasarkan id
    public UserDto findUserById(Long id);
    
    // delete user
    public void deleteUser(UserDto userDto);
    
    //update user
    public UserDto updateUser(UserDto userDto);
}
