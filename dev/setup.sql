DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users
(
  id       SERIAL PRIMARY KEY,
  username VARCHAR(250) UNIQUE NOT NULL,
  age      INTEGER CHECK (age > 0)
);

INSERT INTO users(username, age)
VALUES ('Yuting1', 10),
       ('Yuting2', 20),
       ('Yuting3', 25);
