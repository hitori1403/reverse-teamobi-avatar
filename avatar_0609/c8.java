public final class c8 {
   private static final String a;

   public static String b(String var0) {
      try {
         byte[] var5 = var0.getBytes(a);
         i_ var1;
         (var1 = new i_()).b(var5, 0, var5.length);
         byte[] var6 = new byte[var1.b()];
         var1.b(var6, 0);
         byte[] var7 = var6;
         StringBuffer var8 = new StringBuffer();

         for(int var2 = 0; var2 < var7.length; ++var2) {
            String var3;
            if ((var3 = Integer.toHexString(var7[var2] & 255)).length() == 1) {
               var8.append("0");
            }

            var8.append(var3);
         }

         return var8.toString();
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      String var10002 = a(a("N}`?b"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '\n');
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
               var10005 = 27;
               break;
            case 1:
               var10005 = 41;
               break;
            case 2:
               var10005 = 38;
               break;
            case 3:
               var10005 = 18;
               break;
            case 4:
               var10005 = 90;
               break;
            case 5:
               var10005 = 96;
               break;
            default:
               var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
