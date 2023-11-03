-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: bakery
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `cake`
--

DROP TABLE IF EXISTS `cake`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cake` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cake_type` varchar(100) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `weight` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cake`
--

LOCK TABLES `cake` WRITE;
/*!40000 ALTER TABLE `cake` DISABLE KEYS */;
INSERT INTO `cake` VALUES (1,'Rich Plum Cake','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Rich Plum Cake','200','350g'),(2,'Rich Plum Cake','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Rich Plum Cake','280','500g'),(3,'Beverages','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Badham Milk','20','1 bottle'),(4,'Beverages','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Frooty','40','1 bottle'),(5,'Beverages','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Milk Shake Vennila','30','1 bottle'),(6,'Beverages','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Milkshake Butterscotch','40','1 bottle'),(7,'Beverages','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Milkshake Chocolate','30','1 bottle'),(8,'Birthday Cake','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Barbie Doll Cake','1050','11/2 KG'),(9,'Birthday Cake','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Black Forest Cake','325','1/2 KG'),(10,'Birthday Cake','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Butter Cream Cake','1200','1/2 KG'),(11,'Birthday Cake','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Butter Scotch Cake','700','1 KG'),(12,'Birthday Cake','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Milkshake Chocolate','800','1/2 KG'),(13,'Breads','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Bread','30','1 Pkt'),(14,'Breads','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Fruit Bun','40','1 Pkt'),(15,'Breads','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Wheat Bread','20','1 Pkt'),(16,'Chat','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Channa papdi chat','50','1 Plt'),(17,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Masal Puri','50','1 Plt'),(18,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','pav bhaji','50','1 Plt'),(19,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Pel puri','40','1 Plt'),(20,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Rasa Paani Puri','30','1 Plt'),(21,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Sev Puri','40','1 Plt'),(22,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Thayir  papdi chat','50','1 Plt'),(23,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Thayir Puri','50','1 Plt'),(24,'Chat','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Thayir samosa','40','1 Plt'),(25,'Cookies','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','coconut Biscuits','100','1 Pkt'),(26,'Cookies','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Salt Cookies','60','1 Pkt'),(27,'Cookies','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Special Cookies Box','100','1 Pkt'),(28,'Cookies','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Sweet Cookies','60','1 Pkt'),(29,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Black Forest(Butter)','30','1 Pcs'),(30,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Black Forest Pastries','50','1 Pcs'),(31,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Blueberry Cake','60','1 Pcs'),(32,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Choco Truffle Cake','60','1 Pcs'),(33,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Green Apple Pastries','40','1 Pcs'),(34,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Honey Cake','20','1 Pcs'),(35,'Pastries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Kiwi Cake','60','1 Pcs'),(36,'Puffs','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Channa Puffs','20','1 Pcs'),(37,'Puffs','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Dhilpasanth','50','1 Pcs'),(38,'Puffs','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Egg Puffs','20','1 Pcs'),(39,'Puffs','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Mushroom Puffs','25','1 Pcs'),(40,'Puffs','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Veg Puffs','15','1 Pcs'),(41,'Puffs','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Mini Samosa ','15','1 Pcs'),(42,'Rusks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Anul Rusk','60','1 Pkt'),(43,'Rusks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Butter Rusk','60','1 Pkt'),(44,'Rusks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Ooty Rusk','50','1 Pkt'),(45,'Rusks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Wheat Rusk','20','1 Pkt'),(46,'Savouries','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Butter Chev','320','1 KG'),(47,'Savouries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Cashew Mixture ','150','1 Box'),(48,'Savouries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Chettinad Chev','320','1 KG'),(49,'Savouries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Karabonndhi','300','1 KG'),(50,'Savouries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Mixture','280','1 KG'),(51,'Savouries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Murukku','60','1 Pkt'),(52,'Savouries','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Navadhaniyan','320','1 KG'),(53,'Snacks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Jangeri','80','1/4 KG'),(54,'Snacks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Muffins','60','1 Pkt'),(55,'Snacks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Chilli Cheese Taost','60','1 Pcs'),(56,'Snacks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Pizza','60','1 Pcs'),(57,'Snacks','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Sandwiches','45','1 Pcs'),(58,'Sweets','https://www.fnp.com/images/pr/l/v20221205202830/cream-drop-chocolate-cake-half-kg_1.jpg','Apple Rasagula','35','1 Pcs'),(59,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Butter Mysorepak','400','1 KG'),(60,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Dry Gualb Jamun','320','1 KG'),(61,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Fancy Beda','500','1 KG'),(62,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Fruit Halwa','80','1/4 KG'),(63,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Fruit Laddu','460','1 KG'),(64,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Ghee Laddu','350','1 KG'),(65,'Sweets','https://cdn5.vectorstock.com/i/1000x1000/08/14/bakery-bakehouse-logo-or-label-baker-vector-21240814.jpg','Gheer Kadham','30','1 Pcs');
/*!40000 ALTER TABLE `cake` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-03 19:01:11
