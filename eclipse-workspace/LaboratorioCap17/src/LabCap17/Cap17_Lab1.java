package LabCap17;

public class Cap17_Lab1{
	public static void main(String[] args){
		ThreadLab thread1 = new ThreadLab("Thread 1");
		ThreadLab thread2 = new ThreadLab("Thread 2");
		
		thread1.start();
		thread2.start();
	
	}
}