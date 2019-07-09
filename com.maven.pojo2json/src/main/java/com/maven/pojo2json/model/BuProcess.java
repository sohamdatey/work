package com.maven.pojo2json.model;

import java.util.List;

public class BuProcess {

	List<Phase> phases;

	
	public List<Phase> getPhases() {
		return phases;
	}

	public BuProcess(List<Phase> phases) {
		super();
		this.phases = phases;
	}

	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}
	
}
