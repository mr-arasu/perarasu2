public class test {
	static int x= 10;

	static class Inner{
		void show() {
			System.out.println(" Static value x ="+x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner obj= new Inner ();
		obj.show();
	}

}
