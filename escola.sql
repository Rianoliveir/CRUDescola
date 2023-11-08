create database escola;
use  escola;
create table alunos(
nome varchar(100) not null,
idade int not null,
id_aluno int primary key auto_increment not null,
genero varchar(10) not null
);
create table professores(
nome varchar(100) not null,
idade int not null,
genero varchar(10) not null,
id_professor int primary key auto_increment not null,
disciplina varchar(20) not null
);
create table turmas(
numero int not null,
serie varchar(10) not null,
responsavel varchar(50)not null,
id_turma int primary key auto_increment not null
);
