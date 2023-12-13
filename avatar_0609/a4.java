import javax.microedition.lcdui.Graphics;

final class a4 extends ag {
   private final int g;
   private static final String[] a;

   a4(String var1, int var2, int var3) {
      super(var1, 7, var2);
      this.g = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f8.g[this.g].b(var1, 7, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }

   public final void b() {
      if (this.g == fb.T && fb.ac) {
         fb.p();
         fb.b(f8.g[this.g].l + "(" + f8.g[this.g].f + hq.bg + ")");
         fb.b(hq.aA + k4.b(f8.g[this.g].h[0], f8.g[this.g].h[1], false));
         StringBuffer var10000 = new StringBuffer(String.valueOf(hq.dC[2]));
         String[] var2 = a;
         fb.b(var10000.append(var2[1]).append(f8.g[this.g].n).toString());
         if (f8.g[this.g].m) {
            b5 var1 = fj.g(f8.g[this.g].k);
            fb.b(hq.de + var2[0] + var1.g);
         }

         fb.b(hq.df + a[0] + k4.e(f8.g[this.g].j));
         fb.b(AutoController.w());
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u001b\u0016\u0002\u001b\u0016";
      int var4 = "\u001b\u0016\u0002\u001b\u0016".length();
      char var1 = 2;
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
         var10000[0] = (char)(var10000[0] ^ 30);
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
               var10005 = 33;
               break;
            case 1:
               var10005 = 54;
               break;
            case 2:
               var10005 = 126;
               break;
            case 3:
               var10005 = 99;
               break;
            case 4:
               var10005 = 89;
               break;
            case 5:
               var10005 = 34;
               break;
            default:
               var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
