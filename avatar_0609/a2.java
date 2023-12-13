import javax.microedition.lcdui.Graphics;

final class a2 extends ag {
   private final String a;
   private final i3 g;
   private final i3 h;
   private final short i;
   private final byte j;
   private final byte k;
   private final String l;
   private static final String m;

   a2(String var1, String var2, i3 var3, i3 var4, short var5, byte var6, byte var7, String var8) {
      super(var1, null);
      this.a = var2;
      this.g = var3;
      this.h = var4;
      this.i = var5;
      this.j = var6;
      this.k = var7;
      this.l = var8;
   }

   public final void b(Graphics var1, int var2, int var3) {
      var2 = 15 * ev.a;
      k4.S.b(var1, this.a, fb.D / 2 - 7, var2, 2);
      var2 += this.g.e + k4.S.b() + 15 * ev.a;
      this.g.b(var1, fb.D / 4 - 7, var2, true);
      this.h.b(var1, fb.D / 4 * 3 - 7, var2, true);
      dm var7;
      if ((var7 = f5.d(this.i)).e != -1) {
         var1.drawImage(var7.b, fb.D / 2 - 7, var2 - this.g.e / 2, 3);
         if (this.j > 0) {
            k4.V.b(var1, m + this.j + "+" + this.k + "%", fb.D / 2 - 7, var2, 2);
            var2 += k4.V.b();
            AutoController.b(var1, "", fb.D / 2 - 8, var2, this.k);
         }
      }

      var2 += k4.V.b() << 1;
      k4.S.b(var1, this.l, fb.D / 2 - 7, var2 - 5, 2);
   }

   public final void b() {
      this.h.a();
   }

   static {
      String var10002 = a(a("Y6"));
      boolean var10001 = true;
      m = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'W');
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
               var10005 = 53;
               break;
            case 1:
               var10005 = 64;
               break;
            case 2:
               var10005 = 120;
               break;
            case 3:
               var10005 = 100;
               break;
            case 4:
               var10005 = 108;
               break;
            case 5:
               var10005 = 66;
               break;
            default:
               var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
