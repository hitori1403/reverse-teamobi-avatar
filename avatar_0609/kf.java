public final class kf {
   public static boolean b;
   public static boolean c;
   public static boolean d;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   private static final String a;

   public static void b(int var0) {
      if (var0 != -97 && var0 != -98 && var0 != 54 && var0 != 55 && var0 != -80 && var0 != 51 && var0 != 53 && var0 != 57) {
         a.concat(String.valueOf(var0));
      }

      switch(var0) {
         case -64:
            fk.ad = System.currentTimeMillis();
            g = false;
            return;
         case 8:
            fu.aV = false;
            return;
         case 62:
            b = false;
            return;
         case 64:
            d = false;
            return;
         case 65:
            i = false;
            return;
         case 66:
            c = false;
            return;
         case 71:
            f = false;
            return;
         case 73:
            e = false;
            return;
      }
   }

   static {
      String var10002 = a(a("\"U\u0000B"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '7');
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
               var10005 = 65;
               break;
            case 1:
               var10005 = 56;
               break;
            case 2:
               var10005 = 100;
               break;
            case 3:
               var10005 = 127;
               break;
            case 4:
               var10005 = 63;
               break;
            case 5:
               var10005 = 76;
               break;
            default:
               var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
