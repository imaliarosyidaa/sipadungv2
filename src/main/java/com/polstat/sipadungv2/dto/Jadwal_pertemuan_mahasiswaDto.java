package com.polstat.sipadungv2.dto;

import com.polstat.sipadungv2.entity.StatusKehadiran;
import java.security.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jadwal_pertemuan_mahasiswaDto {
    private Long id;
    
    private Jadwal_pertemuanDto jadwal_pertemuan_id;
    
    private Timestamp waktu_presensi;
    
    private StatusKehadiran status_kehadiran;
    
    private MahasiswaDto nim;
}
