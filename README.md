# SmartSUS

API Designada para o sistema de controle do aplicativo SmartSus, um aplicativo revolucionário que ajuda clientes a encontrar médicos próximos a preços justos. Com um simples toque no seu smartphone, você pode encontrar médicos qualificados e experientes que atendem perto de você, economizando tempo e dinheiro.

## Endpoints

- Usuario
    - [Cadastrar](#cadastrar-despesa)
    - Listar todos
    - Apagar
    - Atualizar
- Clínica
    - Cadastrar
    - Listar todas
    - Apagar
    - Atualizar

### Cadastrar Usuario

`POST` /smartsus/api/usuario

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|email|texto|sim| E-mail para criar o cadastro
|senha|texto|sim| senha do usuário
|celular|texto|sim| número de contato com o usuario
|usuarioId|numero|sim| 

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

### Detalhes Despesa

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
