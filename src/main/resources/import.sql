INSERT INTO perfil (nome) values('TESTE');

INSERT INTO perfil_permissoes (perfil_id, permissoes) values(1, 'ADMIN');

INSERT INTO usuario (username, password, nome, email, ativo, perfil_id) values('admin', '$2a$10$MUxruSV6fspjMTv.axUKPuss2raoer5K9vN2Eue80NxTkB6nnVoPG', 'Administrador', 'admin@admin.com', 1, 1);