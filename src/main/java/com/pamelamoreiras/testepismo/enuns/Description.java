package com.pamelamoreiras.testepismo.enuns;

public enum Description {
    COMPRA_A_VISTA(1),
    COMPRA_PARCELADA(2),
    SAQUE(3),
    PAGAMENTO(4);

    private final int transactionDescription;

    Description(int transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public int getTransactionDescription() {
        return transactionDescription;
    }
}

