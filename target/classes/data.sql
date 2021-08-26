DROP TABLE IF EXISTS brand;

CREATE TABLE brand
(
    brand_id   INT AUTO_INCREMENT PRIMARY KEY,
    brand_name VARCHAR(255) NOT NULL
);

INSERT INTO brand (brand_name)
values ('Zara'),
       ('Sabrina'),
       ('Nike');


DROP TABLE IF EXISTS prices;
CREATE TABLE prices
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    brand_id   INT           NOT NULL,
    start_date TIMESTAMP     NOT NULL,
    end_date   TIMESTAMP     NOT NULL,
    price_list INT DEFAULT NULL,
    product_id INT DEFAULT NULL,
    priority   INT           NOT NULL,
    price      DECIMAL(5, 2) NOT NULL,
    curr       VARCHAR(10)   NOT NULL,
    FOREIGN KEY (brand_id) REFERENCES brand (brand_id)
);
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES (1, {ts '2020-06-14 00:00:00'}, {ts '2020-12-31 23:59:59'}, 1, 35455, 0, 35.50, 'EUR'),
       (1, {ts '2020-06-14 15:00:00'}, {ts '2020-06-14 18:30:00'}, 2, 35455, 1, 35.50, 'EUR'),
       (2, {ts '2020-06-15 00:00:00'}, {ts '2020-06-15 11:00:00'}, 3, 35455, 1, 35.50, 'EUR'),
       (2, {ts '2020-06-15 16:00:00'}, {ts '2020-12-31 23:59:59'}, 4, 35455, 0, 35.50, 'EUR');


