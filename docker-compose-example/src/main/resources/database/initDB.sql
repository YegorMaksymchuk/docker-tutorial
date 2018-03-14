DROP SCHEMA IF EXISTS restdemo;

CREATE SCHEMA restdemo
  DEFAULT CHARACTER SET utf8mb4;

DROP TABLE IF EXISTS restdemo.customers;

CREATE TABLE IF NOT EXISTS restdemo.customers (
  id         BIGINT PRIMARY KEY,
  first_name VARCHAR(50)  NOT NULL,
  last_name  VARCHAR(50)  NOT NULL,
  address    VARCHAR(200) NOT NULL,
  budget     DECIMAL      NOT NULL
);