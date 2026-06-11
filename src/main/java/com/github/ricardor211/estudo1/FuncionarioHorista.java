package com.github.ricardor211.estudo1;

public class FuncionarioHorista extends Funcionario{

    private float horasTrabalhadas;
    private float valorHora;


    public FuncionarioHorista(String nome, String cpf, float horasTrabalhadas, float valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public void calcularPagamento() {
        System.out.println("O pagamento do funcionario horista é: R$" + horasTrabalhadas * valorHora);
    }
}
