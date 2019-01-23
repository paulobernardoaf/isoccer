import abstrato.Funcionario;
import abstrato.Socio;
import funcionarios.*;
import recursosFisicos.CentroDeTreinamento;
import recursosFisicos.Estadio;
import recursosFisicos.Onibus;
import socios.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    ArrayList<Jogador> jogadores = new ArrayList<>();
    Tecnico tecnico = null;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Socio> socios = new ArrayList<>();
    ArrayList<Onibus> todosOsOnibus = new ArrayList<>();
    Estadio estadio = null;
    CentroDeTreinamento centroDeTreinamento = null;

    public boolean login() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Login base: admin || Senha base: admin");
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if(login.equals("admin") && senha.equals("admin")) {
            this.iniciar();
            return true;
        } else {
            return false;
        }

    }

    public void iniciar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao gerenciador do seu time.");

        while(true) {

            System.out.println("Escolha uma opção:\n" +
                    "(0) - Sair\n" +
                    "(1) - Adicionar Funcionário\n" +
                    "(2) - Listar Funcionários\n" +
                    "(3) - Adicionar Sócio-Torcedor\n" +
                    "(4) - Listar todos os Sócio-Torcedores\n" +
                    "(5) - Atualizar valores de contribuição\n" +
                    "(6) - Adicionar Recursos\n" +
                    "(7) - Informações sobres os Recursos\n" +
                    "(8) - Relatórios");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "0":
                    return;
                case "1":
                    registrarFuncionario();
                    break;
                case "2":
                    listarFuncionarios();
                    break;
                case "3":
                    regisrarSocioTorcedor();
                    break;
                case "4":
                    listarSocioTorcedores();
                    break;
                case "5":
                    atualizarContribuicao();
                    break;
                case "6":
                    adicionarRecursos();
                    break;
                case "7":
                    informacoesRecursos();
                    break;
                case "8":
                    relatorio();
                    break;
                default:
                    System.out.println("Digite uma escolha válida.");
            }

        }
    }

    public void registrarFuncionario() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo do funcionário a ser criado:\n" +
                "(1) - Presidente\n" +
                "(2) - Médico\n" +
                "(3) - Técnico\n" +
                "(4) - Preparador Físico\n" +
                "(5) - Motorista\n" +
                "(6) - Cozinheiro\n" +
                "(7) - Advogado\n" +
                "(8) - Jogador\n");

        String tipo = scanner.nextLine();

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do funcinário: ");
        String email = scanner.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o telefone do funcionário: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o salário do funcionario: ");
        double salario = Utilidades.lerDouble();

        switch (tipo) {
            case "1":
                Presidente funcionario = new Presidente(nome, email, cpf, telefone, salario);
                this.getFuncionarios().add(funcionario);
                break;
            case "2":
                System.out.println("Digite o CRM do funcionário: ");
                String crm = scanner.nextLine();
                Medico medico = new Medico(nome, email, cpf, telefone, salario, crm);
                this.getFuncionarios().add(medico);
                break;
            case "3":
                Tecnico tecnico = new Tecnico(nome, email, cpf, telefone, salario);
                this.tecnico = tecnico;
                break;
            case "4":
                PreparadorFisico preparadorFisico = new PreparadorFisico(nome, email, cpf, telefone, salario);
                this.getFuncionarios().add(preparadorFisico);
                break;
            case "5":
                System.out.println("Digite o numero de habilitação do funcionário: ");
                String habilitacao = scanner.nextLine();
                Motorista motorista = new Motorista(nome, email, cpf, telefone, salario, habilitacao);
                this.getFuncionarios().add(motorista);
                break;
            case "6":
                Cozinheiro cozinheiro = new Cozinheiro(nome, email, cpf, telefone, salario);
                this.getFuncionarios().add(cozinheiro);
                break;
            case "7":
                Advogado advogado = new Advogado(nome, email, cpf, telefone, salario);
                this.getFuncionarios().add(advogado);
                break;
            case "8":
                String tipoJogador = pegarTipoDeJogador();
                boolean aptoBool = true;
                System.out.println("O jogador está apto? \n" +
                        "(1) - Não\n" +
                        "(outro) - Sim");
                String apto = scanner.nextLine();
                if(apto.equals("1")) {
                    aptoBool = false;
                }
                Jogador jogador = new Jogador(nome, email, cpf, telefone, salario, tipoJogador, aptoBool);
                this.getJogadores().add(jogador);
                break;
            default:
                System.out.println("Tipo de funcionario invalido.");
                break;
        }

    }

    public void regisrarSocioTorcedor() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Sócio-Torcedor: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do Sócio-Torcedor: ");
        String email = scanner.nextLine();
        System.out.println("Digite o CPF do Sócio-Torcedor: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o telefone do Sócio-Torcedor: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o endereco do Sócio-Torcedor: ");
        String endereco = scanner.nextLine();
        System.out.println("O Sócio-Torcedor está adimplente ou inadimplente? \n" +
                "(1) - Adimplente\n" +
                "(2) - Inadimplente");
        String estado = scanner.nextLine();
        while(!estado.equals("1") && !estado.equals("2")) {
            System.out.println("Digite uma escolha válida.");
            estado = scanner.nextLine();
        }

        loop: while(true) {
            System.out.println("Digite o tipo de funcionário: \n" +
                    "(1) - Júnior\n" +
                    "(2) - Sênior\n" +
                    "(3) - Elite\n");

            String tipo = scanner.nextLine();
            switch (tipo) {
                case "1":
                    SocioJunior novoSocioJunior = new SocioJunior(nome, email, cpf, telefone, endereco, estado);
                    this.getSocios().add(novoSocioJunior);
                    break loop;
                case "2":
                    SocioSenior novoSocioSenior = new SocioSenior(nome, email, cpf, telefone, endereco, estado);
                    this.getSocios().add(novoSocioSenior);
                    break loop;
                case "3":
                    SocioElite novoSocioElite = new SocioElite(nome, email, cpf, telefone, endereco, estado);
                    this.getSocios().add(novoSocioElite);
                    break loop;
                default:
                    System.out.println("Digite um tipo válido.");
                    break;
            }
        }
    }

    public String pegarTipoDeJogador() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo do jogador:\n" +
                "(1) - Volante\n" +
                "(2) - Zagueiro\n" +
                "(3) - Meia\n" +
                "(4) - Goleiro\n" +
                "(5) - Atacante\n" +
                "(6) - Lateral Esquerdo\n" +
                "(7) - Lateral Direito\n");

        while(true) {

            String tipo = scanner.nextLine();

            switch (tipo) {
                case "1":
                    return "Volante";
                case "2":
                    return "Zagueiro";
                case "3":
                    return "Meia";
                case "4":
                    return "Goleiro";
                case "5":
                    return "Atacante";
                case "6":
                    return "Lateral Esquerdo";
                case "7":
                    return "Lateral Direito";
                default:
                    System.out.println("Digite um tipo válido: ");
            }

        }

    }

    public void listarSocioTorcedores() {

        System.out.println("Sócio-Torcedores: ");
        for(Socio socio : this.getSocios()) {
            System.out.println("\tNome: " + socio.getNome() +
                    "\n\tTipo: " + socio.tipo() +
                    "\n\tEstado: " + socio.getEstado() +
                    "\n\tContribuição: " + socio.getContribuicao());
        }

    }

    public void listarFuncionarios() {

        System.out.println("Funcionários: ");
        for(Funcionario funcionario : this.getFuncionarios()) {
            System.out.println("\tNome: " + funcionario.getNome() +
                    "\n\tTipo: " + funcionario.tipo() + "\n");

        }

        listarJogadores();


    }

    public void listarJogadores() {

        for(Jogador jogador : this.getJogadores()) {
            System.out.println("\tNome: " + jogador.getNome() +
                    "\n\t\tApto: " + (jogador.isApto() ? "Sim" : "Não"));
        }

    }

    public void atualizarContribuicao() {

        Scanner scanner = new Scanner(System.in);

        loop: while(true) {
            System.out.println("Digite o tipo de funcionário: \n" +
                    "(1) - Júnior\n" +
                    "(2) - Sênior\n" +
                    "(3) - Elite\n");

            String tipo = scanner.nextLine();

            System.out.println("Digite o novo valor: ");

            double valor = Utilidades.lerDouble();

            switch (tipo) {
                case "1":
                    SocioJunior.setContribuicao(valor);
                    break loop;
                case "2":
                    SocioSenior.setContribuicao(valor);
                    break loop;
                case "3":
                    SocioElite.setContribuicao(valor);
                    break loop;
                default:
                    System.out.println("Digite um tipo válido.");
                    break;
            }
        }

    }

    public void adicionarRecursos() {

        Scanner scanner = new Scanner(System.in);

        loop: while(true) {
            System.out.println("Digite o tipo do recurso: \n" +
                    "(1) - Ônibus\n" +
                    "(2) - Estádio\n" +
                    "(3) - Centro de Treinamento\n");

            String tipo = scanner.nextLine();

            switch (tipo) {
                case "1":
                    System.out.println("Digite a placa do Ônibus");
                    String placa  = scanner.nextLine();
                    Onibus onibus = new Onibus(placa);
                    todosOsOnibus.add(onibus);
                    break loop;
                case "2":
                    System.out.println("Digite o nome do estádio");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a lotacao do estadio:");
                    int lotacao = Utilidades.lerInteiro();
                    System.out.println("Digite a quantidade de lanchonetes que o estádio possui: ");
                    int lanchonetes = Utilidades.lerInteiro();
                    System.out.println("Digite a quantidade de banheiros que o estádio possui: ");
                    int banheiros = Utilidades.lerInteiro();
                    this.estadio = new Estadio(nome, lotacao, lanchonetes, banheiros);
                    break loop;
                case "3":
                    System.out.println("Digite a quantidade de dormitórios.");
                    int dormitorios = Utilidades.lerInteiro();
                    this.centroDeTreinamento = new CentroDeTreinamento(dormitorios);
                    break loop;
                default:
                    System.out.println("Digite um tipo válido.");
                    break;
            }
        }

    }

    public void informacoesRecursos() {

        if(this.todosOsOnibus.size() > 0) {
            System.out.println("Total de Ônibus: " + this.todosOsOnibus.size() +
                    "\nPlacas:");
            for(Onibus onibus : this.todosOsOnibus) {
                System.out.println("\t" + onibus.getPlaca());
            }
        } else {
            System.out.println("Não possui ônibus.");
        }

        if (this.estadio != null) {
            this.estadio.informacoes();
        } else {
            System.out.println("Não possui estádio.");
        }

        if (this.centroDeTreinamento != null) {
            System.out.println("Quantidade de dormitórios do centro de treinamento: " + this.centroDeTreinamento.getQuantidadeDeDormitorios());
        } else {
            System.out.println("Não possui centro de treinamento.");
        }

    }

    public void relatorio() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Relatório:");
        System.out.println("Escolha uma opção: \n" +
                "(1) - Relatório dos Funcionários\n" +
                "(2) - Relatório dos Recursos Físicos\n" +
                "(3) - Relatório dos Sócios-Torcedores\n" +
                "(4) - Relatório completo");
        loop: while(true) {

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    relatorioFuncionarios();
                    break loop;
                case "2":
                    informacoesRecursos();
                    break loop;
                case "3":
                    relatorioSocioTorcedor();
                    break loop;
                case "4":
                    informacoesTime();
                    System.out.println();
                    informacoesFuncionarios();
                    informacoesRecursos();
                    listarSocioTorcedores();
                    break loop;
                default:
                    System.out.println("Digite uma escolha válida.");
            }

        }

    }

    public void relatorioSocioTorcedor() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n" +
                "(1) - Quantidade\n" +
                "(2) - Adimplentes\n" +
                "(3) - Inadimplentes\n" +
                "(4) - Listar Todos");

        loop: while (true) {

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("Quantidade de Sócio-Torcedores: " + this.getSocios().size());
                    break loop;
                case "2":
                    listarAdimplentes();
                    break loop;
                case "3":
                    listarInadimplentes();
                    break loop;
                case "4":
                    listarSocioTorcedores();
                    break loop;
                default:
                    System.out.println("Ditgite uma escolha válida.");
            }

        }


    }

    public void listarAdimplentes() {

        System.out.println("Adimplentes: ");
        for (Socio socio : this.getSocios()) {
            if(socio.getEstado().equals("1")) {
                System.out.println("\tNome: " + socio.getNome());
            }
        }

    }

    public void listarInadimplentes() {

        System.out.println("Inadimplentes: ");
        for (Socio socio : this.getSocios()) {
            if(socio.getEstado().equals("2")) {
                System.out.println("\tNome: " + socio.getNome());
            }
        }

    }

    public void relatorioFuncionarios() {

        Scanner scanner = new Scanner(System.in);


        loop: while(true) {

            System.out.println("Escolha uma opção: \n" +
                    "(1) - Listar informações do Time\n" +
                    "(2) - Listar informações dos funcionários\n" +
                    "(3) - Listar tudo");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    informacoesTime();
                    break loop;
                case "2":
                    informacoesFuncionarios();
                    break loop;
                case "3":
                    informacoesTime();
                    System.out.println();
                    informacoesFuncionarios();
                    break loop;
                default:
                    System.out.println("Digite uma escolha válida.");
            }

        }




    }

    public void informacoesTime() {

        if(this.tecnico != null) {
            System.out.println("Informações sobre o treinador: ");
            System.out.println("\tNome: " + this.tecnico.getNome() +
                    "\n\tSalário: " + this.tecnico.getSalario());
        } else {
            System.out.println("Não possui técnico.");
        }

        System.out.println("Jogadores: ");
        this.listarJogadores();


    }

    public void informacoesFuncionarios() {

        System.out.println("Funcionários: ");

        for(Funcionario funcionario : this.getFuncionarios()) {

            System.out.println("\tNome: " + funcionario.getNome());
            System.out.println("\t\tProfissão: " + funcionario.tipo());
            System.out.println("\t\tSalário: " + funcionario.getSalario());
            System.out.println("\t\tTelefone: " + funcionario.getTelefone());
            System.out.println("\t\tEmail: " + funcionario.getEmail());

        }

    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }
}
