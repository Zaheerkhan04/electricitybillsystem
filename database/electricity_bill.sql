create database ebs;
create table ebs.logintable (
username varchar(255),
password varchar(255)
)


insert into ebs.logintable(username, password) values ("admin","Admin");
insert into ebs.logintable(username, password) values ("user","User")

select *from ebs.logintable;
RENAME TABLE logintable TO login;

    BillID INT AUTO_INCREMENT PRIMARY KEY,
    MeterNumber VARCHAR(10) NOT NULL,
    Month VARCHAR(20) NOT NULL,
    Units INT NOT NULL,
    Amount DECIMAL(10, 2) NOT NULL,
    Date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
INSERT INTO bill (MeterNumber, Month, Units, Amount) 
VALUES ('1001', 'January', 150, 1214.00);
drop table bill;
emp
drop table emp;

CREATE TABLE emp (
    EmpID INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    meter_number VARCHAR(10) UNIQUE NOT NULL,
    address VARCHAR(255) NOT NULL,
    state VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15) UNIQUE NOT NULL
);
INSERT INTO emp (name, meter_number, address, state, city, email, phone) 
VALUES ('aasra', '1001', '123 Elm Street', 'California', 'Los Angeles', 'john.doe@example.com', '123-456-7890');

INSERT INTO emp (name, meter_number, address, state, city, email, phone) 
VALUES ('Jane Smith', '1002', '456 Maple Avenue', 'New York', 'New York City', 'jane.smith@example.com', '098-765-4321');

INSERT INTO tax (MeterLocation, MeterType, PhaseCode, BillType, Days, MeterRent, MCB_Rent, ServiceRent, GST)
VALUES 
('Outdoor', 'Analog', '1-Phase', 'Monthly', 30, 50.00, 10.00, 15.00, 9.00),
('Indoor', 'Digital', '3-Phase', 'Bi-Monthly', 60, 100.00, 20.00, 30.00, 18.00),
('Outdoor', 'Smart', '1-Phase', 'Monthly', 30, 60.00, 15.00, 20.00, 10.00);

INSERT INTO bill (meterNumber, Month, Units, Amount)
VALUES 
('1001', 'January', 150, 1214.00),
('1002', 'February', 200, 1620.00),
('1003', 'March', 180, 1458.00);
INSERT INTO emp (Name, meter_number, address, state, city, email, phone)
VALUES 
('John Doe', '1005', '123 Elm Street', 'California', 'Los Angeles', 'john47.doe@example.com', '1273-456-7890'),
('Jane Smith', '1002', '456 Maple Avenue', 'New York', 'New York City', 'jane.smith@example.com', '098-765-4321'),
('Michael Johnson', '1003', '789 Oak Lane', 'Texas', 'Houston', 'michael.johnson@example.com', '555-123-4567');

select* from bill;