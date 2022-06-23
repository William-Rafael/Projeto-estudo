package reforco_primeiraaula;

public class OutroFor {

	public static void main(String[] args) {
		for(int num = 0; num <= 20; num++) {
			
			if(num%2 ==0) {
				continue;
			}
			System.out.println(num);
		}

	}

}
