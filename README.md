<h1 align="center">
LinkHub
</h1>

LinkHub é uma aplicação web desenvolvida em Java utilizando Spring Boot que permite a criação, leitura, atualização e deleção (CRUD) de informações de usuários. A aplicação foi projetada para facilitar o gerenciamento de informações profissionais, incluindo nome, sobrenome, cargo, URL do portfólio e email.

Este é um projeto pessoal, e futuras melhorias e novas funcionalidades estão planejadas para aprimorar ainda mais a aplicação.
## Tecnologias

- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- MySQL Driver

### Localmente
1 - Clonar repositório git

```
  https://github.com/gVieiraX/LinkHub
```

2- Instale as dependências com Maven


## API Endpoints

A API poderá ser acessada em [localhost:8080](http://localhost:8080/linkhub). O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

O campo **id** é uma PK (Primary Key) e é gerado de forma automática, e os campos de **urlPortfolio** e **email** são únicos para cada perfil .

Para fazer as requisições HTTP abaixo, foi utilizado o Postman:

- POST /linkhub - Registar um novo perfil
```
{     "nome" :"Gabriel",
      "sobrenome": "Vieira",
      "cargo":"Software Engineer",
      "urlPortfolio": "https://portfoliogvieira.netlify.app/,
      "email": "gabriel@hotmail.com"
}
```

- GET /linkhub - Mostra todos os perfis 

```
[
    {
      "id": 1,
      "nome": "Gabriel",
      "sobrenome": "Vieira",
      "cargo":"Software Engineer",
      "urlPortfolio": "https://portfoliogvieira.netlify.app/,
      "email": "gabriel@hotmail.com"
    },
    {
        "id": 2,
        "nome": "Pedro",
        "sobrenome": "Vieira",
        "cargo": "Software Engineer",
        "urlPortfolio": "portfolio@vercel.com",
        "email": "pedro@hotmail.com"
    }
]

```
- GET /linkhub/{id} - Mostra todos os perfis buscando pelo id

```
    {
        "id": 2,
        "nome": "Pedro",
        "sobrenome": "Vieira",
        "cargo": "Software Engineer",
        "urlPortfolio": "portfolio@vercel.com",
        "email": "pedro@hotmail.com"
    }
```

- PUT /linkhub - Atualiza o perfil

```
{     
      "id":1,
      "nome" :"Gabriel UP",
      "sobrenome": "Vieira UP",
      "cargo":"Software Engineer UP",
      "urlPortfolio": "https://portfoliogvieira.netlify.app/ UP,
      "email": "gabriel@hotmail.com UP"
}
```

- DELETE /linkhub/{id} - Deleta algum perfil
```
 Usuário com id: 1 foi deletado com sucesso
```

