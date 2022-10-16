alter table service
    add column if not exists category_id int not null,
    drop constraint if exists fk_category_id,
    add constraint fk_category_id
        foreign key (category_id)
            references category (id)