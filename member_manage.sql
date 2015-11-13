/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50546
Source Host           : localhost:3306
Source Database       : member_manage

Target Server Type    : MYSQL
Target Server Version : 50546
File Encoding         : 65001

Date: 2015-11-13 12:57:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(5) NOT NULL,
  `name` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for consumption
-- ----------------------------
DROP TABLE IF EXISTS `consumption`;
CREATE TABLE `consumption` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `machine_id` int(11) NOT NULL,
  `add_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `fee` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of consumption
-- ----------------------------

-- ----------------------------
-- Table structure for machine
-- ----------------------------
DROP TABLE IF EXISTS `machine`;
CREATE TABLE `machine` (
  `id` int(11) NOT NULL,
  `name` varchar(10) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of machine
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(18) NOT NULL DEFAULT '',
  `phone` char(11) NOT NULL DEFAULT '',
  `password` varchar(16) NOT NULL DEFAULT '',
  `balance` decimal(6,0) NOT NULL DEFAULT '0',
  `id_card` char(18) NOT NULL DEFAULT '' COMMENT '身份证号',
  `add_time` datetime NOT NULL,
  `update_time` datetime NOT NULL COMMENT '上一次登陆时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'youzipi', '15651008685', '111', '11', '32082919931225036', '2015-11-09 13:37:55', '0000-00-00 00:00:00');
INSERT INTO `user` VALUES ('2', 'youzipi', '222', '222', '0', '222', '2015-11-10 20:47:28', '0000-00-00 00:00:00');
INSERT INTO `user` VALUES ('3', '11', '11', '11', '0', '11', '2015-11-10 20:47:44', '0000-00-00 00:00:00');
INSERT INTO `user` VALUES ('4', 'person', '111', '111,111', '0', '111', '2015-11-11 14:22:06', '0000-00-00 00:00:00');
INSERT INTO `user` VALUES ('5', 'test2', '222', '222,222', '0', '222', '2015-11-11 14:26:08', '0000-00-00 00:00:00');
INSERT INTO `user` VALUES ('6', '222', '222', '222,222', '0', '222', '2015-11-11 14:26:15', '0000-00-00 00:00:00');
INSERT INTO `user` VALUES ('7', '通天塔', '111', '111', '0', '111', '2015-11-11 14:49:04', '0000-00-00 00:00:00');
