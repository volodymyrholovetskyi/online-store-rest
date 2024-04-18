--liquibase formatted sql
--changeset vholovetskyi:1

CREATE TABLE customer
(
    id         INT8         NOT NULL,
    uuid       VARCHAR(255) NOT NULL,
    version    INT8         NOT NULL,
    first_name VARCHAR(70)  NOT NULL,
    last_name  VARCHAR(70)  NOT NULL,
    email      VARCHAR(70)  NOT NULL UNIQUE,
    phone      VARCHAR(16)  NOT NULL,
    street     VARCHAR(80)  NOT NULL,
    city       VARCHAR(70)  NOT NULL,
    zipCod     VARCHAR(10)  NOT NULL,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (id)
);

CREATE TABLE orders
(
    id          INT8         NOT NULL,
    uuid        VARCHAR(255) NOT NULL,
    version     INT8         NOT NULL,
    status      VARCHAR(70)  NOT NULL,
    customer_id INT8         NOT NULL,
    created_at  TIMESTAMP DEFAULT NOW(),
    updated_at  TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (id),
    CONSTRAINT fk_customer_order_id FOREIGN KEY (customer_id)
        REFERENCES customer (id)
);

CREATE TABLE item
(
    id         INT8           NOT NULL,
    uuid       VARCHAR(255)   NOT NULL,
    version    INT8           NOT NULL,
    quantity   INT4           NOT NULL,
    price      NUMERIC(10, 2) NOT NULL,
    order_id   INT8           NOT NULL,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (id),
    CONSTRAINT fk_order_item_id FOREIGN KEY (order_id)
        REFERENCES orders (id)
);