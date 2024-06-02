-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2024 at 12:05 PM
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
-- Database: `l_i_m_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `auctionsitems`
--

CREATE TABLE `auctionsitems` (
  `auction_number` int(11) NOT NULL,
  `item_number` int(11) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `serial_number` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `auction_date` date NOT NULL,
  `hod_approval` tinyint(1) NOT NULL,
  `auction_minimum_price` int(11) NOT NULL,
  `total_min_auction_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `auctionsitems`
--

INSERT INTO `auctionsitems` (`auction_number`, `item_number`, `item_name`, `brand`, `serial_number`, `qty`, `auction_date`, `hod_approval`, `auction_minimum_price`, `total_min_auction_price`) VALUES
(1, 2, 'Monitor', 'HP', '2036DF', 1, '2024-05-18', 1, 8000, 8000),
(2, 4, 'Keyboard', 'MIKUSO', 'KB-001U', 2, '2024-05-18', 1, 2000, 4000),
(3, 10, 'UPS', 'DELL', '20D-52', 2, '2024-05-18', 1, 5000, 10000),
(4, 9, 'Digital camera ', 'HP', 'DRGN21', 1, '2024-05-18', 1, 2000, 2000),
(6, 9, 'Digital camera ', 'HP', 'DRGN21', 1, '2024-05-19', 1, 1000, 1000),
(7, 9, 'Digital camera ', 'HP', 'DRGN21', 1, '2024-05-21', 1, 1000, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `donateditems`
--

CREATE TABLE `donateditems` (
  `item_number` int(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `category` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `serial_number` varchar(30) NOT NULL,
  `qty` int(10) NOT NULL,
  `receved_date` date NOT NULL,
  `receved_by` varchar(20) NOT NULL,
  `location` varchar(20) NOT NULL,
  `note` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `donateditems`
--

INSERT INTO `donateditems` (`item_number`, `item_name`, `category`, `brand`, `serial_number`, `qty`, `receved_date`, `receved_by`, `location`, `note`) VALUES
(1, 'Keyboard', 'Computer parts', 'MIKUSO', 'MS1028', 20, '2024-04-01', 'ABC, pvt', 'LAB - 01', 'Brand New'),
(2, 'Chairs', 'Furniture', 'DAMRO', '2024DK', 6, '2024-04-02', 'DAMRO, pvt', 'LAB - 02', 'Brand New'),
(3, 'Mouse', 'Computer parts', 'HAVIT', 'MS1029', 12, '2024-05-14', 'ABC, pvt', 'LAB - 03', 'Brand New'),
(4, 'Monitor', 'Computer parts', 'DELL', 'MI2012', 20, '2024-05-16', 'ABC, pvt', 'LAB - 02', 'Brand New'),
(5, 'Computer Table', 'Furniture', 'DAMRO', '20D-R', 10, '2024-05-17', 'DAMRO, pvt', 'LAB - 03', 'Brand New'),
(6, 'Keyboard', 'Computer parts', 'DELL', 'MD109', 6, '2024-05-17', 'ABC, pvt', 'LAB - 02', 'Brand New'),
(7, 'Speekers', 'Electronic Parts', 'ACER', 'SR-20', 10, '2024-05-17', 'ARK, pvt', 'LAB - 02', 'Brand New'),
(8, 'Web cam', 'Electronic Parts', 'HP', 'WE1120', 10, '2024-05-17', 'ABC, pvt', 'LAB - 02', 'Brand New'),
(9, 'UPS', 'Computer parts', 'HP', 'UI1020', 10, '2024-05-18', 'ABC, pvt', 'LAB - 02', 'Brand New');

-- --------------------------------------------------------

--
-- Table structure for table `maininventory`
--

CREATE TABLE `maininventory` (
  `item_number` int(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `category` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `serial_number` varchar(30) NOT NULL,
  `qty` int(10) NOT NULL,
  `receved_date` date NOT NULL,
  `receved_by` varchar(20) NOT NULL,
  `location` varchar(20) NOT NULL,
  `note` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `maininventory`
--

INSERT INTO `maininventory` (`item_number`, `item_name`, `category`, `brand`, `serial_number`, `qty`, `receved_date`, `receved_by`, `location`, `note`) VALUES
(1, 'Mouse', 'Computer parts', 'HAVIT', 'MS1026', 12, '2024-04-01', 'ABC, pvt', 'LAB - 01', 'Brand New'),
(2, 'Monitor', 'Computer parts', 'HP', '2036DF', 12, '2024-04-01', 'ABC, pvt', 'LAB - 01', 'Brand New'),
(3, 'Chairs', 'Furniture', 'DAMRO', 'LB3011', 14, '2024-04-03', 'DAMRO, pvt', 'LAB - 01', 'Brand New'),
(4, 'Keyboard', 'Computer parts', 'MIKUSO', 'KB-001U', 12, '2024-05-01', 'ABC, pvt', 'LAB - 02', 'Brand New'),
(5, 'Monitor', 'Computer parts', 'DELL', 'HI203-D', 7, '2024-05-12', 'ABC, pvt', 'LAB - 02', 'Brand New'),
(6, 'Server', 'Networking equipment', 'HP', '20A-D-33', 2, '2024-05-13', 'ABD, pvt', 'LAB - 03', 'Brand New'),
(8, 'Scanner', 'Electronic Parts', 'CANON', 'D23-H', 5, '2024-05-14', 'ABC, pvt', 'LAB - 03', 'Brand New'),
(9, 'Digital camera ', 'Electronic Parts', 'HP', 'DRGN21', 10, '2024-05-15', 'ABC, pvt', 'LAB - 04', 'Brand New'),
(10, 'UPS', 'Computer parts', 'DELL', '20D-52', 20, '2024-05-15', 'ABC, pvt', 'LAB - 04', 'Brand New'),
(11, 'Monitor', 'Computer parts', 'ACER', 'HAD-R-T-20', 40, '2024-05-16', 'ART, pvt', 'LAB - 04', 'Brand New'),
(12, 'Computer Table', 'Furniture', 'DAMRO', '420RR', 8, '2024-05-16', 'DAMRO, pvt', 'LAB - 02', 'Brand New'),
(13, 'Spekers', 'Electronic Parts', 'DELL', 'DF11D', 4, '2024-05-17', 'AED, pvt', 'LAB - 02', 'Brand New');

-- --------------------------------------------------------

--
-- Table structure for table `repairitems`
--

CREATE TABLE `repairitems` (
  `repair_number` int(11) NOT NULL,
  `item_number` int(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `serial_number` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `reason` varchar(50) NOT NULL,
  `repair_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `repairitems`
--

INSERT INTO `repairitems` (`repair_number`, `item_number`, `item_name`, `brand`, `serial_number`, `quantity`, `reason`, `repair_date`) VALUES
(1, 1, 'Mouse', 'HAVIT', 'MS1026', 2, 'Damaged', '2024-04-28'),
(2, 2, 'Monitor', 'HP', '2036DF', 1, 'Damaged', '2024-04-28'),
(4, 4, 'Keyboard', 'MIKUSO', 'KB-001U', 2, 'Damaged', '2024-05-18'),
(5, 5, 'Monitor', 'DELL', 'HI203-D', 6, 'Damaged', '2024-05-19'),
(6, 9, 'Digital camera ', 'HP', 'DRGN21', 5, 'Not working', '2024-05-19'),
(7, 10, 'UPS', 'DELL', '20D-52', 8, 'Not working', '2024-05-19'),
(8, 12, 'Computer Table', 'DAMRO', '420RR', 2, 'Not working', '2024-05-19'),
(10, 9, 'Digital camera ', 'HP', 'DRGN21', 1, 'Daamged', '2024-05-21');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_password` varchar(15) NOT NULL,
  `user_mobile` int(10) NOT NULL,
  `user_email` varchar(30) NOT NULL,
  `user_type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `user_password`, `user_mobile`, `user_email`, `user_type`) VALUES
(1, 'gayan', 'gayan123', 757886511, 'gayan@gmail.com', 'SuperAdmin'),
(2, 'thusith', 'thusith123', 705886511, 'thusith@gmail.com', 'Admin'),
(3, 'kumara', 'kumara123', 757886412, 'kumar@gmail.com', 'Admin'),
(4, 'sunil', 'sunil123', 756886411, 'suni@gmail.com', 'Admin'),
(6, 'nimal', 'nimal123', 767886411, 'niml@gmail.com', 'Admin'),
(7, 'lahiru', 'lahiru111', 751886523, 'lahiru@gmail.com', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `auctionsitems`
--
ALTER TABLE `auctionsitems`
  ADD PRIMARY KEY (`auction_number`);

--
-- Indexes for table `donateditems`
--
ALTER TABLE `donateditems`
  ADD PRIMARY KEY (`item_number`),
  ADD UNIQUE KEY `serial_number` (`serial_number`);

--
-- Indexes for table `maininventory`
--
ALTER TABLE `maininventory`
  ADD PRIMARY KEY (`item_number`),
  ADD UNIQUE KEY `serial_number` (`serial_number`);

--
-- Indexes for table `repairitems`
--
ALTER TABLE `repairitems`
  ADD PRIMARY KEY (`repair_number`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `auctionsitems`
--
ALTER TABLE `auctionsitems`
  MODIFY `auction_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `donateditems`
--
ALTER TABLE `donateditems`
  MODIFY `item_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `maininventory`
--
ALTER TABLE `maininventory`
  MODIFY `item_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `repairitems`
--
ALTER TABLE `repairitems`
  MODIFY `repair_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
