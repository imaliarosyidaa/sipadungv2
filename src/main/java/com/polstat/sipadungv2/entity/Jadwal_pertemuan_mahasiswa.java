package com.polstat.sipadungv2.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
@Table(name = "jadwal_pertemuan_mahasiswa")
public class Jadwal_pertemuan_mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="jadwal_pertemuan_id", referencedColumnName="jadwalId")
    private Jadwal_pertemuan jadwal_pertemuan_id;
    
    @Column(name= "waktu_presensi", nullable = false)
    private Timestamp waktu_presensi;
    
    @Column(name= "status_kehadiran", nullable = false)
    private StatusKehadiran status_kehadiran;
    
    @ManyToOne
    @JoinColumn(name="nim", referencedColumnName="nim")
    private Mahasiswa nim;
}
