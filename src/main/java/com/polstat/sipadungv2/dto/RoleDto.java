package com.polstat.sipadungv2.dto;

import com.polstat.sipadungv2.entity.UserRoleEnum;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto {
    private Long id;

    private UserRoleEnum name;
    
    private Set<UserDto> users;
}
