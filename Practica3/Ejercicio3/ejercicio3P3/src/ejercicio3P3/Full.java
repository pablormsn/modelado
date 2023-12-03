package ejercicio3P3;

public class Full extends Estado{
    public Full(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {

    }

    @Override
    public Pieza get() {
        if(bandeja.getCapacidad()>1){
            bandeja.setEstado(new Normal(bandeja));
        }else{
            bandeja.setEstado(new Empty(bandeja));
        }
        return bandeja.piezas.remove(0);
    }
}
