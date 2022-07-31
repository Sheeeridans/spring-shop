INSERT INTO products (id, title, price)
values
(1, 'Laptop', 45000.0),
(2, 'Monitor', 4500.0),
(3, 'Mouse', 650.0),
(4, 'Keyboard', 1150.0),
(5, 'Computer', 58000.0);

ALTER SEQUENCE product_seq RESTART WITH 6;