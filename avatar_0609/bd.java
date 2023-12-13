import javax.microedition.lcdui.Graphics;

final class bd extends ag {
   private int g = 0;
   private df h;

   public bd(String var1, dx var2, int var3, df var4) {
      super(var1, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      if (this.h.b < 50) {
         f8.c(this.h.b).b(var1, 7, var2 + fb.F / 2, var3 + fb.F / 2, 3);
      } else {
         int var10002 = var2 + fb.F / 2;
         int var10003 = var3 + fb.F / 2;
         f5.b(var1, f8.d(this.h.b).i, var10002, var10003, 3);
      }
   }

   public final void b() {
      if (this.g == fb.T) {
         fb.p();
         fb.b(this.h.g);
         fb.b(hq.az + this.h.f);
         fb.b(hq.aL + k4.e(this.h.e[0] * this.h.f) + hq.U);
         fb.b(AutoController.w());
      }
   }
}
