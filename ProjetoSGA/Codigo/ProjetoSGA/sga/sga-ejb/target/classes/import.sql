-- USUARIOS
----------------------------------------------------------------------------------------------------------------
INSERT INTO autorizacao (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'ROLE_SECRETARIADO');
INSERT INTO autorizacao (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (2, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'ROLE_ALUNO');
INSERT INTO autorizacao (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (3, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'ROLE_COORDENADOR');

INSERT INTO usuario (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, username, enable, password) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'aluno',true, 'aluno');
INSERT INTO usuario (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, username, enable, password) VALUES (2, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'aluno2',true, 'aluno2');
INSERT INTO usuario (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, username, enable, password) VALUES (3, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'coordenador',true, 'coordenador');
INSERT INTO usuario (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, username, enable, password) VALUES (4, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'secretaria',true, 'secretaria');

INSERT INTO usuario_autorizacao (usuario_id, autorizacoes_id) VALUES (1,2);
INSERT INTO usuario_autorizacao (usuario_id, autorizacoes_id) VALUES (2,2);
INSERT INTO usuario_autorizacao (usuario_id, autorizacoes_id) VALUES (3,3);
INSERT INTO usuario_autorizacao (usuario_id, autorizacoes_id) VALUES (4,1);

-----------------------------------------------------------------------------------------------------------------

--DADOS DE NOTAS - CURSOS - DISCIPLINAS

-----------------------------------------------------------------------------------------------------------------

INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Arquitetura de Software Distribuído' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (2, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Ciências Criminais na Atualidade' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (3, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Desenvolvimento de Aplicações Web' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (4, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Direito Eleitoral' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (5, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Direito Tributário' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (6, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Engenharia de Produção' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (7, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Filosofia e Teoria do Direito' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (8, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Geoprocessamento' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (9, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Gerenciamento de Projetos' );
INSERT INTO curso (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome) VALUES (10, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'Revisão de Textos' );

INSERT INTO aluno (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, cpf_cnpj, nome, curso_id, usuario_id) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, '999.999.999-99', 'ADRIANO DE PAULA COSTA',1,1);
INSERT INTO aluno (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, cpf_cnpj, nome, curso_id, usuario_id) VALUES (2, '18/08/2015','admin', '18/08/2015', 'admin', 0, '999.999.999-99', 'PEDRO TAYLON DE CARVALHO',1,2);

INSERT INTO coordenador (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, cpf_cnpj, nome, curso_id, usuario_id) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, '999.999.999-99', 'MARIA AUGUSTA SILVA',1,3);


INSERT INTO disciplina (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome, nota) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'PAS',70.0);
INSERT INTO disciplina (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome, nota) VALUES (2, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'DAS',99.0);
INSERT INTO disciplina (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome, nota) VALUES (3, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'PP',88.0);
INSERT INTO disciplina (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome, nota) VALUES (4, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'APA',80.0);
INSERT INTO disciplina (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome, nota) VALUES (5, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'NET',84.0);
INSERT INTO disciplina (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, nome, nota) VALUES (6, '18/08/2015','admin', '18/08/2015', 'admin', 0, 'ASW',79.0);

INSERT INTO matricula (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, aluno_id, periodo) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, 1, '01/02/2015');
INSERT INTO matricula (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, aluno_id, periodo) VALUES (2, '18/08/2015','admin', '18/08/2015', 'admin', 0, 2, '01/02/2015');

INSERT INTO secretaria (id, data_criacao, usuario_criacao, data_ult_alteracao, usuario_ult_alteracao, versao, cpf_cnpj, nome, usuario_id) VALUES (1, '18/08/2015','admin', '18/08/2015', 'admin', 0, '999.999.999-99', 'ROSELI APARECIDA SILVA',4);

INSERT INTO aluno_matricula (aluno_id, matriculas_id) VALUES (1,1);
INSERT INTO aluno_matricula (aluno_id, matriculas_id) VALUES (2,2);

INSERT INTO curso_aluno (alunos_id, curso_id) VALUES (1,1);
INSERT INTO curso_aluno (alunos_id, curso_id) VALUES (2,1);

INSERT INTO curso_disciplina (disciplinas_id, curso_id) VALUES (1,1);
INSERT INTO curso_disciplina (disciplinas_id, curso_id) VALUES (2,1);
INSERT INTO curso_disciplina (disciplinas_id, curso_id) VALUES (4,1);
INSERT INTO curso_disciplina (disciplinas_id, curso_id) VALUES (5,1);
INSERT INTO curso_disciplina (disciplinas_id, curso_id) VALUES (6,1);

INSERT INTO disciplina_aluno (disciplina_id, alunos_id) VALUES (1,1);
INSERT INTO disciplina_aluno (disciplina_id, alunos_id) VALUES (1,2);

-----------------------------------------------------------------------------------------------------------------