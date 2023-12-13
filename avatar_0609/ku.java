public final class ku extends Thread {
   static int b;
   static int c;
   private static int d = 200;
   private static final String a;

   static {
      String var10002 = a(a("\u0012śẴ/a\u0001\u001f\u0012<\u009e/z\u0094\u0011\u0012+\u001e/oộ\u000e\u001c"));
      boolean var10001 = true;
      a = var10002;
   }

   public final void run() {
      if (GameMidlet.k.A[0] <= 3000) {
         k4.c(hq.dY + hq.D + a);
      } else {
         b = 0;
         hv.b().d(c, 0, 0);
         fj.m(1000);
         hv.b().b(34, -1);
         fj.m(d);
         hv.b().b(35, -1);
         fj.m(d);
         hv.b().b(36, -1);
         fj.m(d);
         hv.b().b(40, -1);
         fj.m(d);
         hv.b().b(41, -1);
         fj.m(d);
         hv.b().b(38, -1);
         fj.m(d);
         hv.b().b(43, -1);
         fj.m(d);
         hv.b().b(54, -1);
         fj.m(d);
         hv.b().b(47, -1);
         fj.m(d);
         hv.b().b(50, -1);
         fj.m(d);
         hv.b().b(44, -1);
         fj.m(d);

         for(int var1 = 0; var1 < 10; ++var1) {
            if (b != 0) {
               hx.b().k(b);
               return;
            }

            fj.m(100);
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '~');
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
               var10005 = 50;
               break;
            case 1:
               var10005 = 74;
               break;
            case 2:
               var10005 = 119;
               break;
            case 3:
               var10005 = 15;
               break;
            case 4:
               var10005 = 12;
               break;
            case 5:
               var10005 = 116;
               break;
            default:
               var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
