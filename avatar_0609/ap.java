import javax.microedition.lcdui.Graphics;

final class ap extends ag {
   ap(String var1, fj var2) {
      super(var1, 2, var2);
   }

   public final void b(Graphics var1, int var2, int var3) {
      g3 var7;
      b5 var10 = fj.g((var7 = f8.c(fj.aX)).c);
      f8.b(var1, var10.c, k4.B.g / 2, fb.E / 2 - 30, 3);
      k4.V.b(var1, var7.e, k4.B.g / 2, fb.E / 2 - 30 + 5 + f8.b(var10.c).d / 2 + ev.k + 2, 2);
      String var8 = "";
      int var4 = fj.aW / 3600;
      c9 var5 = k4.U;
      if (var4 > 0) {
         var8 = var4 + ":";
      }

      int var6;
      if ((var6 = (fj.aW - var4 * 3600) / 60) > 0 || var4 > 0) {
         var8 = var8 + var6 + ":";
      }

      var4 = fj.aW - var4 * 3600 - var6 * 60;
      String var9 = var8 + var4;
      if (fj.aW == 0) {
         var9 = hq.d1;
         var5 = k4.V;
      }

      var5.b(var1, var9, k4.B.g / 2, fb.E / 2 - 30 + 5 + f8.b(var10.c).d / 2, 2);
   }
}
