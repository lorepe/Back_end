public class ManejadorTecnica extends Manejador{
    @Override
    public void comprobar(Mail mail) {
        if((mail.getDestino().equalsIgnoreCase("tecnica")))
    }
}
