import javax.microedition.lcdui.Graphics;

final class av extends ag {
   private int g;
   private int h;
   private h9 i;

   public av(String var1, jq var2, int var3, h9 var4, int var5) {
      super(var1, var2);
      this.g = var3;
      this.i = var4;
      this.h = var5;
   }

   public final void b() {
      if (fb.ac && fb.T - this.h == this.g) {
         fb.p();
         fb.b(hq.aB + this.i.d);
         fb.b(hq.aA + this.i.e + (this.i.f == 0 ? hq.D : hq.E));
      }
   }

   public final void b(Graphics var1, int var2, int var3) {
      f5.b(var1, this.i.c, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }
}
