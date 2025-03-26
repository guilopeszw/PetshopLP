public enum TamAnimal {
    PEQUENO(50, 12, 30), MEDIO(60, 18, 40), GRANDE(70, 25, 50);

    private double precoBanho;
    private double precoHotel;
    private double precoTosa;

    TamAnimal(double precoBanho, double precoHotel, double precoTosa) {
        this.precoBanho = precoBanho;
        this.precoHotel = precoHotel;
        this.precoTosa = precoTosa;
    }

    public double getPrecoBanho() {
        return precoBanho;
    }

    public double getPrecoHotel() {
        return precoHotel;
    }

    public double getPrecoTosa() {
        return precoTosa;
    }
}