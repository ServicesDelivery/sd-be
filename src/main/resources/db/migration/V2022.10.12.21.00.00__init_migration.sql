CREATE TABLE IF NOT EXISTS category
(
    id   serial primary key,
    name varchar(64) not null
);

CREATE TABLE IF NOT EXISTS company
(
    id          serial PRIMARY KEY,
    name        varchar(64)  not null,
    description varchar(200) not null,
    price       int,
    rating      float
);

create table if not exists company_category
(
    company_id  int not null,
    category_id int not null,
    CONSTRAINT fk_company_id
        FOREIGN KEY (company_id)
            REFERENCES company (id),
    CONSTRAINT fk_category_id
        FOREIGN KEY (category_id)
            REFERENCES category (id)
);

CREATE TABLE IF NOT EXISTS "user"
(
    id         serial PRIMARY KEY,
    username   varchar(64)  not null,
    first_name varchar(64)  not null,
    last_name  varchar(64)  not null,
    email      varchar(200) not null,
    password   varchar(200) not null,
    role       varchar(20)  not null,
    status     varchar(20)
);

CREATE TABLE IF NOT EXISTS district
(
    id   serial PRIMARY KEY,
    name varchar(200) not null
);

CREATE TABLE IF NOT EXISTS user_info
(
    user_id serial PRIMARY KEY,
    CONSTRAINT fk_user_id
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
);

CREATE TABLE IF NOT EXISTS address
(
    id           serial PRIMARY KEY,
    user_info_id int          not null,
    district_id  int          not null,
    street       varchar(200) not null,
    house        varchar(20)  not null,
    flat         varchar(200),
    CONSTRAINT fk_district_id
        FOREIGN KEY (district_id)
            REFERENCES district (id),
    CONSTRAINT fk_user_info_id
        FOREIGN KEY (user_info_id)
            REFERENCES user_info (user_id)
);

alter table address
    drop constraint if exists fk_user_info_id;

alter table address
    add column if not exists user_info_id int not null,
    add CONSTRAINT fk_user_info_id
        FOREIGN KEY (user_info_id)
            REFERENCES user_info (user_id);

alter table category
    add column if not exists description varchar(2000) null;

alter table company
    alter column price type varchar(20);

CREATE TABLE IF NOT EXISTS service
(
    id          serial PRIMARY KEY,
    company_id  int          not null,
    name        varchar(200) not null,
    price       int          null,
    description varchar(500) null,
    CONSTRAINT fk_company_id
        FOREIGN KEY (company_id)
            REFERENCES company (id)
);

alter table category
    drop constraint if exists fk_parent_category_id;

alter table category
    add column if not exists parent_category_id int null,
    add CONSTRAINT fk_parent_category_id
        FOREIGN KEY (parent_category_id)
            REFERENCES category (id)