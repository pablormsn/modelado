public class Persona {
    private Pais pais;
    private int fechaNacimiento;
    private Relacion miembro1;
    private Relacion miembro2;

    public Persona(int fechaNacimiento, Pais pais){
        assert (fechaNacimiento>=0);
        this.setFechaNacimiento(fechaNacimiento);
        this.setPais(pais);
    }

    public Pais getPais() {
        return pais;
    }

    void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    void setFechaNacimiento(int fechaNacimiento) {
        assert(fechaNacimiento>=0);
        this.fechaNacimiento = fechaNacimiento;
    }

    void setMiembro1(Relacion r){
        assert (r==null || miembro2 == null);
        miembro1=r;
    }

    public Relacion getMiembro1() {
        return miembro1;
    }

    void setMiembro2(Relacion r){
        assert (r==null || miembro1==null);
        miembro2=r;
    }

    public Relacion getMiembro2() {
        return miembro2;
    }
}
