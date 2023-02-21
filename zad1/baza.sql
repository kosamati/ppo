Create DATABASE Bank;
USE Bank;
CREATE TABLE person (
  person_id INT PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  date_of_birth DATE NOT NULL,
  address VARCHAR(200) NOT NULL
);

CREATE TABLE account (
  account_id INT PRIMARY KEY,
  account_number VARCHAR(20) NOT NULL,
  account_type VARCHAR(20) NOT NULL,
  balance DECIMAL(10,2) NOT NULL,
  person_id INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person(person_id)
);

CREATE TABLE bank (
  bank_id INT PRIMARY KEY,
  bank_name VARCHAR(50) NOT NULL,
  bank_address VARCHAR(200) NOT NULL
);

CREATE TABLE client (
  client_id INT PRIMARY KEY,
  person_id INT NOT NULL,
  bank_id INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person(person_id),
  FOREIGN KEY (bank_id) REFERENCES bank(bank_id)
);
