-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2024 at 06:26 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_zoo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_hewan`
--

CREATE TABLE `tbl_hewan` (
  `id_hewan` int(11) NOT NULL,
  `nama_hewan` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `umur` int(3) DEFAULT NULL,
  `asal` varchar(50) DEFAULT NULL,
  `tgl_masuk` date DEFAULT NULL,
  `nama_kandang` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_hewan`
--

INSERT INTO `tbl_hewan` (`id_hewan`, `nama_hewan`, `jenis_kelamin`, `umur`, `asal`, `tgl_masuk`, `nama_kandang`) VALUES
(18, 'Gajah', 'Jantan', 30, 'Sulawesi', '2020-10-10', 'Gajah'),
(19, 'Gajah', 'Betina', 30, 'Afrika', '2020-10-20', 'Gajah'),
(20, 'Rusa', 'Jantan', 15, 'Kalimantan', '2022-05-20', 'Rusa'),
(21, 'Rusa', 'Betina', 16, 'Kalimantan', '2022-05-20', 'Rusa'),
(22, 'Lumba-lumba', 'Betina', 10, 'Jawa', '2022-05-10', 'Ikan'),
(23, 'Lumba-lumba', 'Betina', 10, 'Jawa', '2022-05-11', 'Ikan'),
(24, 'Ular Kobra', 'Jantan', 10, 'Jawa', '2023-05-11', 'Reptil'),
(25, 'Ular Piton', 'Jantan', 5, 'Jawa', '2023-05-11', 'Reptil'),
(26, 'Cendrawasih', 'Betina', 5, 'Papua', '2023-06-11', 'Burung'),
(27, 'Cendrawasih', 'Jantan', 5, 'Papua', '2023-06-12', 'Burung');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_histori`
--

CREATE TABLE `tbl_histori` (
  `id_histori` int(11) NOT NULL,
  `nama_hewan` varchar(50) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kandang`
--

CREATE TABLE `tbl_kandang` (
  `id_kandang` int(11) NOT NULL,
  `nama_kandang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_kandang`
--

INSERT INTO `tbl_kandang` (`id_kandang`, `nama_kandang`) VALUES
(1, 'Ikan'),
(3, 'Gajah'),
(4, 'Burung'),
(5, 'Rusa'),
(6, 'Reptil');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(3) NOT NULL,
  `nama_user` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama_user`, `password`, `email`) VALUES
(1, 'Dijal', '123', 'dijalcandy@gmail.com'),
(2, 'irul', '123', 'irul@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_hewan`
--
ALTER TABLE `tbl_hewan`
  ADD PRIMARY KEY (`id_hewan`);

--
-- Indexes for table `tbl_histori`
--
ALTER TABLE `tbl_histori`
  ADD PRIMARY KEY (`id_histori`);

--
-- Indexes for table `tbl_kandang`
--
ALTER TABLE `tbl_kandang`
  ADD PRIMARY KEY (`id_kandang`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_hewan`
--
ALTER TABLE `tbl_hewan`
  MODIFY `id_hewan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `tbl_histori`
--
ALTER TABLE `tbl_histori`
  MODIFY `id_histori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbl_kandang`
--
ALTER TABLE `tbl_kandang`
  MODIFY `id_kandang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
