package hibernate.database;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="FILES")
public class Commits {
	private int commitId;
	private String commitHash;
	private	List<Files> files = new ArrayList<Files>() ;

	@Id
	@GeneratedValue
	@Column(name="COMMIT_ID")
	public int getCommitId(){
		return commitId;
	}
	public int setCommitId(int commitId){
		return this.commitId = commitId;
	}
	
	@Column(name="COMMIT_HASH")
	public String getCommitHash(){
		return commitHash;
	}
	public String setCommitHash(String commitHash){
		return this.commitHash = commitHash;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="FILES_COMMITS",joinColumns ={@JoinColumn(name="COMMIT_ID")}, 
				inverseJoinColumns={@JoinColumn(name="FILE_ID")})
	public List<Files> getFiles(){
		return files;
	}
	public List<Files> setCommits(List<Files> files){
		return this.files = files;
	}

}
