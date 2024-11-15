package com.polstat.sipadungv2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TahunAkademikDto {
    private int tahun_akademik;
    
    private int aktif;
}
