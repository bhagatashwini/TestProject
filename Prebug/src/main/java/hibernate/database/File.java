package hibernate.database;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;;

@Entity
public class File {
	private int id =0;
	private String file =null;
	private Set<CommitsFile> commitFiles = new HashSet<CommitsFile>();
	//private	List<Commits> commits = new ArrayList<Commits>() ;
	
	@Id
	@GeneratedValue
	public int getId(){
		return id;
	}
	public int setId(int fileId){
		return this.id = fileId;
	}
	
    public String getFile(){
		return file;
	}
	public String setFile(String file){
		return this.file = file;
	}
	

//	public List<Commits> getCommits(){
//		return commits;
//	}
//	public List<Commits> setCommits(List<Commits> commits){
//		return this.commits = commits;
//	}
    
    @OneToMany()
    public Set<CommitsFile> getCommitsFile() {
        return commitFiles;
    }

    public void setCommitsFile(Set<CommitsFile> commitFiles) {
        this.commitFiles = commitFiles;
    }
}
