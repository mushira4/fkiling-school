# Fkiling School

## Case

Frankiling é um cara inovador, sempre a frente no seu tempo de tanto estudar resolveu ter uma escola.
A escola de Frankiling não poderia ser uma escola normal era uma escola digital. Chamada Fkiling School.
Após testar vários modelos de ensino web e trabalhar junto ao sebrae Frankiling chegou ao modelo ideal.
Atualmente conta com + 4000 alunos mês que pagam R$ 20,00 mensal e tem acesso a uma educação básica
complementar como (Curso de excel, auto-ajuda, exoterismo, cultura religiosa, histórias da bíblia, Elétrica básica e etc) as aulas são previamente
gravadas e disponibilizadas para o aluno. Cada professor ganha 1 real por aula.
Frankiling mantinha todo o modelo através de infinitas planilhas de excel e chegou a hora de colocar uma espinha dorsal digital na empresa.
A EDD será responsável por gerenciar os alunos, os professores, pagamentos, e cursos.
Usando todo o conhecimento adquirido, desenvolva:
* Business Process Map.
* Destaque as Fitness Functions.
* Context Map.
* Selecionando os bounded Context e destacando os Microservices que vamos desenvolver.

## Estorias

Alunos:
Efetuam o cadastro via web, com poucas informações: {Nome,
nascimento, cidade, estado, nível educacional, profissão, Cartão de
Crédito}.
Alunos podem realizar o CRUD das suas informações e dispõem de um
painel com os cursos que querem executar, dar nota e gerar diploma e a
possibilidade de enviar uma mensagem.
Cursos:
Cursos são cadastrados com informações básicas: {Nome, Descrição e link
para o video e professor}
O CRUD de cursos também pode ser realizado e cada curso tem uma nota
aplicada pelo aluno.
Professor:
Dispõe de uma lista de cursos que é responsável por resolver as
mensagens e uma conta com o resumo financeiro que mostra o quanto
ganhou por curso executado.
Pagamentos-Financeiro:
Professores e alunos acessam esta funcionalidade para pagar e receber
pelos cursos.