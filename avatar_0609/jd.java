public final class jd implements jc {
   private static final String[] a;

   public final int b(byte[] var1, int var2) {
      byte var3;
      for(var3 = (byte)(var1.length - var2); var2 < var1.length; ++var2) {
         var1[var2] = var3;
      }

      return var3;
   }

   public final int b(byte[] var1) {
      int var2;
      if ((var2 = var1[var1.length - 1] & 255) <= var1.length && var2 != 0) {
         for(int var3 = 1; var3 <= var2; ++var3) {
            if (var1[var1.length - var3] != var2) {
               throw new c(a[1]);
            }
         }

         return var2;
      } else {
         String[] var4 = a;
         throw new c(var4[0]);
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u001e\u001b@e$\u001b&\r\u0011\u0004&)\u0005;\u001b\nP \"\u0013\u001e\u001b@e$\u001b&\r\u0011\u0004&)\u0005;\u001b\nP \"";
      int var4 = "\u001e\u001b@e$\u001b&\r\u0011\u0004&)\u0005;\u001b\nP \"\u0013\u001e\u001b@e$\u001b&\r\u0011\u0004&)\u0005;\u001b\nP \"".length();
      char var1 = 19;
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'I');
      }

      return var10000;
   }

   private static String a(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 110;
               break;
            case 1:
               var10005 = 122;
               break;
            case 2:
               var10005 = 36;
               break;
            case 3:
               var10005 = 69;
               break;
            case 4:
               var10005 = 70;
               break;
            case 5:
               var10005 = 119;
               break;
            default:
               var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
