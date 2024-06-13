import java.util.Enumeration;

public class Partido {
    private boolean jugado = false;
    private int golesLocal = 0;
    private int golesVisitante = 0;
    private Equipo local;
    private Equipo visitante;
    private Equipo ganador;

    public Partido(Equipo local, Equipo visitante){
        assert (local!=null);
        assert (visitante!=null);
        assert (this.noDuplicados(local, visitante));
        assert (local!=visitante);
        this.setLocal(local);
        this.setVisitante(visitante);
        local.addPartidoLocal(this);
        visitante.addPartidoVisitante(this);
    }

    public Equipo getLocal() {
        return local;
    }

    private void setLocal(Equipo local) {
        assert (local!=null);
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    private void setVisitante(Equipo visitante) {
        assert (visitante!=null);
        this.visitante = visitante;
    }

    public void golLocal(){
        assert (!this.jugado);
        assert (this.golesLocal>=0);
        this.golesLocal++;
    }

    public void golVisitante(){
        assert (!this.jugado);
        assert (this.golesVisitante>=0);
        this.golesVisitante++;
    }

    public boolean getJugado(){
        return this.jugado;
    }

    public void setJugado(){
        assert(!this.jugado);
        this.jugado=true;
        if(this.golesLocal>this.golesVisitante){
            this.ganador=this.getLocal();
            this.ganador.addPartidoGanado(this);
        }
        if(this.golesLocal<this.golesVisitante){
            this.ganador=this.getVisitante();
            this.ganador.addPartidoGanado(this);
        }

    }

    private boolean noDuplicados(Equipo l, Equipo v){
        boolean ok = true;
        Enumeration<Partido> a = l.getPartidoLocal();
        while(a.hasMoreElements()){
            if(a.nextElement().getVisitante()==v){
                ok=false;
            }
        }
        return ok;
    }
}
