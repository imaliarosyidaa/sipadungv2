/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.service;

import com.polstat.sipadungv2.dto.Jadwal_pertemuanDto;
import com.polstat.sipadungv2.entity.Jadwal_pertemuan;
import java.util.List;


/**
 *
 * @author Windows10
 */
public interface JadwalPertemuanService {
    // get semua jadwal pertemuan (admin, mahasiswa, dosen)
    public List<Jadwal_pertemuanDto> getAllJadwalPertemuan();
    
    // mengubah jadwal pertemuan (admin)
    public Jadwal_pertemuanDto updateJadwalPertemuan(Jadwal_pertemuanDto jadwalPertemuanDto);
    
    // get jadwal pertemuan by Id (admin, mahasiswa, dosen)
    public Jadwal_pertemuanDto getJadwalPertemuanById(Long id);
}
