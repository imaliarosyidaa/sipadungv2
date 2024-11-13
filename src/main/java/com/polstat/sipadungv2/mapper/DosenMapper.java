package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.DosenDto;
import com.polstat.sipadungv2.entity.Dosen;

public class DosenMapper {
    public static DosenDto mapToDosenDto(Dosen dosen) {
        DosenDto dosenDto = DosenDto.builder()
                .id(dosen.getId())
                .nip(dosen.getNip())
                .email(dosen.getEmail())
                .build();        
        return dosenDto;
    }    
    public static Dosen mapToDosen(DosenDto dosenDto) {
        Dosen dosen = Dosen.builder()
                .id(dosenDto.getId())
                .nip(dosenDto.getNip())
                .email(dosenDto.getEmail())
                .build();        
        return dosen;
    }
}
