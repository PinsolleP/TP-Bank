CREATE TABLE Person(
   Id_person INT AUTO_INCREMENT,
   first_name VARCHAR(50),
   last_name VARCHAR(50),
   PRIMARY KEY(Id_person)
);

CREATE TABLE BankAccount(
   account_number VARCHAR(50),
   balance DECIMAL(15,2),
   Id_person INT NOT NULL,
   PRIMARY KEY(account_number),
   FOREIGN KEY(Id_person) REFERENCES Person(Id_person)
);

CREATE TABLE Operation(
   Id_operation INT AUTO_INCREMENT,
   type VARCHAR(50),
   amount DECIMAL(15,2),
   date_ DATE,
   source_account_number VARCHAR(50),
   destination_account_number VARCHAR(50) ,
   PRIMARY KEY(Id_operation),
   FOREIGN KEY(source_account_number) REFERENCES BankAccount(account_number),
   FOREIGN KEY(destination_account_number) REFERENCES BankAccount(account_number)
);
