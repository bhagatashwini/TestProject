package hibernate.database;

import java.util.Date;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("derbyembedded");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//Objects of commit and file
    	Commits commit1 = new Commits();
		commit1.setCommitHash("AA");
			
    	File file1 = new File();
		file1.setFile("File22.java");
			
		CommitsFile commitfile= new CommitsFile();
		
		
		commitfile.setCommits(commit1);
		commitfile.setFile(file1);
		commitfile.setTimestamp(new Date());
		
	   	commit1.getCommitsFile().add(commitfile);
	   	file1.getCommitsFile().add(commitfile);
	   	
	   	em.merge(commitfile);
	   	em.merge(commit1);
	   	em.merge(file1);
//		commit1.getFiles().add(file1);
//		commit1.getFiles().add(file2);
//		commit2.getFiles().add(file3);
//		commit2.getFiles().add(file4);

//		em.merge(file1);
//		em.merge(file2);
//		em.merge(file3);
//		em.merge(file4);
//		em.merge(commit1);
//		em.merge(commit2);

		em.getTransaction().commit();
		em.close();

		emf.close();

	}

	private static  void saveFile() {
		// TODO Auto-generated method stub
		
	}
}
