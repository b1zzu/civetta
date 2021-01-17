CREATE SEQUENCE hibernate_sequence START 1;

CREATE TABLE config
(
    key   VARCHAR(32) NOT NULL,
    value TEXT        NOT NULL
);

INSERT INTO config(key, value)
VALUES ('business.name', 'My Business Name'),
       ('business.description', 'A long or short description for my business'),
       ('business.logo',
        'CjxpbWcgc3R5bGU9IndpZHRoOiAxMDAlOyBoZWlnaHQ6IGF1dG87IGZsb2F0OiBsZWZ0O2JhY2tncm91bmQtaW1hZ2U6IG5vbmU7IiBzcmM9Ii8vY2RuLm9ubGluZXdlYmZvbnRzLmNvbS9zdmcvaW1nXzEzNDkzNi5wbmciIGFsdD0iVGVsZWNvbSBOZXQiPgogIA=='),
       ('business.currency', 'euro');


CREATE TABLE products
(
    id          BIGINT      NOT NULL
        CONSTRAINT products_pkey PRIMARY KEY,

    name        VARCHAR(32) NOT NULL,
    description TEXT        NOT NULL,
    image       TEXT        NOT NULL,
    price       FLOAT       NOT NULL
);

CREATE TABLE customizations
(
    id         BIGINT  NOT NULL
        CONSTRAINT customizations_pkey PRIMARY KEY,

    product_id BIGINT  NOT NULL
        CONSTRAINT cproductfkey REFERENCES products,

    max        INTEGER NOT NULL,
    min        INTEGER NOT NULL,
    list_id    BIGINT  NOT NULL
        CONSTRAINT clistfkey REFERENCES lists
);

CREATE TABLE lists
(
    id          BIGINT      NOT NULL
        CONSTRAINT lists_pkey PRIMARY KEY,

    name        VARCHAR(32) NOT NULL,
    description TEXT        NOT NULL
);

CREATE TABLE items
(
    id          BIGINT      NOT NULL
        CONSTRAINT items_pkey PRIMARY KEY,

    list_id     BIGINT      NOT NULL
        CONSTRAINT listfkey REFERENCES lists,

    name        VARCHAR(32) NOT NULL,
    description TEXT        NOT NULL,
    difference  FLOAT       NOT NULL
);
