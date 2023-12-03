package ejercicio3P3;

public class Empty extends Estado{
    public Empty(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        assert (p != null);

        if(bandeja.getCapacidad()>1){
            bandeja.setEstado(new Normal(bandeja));
        }else{
            bandeja.setEstado(new Full(bandeja));
        }
        bandeja.piezas.add(p);
    }

    @Override
    public Pieza get() {
        return null;
    }
}
