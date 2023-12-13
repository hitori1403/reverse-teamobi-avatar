import javax.microedition.lcdui.Graphics;

final class a5 extends ag {
   private final n g;
   private final int h;

   a5(String var1, int var2, n var3, int var4) {
      super(var1, 8, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f5.b(var1, this.g.h, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }

   public final void b() {
      if (this.h == fb.T - f8.g.length && fb.ac) {
         fb.p();
         fb.b(this.g.m + "(" + this.g.e + hq.bg + ")");
         fb.b(hq.aA + k4.b(this.g.f[0], this.g.f[1], false));
         fb.b(this.g.n);
         fb.b(AutoController.w());
      }
   }
}
