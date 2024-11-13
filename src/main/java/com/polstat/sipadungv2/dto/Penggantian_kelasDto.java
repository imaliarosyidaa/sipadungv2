package com.polstat.sipadungv2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Penggantian_kelasDto {
    private String ganti_kelas_id;
    
    private int is_acc;
    
    private String file_bukti_dukung;
    
    private String jadwal_pertemuan_id;
}
