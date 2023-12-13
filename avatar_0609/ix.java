import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ix extends iu {
   public i3 Q;
   private Vector R = new Vector();
   private int S;
   private int T;
   private int U;
   int V;
   private int W;
   boolean X;
   public static Image[] Y = new Image[2];
   static final byte[][] Z = new byte[][]{{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, {0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1}, {2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3}};

   public ix(i3 var1) {
      super.d = 4;
      this.Q = var1;
      super.M = new cn();
      super.M.b = this.Q.a - 40 + b2.e(80);
      super.M.c = this.Q.b - 20 + b2.e(40);
      super.l = super.a = super.M.b;
      super.m = super.b = super.M.c;
      jw var2 = (jw)f5.b(this.Q.ah);
      this.U = var2.h;
   }

   public final void h() {
      if (this.R.size() > 0) {
         cn var1 = (cn)this.R.elementAt(0);
         super.M.b = var1.b;
         super.M.c = var1.c;
         this.R.removeElementAt(0);
      } else {
         int var2 = b2.e(20) - 10;
         if (b2.f(super.M.b + var2 - GameMidlet.k.a) >= 35) {
            var2 = 0;
         }

         super.M.b += var2;
         super.M.c = super.b;
      }

      if (super.M.b < 0) {
         super.M.b = 5;
      } else if (super.M.b > gx.f * 24) {
         super.M.b = gx.f * 24 - 5;
      } else if (super.M.c < 0) {
         super.M.c = 5;
      } else {
         if (super.M.c > gx.g * 24 - 24) {
            super.M.c = gx.g * 24 - 30;
         }
      }
   }

   public final void d() {
      this.h();
   }

   public final void a() {
      if (k4.n % (3 - this.U) == 0) {
         ++super.h;
      }

      if (super.q == 1 && super.b == super.m && this.X) {
         if (this.W == 1) {
            ++this.V;
            if (this.V > 3) {
               this.W = -1;
            }
         } else {
            --this.V;
            if (this.V < -3) {
               this.W = 1;
            }
         }
      }

      if (super.h >= 12) {
         super.h = 0;
      }

      if ((this.S != this.Q.a || this.T != this.Q.b) && b2.b(this.S, this.T, this.Q.a, this.Q.b) > 40) {
         int var2 = 10 + b2.e(20);
         if (this.Q.s == 0) {
            var2 = -(10 + b2.e(20));
         }

         if (gx.f(this.Q.a + var2, this.Q.b) != 80) {
            var2 = 0;
         }

         this.R.addElement(new cn(this.Q.a + var2, this.Q.b));
         this.S = this.Q.a + var2;
         this.T = this.Q.b;
      }

      if (super.q != 1) {
         if (super.D > 0) {
            if (super.h == 0) {
               super.q = (byte)b2.e(3 + (this.U << 1));
               if (super.q != 2) {
                  super.q = 0;
               } else {
                  super.s = (byte)b2.c(0, it.r);
               }

               if (this.X) {
                  super.q = 2;
               }
            }

            --super.D;
            if (b2.b(super.a, super.b, this.Q.a, this.Q.b) > 35) {
               super.i();
               super.D = 0;
               super.p = 4;
            }
         } else {
            this.h();
            if (super.M.b > super.a) {
               super.s = 0;
            } else {
               super.s = it.r;
            }

            this.g();
            super.q = 1;
         }
      } else {
         this.f();
      }
   }

   public final void i() {
      super.i();
      super.D = 50 + b2.e(100);
      if (this.R.size() > 0) {
         this.h();
         if (super.M.b > super.a) {
            super.s = 0;
         } else {
            super.s = it.r;
         }

         this.g();
         super.q = 1;
         super.D = 0;
         super.z = 1;
         super.p = 2 + this.U;
      } else {
         super.p = 1 + b2.e(this.U);
      }
   }

   public final void b(Graphics var1) {
      if ((super.a + 15) * ik.c >= cl.b().c && (super.a - 15) * ik.c <= cl.b().c + k4.o && !this.Q.t && (k4.ah <= 0 || k4.u != e_.g())) {
         jw var2;
         if ((var2 = (jw)f5.b(this.Q.ah)).b != -1) {
            if (var2.b >= 2000) {
               dm var3;
               if ((var3 = f5.c(var2.j[Z[super.q][super.h]])).e != -1) {
                  if (!this.X && var2.l[0] + var3.d < -10 && var3.d > 0) {
                     this.X = true;
                     this.W = 1;
                  }

                  var1.drawImage(Y[this.X ? 0 : 1], super.a * ik.c, (super.b - 1) * ik.c, 3);
                  var1.drawRegion(
                     var3.b,
                     0,
                     0,
                     var3.c,
                     var3.d,
                     super.s,
                     super.a * ik.c + var2.k[Z[super.q][super.h]] * ik.c - (super.s == it.r ? (var2.k[Z[super.q][super.h]] * ev.a << 1) + var3.c * ev.a : 0),
                     (super.b + this.V) * ik.c + var2.l[Z[super.q][super.h]] * ik.c,
                     0
                  );
                  return;
               }
            } else {
               hp var4 = f5.d[var2.j[Z[super.q][super.h]]];
               if (!this.X && var2.l[0] + var4.g < -10 && var4.g > 0) {
                  this.X = true;
                  this.W = 1;
               }

               var1.drawImage(Y[this.X ? 0 : 1], super.a * ik.c, (super.b - 1) * ik.c, 3);
               int var10002 = var4.d * ik.c;
               int var10003 = var4.e * ik.c;
               int var10004 = var4.f * ik.c;
               int var10005 = var4.g * ik.c;
               int var10007 = super.a * ik.c
                  + var2.k[Z[super.q][super.h]] * ik.c
                  - (super.s == it.r ? (var2.k[Z[super.q][super.h]] * ev.a << 1) + var4.f * ev.a : 0);
               var1.drawRegion(
                  f5.b(var4.c).f, var10002, var10003, var10004, var10005, super.s, var10007, (super.b + this.V) * ik.c + var2.l[Z[super.q][super.h]] * ik.c, 0
               );
            }
         }
      }
   }

   public final void f() {
      int var1 = super.p * this.Q.ai / 100;
      if (this.Q.ai >= 70) {
         var1 = super.p;
      }

      if (var1 <= 0) {
         var1 = 1;
      }

      int var2 = var1 * (super.z * b2.c(b2.d(super.A)) >> 10);
      var1 = -var1 * super.z * b2.b(b2.d(super.A)) >> 10;
      super.a = super.l + var2;
      super.b = super.m + var1;
      var1 = b2.b(super.l, super.m, super.a, super.b);
      ++super.z;
      if (var1 > super.B) {
         this.i();
      }
   }
}
