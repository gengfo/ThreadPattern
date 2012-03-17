package A1t6aDeadLock;

public class Main {

	public static void main(String args[]) {

		System.out.println("Testing EaterThread, hit Ctrl+c to exit.");

		Tool spoon = new Tool("Spoon");
		Tool fork = new Tool("Fork");

		new EaterThread("Alice", spoon, fork).start();
		new EaterThread("Bob", fork, spoon).start();

	}

}
