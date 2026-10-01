package com.aaes.decoreitor.sindicato;

public class SeguroVidaDecorator extends BeneficioSindicalDecorator {

    private static final double VALOR = 15.00;

    public SeguroVidaDecorator(ContribuicaoSindical associado) {
        super(associado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + seguro de vida";
    }

    @Override
    public double getValorMensal() {
        return super.getValorMensal() + VALOR;
    }
}
