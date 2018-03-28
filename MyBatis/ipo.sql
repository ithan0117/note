/*
SQLyog Community v12.2.4 (64 bit)
MySQL - 5.6.31 : Database - IPO
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`IPO` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `IPO`;

/*Table structure for table `MEMBER` */

DROP TABLE IF EXISTS `MEMBER`;

CREATE TABLE `MEMBER` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACCOUNT` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `NICKNAME` varchar(50) NOT NULL,
  `CREATE_TIME` datetime NOT NULL,
  `PASS` bit(1) NOT NULL,
  `SESSION_ID` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;

/*Data for the table `MEMBER` */

insert  into `MEMBER`(`ID`,`ACCOUNT`,`PASSWORD`,`NICKNAME`,`CREATE_TIME`,`PASS`,`SESSION_ID`) values 
(1,'IPO001@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','聰哥','2016-09-26 14:49:27','','sdfsdfsdagsehtrher'),
(2,'IPO002@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','春哥','2016-09-26 14:50:31','','rjytjrryjytrjyrjyt'),
(3,'IPO003@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','彬哥哥','2016-09-05 14:51:05','',';po;iop;IPO;ip;po;'),
(4,'IPO004@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','語昕','2016-09-26 14:52:42','','nbcvncvbncbvncvnvn'),
(5,'yenyunchao@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','彥雲喵','2016-09-26 14:53:03','\0','qwewqeqwewrewrewrd'),
(6,'IPO006@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','翹課瑋承','2016-09-26 14:54:55','','ruyryuytutyruryyuu'),
(7,'IPO007@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','寰寰','2016-09-26 14:56:16','','nhgnhgnghnghnghnng'),
(8,'imomi329@gmail.com','c6wzvHTmiV3XCwC1n8+05w==','翹課元元','2016-09-26 14:56:59','\0','werwerwerwerwererr'),
(9,'IPO009@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','我愛鎧宏','2016-09-26 14:57:55','','fghfghfghfghfghgfh'),
(10,'j27641662@yahoo.com.tw','Qy0znZedoQCzKqvp5PfQ3A==','Lee','2016-09-26 14:58:21','\0','xcvxcvxcvxcvcxvxcv'),
(11,'IPO011@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','琤琤','2016-09-26 15:00:06','','m,.m,.m,.,m.,m.,m.'),
(12,'IPO000@gmail.com','qVp2a3gPoNNZW5Exi4hOng==','管理員','2016-09-26 15:01:44','','l;\'l;\'l;\';l\';l\'l;\''),
(13,'imomi392@gmail.com','c6wzvHTmiV3XCwC1n8+05w==','imomi392','2016-10-03 16:00:26','\0','jkljkljkljkljkljkl'),
(14,'william.lee@finsage.com.tw','/*-+!@#$','Lee','2017-03-04 18:21:06','\0','cm9sZToxCnByb2R1NjA3Nwp9CnJhZGl1cz');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
