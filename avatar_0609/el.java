final class el implements gq {
   final ek b;
   private final int c;
   private static final String[] a;

   el(ek var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      try {
         e1 var1 = k4.x;
         cs var4 = k4.x.o;
         int var5;
         if ((var5 = Integer.parseInt(k4.x.o.o)) > fj.C.size()) {
            String[] var2 = a;
            k4.c(var2[0]);
         } else {
            new kz(this, this.c, var5).start();
         }
      } catch (Exception var3) {
         k4.c(a[1]);
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Aở.~4Aỉj^.6ứYJm\u0016ẏ~,ƈ\u0004#\rẑ~°\tŻẦ\n`6-Ữ\u0004#ů!0#\t\tð\u0018Aở.~4Aỉj^.6ứYJu\u009e/~)Ự\u001e#\rẑ";
      int var4 = "Aở.~4Aỉj^.6ứYJm\u0016ẏ~,ƈ\u0004#\rẑ~°\tŻẦ\n`6-Ữ\u0004#ů!0#\t\tð\u0018Aở.~4Aỉj^.6ứYJu\u009e/~)Ự\u001e#\rẑ".length();
      char var1 = '+';
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
         var10000[0] = (char)(var10000[0] ^ 'j');
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
               var10005 = 3;
               break;
            case 1:
               var10005 = 126;
               break;
            case 2:
               var10005 = 64;
               break;
            case 3:
               var10005 = 94;
               break;
            case 4:
               var10005 = 68;
               break;
            case 5:
               var10005 = 41;
               break;
            default:
               var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
