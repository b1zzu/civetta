CREATE TABLE config
(
    key   VARCHAR(64),
    value TEXT
);

INSERT INTO config(key, value)
VALUES ('business.name', 'My Business Name'),
       ('business.description', 'A long or short description for my business'),
       ('business.logo',
        'CjxpbWcgc3R5bGU9IndpZHRoOiAxMDAlOyBoZWlnaHQ6IGF1dG87IGZsb2F0OiBsZWZ0O2JhY2tncm91bmQtaW1hZ2U6IG5vbmU7IiBzcmM9Ii8vY2RuLm9ubGluZXdlYmZvbnRzLmNvbS9zdmcvaW1nXzEzNDkzNi5wbmciIGFsdD0iVGVsZWNvbSBOZXQiPgogIA==');
