-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jul 2020 pada 10.38
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_keluarga_berencana`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `list_kontrasepsi`
--

CREATE TABLE `list_kontrasepsi` (
  `id_kontrasepsi` int(25) NOT NULL,
  `nama_kontrasepsi` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `list_kontrasepsi`
--

INSERT INTO `list_kontrasepsi` (`id_kontrasepsi`, `nama_kontrasepsi`) VALUES
(1, 'Pil'),
(2, 'Kondom'),
(3, 'IUD');

-- --------------------------------------------------------

--
-- Struktur dari tabel `list_pemakai_kontrasepsi`
--

CREATE TABLE `list_pemakai_kontrasepsi` (
  `id_list` int(25) NOT NULL,
  `id_propinsi` int(25) NOT NULL,
  `id_kontrasepsi` int(25) NOT NULL,
  `jumlah_pemakai` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `list_propinsi`
--

CREATE TABLE `list_propinsi` (
  `id_propinsi` int(25) NOT NULL,
  `nama_propinsi` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `list_propinsi`
--

INSERT INTO `list_propinsi` (`id_propinsi`, `nama_propinsi`) VALUES
(1, 'Aceh'),
(2, 'Sumatera Utara'),
(3, 'Sumatera Barat'),
(4, 'Riau'),
(5, 'Jambi'),
(6, 'Bangka Belitung'),
(7, 'Sumatera Selatan'),
(8, 'Lampung');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `list_kontrasepsi`
--
ALTER TABLE `list_kontrasepsi`
  ADD PRIMARY KEY (`id_kontrasepsi`);

--
-- Indeks untuk tabel `list_pemakai_kontrasepsi`
--
ALTER TABLE `list_pemakai_kontrasepsi`
  ADD PRIMARY KEY (`id_list`);

--
-- Indeks untuk tabel `list_propinsi`
--
ALTER TABLE `list_propinsi`
  ADD PRIMARY KEY (`id_propinsi`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `list_kontrasepsi`
--
ALTER TABLE `list_kontrasepsi`
  MODIFY `id_kontrasepsi` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `list_pemakai_kontrasepsi`
--
ALTER TABLE `list_pemakai_kontrasepsi`
  MODIFY `id_list` int(25) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `list_propinsi`
--
ALTER TABLE `list_propinsi`
  MODIFY `id_propinsi` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
