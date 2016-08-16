create database shopcart;  use shopcart;CREATE TABLE `user` (
`id` int NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
`password` varchar(255) NOT NULL,
`image` varchar(255) NULL,
`age` int NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `userdetail` (
`id` int NOT NULL AUTO_INCREMENT,
`uid` int NOT NULL,
`money` varchar(255) NULL,
`phone` varchar(255) NULL,
`email` varchar(255) NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `address` (
`id` int NOT NULL AUTO_INCREMENT,
`uid` int NOT NULL,
`province` varchar(255) NULL,
`city` varchar(255) NULL,
`county` varchar(255) NULL,
`road` varchar(255) NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `good` (
`id` int NOT NULL AUTO_INCREMENT,
`gname` varchar(255) NOT NULL,
`gprice` decimal(10,2) NOT NULL,
`goodtype` varchar(255) NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `admin` (
`id` int NOT NULL AUTO_INCREMENT,
`adname` varchar(255) NOT NULL,
`adpsd` varchar(255) NOT NULL,
`adstatus` int(4) NULL DEFAULT 1,
PRIMARY KEY (`id`)
);

CREATE TABLE `stock` (
`id` int NOT NULL AUTO_INCREMENT,
`gid` int NOT NULL,
`adid` int NOT NULL,
`goodcount` int(255) NULL,
PRIMARY KEY (`id`)

);

CREATE TABLE `outstock` (
`id` int NOT NULL AUTO_INCREMENT,
`gid` int NOT NULL,
`adid` int NOT NULL,
`outcount` int  ,
`outdate` datetime NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `innerstock` (
`id` int NOT NULL AUTO_INCREMENT,
`gid` int NOT NULL,
`adid` int NOT NULL,
`innercount` int NULL,
`innerdate` datetime NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `addjar` (
`id` int NOT NULL AUTO_INCREMENT,
`gid` int NOT NULL,
`adid` int NOT NULL,
`adddate` datetime NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `removejar` (
`id` int NOT NULL AUTO_INCREMENT,
`gid` int NOT NULL,
`adid` int NOT NULL,
`removedate` datetime NOT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `order` (
`id` int NOT NULL AUTO_INCREMENT,
`uid` int NOT NULL,
`orderdate` datetime NULL,
`totalmoney` varchar(255) NULL,
`orderstate` int NOT NULL DEFAULT 0,
PRIMARY KEY (`id`)
);

CREATE TABLE `orderdetail` (
`id` int NOT NULL AUTO_INCREMENT,
`oid` int NOT NULL,
`goodid` int NOT NULL,
`goodcount` varchar(255) NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `goodcomment` (
`id` int NOT NULL AUTO_INCREMENT,
`orderid` int NOT NULL,
`comment` varchar(255) NULL ,
PRIMARY KEY (`id`)
);

CREATE TABLE `gooddetail` (
`id` int NOT NULL AUTO_INCREMENT,
`gid` int NOT NULL,
`gimage` varchar(255) NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `buycar` (
`id` int NOT NULL AUTO_INCREMENT,
`uid` int NOT NULL,
`gid` int NOT NULL,
`goodcoun` varchar(255) NULL,
PRIMARY KEY (`id`)
);


ALTER TABLE `userdetail` ADD CONSTRAINT `fk_u_ud` FOREIGN KEY (`uid`) REFERENCES `user` (`id`);
ALTER TABLE `address` ADD CONSTRAINT `fk_ad_ud` FOREIGN KEY (`uid`) REFERENCES `user` (`id`);
ALTER TABLE `stock` ADD CONSTRAINT `fk_st_go` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `stock` ADD CONSTRAINT `fk_st_ad` FOREIGN KEY (`adid`) REFERENCES `admin` (`id`);
ALTER TABLE `outstock` ADD CONSTRAINT `fk_out_good` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `outstock` ADD CONSTRAINT `fk_out_admin` FOREIGN KEY (`adid`) REFERENCES `admin` (`id`);
ALTER TABLE `innerstock` ADD CONSTRAINT `fk_is_good` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `innerstock` ADD CONSTRAINT `fk_is_admin` FOREIGN KEY (`adid`) REFERENCES `admin` (`id`);
ALTER TABLE `addjar` ADD CONSTRAINT `fk_aj_good` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `addjar` ADD CONSTRAINT `fk_aj_admin` FOREIGN KEY (`adid`) REFERENCES `admin` (`id`);
ALTER TABLE `removejar` ADD CONSTRAINT `fk_rj_good` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `removejar` ADD CONSTRAINT `fk_rj_admin` FOREIGN KEY (`adid`) REFERENCES `admin` (`id`);
ALTER TABLE `orderdetail` ADD CONSTRAINT `fk_od_good` FOREIGN KEY (`goodid`) REFERENCES `good` (`id`);
ALTER TABLE `orderdetail` ADD CONSTRAINT `fk_od_oid` FOREIGN KEY (`oid`) REFERENCES `order` (`id`);
ALTER TABLE `order` ADD CONSTRAINT `fk_or_user` FOREIGN KEY (`uid`) REFERENCES `user` (`id`);
ALTER TABLE `goodcomment` ADD CONSTRAINT `fk_gm_order` FOREIGN KEY (`orderid`) REFERENCES `order` (`id`);
ALTER TABLE `gooddetail` ADD CONSTRAINT `fk_gd_good` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `buycar` ADD CONSTRAINT `fk_bc_good` FOREIGN KEY (`gid`) REFERENCES `good` (`id`);
ALTER TABLE `buycar` ADD CONSTRAINT `fk_bc_user` FOREIGN KEY (`uid`) REFERENCES `user` (`id`);