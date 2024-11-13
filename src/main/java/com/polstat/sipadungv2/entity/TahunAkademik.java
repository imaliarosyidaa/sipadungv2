package com.polstat.sipadungv2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "tahun_akademik")
public class TahunAkademik {
    @Id
    @Column(name= "tahun_akademik",length=4, nullable = false)
    private int tahun_akademik;
    
    @Column(name= "aktif",length=1, nullable = true)
    private int aktif;
}
