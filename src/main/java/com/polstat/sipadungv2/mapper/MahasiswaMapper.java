package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.MahasiswaDto;
import com.polstat.sipadungv2.entity.Mahasiswa;
import static com.polstat.sipadungv2.mapper.DosenMapper.mapToDosen;
import static com.polstat.sipadungv2.mapper.DosenMapper.mapToDosenDto;

public class MahasiswaMapper {
    public static MahasiswaDto mapToMahasiswaDto(Mahasiswa mahasiswa) {
    MahasiswaDto mahasiswaDto = MahasiswaDto.builder()
            .nim(mahasiswa.getNim())
            .nama(mahasiswa.getNama())
            //.dosen_pa(mapToDosenDto(mahasiswa.getDosen_pa()))
            .build();
    return mahasiswaDto;
    }

    public static Mahasiswa mapToMahasiswa(MahasiswaDto mahasiswaDto) {
        Mahasiswa mahasiswa = Mahasiswa.builder()
                .nim(mahasiswaDto.getNim())
                .nama(mahasiswaDto.getNama())
                //.dosen_pa(mapToDosen(mahasiswaDto.getDosen_pa()))
                .build();
        return mahasiswa;
    }
}
