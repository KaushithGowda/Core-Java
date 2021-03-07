
public class Worker extends Supervisor {
	void sweep() {
		 System.out.println("Starts Sweeping the floor");
	 }
	 
	 void wash() {
		 System.out.println("Starts Washing the floor");
	 }
	 
	 void dust() {
		 System.out.println("Starts dusting the floor");
	 }
	 
	 //in the above program since inheritance and supervisor class is declared final is used we cannot get output but above problem can be solved using delegation 
	 //delegation is nothing but passing of information from one class to another class as shown below
	 //refer Program10
}
