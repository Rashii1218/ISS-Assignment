-- Create Database

CREATE DATABASE library_db;
USE library_db;

-- Create Tables

CREATE TABLE categories (
    category_id INT PRIMARY KEY,
    category_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE books (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(50),
    price DECIMAL(8,2) DEFAULT 250,
    published_year INT CHECK (published_year >= 1900),
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- Insert Into Tables
INSERT INTO categories VALUES
(1, 'Technology'),
(2, 'Fiction'),
(3, 'Science');

INSERT INTO books (title, author, price, published_year, category_id)
VALUES
('Effective Java', 'Joshua Bloch', 600, 2018, 1),
('Introduction to Algorithms', 'Thomas H. Cormen', 750, 2009, 1),
('The Pragmatic Programmer', 'Andrew Hunt', 580, 1999, 1),

('The Hobbit', 'J.R.R. Tolkien', 420, 1937, 2),
('1984', 'George Orwell', 350, 1949, 2),
('Pride and Prejudice', 'Jane Austen', 300, 1813, 2),

('Cosmos', 'Carl Sagan', 500, 1980, 3),
('The Selfish Gene', 'Richard Dawkins', 450, 1976, 3),
('Astrophysics for People in a Hurry', 'Neil deGrasse Tyson', NULL, 2017, 3);


-- Select and Distinct
SELECT * FROM books;
SELECT DISTINCT Author FROM books;


-- Where , And, Or, Order By
SELECT * FROM books WHERE price>400;
SELECT * FROM books WHERE category_id = 1 AND published_year>=2000;
SELECT * FROM books WHERE category_id = 1 OR published_year>=2000;
SELECT * FROM books ORDER BY author;


-- Update and Delete
UPDATE books SET price = 450 WHERE title = 'The Hobbit';
DELETE FROM books WHERE title = 'Cosmos';


-- Limit
SELECT * FROM books order by price DESC LIMIT 2;


-- LIKE & WILDCARDS
SELECT * FROM books WHERE title LIKE 'H%';
SELECT * FROM books WHERE author LIKE '%ing%';

-- In & Between
SELECT * FROM books WHERE category_id IN (1, 2);
SELECT * FROM books WHERE price BETWEEN 300 AND 500;

-- Aliases
SELECT title AS Book_Title, price AS Cost FROM books;


-- JOINS

-- Inner Join
SELECT b.title, c.category_name
FROM books b
INNER JOIN categories c ON b.category_id = c.category_id;

-- Left Join
SELECT b.title, c.category_name
FROM books b
LEFT JOIN categories c ON b.category_id = c.category_id;

-- Right Join
SELECT b.title, c.category_name
FROM books b
RIGHT JOIN categories c ON b.category_id = c.category_id;

-- Full Join (MySQL alternative)
SELECT b.title, c.category_name
FROM books b
LEFT JOIN categories c ON b.category_id = c.category_id
UNION
SELECT b.title, c.category_name
FROM books b
RIGHT JOIN categories c ON b.category_id = c.category_id;


--  Union
SELECT title FROM books
UNION
SELECT category_name FROM categories;


-- Select Into / Insert Into Select
CREATE TABLE book_backup AS
SELECT * FROM books;
INSERT INTO book_backup
SELECT * FROM books;


-- Create Index
CREATE INDEX idx_title ON books(title);


-- Alter & Drop
ALTER TABLE books ADD isbn VARCHAR(20);
ALTER TABLE books DROP isbn;


-- Views
CREATE VIEW book_view AS
SELECT title, author, price FROM books;
SELECT * FROM book_view;

-- Null Values
SELECT * FROM books WHERE price IS NULL;
SELECT * FROM books WHERE price IS NOT NULL;

-- Group By & Having
SELECT category_id, AVG(price) AS avg_price
FROM books
GROUP BY category_id
HAVING AVG(price) > 300;


--  Aggregate Functions
SELECT COUNT(*) FROM books;
SELECT MAX(price) FROM books;
SELECT MIN(price) FROM books;
SELECT SUM(price) FROM books;
SELECT AVG(price) FROM books;


-- Null Functions
SELECT title, IFNULL(price, 250) AS final_price FROM books;

