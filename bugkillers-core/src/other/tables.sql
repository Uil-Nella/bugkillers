CREATE DATABASE `bugkillers` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE bugkillers;

#用户表
CREATE TABLE `bk_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` VARCHAR(50) NOT NULL COMMENT '用户名',
  `nick_name` VARCHAR(50) NOT NULL COMMENT '昵称',
  `password` VARCHAR(50) NOT NULL COMMENT '密码',
  `email` VARCHAR(50) NOT NULL COMMENT '邮箱',
  `head_pic` VARCHAR(50)  COMMENT '头像路径',
  `regist_time` datetime NOT NULL  ,
  `login_time` datetime NOT NULL  ,
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`),
  UNIQUE `idx_user_name` (user_name),
  UNIQUE `idx_email` (email)
) ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='用户表';
#问题表
CREATE TABLE `bk_question` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(10) NOT NULL COMMENT '问题所属者主键',
  `question_title` VARCHAR(50) NOT NULL COMMENT '问题标题',
  `question_summary` VARCHAR(200)  COMMENT '问题摘要',
  `question_text` VARCHAR(500) NOT NULL COMMENT '问题正文',
  `question_status` int(4) unsigned NOT NULL COMMENT '问题状态 1 待回答 2 已经回答 3 已解决 ',
  `question_times` int(10) unsigned DEFAULT 0 COMMENT '浏览次数 每被查询一次加一',
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='问题表';
#标签表
CREATE TABLE `bk_tag` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tag_name` VARCHAR(50) NOT NULL COMMENT '标签名',
  `tag_pic` VARCHAR(50)  COMMENT '标签图片',
  `tag_des` VARCHAR(200) COMMENT '标签描述信息',
  `group_id` int(10) NOT NULL COMMENT '标签组主键',
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='标签表';
#问题标签关联表
CREATE TABLE `bk_question_tag`(
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tag_id` int(10) NOT NULL COMMENT '标签主键',
  `tag_name` VARCHAR(50) NOT NULL  COMMENT '标签名称',
  `question_id` INT(10) NOT NULL  COMMENT '问题主键' ,
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='问题标签关联表';
#标签用户关联表
CREATE TABLE `bk_tag_user`(
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tag_id` int(10) NOT NULL COMMENT '标签主键',
  `user_id` INT(10) NOT NULL  COMMENT '用户主键' ,
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='用户标签关联表';

#评论表
CREATE TABLE `bk_comment` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `question_id` int(10) NOT NULL COMMENT '问题主键',
  `user_id` int(10) NOT NULL COMMENT '问题所属者主键',
  `comment_text` VARCHAR(500) NOT NULL COMMENT '评论正文',
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='评论表';
#声望表
CREATE TABLE `bk_prestige` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(10) NOT NULL COMMENT '用户主键',
  `presige_value` int(10) unsigned NOT NULL COMMENT '声望值',
  `zan_value` int(10) unsigned NOT NULL COMMENT '被赞次数',
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='声望表';
#标签组表
CREATE TABLE `bk_tag_group` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `group_name` VARCHAR(50) NOT NULL COMMENT '标签组名称',
  `group_des` VARCHAR(200) COMMENT '标签组描述信息',
  `bk_create` datetime NOT NULL  ,
  `bk_modified` datetime NOT NULL  ,
  `dr` int(4) unsigned NOT NULL DEFAULT '1' COMMENT '1=正常  2=删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='标签组表';

