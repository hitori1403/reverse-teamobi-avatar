import javax.microedition.lcdui.Graphics;

public final class fn extends e8 {
   public static fn z;
   int[] A;
   private e8 B;
   int C = 5;
   int D;
   int E = 7;

   public static fn g() {
      if (z == null) {
         z = new fn();
      }

      return z;
   }

   public final void b(AutoController var1) {
      super.d();
      this.B = var1;
      super.t = 0;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            k4.B.w = false;
            this.B.d();
            return;
         case 1:
            k4.B.w = false;
            this.B.d();
            hv.b().b(AutoController.A, super.t);
      }
   }

   public fn() {
      super.g = new ag(hq.e, 0);
      super.f = new ag(hq.P, 1);
      this.D = 20;
      if (k4.ah > 0) {
         this.D = k4.ah * 30;
      }

      if (k4.o < 176) {
         this.D = 15;
      }

      if (this.E * this.D > k4.p - k4.ab) {
         this.E = (k4.p - k4.ab) / this.D;
      }
   }

   public final void b(int var1, boolean var2) {
      if (var2 && super.t == var1 && super.f != null) {
         super.f.a();
      }

      super.b(var1, var2);
   }

   public final void c() {
      super.c();
   }

   public final void b() {
      this.B.b();
   }

   public final void b(Graphics var1) {
      var1.translate(0, 0);
      var1.setClip(0, 0, k4.o, k4.p);
      this.B.a(var1);
      k4.aa.b(var1, k4.q - (this.D * this.C + 10) / 2, k4.r - this.D * this.E / 2, this.D * this.C + 10, this.D * this.E);
      k4.aa.b(var1, this.D, this.C, this.E, super.l, super.t, this.A);
      super.b(var1);
   }
}
