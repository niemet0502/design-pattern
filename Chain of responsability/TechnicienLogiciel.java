public class TechnicienLogiciel extends AbstractTechnicien {
    public TechnicienLogiciel(AbstractTechnicien next) {
        super(next);
    }

    public void request(DemandeEntretion demande) {
        if (demande.getTypeMateriel().compareToIgnoreCase("Logiciel") == 0) {
            System.out.println("Demande traiter par le technicien de logiciel");
        } else {
            getNextHandler().request(demande);
        }
    }
}
