package main.java.br.com.cleancode.um.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class FuncionarioTerceirizado extends Funcionario{

    private String  empresaContratada;
    private Date    tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, BigDecimal salario, String setor, String cargo) {
        super(nome, telefones, endereco, salario, setor, cargo);
    }
}
