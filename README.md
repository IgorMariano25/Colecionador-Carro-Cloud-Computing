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
6. 💚 [Escopo das requisições no Swagger](#escopo-das-requisições-no-swagger)
     **<details><summary>😎 Colecionador</summary>**
    
    - ✅ [POST](#post)
    - ♻️ [PUT](#put)
    - 🫳 [GET](#get)
    - 📌 [GET pelo ID](#get-pelo-id)
    - ❌ [DELETE](#delete)
    </details>
    <details>
        
    **<summary>🏠 Endereço</summary>**
    
    - ✅ [POST](#post)
    - ♻️ [PUT](#put)
    - 🫳 [GET](#get)
    - 📌 [GET pelo ID](#get-pelo-id)
    - ❌ [DELETE](#delete)
    </details>
  
    <details>
        
    **<summary>🚗 Carro</summary>**
    
    - ✅ [POST](#post)
    - ♻️ [PUT](#put)
    - 🫳 [GET](#get)
    - 📌 [GET pelo ID](#get-pelo-id)
    - ❌ [DELETE](#delete)
    </details>
7. 🧡 [Escopo das requisições no Postman](#escopo-das-requisições-no-postman)
    **<details><summary>😎 Colecionador</summary>**
    
    - ✅ [POST](#post)
    - ♻️ [PUT](#put)
    - 🫳 [GET](#get)
    - 📌 [GET pelo ID](#get-pelo-id)
    - ❌ [DELETE](#delete)
    </details>
  
    <details>
        
    **<summary>🏠 Endereço</summary>**
    
    - ✅ [POST](#post)
    - ♻️ [PUT](#put)
    - 🫳 [GET](#get)
    - 📌 [GET pelo ID](#get-pelo-id)
    - ❌ [DELETE](#delete)
    </details>
  
    <details>
        
    **<summary>🚗 Carro</summary>**
    
    - ✅ [POST](#post)
    - ♻️ [PUT](#put)
    - 🫳 [GET](#get)
    - 📌 [GET pelo ID](#get-pelo-id)
    - ❌ [DELETE](#delete)
    </details>

8. 🔗 [Todas as URLs das requisições](#url-das-requisições)

## Tecnologias utilizadas nesse projeto 
<!-- <div>
  <a href="https://code.visualstudio.com" target="_blank"><img alt="VS-Code-logo-Icon" height="60" width="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg"/></a>
  <a href="https://www.java.com/pt-BR/" target="_blank"><img alt="Java-logo-icon" height="80" width="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg"/></a>
  <a href="https://spring.io" target="_blank"><img alt="Spring-boot-logo-icon" height="60" width="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg"/></a>
  <a href="https://postman.com" target="_blank"><img alt="postman" width="65" height="65" src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" /></a>
  <a href="https://azure.microsoft.com/en-us/" target="_blank"><img alt="Azure -Microsoft" width="80" height="80" src="https://www.vectorlogo.zone/logos/microsoft_azure/microsoft_azure-icon.svg" /></a>
  <a href="https://www.microsoft.com/pt-br/software-download/windows11" target="_blank"><img alt="Windows-11-logo-Icon" width="80" height="80" src="https://img.icons8.com/color/48/windows-11.png"/></a>
  <a href="https://git-scm.com/" target="_blank"><img alt="git-icon" width="70" height="70" src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg"/></a>
</div> -->

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
</div>

## Tags de versões do Software
➡️ **[Como funciona a numeração das tags ?](https://www.alura.com.br/artigos/versionamento-semantico-breve-introducao?utm_term=&utm_campaign=%5BSearch%5D+%5BPerformance%5D+-+Dynamic+Search+Ads+-+Artigos+e+Conte%C3%BAdos&utm_source=adwords&utm_medium=ppc&hsa_acc=7964138385&hsa_cam=11384329873&hsa_grp=111087461203&hsa_ad=645853715422&hsa_src=g&hsa_tgt=dsa-843358956400&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=EAIaIQobChMI5bbSwZK0gQMVDjrUAR0n9AA3EAAYAiAAEgKBzfD_BwE)**

- 🟢 **[V1.3.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.3.0)** ***NEW***
- 🟡 **[V1.2.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.2.0)**
- 🟡 **[V1.1.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.1.0)**
- 🟡 **[V1.0.0](https://github.com/IgorMariano25/Colecionador-Carro-Cloud-Computing/releases/tag/V1.0.0)**
  
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**

## Escopo das Requisições no Swagger
## Escopo das Requisições no Postman
## Colecionador
### POST 
🔗 [URL de requisição do Colecionador](#url-das-requisições)
```URL
localhost:8080/colecionador
```

**Adicionando todas as informações do colecionador, inclusive endereço e carro**
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
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**

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
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**

### PUT 
#### URL da requisição PUT colecionador
```URL
localhost:8080/colecionador/{id}
```
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
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**

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
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**

### GET 
#### URL da requisição GET colecionador
```URL
localhost:8080/colecionador/
```
**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**
</details>
</details>

### URL das Requisições

| Tipo da Requisição   | URL |                                                                                                                                                                                                                                  
| -------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | 
| POST                 |                   | 
| PUT                  |                   | 
| GET                  |                   | 
| GET pelo ID          |                   | 
| Delete               |                   | 

**[(🆙 voltar ao início do README.md)](#tabela-de-conteúdo)**
