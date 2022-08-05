import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AbstractTechnicien responsable = new Directeur(
                new TechnicienMateriel(new TechnicienLogiciel(new TechnicienAutre(null))));

        DemandeEntretion demande = new DemandeEntretion("Materiel", "Reparation ordinateur", LocalDateTime.now());
        DemandeEntretion demande1 = new DemandeEntretion("Materiel", "Reparation ordinateur",
                LocalDateTime.of(2022, Month.JULY, 1, 19, 30, 40)); // en fonction de la date du jour, cette demande
                                                                    // aura toujours plus de 48h donc sera toujours
                                                                    // gerer par le directeur
        DemandeEntretion demande2 = new DemandeEntretion("Logiciel", "Reparation ordinateur",
                LocalDateTime.now());

        DemandeEntretion demande3 = new DemandeEntretion("Autre", "Reparation ordinateur",
                LocalDateTime.now());

        responsable.request(demande);
        responsable.request(demande1);
        responsable.request(demande2);
        responsable.request(demande3);
    }
}
