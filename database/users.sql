USE adlister_db;
DROP TABLE IF EXISTS users;

CREATE TABLE users(
   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   username VARCHAR(50),
   password VARCHAR(75),
   email VARCHAR(200),
   PRIMARY KEY (id)
);

CREATE TABLE ads(
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT UNSIGNED NOT NULL,
                    description VARCHAR(250),
                    title VARCHAR(75),
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES users (id)
);
