<a name="readme-top"></a>

<p align="center">
   <a href="https://ibb.co/5x8R7VV"><img src="src/main/java/com/monitora/estagio/ceara/resources/img/banner.png" alt="BANNER" border="0"></a>
</p>
&nbsp;


![GitHub Repo size](https://img.shields.io/github/repo-size/fernandacostads/monitora-estagios-ceara)
![GitHub issues](https://img.shields.io/github/issues/fernandacostads/monitora-estagios-ceara)
![Build with Maven](https://img.shields.io/badge/Build%20with-Maven-brightblue)
[![Java Version](https://img.shields.io/badge/Java-21-red)](https://docs.oracle.com/javase/21/docs/api/)
![Open Source](https://img.shields.io/badge/Open%20Source-Yes-green)


# Monitora Estagios Ceará - JAVA APP ☕
O projeto * Monitora Estagios Cearáa* é uma aplicação em Java desenvolvida como parte de um sistema de consulta de estágios em órgãos públicos do Ceará. A aplicação tem como objetivo principal facilitar o processo de consulta de estágios em órgãos do Estado, melhorando a experiência para pessoas que desejam obter dados rapidamente e de maneira filtrada.

- <a href="#intro">Introdução</a>
- <a href="#arq">Arquitetura de Pastas do projeto</a>
- <a href="#meto">A metodologia</a>
- <a href="#demo">Demonstração do APP</a>
- <a href="#fluxo">Fluxo para consultar número de contratação</a>
- <a href="#acao">Ações</a>
- <a href="#front">Interface - Java Swing</a>


## Introdução ☕
<a name="intro"></a>
Ao longo do módulo de Técnicas de Programação, nos aprofundamos nos conceitos e aplicações envolvendo Programação Funcional e Paralela, Stream, Optional, operadores intermediários, e terminais além de Datas e java.time.
Aqui você vai encontrar a resolução do projeto final, onde desenvolvemos uma aplicação utilizando os novos conhecimentos adquiridos.

## Arquitetura de Pastas do projeto ☕
<p align="center">
   <a href="https://ibb.co/5kTD1x9"><img src="src/main/java/com/monitora/estagio/ceara/resources/img/Monitora-estagios-ceara.drawio.png" alt="Monitora-estagios-ceara-drawio"></a>
</p>
<p align="center"> Figura: Organização de pastas do projeto na data de 08/04/24</p>

## A Metodologia ☕
<a name="meto"></a>

<p align="center">
   <a href="https://ibb.co/NZJjLQs"><img src="https://i.ibb.co/bzCBrqP/project.gif" alt="project" border="0"></a>
</p>

<p align="center"> Figura: Quadro de tarefas do projeto</p>

Foi utilizada uma abordagem de resolução de problemas e desenvolvimento de software.

Algumas etapas do desenvolvimento foram:

**1. Entendimento do problema:** Procuramos entender os requisitos do negócio e os objetivos a serem alcançados.

**2. Planejamento:** Dividimos o problema em partes menores e mais gerenciáveis. Isso ajudou a abordar cada etapa de forma mais eficaz.

**3. Escolha da metodologia de desenvolvimento:** Metodologias ágeis, usamos um quadro Kanban do Github projects, para lidar com organização e autogerenciamento.

**4. Implementação e Desenvolvimento:** A escolha das ferramentas adequadas para implementar a solução foi a mesma utilizada nos módulos anteriores: IntelliJ, Maven e Java 21. Além disso,  decidimos incluir mais um desafio como parte deste projeto para nosso aprendizados e experiência, que foi fazer implementações do Java Swing para criar um experiência mais agradável ao usuário. Utilizamos dados retirados da plataforama Ceará transparente. Cada csv utiliza uma thread para leitura.

**5. Documentação:** A documentação consiste na escrita deste README mantendo registros detalhados do processo de desenvolvimento, incluindo decisões, problemas encontrados e soluções implementadas e também este [documento de requisitos](https://docs.google.com/document/d/1g_un9bowROQZlsKhvoS9jDy1s0Kkgv37IYJxxCDf-AY/edit?usp=sharing) utilizado durante as reuniões de planning.

**6. Comunicação:** Fizemos dailys e reuniões regulares para assegurar que a solução proposta atendesse às expectativas do negócio.

🧰 Ferramentas úteis:

- Controle de versão:  Git. Também utilizamos Gitflow durante o desenvolvimento.
- Ambientes de Desenvolvimento Integrado -(IDEs): Visual Studio Code e IntelliJ.
- Plataformas de Gerenciamento de Projetos: - Github Projects.
- outros: Miro, Draw.io.

<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>

## Demonstração da Aplicação ☕
<a name="demo"></a>

 <p align="center">
  <a href="#">
   <img src="https://i.ibb.co/6B1vqvy/demo.gif" alt="demo" border="0">
  </a>
</p>

<p align="center"> Figura: Demonstração da aplicação</p>

## Fluxo para consultar número de contratação ☕
<a name="fluxo"></a>

<p align="center">
  <a href="https://ibb.co/kGWF5Q2"><img src="https://i.ibb.co/qDPw7kY/Screencastfrom08-04-2024131127-ezgif-com-video-to-gif-converter.gif" alt="Screencastfrom08-04-2024131127-ezgif-com-video-to-gif-converter" border="0"></a>
</p>

<p align="center"> Figura: Fluxo para consultar número de contratação</p>

## Ações ☕
<a name="acao"></a>
<h3>
Consultar número de contratação
</h3>

|Ação  | Descrição | Requer                         
--------------------------------------------------------------------------------------------------------------|------------|------------------------------|
| Consulta por contratação           | `CONSULTA`    | TODOS ÓRGÃOS   |
| Consulta por contratação                 | `CONSULTA`      | ÓRGÃO ESPECIFICO  | 
| Ordenação ascendente          | `ORDENA`    | TODOS ÓRGÃOS   |
| Ordenação descendente            | `ORDENA`    | TODOS ÓRGÃOS  |

<h3>
   Consultar por média salarial
</h3>

| Ação     | Descrição | Requer Tipo de Veículo                         
|--------------------------------------------------------------------------------------------------------------|------------|------------------------------|
| Consultar por média salarial               | `CONSULTA`     | TODOS ÓRGÃOS    |
| Consultar por média salarial               | `CONSULTA`      | ÓRGÃO ESPECIFICO    | 
| Ordenação ascendente                       | `ORDENA`    | TODOS ÓRGÃOS    |
|Ordenação descendente                    | `ORDENA`    | TODOS ÓRGÃOS   |


----------------------------------------------------------------------------------------------
<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>

##  Frontend: Java Swing ☕
<a name="front"></a>
Como já mencionado, utilizamos o  Java Swing, que é uma biblioteca de componentes de interface gráfica (GUI) para Java. Utilizamos alguns componentes e fizemos alguns personalizados. Foi interessante ver a flexibilidade e o comportamento dos componentes Swing.

### Telas
Algumas telas desenvolvidas:

<p align="center">
 <a href="https://ibb.co/kGWF5Q2"><img src="https://i.ibb.co/qDPw7kY/Screencastfrom08-04-2024131127-ezgif-com-video-to-gif-converter.gif" alt="Screencastfrom08-04-2024131127-ezgif-com-video-to-gif-converter" border="0"></a>
</p>
<p align="center">
<a href="https://ibb.co/VVX7mRJ"><img src="src/main/java/com/monitora/estagio/ceara/resources/img/semace.png"></a>
</p>

### Dados

Os dados utilizados como fonte compreendem 4 conjuntos de dados no formato CSV obtidos da plataforma [Ceará Transparente](https://cearatransparente.ce.gov.br/portal-da-transparencia/servidores?locale=pt-BR&__=__). Foram selecionados dados abrangendo o período de 2021 a 2024, os quais foram organizados e compilados por ano.

### Pastas

Por padrão, estamos usando a pasta `view` para armazenar e manipularmos as interfaces e implementações referentes ao frontend.


## 🤝 Colaboradores
<a name="contribua"></a>
<table align="center"><tr>
 <td align="center"><a href="https://github.com/fernandacostads" target="_blank"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/59060824?v=4" width="100px;" alt=""/>
    <br />
    <sub><b>Fernanda Costa</b></sub></a>

<br />
<a href="https://www.linkedin.com/in/fernandacostads/" alt="LinkedIn">
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=https://linkedin.com/in/fernandacostads" /></a>
</td>
    <td align="center"><a href="https://github.com/ma-elissa" target="_blank"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/128258713?v=4" width="100px;" alt=""/>
    <br />
    <sub><b>Maria Elissa</b></sub></a>

<br />
<a href="https://www.linkedin.com/in/elissatavares/" alt="LinkedIn">
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=https://linkedin.com/in/ma-elissa" /></a>
</td>
  </tr>
</table>


## 😄 Seja um dos contribuidores!
Quer fazer parte desse projeto? Para contribuir, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: git checkout -b <nome_branch>.
3. Faça suas alterações e confirme-as: git commit -m '<mensagem_commit>'
4. Envie para o branch original: git push origin <nome_do_projeto> / <local_>
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em como criar uma solicitação pull.
Clique [AQUI](https://opensource.guide/how-to-contribute/) e leia como contribuir.


## 📝 Licença
Esse projeto está sob licença. Veja o arquivo [LICENÇA](https://github.com/fernandacostads/monitora-estagios-ceara/blob/main/LICENSE.md) para mais detalhes.


<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>
<hr>
<p align="center">Copyright © 2024 | Monitora Estagios Cearaá by Fernanda Costa e Maria Elissa</p>