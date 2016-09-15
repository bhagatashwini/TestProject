package hibernate.database;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        Commits commit1 = new Commits();
        commit1.setCommitHash("AAB");
        Commits commit2 = new Commits();
        commit2.setCommitHash("AAC");
        
        Files	File1 = new Files();
        File1.setFileName("FileA.java");
        Files	File2 = new Files();
        File2.setFileName("FileB.java");
        Files	File3 = new Files();
        File1.setFileName("FileA.java");
        Files	File4 = new Files();
        File2.setFileName("FileB.java");
        
        
        File1.getCommits().add(commit1);
        File3.getCommits().add(commit1);
        File2.getCommits().add(commit2);
        File4.getCommits().add(commit2);
        
        session.save(File1);
        session.save(File2);
        session.save(File3);
        session.save(File4);
        session.save(commit1);
        session.save(commit2);
        
        session.getTransaction().commit();
        session.close();
        
        
    }
}
