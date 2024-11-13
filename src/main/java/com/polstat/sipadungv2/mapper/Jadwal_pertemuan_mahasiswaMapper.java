package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.Jadwal_pertemuan_mahasiswaDto;
import com.polstat.sipadungv2.entity.Jadwal_pertemuan_mahasiswa;
import static com.polstat.sipadungv2.mapper.Jadwal_pertemuanMapper.mapToJadwalPertemuan;
import static com.polstat.sipadungv2.mapper.Jadwal_pertemuanMapper.mapToJadwalPertemuanDto;
import static com.polstat.sipadungv2.mapper.MahasiswaMapper.mapToMahasiswa;
import static com.polstat.sipadungv2.mapper.MahasiswaMapper.mapToMahasiswaDto;

public class Jadwal_pertemuan_mahasiswaMapper {
    public static Jadwal_pertemuan_mahasiswaDto mapToJadwalPertemuanMahasiswaDto(Jadwal_pertemuan_mahasiswa jadwalPertemuanMahasiswa) {
    Jadwal_pertemuan_mahasiswaDto jadwalPertemuanMahasiswaDto = Jadwal_pertemuan_mahasiswaDto.builder()
            .id(jadwalPertemuanMahasiswa.getId())
            .jadwal_pertemuan_id(mapToJadwalPertemuanDto(jadwalPertemuanMahasiswa.getJadwal_pertemuan_id()))
            .waktu_presensi(jadwalPertemuanMahasiswa.getWaktu_presensi())
            .status_kehadiran(jadwalPertemuanMahasiswa.getStatus_kehadiran())
            .nim(mapToMahasiswaDto(jadwalPertemuanMahasiswa.getNim()))
            .build();
    return jadwalPertemuanMahasiswaDto;
}

public static Jadwal_pertemuan_mahasiswa mapToJadwalPertemuanMahasiswa(Jadwal_pertemuan_mahasiswaDto jadwalPertemuanMahasiswaDto) {
    Jadwal_pertemuan_mahasiswa jadwalPertemuanMahasiswa = Jadwal_pertemuan_mahasiswa.builder()
            .id(jadwalPertemuanMahasiswaDto.getId())
            .jadwal_pertemuan_id(mapToJadwalPertemuan(jadwalPertemuanMahasiswaDto.getJadwal_pertemuan_id()))
            .waktu_presensi(jadwalPertemuanMahasiswaDto.getWaktu_presensi())
            .status_kehadiran(jadwalPertemuanMahasiswaDto.getStatus_kehadiran())
            .nim(mapToMahasiswa(jadwalPertemuanMahasiswaDto.getNim()))
            .build();
    return jadwalPertemuanMahasiswa;
}

}
