package com.polstat.sipadungv2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KelasDto {
    private String kode_kelas;
    
    private String nama_kelas;
    
    private int aktif;
}
