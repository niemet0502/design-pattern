public class TechnicienAutre extends AbstractTechnicien {
    public TechnicienAutre(AbstractTechnicien next) {
        super(next);
    }

    public void request(DemandeEntretion demande) {
        System.out.println("Demande traiter par le technicien autre");
    }
}
