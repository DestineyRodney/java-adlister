USE adlister_db;

INSERT INTO users (username, email, password)
VALUES ('Douglas', 'Douglas@user.com', 'Douglas'),
       ('Destiney', 'Destiney@user.com', 'Destiney'),
       ('Bob', 'Bob@user.com', 'Bob');

INSERT INTO ads (user_id, title, description)
VALUES (1, 'hoodie', 'White relaxed fit.'),
       (2,    'shirt', 'v-neck white.'),
       (3,    'shoes', 'Nike retros.');