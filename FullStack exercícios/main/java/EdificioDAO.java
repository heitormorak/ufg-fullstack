import javax.persistence.EntityManager;

public class EdificioDAO {
    private EntityManager em;

    public EdificioDAO(EntityManager em) {
        this.em = em;
    }

    public void criarEdificio(Edificio edificio) {
        em.getTransaction().begin();
        em.persist(edificio);
        em.getTransaction().commit();
    }

    public void editarEdificio(Edificio edificio) {
        em.getTransaction().begin();
        em.merge(edificio);
        em.getTransaction().commit();
    }

    public Edificio consultarEdificio(int id) {
        return em.find(Edificio.class, id);
    }

    public void excluirEdificio(Edificio edificio) {
        em.getTransaction().begin();
        em.remove(edificio);
        em.getTransaction().commit();
    }
}
