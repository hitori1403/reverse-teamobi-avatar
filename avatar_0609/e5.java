import javax.microedition.lcdui.Graphics;

public final class e5 extends e4 {
   public static e5 n;
   private cs[] o;
   private String p;
   private int q;
   private int r;
   private int s = 200 + k4.ah * 88;
   private int t;
   private int u;
   private int v;
   private String[][] w;

   public static e5 e() {
      return n == null ? (n = new e5()) : n;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            k4.D = null;
            return;
         default:
            k4.u.b(var1, var2);
      }
   }

   public e5() {
      this.q = (k4.o - this.s) / 2;
   }

   public final void b(cs[] var1, String var2, String[][] var3, ag var4) {
      super.e = new ag(hq.e, 0);
      super.f = var4;
      this.p = var2;
      this.o = var1;
      this.w = var3;
      this.t = e8.v + ev.b + ev.j + (var1[0].e << 1) * var1.length + k4.ah * 12;
      this.r = (k4.p - k4.ab - this.t) / 2;

      for(int var5 = 0; var5 < var1.length; ++var5) {
         var1[var5].d = this.s - 50 * (k4.ah + 1) - k4.S.b(var3[0][0]);
         var1[var5].b = this.q + this.s - var1[var5].d - 10 * (k4.ah + 1);
         var1[var5].c = this.r + ib.t + ev.b + ev.j + (var1[0].e * var5 << 1);
      }

      this.v = k4.S.b(var2) + 20 * ev.a;
      if (this.v < 50 + 20 * ev.a) {
         this.v = 50 + 20 * ev.a;
      }

      this.f();
   }

   public final void c() {
      for(int var1 = 0; var1 < this.o.length; ++var1) {
         this.o[var1].f();
      }

      boolean var2 = false;
      if (k4.d(2)) {
         --this.u;
         if (this.u < 0) {
            this.u = this.o.length - 1;
         }

         var2 = true;
      } else if (k4.d(8)) {
         ++this.u;
         if (this.u > this.o.length - 1) {
            this.u = 0;
         }

         var2 = true;
      }

      if (var2) {
         this.f();
      }

      super.c();
   }

   private void f() {
      for(int var1 = 0; var1 < this.o.length; ++var1) {
         this.o[var1].b(false);
      }

      this.o[this.u].b(true);
      super.g = this.o[this.u].b();
   }

   public final void a(int var1) {
      for(int var2 = 0; var2 < this.o.length; ++var2) {
         cs var3;
         if ((var3 = this.o[var2]).f) {
            this.o[var2].f(var1);
         }
      }

      super.a(var1);
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      k4.aa.b(var1, this.q, this.r, this.t, this.s, 0, 0, ib.b().l, this.v, ib.t, 1, 1, ib.b().r, ib.b().q, this.p);

      for(int var2 = 0; var2 < this.o.length; ++var2) {
         var1.setClip(this.q + 4 * ev.a, this.r, this.s - 8 * ev.a, this.t);
         int var3;
         if ((var3 = this.o[var2].b - k4.S.b(this.w[var2][0]) - 5) > this.q + 4 * ev.a + 5) {
            var3 = this.q + 4 * ev.a + 5;
         }

         byte var4 = 2;
         if (this.w[var2][1].equals("")) {
            var4 = 1;
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            k4.S.b(var1, this.w[var2][var5], var3, this.o[var2].c + this.o[var2].e / 2 - ev.j * var4 / 2 + ev.j * var5, 0);
         }

         this.o[var2].b(var1);
      }

      super.b(var1);
   }
}
