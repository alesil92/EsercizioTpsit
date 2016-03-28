package corsoserale;

/**
 *
 * @author Alessandro
 */
public class Periodo {
    
    private String denominazione;
    private int durata;
    private int annoinizio;

    /**
     * <p> metodo utilizzato per il settaggio della denominazione
     * @param denominazione parametro utilizzato per impostare la denominazione del periodo 
     */
    
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    /**
     * <p> metodo dedicato all'ottenimento della denominazione
     * @return ritorna la denominazione del periodo
     */
    public String getDenominazione() {
        return denominazione;
    }
    
    
    
    
}
