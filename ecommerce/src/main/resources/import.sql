
-- Cria a tabela Usuario
CREATE TABLE tb_usuario(
ID INTEGER PRIMARY KEY, 
NOME VARCHAR(255) NOT NULL,
EMAIL VARCHAR(50) NOT NULL,
SENHA VARCHAR(50) NOT NULL,
CONSTRAINT UQ_EMAIL_USUARIO UNIQUE (NOME)
   
);

-- Inserindo dados na tabela Usuario
INSERT INTO tb_usuario (ID, NOME, EMAIL, SENHA) VALUES (1,'João Silva', 'joaosilva@teste.com.br', 'silva1289');
INSERT INTO tb_usuario (ID, NOME, EMAIL, SENHA) VALUES (2,'Maria Silva', 'silvamaria@teste.com.br', 'smaria4569');
INSERT INTO tb_usuario (ID, NOME, EMAIL, SENHA) VALUES (3,'Claudia Souza', 'claudiasouza@teste.com.br', 'csouza5487');
INSERT INTO tb_usuario (ID, NOME, EMAIL, SENHA) VALUES (4,'Jurema Andrade', 'juremaandrade@teste.com.br', 'andradej5679');


-- Cria a tabela Categoria
CREATE TABLE tb_categorias(
ID INTEGER PRIMARY KEY,
TIPO VARCHAR(255) NOT NULL,
CONSTRAINT UQ_NOME_CATEGORIA UNIQUE (TIPO)

);

-- Insere os dados na tabela categoria
INSERT INTO tb_categorias (ID, TIPO) VALUES (1, 'BEBIDA ALCOOLICA');
INSERT INTO tb_categorias (ID, TIPO) VALUES (2, 'BEBIDA NÃO ALCOOLICA');
INSERT INTO tb_categorias (ID, TIPO) VALUES (3, 'SNACKS');
INSERT INTO tb_categorias (ID, TIPO) VALUES (4, 'DIVERSOS');

--Cria a tabela Produtos

CREATE TABLE tb_produtos(
ID INTEGER PRIMARY KEY,
ID_USUARIO INTEGER,
ID_CATEGORIA INTEGER,
NOME VARCHAR(50) NOT NULL,
PRECO DECIMAL(4,2),
FOREIGN KEY (ID_USUARIO) REFERENCES tb_usuario(ID),
FOREIGN KEY (ID_CATEGORIA) REFERENCES tb_categorias(ID),
CONSTRAINT UQ_NOME_PRODUTO UNIQUE (NOME)
);

-- Insere os dados na tabela Produtos
INSERT INTO tb_produtos (ID, ID_USUARIO, ID_CATEGORIA, NOME, PRECO) VALUES (1, 1 , 01, 'CERVEJA BRAHMA', 5.60);
INSERT INTO tb_produtos (ID, ID_USUARIO, ID_CATEGORIA, NOME, PRECO) VALUES (2, 2, 02, 'SUCO', 4.20);
INSERT INTO tb_produtos (ID, ID_USUARIO, ID_CATEGORIA, NOME, PRECO) VALUES (3, 3, 03, 'SALGADINHO', 3.50);
INSERT INTO tb_produtos (ID, ID_USUARIO, ID_CATEGORIA, NOME, PRECO) VALUES (4, 4, 04, 'GELO', 20.00);