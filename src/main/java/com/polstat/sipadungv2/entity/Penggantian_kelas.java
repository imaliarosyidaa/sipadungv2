package com.polstat.sipadungv2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "penggantian_kelas")
public class Penggantian_kelas {
    @Id
    private String ganti_kelas_id;
    
    @Column(name= "is_acc",length=1, nullable = false)
    private int is_acc;
    
    @Column(name= "file_bukti_dukung",length=25, nullable = true)
    private String file_bukti_dukung;
    
    @Column(name= "jadwal_pertemuan_id",length=12,nullable = true)
    private String jadwal_pertemuan_id;
}
