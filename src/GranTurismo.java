public class GranTurismo extends cocheDeCarreras{
    private int pesoExtraLastre;



    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        if (pesoExtraLastre >= 100) {
            System.out.println("El piloto no lo puede maniobrar bien entero perkin gil jsjsjsjsj con : " + pesoExtraLastre + " kg");
        } else {
            System.out.println("El piloto es una puta maquina y lo hizo entero bkn con : " + pesoExtraLastre + " kg");
        }
    }
}
