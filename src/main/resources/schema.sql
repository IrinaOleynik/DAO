CREATE TABLE PUBLIC.CUSTOMERS
(
id SERIAL PRIMARY KEY,
name VARCHAR(255),
surname VARCHAR(255),
age INT,
phone_number VARCHAR(10)
);

INSERT INTO PUBLIC.CUSTOMERS (name, surname, age, phone_number)
VALUES ('Masha', 'Ivanova', 20, '8934567890'),
('Alexey', 'Petrov', 31, '8987654321'),
('Olya', 'Bublich', 45, '8912345678'),
('Sasha', 'Polikova', 22, '8909876543'),
('Alexey', 'Egorov', 43, '8998765432');

CREATE TABLE PUBLIC.ORDERS
(
id SERIAL PRIMARY KEY,
date DATE,
customer_id INT,
product_name VARCHAR(255),
amount DECIMAL(10, 2),
FOREIGN KEY (customer_id) REFERENCES customers(id)
);

INSERT INTO PUBLIC.ORDERS ("date", customer_id, product_name, amount)
VALUES ('2023-10-01', 1, 'Chicken Burger', 9.99),
    ('2023-10-02', 2, 'Veggie Burger', 8.99),
    ('2023-10-03', 1, 'Fries', 3.50),
    ('2023-10-04', 3, 'Cola', 1.99),
    ('2023-10-05', 2, 'Cheeseburger', 10.99);