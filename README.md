<h2>Projeto desenvolvido durante o bootcamp Java Developes da Digital Innovation One</h2>

<h1>Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h1>


Durante a sessão, foram desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no HEROKU basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
https://personapi-dio-diego.herokuapp.com/api/v1/people

```
Durante a aula Foi implementado um CRUD, para cadastrar uma pessoa a API espera um Jason no formato abaixo:

```
	{
       "firstName": "Diego",
	    "lastName" : "Freitas", 
	    "cpf": "369.333.878-79",
	    "phones" : [
	        {
	            "type":"MOBILE",
	            "number":"71 99999-9999" 
	    	  }
	    ]
   }

```
Foram implementados um método findAll que retorna todos os registros e um método findById que recebe através da requisição GET um ID.
Um método delete que recebe através da requisição DELETE um ID.
Um método updateByID recebe através da requisição PUT um ID.



Caso queira rodar localmente o projeto são necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Muita vontade de aprender e compartilhar conhecimento :)


[Neste link](https://drive.google.com/file/d/1crVPOVl6ok2HeYjh3fjQuGQn2lDZVHrn/view?usp=sharing), seguem os slides apresentados pelo autor o roteiro utilizado para o desenvolvimento do projeto.

A aula foi ministrada por Rodrigo Peleias na plataforma da Digital Innovation One.



