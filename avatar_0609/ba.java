import javax.microedition.lcdui.Graphics;

final class ba extends ag {
   private final b5 g;
   private final int h;

   ba(String var1, int var2, b5 var3, int var4) {
      super(var1, 9, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      this.g.b(var1, var2 + fb.F / 2, var3 + fb.F / 2);
   }

   public final void b() {
      if (this.h == fb.T) {
         fb.p();
         fb.b(this.g.g);
         fb.b(hq.aA + k4.b(this.g.h, this.g.i, false));
      }
   }
}
