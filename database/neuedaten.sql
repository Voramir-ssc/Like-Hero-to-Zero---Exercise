-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 04. Jul 2025 um 15:42
-- Server-Version: 10.4.32-MariaDB
-- PHP-Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `likeherotozero`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `neuedaten`
--

CREATE TABLE `neuedaten` (
  `ID` int(11) NOT NULL,
  `ISO` varchar(5) NOT NULL,
  `Jahr` int(11) NOT NULL,
  `Wert` decimal(38,2) DEFAULT NULL,
  `Bemerkung` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `neuedaten`
--

INSERT INTO `neuedaten` (`ID`, `ISO`, `Jahr`, `Wert`, `Bemerkung`) VALUES
(1, 'DEU', 2022, 613.93, 'erhöt von 612.93 auf 613.93');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `neuedaten`
--
ALTER TABLE `neuedaten`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `neuedaten`
--
ALTER TABLE `neuedaten`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
