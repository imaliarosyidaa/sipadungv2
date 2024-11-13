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
@Table(name = "kelas")
public class Kelas {
    @Id
    @Column(name= "kode_kelas",length=5, nullable = false)
    private String kode_kelas;
    @Column(name= "nama_kelas",length=50, nullable = false)
    private String nama_kelas;
    @Column(name= "aktif",length=1, nullable = true)
    private int aktif;
}
