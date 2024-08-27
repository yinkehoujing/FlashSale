--create table T_Product(
--    id bigint not null,
--    product_name varchar(60) not null,
--    stock int(10) not null,
--    price decimal(16, 2) not null,
--    version int(10) not null default 0,
--    note varchar(256) not null,
--    primary key(id)
--);
--create table T_Purchase_Record(
--    id int(12) not null auto_increment,
--    user_id int(12) not null,
--    product_id int(12) not null,
--    price decimal(16,2) not null,
--    quantity int(12) not null,
--    cost decimal(16,2) not null,
--    purchase_date TIMESTAMP not null DEFAULT now(),
--    note varchar(512) null,
--    primary key(id)
--)
CREATE TABLE T_Product (
    id bigint NOT NULL,
    product_name VARCHAR(60) NOT NULL,
    stock INT NOT NULL,
    price DECIMAL(16, 2) NOT NULL,
    version INT DEFAULT 0 NOT NULL,
    note VARCHAR(256) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE T_Purchase_Record (
    id INT AUTO_INCREMENT NOT NULL,
    user_id INT NOT NULL,
    product_id INT NOT NULL,
    price DECIMAL(16, 2) NOT NULL,
    quantity INT NOT NULL,
    paid DECIMAL(16, 2) NOT NULL,
    purchase_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    note VARCHAR(512),
    PRIMARY KEY (id)
);
