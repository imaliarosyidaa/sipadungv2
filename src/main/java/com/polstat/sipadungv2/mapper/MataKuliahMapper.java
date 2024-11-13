package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.MataKuliahDto;
import com.polstat.sipadungv2.entity.MataKuliah;

public class MataKuliahMapper {
    public static MataKuliahDto mapToMataKuliahDto(MataKuliah mataKuliah) {
    MataKuliahDto mataKuliahDto = MataKuliahDto.builder()
            .kode_matkul(mataKuliah.getKode_matkul())
            .nama_matkul(mataKuliah.getNama_matkul())
            .sks_praktikum(mataKuliah.getSks_praktikum())
            .sks_teori(mataKuliah.getSks_teori())
            .build();
    return mataKuliahDto;
    }

    public static MataKuliah mapToMataKuliah(MataKuliahDto mataKuliahDto) {
        MataKuliah mataKuliah = MataKuliah.builder()
                .kode_matkul(mataKuliahDto.getKode_matkul())
                .nama_matkul(mataKuliahDto.getNama_matkul())
                .sks_praktikum(mataKuliahDto.getSks_praktikum())
                .sks_teori(mataKuliahDto.getSks_teori())
                .build();
        return mataKuliah;
    }
}
