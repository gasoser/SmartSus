# SmartSUS

API Designada para o sistema de controle do aplicativo SmartSus, um aplicativo revolucionário que ajuda clientes a encontrar médicos próximos a preços justos. Com um simples toque no seu smartphone, você pode encontrar médicos qualificados e experientes que atendem perto de você, economizando tempo e dinheiro.

## Endpoints

- Usuario
    - [Cadastrar](#cadastrar-usuario)
    - Listar todos
    - Atualizar
- Cartao virtual
    - Cadastrar
    - Listar todos
    - Apagar
- Agendamento
    - Cadastrar
    - Listar todos
    - Apagar
    - Atualizar
- Clínica
    - Cadastrar
    - Listar todas
    - Apagar
    - Atualizar

### Cadastrar usuario

`POST` /smartsus/api/usuario

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|email|texto|sim| e-mail para criar o cadastro
|senha|texto|sim| senha do usuário
|celular|texto|sim| número de contato com o usuario
|usuarioId|inteiro|sim| id do usuario criado pelo sistema

*Exemplo de requisição*

```js
{
    email: 'shaolin@gmail.com',
    senha: 'aArFha251',
    celular: '(11)9 9999-9999',
    usuarioId: 1
}
```

*Resposta*

| código | descrição 
|--------|----------
|201| o usuario foi cadastrado com sucesso
|400| campos inválidos

### Detalhes Conta

`GET` smartsus/api/usuario/{id}

*Exemplo de resposta*

```js
{
    email: 'shaolin@gmail.com',
    senha: 'aArFha251',
    celular: '1199999-9999',
    usuarioId: 1
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrado usuario com esse ID

### Atualizar dados da conta

`PATCH` smartsus/api/usuario/{id}

*Exemplo de requisição*

```js
{
    email: 'shaolindeporco@gmail.com',
    senha: 'DaG14@S',
    celular: '(11)9 8888-8888',
    usuarioId: 1
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram alterados com sucesso
|400| campos invalidos para alteracao
|404| não foi encontrado usuario com esse ID


--------------------------------------------


### Cadastrar cartao

`POST` /smartsus/api/cartao/{id}

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|numero|inteiro|sim| numero do cartao
|nome|texto|sim| nome do cartao
|validade|data|sim| validade do cartao
|cvv|inteiro|sim| digito do cartao
|cpf|texto|sim| cpf do titular
|usuarioId|inteiro|sim| id do usuario previamente criado

*Exemplo de requisição*

```js
{
    numero: 1234 5678 1234 5678,
    nome: 'Carthanos',
    validade: '01/27',
    cvv: 123,
    cpf: '123.456.789-10',
    usuarioId: 1
}
```

*Resposta*

| código | descrição 
|--------|----------
|201| o usuario foi cadastrado com sucesso
|400| campos inválidos
