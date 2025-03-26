public enum TamPelo {
    CURTO(0), MEDIO(15), LONGO(25);
    private double adicionalBanho;

    TamPelo(double adicionalBanho) {
        this.adicionalBanho = adicionalBanho;
    }

    public double getAdicionalBanho() {
        return adicionalBanho;
    }
}
