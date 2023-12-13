final class gd implements gq {
   final gb b;
   private static final String a;

   gd(gb var1) {
      this.b = var1;
   }

   public final void b() {
      k4.x.b(a, new ge(this), 1);
      k4.x.o.b(true);
   }

   static {
      String var10002 = a(a("0iị#\rRẛ^mề=\rE³\u0010fF%ẀUj\u000eiỏ>\rOª\u0007"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'J');
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
               var10005 = 126;
               break;
            case 1:
               var10005 = 1;
               break;
            case 2:
               var10005 = 102;
               break;
            case 3:
               var10005 = 83;
               break;
            case 4:
               var10005 = 45;
               break;
            case 5:
               var10005 = 33;
               break;
            default:
               var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
