package Java;

public class Verde implements Estado{
    public void abrir(Biestable biestable){
        System.out.println("Ya esta abierto");
    }
    public void cerrar(Biestable biestable){
        biestable.estado = new Rojo();
    }
}
