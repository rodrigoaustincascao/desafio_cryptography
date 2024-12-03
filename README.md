# Cryptography

Desafio da Backend-BR pode ser acessado no [GitHub](https://github.com/backend-br/desafios/blob/master/cryptography/PROBLEM.md).

O Desafio visa implementar a criptografia em um serviço de forma transparente para a API e para as camadas de serviço de sua aplicação. O objetivo é garantir que os campos sensíveis dos objetos de entidade não sejam visíveis diretamente, realizando a criptografia em tempo de execução durante a conversão da entidade para a coluna correspondente no banco de dados, e vice-versa.

## Tecnologias
- Spring Boot
- Docker Compose
- Mysql

## Endpoints
- List All
```bash
curl --request GET \
  --url http://localhost:8080/transactions \
  --header 'User-Agent: insomnia/10.0.0'
```

- FindById
```bash
curl --request GET \
  --url http://localhost:8080/transactions/1 \
  --header 'User-Agent: insomnia/10.0.0'
```

- Delete
```bash
curl --request DELETE \
  --url http://localhost:8080/transactions/1 \
  --header 'User-Agent: insomnia/10.0.0'
```

- Create
```bash
curl --request POST \
  --url http://localhost:8080/transactions \
  --header 'Content-Type: application/json' \
  --header 'User-Agent: insomnia/10.0.0' \
  --data '{
	"userDocument":"123",
	"creditCardToken": "11111",
	"transactionValue":500
}'
```

- Update
```bash
curl --request PUT \
  --url http://localhost:8080/transactions/2 \
  --header 'Content-Type: application/json' \
  --header 'User-Agent: insomnia/10.0.0' \
  --data '{
	"transactionValue":1500
}'
```