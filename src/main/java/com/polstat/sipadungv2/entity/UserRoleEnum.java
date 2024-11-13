/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.entity;

import static com.polstat.sipadungv2.entity.Permission.*;
import static java.lang.reflect.Array.set;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import static org.hibernate.Hibernate.set;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 *
 * @author Windows10
 */
@RequiredArgsConstructor
public enum UserRoleEnum {
    ADMIN(Collections.emptySet()),
    MAHASISWA(
            Set.of(
                    MAHASISWA_CREATE,
                    MAHASISWA_READ,
                    MAHASISWA_UPDATE,
                    MAHASISWA_DELETE
            )
    ),
    DOSEN(
          Set.of(
                    DOSEN_CREATE,
                    DOSEN_READ,
                    DOSEN_UPDATE,
                    DOSEN_DELETE
            )
    )
    ;
    
    @Getter
    private final Set<Permission> permissions;
    
    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
            .stream()
            .map(permission -> new SimpleGrantedAuthority (permission.name()))
            .toList();
        
            authorities.add(new SimpleGrantedAuthority ("ROLE_" + this.name()));
        return authorities;
    }
}