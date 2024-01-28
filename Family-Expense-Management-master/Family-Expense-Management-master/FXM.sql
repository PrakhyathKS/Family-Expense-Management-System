-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: familyexpensemanagement
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `expenses`
--

DROP TABLE IF EXISTS `expenses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expenses` (
  `EID` int NOT NULL AUTO_INCREMENT,
  `User` varchar(20) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Amount` float NOT NULL,
  `Category` varchar(45) NOT NULL,
  `Date` date NOT NULL,
  `Mode` varchar(45) NOT NULL,
  PRIMARY KEY (`EID`),
  KEY `FKExpense_idx` (`User`),
  CONSTRAINT `FKExpense` FOREIGN KEY (`User`) REFERENCES `members` (`USERNAME`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expenses`
--

LOCK TABLES `expenses` WRITE;
/*!40000 ALTER TABLE `expenses` DISABLE KEYS */;
INSERT INTO `expenses` VALUES (2,'Ram1111','Hotel Janata delux',1500.25,'Food ','2023-01-24','upi'),(3,'Ram1111','Bookmark',250,'Education','2023-01-08','Cash'),(5,'Uma453','Durga Store',300,'Housing','2023-01-07','Cash'),(6,'Uma453','Ideal Ice Cream',450,'Food ','2023-02-15','Cash'),(10,'Remo213','hkjk',100,'Transportation','2006-01-01','upi'),(11,'Ram1111','om',420.69,'Debt payments','2002-09-15','cash');
/*!40000 ALTER TABLE `expenses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goals`
--

DROP TABLE IF EXISTS `goals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goals` (
  `GID` int NOT NULL AUTO_INCREMENT,
  `User` varchar(45) NOT NULL,
  `Goal` varchar(50) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  PRIMARY KEY (`GID`),
  KEY `FKGoals_idx` (`User`),
  CONSTRAINT `FKGoals` FOREIGN KEY (`User`) REFERENCES `members` (`USERNAME`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goals`
--

LOCK TABLES `goals` WRITE;
/*!40000 ALTER TABLE `goals` DISABLE KEYS */;
INSERT INTO `goals` VALUES (1,'Ram1111','Save money to buy a car','2023-01-01','2023-06-01'),(4,'Remo213','Buy phone','2003-01-01','2005-01-01');
/*!40000 ALTER TABLE `goals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incomes`
--

DROP TABLE IF EXISTS `incomes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `incomes` (
  `IID` int NOT NULL AUTO_INCREMENT,
  `User` varchar(45) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Amount` float NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`IID`),
  KEY `FKIncomes_idx` (`User`),
  CONSTRAINT `FKIncomes` FOREIGN KEY (`User`) REFERENCES `members` (`USERNAME`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incomes`
--

LOCK TABLES `incomes` WRITE;
/*!40000 ALTER TABLE `incomes` DISABLE KEYS */;
INSERT INTO `incomes` VALUES (1,'Ram1111','Monthly',45000,'2003-01-01'),(7,'Remo213','Monthly ',52000,'2003-01-01'),(10,'Ram1111','rent',6000,'2023-01-25');
/*!40000 ALTER TABLE `incomes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loans`
--

DROP TABLE IF EXISTS `loans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loans` (
  `LID` int NOT NULL AUTO_INCREMENT,
  `User` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Category` varchar(45) NOT NULL,
  `Amount` varchar(45) NOT NULL,
  `Date` date NOT NULL,
  `Interest` float NOT NULL,
  `LoanPeriod` int NOT NULL,
  PRIMARY KEY (`LID`),
  KEY `FKLoan_idx` (`User`),
  CONSTRAINT `FKLoan` FOREIGN KEY (`User`) REFERENCES `members` (`USERNAME`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loans`
--

LOCK TABLES `loans` WRITE;
/*!40000 ALTER TABLE `loans` DISABLE KEYS */;
INSERT INTO `loans` VALUES (1,'Ram1111','Metal Wiring','House','70000','2023-01-15',7,9),(3,'Ram1111','Estilo Car','Vehicle','300000','2023-02-20',7,5),(7,'Remo213','Kotak','House','100000','2003-01-01',8,15),(8,'Ram1111','house loan','house','700000','2023-01-23',8,7);
/*!40000 ALTER TABLE `loans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `USERNAME` varchar(30) NOT NULL,
  `NAME` varchar(30) NOT NULL,
  `AGE` int NOT NULL DEFAULT '0',
  `DOB` date NOT NULL,
  `GENDER` char(6) NOT NULL,
  `OCCUPATION` varchar(15) NOT NULL,
  `RELATION` varchar(15) NOT NULL,
  `PW` varchar(45) NOT NULL,
  PRIMARY KEY (`USERNAME`),
  CONSTRAINT `AGE_CONSTRAINT` CHECK ((`age` >= 12)),
  CONSTRAINT `PASSWORD_CONSTRAINT` CHECK ((length(`PW`) > 5))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES ('Nik123','Nikki R B',18,'2011-01-01','female','Student','daughter','Sam234'),('Rak400','Rakesh R B',22,'2011-01-01','MALE','dentist','Son','Sam234'),('Ram1111','Ramesh H',12,'2011-01-04','MALE','engineer','HEAD','Sam234'),('Remo213','Remo B',18,'2005-01-02','MALE','Student','Son','Hello1234'),('Shanmay1121','Shanmay',18,'2005-01-01','F','homemaker','daughter','4122122'),('Uma453','Uma Ramesh',40,'2011-01-01','female','home maker','wife','111111111');
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `members_BEFORE_INSERT` BEFORE INSERT ON `members` FOR EACH ROW BEGIN
	set new.age = timestampdiff(year,new.dob,curdate());
    IF NOT NEW.username REGEXP '^[a-zA-Z]+[0-9]+' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Username must with letters followed by numbers!';
    END IF;
        IF NOT NEW.gender REGEXP '(Male|Female|M|F|FEMALE|MALE|female|male)' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Gender must be in the format Male|Female|M|F|FEMALE|MALE|female|male';
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `members_BEFORE_UPDATE` BEFORE UPDATE ON `members` FOR EACH ROW BEGIN
	set new.age = timestampdiff(year,new.dob,curdate());
    IF NOT NEW.username REGEXP '^[a-zA-Z]+[0-9]+' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Username must with letters followed by numbers!';
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `savings`
--

DROP TABLE IF EXISTS `savings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `savings` (
  `SID` int NOT NULL AUTO_INCREMENT,
  `User` varchar(45) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Amount` float NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`SID`),
  KEY `FKSaving_idx` (`User`),
  CONSTRAINT `FKSaving` FOREIGN KEY (`User`) REFERENCES `members` (`USERNAME`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `savings`
--

LOCK TABLES `savings` WRITE;
/*!40000 ALTER TABLE `savings` DISABLE KEYS */;
INSERT INTO `savings` VALUES (1,'Ram1111','FD',30000,'2023-01-01'),(3,'Remo213','FD',5000,'2003-01-01'),(4,'Ram1111','food',20,'2023-01-23');
/*!40000 ALTER TABLE `savings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'familyexpensemanagement'
--

--
-- Dumping routines for database 'familyexpensemanagement'
--
/*!50003 DROP PROCEDURE IF EXISTS `member_table` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `member_table`()
BEGIN
	select * from members;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-31 21:18:22
