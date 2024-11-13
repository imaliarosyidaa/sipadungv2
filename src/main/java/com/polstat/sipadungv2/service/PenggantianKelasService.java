/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.service;

import com.polstat.sipadungv2.dto.Jadwal_pertemuanDto;
import com.polstat.sipadungv2.dto.Penggantian_kelasDto;
import com.polstat.sipadungv2.entity.Penggantian_kelas;
import java.util.List;

/**
 *
 * @author Windows10
 */
public interface PenggantianKelasService {
    
    //ajukan penggantian kelas (dosen)
    public Penggantian_kelasDto createPenggantianJadwal(Penggantian_kelasDto penggantianKelasDto);
    
    // get semua penggantian_kelas (admin)
    public List<Penggantian_kelasDto> getAllJadwalPertemuan();
    
    // get jadwal penggantian_kelas by Id (admin)
    public Penggantian_kelasDto getJadwalPertemuanById(Long id);
}
