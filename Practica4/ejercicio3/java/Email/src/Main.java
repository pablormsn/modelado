public class Main {
    public static void main(String[] args) {
        Mailbox mailbox = new Mailbox();
        SortingStrategy dateSortingStrategy = new DateSortingStrategy();
        SortingStrategy fromSortingStrategy = new FromSortingStrategy();
        SortingStrategy prioritySortingStrategy = new PrioritySortingStrategy();
        SortingStrategy subjectSortingStrategy = new SubjectSortingStrategy();

        // Configurar la estrategia de ordenación actual
        mailbox.setSortingStrategy(dateSortingStrategy);
        // Mostrar correos electrónicos ordenados por fecha
        mailbox.show();

        // Cambiar la estrategia de ordenación
        mailbox.setSortingStrategy(fromSortingStrategy);
        // Mostrar correos electrónicos ordenados por remitente
        mailbox.show();
    }
}