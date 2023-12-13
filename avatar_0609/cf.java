final class cf implements gq {
   private fi b;
   private static final String a;

   cf(fi var1) {
      this.b = var1;
   }

   public final void b() {
      fi.ab = false;
      this.b.e = new ag(a, new aa(this.b));
      this.b.f = this.b.I;
   }

   static {
      String var10002 = a(a("řÐ-\u0005"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
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
               var10005 = 73;
               break;
            case 1:
               var10005 = 35;
               break;
            case 2:
               var10005 = 67;
               break;
            case 3:
               var10005 = 98;
               break;
            case 4:
               var10005 = 54;
               break;
            case 5:
               var10005 = 38;
               break;
            default:
               var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
