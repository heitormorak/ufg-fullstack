import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaDeConexoes {
    private static EntityManagerFactory emFactory;

    static {	
        try {
            emFactory = Persistence.createEntityManagerFactory("fullstack");
        } catch (Throwable err) {
            System.err.print("Falha:" + err);
            throw new ExceptionInInitializerError(err);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emFactory;
    }
}

