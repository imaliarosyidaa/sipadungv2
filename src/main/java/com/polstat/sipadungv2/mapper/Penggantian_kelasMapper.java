package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.Penggantian_kelasDto;
import com.polstat.sipadungv2.entity.Penggantian_kelas;

public class Penggantian_kelasMapper {
    public static Penggantian_kelasDto mapToPenggantianKelasDto(Penggantian_kelas penggantianKelas) {
    Penggantian_kelasDto penggantianKelasDto = Penggantian_kelasDto.builder()
            .ganti_kelas_id(penggantianKelas.getGanti_kelas_id())
            .is_acc(penggantianKelas.getIs_acc())
            .file_bukti_dukung(penggantianKelas.getFile_bukti_dukung())
            .jadwal_pertemuan_id(penggantianKelas.getJadwal_pertemuan_id())
            .build();
    return penggantianKelasDto;
    }

    public static Penggantian_kelas mapToPenggantianKelas(Penggantian_kelasDto penggantianKelasDto) {
        Penggantian_kelas penggantianKelas = Penggantian_kelas.builder()
                .ganti_kelas_id(penggantianKelasDto.getGanti_kelas_id())
                .is_acc(penggantianKelasDto.getIs_acc())
                .file_bukti_dukung(penggantianKelasDto.getFile_bukti_dukung())
                .jadwal_pertemuan_id(penggantianKelasDto.getJadwal_pertemuan_id())
                .build();
        return penggantianKelas;
    }
}
