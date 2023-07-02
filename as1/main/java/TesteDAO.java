import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class TesteDAO {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = FabricaDeConexoes.getEntityManagerFactory();
        EntityManager em = emFactory.createEntityManager();    
        
        // Teste da classe MoradorDAO
        MoradorDAO moradorDAO = new MoradorDAO(emFactory);
        
        // Criar um novo morador
        Morador morador = new Morador("Heitor", "888888888888", "666666666");
        morador.setNome("João Silva");
        morador.setCpf("12345678900");
        morador.setTelefone("987654321");

        // Salvar o morador no banco de dados
        moradorDAO.criarMorador(morador);

        // Teste da classe ApartamentoDAO
        ApartamentoDAO apartamentoDAO = new ApartamentoDAO(emFactory);

        // Criar um novo apartamento
        Apartamento apartamento = new Apartamento(1, 1, 100, "Financiado", morador);
        // Configurar as propriedades do apartamento
        apartamento.setNumero(101);
        apartamento.setAndar(1);
        apartamento.setMetragem(80.5);
        apartamento.setSituacao("Alugado");

        apartamentoDAO.criarApartamento(apartamento);
        System.out.println("Apartamento criado com sucesso!");

        // Consultar um apartamento pelo ID
        Apartamento apartamentoConsultado = apartamentoDAO.consultarApartamento(1);
        System.out.println("Apartamento consultado: " + apartamentoConsultado);

        // Editar o apartamento consultado
        apartamentoConsultado.setSituacao("Quitado");
        apartamentoDAO.editarApartamento(apartamentoConsultado);
        System.out.println("Apartamento editado com sucesso!");

        // Excluir o apartamento consultado
        apartamentoDAO.excluirApartamento(apartamentoConsultado);
        System.out.println("Apartamento excluído com sucesso!");

        // Teste da classe EdificioDAO e MoradorDAO
        // Repita o mesmo padrão de operações para testar as outras classes DAO

        em.close();
        emFactory.close();
    }
}
