import javax.microedition.lcdui.Graphics;

public final class ew extends ev {
   private int n;
   private int o;
   private int p;
   private int q;
   private String[][] r;
   public byte s = 0;
   private static e8 t;
   public static int u = 0;
   private String[][] v;
   private static int w = 0;
   private String[][] x;
   public static boolean y = false;
   private static int z = 0;
   private String[][] A;
   public static int B = 0;
   private static short[] C;
   private static short[] D;
   private String[][] E;
   private String[][] F;
   private static int G = 0;
   public static int H = 0;
   static int I = 0;
   private String[][] J;
   String[][] K;
   private static byte[] L;
   private static int M = 0;
   private String[][] N;
   public static boolean O = false;
   private static byte[] P = new byte[]{3, 7, 4, 1, 5};

   public ew() {
      O = false;
      y = true;
      this.n = 10;
      this.q = 0;
      super.f = new ag("", new cj(this));
      super.e = new ag(hq.c1, new ci());
   }

   public final void b() {
   }

   public final void c() {
      if (y) {
         super.c();
      }

      if (y && t == k4.u && k4.w == null && k4.y == null) {
         if (this.r != null) {
            k4.f[2] = k4.f[4] = k4.f[6] = k4.f[8] = false;
         }

         if (this.r != null && this.q < this.r.length - 1 && k4.u != fb.g()) {
            k4.h = false;
            k4.g = false;
            k4.i = false;
         }
      }
   }

   private void d() {
      this.p = this.r[this.q].length * ev.h + (ev.b << 1);
      if (this.p < (ev.h << 1) + (ev.b << 1)) {
         this.p = (ev.h << 1) + (ev.b << 1);
      }

      this.o = 5;
   }

   public final void b(Graphics var1) {
      if (t == k4.u && k4.w == null && k4.y == null) {
         k4.d(var1);
         var1.translate(0, k4.al);
         if (y || k4.n % 20 > 2) {
            dq.b(var1, this.n, this.o, k4.o - (this.n << 1), this.p, 16777215, 1, (byte)0);
            if (this.r != null && this.r[this.q] != null) {
               byte var2 = 0;
               if (this.r[this.q].length == 1) {
                  var2 = 2;
               }

               for(int var3 = 0; var3 < this.r[this.q].length; ++var3) {
                  k4.V
                     .b(
                        var1,
                        this.r[this.q][var3],
                        this.n + (k4.o - (this.n << 1)) / 2,
                        this.o + this.p / 2 - this.r[this.q].length * ev.h / 2 + var3 * ev.h - var2,
                        2
                     );
               }

               ++this.s;
               if (this.s >= 8) {
                  this.s = 0;
               }

               if (k4.u == fc.z) {
                  var1.translate(-fc.N + fc.g().H, -fc.S + fc.g().I);
               } else {
                  var1.translate(-cl.b().c, -cl.b().d);
               }
            }
         }

         if (y) {
            super.b(var1);
            if (k4.n % 10 > 5 || k4.ah > 0) {
               c9 var4 = k4.T;
               if (k4.ah > 0) {
                  var4 = k4.U;
               }

               var4.b(var1, hq.x, k4.as[1].b + e8.w / 2, k4.as[1].c + k4.ab / 2 - ev.i / 2, 2);
            }
         }
      }
   }

   public final void e() {
      if (z == P.length + 1) {
         k4.H = null;
         k4.N = false;
      } else {
         if (this.A == null) {
            this.A = hq.c();
         }

         t = fc.z;
         y = true;
         if (z < P.length) {
            fc.g().L = P[z];
         }

         k4.H.b(this.A[z]);
         ++z;
      }
   }

   void b(String[] var1) {
      this.r = new String[var1.length][];

      for(int var2 = 0; var2 < this.r.length; ++var2) {
         this.r[var2] = k4.V.b(var1[var2], k4.o - (this.n << 1) - 35 * ev.a);
      }

      this.d();
      y = true;
   }

   public final void f() {
      if (this.E == null) {
         this.E = hq.d();
      }

      t = AutoController.z;
      (C = new short[3])[0] = 180;
      C[1] = 312;
      C[2] = 720;
      L = new byte[]{108, 100, 107};
      if (B != 0) {
         if (B == C.length) {
            this.c(288, 150);
            return;
         }

         cl.b().b(C[B] * ev.a, 20 * ev.a);
         cl.q = true;
      }

      if (B != 0) {
         il var1 = new il(-9, C[B], 50, 20);
         gx.m.addElement(var1);
         gx.b(gx.m);
      }

      k4.H.b(this.E[B]);
      ++B;
   }

   public final void g() {
      if (this.F == null) {
         this.F = hq.e();
      }

      t = AutoController.z;
      (C = new short[3])[0] = 865;
      C[1] = 445;
      C[2] = 95;
      L = new byte[]{57, 104, 58, 100, 107};
      if (G != 0) {
         if (G == C.length) {
            this.c(640, 150);
            return;
         }

         cl.b().b(C[G] * ev.a, 20 * ev.a);
         cl.q = true;
         il var1 = new il(-9, C[G], 50, 20);
         gx.m.addElement(var1);
         gx.b(gx.m);
      }

      k4.H.b(this.F[G]);
      ++G;
   }

   public static boolean c(int var0) {
      if (O) {
         return true;
      } else {
         switch(gx.b) {
            case 9:
               if (B - 1 < L.length && var0 == L[B - 1]) {
                  return true;
               }
               break;
            case 23:
               if (G - 1 < L.length && var0 == L[G - 1]) {
                  return true;
               }
               break;
            case 25:
               if (H <= L.length && var0 == L[H - 1]) {
                  return true;
               }
               break;
            case 57:
               if (w <= L.length && var0 == L[w - 1]) {
                  return true;
               }
         }

         return false;
      }
   }

   public final void b(e8 var1) {
      if (this.J == null) {
         this.J = hq.g();
      }

      t = var1;
      if (H == 0) {
         C = new short[]{372, -1, -1, 220};
         D = new short[]{25, -1, -1, 25};
         L = new byte[]{52, -1, -1, 24};
      } else if (H == this.J.length) {
         this.c(170, 150);
         return;
      }

      if (H == 1) {
         k();
      }

      il var2 = new il(-9, C[H], D[H], 20);
      gx.m.addElement(var2);
      gx.b(gx.m);
      cl.b().b(C[H] * ev.a, 20 * ev.a);
      cl.q = true;
      k4.H.b(this.J[H]);
      ++H;
   }

   private void h() {
      if (this.N == null) {
         this.N = hq.h();
      }

      t = fj.z;
      if (M == 0) {
         C = new short[]{(short)(fj.g().W[0].b * gx.j + 12), (short)(fj.ah.b + 12), (short)fj.a0, (short)fj.aC.a, (short)(fj.ai.b + 12)};
         D = new short[]{36, 36, (short)(fj.a1 + 15), 36, 36};
      }

      int var1 = M;
      if (M < 3) {
         var1 = 0;
      } else if (var1 == 3) {
         var1 = 1;
      } else if (var1 == 4) {
         var1 = 2;
      } else if (var1 == 5) {
         var1 = 3;
      } else if (var1 == 6) {
         var1 = 4;
      }

      if (M < 3 || M == 4 || M == 5) {
         il var2 = new il(-9, C[var1], D[var1], 20);
         gx.m.addElement(var2);
         gx.b(gx.m);
      }

      cl.b().b(C[var1] * ev.a, 36 * ev.a);
      cl.q = true;
      k4.H.b(this.N[M]);
      ++M;
      fj.g().e = null;
   }

   public final void c(e8 var1) {
      if (this.x == null) {
         this.x = hq.i();
      }

      t = var1;
      if (w == 0) {
         C = new short[]{192};
         L = new byte[]{56};
         il var2 = new il(-9, C[w] + 12, 135, 20);
         gx.m.addElement(var2);
         gx.b(gx.m);
         cl.b().b(C[w] + 12, 130 * ev.a);
      } else {
         if (w == this.x.length) {
            this.c(180, 240);
            return;
         }

         cl.q = true;
      }

      k4.H.b(this.x[w]);
      ++w;
   }

   public final void i() {
      if (this.v == null) {
         this.v = hq.j();
      }

      t = AutoController.z;
      if (u == 0) {
         L = new byte[]{56};
      } else {
         if (u == this.v.length) {
            this.c(170, 170);
            return;
         }

         if (u < 4) {
            C = new short[]{12, 480, 230};
            D = new short[]{110, 110, 12};
            cl.b().b(C[u - 1] * ev.a, D[u - 1] * ev.a);
            cl.q = true;
            il var1 = new il(-9, C[u - 1], D[u - 1], 20);
            gx.m.addElement(var1);
            gx.b(gx.m);
         } else {
            cl.q = false;
         }
      }

      k4.H.b(this.v[u]);
      ++u;
   }

   private static void k() {
      for(int var0 = 0; var0 < gx.m.size(); ++var0) {
         ik var1;
         if ((var1 = (ik)gx.m.elementAt(var0)).d == 1 && ((il)var1).f == -9) {
            gx.m.removeElement(var1);
            --var0;
         }
      }
   }

   private void c(int var1, int var2) {
      this.q = 0;
      O = true;
      k();
      il var3 = new il(-9, var1, var2, 20);
      gx.m.addElement(var3);
      gx.b(gx.m);
      cl.b().b(var1 * ev.a, var2 * ev.a);
      cl.q = true;
      String[] var4 = hq.k();
      k4.H.b(var4);
   }

   public static void l() {
      int var0 = M;
      if (M < 3) {
         var0 = 0;
      } else if (var0 == 3) {
         var0 = 1;
      } else if (var0 == 4) {
         var0 = 2;
      }

      if (var0 < C.length) {
         (k4.H = new ew()).h();
      }
   }

   public static void m() {
      k4.N = true;
      M = 0;
      H = 0;
      u = 0;
      B = 0;
      z = 0;
      w = 0;
      O = false;
      y = false;
   }

   static void b(ew var0) {
      if (var0.q < var0.r.length - 1) {
         ++var0.q;
         y = true;
         var0.d();
         if (gx.b == 23) {
            if (G == 1 && var0.q == var0.r.length - 1) {
               cl.b().b(C[0], 20);
               cl.q = true;
               il var1 = new il(-9, C[G - 1], 50, 20);
               gx.m.addElement(var1);
               gx.b(gx.m);
               return;
            }
         } else if (gx.b == 9 && B == 1 && var0.q == var0.r.length - 1) {
            var0.f();
            return;
         }
      } else if (var0.q == var0.r.length - 1) {
         cl.q = false;
         if (100 == gx.b) {
            k4.H = null;
            return;
         }

         if (k4.u == fc.z && var0.A != null && z == var0.A.length) {
            var0.e();
            return;
         }

         if (gx.b == 24) {
            if (M == 3 || M == 4 || M == 5 || M == 6) {
               k();
               (k4.H = new ew()).h();
               y = true;
               return;
            }

            if (M == 7 && y && !O) {
               var0.c(470, 168);
               return;
            }
         } else if (gx.b == 25) {
            if (H == var0.J.length - 1) {
               k4.H = null;
            }
         } else if (gx.b == 13) {
            var0.q = 0;
            if (!O) {
               var0.i();
               return;
            }
         }

         var0.o = 5;
         y = false;
      }
   }
}
