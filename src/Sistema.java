import abstrato.Funcionario;
import abstrato.Socio;
import funcionarios.*;
import socios.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Socio> socios = new ArrayList<>();

    public boolean login() {

        Scanner scanner = new Scanner(System.in);

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
                    "(1) - Adicionar Funcionário\n" +
                    "(2) - Listar Funcionários\n" +
                    "(3) - Adicionar Sócio-Torcedor\n" +
                    "(4) - Listar todos os Sócio-Torcedores");

            String opcao = scanner.nextLine();

            switch (opcao) {
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
        double salario = scanner.nextDouble();
        scanner.nextLine();

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
                this.getFuncionarios().add(tecnico);
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
                this.getFuncionarios().add(jogador);
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
        System.out.println("Digite o valor de contribuição do Sócio-Torcedor: ");
        double contribuicao = scanner.nextDouble();
        scanner.nextLine();
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
                    SocioJunior novoSocioJunior = new SocioJunior(nome, email, cpf, telefone, endereco, contribuicao, estado);
                    this.getSocios().add(novoSocioJunior);
                    break loop;
                case "2":
                    SocioSenior novoSocioSenior = new SocioSenior(nome, email, cpf, telefone, endereco, contribuicao, estado);
                    this.getSocios().add(novoSocioSenior);
                    break loop;
                case "3":
                    SocioElite novoSocioElite = new SocioElite(nome, email, cpf, telefone, endereco, contribuicao, estado);
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

        // TODO BOTAR UM LABEL E MUDAR PARA SWITCH CASE
        while (true) {

            String tipo = scanner.nextLine();

            if(tipo.equals("1")) {
                return "Volante";
            } else if(tipo.equals("2")) {
                return "Zagueiro";
            } else if(tipo.equals("3")) {
                return "Meia";
            } else if(tipo.equals("4")) {
                return "Goleiro";
            } else if(tipo.equals("5")) {
                return "Atacante";
            } else if(tipo.equals("6")) {
                return "Lateral Esquerdo";
            } else if(tipo.equals("7")) {
                return "Lateral Direito";
            } else {
                System.out.println("Digite um tipo válido: ");
            }

        }

    }

    public void listarSocioTorcedores() {

        System.out.println("Sócio-Torcedores: ");
        for(Socio socio : this.getSocios()) {
            System.out.println("\tNome: " + socio.getNome() +
                    "\n\tTipo: " + socio.tipo() +
                    "\n\tEstado: " + socio.getEstado());
        }

    }

    public void listarFuncionarios() {

        System.out.println("Funcionários: ");
        for(Funcionario funcionario : this.getFuncionarios()) {
            System.out.println("\tNome: " + funcionario.getNome() +
                    "\n\tTipo: " + funcionario.tipo() + "\n");

        }

    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }
}
