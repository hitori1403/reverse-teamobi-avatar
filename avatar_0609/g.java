final class g implements gq {
   private f b;
   private static final String a;

   g(f var1) {
      this.b = var1;
   }

   public final void b() {
      try {
         e1 var1 = k4.x;
         cs var3 = k4.x.o;
         if (!k4.x.o.o.equals("")) {
            var1 = k4.x;
            cs var5 = k4.x.o;
            int var6;
            f.b = (var6 = Math.abs(Integer.parseInt(k4.x.o.o))) > 100 ? 100 : var6;
            b2.b(kq.n[3], String.valueOf(var6));
            k4.c(a);
         }
      } catch (Exception var2) {
      }
   }

   static {
      String var10002 = a(a("Ž¨9'Ǣ K\u000e«pkŃỢ\u001f"));
      boolean var10001 = true;
      a = var10002;
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
               var10005 = 109;
               break;
            case 1:
               var10005 = 75;
               break;
            case 2:
               var10005 = 25;
               break;
            case 3:
               var10005 = 75;
               break;
            case 4:
               var10005 = 82;
               break;
            case 5:
               var10005 = 85;
               break;
            default:
               var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
