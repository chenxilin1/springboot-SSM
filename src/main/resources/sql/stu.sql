/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.0.41-community-nt : Database - java17-8
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`java17-8` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `java17-8`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(10) NOT NULL,
  `content` text,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`content`) values (1,'高大','123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人123849退役军人'),(2,'郭佩奇',''),(3,'郭子文',''),(4,'郝耀威',''),(5,'黎后刚','说的话公司'),(6,'李豪',NULL),(7,'李建文',NULL),(8,'刘洁',NULL),(9,'刘正',NULL),(10,'鲁岩',NULL),(11,'路昌兴',NULL),(12,'吕伟杰',''),(13,'沈旭升','666'),(14,'檀艳敏',NULL),(15,'王佳硕',NULL),(16,'王雨',NULL),(17,'王争',NULL),(18,'王志',NULL),(19,'位昆明',NULL),(20,'徐澳祥',NULL),(21,'杨陈阳',NULL),(22,'杨成亮',NULL),(23,'杨可可',NULL),(24,'张富岭',NULL),(25,'张景会',NULL),(26,'张梦丽',NULL),(27,'赵金辉',NULL),(28,'赵旺超',NULL),(29,'郑涛',NULL),(30,'周俊涛',''),(31,'宋明月',NULL),(32,'李彪',NULL),(33,'袁迎秋',NULL),(34,'张雨荷',NULL),(35,'李国顺',NULL),(36,'王运伟',NULL),(37,'张坤成',NULL),(38,'袁君选',NULL),(39,'宋冰强',NULL),(40,'骈鹏飞',NULL),(41,'刘振宇',NULL),(47,'',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
