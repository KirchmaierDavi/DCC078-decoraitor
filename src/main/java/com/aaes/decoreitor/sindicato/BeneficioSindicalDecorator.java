package com.aaes.decoreitor.sindicato;

public abstract class BeneficioSindicalDecorator implements ContribuicaoSindical {

    protected final ContribuicaoSindical associado;

    protected BeneficioSindicalDecorator(ContribuicaoSindical associado) {
        if (associado == null) {
            throw new IllegalArgumentException("O associado decorado é obrigatório");
        }
        this.associado = associado;
    }

    @Override
    public String getDescricao() {
        return associado.getDescricao();
    }

    @Override
    public double getValorMensal() {
        return associado.getValorMensal();
    }
}
