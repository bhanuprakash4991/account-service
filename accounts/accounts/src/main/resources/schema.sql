CREATE TABLE IF NOT EXISTS Customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email varchar(50) NOT NULL,
    address VARCHAR(255),
    mobileNumber varchar(10),
    account_type VARCHAR(50),
    created_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP,
    updated_by VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Accounts (
    customer_id INT NOT NULL,
    account_number INT AUTO_INCREMENT PRIMARY KEY,
    branch_address VARCHAR(255),
    account_type VARCHAR(50),
    created_by VARCHAR(100),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_on TIMESTAMP,
    updated_by VARCHAR(100)
);
