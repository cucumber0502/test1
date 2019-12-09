package ±è±¤Çö;

public class ProgTest1 {
	public static int cVar =0;	//0¾ÈºÙÀÓ
	String[] iStr = {"0","1","2","3","4","5","6","7","8","9"};
	double iDouble;
	boolean iBool = false;
	char ichar = 'a';
	
	String getGugudan(int dan) {
		String gugu = "";
		
		gugu = (dan) + "´Ü: \r\n";
		for (int i = 1; i <= 9; i++) {
			gugu = gugu + (dan + "x" + i + "=" + dan *i);
			if (i !=9) {
				gugu += ("\t");
			}
	}
		return gugu;
}
}
