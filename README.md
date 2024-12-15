# ECommerce_Application_project

# E-Commerce Application

This is a simple e-commerce application built using Core Java and JDBC. The application allows users to:
- Register and log in.
- Browse products.
- Manage a shopping cart and place orders (future enhancement).

## Setup Instructions

### 1. Prerequisites
- Java JDK 8 or higher
- MySQL Server
- MySQL Connector/J (JDBC Driver)

### 2. Database Setup
CREATE DATABASE ecommerce;
USE ecommerce;

CREATE TABLE Users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    stock INT NOT NULL
);

INSERT INTO Products (name, price, stock) VALUES 
('Laptop', 55000.50, 10),
('Smartphone', 20000.00, 25),
('Headphones', 1500.75, 50);
