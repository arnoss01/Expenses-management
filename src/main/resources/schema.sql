CREATE TABLE ExpenseCategory (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(255)
);

CREATE TABLE Expense (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255),
    spendingDate TIMESTAMP,
    ammount DOUBLE,
    expenseCategory_id BIGINT,
    FOREIGN KEY (expenseCategory_id) REFERENCES ExpenseCategory(id)
);

CREATE TABLE FinancialGoal (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    goal DOUBLE,
    capitalPercentage FLOAT,
    title VARCHAR(255),
    deadline TIMESTAMP
);

