package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.TahunAkademikDto;
import com.polstat.sipadungv2.entity.TahunAkademik;

public class TahunAkademikMapper {
    public static TahunAkademikDto mapToTahunAkademikDto(TahunAkademik tahunAkademik) {
    TahunAkademikDto tahunAkademikDto = TahunAkademikDto.builder()
            .tahun_akademik(tahunAkademik.getTahun_akademik())
            .aktif(tahunAkademik.getAktif())
            .build();
    return tahunAkademikDto;
    }

    public static TahunAkademik mapToTahunAkademik(TahunAkademikDto tahunAkademikDto) {
        TahunAkademik tahunAkademik = TahunAkademik.builder()
                .tahun_akademik(tahunAkademikDto.getTahun_akademik())
                .aktif(tahunAkademikDto.getAktif())
                .build();
        return tahunAkademik;
    }
}
