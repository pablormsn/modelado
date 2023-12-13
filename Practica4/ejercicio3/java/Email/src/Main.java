public class Main {
    public static void main(String[] args) {
        Mailbox mailbox = new Mailbox();
        Sorting dateSorting = new DateSortingStrategy();
        Sorting fromSorting = new FromSortingStrategy();
        Sorting prioritySorting = new PrioritySortingStrategy();
        Sorting subjectSorting = new SubjectSortingStrategy();

        // Configurar la estrategia de ordenación actual
        mailbox.setSortingStrategy(dateSorting);
        // Mostrar correos electrónicos ordenados por fecha
        mailbox.show();

        // Cambiar la estrategia de ordenación
        mailbox.setSortingStrategy(fromSorting);
        // Mostrar correos electrónicos ordenados por remitente
        mailbox.show();
    }
}