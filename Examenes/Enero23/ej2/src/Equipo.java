import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class Equipo {
    private Estadio estadio;
    private List<Partido> partidoLocal;
    private List<Partido> partidoVisitante;
    private List<Partido> partidoGanado;

    public Equipo(Estadio estadio){
        this.setEstadio(estadio);
        partidoLocal=new LinkedList<>();
        partidoVisitante=new LinkedList<>();
        partidoGanado=new LinkedList<>();
    }

    public Estadio getEstadio() {
        return estadio;
    }

    void setEstadio(Estadio e) {
        assert (e!=null);
        estadio = e;
    }

    void addPartidoLocal(Partido p){
        partidoLocal.add(p);
    }

    void addPartidoVisitante(Partido p){
        partidoVisitante.add(p);
    }

    void addPartidoGanado(Partido p){
        partidoGanado.add(p);
    }

    public Enumeration<Partido> getPartidoLocal(){
        return java.util.Collections.enumeration(partidoLocal);
    }

    public Enumeration<Partido> getPartidoVisitante(){
        return java.util.Collections.enumeration(partidoVisitante);
    }

    public Enumeration<Partido> getPartidoGanado(){
        return java.util.Collections.enumeration(partidoGanado);
    }


}
