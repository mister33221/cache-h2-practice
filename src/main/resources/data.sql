-- -- 插入產品分類
-- INSERT INTO product_categories (name, description) VALUES ('Electronics', 'Electronic devices and accessories');
-- INSERT INTO product_categories (name, description) VALUES ('Books', 'Physical and digital books');
--
-- -- 插入產品
-- INSERT INTO product(name, description, price, stock_quantity, category_id, status, image_url)
-- VALUES ('Java Programming Book', 'Comprehensive guide to Java programming', 49.99, 50, 2, 'PULL_ON_SHELVES', 'java_book_main.jpg');
--
--
-- -- 插入用戶
-- INSERT INTO users(username, full_name, email, phone_number, date_of_birth, address, hashed_password, last_login_time)
-- VALUES ('john_doe', 'John Doe', 'john@example.com', '1234567890', '1990-01-01', '123 Main St, City, Country', 'hashedPassword123', CURRENT_TIMESTAMP());


-- 插入初始用户資訊
INSERT INTO users (id, username, hashed_password, last_login_time, full_name, email, phone_number, date_of_birth, address, random_salt)
VALUES (9999, 'user1', 'hashed_password1', NULL, 'Full Name 1', 'user1@example.com', '1234567890', '1990-01-01', '123 Main St', 'random_salt1');

INSERT INTO users (id, username, hashed_password, last_login_time, full_name, email, phone_number, date_of_birth, address, random_salt)
VALUES (8888, 'user2', 'hashed_password2', NULL, 'Full Name 2', 'user2@example.com', '0987654321', '1991-02-02', '456 Elm St', 'random_salt2');

INSERT INTO users (id, username, hashed_password, last_login_time, full_name, email, phone_number, date_of_birth, address, random_salt)
VALUES (7777, 'kai', '$2a$10$oddsa4nCrau7uCviwlCye.DfaS1uRrz7U8aqAqU4OmgtZX0KsKrW2', NULL, '謝凱威', 'mister332212@example.com', '0987654321', '1991-02-02', '456 Elm St', '69jjseLWTxEauLJlqD4k1Q==');

VALUES (8888, 10, 5);