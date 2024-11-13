package com.polstat.sipadungv2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kelas_MahasiswaDto {
    private Long id;
    
    private MahasiswaDto nim;
    
    private KelasDto kode_kelas;
    
    private TahunAkademikDto tahun_akademik;
    
    private int mengulang;
    
    private int harus_mengulang;
    
    private float ip_sem1;
    
    private float ipk;    
}
