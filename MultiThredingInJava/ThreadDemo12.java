package MultiThredingInJava;


class Library1 implements Runnable {
	String res1 = "Java";
	String res2 = "DSA";
	String res3 = "SprintBoot";

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("student1")) {
				synchronized (res1) {
					System.out.println("student1 has got the book " + res1);
					Thread.sleep(3000);

					synchronized (res2) {
						System.out.println("student1 has got the book " + res2);
						Thread.sleep(3000);
						synchronized (res3) {
							System.out.println("student1 has got the book " + res3);
							Thread.sleep(3000);
						}
					}
				}
			} else {
				synchronized (res3) {
					System.out.println("student2 has got the book " + res3);
					Thread.sleep(3000);

					synchronized (res2) {
						System.out.println("student2 has got the book " + res2);
						Thread.sleep(3000);
						synchronized (res1) {
							System.out.println("student2 has got the book " + res1);
							Thread.sleep(3000);
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class ThreadDemo12 {

	public static void main(String[] args) {
		Library1 library = new Library1();

		Thread t1 = new Thread(library); // new state
		Thread t2 = new Thread(library);

		t1.setName("student1");
		t2.setName("student2");

		t1.start(); // Runnable and Running(when internaly star() class the run() methdod)
		t2.start();

	}

}

/*Dead Lock Code  :-Dono Thread Ek -Duesare ke Thead ke lock release hone ka wait kar rhia hai aur dono
 Bolck state me hi fasi rah gayi hai*/
