# SmartSUS

API Designada para o sistema de controle do aplicativo SmartSus, um aplicativo revolucionário que ajuda clientes a encontrar médicos próximos a preços justos. Com um simples toque no seu smartphone, você pode encontrar médicos qualificados e experientes que atendem perto de você, economizando tempo e dinheiro.

## Endpoints

- Usuario
    - [Cadastrar](#cadastrar-despesa)
    - Listar todas
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
|celular|numero|sim| número de contato com o usuario

*Exemplo de requisição*

```js
{
    email: '',
    senha: '',
    celular: '',
}
```

*Resposta*

| código | descrição 
|--------|----------
|201| a despesa foi cadastrada com sucesso
|400| campos inválidos

### Detalhes Despesa

`GET` naofalindo/api/despesa/{id}

*Exemplo de resposta*

```js
{
    valor: 100.59,
    data: '2023-12-27',
    contaId: 1,
    categoriaId: 1,
    descricao: 'cinema com os amigos'
}
```

*Resposta*

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi encontrada despesa com esse ID
