import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MoradorDAO {
    private EntityManager em;

    public MoradorDAO(EntityManagerFactory emFactory) {
        this.em = (EntityManager) emFactory;
    }

    public void criarMorador(Morador morador) {
        em.getTransaction().begin();
        em.persist(morador);
        em.getTransaction().commit();
    }

    public void editarMorador(Morador morador) {
        em.getTransaction().begin();
        em.merge(morador);
        em.getTransaction().commit();
    }

    public Morador consultarMorador(int id) {
        return em.find(Morador.class, id);
    }

    public void excluirMorador(Morador morador) {
        em.getTransaction().begin();
        em.remove(morador);
        em.getTransaction().commit();
    }
}
