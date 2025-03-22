import util.HibernateUtil;
import org.hibernate.Session;
public class SqlPos3 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String username = "admin";
        String hql = "FROM User WHERE username = '" + username + "'";
        session.createQuery(hql).list();
        session.close();
    }
}
