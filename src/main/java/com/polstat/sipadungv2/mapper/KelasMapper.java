package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.KelasDto;
import com.polstat.sipadungv2.entity.Kelas;

public class KelasMapper {
    public static KelasDto mapToKelasDto(Kelas kelas) {
    KelasDto kelasDto = KelasDto.builder()
            .kode_kelas(kelas.getKode_kelas())
            .nama_kelas(kelas.getNama_kelas())
            .aktif(kelas.getAktif())
            .build();
    return kelasDto;
    }

    public static Kelas mapToKelas(KelasDto kelasDto) {
        Kelas kelas = Kelas.builder()
                .kode_kelas(kelasDto.getKode_kelas())
                .nama_kelas(kelasDto.getNama_kelas())
                .aktif(kelasDto.getAktif())
                .build();
        return kelas;
    }
}
