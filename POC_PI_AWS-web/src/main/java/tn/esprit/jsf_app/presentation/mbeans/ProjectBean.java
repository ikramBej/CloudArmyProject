package Bean;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Consommation.ProjectConsommation;

import tn.esprit.imputation.entity.Project;



@ManagedBean
@SessionScoped
public class ProjectBean {
	
	Project p = new Project();
	public Project getP() {
		return p;
	}

	public void setP(Project p) {
		this.p = p;
	}

	private List<Project> Projects = new ArrayList<Project>();
	
	@EJB
	private ProjectConsommation dcr;
	
	
	public List<Project> getProjects() {
		return Projects;
	}

	public void setProjects(List<Project> Projects) {
		this.Projects = Projects;
	}

	@PostConstruct
	public void init() {
		Projects = dcr.Consomation();
		
	}
	
	public void Ajout(){
		dcr.Add(p);
	}
	

	public String Supprimer(Project p){
		dcr.Delete(p);
		return "/ProjectList?faces-redirect=true";
	}
	
	
	
	}