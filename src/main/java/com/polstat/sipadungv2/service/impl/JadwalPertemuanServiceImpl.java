package com.polstat.sipadungv2.service.impl;

import com.polstat.sipadungv2.dto.Jadwal_pertemuanDto;
import com.polstat.sipadungv2.entity.Jadwal_pertemuan;
import com.polstat.sipadungv2.mapper.Jadwal_pertemuanMapper;
import com.polstat.sipadungv2.repository.Jadwal_pertemuanRepository;
import com.polstat.sipadungv2.service.JadwalPertemuanService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows10
 */
@Service
public class JadwalPertemuanServiceImpl implements JadwalPertemuanService{
    
    @Autowired
    private Jadwal_pertemuanRepository jadwalPertemuanRepository;

    // get semua jadwal pertemuan
    @Override
    public List<Jadwal_pertemuanDto> getAllJadwalPertemuan() {
        List<Jadwal_pertemuan> jadwalPertemuan = jadwalPertemuanRepository.findAll();
        List<Jadwal_pertemuanDto> jadwalPertemuanDtos = jadwalPertemuan.stream()
            .map((product) -> (Jadwal_pertemuanMapper.mapToJadwalPertemuanDto(product)))
            .collect(Collectors.toList());
        return jadwalPertemuanDtos;
    }

    //update jadwal pertemuan
    @Override
    public Jadwal_pertemuanDto updateJadwalPertemuan(Jadwal_pertemuanDto jadwalPertemuanDto) {
        Jadwal_pertemuan jadwal_pertemuan = jadwalPertemuanRepository.save(Jadwal_pertemuanMapper.mapToJadwalPertemuan(jadwalPertemuanDto));
        return Jadwal_pertemuanMapper.mapToJadwalPertemuanDto(jadwal_pertemuan);
    }
    
    // get jadwal pertemuan by id
    @Override
    public Jadwal_pertemuanDto getJadwalPertemuanById(Long id) {
        Jadwal_pertemuan jadwal_pertemuan = jadwalPertemuanRepository.getReferenceById(id);
        return Jadwal_pertemuanMapper.mapToJadwalPertemuanDto(jadwal_pertemuan);   
    }
}
