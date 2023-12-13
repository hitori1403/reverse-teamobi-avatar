public final class iv extends iu {
   public static cn Q;
   public static cn R;
   public static byte S = 0;
   public static byte T = 5;
   public static short U = -1;

   public iv() {
   }

   public iv(int var1, byte var2) {
      super(0, 0, var1, var2);
      ++S;
   }

   public final void c() {
      this.b(fj.ah.b + 48 + (b2.e((fj.Y - 2) * 6) << 2), fj.ah.c + 24 + (b2.e(12) << 2));
   }

   public final void d() {
      super.M = new cn();
      if (!super.E) {
         super.M = new cn(fj.ah.b + 12 + (b2.e(fj.Y * 6) << 2), fj.ah.c + 12 + (b2.e(18) << 2));
      } else {
         cn var1 = Q;
         super.M = Q;
      }
   }

   public final void e() {
      if (super.H && !super.E) {
         if (U != -1) {
            super.E = true;
         }
      }
   }

   public final void i() {
      super.i();
      if (super.E && b2.f(Q.b - super.a) < 20 && b2.f(Q.c - super.b) < 15) {
         super.E = false;
         super.H = false;
         fj.g();
         fj.c(U, super.f);
      }

      super.D = 100 + 50 * (super.J - 50);
   }
}
