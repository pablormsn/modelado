import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class Estadio {
    private List<Equipo> equipo;

    public Estadio(){
        equipo = new LinkedList<>();
    }

    void addEquipo(Equipo e){
        equipo.add(e);
    }

    void removeEquipo(Equipo e){
        equipo.remove(e);
    }

    public Enumeration<Equipo> getEquipo(){
        return java.util.Collections.enumeration(equipo);
    }
}
