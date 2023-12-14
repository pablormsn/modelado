import java.util.List;

public class Mailbox {
    private List<Email> emails;
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void show() {
        // Lógica para mostrar correos electrónicos según la estrategia de ordenación
        sortingStrategy.sort(emails);
    }
}
