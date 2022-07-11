package com.javastructures.workers;

import com.javastructures.Elevator;

public class ProcessJobWorker implements Runnable {

	private Elevator elevator;

	public ProcessJobWorker(Elevator elevator) {
		this.elevator = elevator;
	}

	@Override
	public void run() {
		/**
		 * start the elevator
		 */
		elevator.startElevator();
	}

}

