CREATE DATABASE `animalshelter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
 
USE animalshelter
 
CREATE TABLE `shelters` (
  `id` int(11) NOT NULL,
  `animal_number` int(11) DEFAULT NULL,
  `home_address` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `work_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;