import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e1 extends ex {
   private String[] n;
   public cs o = new cs();
   private gq p;
   private Image q;
   private int r;
   private int s;

   public e1() {
      this.o.h = false;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 120:
            k4.y = null;
            return;
         default:
            k4.u.b(var1, var2);
      }
   }

   public final void b(Image var1) {
      this.q = var1;
      this.s += var1.getHeight();
      this.e();
   }

   public final String d() {
      cs var1 = this.o;
      return this.o.o;
   }

   public final void e() {
      this.o.b = k4.q - this.o.d / 2;
      this.o.c = k4.p - (k4.p - k4.as[0].c + 5) - this.o.e - 8;
   }

   public final void b(String var1, int var2, int var3) {
      this.b(var1, var3);
      super.f = new ag(hq.A, var2);
      k4.y = this;
      this.o.b(true);
   }

   private void b(String var1, int var2) {
      this.q = null;
      this.r = k4.o - 40;
      this.s = 70 * ev.a;
      if (k4.S.b(var1) + 20 < this.r) {
         this.r = k4.S.b(var1) + 20;
      }

      if (this.r < k4.o / 2) {
         this.r = k4.o / 2;
      }

      this.n = k4.S.b(var1, this.r - 20);
      this.o = new cs();
      this.o.h = false;
      this.o.d = this.r - 10;
      this.e();
      this.o.b("");
      cs var3 = this.o;
      this.o.z = var2;
      super.e = new ag(hq.e, 120);
      k4.y = this;
   }

   public final void b(String var1, gq var2, int var3) {
      this.b(var1, var3);
      this.p = var2;
      super.f = new ag(hq.A, this.p);
      k4.y = this;
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      k4.aa.b(var1, k4.q - this.r / 2, k4.p - this.s - (k4.p - k4.as[0].c + 5), this.r, this.s, 0);
      int var2 = k4.p - this.s - (k4.p - k4.as[0].c + 5) + (this.s - this.o.e - 8) / 2 - (this.n.length >> 1) * ev.j - ev.j / 2;
      if (this.q != null) {
         var1.drawImage(this.q, k4.q, this.o.c - this.q.getHeight() / 2 - 5 * ev.a, 3);
         var2 -= this.q.getHeight() / 2;
      }

      for(int var3 = 0; var3 < this.n.length; var2 += ev.j) {
         k4.S.b(var1, this.n[var3], k4.q, var2, 2);
         ++var3;
      }

      this.o.b(var1);
      if (fp.O) {
         k4.d(var1);
         k4.aa.d(var1);
         k4.aa.c(var1, super.e, super.f, super.g);
      } else {
         super.b(var1);
      }
   }

   public final void a(int var1) {
      this.o.f(var1);
   }

   public final void c() {
      this.o.f();
      cs var1 = this.o;
      if (this.o.f) {
         super.g = this.o.b();
      }

      if (fp.O && k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }
}
