import java.time.LocalDateTime;

public class DemandeEntretion {
    private String typeMateriel;
    private String description;
    private LocalDateTime dateCreation;

    public DemandeEntretion(String typeMateriel, String description, LocalDateTime dateCreation) {
        this.typeMateriel = typeMateriel;
        this.dateCreation = dateCreation;
        this.description = description;
    }

    // getters
    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeMateriel() {
        return typeMateriel;
    }

    // setters

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypeMateriel(String typeMateriel) {
        this.typeMateriel = typeMateriel;
    }
}
