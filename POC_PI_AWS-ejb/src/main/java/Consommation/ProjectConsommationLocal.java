package Consommation;

import java.util.List;

import tn.esprit.imputation.entity.Project;


public interface ProjectConsommationLocal {
	List<Project> Consomation();

	void Update(Project p, int id);

	void Add(Project p);

	void Delete(Project p);
}
