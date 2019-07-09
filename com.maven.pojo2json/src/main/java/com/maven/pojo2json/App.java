package com.maven.pojo2json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.maven.pojo2json.model.BuProcess;
import com.maven.pojo2json.model.Level;
import com.maven.pojo2json.model.Phase;

public class App {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		Level level1 = new Level("level1", 1);
		Level level2 = new Level("level2", 2);
		Level level3 = new Level("level3", 3);
		Level level4 = new Level("level4", 4);

		List<Level> levels1 = new ArrayList<Level>();
		List<Level> levels2 = new ArrayList<Level>();
		levels1.add(level1);
		levels1.add(level2);
		levels2.add(level3);
		levels2.add(level4);

		Phase phase1 = new Phase();
		Phase phase2 = new Phase();
		phase1.setLevels(levels1);
		phase2.setLevels(levels2);

		List<Phase> phases = new ArrayList<Phase>();
		phases.add(phase1);
		phases.add(phase2);

		String json = "joson";
		try {
			json = mapper.writeValueAsString(new BuProcess(phases));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(json);

	}
}
