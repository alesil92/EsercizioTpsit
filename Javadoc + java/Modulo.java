package corsoserale;

/**
 *
 * @author Alessandro
 * classe che identifica un modulo che lo studente dovrà tentare di superare
 */
public class Modulo {
    
    private String titolo;

    
    /**
     * <p> metodo dedicato al settaggio del titolo identificativo del modulo
     * @param titolo variabile utilizzata per impostare il titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * metodo utilizzato per visualizzare e / o salvare il titolo del modulo
     * @return ritorna il titolo del modulo 
     */
    public String getTitolo() {
        return titolo;
    }
    
    
    
}
