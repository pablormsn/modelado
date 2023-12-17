public class Rojo implements Estado{

    public void abrir(Biestable biestable){
        biestable.estado = new Verde();
    }
    public void cerrar(Biestable biestable){
        System.out.println("Ya esta cerrado");
    }
}
