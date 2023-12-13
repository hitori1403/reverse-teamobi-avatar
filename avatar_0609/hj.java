import java.util.Hashtable;

final class hj implements gq {
   private hi b;
   private final ji c;
   private static final String[] a;

   hj(hi var1, ji var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      try {
         e7.n = null;
         e7 var10000 = e7.e();
         Hashtable var10001 = new Hashtable();
         String[] var2 = a;
         var10000.b(var10001, var2[0], this.c.g(var2[1]), (byte)-1);
         k4.D = e7.e();
      } catch (d var3) {
         var3.printStackTrace();
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "<fk[\u0002.,?jv\\\u0003G;)\u0005\u0011ET|9";
      int var4 = "<fk[\u0002.,?jv\\\u0003G;)\u0005\u0011ET|9".length();
      char var1 = 15;
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
         var10000[0] = (char)(var10000[0] ^ 'o');
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
               var10005 = 112;
               break;
            case 1:
               var10005 = 39;
               break;
            case 2:
               var10005 = 59;
               break;
            case 3:
               var10005 = 9;
               break;
            case 4:
               var10005 = 77;
               break;
            case 5:
               var10005 = 14;
               break;
            default:
               var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
