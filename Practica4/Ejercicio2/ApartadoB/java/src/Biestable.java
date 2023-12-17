public class Biestable{
    Estado estado;
    public Biestable(){
        this.estado = new Rojo();
    }
    public void abrir(){
        this.estado.abrir(this);
    }
    public void cerrar(){
        this.estado.cerrar(this);
    }
    public void estado(){
        if(this.estado instanceof Rojo){
            System.out.println("Cerrado");
        }else{
            System.out.println("Abierto");
        }
    }
}