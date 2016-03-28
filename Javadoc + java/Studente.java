package corsoserale;

/**
 *
 * @author Alessandro
 * classe che identifica uno studente
 */
public class Studente {
    
    private String corsoformazione;
    private String nome;
    private String cognome;
    private int classe;

    
    /**
     * metodo per impostare il corso di formazione dello studente
     * @param corsoformazione variabile modificatrice del corso di formazione
     */
    public void setCorsoformazione(String corsoformazione) {
        this.corsoformazione = corsoformazione;
    }

    /**
     * metodo osservatore del corso di formazione di apparteneneza allo studente
     * @return ritorna una stringa contenente il corso di formazione
     */
    public String getCorsoformazione() {
        return corsoformazione;
    }
    
    
    
    
}
