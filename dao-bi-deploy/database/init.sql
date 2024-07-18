CREATE TABLE `source_config`
(
    `id`           bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `gmt_create`   datetime    NOT NULL COMMENT '创建时间',
    `gmt_modified` datetime    NOT NULL COMMENT '更新时间',
    `name`         varchar(30) NOT NULL COMMENT '名称',
    `source_type`  varchar(20) NOT NULL COMMENT '数据来源类型',
    `connect_url`  varchar(200) DEFAULT NULL COMMENT '连接地址信息',
    `user_name`    varchar(30)  DEFAULT NULL COMMENT '连接用户名',
    `password`     varchar(200) DEFAULT NULL COMMENT '密码',
    `expand`       varchar(512) DEFAULT NULL COMMENT '拓展额外(json)',
    `description`  varchar(200) DEFAULT NULL COMMENT '描述信息',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='数据来源配置信息表'