import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Directeur extends AbstractTechnicien {
    public Directeur(AbstractTechnicien next) {
        super(next);
    }

    public void request(DemandeEntretion demande) {
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(demande.getDateCreation())) {
            if (ChronoUnit.DAYS.between(demande.getDateCreation(), now) >= 2) {
                System.out.println("Demande traiter par le directeur");
            } else {
                getNextHandler().request(demande);
            }
        } else {
            getNextHandler().request(demande);
        }
    }
}
