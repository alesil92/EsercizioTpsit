package corsoserale;

/**
 * @author Alessandro
 * Questa classe identifica una materia appartenente ad un modulo
 * Essa è caratterizzata da 3 attributi che identificano il nome della materia,
 * la sua durata e la classe di appartenenza
 */

public class Materia {
    private String nome;
    private int durata;
    private int classe;
/**
 * metodo dedicato al settaggio dell'attributo
 * @param nome identifica il nome della materia
 * 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * metodo utilizzato per visualizzare il nome della materia
 * @return ritorna il nome della materia  
 */
    public String getNome() {
        return nome;
    }
    
    
    
    
}
