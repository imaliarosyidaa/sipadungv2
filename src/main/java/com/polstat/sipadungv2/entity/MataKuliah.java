package com.polstat.sipadungv2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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
@Table(name = "mata_kuliah")
public class MataKuliah {
    @Id
    @Column(length=8)
    private String kode_matkul;
    
    @Column(name= "nama_matkul",length=100, nullable = false)
    private String nama_matkul;
    
    @Column(name= "sks_praktikum",length=1, nullable = false)
    private int sks_praktikum;
    
    @Column(name= "sks_teori",length=1,nullable = false)
    private int sks_teori;
    
    @ManyToMany
    @JoinTable(
            name="matkulDosen",
            joinColumns={@JoinColumn(name="kode_matkul", referencedColumnName="kode_matkul")},
            inverseJoinColumns={@JoinColumn(name="dosen_id", referencedColumnName="id")})
    private List<Dosen> dosen_id = new ArrayList<>();
}
