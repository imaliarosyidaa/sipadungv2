/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.sipadungv2.service.impl;

import com.polstat.sipadungv2.dto.Penggantian_kelasDto;
import com.polstat.sipadungv2.entity.Penggantian_kelas;
import com.polstat.sipadungv2.mapper.Penggantian_kelasMapper;
import com.polstat.sipadungv2.repository.PenggantianKelasRepository;
import com.polstat.sipadungv2.service.PenggantianKelasService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Windows10
 */
@Service
public class PenggantianKelasServiceImpl implements PenggantianKelasService {
    @Autowired
    private PenggantianKelasRepository penggantianKelasRepository;

    @Override
    public Penggantian_kelasDto createPenggantianJadwal(Penggantian_kelasDto penggantianKelasDto) {
        Penggantian_kelas penggantian_kelas = penggantianKelasRepository.save(Penggantian_kelasMapper.mapToPenggantianKelas(penggantianKelasDto));
        return Penggantian_kelasMapper.mapToPenggantianKelasDto(penggantian_kelas);
    }

    @Override
    public List<Penggantian_kelasDto> getAllJadwalPertemuan() {
        List<Penggantian_kelas> penggantian_kelas = penggantianKelasRepository.findAll();
        List<Penggantian_kelasDto> penggantian_kelasDtos = penggantian_kelas.stream()
            .map((product) -> (Penggantian_kelasMapper.mapToPenggantianKelasDto(product)))
            .collect(Collectors.toList());
        return penggantian_kelasDtos;
    }

    @Override
    public Penggantian_kelasDto getJadwalPertemuanById(Long id) {
        Penggantian_kelas penggantian_kelas = penggantianKelasRepository.getReferenceById(id);
        return Penggantian_kelasMapper.mapToPenggantianKelasDto(penggantian_kelas);   
    }

}
