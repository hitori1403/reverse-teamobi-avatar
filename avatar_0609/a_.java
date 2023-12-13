import javax.microedition.lcdui.Graphics;

final class a_ extends ag {
   private int g = 0;
   private String h;
   private String i;
   private short j;
   private short k;
   private int l;
   private static final String a;

   public a_(String var1, bv var2, int var3, String var4, short var5, String var6, int var7, short var8) {
      super(var1, var2);
      this.g = var3;
      this.h = var4;
      this.j = var5;
      this.i = var6;
      this.l = var7;
      this.k = var8;
   }

   public final void b() {
      if (fb.ac && this.g == fb.T) {
         fb.p();
         jv var1;
         if (GameMidlet.k.D == 1) {
            var1 = f5.b(this.j);
         } else {
            var1 = f5.b(this.k);
         }

         if (var1.b != -1) {
            if (GameMidlet.k.D == 1) {
               AutoController.h();
               AutoController.b(var1);
            } else {
               AutoController.h();
               AutoController.b(var1);
            }
         }

         fb.b(this.h);
         if (this.i != null) {
            fb.b(this.i);
         }

         if (this.l >= 0) {
            fb.b(hq.aA + k4.e(this.l) + a);
         }
      }
   }

   public final void b(Graphics var1, int var2, int var3) {
      jv var4;
      if (GameMidlet.k.D == 1) {
         var4 = f5.b(this.j);
      } else {
         var4 = f5.b(this.k);
      }

      var4.b(var1, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }

   static {
      String var10002 = a(a("|BkC"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ ')');
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
               var10005 = 92;
               break;
            case 1:
               var10005 = 22;
               break;
            case 2:
               var10005 = 2;
               break;
            case 3:
               var10005 = 46;
               break;
            case 4:
               var10005 = 124;
               break;
            case 5:
               var10005 = 10;
               break;
            default:
               var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
