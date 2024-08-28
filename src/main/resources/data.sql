delete from T_Product;
insert into T_Product(id, product_name, stock, price, version, note)
    values(1, 'haoyunlai', 4, 20, 1, 'buy it');
insert into T_Product(id, product_name, stock, price, version, note)
    values(2, 'zhunihaoyunlai', 102, 10, 1, 'do not buy it');
insert into T_Product(id, product_name, stock, price, version, note)
    values(3, 'aiyouniganma', 114, 51, 1, 'no intro yet');
INSERT INTO T_Purchase_Record (user_id, product_id, price, quantity, paid, note)
    values (1, 101, 99.99, 2, 199.98, 'yandoubudaiyan');
