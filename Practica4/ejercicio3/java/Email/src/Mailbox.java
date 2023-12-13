import java.util.List;

public class Mailbox {
    private List<Email> emails;
    private Sorting sortingStrategy;

    public void setSortingStrategy(Sorting sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void show() {
        // Lógica para mostrar correos electrónicos según la estrategia de ordenación
        sortingStrategy.sort(emails);
        // Mostrar los correos electrónicos
    }
}
