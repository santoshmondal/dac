package package2;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloCdac {
	private String projects;

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}
	
	
}
