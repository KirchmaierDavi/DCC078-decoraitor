package com.aaes.decoreitor.sindicato;

public class AssociadoSindical implements ContribuicaoSindical {

    private final String nome;
    private final double contribuicaoBase;

    public AssociadoSindical(String nome, double contribuicaoBase) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do associado é obrigatório");
        }
        if (contribuicaoBase < 0) {
            throw new IllegalArgumentException("A contribuição não pode ser negativa");
        }
        this.nome = nome;
        this.contribuicaoBase = contribuicaoBase;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return "Associado sindical: " + nome;
    }

    @Override
    public double getValorMensal() {
        return contribuicaoBase;
    }
}
