create database hadley_Chat;
use database hadley_Chat;

create table Mensagens (
    conteudo varchar(255),
    usuario  varchar(50),
    id       int not null auto_increment,
    primary key(id)
);
