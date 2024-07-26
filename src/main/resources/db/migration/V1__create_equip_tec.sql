create table if not exists `equipamentos`(
    `id` int not null auto_increment primary key,
    `nome_equipamento` char(255) not null,
    `patrimonio` char(255) not null,
    `descricao` text,
    `data_insercao` date not null,
    `ativo` boolean
);

create table if not exists `tecnicos`(
    `id` int not null auto_increment primary key,
    `nome` char(255) not null,
    `departamento` char(255) not null,
    `ativo` boolean
);

create table if not exists `cadastro`(
    `id` int auto_increment primary key,
    `id_equipamento` int,
    `id_tecnico` int,
     `data_criacao` date not null
);


ALTER TABLE
    `cadastro` ADD CONSTRAINT `fk_id_equipamento` FOREIGN KEY(`id_equipamento`) REFERENCES `equipamentos`(`id`);

ALTER TABLE
    `cadastro` ADD CONSTRAINT `fk_id_tecnico` FOREIGN KEY(`id_tecnico`) REFERENCES `tecnicos`(`id`);