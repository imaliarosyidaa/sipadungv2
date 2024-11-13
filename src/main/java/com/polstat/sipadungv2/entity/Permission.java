/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Windows10
 */
@RequiredArgsConstructor
public enum Permission {
    ADMIN_CREATE("admin:create"),
    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:read"),
    ADMIN_DELETE("admin:read"),
    DOSEN_CREATE("dosen:create"),
    DOSEN_READ("dosen:read"),
    DOSEN_UPDATE("dosen:read"),
    DOSEN_DELETE("dosen:read"),
    MAHASISWA_CREATE("mahasiswa:create"),
    MAHASISWA_READ("mahasiswa:read"),
    MAHASISWA_UPDATE("mahasiswa:read"),
    MAHASISWA_DELETE("mahasiswa:read"),
    ;
    @Getter
    private final String permission;
}
