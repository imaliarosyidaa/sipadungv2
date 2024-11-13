/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.repository;

import com.polstat.sipadungv2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author pinaa
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
