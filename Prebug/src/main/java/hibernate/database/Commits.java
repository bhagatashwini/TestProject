package hibernate.database;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Commits {
	private int commitId;
	private String commitHash;
	private	List<File> files = new ArrayList<File>() ;
//	private int addedLines;
//	private int deletedLines;
//	private int modeifiedLines;
//	private String Author;
//	private String Timestamp;
	
	
	@Id
	@GeneratedValue
	public int getCommitId(){
		return commitId;
	}
	public int setCommitId(int commitId){
		return this.commitId = commitId;
	}
	
	public String getCommitHash(){
		return commitHash;
	}
	public String setCommitHash(String commitHash){
		return this.commitHash = commitHash;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
	public List<File> getFiles(){
		return files;
	}
	public List<File> setFiles(List<File> files){
		return this.files = files;
	}

}
