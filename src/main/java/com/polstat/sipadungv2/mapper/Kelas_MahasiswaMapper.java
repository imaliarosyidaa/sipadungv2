package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.Kelas_MahasiswaDto;
import com.polstat.sipadungv2.dto.UserDto;
import com.polstat.sipadungv2.entity.Kelas_Mahasiswa;
import com.polstat.sipadungv2.entity.User;
import static com.polstat.sipadungv2.mapper.KelasMapper.mapToKelas;
import static com.polstat.sipadungv2.mapper.KelasMapper.mapToKelasDto;
import static com.polstat.sipadungv2.mapper.MahasiswaMapper.mapToMahasiswa;
import static com.polstat.sipadungv2.mapper.MahasiswaMapper.mapToMahasiswaDto;
import static com.polstat.sipadungv2.mapper.TahunAkademikMapper.mapToTahunAkademik;
import static com.polstat.sipadungv2.mapper.TahunAkademikMapper.mapToTahunAkademikDto;

public class Kelas_MahasiswaMapper {
    public static Kelas_MahasiswaDto mapToKelasMahasiswaDto(Kelas_Mahasiswa kelasMahasiswa) {
    Kelas_MahasiswaDto kelasMahasiswaDto = Kelas_MahasiswaDto.builder()
            .id(kelasMahasiswa.getId())
            .nim(mapToMahasiswaDto(kelasMahasiswa.getNim()))
            .kode_kelas(mapToKelasDto(kelasMahasiswa.getKode_kelas()))
            .tahun_akademik(mapToTahunAkademikDto(kelasMahasiswa.getTahun_akademik()))
            .mengulang(kelasMahasiswa.getMengulang())
            .harus_mengulang(kelasMahasiswa.getHarus_mengulang())
            .ip_sem1(kelasMahasiswa.getIp_sem1())
            .ipk(kelasMahasiswa.getIpk())
            .build();
    return kelasMahasiswaDto;
    }

    public static Kelas_Mahasiswa mapToKelasMahasiswa(Kelas_MahasiswaDto kelasMahasiswaDto) {
        Kelas_Mahasiswa kelasMahasiswa = Kelas_Mahasiswa.builder()
                .id(kelasMahasiswaDto.getId())
                .nim(mapToMahasiswa(kelasMahasiswaDto.getNim()))
                .kode_kelas(mapToKelas(kelasMahasiswaDto.getKode_kelas()))
                .tahun_akademik(mapToTahunAkademik(kelasMahasiswaDto.getTahun_akademik()))
                .mengulang(kelasMahasiswaDto.getMengulang())
                .harus_mengulang(kelasMahasiswaDto.getHarus_mengulang())
                .ip_sem1(kelasMahasiswaDto.getIp_sem1())
                .ipk(kelasMahasiswaDto.getIpk())
                .build();
        return kelasMahasiswa;
    }
}
