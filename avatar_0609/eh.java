final class eh implements gq {
   private ep b;
   private final n c;
   private static final String a;

   eh(ep var1, n var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      try {
         e1 var1 = k4.x;
         cs var3 = k4.x.o;
         if (!k4.x.o.o.equals("")) {
            var1 = k4.x;
            cs var5 = k4.x.o;
            int var6 = Math.abs(Integer.parseInt(k4.x.o.o));
            a.concat(String.valueOf(var6));
            new kx(this, var6, this.c).start();
         }
      } catch (Exception var2) {
      }
   }

   static {
      String var10002 = a(a("LớR6ǅỐWx0R"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '9');
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
               var10005 = 31;
               break;
            case 1:
               var10005 = 10;
               break;
            case 2:
               var10005 = 114;
               break;
            case 3:
               var10005 = 90;
               break;
            case 4:
               var10005 = 117;
               break;
            case 5:
               var10005 = 51;
               break;
            default:
               var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
