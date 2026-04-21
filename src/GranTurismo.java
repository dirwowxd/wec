public class GranTurismo extends cocheDeCarreras{
    private int pesoExtraLastre;



    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        System.out.println("El piloto del Gran Turismo " + getMarca() + " está gestionando las curvas con un lastre extra de " + this.pesoExtraLastre + " kg.");
    }
}
