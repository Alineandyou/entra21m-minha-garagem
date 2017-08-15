# Seleciona todas as colunas da tabela de carros
SELECT * FROM carros;

# Seleciona a coluna nome, fabricante, cor e quantidade colocando
# um apelido para apresentar para o usuario de uma melhor form
SELECT 
     nome AS'nome',
     fabricante AS'Fabricante',
     cor AS 'cor',
     quantidade_portas AS'Quantidade de Portas'

FROM carros;

# Exemplo de INSERT na tabela de carros informando
# as colunas desejadas

INSERT INTO carros 
(id, nome, cor, fabricante, placa, chassi, quilometragem, potencia, data_compra, esta_funcionando, permitida_circulacao, quantidade_portas, quantidade_batidas, ano_fabricacao, ano_lancamento, tipo_pneu, renavam, descricao)
VALUE
(1,"Gol", "Azul Bebê", "VW", "ABC-2000", "2Ab578ROepaso82371", 29134741, 85, '2017-08-07', TRUE, FALSE, 4, 0, 2017, 2016, 175, 847516874,"");

# Inserur na tabela de carros um resistro
# com omente alguns campos
INSERT INTO carros 
(id, nome, cor, fabricante, placa,potencia, data_compra)
VALUE
(1,"Fusion", "Azul forte", "Ford", 65,'2017-02-04');

# limpar a tabela por completo
TRUNCATE carros;

# Retorna a quantidade de registro
INSERT INTO carros 
(nome, cor, fabricante, potencia, data_compra)
VALUES
("Fusion", "Azul forte", "Ford", 160,'2017-06-24'),
("Cross Fox","Branco", "VW", 100, '2011-08-24');


UPDATE carros SET
cor = "Branco"
WHERE cor = "Vermelho";

UPDATE carros SET
ano_fabricacao = 2017, ano_lancamento = 2016
WHERE cor = "Branco";
SELECT nome, cor FROM carros;

SELECT * FROM carros;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id > 4;


SELECT id, nome, quantidade_batidas
FROM carros
WHERE id > 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id >= 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id < 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id <= 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id <> 4;
SELECT COUNT (*)FROM carros;


SELECT nome FROM carros 
ORDER BY 
	fabricante ASC,
	nome ASC ,
	cor ASC ;





