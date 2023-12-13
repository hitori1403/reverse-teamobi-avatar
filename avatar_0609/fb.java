import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fb extends e8 {
   public static fb z;
   private static String[] A;
   private static int B;
   public static int C;
   public static int D;
   public static int E;
   public static int F;
   private static int G;
   private static int H;
   public static int I;
   private static int J;
   private static int K;
   public static int L;
   private int M;
   public Vector[] N;
   private Vector O;
   ag[] P;
   private boolean[] Q;
   private String[] R;
   public static String S;
   public static int T;
   public static boolean U;
   private static int V;
   public static int W;
   private static Vector X;
   private static e8 Y;
   private int Z;
   private int aa = 0;
   public boolean ab = false;
   public static boolean ac;
   public static boolean ad;
   private static boolean ae;
   private static int af;
   private static int ag;
   private static String ah;
   private int ai;
   private int aj;
   private boolean ak = false;
   private int al = 0;
   private int am = 80 * ev.a;
   private static final String[] bb;

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "q\u0011\"6\u0007J?u\u001b2IK\u0006v\u00076A\u001a]\u0006v\u00076B\u001a]";
      int var4 = "q\u0011\"6\u0007J?u\u001b2IK\u0006v\u00076A\u001a]\u0006v\u00076B\u001a]".length();
      char var1 = '\f';
      int var0 = -1;

      while(true) {
         String var10002 = c(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            bb = var5;
            G = 5;
            I = 5;
            T = 0;
            U = false;
            V = 0;
            W = 0;
            X = new Vector();
            ac = false;
            ad = false;
            ae = false;
            af = 0;
            ah = "";
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static fb g() {
      if (z == null) {
         z = new fb();
      }

      return z;
   }

   public final void d() {
      Y = k4.u;
      this.Z = k4.p + 50;
      this.aa = k4.j();
      ac = true;
      af = 86;
      if (k4.ah != 0) {
         af = 86 + 40 * k4.ah;
      }

      ad = false;
      super.d();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.e();
            return;
         case 1:
            if (T < this.N[L].size()) {
               ((ag)this.N[L].elementAt(T)).c.b();
               this.o();
            }

            return;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 14:
         default:
            break;
         case 7:
            fj.g().j(var2, 0);
            return;
         case 8:
            if (var2 < f8.j.size()) {
               n var7 = (n)f8.j.elementAt(var2);
               fj var8 = fj.g();
               k4.b(var7.f[0], var7.f[1], new ep(var8, var7), new ei(var8, var7), null);
               return;
            }
            break;
         case 9:
            if (var2 < f8.k.size()) {
               b5 var6 = (b5)f8.k.elementAt(var2);
               fj.g().j(var6.b, 4);
               return;
            }
            break;
         case 10:
            if (var2 < fj.G.size()) {
               df var5 = (df)fj.G.elementAt(var2);
               fj.g().b(var5.b, var5.g);
               return;
            }
            break;
         case 11:
            if (var2 < fj.F.size()) {
               b5 var4 = fj.g(((df)fj.F.elementAt(var2)).b);
               fj.g().b(var4.b, var4.g);
               return;
            }
            break;
         case 12:
         case 13:
            return;
         case 15:
            byte[] var3 = new byte[]{0, 102};
            if (var2 != 0 || gx.l == -1) {
               AutoController.h();
               AutoController.f(var3[var2]);
            }

            g().e();
      }
   }

   public final void a(int var1, int var2) {
      Y.a(var1, var2);
   }

   public final void e() {
      if (U) {
         U = false;
      } else {
         k4.B.w = false;
         this.ab = false;
         Y.d();
         if (k4.N) {
            if (gx.b == 25 && ew.H != 0) {
               k4.H = new ew();
               if (ew.H == 2) {
                  ew.H = 3;
               }

               k4.H.b(AutoController.z);
               GameMidlet.k.s = it.r;
               return;
            }

            if (gx.b == 57) {
               (k4.H = new ew()).c(AutoController.z);
            }
         }
      }
   }

   public final void a() {
      super.g = new ag(hq.e, 0);
      super.f = new ag(hq.P, 1);
   }

   public fb() {
      J = ev.h;
      F = 30 * ev.a;
      if (k4.o < 150) {
         F = 24;
      }

      if (k4.ah == 1) {
         F = 35;
      }

      h();
      this.a();
      ag = 25 * (2 - ev.a) + 40 * (k4.ah + 1) + 10 * (ev.a - 1);
   }

   public static void h() {
      D = F * 5 + 11 + ev.b + 2;
      E = F * 6 + 10 + ev.b;
      B = k4.q - F * 5 / 2;
      C = (k4.p - e8.v) / 2 - E / 2;
   }

   public static int i() {
      return V;
   }

   public static void j() {
      U = true;
      n();
   }

   public static boolean k() {
      return U;
   }

   public static void b(String var0) {
      if (var0 != null) {
         X.addElement(new in(var0, k4.S.b(var0)));
      }
   }

   public final void b(String[] var1, Vector[] var2, Vector var3) {
      L = 0;
      this.N = var2;
      this.P = new ag[var2.length];
      this.Q = new boolean[var2.length];
      this.R = new String[var2.length];
      this.O = var3;
      A = var1;
      new StringBuffer(bb[0]).append(this.N.length);
      this.M = this.N.length;
      U = false;
      ib.b().b(A[L], D, E, this.M);
      this.l();
   }

   public final void l() {
      T = 0;
      K = 0;
      if (ad || this.Q[L]) {
         K = ev.h;
      }

      if (this.N[L] != null) {
         if ((H = this.N[L].size() / 5) >= 3 && !this.ab && !ad && !this.Q[L]) {
            I = 5;
         } else {
            I = 2;
         }

         if (this.N[L].size() % 5 != 0) {
            ++H;
         }

         if (H < I) {
            H = I;
         }
      }

      int var1 = 1;
      if (this.N[L] == null) {
         G = 1;
      } else {
         var1 = this.N[L].size();
         G = 5;
      }

      W = -F / 2;
      if (I > 2 || ad || this.Q[L]) {
         W = 0;
      }

      k4.B.b(B, ib.b().i + ib.t + ev.b + (!ad && !this.Q[L] ? 0 : K), F, F, F * G, F * H, F * 5, I * F - W, var1);
      this.o();
      ib.b().b(A[L], L);
   }

   public final void b() {
      Y.b();
      if (this.Z != 0) {
         this.Z += -this.Z >> 1;
      }

      if (this.Z == -1) {
         this.Z = 0;
      }

      if (this.N[L] != null) {
         int var1 = this.N[L].size();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (ac) {
               ((ag)this.N[L].elementAt(var2)).b();
            }
         }
      }

      if (this.P[L] != null) {
         super.e = this.P[L];
      } else {
         super.e = null;
      }
   }

   public static void m() {
      String[] var0 = bb;
      GameMidlet.p = var0[2];
      b2.f = var0[1];
      ib.m = k4.b(GameMidlet.p, -2);
   }

   public final void c() {
      if (U) {
         if (k4.d(4)) {
            this.d(-1);
            this.ai = 5;
         } else if (k4.d(6)) {
            this.d(1);
            this.aj = 5;
         }

         if (k4.d(0, 0, k4.o, k4.p - k4.ab)) {
            k4.i = false;
         }

         if (k4.h) {
            int var2 = T % G * F;
            int var3 = (T / G + 1) * F;
            if (var2 + F / 2 - af / 2 + B + 5 < 0) {
               var2 = -F / 2 + af / 2 - B - 5;
            } else if (var2 + F / 2 - af / 2 + af > k4.o) {
               var2 = k4.o - af - F / 2 + af / 2;
            }

            var2 += B;
            var3 += C + ib.t + ev.b;
            int var4 = (ag - (ev.b << 1)) / 4;
            var3 += ev.b + 8;
            var2 = var2 + F / 2 - 35 * (k4.ah + 1) / 2 - 2 - 10 - 10 * ev.a;
            var3 = var3 + var4 / 2 + var4 + ev.j / 2;
            if (k4.d(var2, var3 - 15 * ev.a - 5, 20 + 20 * ev.a, 30 * ev.a)) {
               this.d(-1);
               this.ai = 5;
            } else if (k4.d(var2 + 35 * (k4.ah + 1), var3 - 15 * ev.a - 5, 20 + 20 * ev.a, 30 * ev.a)) {
               this.d(1);
               this.aj = 5;
            } else if (k4.d(var2 + 20 + 20 * ev.a, var3 - 15 * ev.a - 5, var2 + 35 * (k4.ah + 1) - (var2 + 20 + 20 * ev.a), 30 * ev.a)) {
               super.f.a();
            }
         }

         if (this.ai > 0) {
            --this.ai;
         }

         if (this.aj > 0) {
            --this.aj;
         }
      } else {
         fb var1 = this;
         int var7;
         if (k4.d(6)) {
            if (T % G != G - 1 && G != 1 && !ae) {
               ++T;
            } else {
               this.e(1);
            }

            k4.B.b(T);
            this.o();
         } else if (k4.d(4)) {
            if (T % G != 0 && G != 1 && !ae) {
               --T;
            } else {
               this.e(-1);
            }

            k4.B.b(T);
            this.o();
         } else if (k4.d(2)) {
            if (this.N[L] != null && this.N[L].size() > 0 && !ae) {
               if (T / G > 0) {
                  T -= G;
               } else {
                  for(var7 = 0; var7 < var1.N.length; ++var7) {
                     if (var7 != L) {
                        ib.b().b(4, var7);
                     }
                  }

                  ae = true;
               }
            }

            k4.B.b(T);
            var1.o();
         } else if (k4.d(8)) {
            if (ae) {
               ae = false;

               for(var7 = 0; var7 < var1.N.length; ++var7) {
                  if (var7 != L) {
                     ib.b().b(0, var7);
                  }
               }
            } else if (G > 1 && T / G + 1 < H) {
               T += G;
            }

            k4.B.b(T);
            var1.o();
         }

         if (k4.i && (var7 = ib.b().e()) != false) {
            var1.e(var7);
            k4.i = false;
         }
      }

      super.c();
   }

   private void d(int var1) {
      if ((V += var1) < 0) {
         V = 99;
      }

      if (V > 99) {
         V = 0;
      }

      this.o();
      n();
   }

   public final void b(int var1, boolean var2) {
      if (!U) {
         if (T == var1 && super.f != null && !var2) {
            super.f.a();
         }

         T = var1;
         this.o();
      }
   }

   private static void n() {
      if (L == 1) {
         b5 var0;
         ah = k4.b((var0 = (b5)f8.k.elementAt(T)).h * V, var0.i * V, true);
      } else {
         ah = k4.b(f8.g[T].h[0] * V, f8.g[T].h[1] * V, true);
      }

      if ((af = k4.S.b(ah) + 16 + 30 * k4.ah) < 86 * ev.a) {
         af = 86 * ev.a;
      }

      if (k4.ah != 0) {
         af = 86 + 40 * k4.ah;
      }
   }

   public final void e(int var1) {
      if ((L += var1) == this.M) {
         L = 0;
      }

      if (L < 0) {
         L = this.M - 1;
      }

      this.l();
   }

   public final void o() {
      if (this.N[L] != null && T < this.N[L].size()) {
         super.f = (ag)this.N[L].elementAt(T);
      } else if (this.O == null || L >= this.O.size()) {
         super.f = null;
      } else {
         ag var1;
         if ((var1 = (ag)this.O.elementAt(L)) != null) {
            super.f = var1;
         }
      }

      ac = true;
      this.aa = k4.j();
   }

   public final void b(boolean var1) {
      this.ak = var1;
   }

   public final void b(Graphics var1) {
      Y.a(var1);
      k4.d(var1);
      ib.b().b(var1);
      var1.setColor(0);
      var1.translate(B, ib.b().i + ib.t + ev.b);
      if (ad) {
         String var2 = k4.b(GameMidlet.k.A[0], GameMidlet.k.A[2], GameMidlet.k.B);
         int var3 = k4.V.b(var2);
         int var4 = this.al;
         if (b2.f(this.al) > var3 + 20 - (D - 20)) {
            var4 = 0;
         }

         var1.setClip(0, 0, D - 20, 20);
         k4.V.b(var1, var2, var4, 0, 0);
         if (var3 > D - 20) {
            if (b2.f(this.al) > var3 + 50 - (D - 20)) {
               this.al = 0;
            }

            --this.al;
         }

         var1.translate(0, K);
      }

      if (this.N[L] != null) {
         if (this.Q[L]) {
            k4.V.b(var1, this.R[L], 0, 0, 0);
            var1.translate(0, K);
         }

         var1.setClip(0, 0, 5 * F, I * F - W);
         var1.translate(0, -g5.r);

         for(int var9 = 0; var9 < H * G; ++var9) {
            ib.b(var1, F * (var9 % G), F * (var9 / G), F, F);
         }

         if (!this.ak && !ae) {
            ib.b(3 + T % G * F, T / G * F + 3, F - 5, F - 5, 2293623, var1);
         }

         int var10 = this.N[L].size();
         int var12;
         if ((var12 = g5.r / F * G) < 0) {
            var12 = 0;
         }

         int var15;
         if ((var15 = g5.r / F * G + (I + 1) * G) > this.N[L].size()) {
            var15 = this.N[L].size();
         }

         while(var12 < var15 && var12 < var10) {
            ((ag)this.N[L].elementAt(var12)).b(var1, F * (var12 % G), F * (var12 / G));
            ++var12;
         }

         var1.translate(0, g5.r - W);
         var1.setClip(0, 0, D - 9, E);
         if (I == 2) {
            if (ad && AutoController.aj != null) {
               var1.translate(0, K);
               var1.setColor(10674392);
               var1.fillTriangle(30 * ev.a, I * F - (ev.a == 2 ? 10 : 0), 8 * ev.a, I * F + 40 * ev.a, 30 * ev.a + 22 * ev.a, I * F + 40 * ev.a);
               var1.setColor(13364969);
               var1.fillArc(8 * ev.a, I * F + 40 * ev.a - 10 * ev.a, 44 * ev.a, 20 * ev.a, 0, 360);
               AutoController.aj.b(var1, 30 * ev.a, I * F + 45 * ev.a, false);
               var1.translate(60 * ev.a, 0);
            }

            Graphics var14 = var1;
            if (X != null && T < this.N[L].size()) {
               var15 = ad ? 80 : 0;
               var1.setClip(0, I * F, D - var15 + 5, E);

               for(int var20 = 0; var20 < X.size(); ++var20) {
                  in var22 = (in)X.elementAt(var20);
                  int var23 = 0;
                  if (var22.j > D + 5 - var15) {
                     var22.b(D + 5 - var15);
                     if (var22.l >= 0) {
                        var23 = var22.l;
                     }
                  }

                  k4.V.b(var14, var22.h, 2 - var23, I * F + var20 * J, 0);
               }
            }
         } else {
            Graphics var13 = var1;
            fb var11 = this;
            if (k4.j() - this.aa > 0 && !U && X != null && T < this.N[L].size()) {
               var15 = T % G * F - this.am / 2 + F / 2;
               int var5 = (T / G + 1) * F - g5.r + 5;
               int var6 = X.size() * ev.h + (ev.b << 1) + 8;
               if (var5 + var6 + C + 12 > k4.p) {
                  var5 -= var6 + F + 10;
               }

               if (var5 + C < 0) {
                  var5 = -C;
               }

               if (var15 + B + 5 + this.am > k4.o) {
                  var15 = k4.o - (B + 5 + this.am);
               } else if (var15 + B < 0) {
                  var15 = -B;
               }

               var1.setClip(var15, var5, this.am, var6 * ev.a);
               k4.aa.b(var1, var15, var5, this.am, var6, ib.e[2], ib.e[3], 1);
               var15 += ev.b;
               var5 += ev.b - ev.h / 2;

               for(int var7 = 0; var7 < X.size(); ++var7) {
                  in var21 = (in)X.elementAt(var7);
                  int var8 = 0;
                  if (var21.j > var11.am + 5) {
                     var21.b(var11.am);
                     if (var21.l >= 0) {
                        var8 = var21.l;
                     }
                  }

                  k4.V.b(var13, var21.h, var15 - var8, var5 + 5 + var7 * J, 0);
               }
            }
         }

         if (U) {
            k4.d(var1);
            var1.translate(B, k4.B.m);
            k4.aa.b(var1, T, G, F, af, ag, L, V, ah, this.ai, this.aj);
         }
      } else {
         var1.setClip(-5, 0, D - 10, E);
         ((ag)this.O.elementAt(L)).b(var1, 0, 0);
      }

      if (k4.H == null || ew.O || !ew.y) {
         super.b(var1);
      }

      k4.b(var1);
   }

   public static void p() {
      ac = false;
      X.removeAllElements();
      if (U) {
         n();
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'R');
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
               var10005 = 16;
               break;
            case 1:
               var10005 = 117;
               break;
            case 2:
               var10005 = 70;
               break;
            case 3:
               var10005 = 115;
               break;
            case 4:
               var10005 = 107;
               break;
            case 5:
               var10005 = 47;
               break;
            default:
               var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
