# Comparação entre JDBC e JPA

Este repositório contém dois projetos de exemplo para ajudar alunos a entender as diferenças práticas entre o uso do JDBC (Java Database Connectivity) e JPA (Java Persistence API). Os projetos estão organizados em duas pastas:

- `JDBC`: Contém um projeto utilizando o Java Database Connectivity (JDBC) como solução para persistência de dados.
- `JPA`: Contém um projeto utilizando o Java Persistence API (JPA) como solução para persistência de dados.


## Comparação entre JDBC e JPA

O JDBC é uma API de baixo nível que lida diretamente com a conexão, consulta e atualização de bancos de dados através do uso de SQL. Utilizar JDBC pode oferecer mais controle e flexibilidade em relação às operações de banco de dados, mas também pode ser mais complexo e exigir mais código. Já o JPA é uma API de alto nível que simplifica o processo de persistência de dados, fornecendo uma abstração sobre o JDBC. Ele permite que os desenvolvedores trabalhem diretamente com objetos e classes de domínio, em vez de lidar com tabelas e SQL. A escolha entre JDBC e JPA dependerá das necessidades e preferências do projeto e do desenvolvedor.

## Como testar os projetos

1. Faça o deploy de cada projeto (JDBC e JPA) em um servidor de aplicação, como o Tomcat ou WildFly.
2. Após o deploy bem-sucedido, acesse o seguinte endereço usando um navegador ou uma ferramenta de teste de API, como o Postman: `http://localhost:8080/api/contato`
3. Realize uma requisição do tipo GET para obter a lista de contatos. Esta etapa deve ser feita para ambos os projetos (JDBC e JPA) para verificar o funcionamento e comparar os resultados.

## Contribuições

Sinta-se à vontade para criar issues, pull requests ou fazer fork do repositório para ajudar a melhorar o projeto.

## Licença e Isenção de Responsabilidade

Este projeto é de código aberto e está disponível sob a Licença MIT. Você tem liberdade para copiar, modificar e usar o projeto como desejar. No entanto, qualquer responsabilidade pelo uso do código é de sua inteira responsabilidade. Por favor, use-o por sua conta e risco.
