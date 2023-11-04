package Exercicio03;

import java.util.Date;

public class ContaBancaria {
    private String nome;              //nome do titular da conta
    private String cpf;               //número de CPF do titular
    private int identificadorConta;   //número de identificação da conta
    private String banco = "AgiBank"; //nome do banco
    private String endereco;          //endereço do titular
    private double saldo = 0;         //saldo disponível na conta
    private Date horarioAtual;        //atributo para armazenar o horário atual

    //construtor (responsável por inicializar os atributos e configurar o estado inicial do objeto)
    public ContaBancaria(String nome, String cpf, int identificadorConta, String endereco, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.endereco = endereco;
        this.saldo = saldoInicial;
        this.horarioAtual = new Date();
    }

    //método saque
    public void saque(double valor) {
        Date horaAtual = new Date();
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    //método deposito
    public void deposito (double valor) {
        Date horaAtual = new Date();
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado!");
    }

    //método pix
    public void pix(double valor) {
        Date horaAtual = new Date();
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Pix no valor de R$" + valor + " realizado!");
        } else {
        System.out.println("Não foi possivel realizar o pix. Saldo insuficiente!");
        }
    }

    //método transferência
    public void transferencia(ContaBancaria destino, double valor) {
        Date horaAtual = new Date();
        if (horaAtual.getHours() >= 8 && horaAtual.getHours() < 19) {
            if (saldo >= valor) {
                saldo -= valor;
                destino.deposito(valor);
            } else {
                System.out.println("Saldo insuficiente para a transferência.");
            }
        } else {
            System.out.println("Transferência não permitida, fora do horário de funcionamento (8hrs às 19hrs).");
        }
    }

    //método verificar saldo
    public void verificarSaldo() {
        System.out.println("Saldo atual: " +saldo);
    }

    //método verifica hora atual
    public void verificarHorario() {
        System.out.println("Horário atual: " +horarioAtual.toString());
    }

    //método para ver informações da conta
    public void verificarInformacoes() {
        System.out.println("Nome: " +nome);
        System.out.println("CPF: " +cpf);
        System.out.println("Identificador da Exercicio01.Exercicio01.Exercicio03.Conta: " +identificadorConta);
        System.out.println("Banco: " +banco);
        System.out.println("Endereço: " +endereco);
        System.out.println("Saldo: " +saldo);
        verificarHorario();
    }

    //método para alterar endereço
    public void alterarEndereco (String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
