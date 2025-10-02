package edu.kh.project.run;

import edu.kh.project.model.service.ToyFactory;

public class ToyRun {

	public static void main(String[] args) {
		ToyFactory toy = new ToyFactory();
		toy.displayMenu();
	}

}
