public class PrototipoLM extends cocheDeCarreras{
    private boolean sistemaHibrido;

    public PrototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }


    @Override
    public void competir() {
        if (sistemaHibrido==true) {
            System.out.println("motor es hibrido    ");


        } else  {
            System.out.println("motor de combustion");
        }
    }




}
