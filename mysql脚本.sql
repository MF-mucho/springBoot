


 CREATE TABLE t_user(
    t_id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
    t_name VARCHAR(30) COMMENT '姓名',
    t_age INT COMMENT '年龄',
    t_address VARCHAR(100) COMMENT '地址',
    PRIMARY KEY ( t_id )


-- 查看表字段描述
    select column_name, column_comment from information_schema.columns where table_schema ='spring_boot' and table_name = 't_user' ;