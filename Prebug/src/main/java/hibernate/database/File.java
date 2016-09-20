package hibernate.database;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;;

@Entity
public class File {
	private int id;
	private String file;
	private	List<Commits> commits = new ArrayList<Commits>() ;
	
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
	
    @ManyToMany(mappedBy = "files" )
	public List<Commits> getCommits(){
		return commits;
	}
	public List<Commits> setCommits(List<Commits> commits){
		return this.commits = commits;
	}
}
