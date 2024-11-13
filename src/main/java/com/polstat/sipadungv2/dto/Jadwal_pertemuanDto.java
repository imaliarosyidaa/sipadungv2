package com.polstat.sipadungv2.dto;

import com.polstat.sipadungv2.entity.StatusJadwal;
import java.security.Timestamp;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jadwal_pertemuanDto {

    private String jadwalId;

    private Timestamp jam_mulai;

    private Timestamp jam_akhir;

    private Date tanggal;   

    private String pokok_bahasan;

    private String uraian_materi;
    
    private StatusJadwal status;

    private String kode_kelas;

    private Timestamp waktu_dibuka;
    
    private Timestamp waktu_ditutup;

    private int is_active;

    private int is_show;
    
    private String kode_matkul;
}