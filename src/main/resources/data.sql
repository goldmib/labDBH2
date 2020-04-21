DROP TABLE IF EXISTS words;

CREATE TABLE words (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  word VARCHAR(250) NOT NULL,
  value_train INT DEFAULT NULL,
  value_test INT DEFAULT NULL
);

INSERT INTO words (word, value_train, value_test) VALUES
  ('Apple', 3, 2),
  ('Pinapple', 1, 1),
  ('Orange', 3, 3);