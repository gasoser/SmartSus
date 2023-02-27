# SmartSUS

API Designada para o sistema de controle do aplicativo SmartSus, um aplicativo revolucionário que ajuda clientes a encontrar médicos próximos a preços justos. Com um simples toque no seu smartphone, você pode encontrar médicos qualificados e experientes que atendem perto de você, economizando tempo e dinheiro.

## Endpoints

- Despesa
    - [Cadastrar](#cadastrar-despesa)
    - Listar todas
    - Apagar
    - Atualizar
    - [Detalhes](#detalhes-despesa)
- Receitas
    - Cadastrar
    - Listar todas
    - Apagar
    - Atualizar
    - Detalhes

### Cadastrar Despesa

`POST` /naofalindo/api/despesa

*Campos de requisição*

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|valor|decimal positivo|sim| o valor da despesa
|data|data|sim| a data da despesa
|contaId|inteiro|sim| o id de uma conta previamente cadastrada
|categoriaId|inteiro|sim| o id de uma categoria previamente cadastrada
|descricao|texto|não| um texto sobre a despesa

*Exemplo de requisição*

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
