CREATE SCHEMA docker DEFAULT CHARACTER SET utf8mb4;


CREATE TABLE docker.developers(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	specialty VARCHAR(50) NOT NULL,
	salary DECIMAL(10, 2) NOT NULL
);