package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.MahasiswaDto;
import com.polstat.sipadungv2.dto.RoleDto;
import com.polstat.sipadungv2.dto.UserDto;
import com.polstat.sipadungv2.entity.Dosen;
import com.polstat.sipadungv2.entity.Mahasiswa;
import com.polstat.sipadungv2.entity.Role;
import com.polstat.sipadungv2.entity.User;
import com.polstat.sipadungv2.repository.MahasiswaRepository;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UserMapper {
    // map User entity to User Dto
    public static UserDto mapToUserDto(User user) {
        Set<RoleDto> roleDtos = new HashSet<>();
        roleDtos = user.getRoles().stream()
                .map(role -> RoleMapper.mapToDto(role))
                .collect(Collectors.toSet());
        
        UserDto userDto = UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .roles(roleDtos)
                .profile(user.getProfile())
                .build();        
        return userDto;
    }    
    // map User Dto ke User Entity
    public static User mapToUser(UserDto userDto) {
        //Mahasiswa mahasiswa = findByNim(userDto.getNim());
        User user = User.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();        
        return user;
    }
}