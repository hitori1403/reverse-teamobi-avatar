final class ei implements gq {
   private fj b;
   private final n c;
   private static final String a;

   ei(fj var1, n var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      k4.x.b(a, new ej(this, this.c), 1);
      k4.x.o.b(true);
      k4.x.o.b("1");
   }

   static {
      String var10002 = a(a("4Ỏo&ƝảA\u0000%o"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '/');
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
               var10005 = 103;
               break;
            case 1:
               var10005 = 31;
               break;
            case 2:
               var10005 = 79;
               break;
            case 3:
               var10005 = 74;
               break;
            case 4:
               var10005 = 45;
               break;
            case 5:
               var10005 = 64;
               break;
            default:
               var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
