import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class e_ extends e8 {
   public static e_ z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private boolean G = false;
   private Vector H;
   private short[] I;
   private e8 J;
   private ag K;
   public cn L;
   public boolean M = false;
   private boolean N;
   private long O = 0L;
   private boolean P = false;
   private int Q = 50 * ev.a;
   private static Vector R;
   private static final String[] S;

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ħ\u00ad\u001d\u0005ạ\u000e\u001f_ỹSG\rF\u001dCn\u0005b\u001a{JV\rħ\u00ad\u001d\u0004\u0006ẙ\u0012\u0017-U\u0006\u001a\u000e";
      int var4 = "ħ\u00ad\u001d\u0005ạ\u000e\u001f_ỹSG\rF\u001dCn\u0005b\u001a{JV\rħ\u00ad\u001d\u0004\u0006ẙ\u0012\u0017-U\u0006\u001a\u000e".length();
      char var1 = 16;
      int var0 = -1;

      while(true) {
         String var10002 = c(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            S = var5;
            R = new Vector();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static e_ g() {
      return z == null ? (z = new e_()) : z;
   }

   public final void d() {
      if (k4.u != this) {
         this.J = k4.u;
      }

      this.a();
      super.d();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.h();
            return;
         case 1:
            this.h();
            ag var3;
            if ((var3 = (ag)this.H.elementAt(this.A)).c != null) {
               var3.c.b();
               return;
            } else {
               this.a(var3.d, var3.f);
            }
      }
   }

   public final void a() {
      if (k4.ah == 0) {
         super.g = new ag(hq.e, 0);
      } else {
         this.G = true;
      }

      this.K = new ag(hq.P, 1);
   }

   private void h() {
      this.J.d();
      AutoController.h();
      if (AutoController.J != null) {
         AutoController.h();
         AutoController.J.t = false;
      }

      this.P = false;
      super.f = null;
      this.N = false;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 1:
            AutoController.h().p();
            return;
         case 2:
            byte[] var11 = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
            Vector var12 = new Vector();

            for(int var14 = 0; var14 < var11.length; ++var14) {
               var12.addElement(new bk("", var14, var11, var14));
            }

            this.L = null;
            this.b(var12);
            return;
         case 3:
            this.i();
            return;
         case 4:
            AutoController.h();
            AutoController.ab = true;
            hv.b().e(GameMidlet.k.f);
            return;
         case 5:
            fd.g().a(false);
            return;
         case 6:
            this.M = false;
            hx.b().f(GameMidlet.k.f);
            return;
         case 7:
            AutoController.h();
            AutoController.h();
            AutoController.h();
            AutoController.e(AutoController.J);
            return;
         case 8:
            hx.b().h(26);
            k4.i();
            return;
         case 9:
            AutoController.h();
            AutoController.l();
            return;
         case 10:
            AutoController.h();
            AutoController.h();
            AutoController.t();
            return;
         case 11:
            AutoController.h();
            AutoController.ab = true;
            AutoController.h();
            AutoController.h();
            AutoController.u();
            return;
         case 12:
            AutoController.h().n();
            return;
         case 13:
            AutoController.h();
            AutoController.h();
            AutoController.m();
            return;
         case 14:
         default:
            return;
         case 15:
            AutoController.h();
            AutoController.h().c(GameMidlet.l);
            return;
         case 16:
            AutoController.h();
            in var9;
            if ((var9 = (in) AutoController.Q.elementAt(var2)).f == 1) {
               hx var18 = hx.b();
               int var19 = var9.m;
               AutoController.h();
               int var20;
               if (AutoController.J != null) {
                  AutoController.h();
                  var20 = AutoController.J.f;
               } else {
                  var20 = -1;
               }

               var18.c(var19, var20);
               return;
            }
            break;
         case 17:
            hx.b().k(var2);
            return;
         case 18:
            AutoController.h();
            in var8;
            if ((var8 = (in) AutoController.Q.elementAt(var2)).f == 0) {
               hx var17 = hx.b();
               int var10001 = var8.m;
               AutoController.h();
               int var10002;
               if (AutoController.J != null) {
                  AutoController.h();
                  var10002 = AutoController.J.f;
               } else {
                  var10002 = -1;
               }

               var17.c(var10001, var10002);
               return;
            }
            break;
         case 19:
            byte[] var13 = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
            if (var2 == 0) {
               AutoController.h();
               AutoController.h();
               AutoController.c(4);
               return;
            }

            AutoController.h();
            AutoController.h();
            AutoController.c(var13[var2]);
            return;
         case 20:
            if ((GameMidlet.k.Z == 0 || GameMidlet.k.Z == -5) && !bq.j) {
               if (gx.u != null && gx.u.d == 5) {
                  hv.b().f(((i2)gx.u).D);
                  return;
               }

               Vector var7 = new Vector();
               ag var10 = this.b(hq.b8, 4, 17);
               ag var3 = this.b(hq.cS, 6, 14);
               ag var4 = this.b(hq.m, 21, 14);
               ag var5 = this.b(hq.bP, 15, 17);
               var7.addElement(var10);
               var7.addElement(var5);
               var7.addElement(var4);
               var7.addElement(var3);
               if (k4.u != fb.g()) {
                  g().b(var7);
               }

               return;
            }

            return;
         case 21:
            hx.b().f(GameMidlet.k.f);
            this.M = true;
            return;
         case 22:
            AutoController.h();
            if (c(AutoController.J.g)) {
               AutoController.h();
               b(AutoController.J.g);
               String[] var6 = S;
               StringBuffer var16 = new StringBuffer(var6[0]);
               AutoController.h();
               k4.c(var16.append(AutoController.J.g).toString());
               return;
            }

            Vector var10000 = R;
            AutoController.h();
            var10000.addElement(AutoController.J.g);
            StringBuffer var15 = new StringBuffer(S[2]);
            AutoController.h();
            k4.c(var15.append(AutoController.J.g).toString());
            return;
      }
   }

   private static void b(String var0) {
      for(int var1 = 0; var1 < R.size(); ++var1) {
         if (((String)R.elementAt(var1)).equalsIgnoreCase(var0)) {
            R.removeElementAt(var1);
         }
      }
   }

   public static boolean c(String var0) {
      for(int var1 = 0; var1 < R.size(); ++var1) {
         if (((String)R.elementAt(var1)).equalsIgnoreCase(var0)) {
            return true;
         }
      }

      return false;
   }

   public final void i() {
      AutoController.h();
      if (AutoController.J != null) {
         this.P = false;
         Vector var1;
         (var1 = new Vector()).addElement(this.b(hq.bF, 9, 13));
         var1.addElement(this.b(hq.bI, 12, 2));
         var1.addElement(this.b(hq.bG, 10, 21));
         var1.addElement(this.b(hq.z, 7, 11));
         var1.addElement(this.b(hq.bE, 8, 12));
         var1.addElement(this.b(hq.bH, 11, 19));
         var1.addElement(this.b(hq.cK, 13, 22));
         AutoController.h();
         if (AutoController.Q.size() > 0) {
            int var2 = 0;

            while(true) {
               AutoController.h();
               if (var2 >= AutoController.Q.size()) {
                  break;
               }

               AutoController.h();
               in var3;
               if ((var3 = (in) AutoController.Q.elementAt(var2)).f == 1) {
                  var1.addElement(new bj(var3.h, var2, var3));
               }

               ++var2;
            }
         }

         this.b(var1);
      }
   }

   public final void j() {
      if ((GameMidlet.k.Z == 0 || GameMidlet.k.Z == -5) && !bq.j) {
         if (gx.u != null && gx.u.d == 5) {
            hv.b().f(((i2)gx.u).D);
            return;
         }

         if (gx.u != null && gx.u.d == 0 && ((i3)gx.u).f == -100) {
            k4.b(hq.dr, new ia());
            return;
         }

         Vector var1 = new Vector();
         ag var2 = this.b(hq.bJ, 1, 1);
         ag var3 = this.b(hq.bK, 2, 0);
         ag var4 = this.b(hq.bL, 3, 20);
         ag var5 = this.b(hq.bo, 20, 17);
         ag var6 = this.b(hq.ab, 5, 18);
         if (k4.ah == 0) {
            var1.addElement(var4);
         }

         var1.addElement(var5);
         var1.addElement(var3);
         if (k4.ah == 0) {
            var1.addElement(AutoController.h().F);
         }

         if (GameMidlet.k.q != 14) {
            var1.addElement(var2);
         }

         var1.addElement(var6);
         if (k4.ah > 0) {
            AutoController.h();
            if (AutoController.P != null) {
               AutoController.h();
               if (AutoController.P.size() > 0) {
                  int var7 = 0;

                  while(true) {
                     AutoController.h();
                     if (var7 >= AutoController.P.size()) {
                        break;
                     }

                     AutoController.h();
                     in var9 = (in) AutoController.P.elementAt(var7);
                     var1.addElement(new bi(var9.h, var7, var9));
                     ++var7;
                  }
               }
            }
         }

         AutoController.h();
         if (AutoController.Q.size() > 0) {
            int var8 = 0;

            while(true) {
               AutoController.h();
               if (var8 >= AutoController.Q.size()) {
                  break;
               }

               AutoController.h();
               in var10;
               if ((var10 = (in) AutoController.Q.elementAt(var8)).f == 0) {
                  var1.addElement(new bf(var10.h, var8, var10));
               }

               ++var8;
            }
         }

         if (k4.u != fb.g()) {
            this.L = null;
            g().b(var1);
         }
      }
   }

   public static void k() {
      i3 var0 = GameMidlet.k;
      if (k4.u != z) {
         fb.g().ab = true;
         fb.g().b(new String[]{hq.m, hq.b0}, new Vector[]{AutoController.h().f(var0), AutoController.h().b(GameMidlet.m, var0.f, 1)}, null);
         fb var10000 = fb.g();
         ag var10001 = AutoController.h().b(var0.E, 0, 0, false);
         byte var2 = 0;
         ag var1 = var10001;
         var10000.P[var2] = var1;
         var10000 = fb.g();
         var10001 = AutoController.h().b(GameMidlet.m, 1, 0, true);
         var2 = 1;
         var1 = var10001;
         var10000.P[var2] = var1;
         if (k4.u != fb.g()) {
            fb.g().d();
         }
      }
   }

   private ag b(String var1, int var2, int var3) {
      return new bg(var1, var2, var3);
   }

   public final ag b(String var1, gq var2, int var3) {
      return new be(var1, new gy(var2), var3);
   }

   public final void b(Vector var1) {
      this.H = var1;
      if (k4.M) {
         this.D = 40 * ev.a + (ev.a - 1) * 20;
         if (k4.ah == 1 && k4.o > 300) {
            this.D += 20;
         }
      } else {
         this.D = 30;
      }

      this.E = this.D + 2 * ev.a;
      this.C = ev.i << 1;
      this.B = 0;
      this.F = k4.o / this.E;
      if (var1.size() * this.E < k4.o) {
         this.B = (k4.o - var1.size() * this.E) / 2;
      } else {
         this.B = (k4.o - this.F * this.E) / 2;
      }

      this.I = new short[var1.size()];

      for(int var2 = 0; var2 < this.I.length; ++var2) {
         this.I[var2] = -40;
      }

      if (this.A >= var1.size()) {
         this.A = 0;
      }

      this.P = false;
      AutoController.h();
      if (AutoController.J != null && k4.ah > 0) {
         AutoController.h();
         AutoController.J.t = true;
      }

      if (k4.ah > 0) {
         this.C = k4.r - (var1.size() / this.F + 1) * this.D / 2;
      }

      this.d();
      if (k4.ah == 0) {
         super.f = this.K;
      }
   }

   public final void b() {
      this.J.b();

      for(int var1 = 0; var1 < this.I.length; ++var1) {
         if (this.I[var1] != var1 % this.F * this.E) {
            short[] var2 = this.I;
            this.I[var1] = (short)(var2[var1] + (var1 % this.F * this.E - this.I[var1]) / 3);
         }
      }
   }

   public final void c() {
      if (k4.i) {
         boolean var1 = false;

         for(int var2 = this.H.size() - 1; var2 >= 0; --var2) {
            if (k4.d(this.I[var2] + this.B, this.C + var2 / this.F * this.E, this.D, this.D)) {
               this.A = var2;
               this.N = true;
               this.G = false;
               var1 = true;
               this.O = System.currentTimeMillis() / 100L;
               break;
            }
         }

         if (!var1) {
            this.h();
         }
      }

      if (this.N) {
         if (System.currentTimeMillis() / 100L - this.O > 10L) {
            this.G = false;
         }

         if (k4.h) {
            this.N = false;
            this.G = true;

            for(int var3 = this.H.size() - 1; var3 >= 0; --var3) {
               if (k4.d(this.I[var3] + this.B, this.C + var3 / this.F * this.E, this.D, this.D)) {
                  if (var3 == this.A) {
                     this.h();
                     this.b(1, -1);
                  }
                  break;
               }
            }

            k4.h = false;
         }
      }

      if (k4.d(4)) {
         --this.A;
         if (this.A < 0) {
            this.A = this.H.size() - 1;
         }
      } else if (k4.d(6)) {
         ++this.A;
         if (this.A >= this.H.size()) {
            this.A = 0;
         }
      } else if (k4.d(2)) {
         int var4;
         if ((var4 = this.A - this.F) < 0) {
            if ((var4 = this.H.size() / this.F * this.F + this.F + var4) < this.H.size()) {
               this.A = var4;
            }
         } else {
            this.A = var4;
         }
      } else if (k4.d(8)) {
         this.A += this.F;
         if (this.A >= this.H.size()) {
            this.A %= this.F;
         }
      }

      super.c();
   }

   public static String b(byte[] var0) {
      String var1 = null;

      try {
         var1 = new String(var0, S[1]);
      } catch (Exception var2) {
      }

      return var1;
   }

   public static byte[] d(String var0) {
      var0 = var0.substring(1, var0.length());
      int var1 = 0;

      for(int var2 = var0.length() - 1; var0.charAt(var2) == '='; --var2) {
         ++var1;
      }

      byte[] var7 = new byte[var0.length() * 6 / 8 - var1];
      int var8 = 0;

      for(int var3 = 0; var3 < var0.length(); var3 += 4) {
         int var4 = (b(var0.charAt(var3)) << 18) + (b(var0.charAt(var3 + 1)) << 12) + (b(var0.charAt(var3 + 2)) << 6) + b(var0.charAt(var3 + 3));

         for(int var5 = 0; var5 < 3 && var8 + var5 < var7.length; ++var5) {
            var7[var8 + var5] = (byte)(var4 >> 8 * (2 - var5));
         }

         var8 += 3;
      }

      return var7;
   }

   private static int b(char var0) {
      if (var0 >= 'A' && var0 <= 'Z') {
         return var0 - 65;
      } else if (var0 >= 'a' && var0 <= 'z') {
         return var0 - 97 + 26;
      } else if (var0 >= '0' && var0 <= '9') {
         return var0 - 48 + 52;
      } else if (var0 == '+') {
         return 62;
      } else if (var0 == '/') {
         return 63;
      } else {
         return var0 == 61 ? 0 : -1;
      }
   }

   public static String e(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.append((char)(var0.charAt(var2) - 4));
      }

      return new StringBuffer(var1.toString()).reverse().toString();
   }

   public final void b(Graphics var1) {
      this.J.a(var1);
      k4.d(var1);
      Graphics var2 = var1;
      e_ var3 = this;
      if (GameMidlet.k.q != 14) {
         GameMidlet.k.b(var1, GameMidlet.k.a * ev.a - cl.b().c, GameMidlet.k.b * ev.a - cl.b().d, false);
      }

      ag var4 = (ag)this.H.elementAt(this.A);
      k4.T.b(var1, var4.b, k4.q, this.C - 15, 2);
      var1.translate(this.B, this.C);

      for(int var7 = this.H.size() - 1; var7 >= 0; --var7) {
         byte var5 = 0;
         ag var6 = (ag)var3.H.elementAt(var7);
         if (var7 == var3.A && !var3.G) {
            var5 = 4;
         }

         k4.aa.b(var2, var3.I[var7], var7 / var3.F * var3.E, var3.D, var3.D, var5);
         var6.b(var2, var3.E / 2 + var3.I[var7], var3.E / 2 + var7 / var3.F * var3.E);
      }

      super.b(var1);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '|');
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
               var10005 = 55;
               break;
            case 1:
               var10005 = 78;
               break;
            case 2:
               var10005 = 61;
               break;
            case 3:
               var10005 = 103;
               break;
            case 4:
               var10005 = 110;
               break;
            case 5:
               var10005 = 46;
               break;
            default:
               var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
