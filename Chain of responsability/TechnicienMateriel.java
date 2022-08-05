public class TechnicienMateriel extends AbstractTechnicien {
    public TechnicienMateriel(AbstractTechnicien next) {
        super(next);
    }

    public void request(DemandeEntretion demande) {
        if (demande.getTypeMateriel().compareToIgnoreCase("Materiel") == 0) {
            System.out.println("Demande traiter par le technicien de materiel");
        } else {
            getNextHandler().request(demande);
        }
    }
}
