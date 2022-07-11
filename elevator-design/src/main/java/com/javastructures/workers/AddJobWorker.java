package com.javastructures.workers;

import com.javastructures.Elevator;
import com.javastructures.requests.Request;

public class AddJobWorker implements Runnable {

	private Elevator elevator;
	private Request request;

	public AddJobWorker(Elevator elevator, Request request) {
		this.elevator = elevator;
		this.request = request;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elevator.addJob(request);
	}

}
