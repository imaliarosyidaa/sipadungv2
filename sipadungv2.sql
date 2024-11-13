-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2024 at 05:08 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sipadungv2`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id` bigint NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `nip` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `has_roles`
--

CREATE TABLE `has_roles` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `has_roles`
--

INSERT INTO `has_roles` (`user_id`, `role_id`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_pertemuan`
--

CREATE TABLE `jadwal_pertemuan` (
  `jadwal_id` varchar(11) NOT NULL,
  `is_active` int NOT NULL,
  `is_show` int NOT NULL,
  `jam_akhir` varbinary(255) NOT NULL,
  `jam_mulai` varbinary(255) NOT NULL,
  `kode_kelas` varchar(5) NOT NULL,
  `kode_matkul` varchar(8) NOT NULL,
  `pokok_bahasan` varchar(500) NOT NULL,
  `status` enum('AKAN_DATANG','DIAKHIRI','DIMULAI') NOT NULL,
  `tanggal` datetime(6) NOT NULL,
  `uraian_materi` varchar(255) NOT NULL,
  `waktu_dibuka` varbinary(255) DEFAULT NULL,
  `waktu_ditutup` varbinary(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_pertemuan_mahasiswa`
--

CREATE TABLE `jadwal_pertemuan_mahasiswa` (
  `id` bigint NOT NULL,
  `status_kehadiran` tinyint NOT NULL,
  `waktu_presensi` varbinary(255) NOT NULL,
  `jadwal_pertemuan_id` varchar(11) DEFAULT NULL,
  `nim` varchar(100) DEFAULT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `kode_kelas` varchar(5) NOT NULL,
  `aktif` int DEFAULT NULL,
  `nama_kelas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kelas_mahasiswa`
--

CREATE TABLE `kelas_mahasiswa` (
  `id` bigint NOT NULL,
  `harus_mengulang` int DEFAULT NULL,
  `ip_sem1` float DEFAULT NULL,
  `ipk` float DEFAULT NULL,
  `mengulang` int DEFAULT NULL,
  `kode_kelas` varchar(5) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `tahun_akademik` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` bigint NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `nim` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nama`, `nim`) VALUES
(1, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `mata_kuliah`
--

CREATE TABLE `mata_kuliah` (
  `kode_matkul` varchar(8) NOT NULL,
  `nama_matkul` varchar(100) NOT NULL,
  `sks_praktikum` int NOT NULL,
  `sks_teori` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `matkul_dosen`
--

CREATE TABLE `matkul_dosen` (
  `kode_matkul` varchar(8) NOT NULL,
  `dosen_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `penggantian_kelas`
--

CREATE TABLE `penggantian_kelas` (
  `ganti_kelas_id` varchar(255) NOT NULL,
  `file_bukti_dukung` varchar(25) DEFAULT NULL,
  `is_acc` int NOT NULL,
  `jadwal_pertemuan_id` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` bigint NOT NULL,
  `name` enum('ADMIN','DOSEN','MAHASISWA') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'ADMIN'),
(2, 'DOSEN'),
(3, 'MAHASISWA');

-- --------------------------------------------------------

--
-- Table structure for table `tahun_akademik`
--

CREATE TABLE `tahun_akademik` (
  `tahun_akademik` int NOT NULL,
  `aktif` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `profile_id` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `profile_id`) VALUES
(1, 'mahasiswa_6@stis.ac.id', '$2a$10$xs4WRJ0hG8U/bO1NtAfplOKbM8Dbq3Hj5YWn23m2Wzvf0bfeNjLbq', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `has_roles`
--
ALTER TABLE `has_roles`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKjqu2x6tpmyqkyh8vya0qder1y` (`role_id`);

--
-- Indexes for table `jadwal_pertemuan`
--
ALTER TABLE `jadwal_pertemuan`
  ADD PRIMARY KEY (`jadwal_id`);

--
-- Indexes for table `jadwal_pertemuan_mahasiswa`
--
ALTER TABLE `jadwal_pertemuan_mahasiswa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5hxyf8m121clmyytxr4xa96vw` (`jadwal_pertemuan_id`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`kode_kelas`);

--
-- Indexes for table `kelas_mahasiswa`
--
ALTER TABLE `kelas_mahasiswa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKbww23p76sdt9iq0b5ue7yiw1` (`kode_kelas`),
  ADD KEY `FK82uywl9dv88e56y9snmh23hq1` (`tahun_akademik`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mata_kuliah`
--
ALTER TABLE `mata_kuliah`
  ADD PRIMARY KEY (`kode_matkul`);

--
-- Indexes for table `matkul_dosen`
--
ALTER TABLE `matkul_dosen`
  ADD KEY `FKawgehdwmg7o507wn2y2lhbhhm` (`dosen_id`),
  ADD KEY `FK66wdqsm4r35vmmdeoguw30rsd` (`kode_matkul`);

--
-- Indexes for table `penggantian_kelas`
--
ALTER TABLE `penggantian_kelas`
  ADD PRIMARY KEY (`ganti_kelas_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tahun_akademik`
--
ALTER TABLE `tahun_akademik`
  ADD PRIMARY KEY (`tahun_akademik`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK7s5nlreekaxdbfml4ofky7utw` (`profile_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `jadwal_pertemuan_mahasiswa`
--
ALTER TABLE `jadwal_pertemuan_mahasiswa`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `kelas_mahasiswa`
--
ALTER TABLE `kelas_mahasiswa`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `has_roles`
--
ALTER TABLE `has_roles`
  ADD CONSTRAINT `FKjqu2x6tpmyqkyh8vya0qder1y` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `FKtbfgca3d52a8dyyn8pbuf4yd1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `jadwal_pertemuan_mahasiswa`
--
ALTER TABLE `jadwal_pertemuan_mahasiswa`
  ADD CONSTRAINT `FK5hxyf8m121clmyytxr4xa96vw` FOREIGN KEY (`jadwal_pertemuan_id`) REFERENCES `jadwal_pertemuan` (`jadwal_id`);

--
-- Constraints for table `kelas_mahasiswa`
--
ALTER TABLE `kelas_mahasiswa`
  ADD CONSTRAINT `FK82uywl9dv88e56y9snmh23hq1` FOREIGN KEY (`tahun_akademik`) REFERENCES `tahun_akademik` (`tahun_akademik`),
  ADD CONSTRAINT `FKbww23p76sdt9iq0b5ue7yiw1` FOREIGN KEY (`kode_kelas`) REFERENCES `kelas` (`kode_kelas`);

--
-- Constraints for table `matkul_dosen`
--
ALTER TABLE `matkul_dosen`
  ADD CONSTRAINT `FK66wdqsm4r35vmmdeoguw30rsd` FOREIGN KEY (`kode_matkul`) REFERENCES `mata_kuliah` (`kode_matkul`),
  ADD CONSTRAINT `FKawgehdwmg7o507wn2y2lhbhhm` FOREIGN KEY (`dosen_id`) REFERENCES `dosen` (`id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `FKah3pfx46dfbfvpl3n3fl9tdnh` FOREIGN KEY (`profile_id`) REFERENCES `mahasiswa` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
