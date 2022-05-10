package com.lr;

public class OutputHelper {
	
	IOutputGenerator outputGenerator;
	
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
		}
	
	public void generateOutput() {
		outputGenerator.generateOutput();
		
	}

	public OutputHelper(IOutputGenerator outputGenerator) {
		
		this.outputGenerator = outputGenerator;
	}
	
	
	
}
