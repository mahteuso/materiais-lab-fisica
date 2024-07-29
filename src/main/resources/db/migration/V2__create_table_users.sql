create table if not exists `usuarios`(
    `id` char(50) not null primary key unique,
    `login` char(255) not null unique,
    `password` char(255) not null,
    `role` char(255) not null
);