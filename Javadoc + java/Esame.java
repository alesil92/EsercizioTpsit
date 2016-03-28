package corsoserale;

/**
 *
 * @author Alessandro
 * classe che identifica un singolo esame appartenente ad un modulo
 */
public class Esame {
    
    private String materiadiriferimento;

    /**
     * Metodo che imposta la materia di riferimento per questo esame
     * @param materiadiriferimento variabile per l'impostazione della materia
     */
    public void setMateriadiriferimento(String materiadiriferimento) {
        this.materiadiriferimento = materiadiriferimento;
    }

    /**
     * metodo che ritorna una stringa con la materia di riferimento dell'esame
     * @return ritorna la materia di riferimento in una stringa
     */
    public String getMateriadiriferimento() {
        return materiadiriferimento;
    }
    
    
}
