-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2018 at 10:00 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_clocking_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `staff_acct_bal`
--

CREATE TABLE `staff_acct_bal` (
  `balance_id` int(11) NOT NULL,
  `staff_id` varchar(40) NOT NULL,
  `balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_acct_info`
--

CREATE TABLE `staff_acct_info` (
  `account_id` int(11) NOT NULL,
  `staff_id` varchar(100) NOT NULL,
  `acct_numb` varchar(40) NOT NULL,
  `bank_name` varchar(100) NOT NULL,
  `sort_code` varchar(40) NOT NULL,
  `staff_hourly_pay` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_acct_trans`
--

CREATE TABLE `staff_acct_trans` (
  `trans_id` int(11) NOT NULL,
  `staff_id` int(11) NOT NULL,
  `amount_in` double NOT NULL,
  `amount_out` double NOT NULL,
  `balance` double NOT NULL,
  `description` text NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_bio_info`
--

CREATE TABLE `staff_bio_info` (
  `bio_id` int(11) NOT NULL,
  `staff_id` varchar(40) NOT NULL,
  `bio` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_contact_info`
--

CREATE TABLE `staff_contact_info` (
  `contact_id` int(11) NOT NULL,
  `staff_id` varchar(100) NOT NULL,
  `house_no` varchar(11) NOT NULL,
  `street_name` varchar(200) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `mobile` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_education_info`
--

CREATE TABLE `staff_education_info` (
  `education_id` int(11) NOT NULL,
  `certification` varchar(100) NOT NULL,
  `staff_id` varchar(100) NOT NULL,
  `year` year(4) NOT NULL,
  `sch_attended` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `course_of_study` varchar(100) NOT NULL,
  `post_grad_certs` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_kin_info`
--

CREATE TABLE `staff_kin_info` (
  `kin_id` int(11) NOT NULL,
  `staff_id` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `mname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `mobile` varchar(100) NOT NULL,
  `house_no` varchar(100) NOT NULL,
  `street_name` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_pers_info`
--

CREATE TABLE `staff_pers_info` (
  `info_id` int(11) NOT NULL,
  `staff_id` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `mname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `mstatus` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `religion` varchar(100) NOT NULL,
  `passport` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff_sign_in`
--

CREATE TABLE `staff_sign_in` (
  `sign_in_id` int(11) NOT NULL,
  `staff_id` int(11) NOT NULL,
  `sign_in_time` datetime NOT NULL,
  `sign_out_time` datetime NOT NULL,
  `in_time` varchar(40) NOT NULL,
  `out_time` varchar(40) NOT NULL,
  `status` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `surname` varchar(200) NOT NULL,
  `firstname` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `userType` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`surname`, `firstname`, `username`, `password`, `userType`) VALUES
('Ibrahim', 'Nuhu', 'nuhu', '2017c111f295026261f19726bf7f', 'ADMIN'),
('Ibrahim', 'Nuhu', 'nuhu1', '2017c111f295026261f19726bf7f', 'TECH USER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff_acct_bal`
--
ALTER TABLE `staff_acct_bal`
  ADD PRIMARY KEY (`balance_id`);

--
-- Indexes for table `staff_acct_info`
--
ALTER TABLE `staff_acct_info`
  ADD PRIMARY KEY (`account_id`);

--
-- Indexes for table `staff_acct_trans`
--
ALTER TABLE `staff_acct_trans`
  ADD PRIMARY KEY (`trans_id`);

--
-- Indexes for table `staff_bio_info`
--
ALTER TABLE `staff_bio_info`
  ADD PRIMARY KEY (`bio_id`);

--
-- Indexes for table `staff_contact_info`
--
ALTER TABLE `staff_contact_info`
  ADD PRIMARY KEY (`contact_id`);

--
-- Indexes for table `staff_education_info`
--
ALTER TABLE `staff_education_info`
  ADD PRIMARY KEY (`education_id`);

--
-- Indexes for table `staff_kin_info`
--
ALTER TABLE `staff_kin_info`
  ADD PRIMARY KEY (`kin_id`);

--
-- Indexes for table `staff_pers_info`
--
ALTER TABLE `staff_pers_info`
  ADD PRIMARY KEY (`info_id`);

--
-- Indexes for table `staff_sign_in`
--
ALTER TABLE `staff_sign_in`
  ADD PRIMARY KEY (`sign_in_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff_acct_bal`
--
ALTER TABLE `staff_acct_bal`
  MODIFY `balance_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `staff_acct_info`
--
ALTER TABLE `staff_acct_info`
  MODIFY `account_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `staff_acct_trans`
--
ALTER TABLE `staff_acct_trans`
  MODIFY `trans_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `staff_bio_info`
--
ALTER TABLE `staff_bio_info`
  MODIFY `bio_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `staff_contact_info`
--
ALTER TABLE `staff_contact_info`
  MODIFY `contact_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `staff_education_info`
--
ALTER TABLE `staff_education_info`
  MODIFY `education_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `staff_kin_info`
--
ALTER TABLE `staff_kin_info`
  MODIFY `kin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `staff_pers_info`
--
ALTER TABLE `staff_pers_info`
  MODIFY `info_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=210013;
--
-- AUTO_INCREMENT for table `staff_sign_in`
--
ALTER TABLE `staff_sign_in`
  MODIFY `sign_in_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
