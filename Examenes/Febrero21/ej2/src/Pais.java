import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Pais {
    private List<Persona> habitantes;

    public Pais() {
        habitantes=new ArrayList<>();
    }

    public void addHabitante(Persona p){
        habitantes.add(p);
    }

    public void removeHabitante(Persona p){
        assert(p!=null);
        habitantes.remove(p);
    }

    public Enumeration<Persona> getHabitantes(){
        return java.util.Collections.enumeration(habitantes);
    }
}
