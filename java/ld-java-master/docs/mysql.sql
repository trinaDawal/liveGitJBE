-- SWITCH TO DATABASE  (MYSQL)
USE SAKILA; 
-- SELECT ALL ROWS FROM ACTOR TABLE
SELECT * FROM ACTOR;

-- CREATE DATABASE
CREATE DATABASE  JBEDB;
USE JBEDB;
DROP TABLE PRODUCTS;
-- USE PRIMARY KEY TO AVOID DUPLICATES
-- FOREIGN KEY (COMING UP)
CREATE TABLE PRODUCTS(PRODUCT_ID INT AUTO_INCREMENT PRIMARY KEY, 
PRODUCT_NAME CHAR(50), PRICE FLOAT);
INSERT INTO PRODUCTS (PRODUCT_NAME, PRICE) VALUES ('LIMITLESS',55.50);
INSERT INTO PRODUCTS VALUES (2, 'SWW',155.50);
INSERT INTO PRODUCTS VALUES (3, 'TPON',155.50);
INSERT INTO PRODUCTS VALUES (4, 'LOY',780.50);
INSERT INTO PRODUCTS (PRODUCT_NAME, PRICE) VALUES ('7H',55.50);
UPDATE PRODUCTS SET PRODUCT_NAME = 'MSFM' WHERE PRODUCT_ID = 4;
DELETE FROM PRODUCTS WHERE PRODUCT_ID = 3;
SELECT * FROM PRODUCTS;
SELECT * FROM PRODUCTS WHERE PRODUCT_NAME = 'HP';
SELECT * FROM PRODUCTS WHERE PRICE >= 500;
SELECT * FROM PRODUCTS WHERE PRICE <= 700;
-- DELETE ALL THE PRODUCTS FROM THE TABLE
DELETE FROM PRODUCTS;