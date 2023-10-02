#  Colecionador de Carros - Cloud Computing 
## Sobre o projeto
**🎓 Disciplina e instituição:** Repositório criado para o desenvolvimento back-end da disciplina de Cloud Computing do 4º período do semestre 2023.2 da instituição de ensino ***[IBMEC](https://www.ibmec.br/)***

**🎯Objetivo:** Esse projeto tem como objetivo o desenvolvimento de uma API Rest utilizando a linguagem de programação JAVA, em conjunto com SPRING BOOT e ferramentas de nuvem como a AZURE, onde o deploy será feito.

## Tabela de Conteúdo - Table of Content - TOC
1. 🚗 [Título do projeto](#colecionador-de-carros---cloud-computing) ☁️
2. ✍️ [Sobre o projeto](#sobre-o-projeto)
3. 📑 [Tabela de Conteúdo - Table of Content - TOC](#tabela-de-conteúdo---table-of-content---toc)
4. 🖥️ [Tecnologias utilizadas nesse projeto](#tecnologias-utilizadas-nesse-projeto)
5. 🏷️ [Tags de versões do software](#tags-de-versões-do-software)
6. 💚🧡 [Escopo das requisições no Swagger e Postman](#escopo-das-requisições-no-swagger-e-postman)
     **<details><summary>😎 Colecionador (clique aqui 🖱️👆)</summary>**
    
    - ✅ **[POST](#post-colecionador)**
    - ♻️ **[PUT](#put-colecionador)**
    - 🫳 **[GET](#get-colecionador)**
    - 📌 **[GET pelo ID](#get-pelo-id-do-colecionador)**
    - ❌ **[DELETE](#delete-colecionador)**
    </details>
    <details>
        
    **<summary>🏠 Endereço (clique aqui 🖱️👆)</summary>**
    
    - ✅ **[POST](#post-endereço)**
    - ♻️ **[PUT](#put-endereço)**
    - 🫳 **[GET](#get-endereço)**
    - 📌 **[GET pelo ID](#get-pelo-id-do-endereço)**
    - ❌ **[DELETE](#delete-endereço)**
    </details>
  
    <details>
        
    **<summary>🚗 Carro (clique aqui 🖱️👆)</summary>**
    
    - ✅ **[POST](#post-carro)**
    - ♻️ **[PUT](#put-carro)**
    - 🫳 **[GET](#get-carro)**
    - 📌 **[GET pelo ID](#get-pelo-id-do-carro)**
    - ❌ **[DELETE](#delete-carro)**
    </details>

7. 🔗 [URLs das Requisições de cada tabela](#urls-das-requisições-de-cada-tabela)
8. ⛔ [Mensagem de erro nas requisições](#mensagem-de-erro-nas-requisições)  

## Tecnologias utilizadas nesse projeto 
<div>
<a href="https://code.visualstudio.com" target="_blank"><img alt="VS-Code-logo-Icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white" />
<a href="https://www.java.com/pt-BR/" target="_blank"><img alt="Java-logo-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
<a href="https://spring.io" target="_blank"><img alt="Spring-boot-logo-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot" />
<a href="https://postman.com" target="_blank"><img alt="postman" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white" />
<a href="https://azure.microsoft.com/en-us/" target="_blank"><img alt="Azure -Microsoft" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/azure-%230072C6.svg?style=for-the-badge&logo=microsoftazure&logoColor=white" />
<a href="https://www.microsoft.com/pt-br/software-download/windows11" target="_blank"><img alt="Windows-11-logo-Icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/Windows_11-0078d4?style=for-the-badge&logo=windows-11&logoColor=white" />
<a href="https://github.com/" target="_blank"><img alt="github-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" />
<a href="https://git-scm.com/" target="_blank"><img alt="git-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white" />
<a href="https://swagger.io/" target="_blank"><img alt="swagger-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white" />
<a href="https://www.markdownguide.org/" target="_blank"><img alt="markdown-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white" />
<a href="https://maven.apache.org/" target="_blank"><img alt="markdown-icon" height="45" width="200" margin-right: 10px; src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
</div>

## Tags de versões do Software
➡️ **[Como funciona a numeração das tags ?](https://www.alura.com.br/artigos/versionamento-semantico-breve-introducao?utm_term=&utm_campaign=%5BSearch%5D+%5BPerformance%5D+-+Dynamic+Search+Ads+-+Artigos+e+Conte%C3%BAdos&utm_source=adwords&utm_medium=ppc&hsa_acc=7964138385&hsa_cam=11384329873&hsa_grp=111087461203&hsa_ad=645853715422&hsa_src=g&hsa_tgt=dsa-843358956400&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=EAIaIQobChMI5bbSwZK0gQMVDjrUAR0n9AA3EAAYAiAAEgKBzfD_BwE)**

- 🟢 **[V1.4.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.4.0)** ***NEW***
- 🟡 **[V1.3.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.3.0)** 
- 🟡 **[V1.2.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.2.0)**
- 🟡 **[V1.1.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.1.0)**
- 🟡 **[V1.0.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.0.0)**
  
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

## Escopo das requisições no Swagger e Postman
### Post Colecionador
**Adicionando todas as informações do colecionador, inclusive endereço e carro**

**Para adicionar um novo colecionar a base de dados, é preciso utilizar o body abaixo no formato JSON durante o envio da sua requisição e respeitar o tipo de dado que cada coluna da tabela suporta.**
```JSON
{
  "nome": "string",
  "sobrenome": "string",
  "nickname": "string",
  "cpf": "471.388.476-39",
  "email": "string",
  "enderecos": [
    {
      "logradouro": "string",
      "complemento": "string",
      "cidade": "string",
      "estado": "string",
      "cep": "50865-381"
    }
  ],
  "carros": [
    {
      "marca": "string",
      "modelo": "string",
      "cor": "string",
      "anoDeFabricacao": 2023,
      "velocidadeMaxima": 500,
      "quilometragem": 0
    }
  ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

**Adicionado apenas as informações do colecionar e deixando como null endereço e carro**
```JSON
{
  "nome": "string",
  "sobrenome": "string",
  "nickname": "string",
  "cpf": "471.388.476-39",
  "email": "string",
  "enderecos": null,
  "carros": null
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Put Colecionador 
**Alterando todas as informações do colecionador, inclusive endereço e carro**
```JSON
{
  "nome": "string",
  "sobrenome": "string",
  "nickname": "string",
  "cpf": "471.388.476-39",
  "email": "string",
  "enderecos": [
    {
      "logradouro": "string",
      "complemento": "string",
      "cidade": "string",
      "estado": "string",
      "cep": "50865-381"
    }
  ],
  "carros": [
    {
      "marca": "string",
      "modelo": "string",
      "cor": "string",
      "anoDeFabricacao": 2023,
      "velocidadeMaxima": 500,
      "quilometragem": 0
    }
  ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

**Alterando apenas as informações do colecionar e deixando como null endereço e carro**
```JSON
{
  "nome": "string",
  "sobrenome": "string",
  "nickname": "string",
  "cpf": "471.388.476-39",
  "email": "string",
  "enderecos": null,
  "carros": null
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Get Colecionador 
**Não é necessário adicionar nenhum body para essa requisição, apenas utilize a URL abaixo e você irá obter a informação de todos os colecionadores presente na base de dados.** 
```URL
localhost:8080/colecionador
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Get pelo id do Colecionador 
**Na URL dessa requisição é preciso informar o id do colecionador que você deseja obter as informações. Da mesma forma que no GET anterior, não é preciso adicionar um body para essa requisição** 
```URL
localhost:8080/colecionador/{id}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Delete Colecionador 
**Na URL dessa requisição é preciso informar o id do colecionador que você deseja Excluir da base de dados** 
```URL
localhost:8080/colecionador/{id}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Post Endereço 
**Adicionando todas as informações do endereço de um colecionador**

**Para adicionar um novo endereço a base de dados, é preciso utilizar o body abaixo no formato JSON durante o envio da sua requisição. É precsio adicionar também o ID do colecionador que irá obter esse endereço na URL da sua requisição, além de respeitar o tipo de dado que cada coluna da tabela suporta.**

```URL
localhost:8080/endereco/{idColecionador}
```

```JSON
{
  "logradouro": "string",
  "complemento": "string",
  "cidade": "string",
  "estado": "string",
  "cep": "60517-991"
}
```

### Put Endereço
**Alterando apenas as informações do endereço de um colecionador**
```URL
localhost:8080/endereco/{idColecionador}
```

```JSON
{
  "logradouro": "string",
  "complemento": "string",
  "cidade": "string",
  "estado": "string",
  "cep": "60517-991"
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Get Endereço 
**Não é necessário adicionar nenhum body para essa requisição, apenas utilize a URL abaixo e você irá obter a informação de todos os endereços presente na base de dados.** 
```URL
localhost:8080/endereco
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Get pelo id do Endereço
**Na URL dessa requisição é preciso informar o id do endereço que você deseja obter as informações. Da mesma forma que no GET anterior, não é preciso adicionar um body para essa requisição** 
```URL
localhost:8080/endereco/{id}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Delete Endereço 
**Na URL dessa requisição é preciso informar o id do colecionador que você deseja Excluir da base de dados** 
```URL
localhost:8080/endereco/{id}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Post Carro
**Adicionando todas as informações do carro**

**Para adicionar um novo carro a base de dados, é preciso utilizar o body abaixo no formato JSON durante o envio da sua requisição e respeitar o tipo de dado que cada coluna da tabela suporta. Além de adicionar o ID do colecionador na requisição**
```JSON
{
  "marca": "string",
  "modelo": "string",
  "cor": "string",
  "anoDeFabricacao": 2023,
  "velocidadeMaxima": 500,
  "quilometragem": 0
}
```
```URL
localhost:8080/carro/{idColecionador}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Put Carro
**Alterando apenas as informações do carro de um colecionador**
```URL
localhost:8080/carro/{id}
```
```JSON
{
  "logradouro": "string",
  "complemento": "string",
  "cidade": "string",
  "estado": "string",
  "cep": "60517-991"
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Get Carro 
**Não é necessário adicionar nenhum body para essa requisição, apenas utilize a URL abaixo e você irá obter a informação de todos os carros presentes na base de dados.** 
```URL
localhost:8080/carro
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Get pelo id do Carro
**Na URL dessa requisição é preciso informar o ID do carro que você deseja obter as informações. Da mesma forma que no GET anterior, não é preciso adicionar um body para essa requisição** 
```URL
localhost:8080/carro/{id}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Delete Carro 
**Na URL dessa requisição é preciso informar o ID do carro que você deseja Excluir da base de dados** 
```URL
localhost:8080/carro/{id}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### URLs das Requisições de cada tabela

| Tabela                               |     Tipo da Requisição      | URL |                                                                                                   
|:------------------------------------ | :-------------------------: | :----------------------------------- | 
|    😎 Colecionador                  |     ✅ POST                 | `localhost:8080/colecionador`                      |                                                                                                                                  
|    😎 Colecionador                  |     ♻️ PUT                  | `localhost:8080/colecionador/{id}`                 | 
|    😎 Colecionador                  |     🫳 GET                  | `localhost:8080/colecionador`                      | 
|    😎 Colecionador                  |   📌 GET pelo ID            | `localhost:8080/colecionador/{id}`                 | 
|    😎 Colecionador                  |    ❌ Delete                | `localhost:8080/colecionador/{id}`                 |                                                                                                                                  
|                                     |                              |                                                    |                                                                                                                                  
|    🏠 Endereço                      |     ✅ POST                 | `localhost:8080/endereco/{idColecionador}`         |                                                                                                                                  
|    🏠 Endereço                      |     ♻️ PUT                  | `localhost:8080/endereco/{id}`                     | 
|    🏠 Endereço                      |     🫳 GET                  | `localhost:8080/endereco`                          | 
|    🏠 Endereço                      |   📌 GET pelo ID            | `localhost:8080/endereco/{id}`                     | 
|    🏠 Endereço                      |    ❌ Delete                | `localhost:8080/endereco/{id}`                     |   
|                                      |                             |                                                    |                                                                                                                                  
|    🚗 Carro                         |     ✅ POST                 | `localhost:8080/carro/{idColecionador}`            |                                                                                                                                  
|    🚗 Carro                         |     ♻️ PUT                  | `localhost:8080/carro/{id}`                        | 
|    🚗 Carro                         |     🫳 GET                  | `localhost:8080/carro`                             | 
|    🚗 Carro                         |   📌 GET pelo ID            | `localhost:8080/carro/{id}`                        | 
|    🚗 Carro                         |    ❌ Delete                | `localhost:8080/carro/{id}`                        |    

**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

### Mensagem de erro nas requisições

```JSON
{
    "errorMessage": "Aconteceu um problema ao processar sua solicitação",
    "errors": [
        {
            "field": "405 Method Not Allowed",
            "message": "Método HTTP não suportado, verifique a rota da sua URL."
        }
    ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

```JSON
{
    "errorMessage": "Aconteceu um problema ao processar sua solicitação",
    "errors": [
        {
            "field": "404 Not Found",
            "message": "A página ou recurso solicitado não foi encontrado, verifique a rota da sua URL."
        }
    ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

```JSON
{
    "errorMessage": "Aconteceu um problema ao processar sua solicitação",
    "errors": [
        {
            "field": "400 Bad Request",
            "message": "Requisição inválida, verifique os dados enviados."
        }
    ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**


```JSON
{
    "errorMessage": "Aconteceu um problema ao processar sua solicitação",
    "errors": [
        {
            "field": "cpf",
            "message": "cpf não está em um formato válido"
        },
        {
            "field": "cpf",
            "message": "O campo cpf não pode ser vazio"
        },
        {
            "field": "sobrenome",
            "message": "O campo nome não pode ser vazio"
        },
        {
            "field": "nome",
            "message": "O campo nome não pode ser vazio"
        },
        {
            "field": "email",
            "message": "O campo email não pode ser vazio"
        }
    ]
}
```

```JSON
{
    "errorMessage": "Aconteceu um problema ao processar sua solicitação",
    "errors": [
        {
            "field": "estado",
            "message": "O campo estado não pode ser vazio"
        },
        {
            "field": "cidade",
            "message": "O campo cidade não pode ser vazio"
        },
        {
            "field": "complemento",
            "message": "O campo complemento não pode ser vazio"
        },
        {
            "field": "cep",
            "message": "cpf não está em um formato válido"
        },
        {
            "field": "cep",
            "message": "O campo cep não pode ser vazio"
        },
        {
            "field": "logradouro",
            "message": "O campo logradouro não pode ser vazio"
        }
    ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**

```JSON
{
    "errorMessage": "Aconteceu um problema ao processar sua solicitação",
    "errors": [
        {
            "field": "velocidadeMaxima",
            "message": "O campo velocidade máxima não pode ser maior que 550"
        },
        {
            "field": "cor",
            "message": "O campo cor não pode ser vazio"
        },
        {
            "field": "quilometragem",
            "message": "A quilometragem deve ser maior ou igual a 0"
        },
        {
            "field": "modelo",
            "message": "O campo modelo não pode ser vazio"
        },
        {
            "field": "marca",
            "message": "O campo marca não pode ser vazio"
        },
        {
            "field": "anoDeFabricacao",
            "message": "O ano de fabricação deve ser maior ou igual a 1885"
        }
    ]
}
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo---table-of-content---toc)**
