package com.polstat.sipadungv2.service.impl;

import com.polstat.sipadungv2.dto.MahasiswaDto;
import com.polstat.sipadungv2.dto.UserDto;
import com.polstat.sipadungv2.entity.Mahasiswa;
import com.polstat.sipadungv2.entity.Role;
import com.polstat.sipadungv2.entity.User;
import com.polstat.sipadungv2.entity.UserRoleEnum;
import com.polstat.sipadungv2.mapper.MahasiswaMapper;
import com.polstat.sipadungv2.mapper.UserMapper;
import com.polstat.sipadungv2.repository.RoleRepository;
import com.polstat.sipadungv2.repository.UserRepository;
import com.polstat.sipadungv2.service.UserService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        Set<Role> role = roleRepository.findByName(UserRoleEnum.MAHASISWA);
//        if(role == null){
//            role = checkRoleExist();
//        }
        MahasiswaDto mhsDto = new MahasiswaDto();
        Mahasiswa mhs = MahasiswaMapper.mapToMahasiswa(mhsDto);
        User user = UserMapper.mapToUser(userDto);
        user.setRoles(role);
        user.setProfile(mhs);
        userRepository.save(user);
        return UserMapper.mapToUserDto(user);
    }
    
    @Override
    public UserDto findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return UserMapper.mapToUserDto(user);
    }
    
    @Override
    public UserDto findUserById(Long id) {
        User user = userRepository.getReferenceById(id);
        return UserMapper.mapToUserDto(user);
    }
    
    @Override
    public List<UserDto> findAllUsers() {
        List<User> user = userRepository.findAll();
        List<UserDto> userDtos = user.stream()
            .map((product) -> (UserMapper.mapToUserDto(product)))
            .collect(Collectors.toList());
        return userDtos;
    }
    
//    private Set<Role> checkRoleExist(){
//        Role role = new Role();
//        role.setName(UserRoleEnum.MAHASISWA);
//        return roleRepository.save(role);
//    }

    @Override
    public void deleteUser(UserDto userDto) {
        userRepository.delete(UserMapper.mapToUser(userDto));
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user = userRepository.save(UserMapper.mapToUser(userDto));
        return UserMapper.mapToUserDto(user);    
    }

}