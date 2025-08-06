package tns.day1;

public class LoopingStatements {
	int num ;

	public static void main(String[] args) {
			System.out.println("Hello world");
		// TODO Auto-generated method stub
			int a[] = {1,2,3,4,5};
			int ii = 0;
			for(int i:a) {
				System.out.println(i);
			}
			
			do {
				System.out.println(ii);
				ii++;
			}
			while(ii<10);

	}

}
            