/**
 * 
 */
package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;

/**
 * @author Asha
 *
 */
public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	public Project fetchAllProjects(Integer projectId) {
		return projectDao.fetchProjectsById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Project with project ID=" + projectId + " does not exist."));
	}

}
