import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fp extends e8 {
   public static fp z;
   private ag A;
   private int B = 0;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H;
   private static g_ I;
   private static int J;
   private static int K;
   private static int L;
   private static int M;
   private static int N;
   public static boolean O;
   private static boolean P;
   private static Image Q;
   public static int R;
   private int S = 0;
   private int T;
   private int U;
   private int V;
   private int W;
   private int X;
   private int Y;
   private boolean Z = false;
   private int aa;
   private int ab = 2;
   private int ac = 0;
   private int ad = -40;
   private int ae = 1;
   private static final String[] bb;

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u000et_\u0002/k\u0010utAd2I\n4\\N&>\u001aK5u";
      int var4 = "\u000et_\u0002/k\u0010utAd2I\n4\\N&>\u001aK5u".length();
      char var1 = 3;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     bb = var5;
                     O = true;
                     R = 0;
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var12;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "utAd7E\u000255@%\rutAd(O\t?x[e4D";
                  var4 = "utAd7E\u000255@%\rutAd(O\t?x[e4D".length();
                  var1 = 11;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static void g() {
      I = null;
      Q = null;
      fy.B = null;
   }

   public static fp h() {
      if (z == null) {
         z = new fp();
      }

      return z;
   }

   public final void d() {
      super.t = 2;
      k4.w = null;
      k4.h();
      if (I == null) {
         bp.c(hq.ax);
         String[] var2 = bb;
         g_.b(var2[1], 13 * ev.a, 11 * ev.a);
         bp.b();

         try {
            int var1 = 70 * ev.a;
            if (k4.ah == 0) {
               var1 = 40;
            }

            StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
            var2 = bb;
            I = new g_(Image.createImage(var10002.append(var2[2]).toString()), var1, var1);
            Q = Image.createImage(hq.b() + var2[4]);
            if (fy.B == null) {
               fy.B = Image.createImage(hq.b() + var2[3]);
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      super.d();
      this.D = k4.p / 2 - ev.j;
      this.G = 4;
      this.H = 70 * ev.a;
      if (k4.ah == 0) {
         this.H = 40;
      }

      this.E = k4.o / this.G;
      if (this.E > 100 * ev.a) {
         this.E = 100 * ev.a;
      }

      this.F = I.c + ev.j + 5 * ev.a;
      this.C = (k4.o - this.G * this.E) / 2 + this.E / 2;
      if ((N = this.G * this.E - k4.o) < 0) {
         N = 0;
      }

      i();
      if (k4.O == 0) {
         k4.O = 1;
      }

      P = true;
      O = true;
   }

   private static void i() {
      k4.ab = e8.x;
      if (k4.ah == 0) {
         k4.ab = ev.i + 5;
      }

      k4.p = k4.b.getHeight() - k4.ab;

      for(int var0 = 0; var0 < 3; ++var0) {
         k4.as[var0].c = k4.s - k4.ab;
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            switch(this.B) {
               case 0:
               case 1:
               case 2:
               case 3:
                  var1 = this.B;
                  k4.i();
                  hx.b().g(3);
                  AutoController.K = (byte)var1;
                  return;
               case 4:
                  ez.d().e();
               default:
                  return;
            }
         case 1:
            R = 1;
            k4.B.w = false;
            hx var3;
            (var3 = hx.b()).a((byte)-96);
            var3.a();
            k4.i();
            return;
         case 2:
            hx.b().k(1);
            k4.i();
            return;
         case 3:
            this.j();
      }
   }

   public fp() {
      this.A = new ag(hq.P, 0);
      super.g = new ag(hq.y, 1);
      super.e = new ag(bb[0], 2);
      if (k4.ah == 0) {
         super.f = new ag(hq.P, 3);
      }
   }

   public final void e() {
      this.b(1, -1);
   }

   private void j() {
      P = true;
      this.A.a();
   }

   public final void b() {
      if (this.V > 0) {
         --this.V;
         if (this.V == 0 && k4.u != fb.z) {
            this.j();
         }
      }

      if (this.T != 0) {
         if (K < 0 || K > N) {
            if (this.T > 500) {
               this.T = 500;
            } else if (this.T < -500) {
               this.T = -500;
            }

            this.T -= this.T / 5;
            if (b2.f(this.T / 10) <= 10) {
               this.T = 0;
            }
         }

         J = K += this.T / 15;
         this.T -= this.T / 20;
      } else if (K < 0) {
         J = 0;
      } else if (K > N) {
         J = N;
      }

      if (K != J) {
         M = J - K << 2;
         L += M;
         K += L >> 4;
         L &= 15;
      }

      if (this.ac >= 0) {
         this.ad += this.ae * this.ac;
         this.ac += this.ae * this.ab;
         if (this.ac <= 0) {
            this.ae = -this.ae;
         }

         if (this.ad > 0) {
            this.ae = -this.ae;
            this.ac -= 2 * this.ab;
         }
      }
   }

   public final void c() {
      ++this.W;
      if (k4.d(4)) {
         if (this.B % this.G > 0) {
            --this.B;
         }
      } else if (k4.d(6)) {
         if (this.B < I.d - 1 && this.B % this.G < this.G - 1) {
            ++this.B;
         }
      } else if (k4.d(2)) {
         if (this.B / this.G > 0) {
            this.B -= this.G;
         }
      } else if (k4.d(8) && this.B / this.G < I.d / this.G && this.B + this.G < I.d) {
         this.B += this.G;
      }

      if (k4.i) {
         for(int var1 = 0; var1 < hq.dP.length; ++var1) {
            if (k4.e(this.C + var1 % this.G * this.E - this.H / 2, this.D + var1 / this.G * this.F - this.H / 2, this.H, this.H + ev.j + 10)) {
               this.aa = k4.l;
               this.X = this.W;
               this.S = K;
               this.T = 0;
               k4.i = false;
               this.Z = true;
               break;
            }
         }
      }

      if (this.Z) {
         int var4 = this.W - this.X;
         int var2 = this.aa - k4.j;
         this.aa = k4.j;
         if (k4.g) {
            if (this.W % 2 == 0) {
               this.U = k4.j;
               this.Y = this.W;
            }

            this.T = 0;
            if (J > 0 && J < N) {
               J = this.S + var2;
               this.S = J;
            } else {
               J = this.S + k4.k() / 2;
            }

            K = J;
            if (var4 < 20) {
               var2 = (J + k4.j - (this.C - this.E / 2)) / this.E;
               int var3 = (k4.k - (this.D - this.E / 2)) / this.F;
               this.B = var3 * this.G + var2;
               if (this.B < 0) {
                  this.B = 0;
               }

               if (this.B >= hq.dP.length) {
                  this.B = hq.dP.length - 1;
               }
            }

            if (b2.f(k4.l()) >= 10 * ev.a || b2.f(k4.k()) >= 10 * ev.a) {
               P = true;
            } else if (var4 > 3 && var4 < 8) {
               P = false;
            }
         }

         if (k4.h) {
            var2 = this.U - k4.j;
            int var7 = this.W - this.Y;
            if (b2.f(var2) > 40 && var7 < 20 && J > 0 && J < N) {
               this.T = var2 / var7 * 10;
            }

            this.Y = -1;
            if (b2.f(k4.l()) < 10 * ev.a && b2.f(k4.k()) < 10 * ev.a) {
               if (var4 <= 4) {
                  this.V = 5;
                  P = false;
               } else if (!P) {
                  this.j();
               }
            }

            this.Z = false;
            k4.h = false;
         }
      }

      if (k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }

   public final void a(Graphics var1) {
      k4.aa.c(var1);
      if (k4.af != 2) {
         k4.aa.b(var1, k4.q, (this.D - I.c / 2) / 2);
      }

      var1.translate(this.C, this.D);
      var1.translate(-K, 0);

      for(int var2 = 0; var2 < hq.dP.length; ++var2) {
         I.b(var2, var2 % this.G * this.E, var2 / this.G * this.F, 0, 3, var1);
         k4.U.b(var1, hq.dP[var2], var2 % this.G * this.E, var2 / this.G * this.F + I.c / 2 + 5, 2);
         if (this.B == var2 && (!k4.M || !P)) {
            var1.drawImage(Q, var2 % this.G * this.E, var2 / this.G * this.F, 3);
         }
      }
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      this.a(var1);
      b(var1, super.e, super.f, super.g);
      k4.d(var1);
      k4.c(var1);
   }

   public static void b(Graphics var0, ag var1, ag var2, ag var3) {
      k4.d(var0);
      k4.aa.d(var0);
      if (k4.w == null && (k4.y == null || k4.y == ez.o)) {
         k4.aa.c(var0, var1, var2, var3);
      }
   }

   public static void k() {
      if (O && fa.I) {
         fa.I = false;
         fa.g().D[4] = 0;
         k4.b.c();
         i();
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'e');
      }

      return var10000;
   }

   private static String c(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 90;
               break;
            case 1:
               var10005 = 27;
               break;
            case 2:
               var10005 = 47;
               break;
            case 3:
               var10005 = 75;
               break;
            case 4:
               var10005 = 91;
               break;
            case 5:
               var10005 = 42;
               break;
            default:
               var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
