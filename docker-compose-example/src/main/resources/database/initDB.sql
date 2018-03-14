CREATE SCHEMA IF NOT EXISTS restdemo
  DEFAULT CHARACTER SET utf8mb4;

CREATE TABLE IF NOT EXISTS restdemo.customers (
  id         BIGINT PRIMARY KEY,
  first_name VARCHAR(50)  NOT NULL,
  last_name  VARCHAR(50)  NOT NULL,
  address    VARCHAR(200) NOT NULL,
  budget     DECIMAL      NOT NULL
);