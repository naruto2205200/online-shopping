#数据库
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for sub_menu
-- ----------------------------
DROP TABLE IF EXISTS `sub_menu`;
CREATE TABLE `sub_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(24) NOT NULL,
  `path` varchar(24) NOT NULL,
  `parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `sub_menu` VALUES ('1', '用户管理', 'users', null);
INSERT INTO `sub_menu` VALUES ('2', '权限管理', 'auth', null);
INSERT INTO `sub_menu` VALUES ('3', '商品管理', 'goods', null);
INSERT INTO `sub_menu` VALUES ('4', '订单管理', 'test1', null);
INSERT INTO `sub_menu` VALUES ('5', '数据统计', 'tongji', null);
INSERT INTO `sub_menu` VALUES ('6', '用户列表', 'users', '1');
INSERT INTO `sub_menu` VALUES ('7', '权限1', 'auth1', '2');
INSERT INTO `sub_menu` VALUES ('8', '商品1', 'goods1', '3');
INSERT INTO `sub_menu` VALUES ('9', '订单1', 'test11', '4');
INSERT INTO `sub_menu` VALUES ('10', '数据1', 'tongji1', '5');

DROP TABLE IF EXISTS `sub_user`;
CREATE TABLE `sub_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(24) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime NOT NULL,
  `mg_state` bit(1) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`,`update_time`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of sub_user
-- ----------------------------
INSERT INTO `sub_user` VALUES ('1', 'zhangsan', '11', '15025456845', '2020-04-19 13:41:50', '2020-04-19 13:41:53', '', '12313435@qq.com');
INSERT INTO `sub_user` VALUES ('2', 'lisi', '12', '16520253654', '2020-04-19 13:42:09', '2020-04-19 13:42:14', '', '12313435@qq.com');
INSERT INTO `sub_user` VALUES ('3', 'wangwu', '15', '18258468545', '2020-04-19 13:42:32', '2020-04-19 13:42:36', '', '12313435@qq.com');
INSERT INTO `sub_user` VALUES ('4', 'tianqi', '25', '12356895635', '2020-04-19 13:42:48', '2020-04-19 13:42:53', '', '12313435@qq.com');
