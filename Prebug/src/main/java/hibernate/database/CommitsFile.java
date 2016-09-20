package hibernate.database;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NaturalId;


@Entity


public class CommitsFile implements Serializable {
	
	    private int id =0;
	    private File file = new File();
	    private Commits commits = new Commits();
	    private Date Timestamp;
    
	    @Id
		@GeneratedValue
		public int getId(){
			return id;
		}
		public int setId(int id){
			return this.id = id;
		}
    
	   @ManyToOne
	    public File getFile() {
	        return file;
	    }

	    public void setFile(File  file) {
	        this.file = file;
	    }
	    
	   
	    @ManyToOne
	
	    public Commits getCommits() {
	        return commits;
	    }

	    public void setCommits(Commits commits) {
	        this.commits = commits;
	    }
	
	    
	    public Date getTimestamp() {
	        return Timestamp;
	    }

	    public void setTimestamp(Date Timestamp) {
	        this.Timestamp = Timestamp;
	    }

}
