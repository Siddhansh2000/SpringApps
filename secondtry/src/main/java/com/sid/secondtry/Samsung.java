package com.sid.secondtry;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	private MobileProcessor cpu;


	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	
	public void config() {
		System.out.println("OctaCore , 16gb Ram , 50Mp camera");
		cpu.process();
	}
}
