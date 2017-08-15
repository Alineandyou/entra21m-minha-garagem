#Apagar o banco de dados

DROP DATABASE IF EXISTS minha_garagem;

#Criar o banco de dados

CREATE DATABASE IF NOT EXISTS minha_garagem; 
# não pode execultar mais que uma vez
# maiusculo em sql, dados minusculo, facilita vizualização
# CTRL + SHIFT + ENTER = EXECULTA TODOS OS COMANDOS

USE minha_garagem;
# Deleta a tabela se ela existir
DROP TABLE IF EXISTS carros;
# cria a tabela se ela não existir

CREATE TABLE IF NOT EXISTS carros(
    id integer PRIMARY KEY AUTO_INCREMENT, 

nome varchar(150),

    cor varchar(100),
    fabricante varchar(255), 
    placa varchar(8),
    chassi varchar(50),
    quilometragem float,
    potencia float,
    data_compra date,
    esta_funcionando boolean,
    permitida_circulacao boolean,
    quantidade_portas tinyint,
    quantidade_batidas tinyint,
    ano_fabricacao smallint,
    ano_lancamento smallint,
    tipo_pneu smallint,
    renavam int,    
    descricao TEXT 
);