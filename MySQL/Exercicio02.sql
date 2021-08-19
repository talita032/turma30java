create database db_ecommerc;

use db_ecommerc;

create table tb_produtos(
codigo bigint,
nome varchar (10)not null,
fabricante varchar (10),
preco decimal (10)
);

insert into tb_produtos(codigo, nome, fabricante, preco)

values(001,"Bigbig", "Chicle",0.20),
(002,"Pirulito", "Piru", 0.25),
(003,"Pao de queijo", "Queijo bom", 5.00),
(004,"Chocolate", "Chocolest",6.00);

select * from tb_produtos;
select * from tb_produtos where salario > 2000.00;
select * from tb_produtos where salario < 2000.00;




 
 
 
 
 



 








