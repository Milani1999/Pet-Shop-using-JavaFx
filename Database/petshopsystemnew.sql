-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2022 at 09:36 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petshopsystemnew`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `UserName` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`UserName`, `Password`) VALUES
('Admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Product_ID` varchar(10) NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Price` decimal(10,2) NOT NULL,
  `Pet_Variety` varchar(10) NOT NULL,
  `Product_Type` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Product_ID`, `Product_Name`, `Quantity`, `Price`, `Pet_Variety`, `Product_Type`) VALUES
('AAAA', 'ert', 6, '234.00', 'CAT', 'Food Items'),
('ACACA001', 'Small Cage', 6, '500.00', 'CAT', 'Cage'),
('ACACA002', 'Medium Cage', 3, '1900.00', 'CAT', 'Cage'),
('ACACA003', 'Large Cage', 1, '3400.00', 'CAT', 'Cage'),
('ACAFC001', 'Small Container', 6, '200.00', 'CAT', 'Food Container'),
('ACAFC002', 'Medium Container', 5, '300.00', 'CAT', 'Food  Container'),
('ACAFC003', 'Large Container', 2, '400.00', 'CAT', 'Food Container'),
('ACAFI001', 'Chicken', 5, '1000.00', 'CAT', 'Food Items'),
('ACAFI002', 'Egg', 10, '50.00', 'CAT', 'Food Items'),
('ACAFI003', 'Peas', 3, '200.00', 'CAT', 'Food Items'),
('ACAFI004', 'Milk', 5, '300.00', 'CAT', 'Food Items'),
('ACATO001', 'Feather Cat Toys', 4, '500.00', 'CAT', 'Toys'),
('ACATO002', 'Mouse Toys', 5, '300.00', 'CAT', 'Toys'),
('ACATO003', 'Ball Tower Cat Fun Toys', 2, '1200.00', 'CAT', 'Toys'),
('ACATO004', 'Cat Ball Toys', 4, '200.00', 'CAT', 'Toys'),
('ACAWC001', 'Small Container', 10, '100.00', 'CAT', 'Water Container'),
('ACAWC002', 'Medium Container', 7, '200.00', 'CAT', 'Water Container'),
('ACAWC003', 'Large Container', 5, '500.00', 'CAT', 'Water Container'),
('ADOCA001', 'Small Cage', 6, '200.00', 'DOG', 'Cage'),
('ADOCA002', 'Medium Cage', 5, '500.00', 'DOG', 'Cage'),
('ADOCA003', 'Large Cage', 2, '1200.00', 'DOG', 'Cage'),
('ADOFC001', 'Small Container', 4, '200.00', 'DOG', 'Food Container'),
('ADOFC002', 'Medium Container', 3, '300.00', 'DOG', 'Food Container'),
('ADOFC003', 'Large Container', 2, '400.00', 'DOG', 'Food Container'),
('ADOFI001', 'Chicken', 5, '1000.00', 'DOG', 'Food Items'),
('ADOFI002', 'Egg', 10, '50.00', 'DOG', 'Food Items'),
('ADOFI003', 'Busicut', 5, '100.00', 'DOG', 'Food Items'),
('ADOFI004', 'Salmon', 4, '200.00', 'DOG', 'Food Items'),
('ADOTO001', 'Chew Toys', 6, '200.00', 'DOG', 'Toys'),
('ADOTO002', 'Fetch Toys', 5, '300.00', 'DOG', 'Toys'),
('ADOTO003', 'Dog Treats', 8, '150.00', 'DOG', 'Toys'),
('ADOTO004', 'Plush Toys', 3, '350.00', 'DOG', 'Toys'),
('ADOWC001', 'Small Container', 5, '200.00', 'DOG', 'Water Container'),
('ADOWC002', 'Medium Container', 3, '300.00', 'DOG', 'Water Container'),
('ADOWC003', 'Large Container', 2, '500.00', 'DOG', 'Water Container'),
('AFICA001', 'Small Size Glass Tank', 5, '1000.00', 'FISH', 'Cage'),
('AFICA002', 'Medium Size Glass Tank', 3, '2000.00', 'FISH', 'Cage'),
('AFICA003', 'Large Size Glass Tank', 1, '5000.00', 'FISH', 'Cage'),
('AFIFC001', 'Small Container', 10, '100.00', 'FISH', 'Food Container'),
('AFIFC002', 'Medium Container', 5, '200.00', 'FISH', 'Food Container'),
('AFIFC003', 'Large Container', 2, '500.00', 'FISH', 'Food Container'),
('AFIFI002', 'Pallet Fish Foods', 4, '300.00', 'FISH', 'Food Items'),
('AFIFI003', 'Aquatic Plants', 5, '500.00', 'FISH', 'Food Items'),
('AFIFI004', 'Algae', 3, '350.00', 'FISH', 'Food Items'),
('AFITO001', 'Floating Log', 5, '500.00', 'FISH', 'Toys'),
('AFITO002', 'Moss Balls', 0, '200.00', 'FISH', 'Toys'),
('AFITO003', 'Plastic Aquatic Plants', 5, '500.00', 'FISH', 'Toys'),
('AFITO004', 'Leaf Hammock', 4, '350.00', 'FISH', 'Toys'),
('ARACA001', 'Small Cage', 4, '200.00', 'RABBIT', 'Cage'),
('ARACA002', 'Medium Cage', 3, '450.00', 'RABBIT', 'Cage'),
('ARACA003', 'Large Cage', 2, '1000.00', 'RABBIT', 'Cage'),
('ARAFI001', 'Bell Peppers', 5, '200.00', 'RABBIT', 'Food Items'),
('ARAFI002', 'Carrot', 5, '100.00', 'RABBIT', 'Food Items'),
('ARAFI003', 'Fennel', 5, '100.00', 'RABBIT', 'Food Items'),
('ARAFI004', 'Cauliflower Leaf', 4, '200.00', 'RABBIT', 'Food Items'),
('ARATO001', 'Chew Toys', 6, '250.00', 'RABBIT', 'Toys'),
('ARATO002', 'Natural Timothy Grass Cake', 3, '200.00', 'RABBIT', 'Toys'),
('ARATO003', 'Chew Balls', 8, '150.00', 'RABBIT', 'Toys'),
('ARATO004', 'Chew Treats', 4, '350.00', 'RABBIT', 'Toys'),
('ARAWC001', 'Small Container', 4, '100.00', 'RABBIT', 'Water Container'),
('ARAWC002', 'Medium Container', 3, '200.00', 'RABBIT', 'Water Container'),
('ARAWC003', 'Large Container', 2, '400.00', 'RABBIT', 'Water Container'),
('ARIFC001', 'Small Container', 6, '100.00', 'RABBIT', 'Food Container'),
('ARIFC002', 'Medium Container', 5, '300.00', 'RABBIT', 'Food Container'),
('ARIFC003', 'Large Container', 5, '500.00', 'RABBIT', 'Food Container'),
('BCHCA001', 'Small Cage', 5, '500.00', 'CHICKEN', 'Cage'),
('BCHCA002', 'Medium Cage', 3, '1000.00', 'CHICKEN', 'Cage'),
('BCHCA003', 'Large Cage', 2, '2000.00', 'CHICKEN', 'Cage'),
('BCHFC001', 'Small Container', 5, '200.00', 'CHICKEN', 'Food Container'),
('BCHFC002', 'Medium Container', 3, '500.00', 'CHICKEN', 'Food Container'),
('BCHFC003', 'Large Container', 2, '800.00', 'CHICKEN', 'Food Container'),
('BCHFI001', 'Beans', 4, '500.00', 'CHICKEN', 'Food Items'),
('BCHFI002', 'Corn', 7, '500.00', 'CHICKEN', 'Food Items'),
('BCHFI003', 'Leafy Greens', 5, '500.00', 'CHICKEN', 'Food Items'),
('BCHFI004', 'Chicken Feeds', 4, '400.00', 'CHICKEN', 'Food Items'),
('BCHTO001', 'Vegetable Hanging Feeder Toys', 3, '1000.00', 'CHICKEN', 'Toys'),
('BCHTO002', 'Chicken Swing Toys', 5, '300.00', 'CHICKEN', 'Toys'),
('BCHTO003', 'Wood Coop Pecking Toys', 2, '1200.00', 'CHICKEN', 'Toys'),
('BCHTO004', 'Chicken Mirror Toys', 3, '350.00', 'CHICKEN', 'Toys'),
('BCHWC001', 'Small Container', 5, '200.00', 'CHICKEN', 'Water Container'),
('BCHWC002', 'Medium Container', 3, '500.00', 'CHICKEN', 'Water Container'),
('BCHWC003', 'Large Container', 5, '1000.00', 'CHICKEN', 'Water Container'),
('BLOCA001', 'Small Cage', 6, '500.00', 'LOVE BIRDS', 'Cage'),
('BLOCA002', 'Medium Cage', 3, '1000.00', 'LOVE BIRDS', 'Cage'),
('BLOCA003', 'Large Cage', 1, '2000.00', 'LOVE BIRDS', 'Cage'),
('BLOFC001', 'Small Container', 5, '200.00', 'LOVE BIRDS', 'Food Container'),
('BLOFC002', 'Medium Container', 3, '500.00', 'LOVE BIRDS', 'Food Container'),
('BLOFC003', 'Large Container', 2, '1200.00', 'LOVE BIRDS', 'Food Container'),
('BLOFI001', 'Wheat', 6, '500.00', 'LOVE BIRDS', 'Food Items'),
('BLOFI002', 'Peas', 4, '300.00', 'LOVE BIRDS', 'Food Items'),
('BLOFI003', 'Papaya', 5, '400.00', 'LOVE BIRDS', 'Food Items'),
('BLOFI004', 'Corn', 4, '500.00', 'LOVE BIRDS', 'Food Items'),
('BLOTO001', 'Plastic Pipe Bells', 5, '300.00', 'LOVE BIRDS', 'Toys'),
('BLOTO002', 'Swing And Mirror Toys', 3, '500.00', 'LOVE BIRDS', 'Toys'),
('BLOTO003', 'Block Chewing Toys', 2, '1200.00', 'LOVE BIRDS', 'Toys'),
('BLOTO004', 'Foraging Bird Toys', 6, '800.00', 'LOVE BIRDS', 'Toys'),
('BLOWC001', 'Small Container', 5, '200.00', 'LOVE BIRDS', 'Water Container'),
('BLOWC002', 'Medium Container', 3, '800.00', 'LOVE BIRDS', 'Water Container'),
('BLOWC003', 'Large Container', 2, '1200.00', 'LOVE BIRDS', 'Water Container'),
('BPACA001', 'Small Cage', 6, '250.00', 'PARROT', 'Cage'),
('BPACA002', 'Medium Cage', 4, '500.00', 'PARROT', 'Cage'),
('BPACA003', 'Large Cage', 2, '1200.00', 'PARROT', 'Cage'),
('BPAFC001', 'Small Container', 10, '300.00', 'PARROT', 'Food Container'),
('BPAFC002', 'Medium Container', 5, '500.00', 'PARROT', 'Food Container'),
('BPAFC003', 'Large Container', 3, '1000.00', 'PARROT', 'Food Container'),
('BPAFI001', 'Mango', 20, '50.00', 'PARROT', 'Food Items'),
('BPAFI002', 'Nuts', 5, '300.00', 'PARROT', 'Food Items'),
('BPAFI003', 'Banana', 10, '100.00', 'PARROT', 'Food Items'),
('BPAFI004', 'Pasta', 4, '500.00', 'PARROT', 'Food Items'),
('BPATO001', 'Climb Toys', 10, '250.00', 'PARROT', 'Toys'),
('BPATO002', 'Naturals Rope Ladder Bird Toy', 3, '500.00', 'PARROT', 'Toys'),
('BPATO003', 'Parrot Chew Toy Foraging Blocks', 5, '400.00', 'PARROT', 'Toys'),
('BPATO004', 'Wooden Blocks Slats Toy', 3, '500.00', 'PARROT', 'Toys'),
('BPAWC001', 'Small Container', 5, '300.00', 'PARROT', 'Water Container'),
('BPAWC002', 'Medium Container', 5, '500.00', 'PARROT', 'Water Container'),
('BPAWC003', 'Large Container', 4, '800.00', 'PARROT', 'Water Container'),
('BPICA001', 'Small Cage', 5, '200.00', 'PIGEON', 'Cage'),
('BPICA002', 'Medium Cage', 3, '500.00', 'PIGEON', 'Cage'),
('BPICA003', 'Large Cage', 2, '1200.00', 'PIGEON', 'Cage'),
('BPIFC001', 'Small Container', 5, '200.00', 'PIGEON', 'Food Container'),
('BPIFC002', 'Medium Container', 3, '500.00', 'PIGEON', 'Food Container'),
('BPIFC003', 'Large Container', 2, '600.00', 'PIGEON', 'Food Container'),
('BPIFI001', 'Oat Groats', 4, '500.00', 'PIGEON', 'Food Items'),
('BPIFI002', 'Peas', 5, '500.00', 'PIGEON', 'Food Items'),
('BPIFI003', 'Corn', 10, '500.00', 'PIGEON', 'Food Items'),
('BPIFI004', 'Milo', 4, '350.00', 'PIGEON', 'Food Items'),
('BPITO001', 'Bird Swings', 5, '200.00', 'PIGEON', 'Toys'),
('BPITO002', 'Open Weave Balls', 3, '500.00', 'PIGEON', 'Toys'),
('BPITO003', 'Mirror Toys', 2, '150.00', 'PIGEON', 'Toys'),
('BPITO004', 'Climbing Frames', 4, '350.00', 'PIGEON', 'Toys'),
('BPIWC001', 'Small Container', 5, '200.00', 'PIGEON', 'Water Container'),
('BPIWC002', 'Medium Container', 3, '500.00', 'PIGEON', 'Water Container'),
('BPIWC003', 'Large Container', 2, '600.00', 'PIGEON', 'Water Container'),
('XXXX', 'assd', 2, '45.00', 'CAT', 'Food Container');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Product_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
