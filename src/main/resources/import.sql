INSERT INTO perfil (nome) values('TESTE');

INSERT INTO perfil_permissoes (perfil_id, permissoes) values(1, 'ADMIN');
INSERT INTO usuario (username, password, nome, email, ativo, perfil_id) values('admin', '$2a$10$MUxruSV6fspjMTv.axUKPuss2raoer5K9vN2Eue80NxTkB6nnVoPG', 'Administrador', 'admin@admin.com', 1, 1);

INSERT INTO pessoa (apelido, ativo, cgc, email, endereco, nome) values('Joao da Silva',true,00987677,'joao@msn.com','Aimore 99','Joao da Silva');
INSERT INTO pessoa (apelido, ativo, cgc, email, endereco, nome) values('Maria Jose',true,009876227,'maria@msn.com','Aimore 33','Maria Jose');
INSERT INTO cliente (id) values(1);
INSERT INTO cliente (id) values(2);
INSERT INTO produto (descricao, estoque, nome, tipo, valor) values('Parafuso 2/3', 200, 'Parafuso com rosca', 'Produto', 45);
INSERT INTO produto (descricao, estoque, nome, tipo, valor) values('Parafuso 2/9', 200, 'Parafuso com porca', 'Produto', 4);
INSERT INTO nota (data_emissao, data_entrada, id_pessoa) values('2018-06-21','2018-05-21' , 1);
INSERT INTO nota (data_emissao, data_entrada, id_pessoa) values('2018-06-22','2018-04-22' , 1);
INSERT INTO item_nota (quantidade, valor_total, valor_unitario, id_nota, id_produto) values(5,0,345,1,1);


