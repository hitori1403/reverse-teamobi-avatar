import javax.microedition.lcdui.Graphics;

final class ay extends ag {
   private final df g;
   private final int h;

   ay(String var1, dp var2, df var3, int var4) {
      super(var1, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f5.d[this.g.c].b(var1, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }

   public final void b() {
      if (this.h == fb.T || fb.U) {
         fb.p();
         fb.b(this.g.g);
         fb.b(hq.aA + this.g.e[0] + hq.U);
         fb.b(hq.bQ + k4.e(GameMidlet.k.A[0]) + hq.U);
      }
   }
}
