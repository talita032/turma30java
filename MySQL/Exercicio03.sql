use escola;
create database escola;

create table db_escola(
nome varchar (10) not null,
id_aluno bigint (10),
idade varchar (10),
nota decimal (10)
);

insert into db_escola(nome, id_aluno, idade, nota)

values("Bianca",001, "18", 5),
("Pedro", 002, "20", 7),
("Isabel", 003, "19", 9),
("Mariana", 004, "22", 10);

select*from tb_alunos;
select*from tb_alunos where  nota > 5;
select*from tb_alunos where nota < 5; 