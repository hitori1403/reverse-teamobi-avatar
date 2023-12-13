import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class f1 extends fz {
   private static f1 n;
   private Vector o;
   public int p;
   private int q;
   public int r;
   public int s;
   public int t;
   public int u;
   private int v;
   public int w;
   public static g_ x;
   private boolean y = false;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F = 0;
   public static gq G;
   public static short[] H;
   private int I;
   private int J;
   private int K = 0;
   private int L;
   private boolean M = false;
   private long N;
   private long O;
   private long P;

   public static f1 d() {
      return n == null ? (n = new f1()) : n;
   }

   public f1() {
      this.a();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.f();
            return;
         case 1:
            this.y = false;
            k4.w = null;
            if (G != null) {
               G.b();
            }
      }
   }

   public final void a() {
      if (k4.ah == 0) {
         super.e = new ag(hq.P, 0);
      }

      super.g = new ag(hq.e, 1);
   }

   public final void b(Vector var1, int var2, int var3, int var4) {
      if (var1.size() != 0) {
         if (k4.ah > 0) {
            super.l = true;
         }

         this.F = var1.size();
         this.E = k4.p;
         this.y = true;
         this.t = this.F * var3 + (ev.b << 1) + 4;
         if (this.t > k4.o) {
            this.t = k4.o;
         }

         this.r = var2 - this.t / 2;
         this.u = var4 + (ev.b << 1) + 4;
         if (this.r < 0) {
            this.r = 0;
         }

         this.s = k4.s - k4.ab - this.u - (ev.b << 1);
         this.v = this.s;
         this.w = var4;
         this.o = var1;
         this.e();
         this.D = this.F * this.w - (this.t - (ev.b << 1) - 4);
         if (this.D < 0) {
            this.D = 0;
         }

         this.J = this.t;
         G = null;
         H = null;
         k4.w = this;
      }
   }

   private void e() {
      if (this.p < 0) {
         this.p = 0;
      }

      if (this.p >= this.F) {
         this.p = 0;
      }
   }

   public final void b(Vector var1, int var2) {
      if (var1.size() != 0) {
         if (k4.ah > 0) {
            super.l = true;
         }

         this.w = e8.x;
         H = null;
         this.E = k4.p;
         this.q = 0;
         this.o = var1;
         this.F = this.o.size();
         this.t = this.u = 0;

         for(int var4 = 0; var4 < this.F; ++var4) {
            ag var3 = (ag)this.o.elementAt(var4);
            int var5;
            if ((var5 = k4.S.b(var3.b) + 20) > this.t) {
               this.t = var5;
            }

            this.u += this.w;
         }

         if (this.t < k4.o / 3) {
            this.t = k4.o / 3;
         }

         if (this.t > k4.o - 4) {
            this.t = k4.o - 4;
         }

         this.u += 4;
         if (var2 == 0) {
            this.r = 2 * (k4.ah != 0 ? 2 : 1);
         } else if (var2 == 1) {
            this.r = k4.o - this.t - 2;
         } else {
            this.r = (k4.o >> 1) - (this.t >> 1);
         }

         if (this.F > 5) {
            this.u = e8.x * 5 + 4;
         }

         this.s = k4.p - this.u - ev.b - k4.ab;
         if (fp.O) {
            this.s = k4.s - k4.ab - this.u - 5;
         }

         if (k4.p < 200) {
            this.s += 10;
         }

         this.v = k4.p - this.w;
         if (k4.ah > 0) {
            this.s = k4.s - this.u - ev.b - 3;
            if (k4.ah == 1) {
               this.s -= 7;
            }

            super.e = null;
         }

         this.y = false;
         this.p = 0;
         this.D = (this.F - 5) * this.w;
         if (this.D < 0) {
            this.D = 0;
         }

         this.z = 0;
         this.A = 0;
         if (k4.I) {
            k4.g();
         }

         G = null;
         this.J = this.u;
         k4.w = this;
      }
   }

   private void f() {
      this.y = false;
      k4.w = null;
      ag var1;
      if ((var1 = (ag)this.o.elementAt(this.p)).e != null) {
         var1.e.b(var1.d);
      } else if (var1.c != null) {
         var1.c.b();
      } else {
         k4.u.a(var1.d, var1.f);
      }
   }

   public final void c() {
      super.c();
      ++this.O;
      boolean var1 = false;
      if (k4.d(2) || k4.d(4)) {
         var1 = true;
         --this.p;
         if (this.p < 0) {
            this.p = this.F - 1;
         }

         super.l = false;
      } else if (k4.d(8) || k4.d(6)) {
         var1 = true;
         ++this.p;
         if (this.p > this.F - 1) {
            this.p = 0;
         }

         super.l = false;
      }

      if (k4.i && k4.e(this.r - 2, this.v - 7, this.t + 4, this.u + 15)) {
         k4.i = false;
         this.K = this.A;
         this.N = System.currentTimeMillis() / 10L;
         this.M = true;
      }

      if (this.M) {
         int var2 = k4.l();
         if (this.y) {
            var2 = k4.k();
         }

         long var3 = System.currentTimeMillis() / 10L - this.N;
         if (k4.g) {
            if (k4.n % 3 == 0) {
               this.L = k4.k;
               this.P = this.O;
            }

            this.I = 0;
            if (Math.abs(var2) < 20 * ev.a) {
               int var5 = this.v;
               int var6 = (this.z + k4.k - var5) / this.w;
               if (this.y) {
                  var5 = this.r;
                  var6 = (this.z + k4.j - var5) / this.w;
               }

               this.p = var6;
               this.e();
            }

            if (b2.f(var2) >= 20 * ev.a) {
               super.l = true;
            } else if (var3 > 10L && var3 < 20L) {
               super.l = false;
            }

            this.z = this.K + var2;
            if (this.z < 0 || this.z > this.D) {
               this.z = this.K + var2 / 3;
            }

            this.A = this.z;
         }

         if (k4.h && k4.e(this.r - 2, this.v - 7, this.t + 4, this.u + 15)) {
            int var11 = (int)(this.O - this.P);
            int var12;
            if (b2.f(var12 = this.L - k4.k) > 40 && var11 < 10 && this.z > 0 && this.z < this.D) {
               this.I = var12 / var11 * 10;
            }

            this.P = -1L;
            if (Math.abs(var2) < 20 * ev.a) {
               if (var3 <= 10L) {
                  super.l = false;
               }

               if (!super.l) {
                  var2 = this.v;
                  var2 = (this.z + k4.k - var2) / this.w;
                  if (this.y) {
                     var2 = this.r;
                     var2 = (this.z + k4.j - var2) / this.w;
                  }

                  this.p = var2;
                  this.e();
                  this.f();
               }
            }

            k4.h = false;
         }
      }

      if (k4.h) {
         if (!this.M) {
            this.y = false;
            k4.w = null;
            if (G != null) {
               G.b();
            }
         }

         this.M = false;
         k4.h = false;
      }

      if (var1) {
         this.z = this.p * this.w - this.t / 2 + this.w / 2;
         if (this.z > this.D) {
            this.z = this.D;
            return;
         }

         if (this.z < 0) {
            this.z = 0;
         }
      }
   }

   public final void g() {
      this.z = this.p * this.w - this.t / 2 + this.w / 2;
      if (this.z > this.D) {
         this.z = this.D;
      } else {
         if (this.z < 0) {
            this.z = 0;
         }
      }
   }

   public final void b(Graphics var1) {
      var1.translate(0, this.E);
      if (this.y) {
         Graphics var4 = var1;
         f1 var5 = this;
         k4.d(var1);
         k4.aa.b(var1, this.r, this.s, this.t, this.u);
         var1.translate(this.r + ev.b + 2, this.s + ev.b + 2);
         var1.setClip(0, 0, this.t - (ev.b << 1) - 4, this.w);
         var1.translate(-this.A, 0);
         int var6;
         if ((var6 = this.A / this.w) < 0) {
            var6 = 0;
         }

         int var3;
         if ((var3 = var6 + this.t / this.w + 2) > this.F) {
            var3 = this.F;
         }

         if (!super.l) {
            ib.b(var1, this.p * this.w, 0, this.w, this.w);
         }

         for(int var2 = var6; var2 < var3; ++var2) {
            ((ag)var5.o.elementAt(var2)).b(var4, var2 * var5.w + var5.w / 2, var5.w / 2);
         }

         if (var5.p >= 0 && var5.p < var5.o.size()) {
            ag var7 = (ag)var5.o.elementAt(var5.p);
            var4.setClip(var5.A - 50, -100, var5.A + k4.o + 100, var5.u + 200);
            var6 = var5.p * var5.w + var5.w / 2;
            if (var5.F * var5.w + (ev.b << 1) + 10 > k4.o) {
               var3 = k4.T.b(var7.b) / 2;
               if (var6 - var3 < var5.A) {
                  var6 = var5.A + var3;
               } else if (var6 + var3 > k4.o + var5.A - 15) {
                  var6 = k4.o + var5.A - var3 - 15;
               }
            }

            k4.T.b(var4, var7.b, var6, -ev.i - ev.b - 6 - (ev.a == 2 ? 15 : 0), 2);
         }

         k4.d(var4);
      } else if (this.F != 0) {
         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
         Graphics var11 = var1;
         f1 var12 = this;
         k4.d(var1);
         if (fp.O) {
            k4.aa.e(var1, this.r - 2, this.v - 7, this.t + 4, this.u + 15);
         } else {
            k4.aa.b(var1, this.r - 2, this.v - 7, this.t + 4, this.u + 15);
         }

         var1.setClip(this.r, this.v, this.t, this.u);
         var1.translate(this.r + 3, this.v + 1);
         var1.translate(0, -this.A);
         int var8 = (this.w - ev.j) / 2;

         for(int var10 = 0; var10 < var12.F; ++var10) {
            var11.setColor(0);
            if (!var12.l && var10 == var12.p) {
               if (fp.O) {
                  var11.setColor(35217);
                  var11.fillRect(0, var10 * var12.w, var12.t - 6, var12.w);
               } else {
                  k4.aa.b(var11, var10 * var12.w, var12.t - 6, var12.w);
               }
            }

            short var14 = 0;
            if (H != null && var10 < H.length && H[var10] != -1 && f5.d(H[var10]) != null) {
               var14 = f5.d(H[var10]).c;
               f5.b(var11, H[var10], 3, var10 * var12.w + var8 + 1, 0);
            }

            if (fp.O) {
               k4.T.b(var11, ((ag)var12.o.elementAt(var10)).b, var14 + 5, var10 * var12.w + var8, 0);
            } else {
               k4.aa.b(var11, ((ag)var12.o.elementAt(var10)).b, var14 + 5, var10 * var12.w + var8, 0);
            }
         }
      }

      super.b(var1);
   }

   public final void b() {
      if (this.E != 0) {
         this.E += -this.E >> 1;
      }

      if (this.E == -1) {
         this.E = 0;
      }

      if (this.I != 0) {
         if (this.A < 0 || this.A > this.D) {
            this.I -= this.I / 4;
            this.A += this.I / 20;
            if (this.I / 10 <= 1) {
               this.I = 0;
            }
         }

         if (this.A < 0) {
            if (this.A < -this.J / 2) {
               this.A = -this.J / 2;
               this.z = 0;
               this.I = 0;
            }
         } else if (this.A > this.D) {
            if (this.A < this.D + this.J / 2) {
               this.A = this.D + this.J / 2;
               this.z = this.D;
               this.I = 0;
            }
         } else {
            this.A += this.I / 10;
         }

         this.z = this.A;
         this.I -= this.I / 10;
         if (this.I / 10 == 0) {
            this.I = 0;
         }
      } else if (this.A < 0) {
         this.z = 0;
      } else if (this.A > this.D) {
         this.z = this.D;
      }

      if (this.A != this.z) {
         this.C = this.z - this.A << 2;
         this.B += this.C;
         this.A += this.B >> 4;
         this.B &= 15;
      }

      if (this.v > this.s) {
         int var1;
         if ((var1 = this.v - this.s >> 2) <= 0) {
            var1 = 1;
         }

         this.v -= var1;
      }

      this.v = this.s;
   }
}
