package hibernate.database;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("derbyembedded");
         EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
         
        
        Commits commit1 = new Commits();
        commit1.setCommitHash("AA");
        Commits commit2 = new Commits();
        commit2.setCommitHash("AA");
        
        File	file1 = new File();
        file1.setFile("File22.java");
        File	file2 = new File();
        file2.setFile("File22.java");
        File	file3 = new File();
        file3.setFile("File22.java");
        File	file4 = new File();
        file4.setFile("File22.java");
        
       
        commit1.getFiles().add(file1);
        commit1.getFiles().add(file2);
        commit2.getFiles().add(file3);
        commit2.getFiles().add(file4);
        
        em.merge(file1);
        em.merge(file2);
        em.merge(file3);
        em.merge(file4);
        em.merge(commit1);
        em.merge(commit2);
        
        em.getTransaction().commit();
        em.close();
        
        emf.close();
        
        
    }
}
