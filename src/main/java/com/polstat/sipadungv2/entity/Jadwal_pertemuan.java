package com.polstat.sipadungv2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.security.Timestamp;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "jadwal_pertemuan")
public class Jadwal_pertemuan {
    @Id
    @Column(length=11)
    private String jadwalId;
    
    @Column(name= "jam_mulai",nullable = false)
    private Timestamp jam_mulai;
    
    @Column(name= "jam_akhir",nullable = false)
    private Timestamp jam_akhir;
    
    @Column(name= "tanggal",nullable = false)
    private Date tanggal;   
    
    @Column(name= "pokok_bahasan",length=500, nullable = false)
    private String pokok_bahasan;
    
    @Column(name= "uraian_materi", nullable = false)
    private String uraian_materi;
    
    @Column(name= "status",nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusJadwal status;
    
    @Column(name= "kode_kelas",length=5, nullable = false)
    private String kode_kelas;
    
    @Column(name= "waktu_dibuka", nullable = true)
    private Timestamp waktu_dibuka;
    
    @Column(name= "waktu_ditutup", nullable = true)
    private Timestamp waktu_ditutup;
    
    @Column(name= "is_active",length=1, nullable = false)
    private int is_active;
    
    @Column(name= "is_show",length=1, nullable = false)
    private int is_show;
    
    @Column(name= "kode_matkul",length=8, nullable = false)
    private String kode_matkul;
}