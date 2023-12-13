import javax.microedition.lcdui.Graphics;

final class as extends ag {
   private AutoController g;
   private final jv h;
   private final byte i;

   as(AutoController var1, String var2, f6 var3, jv var4, byte var5) {
      super(var2, var3);
      this.g = var1;
      this.h = var4;
      this.i = var5;
   }

   public final void b(Graphics var1, int var2, int var3) {
      this.h.b(var1, var2 + fb.F / 2, var3 + fb.F / 2, 3);
   }

   public final void b() {
      if (this.i == fb.T) {
         fb.p();
         AutoController.b(this.h);
         String var1 = "";
         if (this.h.e == 20) {
            var1 = hq.aD;
         } else if (this.h.e == 10) {
            var1 = hq.aC;
         } else if (this.h.e == 40) {
            var1 = hq.aF;
         } else if (this.h.e == 50) {
            var1 = hq.aE;
         }

         fb.b(var1 + f5.b(this.h));
         fb.b(k4.b(this.h.d[0], this.h.d[1], true));
         fb.b(hq.cY + f5.c(this.h));
         fb.b(hq.dC[0] + AutoController.aj.W);
      }
   }
}
