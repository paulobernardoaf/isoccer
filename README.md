# isoccer

## 1. Funcionalidades: 

* #### Login

  <div>
    <p>Permimte ao usuário, entrar no sistema. Devem ser fornecidos login e senha.</p>
  </div>
  
* #### Adicionar um Funcionário

  <div>
      <p> Adiciona um funcionário em sua respecitiva lista : Funcionários gerais, jogadores, diferenciando se é um técnico ou não. Devem ser fornecidos o nome, email, cpf, telefone, salário, tipo de funcionário. </p>
  </div>
    
* #### Listar todos os Funcionários

  <div> 
    <p> Percorre as listas de funcionários e mostra ao usuário os detalhes de cada um. </p>
  </div>
    
* #### Adicionar um Sócio-Torcedor

    <div>
        <p> Adiciona na lista de sócios um novo sócio. Deve ser informado nome, email, cpf, telefone, endereço, estado(adimplente ou inadimplente) e o tipo de Sócio-torcedor. </p>
    </div>
    
* ####	Listar todos os Sócio-Torcedores

    <div>
      <p> Percorre a lista de Sócios e mostra as informações de cada um</p>
    </div>
    
* ####	Atualizar os valores de Contribuição dos Sócio-Torcedores

    <div>
      <p> Altera o valor de contribuição para determinado tipo de sócio. Devem ser informados o tipo do sócio a ser alterado e o novo valor. </p>
    </div>

* #### Adicionar Recursos Físicos (Ônibus, Estádio, Centro de Treinamento)

    <div>
      <p> Adiciona um novo recurso físico ao sistema. Deve ser informado o tipo de recurso e as respectivas informações de cada. </p>
    </div>
    
* ####	Listar informações sobre os recursos

    <div>
      <p> Mostra quantos Ônibus estão cadastrados, as informações do estádio(quantidade de banheiros, quantidade de lanchonetes, lotação) e as informações do centro de treinamento(quantidade de dormitórios). </p>
    </div>

* #### Relatórios

    <div>
        <p> Mostra um relatório individual de Funcionários, Recursos Físicos, Sócio-Torcedores ou um relatório completo que inclui os 3.</p>
    </div>

## 2. Classes:

* #### Pessoa: (classe abstrata)
  
  	<div>
    	<p>
    	 	<b>Motivação</b>: Necessidade de criar uma classe que contivesse todas as informações básicas que são compartilhadas entre as Classes Funcionário, Sócio.<br>
              <b>Solução</b>: <br> <a href="https://imgur.com/gb4psl2"><img src="https://i.imgur.com/gb4psl2.png" title="source: imgur.com" /></a> <br>
      		<b>Vantagens</b>: Fácil manutenção para as suas sub-classes <br>
      		<b>Desvantagens</b>: Nenhuma.
      	</p>
  	</div>
    
* #### Funcionario: (classe abstrata)

	<div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que contivesse todas as informações que as classes: Advogado, Cozinheiro, Jogador, Médico, Motorista, Preparador Físico, Presidente, Técnico; possuem em comum. <br>
            <b>Solução</b>: <br> <a href="https://imgur.com/Y77nIZO"><img src="https://i.imgur.com/Y77nIZO.png" title="source: imgur.com" /></a> <br> <p> Onde sua superclasse é a classe Pessoa. </p>
		    <b>Vantagens</b>: Fácil manutenção para as suas sub-classes. <br>
		    <b>Desvantagens</b>: Nenhuma    
        </p>
    </div>
		
	
* #### Socio: (classe abstrata)

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que contivesse todas as informações que as classes: Socio Júnior, Sócio Sênior, Sócio Elite possuem em comum. <br>
            <b>Solução</b>: <br> <a href="https://imgur.com/D6kmVuO"><img src="https://i.imgur.com/D6kmVuO.png" title="source: imgur.com" /></a> <br>
		    <b>Vantagens</b>: Fácil manutenção para as suas sub-classes. <br>
		    <b>Desvantagens</b>: Nenhuma
        </p>
    </div>
		
    
* #### Recursos: (classe abstrata)

    <div>
        <p>
            <b>Motivação</b>: Classe criada somente para organização da estrutura do código, não possui atributos nem métodos. <br>
		    <b>Vantagem</b>: Melhor organização da estrutura do código. <br>
		    Desvantagem: Nenhuma 
        </p>
    </div>
		
    
* #### Advogado:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um advogado. <br>
            <b>Solução</b>: Criar a classe Advogado. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### Cozinheiro:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um cozinheiro. <br>
            <b>Solução</b>: Criar a classe Cozinheiro. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
		
    
* #### Jogador:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um jogador. <br>
            <b>Solução</b>: Criar a classe Jogador. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
		
    
* #### Medico:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um médico. <br>
            <b>Solução</b>: Criar a classe Medico. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
		
    
* #### Motorista:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um motorista. <br>
            <b>Solução</b>: Criar a classe Motorista. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
		
    
* #### PreparadorFisico:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um preparador físico. <br>
            <b>Solução</b>: Criar a classe PreparadorFisico. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### Presidente:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um presidente. <br>
            <b>Solução</b>: Criar a classe Presidente. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### Tecnico:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um técnico. <br>
            <b>Solução</b>: Criar a classe Tecnico. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### CentroDeTreinamento:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um centro de treinamento. <br>
            <b>Solução</b>: Criar a classe CentroDeTreinamento. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### Estadio:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um estádio. <br>
            <b>Solução</b>: Criar a classe Estadio. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### Onibus:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um ônibus. <br>
            <b>Solução</b>: Criar a classe Onibus. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
    
* #### SocioJunior:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um sócio-júnior. <br>
            <b>Solução</b>: Criar a classe SocioJunior. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>

* #### SocioSenior:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um sócio-sênior. <br>
            <b>Solução</b>: Criar a classe SocioSenior. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>

* #### SocioElite:

    <div>
        <p>
            <b>Motivação</b>: Necessidade de criar uma classe que representasse um sócio-elite. <br>
            <b>Solução</b>: Criar a classe SocioElite. <br>
            <b>Vantagem</b>: Melhor manuntenção. <br>
            <b>Desvantagem</b>: Nenhuma.
        </p>
    </div>
