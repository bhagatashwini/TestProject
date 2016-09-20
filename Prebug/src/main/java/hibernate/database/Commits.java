package hibernate.database;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NaturalId;

@Entity
public class Commits {
	
	private String commitHash = null;
    private Set<CommitsFile> commitFiles = new HashSet<CommitsFile>();
//		private	List<File> files = new ArrayList<File>() ;


	@Id
	@NaturalId
	public String getCommitHash(){
		return commitHash;
	}
	public String setCommitHash(String commitHash){
		return this.commitHash = commitHash;
	}
	
	
//	public List<File> getFiles(){
//		return files;
//	}
//	public List<File> setFiles(List<File> files){
//		return this.files = files;
//	}
	
	@OneToMany(cascade = {CascadeType.ALL})
    public Set<CommitsFile> getCommitsFile() {
        return commitFiles;
    }

    public void setCommitsFile(Set<CommitsFile> commitFiles) {
        this.commitFiles = commitFiles;
    }

}
