public class ByteArrayDecoder {
	public static void main(String[] args) {
		// base64-like fishing token from modder's server
		// String msg = new String(c("GMTY4MzIyMzg0MTM0OF9Pa2VsYV8xMjggbmfDoHk="));
		byte[] inputBytes = { 65, 52, 88, 94, 120, 74, 113, 102, 51, 69, 76, 101, 123, 57, 125, 94, 121, 112, 75, 101, 126,
				112, 113, 94, 122, 77, 92, 93, 52, 74, 113, 104, 70, 61, 87, 102, 122, 82, 113, 80, 57, 120, 91, 104, 112, 112,
				75, 94, 122, 108, 75, 103, 115, 57, 91, 93, 115, 86, 55, 80, 122, 115, 72, 103, 52, 86, 76, 101, 75 };
		System.out.println(a(c(d(new String(inputBytes)))));
	}

	private static int a(char paramChar) {
		return (paramChar >= 'A' && paramChar <= 'Z') ? (paramChar - 65)
				: ((paramChar >= 'a' && paramChar <= 'z') ? (paramChar - 97 + 26)
						: ((paramChar >= '0' && paramChar <= '9') ? (paramChar - 48 + 52)
								: ((paramChar == '+') ? 62 : ((paramChar == '/') ? 63 : ((paramChar == '=') ? 0 : -1)))));
	}

	public static String a(byte[] paramArrayOfbyte) {
		String str = null;
		try {
			str = new String(paramArrayOfbyte);
		} catch (Exception ignored) {
		}
		return str;
	}

	public static byte[] c(String paramString) {
		paramString = paramString.substring(1);
		byte b1 = 0;
		int i;
		for (i = paramString.length() - 1; paramString.charAt(i) == '='; i--)
			b1++;
		byte[] arrayOfByte = new byte[paramString.length() * 6 / 8 - b1];
		i = 0;
		for (byte b2 = 0; b2 < paramString.length(); b2 += 4) {
			int j = (a(paramString.charAt(b2)) << 18) + (a(paramString.charAt(b2 + 1)) << 12)
					+ (a(paramString.charAt(b2 + 2)) << 6) + a(paramString.charAt(b2 + 3));
			for (byte b = 0; b < 3 && i + b < arrayOfByte.length; b++)
				arrayOfByte[i + b] = (byte) (j >> 8 * (2 - b));
			i += 3;
		}
		return arrayOfByte;
	}

	public static String d(String paramString) {
		StringBuilder stringBuffer = new StringBuilder();
		for (byte b = 0; b < paramString.length(); b++)
			stringBuffer.append((char) (paramString.charAt(b) - 4));
		return (new StringBuffer(stringBuffer.toString())).reverse().toString();
	}
}
