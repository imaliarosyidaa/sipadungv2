package com.polstat.sipadungv2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "kelas_mahasiswa")
public class Kelas_Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name= "nim",referencedColumnName="nim",nullable = false)
    private Mahasiswa nim;
    
    @ManyToOne
    @JoinColumn(name= "kode_kelas", referencedColumnName="kode_kelas",nullable = false)
    private Kelas kode_kelas;
    
    @ManyToOne
    @JoinColumn(name= "tahun_akademik",referencedColumnName="tahun_akademik",nullable = false)
    private TahunAkademik tahun_akademik;
    
    @Column(name= "mengulang",length=1, nullable = true)
    private int mengulang;
    
    @Column(name= "harus_mengulang",length=1, nullable = true)
    private int harus_mengulang;
    
    @Column(name= "ip_sem1", nullable = true)
    private float ip_sem1;
    
    @Column(name= "ipk", nullable = true)
    private float ipk;
    
}
