import util.HibernateUtil;
import org.hibernate.Session;
public class SqlNeg2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.createQuery("FROM User WHERE username = :username")
               .setParameter("username", "admin")
               .list();
        session.close();
    }
}
