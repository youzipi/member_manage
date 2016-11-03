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

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id`       INT(5)      NOT NULL,
  `name`     VARCHAR(16) NOT NULL,
  `password` VARCHAR(16) NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for consumption
-- ----------------------------
DROP TABLE IF EXISTS `consumption`;
CREATE TABLE `consumption` (
  `id`         INT(11)     NOT NULL,
  `user_id`    INT(11)     NOT NULL,
  `machine_id` INT(11)     NOT NULL,
  `add_time`   DATETIME    NOT NULL,
  `end_time`   DATETIME    NOT NULL,
  `fee`        VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of consumption
-- ----------------------------

-- ----------------------------
-- Table structure for machine
-- ----------------------------
DROP TABLE IF EXISTS `machine`;
CREATE TABLE `machine` (
  `id`     INT(11)     NOT NULL,
  `name`   VARCHAR(10) NOT NULL,
  `status` TINYINT(1)  NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of machine
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`          INT(10)       NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(18)   NOT NULL DEFAULT '',
  `phone`       CHAR(11)      NOT NULL DEFAULT '',
  `password`    VARCHAR(16)   NOT NULL DEFAULT '',
  `balance`     DECIMAL(6, 0) NOT NULL DEFAULT '0',
  `id_card`     CHAR(18)      NOT NULL DEFAULT ''
  COMMENT '身份证号',
  `create_time` DATETIME      NOT NULL DEFAULT NOW()
  COMMENT '注册时间',
  `update_time` DATETIME      NOT NULL DEFAULT NOW()
  COMMENT '上一次登陆时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `marketing`;
CREATE TABLE `marketing` (
  `marketing_id`   INT(11)     NOT NULL AUTO_INCREMENT,
  `marketing_name` VARCHAR(18) NOT NULL DEFAULT '',
  `start_time`     TIMESTAMP   NOT NULL,
  `end_time`       TIMESTAMP   NOT NULL,
  `create_time`    TIMESTAMP   NOT NULL,
  `create_id`      BIGINT(10)  NOT NULL DEFAULT 0,
  `update_time`    TIMESTAMP   NOT NULL,
  `update_id`      BIGINT(10)  NOT NULL DEFAULT 0,
  PRIMARY KEY (`marketing_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `marketing_scope`;
CREATE TABLE `marketing_scope` (
  `marketing_scope_id` BIGINT(20)                NOT NULL       AUTO_INCREMENT,
  `marketing_id`       BIGINT(20)                NOT NULL
  COMMENT '促销ID',
  `scope_id`           BIGINT(20)                NOT NULL
  COMMENT '范围ID',
  `scope_type`         ENUM ('0', '1', '2', '3') NOT NULL
  COMMENT '范围类型=0:全部货品,1:品牌,2:分类,3:货品',
  `create_time`        DATETIME                  NOT NULL       DEFAULT NOW()
  COMMENT '创建时间 ',
  `update_time`        DATETIME                  NOT NULL       DEFAULT NOW()
  COMMENT '修改时间',
  `flag`               ENUM ('0', '1')                          DEFAULT NULL
  COMMENT '标记',
  PRIMARY KEY (`marketing_scope_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '营销范围';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'youzipi', '15651008685', '111', '11', '32082919931225036', NOW(), NOW());
INSERT INTO `user` VALUES (2, 'youzipi', '222', '222', '0', '222', NOW(), NOW());
INSERT INTO `user` VALUES (3, '11', '11', '11', '0', '11', NOW(), NOW());
INSERT INTO `user` VALUES (4, 'person', '111', '111,111', '0', '111', NOW(), NOW());
INSERT INTO `user` VALUES (5, 'test2', '222', '222,222', '0', '222', NOW(), NOW());
INSERT INTO `user` VALUES (6, '222', '222', '222,222', '0', '222', NOW(), NOW());
INSERT INTO `user` VALUES (7, '通天塔', '111', '111', '0', '111', NOW(), NOW());
