/*
Navicat MySQL Data Transfer

Source Server         : lele
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : ajaxcascade

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-04-12 19:16:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '市id',
  `cname` varchar(255) DEFAULT NULL COMMENT '市名字',
  `pid` int(11) DEFAULT NULL COMMENT '外键关联 province的主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '郑州市', '1');
INSERT INTO `city` VALUES ('2', '洛阳市', '1');
INSERT INTO `city` VALUES ('3', '驻马店市', '1');
INSERT INTO `city` VALUES ('4', '温州', '3');
INSERT INTO `city` VALUES ('5', '杭州市', '3');
INSERT INTO `city` VALUES ('6', '长沙市', '2');
INSERT INTO `city` VALUES ('7', '株洲市', '2');
INSERT INTO `city` VALUES ('8', '嘉兴市', '3');
INSERT INTO `city` VALUES ('9', '永州市', '2');
INSERT INTO `city` VALUES ('10', '开封市', '1');

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '省id',
  `name` varchar(255) DEFAULT NULL COMMENT '省名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES ('1', '河南省');
INSERT INTO `province` VALUES ('2', '湖南省');
INSERT INTO `province` VALUES ('3', '浙江省');
