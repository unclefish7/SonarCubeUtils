import javax.persistence.*;
public class SqlNeg3 {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("myunit").createEntityManager();
        em.createQuery("SELECT u FROM User u WHERE u.username = :username")
          .setParameter("username", "admin")
          .getResultList();
    }
}
