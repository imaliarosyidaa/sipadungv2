package com.polstat.sipadungv2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MataKuliahDto {
    private String kode_matkul;
    
    private String nama_matkul;
    
    private int sks_praktikum;
    
    private int sks_teori;
}
