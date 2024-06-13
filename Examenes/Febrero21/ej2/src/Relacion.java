public class Relacion {
    private int inicioRelacion;
    private Persona miembro1;
    private Persona miembro2;

    public Relacion(int inicioRelacion, Persona miembro1, Persona miembro2) {
        assert (miembro1!=miembro2);
        assert (inicioRelacion>= miembro1.getFechaNacimiento()+18 && inicioRelacion>= miembro2.getFechaNacimiento()+18);
        assert (miembro1.getPais()==miembro2.getPais());
        this.inicioRelacion = inicioRelacion;
        this.setMiembro1(miembro1);
        this.setMiembro2(miembro2);

        miembro1.setMiembro1(this);
        miembro2.setMiembro2(this);
    }

    public Persona getMiembro1() {
        return miembro1;
    }

    void setMiembro1(Persona miembro1) {
        this.miembro1 = miembro1;
    }

    public Persona getMiembro2() {
        return miembro2;
    }

    void setMiembro2(Persona miembro2) {
        this.miembro2 = miembro2;
    }

    void removeRelacion(){
        miembro1.setMiembro1(null);
        miembro2.setMiembro2(null);
        this.setMiembro1(null);
        this.setMiembro2(null);
    }
}
