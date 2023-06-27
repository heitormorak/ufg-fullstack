import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ApartamentoDAO {
    private EntityManager em;

    public ApartamentoDAO(EntityManagerFactory emFactory) {
        this.em = (EntityManager) emFactory;
    }

    public void criarApartamento(Apartamento apartamento) {
        em.getTransaction().begin();
        em.persist(apartamento);
        em.getTransaction().commit();
    }

    public void editarApartamento(Apartamento apartamento) {
        em.getTransaction().begin();
        em.merge(apartamento);
        em.getTransaction().commit();
    }

    public Apartamento consultarApartamento(int id) {
        return em.find(Apartamento.class, id);
    }

    public void excluirApartamento(Apartamento apartamento) {
        em.getTransaction().begin();
        em.remove(apartamento);
        em.getTransaction().commit();
    }
}
