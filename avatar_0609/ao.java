import javax.microedition.lcdui.Graphics;

final class ao extends ag {
   private final g3 g;
   private final int h;

   ao(String var1, x var2, g3 var3, int var4) {
      super(var1, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      b5 var4 = fj.g(this.g.c);
      f8.b(var1, var4.c, var2 + fb.F / 2, var3 + fb.F / 2, 3);
      var1.translate(0, g5.r);
      var1.setClip(0, 0, 5 * fb.F, fb.E);
      if (this.h == fb.T) {
         for(int var5 = 0; var5 < this.g.f.length; ++var5) {
            df var6;
            if (this.g.f[var5] < 50) {
               var6 = fj.l(this.g.f[var5]);
               f8.c(this.g.f[var5])
                  .b(
                     var1,
                     7,
                     fb.D / 2 - this.g.f.length * 30 * ev.a / 2 + var5 * 30 * ev.a + 15 * (ev.a - 1),
                     (fb.F << 1) + 25 * ev.a + (ev.h << 2) + 10 * (ev.a - 1),
                     3
                  );
            } else if (this.g.f[var5] < 100) {
               var6 = fj.l(this.g.f[var5]);
               n var7 = f8.d(this.g.f[var5]);
               f5.b(
                  var1,
                  var7.i,
                  fb.D / 2 - this.g.f.length * 30 * ev.a / 2 + var5 * 30 * ev.a + 15 * (ev.a - 1),
                  (fb.F << 1) + 25 * ev.a + (ev.h << 2) + 10 * (ev.a - 1),
                  3
               );
            } else {
               var6 = fj.k(this.g.f[var5]);
               var4 = fj.g(this.g.f[var5]);
               f8.b(
                  var1,
                  var4.c,
                  fb.D / 2 - this.g.f.length * 30 * ev.a / 2 + var5 * 30 * ev.a + 15 * (ev.a - 1),
                  (fb.F << 1) + 25 * ev.a + (ev.h << 2) + 10 * (ev.a - 1),
                  3
               );
            }

            c9 var9 = k4.V;
            if (var6 == null || var6.f < this.g.g[var5]) {
               var9 = k4.U;
            }

            var9.b(
               var1,
               String.valueOf(this.g.g[var5]),
               fb.D / 2 - this.g.f.length * 30 * ev.a / 2 + var5 * 30 * ev.a - 1 + 15 * (ev.a - 1),
               (fb.F << 1) + 25 * ev.a + (ev.h << 2) + 8 * ev.a + 10 * (ev.a - 1),
               2
            );
            if (var5 != this.g.f.length - 1) {
               k4.V
                  .b(
                     var1,
                     "+",
                     fb.D / 2 - this.g.f.length * 30 * ev.a / 2 + var5 * 30 * ev.a + 15 * ev.a + 15 * (ev.a - 1),
                     (fb.F << 1) + 25 * ev.a + (ev.h << 2) + 10 * (ev.a - 1),
                     2
                  );
            }
         }
      }

      var1.setClip(0, 0, 5 * fb.F, fb.I * fb.F - fb.W);
      var1.translate(0, -g5.r);
   }

   public final void b() {
      if (this.h == fb.T) {
         fb.p();
         fb.b(this.g.e);
         fb.b(hq.d2 + this.g.d + "p");
         b5 var1;
         if ((var1 = fj.g(this.g.c)).h > 0) {
            fb.b(hq.dZ + k4.e(var1.h) + hq.U);
         } else if (var1.i > 0) {
            fb.b(hq.dZ + k4.e(var1.i) + hq.U);
         }

         fb.b(hq.d0);
      }
   }
}
