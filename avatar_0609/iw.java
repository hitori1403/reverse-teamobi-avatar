public final class iw extends iu {
   public static cn Q;
   public static byte R = 0;
   public static short S = -1;

   public iw() {
   }

   public iw(int var1, byte var2) {
      super(0, 0, var1, var2);
      ++R;
   }

   public final void c() {
      this.b((fj.Y + 3) * 24 + (b2.e((gx.f - fj.Z - fj.Y - 5) * 6) << 2), 48 + (b2.e(30) << 2));
   }

   public final void e() {
      if (S == -1) {
         super.E = false;
      } else if (super.H && !super.E) {
         super.E = true;
      }
   }

   public final void d() {
      super.M = new cn();
      this.h();
   }

   public final void h() {
      if (super.E) {
         super.p = 2;
         cn var1 = Q;
         super.M = Q;
      } else {
         super.M = new cn(288 + (b2.e(126) << 2), 24 + (b2.e(36) << 2));
      }
   }

   public final void i() {
      if (!super.E && b2.c() == 0) {
         super.D = 200;
      }

      if (super.E && b2.b(Q.b, Q.c, super.a, super.b) < 18) {
         super.E = false;
         super.H = false;
         super.D = 200;
         fj.g();
         fj.c(S, super.f);
      }

      super.i();
   }
}
