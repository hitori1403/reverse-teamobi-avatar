import javax.microedition.lcdui.Graphics;

final class bc extends ag {
   private jv g;
   private short h;
   private int i;
   private int j;
   private AutoController k;

   public bc(AutoController var1, String var2, er var3, jv var4, short var5, int var6, int var7) {
      super(var2, var3);
      this.k = var1;
      this.g = var4;
      this.h = var5;
      this.i = var6;
      this.j = var7;
   }

   public final void b() {
      if (fb.ac && this.i == fb.T) {
         jv var1 = this.g;
         if (this.g.b == -1) {
            var1 = f5.b(this.h);
         }

         if (var1.b != -1) {
            AutoController.b(var1);
            fb.p();
            fb.b(var1.g);
            if (this.j == -1) {
               fb.b(k4.b(var1.d[0], var1.d[1], false));
            }

            if (var1.a == -1) {
               fb.b(hq.dC[0] + ((jw)var1).h);
            }

            fb.b(hq.ap + GameMidlet.k.C);
            if (AutoController.W) {
               fb.b(hq.c5 + GameMidlet.k.A[3] + " " + hq.l());
            }
         }
      }
   }

   public final void b(Graphics var1, int var2, int var3) {
      jv var4 = this.g;
      if (this.g.b == -1) {
         var4 = f5.b(this.h);
      }

      if (var4.b != -1) {
         var4.a(var1, var2 + fb.F / 2, var3 + fb.F / 2, 3);
      }
   }
}
