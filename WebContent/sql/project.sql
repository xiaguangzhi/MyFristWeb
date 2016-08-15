drop database ht1607webbuyyer;

create database HT1607WebBuyyer;
use HT1607WebBuyyer;

-- 用户表
CREATE TABLE users (

id char(32) NOT NULL,

userName varchar(20) NULL,

userPass varchar(18) NULL,

userAge int NULL,

userImg varchar(30),

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 商品表
CREATE TABLE goods (

id char(32) NOT NULL,

goodName varchar(30) NULL,

goodPrice double NULL,

goodMadeTime date NULL,

goodMadePlace varchar(100) NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 订单表
CREATE TABLE Orders (

id char(32) NOT NULL,

orderDate date NULL,

userID char(32) NULL,

totalMoney double NULL,

orderState int default 0, -- 0 表示未支付，1表示支付成功，2，表示，过期未支付，3，表示取消后订单

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 购物车表
CREATE TABLE BuyCar (

id char(32) NOT NULL,

userID char(32) NULL,

goodID char(32) NULL,

goodCount int NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 订单详情表
CREATE TABLE OrderDetails (

id char(32) NOT NULL,

orderID char(32) NULL,

goodID char(32) NULL,

goodCount int NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 商品评论表
CREATE TABLE goodCommets (

id char(32) NOT NULL,

userID char(32) NULL,

goodID char(32) NULL,

comments text NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 用户详情表 :::一个用户可以设置多个 收货地址
CREATE TABLE userDetails (

id char(32) NOT NULL,

address varchar(100) NULL,

phone char(15) NULL,

postid char(6) NULL,

userID char(32) NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 商品详情表 :::一个商品有多张图片
CREATE TABLE GoodDetaiIs (

id char(32) NOT NULL,

goodIMG varchar(30) NULL,

goodID char(32) NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 管理员表
CREATE TABLE admin (

id char(32) NOT NULL,

adName varchar(20) NULL,

adPass varchar(18) NULL,

adStatus int NULL DEFAULT 1,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 超级管理员表
CREATE TABLE superAdmin (

id char(32) NOT NULL,

saName char(15) NULL,

saPass char(15) NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 入库记录表
CREATE TABLE InnerStock (

id char(32) NOT NULL,

insDate date NULL,

goodID char(32) NULL,

adID char(32) NULL,

goodCount int NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 出库记录表
CREATE TABLE OutterStock (

id char(32) NOT NULL,

otsDate date NULL,

goodID char(32) NULL,

adID char(32) NULL,

goodCount int NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 上架记录表
CREATE TABLE addJar (

id char(32) NOT NULL,

ajDate date NULL,

goodID char(32) NULL,

adID char(32) NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 下架记录表
CREATE TABLE removeJar (

id char(32) NOT NULL,

rjDate date NULL,

goodID char(32) NULL,

adID char(32) NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


-- 当前库存表
CREATE TABLE currentStock (

id char(32) NOT NULL,

goodID char(32) NULL,

goodCount int NULL,

PRIMARY KEY (id) 

)engine = innoDB default charset=utf8;


ALTER TABLE userDetails ADD CONSTRAINT fk_us_ud FOREIGN KEY (userID) REFERENCES users (id);

ALTER TABLE OrderDetails ADD CONSTRAINT fk_or_od FOREIGN KEY (orderID) REFERENCES Orders (id);

ALTER TABLE OrderDetails ADD CONSTRAINT fk_or_gd FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE Orders ADD CONSTRAINT fk_or_us FOREIGN KEY (userID) REFERENCES users (id);

ALTER TABLE goodCommets ADD CONSTRAINT fk_gc_us FOREIGN KEY (userID) REFERENCES users (id);

ALTER TABLE goodCommets ADD CONSTRAINT fk_gc_gd FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE BuyCar ADD CONSTRAINT fk_bc_us FOREIGN KEY (userID) REFERENCES users (id);

ALTER TABLE GoodDetaiIs ADD CONSTRAINT fk_gd_g FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE InnerStock ADD CONSTRAINT fk_ad_is FOREIGN KEY (adID) REFERENCES admin (id);

ALTER TABLE InnerStock ADD CONSTRAINT fk_gd_is FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE OutterStock ADD CONSTRAINT fk_ad_os FOREIGN KEY (adID) REFERENCES admin (id);

ALTER TABLE OutterStock ADD CONSTRAINT fk_gd_os FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE currentStock ADD CONSTRAINT fk_gd_cs FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE addJar ADD CONSTRAINT fk_aj_gd FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE addJar ADD CONSTRAINT fk_ad_aj FOREIGN KEY (adID) REFERENCES admin (id);

ALTER TABLE removeJar ADD CONSTRAINT fk_rj_gd FOREIGN KEY (goodID) REFERENCES goods (id);

ALTER TABLE removeJar ADD CONSTRAINT fk_rj_ad FOREIGN KEY (adID) REFERENCES admin (id);

ALTER TABLE BuyCar ADD CONSTRAINT fk_bc_gd FOREIGN KEY (goodID) REFERENCES goods (id);



