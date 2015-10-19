
public class loops {

	public static int getMaximum(int[] x) {
		// TODO Auto-generated method stub
		int temp;
		temp = 0;
		for(int i=1; i < x; i++){
			if (temp < x){
				temp = x;
			}
		}
		return 0;
	}

	public static int getAverage(int[] maxdays) {
		// TODO Auto-generated method stub
		int sum, ave;
		sum = 0;
		for(int i=0; i < maxdays.length; i++){
			sum+= maxdays[i];
			}
		ave =sum/maxdays.length;
		return ave;
	}

	public static int getMinimum(int[] x) {
		// TODO Auto-generated method stub
		int temp;
		temp = 9999999;
		switch(x){
		case 1: med = 16 ;break;	
		
		case 2: med  = (14+15)/2 ;break;

		case 3: med = 16 ;break;

		default:;
		break;
		}
		return 0;
	}

	public static int getMedian(int[] x) {
		// TODO Auto-generated method stub
		int med;
		switch(x){
		case 1: med = 16 ;break;	
		
		case 2: med  = (14+15)/2 ;break;

		case 3: med = 16 ;break;
		}
		return med ;}
	}

}
