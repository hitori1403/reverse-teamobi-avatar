import java.io.InputStream;

public final class y {
   static String[] b;
   static String[] c;
   static boolean d = true;
   static int e;

   static {
      String var10002 = a(a("\u0017g/WX"));
      boolean var10001 = true;
      String var0 = var10002;

      try {
         InputStream var1;
         byte[] var2 = new byte[(var1 = "".getClass().getResourceAsStream(kq.k[2])).available()];
         var1.read(var2);
         var1.close();
         String[] var5;
         b = new String[(var5 = kq.b(new String(var2, var0), kq.l[0])).length];
         c = new String[var5.length];

         for(int var6 = 0; var6 < var5.length; ++var6) {
            String[] var3 = kq.b(var5[var6], kq.l[1]);
            c[var6] = var3[0];
            b[var6] = var3[1];
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   static void b(String var0) {
      if (var0.indexOf(kq.k[1]) != -1 && d) {
         for(short var1 = 4; var1 < 10; ++var1) {
            hx.b().b(var1);
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'k');
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
               var10005 = 66;
               break;
            case 1:
               var10005 = 51;
               break;
            case 2:
               var10005 = 105;
               break;
            case 3:
               var10005 = 122;
               break;
            case 4:
               var10005 = 96;
               break;
            case 5:
               var10005 = 36;
               break;
            default:
               var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
