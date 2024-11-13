package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.RoleDto;
import com.polstat.sipadungv2.entity.Role;

public class RoleMapper {
    public static Role mapToEntity(RoleDto roleDto) {
        return Role.builder()
            .id(roleDto.getId())
            .name(roleDto.getName())
            .build();
    }

    public static RoleDto mapToDto(Role role) {
        return RoleDto.builder()
            .id(role.getId())
            .name(role.getName())
            .build();
    }
}
