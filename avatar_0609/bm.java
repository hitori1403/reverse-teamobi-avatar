import javax.microedition.lcdui.Graphics;

final class bm extends ag {
   private df g;
   private final int h;

   bm(String var1, int var2, int var3) {
      super(var1, 13, var2);
      this.h = var3;
      this.g = (df)fj.E.elementAt(var3);
   }

   public final void b(Graphics var1, int var2, int var3) {
      fj.g(this.g.b).b(var1, var2 + fb.F / 2, var3 + fb.F / 2);
   }

   public final void b() {
      if (fb.ac && this.h == fb.T - fj.F().size()) {
         fb.p();
         fb.b(fj.g(this.g.b).g);
         b5 var1 = fj.g(this.g.b);
         int var2 = this.g.f;
         if (var1.e == 4) {
            var2 -= fj.K[1].size();
         } else if (var1.e == 1) {
            var2 -= fj.K[0].size();
         }

         fb.b(hq.az + var2);
      }
   }
}
