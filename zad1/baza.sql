DROP DATABASE IF EXISTS Bank ;
Create DATABASE Bank;
USE Bank;
CREATE TABLE person (
  person_id INT PRIMARY KEY auto_increment,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  date_of_birth DATE NOT NULL,
  address VARCHAR(200) NOT NULL
);

CREATE TABLE account (
  account_id INT PRIMARY KEY auto_increment,
  account_number VARCHAR(20) NOT NULL,
  account_type VARCHAR(20) NOT NULL,
  balance DECIMAL(10,2) NOT NULL,
  person_id INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person(person_id)
);

CREATE TABLE bank (
  bank_id INT PRIMARY KEY auto_increment,
  bank_name VARCHAR(50) NOT NULL,
  bank_address VARCHAR(200) NOT NULL
);

CREATE TABLE client (
  client_id INT PRIMARY KEY auto_increment,
  person_id INT NOT NULL,
  bank_id INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person(person_id),
  FOREIGN KEY (bank_id) REFERENCES bank(bank_id)
);

GRANT ALL PRIVILEGES ON *.* TO `user`@`localhost` IDENTIFIED BY PASSWORD '*23AE809DDACAF96AF0FD78ED04B6A265E05AA257' WITH GRANT OPTION;

GRANT ALL PRIVILEGES ON `Bank`.* TO `user`@`localhost` WITH GRANT OPTION;