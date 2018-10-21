/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.6.33 : Database - imooc
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`imooc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `imooc`;

/*Table structure for table `t_course` */

DROP TABLE IF EXISTS `t_course`;

CREATE TABLE `t_course` (
  `cid` int(20) NOT NULL AUTO_INCREMENT COMMENT '课程ID',
  `cname` varchar(100) NOT NULL COMMENT '课程名称',
  `cprice` float(10,2) NOT NULL COMMENT '课程价格',
  `cintroduce` varchar(100) NOT NULL COMMENT '课程介绍',
  `cstatus` varchar(1) NOT NULL COMMENT '价格状态',
  `cpicture` varchar(200) NOT NULL COMMENT '课程图片',
  `ctime` datetime NOT NULL COMMENT '创建时间',
  `checkstatus` varchar(1) NOT NULL COMMENT '审核状态',
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_course` */

LOCK TABLES `t_course` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_course_comment` */

DROP TABLE IF EXISTS `t_course_comment`;

CREATE TABLE `t_course_comment` (
  `cc_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '课程评价ID',
  `cid` int(20) NOT NULL COMMENT '课程ID',
  `rid` int(20) NOT NULL COMMENT '角色ID',
  `cc_comment` varchar(100) NOT NULL COMMENT '评价内容',
  `cc_time` datetime NOT NULL COMMENT '评价时间',
  PRIMARY KEY (`cc_id`),
  CONSTRAINT `course_comment_key1` FOREIGN KEY (`cid`) REFERENCES `t_course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `course_comment_key2` FOREIGN KEY (`rid`) REFERENCES `t_role` (`rid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_course_comment` */

LOCK TABLES `t_course_comment` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_course_big_type` */

DROP TABLE IF EXISTS `t_course_big_type`;

CREATE TABLE `t_course_big_type` (
  `cbt_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '大类ID',
  `cbt_type` varchar(50) NOT NULL COMMENT '大类类型',
  PRIMARY KEY (`cbt_id`),
  UNIQUE KEY `cbt_type` (`cbt_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_course_big_type` */

LOCK TABLES `t_course_big_type` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_course_small_type` */

DROP TABLE IF EXISTS `t_course_small_type`;

CREATE TABLE `t_course_small_type` (
  `cst_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '小类ID',
  `cst_type` varchar(50) NOT NULL COMMENT '小类类型',
  `cbt_id` int(20) NOT NULL COMMENT '大类ID',
  PRIMARY KEY (`cst_id`),
  UNIQUE KEY `cst_type__cbt_id` (`cst_type`,`cbt_id`),
  CONSTRAINT `course_small_type_key` FOREIGN KEY (`cbt_id`) REFERENCES `t_course_big_type` (`cbt_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_course_small_type` */

LOCK TABLES `t_course_small_type` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_type_course` */

DROP TABLE IF EXISTS `t_type_course`;

CREATE TABLE `t_type_course` (
  `tc_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '小类课程ID',
  `cst_id` int(20) NOT NULL COMMENT '小类ID',
  `cid` int(20) NOT NULL COMMENT '课程ID',
  PRIMARY KEY (`tc_id`),
  UNIQUE KEY `cst_id__cid` (`cst_id`,`cid`),
  CONSTRAINT `t_type_course_key1` FOREIGN KEY (`cst_id`) REFERENCES `t_course_small_type` (`cst_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `t_type_course_key2` FOREIGN KEY (`cid`) REFERENCES `t_course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_type_course` */

LOCK TABLES `t_type_course` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_course_video` */

DROP TABLE IF EXISTS `t_course_video`;

CREATE TABLE `t_course_video` (
  `cv_id` int(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `cid` int(20) NOT NULL COMMENT '课程ID',
  `cv_sortid` int(20) NOT NULL COMMENT '目录排序ID',
  `cv_name` varchar(100) NOT NULL COMMENT '目录名称',
  `cv_path` varchar(100) NOT NULL COMMENT '目录视频路径',
  PRIMARY KEY (`cv_id`),
  UNIQUE KEY `cv_path` (`cv_path`),
  CONSTRAINT `course_video_key` FOREIGN KEY (`cid`) REFERENCES `t_course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_course_video` */

LOCK TABLES `t_course_video` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_role` */

DROP TABLE IF EXISTS `t_role`;

CREATE TABLE `t_role` (
  `rid` int(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `rname` varchar(10) DEFAULT '游客' COMMENT '角色名字',
  `rphone` varchar(20) NOT NULL COMMENT '角色手机',
  `rpassword` varchar(50) NOT NULL COMMENT '角色密码',
  `rmail` varchar(30) DEFAULT NULL COMMENT '角色邮箱',
  `rintroduce` varchar(100) DEFAULT '无' COMMENT '角色签名',
  `rpicture` varchar(200) DEFAULT NULL COMMENT '头像路径',
  `rpoint` int(100) DEFAULT '10' COMMENT '角色积分',
  `rtype` int(1) NOT NULL COMMENT '角色类型',
  PRIMARY KEY (`rid`),
  UNIQUE KEY `rphone` (`rphone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_role` */

LOCK TABLES `t_role` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_role_course` */

DROP TABLE IF EXISTS `t_role_course`;

CREATE TABLE `t_role_course` (
  `rc_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '角色课程ID',
  `rid` int(20) NOT NULL COMMENT '角色ID',
  `cid` int(20) NOT NULL COMMENT '课程ID',
  `uc_status` int(1) NOT NULL COMMENT '收藏/学习/属于',
  PRIMARY KEY (`rc_id`),
  UNIQUE KEY `rid__cid` (`rid`,`cid`),
  CONSTRAINT `role_course_key1` FOREIGN KEY (`cid`) REFERENCES `t_course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `role_course_key2` FOREIGN KEY (`rid`) REFERENCES `t_role` (`rid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_role_course` */

LOCK TABLES `t_role_course` WRITE;

UNLOCK TABLES;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `oid` int(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `rid` int(20) NOT NULL COMMENT '角色ID',
  `cid` int(20) NOT NULL COMMENT '课程ID',
  `onumber` varchar(20) NOT NULL COMMENT '订单编号',
  `otime` datetime NOT NULL COMMENT '订单时间',
  `ostatus` varchar(1) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`oid`),
  UNIQUE KEY `onumber` (`onumber`),
  CONSTRAINT `order_key1` FOREIGN KEY (`cid`) REFERENCES `t_course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_key2` FOREIGN KEY (`rid`) REFERENCES `t_role` (`rid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_order` */

LOCK TABLES `t_order` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
