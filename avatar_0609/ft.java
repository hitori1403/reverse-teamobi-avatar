import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class ft extends e8 implements c4 {
   public static ft z;
   public static boolean A;
   public static boolean B;
   public static boolean C;
   public static Vector D;
   public int E;
   public int F;
   public static byte G;
   public static byte H;
   public static int I;
   private static int J;
   public static byte K;
   public static long L;
   public static long M;
   public static int N;
   public static int O;
   public static int[] P;
   public int Q = 10;
   public static int R;
   public static int S;
   public int T = -1;
   private static ag U;
   private static ag V;
   public static ag W;
   public static ag X;
   private static ag Y;
   public static ag Z;
   private static Image[] aa;
   public static cn[] ab;
   private static Vector ac;
   public static Image ad;
   public static int ae;
   public static Vector af;
   public static Vector ag;
   private static dq ah;
   private static final String[] eb;

   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\nl$\u0003\nl$\u0006z{$]|\u0005\fu9j0)R{?$*p(";
      int var4 = "\nl$\u0003\nl$\u0006z{$]|\u0005\fu9j0)R{?$*p(".length();
      char var1 = 3;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = c(c(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     eb = var5;
                     P = new int[4];
                     ac = new Vector();
                     ae = 4;
                     af = new Vector();
                     ag = new Vector();
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

                  var2 = "z{$]|\u0005\fu9j04@t>/*p(";
                  var4 = "z{$]|\u0005\fu9j04@t>/*p(".length();
                  var1 = 6;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public final void e() {
      this.q();
   }

   public void d() {
      k4.e();
      super.d();
      z = this;
   }

   public ft() {
      this.g();
      U = new ag(hq.d, 0);
      new ag(hq.A, 1);
      V = new ag(hq.o, 2);
      W = new ag(hq.x, 3);
      X = new ag(hq.B, 4);
      Y = new ag(hq.k, 5);
      Z = new ag(hq.c, 6);
   }

   public void g() {
      ab = new cn[]{new cn(k4.q, 30 + 23 * ev.a, 2), new cn(13 * ev.a, k4.r - 20, 0), new cn(k4.q, k4.p - 28, 2), new cn(k4.o - 13 * ev.a, k4.r - 20, 1)};
      if (k4.o < 200) {
         R = 26;
         S = 32;
         ab = new cn[]{
            new cn(k4.q, 30 + 23 * ev.a, 2), new cn(13 * ev.a, k4.r - 20, 0), new cn(k4.q, k4.s - k4.ab - 5, 2), new cn(k4.o - 13 * ev.a, k4.r - 20, 1)
         };
      } else {
         R = 54;
         S = 72;
      }

      if (ev.a == 2) {
         R = 144;
         S = 194;
      }

      if (A || B) {
         this.t();
      }

      e8.p = null;
   }

   private static void h() {
      ac.removeAllElements();
      n();
      ey.d().e();
   }

   public final void a(String var1) {
      super.e = null;
      super.f = null;
      if (!i5.b) {
         k4.b(var1, 50, null);
      } else {
         this.b(50, -1);
      }
   }

   protected void i() {
      if (f(GameMidlet.k.f).q != 1) {
         AutoController.h();
         if (AutoController.W && J > GameMidlet.k.A[3]) {
            fr.g().i();
            return;
         }

         boolean var1;
         if (var1 = !((i3)D.elementAt(K)).O) {
            O = 100;
         }

         j();
         k4.i();
         h1.b().b(var1);
      }
   }

   public static void j() {
      z.f = Z;
      z.g = null;
   }

   protected void k() {
   }

   private static void l() {
      if (!A) {
         AutoController.h();
         if (AutoController.W && J > GameMidlet.k.A[3]) {
            fr.g().i();
            return;
         }

         int var0 = 0;
         int var1 = 0;

         for(int var2 = 0; var2 < ae; ++var2) {
            i3 var3;
            if ((var3 = (i3)D.elementAt(var2)).f != GameMidlet.k.f && var3.f != -1) {
               if (var3.O) {
                  ++var0;
               } else {
                  ++var1;
               }
            }
         }

         if (var0 != 0 && var1 <= 0) {
            if (z == fw.ai) {
               z.f = Z;
               z.g = null;
            } else {
               k4.i();
            }

            e8.f();
            h1.b().i();
            return;
         }

         k4.c(hq.aU);
      }
   }

   public void a(int var1, int var2) {
      switch(var1) {
         case 1:
            Vector var10 = new Vector();
            ag var14 = new ag(hq.s, 10);
            ag var16 = new ag(hq.t, 11);
            ag var4 = new ag(hq.u, 12);
            var10.addElement(var14);
            if (gx.b == 61) {
               var10.addElement(var16);
            }

            var10.addElement(var4);
            f1.d().b(var10, 0);
            return;
         case 2:
            Vector var9 = new Vector();

            for(int var13 = 0; var13 < ae; ++var13) {
               i3 var15;
               if ((var15 = (i3)D.elementAt(var13)).f != GameMidlet.k.f && var15.f != -1) {
                  var9.addElement(new ag(var15.L, 14, var13));
               }
            }

            f1.d().b(var9, 0);
            return;
         case 3:
            Vector var8 = new Vector();

            for(int var12 = 0; var12 < ae; ++var12) {
               i3 var3;
               if ((var3 = (i3)D.elementAt(var12)).f != GameMidlet.k.f && var3.f != -1) {
                  var8.addElement(new ag(var3.g, 13, var12));
               }
            }

            if (var8.size() == 1) {
               ((ag)var8.elementAt(0)).a();
            }

            f1.d().b(var8, 0);
            return;
         case 4:
            fm.g().b(z);
            return;
         case 5:
            this.q();
            return;
         case 6:
         case 7:
         case 8:
         case 9:
         default:
            return;
         case 10:
            k4.x.b(hq.H, 100, 1);
            return;
         case 11:
            Vector var7 = new Vector();

            for(int var11 = 0; var11 < 3; ++var11) {
               var7.addElement(new ag(hq.dz[var11], 15, var11));
            }

            f1.d().b(var7, 0);
            return;
         case 12:
            k4.x.b(hq.u, 101, 3);
            return;
         case 13:
            if (var2 < D.size()) {
               i3 var6 = (i3)D.elementAt(var2);
               super.g.a();
               AutoController.h();
               AutoController.e(var6);
               return;
            }
            break;
         case 14:
            if (var2 >= 0 && var2 < D.size()) {
               i3 var5 = (i3)D.elementAt(var2);
               h1.b().f(var5.f);
               return;
            }
            break;
         case 15:
            h1.b().d(var2 + 2);
      }
   }

   protected void m() {
      M = 0L;
      L = 0L;
      A = false;
      B = false;
      C = false;
   }

   private static void n() {
      cl.b().d = cl.b().f = (gx.g * gx.j * ev.a - k4.p) / 2;
      cl.b().c = cl.b().e = (gx.f * gx.j * ev.a - k4.o) / 2;
   }

   public void o() {
      n();
      e8.f();
   }

   public void c() {
      if (k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }

   public void b() {
      if (O > 0) {
         --O;
      }

      if (!A) {
         super.e = U;
         cl.b().c();
      }

      for(int var1 = 0; var1 < ae; ++var1) {
         i3 var2;
         if ((var2 = (i3)D.elementAt(var1)).f != -1) {
            var2.d();
         }
      }

      if (ah != null && ah.b()) {
         ah = null;
      }
   }

   public final void p() {
      if (I == GameMidlet.k.f) {
         if (super.f != Z) {
            super.f = V;
            V.b = hq.o;
         }

         boolean var4 = true;

         for(int var5 = 0; var5 < ae; ++var5) {
            i3 var3;
            if ((var3 = (i3)D.elementAt(var5)).f == -1) {
               var4 = false;
            } else if (var3.f != GameMidlet.k.f && !var3.O) {
               var4 = false;
            }
         }

         if (var4 && k4.n % 10 > 7) {
            V.b = "";
         }

         if (var4 && i5.b) {
            l();
         }
      } else {
         if (!B) {
            super.f = Y;
            Y.b = hq.k;

            for(int var1 = 0; var1 < ae; ++var1) {
               i3 var2;
               if ((var2 = (i3)D.elementAt(var1)).f == GameMidlet.k.f) {
                  if (!var2.O) {
                     if (k4.n % 10 > 7) {
                        Y.b = "";
                     }

                     if (i5.b) {
                        i5.b();
                     }
                  } else {
                     Y.b = hq.l;
                     if (O == 0) {
                        super.f = Y;
                     } else {
                        super.f = null;
                     }
                  }
               }
            }
         }
      }
   }

   public final void a(int var1) {
      e3.e().b(var1, this);
      super.a(var1);
   }

   public void b(Graphics var1) {
      if (ah != null) {
         ah.b(var1);
      }

      if (fp.O) {
         fp.b(var1, super.e, super.f, super.g);
      } else {
         super.b(var1);
      }

      gx.b(var1);
      k4.c(var1);
   }

   public void c(Graphics var1) {
      k4.d(var1);

      for(int var2 = 0; var2 < ae; ++var2) {
         i3 var3;
         if ((var3 = (i3)D.elementAt(var2)).f != -1) {
            var3.b(var1, var3.a, var3.b);
            b(var1, var3.a, var3.b - 50 - (!A && gx.G == -1 ? 10 * ev.a : 0), var3);
            var3.b(var1, var3.a, var3.b, false);
         }
      }
   }

   public static void e(Graphics var0) {
      for(int var1 = 0; var1 < D.size(); ++var1) {
         i3 var2;
         if ((var2 = (i3)D.elementAt(var1)).f != -1 && var2.w != null) {
            var2.w.b(var0);
         }
      }
   }

   public void a(Graphics var1) {
      k4.d(var1);
      var1.setClip(0, 0, k4.o, k4.p + k4.ab);
      if (!A && !B) {
         k4.d(var1);
         if (!fp.O) {
            var1.setClip(0, 0, k4.o, k4.p + k4.ab);
            var1.setColor(0);
            var1.fillRect(0, 0, k4.o, k4.p + k4.ab);
            var1.translate(-cl.b().c, -cl.b().d);
            k4.A.d(var1);
            if (k4.o > 150) {
               k4.T.b(var1, fh.C, cl.b().c + k4.q, cl.b().d + k4.r - ev.h - ev.h / 2 - 5, 2);
               String[] var2 = eb;
               k4.T.b(var1, var2[1] + G + var2[4] + H, cl.b().c + k4.q, cl.b().d + k4.r - ev.h / 2 - 5, 2);
               k4.Y.b(var1, J + hq.l(), cl.b().c + k4.q, cl.b().d + k4.r - 5 + ev.h / 2, 2);
               e(var1);
               return;
            }

            return;
         }
      }

      f(var1);
   }

   private static void f(Graphics var0) {
      k4.aa.c(var0);
      if (!A) {
         String[] var1 = eb;
         k4.T.b(var0, var1[0] + G + var1[2] + H, k4.q, k4.p / 2 - 10 * ev.a, 2);
         k4.Y.b(var0, J + hq.l(), k4.q, k4.p / 2 + 10 * ev.a, 2);
      } else {
         if (k4.u == fu.ai) {
            fu.ai.d(var0);
         }
      }
   }

   public static void b(Graphics var0, int var1, int var2, i3 var3) {
      if (!A) {
         if (var3.f == I) {
            var0.drawImage(aa[1], var1, var2, 3);
            return;
         }

         if (var3.O) {
            var0.drawImage(aa[0], var1, var2, 3);
         }
      }
   }

   private void q() {
      if (A && !B && !C) {
         k4.b(hq.b7, 0, this);
      } else {
         this.b(0);
      }
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            k4.O = 0;
            this.m();
            h1.b().h();
            h1.b().b(G);
            if (ae == 2) {
               this.a("");
            }

            n();
            k4.i();
      }
   }

   public void b(int var1, int var2) {
      switch(var1) {
         case 0:
            ag var7 = new ag(hq.ac, 1);
            ag var8 = new ag(hq.w, 2);
            int var3 = 0;

            for(int var4 = 0; var4 < ae; ++var4) {
               if (((i3)D.elementAt(var4)).f != -1) {
                  ++var3;
               }
            }

            Vector var9 = new Vector();
            if (I == GameMidlet.k.f && !A) {
               var9.addElement(var7);
               if (var3 > 1) {
                  var9.addElement(var8);
               }
            }

            if (var3 > 1) {
               var9.addElement(new ag(hq.z, 3));
            }

            var9.addElement(new ag(hq.r, 4));
            var9.addElement(new ag(hq.v, 5));
            f1.d().b(var9, 0);
            return;
         case 1:
            h();
            return;
         case 2:
            l();
            return;
         case 3:
            z.o();
            return;
         case 4:
            z.k();
            return;
         case 5:
            z.i();
            return;
         case 6:
            return;
         case 50:
            this.o();
            h();
            A = false;
            this.T = -1;
            N = 0;
            return;
         case 100:
            try {
               if ((var1 = Integer.parseInt(k4.x.d())) < 0) {
                  return;
               } else {
                  k4.h();
                  AutoController.h();
                  if (AutoController.W && var1 > GameMidlet.k.A[3]) {
                     fr.g().i();
                     return;
                  }

                  h1.b().e(var1);
                  return;
               }
            } catch (Exception var5) {
               return;
            }
         case 101:
            h1.b().c(k4.x.d());
            k4.c(hq.J);
      }
   }

   public final void c(int var1) {
      i3 var2;
      if ((var2 = f(var1)) != null) {
         b(var2.g + hq.aV, 30, var2.f);
         var2.f = -1;
         var2.b("");
         var2.e(0);
         var2.O = false;
      }

      this.s();
      if (A || B) {
         this.t();
      }
   }

   public static void d(int var0) {
      I = var0;
      i3 var1;
      if ((var1 = f(var0)) != null) {
         var1.O = true;
      }
   }

   public void b(byte var1, byte var2, int var3, int var4, Vector var5) {
      if (aa == null) {
         aa = new Image[2];

         try {
            Image[] var10000 = aa;
            StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
            String[] var7 = eb;
            var10000[0] = Image.createImage(var10002.append(var7[5]).toString());
            aa[1] = Image.createImage(hq.b() + var7[3]);
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      G = var1;
      H = var2;
      J = var4;
      if (D != null) {
         D.removeAllElements();
      }

      D = var5;
      d(var3);

      for(int var6 = 0; var6 < ae; ++var6) {
         i3 var9;
         (var9 = (i3)D.elementAt(var6)).s = 0;
         byte var10 = 2;
         var9.q = var10;
         var9.g(var9.q);
         if (var9.f == GameMidlet.k.f) {
            K = (byte)var6;
            break;
         }
      }

      this.s();
      if (ae > 2) {
         k4.aa.c();
      }
   }

   public static void r() {
      for(int var0 = 0; var0 < ae; ++var0) {
         ((i3)D.elementAt(var0)).O = false;
      }
   }

   public static void e(int var0) {
      J = var0;
      r();
   }

   public static void a(int var0, boolean var1) {
      i3 var2;
      if ((var2 = f(var0)) != null) {
         var2.O = var1;
      }
   }

   public final void b(String var1) {
      if (!var1.trim().equals("")) {
         h1.b().b(var1);
         b(GameMidlet.k.f, var1);
      }
   }

   public static void b(int var0, String var1) {
      i3 var3 = f(var0);
      i3 var2 = new i3();
      if (var3 != null) {
         var2.a = var3.a;
         var2.b = var3.b;
         var2.f = var3.f;
         if (var2.f != -1) {
            if (A && fr.C == 0) {
               var2.a = k4.q;
               if (var2.f != GameMidlet.k.f) {
                  var2.b = 30;
               } else {
                  var2.b = k4.p - 40;
               }
            }

            b(var1, 50, var2.f);
         }
      }
   }

   public static void c(int var0, int var1) {
      if (var1 != 0) {
         if (!A) {
            var0 = g(var0);
            k4.b(var1, ab[P[var0]].b, ab[P[var0]].c, -1);
            return;
         }

         i3 var2 = f(var0);
         k4.b(var1, var2.a, var2.b, -1);
      }
   }

   public static boolean b(byte var0, byte var1) {
      return G == var0 && H == var1;
   }

   public static void b(String var0, int var1, int var2) {
      if (var2 == -1) {
         if (ah == null) {
            (ah = new dq(var1, var0, (byte)0)).b(k4.q, k4.r - 20);
         } else {
            ah.b(var1, var0);
         }
      } else {
         for(int var3 = 0; var3 < D.size(); ++var3) {
            it var4;
            if ((var4 = (it)D.elementAt(var3)).f == var2) {
               if (var4.w == null) {
                  var4.w = new dq(var1, var0, (byte)0);
                  var4.w.b(var4.a, var4.b - 45);
               } else {
                  var4.w.b(var1, var0);
               }
            }
         }
      }
   }

   public void s() {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < ae; ++var3) {
         i3 var4;
         i3 var10000 = var4 = (i3)D.elementAt(var3);
         byte var6 = 0;
         var10000.q = var6;
         if (var4.f != -1) {
            ++var1;
            if (var4.f != GameMidlet.k.f) {
               var2 = var3;
            }
         }
      }

      int[] var9 = new int[ae];
      int var10 = 2;
      if (var1 == 2) {
         var9[K] = 2;
         var9[var2] = 0;
      } else {
         for(int var7 = K; var7 < K + ae; ++var7) {
            var2 = var7;
            if (var7 > ae - 1) {
               var2 = var7 - ae;
            }

            var9[var2] = var10++;
            if (var10 >= ae) {
               var10 = 0;
            }
         }
      }

      P = var9;
   }

   public static i3 f(int var0) {
      for(int var1 = 0; var1 < ae; ++var1) {
         i3 var2;
         if ((var2 = (i3)D.elementAt(var1)) != null && var2.f == var0) {
            return var2;
         }
      }

      return null;
   }

   public static int g(int var0) {
      for(int var1 = 0; var1 < ae; ++var1) {
         if (((i3)D.elementAt(var1)).f == var0) {
            return var1;
         }
      }

      return -1;
   }

   public void t() {
      cl.b().d();

      for(int var1 = 0; var1 < ae; ++var1) {
         i3 var2;
         if ((var2 = (i3)D.elementAt(var1)).f != -1) {
            var2.H = 0;
            byte var4 = 0;
            var2.q = var4;
            var2.g(var2.q);
            var2.l = var2.a = ab[P[var1]].b;
            var2.m = var2.b = ab[P[var1]].c;
            if (P[var1] != 2 && P[var1] != 3) {
               var2.s = var2.U = 0;
            } else {
               var2.s = var2.U = it.r;
            }
         }
      }
   }

   private static char[] c(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
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
               var10005 = 86;
               break;
            case 2:
               var10005 = 4;
               break;
            case 3:
               var10005 = 31;
               break;
            case 4:
               var10005 = 70;
               break;
            case 5:
               var10005 = 37;
               break;
            default:
               var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
