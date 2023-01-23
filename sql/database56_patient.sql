-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: database56
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `idPatient` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `num_cin` varchar(8) DEFAULT NULL,
  `date_naissance` varchar(45) DEFAULT NULL,
  `sexe` varchar(45) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `idmedecin` int DEFAULT NULL,
  PRIMARY KEY (`idPatient`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'salim','amri','14448747','2022-04-29','Homme','1747787582','',1),(2,'ahmed','benchehed','14484747','2022-04-29','Homme','1747582','',1),(3,'khadija','jaoua','14141215','2022-04-29','Homme','14141414','',1),(5,'mounir','bensalah','15181719','2022-04-29','Homme','7589632',NULL,1),(6,'fatma','benfraj','48525655','2022-04-29','Femme','8892',NULL,2),(7,'salha','ayedi','19293815','2022-04-29','Homme','2859385','',2),(8,'nouri','chitwi','17717175','2022-04-29','Homme','65555','',2),(9,'youssef','khmiri','1629385','2022-04-29','Homme','11151472','',2),(15,'nour','mtibaa','15242855','19-28-2001','Homme','2981848','',1),(16,'ali','jandoubi','14158587','29-52-248','Homme','152428','',1),(17,'wahbi','saiiidiii','21351319','11-12-2001','Homme','9871542','jhglgklgjrekgjerkgle',3),(18,'raed','choudi','82959569','11-12-2001','Homme','2981848',NULL,3),(19,'mounir','jandoubi','15242855','11-12-2001','Homme','2981848',NULL,3),(20,'nouri','ayedi','15242855','11-12-2001','Homme','2981848',NULL,3),(21,'ali','benchehed','15242855','11-12-2001','Homme','2981848',NULL,3),(22,'ahmed','jaoua','15242855','11-12-2001','Homme','2981848',NULL,3);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-08 17:24:20
