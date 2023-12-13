import javax.microedition.lcdui.Graphics;

final class bh extends ag {
   private final b5 g;
   private final int h;
   private final df i;

   bh(String var1, int var2, b5 var3, int var4, df var5) {
      super(var1, 11, var2);
      this.g = var3;
      this.h = var4;
      this.i = var5;
   }

   public final void b(Graphics var1, int var2, int var3) {
      this.g.b(var1, var2 + fb.F / 2, var3 + fb.F / 2);
   }

   public final void b() {
      if (fb.ac && this.h == fb.T - fj.G.size()) {
         fb.p();
         fb.b(this.g.g);
         fb.b(hq.az + this.i.f);
         if (this.g.i > 0) {
            fb.b(hq.aL + k4.e(this.i.f * this.g.i) + hq.U);
         } else if (this.g.h > 0) {
            fb.b(hq.aL + k4.e(this.i.f * this.g.h) + hq.U);
         }

         fb.b(AutoController.w());
      }
   }
}
