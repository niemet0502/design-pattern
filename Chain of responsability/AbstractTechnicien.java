public abstract class AbstractTechnicien {
    private AbstractTechnicien sucessor = null;

    public AbstractTechnicien(AbstractTechnicien next) {
        this.sucessor = next;
    }

    public AbstractTechnicien getNextHandler() {
        return this.sucessor;
    }

    public abstract void request(DemandeEntretion demande);
}