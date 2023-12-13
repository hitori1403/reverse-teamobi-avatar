import javax.microedition.lcdui.Graphics;

final class at extends ag {
   private final df g;
   private final int h;

   at(String var1, int var2, df var3, int var4) {
      super(var1, 12, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f8.c(this.g.b).b(var1, 7, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }

   public final void b() {
      if (this.h == fb.T) {
         fb.p();
         fb.b(this.g.g);
         fb.b(hq.az + this.g.f);
      }
   }
}
