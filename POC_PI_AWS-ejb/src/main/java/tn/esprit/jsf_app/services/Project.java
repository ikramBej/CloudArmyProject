package tn.esprit.imputation.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="project")
public class Project implements Serializable {
	/**
	 * 
	 */

	public enum Branche {Net,JEE,Web}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int ProjectId;
	private String Title;
	private String Description;
	private Date OutDate;
	private String ImageUrl;
	private Branche Branche;
	private int Id;
	
	

	public int getProjectId() {
		return ProjectId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getOutDate() {
		return OutDate;
	}
	public void setOutDate(Date outDate) {
		OutDate = outDate;
	}
	
	
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	
	@Enumerated(EnumType.STRING)
	public Branche getBranche() {
		return Branche;
	}
	@Enumerated(EnumType.STRING)
	public void setBranche(Branche branche) {
		Branche = branche;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	public Project(int projectId, String title, String description, Date outDate, String imageUrl, Branche branche, int id) {
		super();
		ProjectId = projectId;
		Title = title;
		Description = description;
		OutDate = outDate;
		ImageUrl = imageUrl;
		Branche = branche;
		Id = id;
	}
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Project [ProjectId=" + ProjectId + ", Title=" + Title + ", Description=" + Description + ", OutDate="
				+ OutDate + ", ImageUrl=" + ImageUrl + ", Branche=" + Branche + ", Id=" + Id + "]";
	}
	
	
	
	
	
	
	

}
