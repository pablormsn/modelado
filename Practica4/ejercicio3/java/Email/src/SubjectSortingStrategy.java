import java.util.List;

public class SubjectSortingStrategy implements SortingStrategy {
    public void sort(List<Email> email) {
        for (int i = 2; i <= email.size(); i++ ){
            for (int j = email.size(); j >= i; j--){
                if (before(email.get(j), email.get(j - 1))) {
                    // intercambiar los mensajes j y j-1
                    Email temp = email.get(j);
                    email.set(j, email.get(j - 1));
                    email.set(j - 1, temp);
                }
            }
        }
    }

    // En la clase Mailbox
    private boolean before(Email email1, Email email2) {
        // Comparación basada en el asunto (subject)
        return email1.getSubject().compareTo(email2.getSubject()) < 0;
    }

}
