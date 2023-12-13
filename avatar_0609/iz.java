public final class iz extends iy {
   public static int S = 0;
   public static cn T;

   public iz(int var1, byte var2) {
      super(var1, var2);
      super.Q = 0;
      super.R = 0;
      ++S;
   }

   public final void c() {
      super.M = new cn();
      if (super.Q == super.f) {
         super.a = super.l = super.M.b = (fj.Y + 3) * 24 + k();
         super.b = super.m = super.M.c = 72 + (b2.e(24) << 2);
      } else {
         this.d();
         if (!gx.e(super.a, super.b)) {
            super.M = new cn((fj.Y + 3) * 24 + k(), 72 + (b2.e(24) << 2));
         }

         super.a = super.l = super.M.b;
         super.b = super.m = super.M.c;
      }
   }

   private static int k() {
      return b2.e((gx.f - fj.Z - fj.Y - 5) * 6) << 2;
   }

   public final void b(cn var1) {
      super.M = new cn(var1.b - 48 + k(), var1.c - 48 + (b2.e(24) << 2));
   }

   public final void h() {
      super.h();
   }
}
