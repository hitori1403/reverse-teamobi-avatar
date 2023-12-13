final class jm implements gq {
   private static final String a;

   public final void b() {
      String var1 = hq.a3;
      switch(fc.g().L) {
         case 0:
            hx.b().g(11);
            break;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
            hx.b().g(9);
            break;
         case 7:
            hx.b().g(10);
      }

      k4.d(var1 + hq.dO[fc.g().L] + a);
   }

   static {
      String var10002 = a(a("WtF"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'c');
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
               var10005 = 121;
               break;
            case 1:
               var10005 = 90;
               break;
            case 2:
               var10005 = 104;
               break;
            case 3:
               var10005 = 13;
               break;
            case 4:
               var10005 = 58;
               break;
            case 5:
               var10005 = 115;
               break;
            default:
               var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
