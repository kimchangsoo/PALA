package chap13;

public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("���� ������ �̸� =" + name);
		System.out.println("���� ������ id =" + id);
		System.out.println("���� ������ �켱���� �� =" + priority);
		System.out.println("���� ������ ���� =" + s);
	}

}