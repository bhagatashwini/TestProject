package hibernate.database;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;;

@Entity
@Table(name="FILES")
public class Files {
	private int fileId;
	private String fileName;
	private	List<Commits> commits = new ArrayList<Commits>() ;
	
	@Id
	@GeneratedValue
	@Column(name="FILE_ID") 
	public int getFileId(){
		return fileId;
	}
	public int setFileId(int fileId){
		return this.fileId = fileId;
	}
	
	@Column(name="FILE_NAME")
	public String getFileName(){
		return fileName;
	}
	public String setFileName(String fileName){
		return this.fileName = fileName;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="FILES_COMMITS",joinColumns ={@JoinColumn(name="FILE_ID")}, 
				inverseJoinColumns={@JoinColumn(name="COMMIT_ID")})
	public List<Commits> getCommits(){
		return commits;
	}
	public List<Commits> setCommits(List<Commits> commits){
		return this.commits = commits;
	}
}
