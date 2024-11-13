package com.polstat.sipadungv2.mapper;

import com.polstat.sipadungv2.dto.Jadwal_pertemuanDto;
import com.polstat.sipadungv2.entity.Jadwal_pertemuan;

public class Jadwal_pertemuanMapper {
    public static Jadwal_pertemuanDto mapToJadwalPertemuanDto(Jadwal_pertemuan jadwalPertemuan) {
    Jadwal_pertemuanDto jadwalPertemuanDto = Jadwal_pertemuanDto.builder()
            .jadwalId(jadwalPertemuan.getJadwalId())
            .jam_mulai(jadwalPertemuan.getJam_mulai())
            .jam_akhir(jadwalPertemuan.getJam_akhir())
            .tanggal(jadwalPertemuan.getTanggal())
            .pokok_bahasan(jadwalPertemuan.getPokok_bahasan())
            .uraian_materi(jadwalPertemuan.getUraian_materi())
            .status(jadwalPertemuan.getStatus())
            .kode_kelas(jadwalPertemuan.getKode_kelas())
            .waktu_dibuka(jadwalPertemuan.getWaktu_dibuka())
            .waktu_ditutup(jadwalPertemuan.getWaktu_ditutup())
            .is_active(jadwalPertemuan.getIs_active())
            .is_show(jadwalPertemuan.getIs_show())
            .kode_matkul(jadwalPertemuan.getKode_matkul())
            .build();
    return jadwalPertemuanDto;
}

public static Jadwal_pertemuan mapToJadwalPertemuan(Jadwal_pertemuanDto jadwalPertemuanDto) {
    Jadwal_pertemuan jadwalPertemuan = Jadwal_pertemuan.builder()
            .jadwalId(jadwalPertemuanDto.getJadwalId())
            .jam_mulai(jadwalPertemuanDto.getJam_mulai())
            .jam_akhir(jadwalPertemuanDto.getJam_akhir())
            .tanggal(jadwalPertemuanDto.getTanggal())
            .pokok_bahasan(jadwalPertemuanDto.getPokok_bahasan())
            .uraian_materi(jadwalPertemuanDto.getUraian_materi())
            .status(jadwalPertemuanDto.getStatus())
            .kode_kelas(jadwalPertemuanDto.getKode_kelas())
            .waktu_dibuka(jadwalPertemuanDto.getWaktu_dibuka())
            .waktu_ditutup(jadwalPertemuanDto.getWaktu_ditutup())
            .is_active(jadwalPertemuanDto.getIs_active())
            .is_show(jadwalPertemuanDto.getIs_show())
            .kode_matkul(jadwalPertemuanDto.getKode_matkul())
            .build();
    return jadwalPertemuan;
}

}
