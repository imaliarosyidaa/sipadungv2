/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.polstat.sipadungv2.entity.Role;
import com.polstat.sipadungv2.entity.UserRoleEnum;
import java.util.Set;
/**
 *
 * @author pinaa
 */

public interface RoleRepository extends JpaRepository<Role, Long> {

    Set<Role> findByName(UserRoleEnum name);
}

