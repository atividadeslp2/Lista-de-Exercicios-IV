package com.github.ricardor211.estudo1;

public class FuncionarioMensalista extends Funcionario{

    private float salarioFixo;

    public FuncionarioMensalista(String nome, String cpf, float salarioFixo) {
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public void calcularPagamento() {
        System.out.println("O pagamento do funcionario mensalista é: R$" + salarioFixo);

    }
}
