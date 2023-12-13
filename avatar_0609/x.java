final class x implements gq {
   private final g3 b;

   x(g3 var1) {
      this.b = var1;
   }

   public final void b() {
      for(int var1 = 0; var1 < this.b.f.length; ++var1) {
         String var3 = "";
         df var2;
         if (this.b.f[var1] < 100) {
            var2 = fj.l(this.b.f[var1]);
            if (this.b.f[var1] < 50) {
               var3 = f8.c(this.b.f[var1]).b;
            } else if (f8.d(this.b.f[var1]).d == 1) {
               var3 = hq.bd + " " + f8.d(this.b.f[var1]).m;
            } else if (f8.d(this.b.f[var1]).d == 2) {
               var3 = hq.bc + " " + f8.d(this.b.f[var1]).m;
            }
         } else {
            var2 = fj.k(this.b.f[var1]);
            var3 = fj.g(this.b.f[var1]).g;
         }

         if (var2 == null || var2.f < this.b.g[var1]) {
            k4.c(hq.dY + var3);
            return;
         }
      }

      h2.b().e(this.b.b);
      fb.g().e();
   }
}
