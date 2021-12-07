USE adlister_db;
DROP TABLE IF EXISTS users;

CREATE TABLE users(
   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   user_id VARCHAR(50),
   title VARCHAR(75),
   description VARCHAR(200),
   PRIMARY KEY (id)
);

CREATE TABLE ads(
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT UNSIGNED NOT NULL,
                    email VARCHAR(250),
                    password VARCHAR(75),
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES users (id)
);
