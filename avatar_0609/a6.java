import javax.microedition.lcdui.Graphics;

final class a6 extends ag {
   private final gl g;
   private final int h;
   private final int i;
   private static final String[] a;

   a6(String var1, gb var2, gl var3, int var4, int var5) {
      super(var1, var2);
      this.g = var3;
      this.h = var4;
      this.i = var5;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f5.b(this.g.b).a(var1, var2 + fb.F / 2, var3 + fb.F / 2, 3);
      ib.b(var2 + 3, var3 + fb.F - 3 * ev.a, fb.F - 5, 2 * ev.a, 1, var1);
      ib.b(var2 + 3, var3 + fb.F - 3 * ev.a, fb.F - 5 - this.g.c * (fb.F - 5) / 100, 2 * ev.a, 11907085, var1);
   }

   public final void b() {
      if (fb.ac && this.h == fb.T) {
         jv var1 = f5.b(this.g.b);
         fb.p();
         fb.b(hq.b3 + (100 - this.g.c) + "%");
         String var2 = "";
         if (var1.e == 20) {
            var2 = hq.aD;
         } else if (var1.e == 10) {
            var2 = hq.aC;
         }

         fb.b(var2 + f5.b(var1));
         if (this.g.d != null && !this.g.d.equals("")) {
            fb.b(this.g.d);
         }

         if (this.i == 0) {
            StringBuffer var10000 = new StringBuffer(String.valueOf(hq.dC[2]));
            String[] var3 = a;
            fb.b(var10000.append(var3[1]).append(f5.c(var1)).toString());
            return;
         }

         if (var1.a != -2) {
            byte var4;
            if (var1.a >= 0) {
               var4 = ((jw)f5.b(var1.a)).h;
            } else {
               var4 = ((jw)var1).h;
            }

            fb.b(hq.dC[2] + a[0] + var4);
         }
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "*K\u0002*K";
      int var4 = "*K\u0002*K".length();
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
         var10000[0] = (char)(var10000[0] ^ 27);
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
               var10005 = 16;
               break;
            case 1:
               var10005 = 107;
               break;
            case 2:
               var10005 = 38;
               break;
            case 3:
               var10005 = 26;
               break;
            case 4:
               var10005 = 100;
               break;
            case 5:
               var10005 = 18;
               break;
            default:
               var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
