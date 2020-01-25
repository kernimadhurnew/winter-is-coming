CREATE DATABASE `got` 

CREATE TABLE `battle_info` (
  `battle_number` varchar(20) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `year` varchar(40) DEFAULT NULL,
  `attacker_king` varchar(45) DEFAULT NULL,
  `defender_king` varchar(45) DEFAULT NULL,
  `attacker_1` varchar(45) DEFAULT NULL,
  `attacker_2` varchar(45) DEFAULT NULL,
  `attacker_3` varchar(45) DEFAULT NULL,
  `attacker_4` varchar(45) DEFAULT NULL,
  `defender_1` varchar(50) DEFAULT NULL,
  `defender_2` varchar(45) DEFAULT NULL,
  `defender_3` varchar(45) DEFAULT NULL,
  `defender_4` varchar(45) DEFAULT NULL,
  `attacker_outcome` varchar(45) DEFAULT NULL,
  `battle_type` varchar(45) DEFAULT NULL,
  `major_death` varchar(40) DEFAULT NULL,
  `major_capture` varchar(40) DEFAULT NULL,
  `attacker_size` varchar(40) DEFAULT NULL,
  `defender_size` varchar(40) DEFAULT NULL,
  `attacker_commander` varchar(200) DEFAULT NULL,
  `defender_commander` varchar(200) DEFAULT NULL,
  `summer` varchar(40) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `note` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`battle_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM got.battle_info;




CREATE TABLE `battle_attacker` (
  `attacker_id` int NOT NULL AUTO_INCREMENT,
  `attacker_king` varchar(45) DEFAULT NULL,
  `attacker_1` varchar(45) DEFAULT NULL,
  `attacker_2` varchar(45) DEFAULT NULL,
  `attacker_3` varchar(45) DEFAULT NULL,
  `attacker_4` varchar(45) DEFAULT NULL,
  `attacker_commander` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`attacker_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `battle_defender` (
  `defender_id` int NOT NULL AUTO_INCREMENT,
  `defender_king` varchar(45) DEFAULT NULL,
  `defender_1` varchar(45) DEFAULT NULL,
  `defender_2` varchar(45) DEFAULT NULL,
  `defender_3` varchar(45) DEFAULT NULL,
  `defender_4` varchar(45) DEFAULT NULL,
  `defender_size` varchar(45) DEFAULT NULL,
  `defender_commander` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`defender_id`)
) ENGINE=InnoDB AUTO_INCREMENT=253 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `battle_details` (
  `battle_number` varchar(10) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `attacker_outcome` varchar(45) DEFAULT NULL,
  `battle_type` varchar(45) DEFAULT NULL,
  `major_death` varchar(45) DEFAULT NULL,
  `major_capture` varchar(45) DEFAULT NULL,
  `battle_detailscol` varchar(45) DEFAULT NULL,
  `summer` varchar(45) DEFAULT NULL,
  `note` varchar(300) DEFAULT NULL,
  `attacker_data` varchar(10) DEFAULT NULL,
  `defender_data` varchar(10) DEFAULT NULL,
  `battle_detailscol1` varchar(45) DEFAULT NULL,
  `battle_areaDetails` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`battle_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `battle_join` (
  `battle_number` int DEFAULT NULL,
  `attacker_id` int DEFAULT NULL,
  `defender_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `battle_location` (
  `battle_areaId` varchar(40) NOT NULL,
  `location` varchar(45) DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`battle_areaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




