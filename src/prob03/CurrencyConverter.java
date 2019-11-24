package prob03;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		return won / rate;
	}

	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		return dollar * rate;
	}

	public static void setRate(double r) {
		// 환율 설정(KRW/$1)
		rate = r;
	}
}


	
	
	
//	public static int[] doubleToInt(double[] d2) {
//		int length = d2.length;
//		
//		int[] result = new int[length];
//		for(int i = 0; i < length; i++) {
//			result[i] = (int)d2[i];
//		}
//		
//	public  int calcDiscountPrice( int percentage ) {
//	    int discountPrice = price – price*30/100; 
//	    return discountPrice;
//	}
/*
 * 		double dollar = CurrencyConverter.toDollar( 1000000. );
		System.out.println( "백만원은 " + dollar + "달러 입니다" );
 */
	

