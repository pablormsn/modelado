package ejercicio3P3;

public class Normal extends Estado{
    public Normal(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        assert (p != null);
        if(size()<bandeja.getCapacidad()-1){
            bandeja.setEstado(new Normal(bandeja));
        }else{
            bandeja.setEstado(new Full(bandeja));
        }
        bandeja.piezas.add(p);

    }

    @Override
    public Pieza get() {
        if(size()>1){
            bandeja.setEstado(new Normal(bandeja));
        }else{
            bandeja.setEstado(new Empty(bandeja));
        }
        return bandeja.piezas.remove(0);
    }
}
