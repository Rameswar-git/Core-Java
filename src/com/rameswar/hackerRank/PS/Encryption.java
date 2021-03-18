package com.rameswar.hackerRank.PS;

public class Encryption {

	public static void main(String[] args) {
		System.out.println(encode("haveaniceday"));
	}

	public static String encryption(String s) {
		StringBuilder encryptedString = new StringBuilder();
		double totallength = Math.sqrt(s.length());
		int rows=0;
		int columns;
		if(totallength % 1 == 0) {
			rows = (int)totallength-1;
			columns = (int)totallength;
		}else {
			 rows = (int)Math.floor(totallength);
			 columns =(int) Math.ceil(totallength);
		}
		for (int j = 0; j < columns; j++) {
			for (int i = j; i < s.length(); i+=(rows+1)) {
				encryptedString.append(s.charAt(i));
			}
			encryptedString.append(' ');
		}

		return encryptedString.toString().trim();
	}
	
    private static String encode(String message) {
        int length = message.length();
        if (length == 0) {
            return message;
        }
        StringBuffer encoded = new StringBuffer();
        int sqrt = (int) Math.ceil(Math.sqrt(length));
        for (int col = 0; col < sqrt; col++) {
            for (int row = 0; row < sqrt; row++) {
                int position = row * sqrt + col;
                if (position < length) {
                    encoded.append(message.charAt(position));
                }
            }
            encoded.append(' ');
        }
        return encoded.substring(0, encoded.length() - 1);
    }

}
