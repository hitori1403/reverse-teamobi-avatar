import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fg extends e8 implements c4 {
   public static fg z;
   private int A;
   private int B;
   private int C = -1;
   private ag D;
   private ag E;
   private ag F;
   static short G;
   public static boolean H;
   Vector I;
   public byte J = -1;
   private int K = -1;
   public int L = -1;
   int M;
   public static boolean N;
   g2[] O;
   private cn P;
   cn Q;
   t R;
   private Image S;
   private int T = -1;
   private int U = -1;
   private int[] V = new int[]{1688583, 14744065};
   public int W;
   public int X;
   private short Y = 69;
   private short Z = 68;
   short[] aa;
   private int ab = 0;
   private Vector ac;
   private Vector ad;
   private int ae;
   private byte af;
   static boolean ag;
   static boolean ah;
   private static final String[] bb;

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0011_\u0011lqS\"\u0019E\u0015UqQ\u000b1\\\u0004w0İ\u0097\u001eAJ8\u0004\u0018H\u001e|";
      int var4 = "\u0011_\u0011lqS\"\u0019E\u0015UqQ\u000b1\\\u0004w0İ\u0097\u001eAJ8\u0004\u0018H\u001e|".length();
      char var1 = '\r';
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
                     bb = var5;
                     G = 0;
                     H = false;
                     N = false;
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

                  var2 = "\u0011_\u0011lqS\"\u0019E\u0015UqQ\n1\\\u0004w0I\u0082\u001e\u0013P";
                  var4 = "\u0011_\u0011lqS\"\u0019E\u0015UqQ\n1\\\u0004w0I\u0082\u001e\u0013P".length();
                  var1 = '\r';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fg g() {
      if (z == null) {
         z = new fg();
      }

      return z;
   }

   public final void d() {
      super.d();
      this.h();
   }

   public fg() {
      this.D = new ag(hq.ct, 0);
      this.E = new ag(hq.b_, 1);
      this.F = new ag(hq.d, 2);
      bp.c(hq.aw);
      this.S = bp.b(bb[2]);
      bp.b();
   }

   private void h() {
      if (this.M == GameMidlet.k.f) {
         super.f = AutoController.h().E;
         super.f.b = hq.P;
         super.e = this.F;
      } else {
         super.e = this.F;
         if (k4.ah == 0) {
            super.f = AutoController.h().E;
         }
      }
   }

   private void i() {
      gx.c(GameMidlet.k);
      GameMidlet.k.a = this.Q.b;
      GameMidlet.k.b = this.Q.c;
      GameMidlet.k.q = 0;
      cl.b().b(this.Q.b * ev.a, this.Q.c * ev.a);
   }

   public final void e() {
      AutoController.h().j();
   }

   private void j() {
      super.f = new ag(hq.P, 3);
      super.g = new ag(hq.b_, 4);
      super.e = null;
      N = true;
      this.A = GameMidlet.k.a / 24;
      this.B = GameMidlet.k.b / 24;
      gx.d(GameMidlet.k);
   }

   private void k() {
      hw.b();
      this.A = GameMidlet.k.a / 24;
      this.B = GameMidlet.k.b / 24;
      gx.d(GameMidlet.k);
   }

   void l() {
      this.k();
      if (this.aa == null) {
         this.aa = new short[gx.e.length];

         for(int var1 = 0; var1 < gx.e.length; ++var1) {
            this.aa[var1] = gx.e[var1];
         }
      }

      H = false;
      super.f = this.D;
      super.g = this.E;
      super.e = new ag(hq.P, 5);
      Vector var3 = new Vector();

      for(int var2 = 0; var2 < this.O.length; ++var2) {
         if (this.O[var2].c != -1 || this.O[var2].d != -1) {
            var3.addElement(new a8(this.O[var2].b + "(" + k4.b(this.O[var2].c, this.O[var2].d, true) + ")", var2, var2));
         }
      }

      if (var3.size() > 0) {
         f1.d().b(var3, k4.q, 27 * ev.a, 27 * ev.a);
      }
   }

   private void m() {
      this.L = -1;
      this.C = -1;
      N = false;
      H = false;
      this.h();
      super.g = null;
      if (gx.l(GameMidlet.k.f) == null) {
         this.i();
      }
   }

   private void n() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < f5.k.size(); ++var2) {
         s var3;
         int var4;
         if ((var3 = (s)f5.k.elementAt(var2)).j != 0 && (this.J != 4 && (var3.j == 1 || var3.j == 2) || this.J == 4) && (var4 = var3.h.indexOf(":")) != -1) {
            boolean var5 = false;
            String var6 = var3.h.substring(0, var4);

            for(var4 = 0; var4 < var1.size(); ++var4) {
               if (((ag)var1.elementAt(var4)).b.equals(var6)) {
                  var5 = true;
               }
            }

            if (!var5 || var1.size() == 0) {
               var1.addElement(new ag(var6, 18, var2));
            }
         }
      }

      f1.d().b(var1, 2);
   }

   private void a(String var1) {
      this.m();
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < f5.k.size(); ++var3) {
         s var4;
         int var5 = (var4 = (s)f5.k.elementAt(var3)).h.indexOf(var1);
         if (var4.j != 0 && var5 != -1 && (this.J != 4 && (var4.j == 1 || var4.j == 2) || this.J == 4)) {
            String var7 = var4.h.substring(var4.h.indexOf(":") + 1);
            String var6 = k4.b(var4.i, var4.e, true);
            var2.addElement(new a7("", new gh(this, var3, var1), var4, var6, var7));
         }
      }

      if (var2.size() > 0) {
         f1.d().b(var2, k4.q, 90, 90);
         f1.G = new gi(this);
      }
   }

   private boolean b(s var1) {
      if (var1.j != 2 && var1.j != 4) {
         if (gx.h[this.B * gx.f + this.A] != 80) {
            k4.c(hq.cC);
            return true;
         }

         for(int var5 = 0; var5 < var1.k.size(); ++var5) {
            cn var7 = (cn)var1.k.elementAt(var5);
            if (gx.h[(this.B + var7.c) * gx.f + this.A + var7.b] != 80) {
               k4.c(hq.cC);
               return true;
            }
         }
      } else {
         String var2 = "";
         int var3 = 0;

         while(true) {
            if (var3 < this.I.size()) {
               iq var4 = (iq)this.I.elementAt(var3);
               if (var3 == this.L || var4.i != var1.b || this.A != var4.a / 24 || this.B != var4.b / 24) {
                  ++var3;
                  continue;
               }

               var2 = hq.cD;
            }

            if (!var2.equals("")) {
               k4.c(var2);
               return true;
            }

            if (var1.j != 2 && var1.j != 4) {
               break;
            }

            var3 = (this.B - 1) * gx.f + this.A;
            if (gx.e[var3] < G || gx.e[this.B * gx.f + this.A] >= G) {
               k4.c(hq.cE);
               return true;
            }
            break;
         }
      }

      return false;
   }

   public final void b(iq var1) {
      if (c(var1)) {
         ++var1.b;
      }

      this.I.addElement(var1);
      gx.m.addElement(var1);
      this.e(var1);
      gx.b(gx.m);
   }

   public final void c() {
      super.c();
      if (!N) {
         k4.A.b();
         GameMidlet.k.e();
      } else {
         int var1 = 0;
         if (k4.d(2)) {
            if (!c(this.A, this.B - 1)) {
               --this.B;
            }

            if (this.B < 0) {
               this.B = 0;
            }

            var1 = 1;
         } else if (k4.d(4)) {
            if (!c(this.A - 1, this.B)) {
               --this.A;
            }

            if (this.A < 0) {
               this.A = 0;
            }

            var1 = 1;
            GameMidlet.k.s = it.r;
         } else if (k4.d(6)) {
            if (!c(this.A + 1, this.B)) {
               ++this.A;
            }

            if (this.A >= gx.f) {
               this.A = gx.f - 1;
            }

            var1 = 1;
            GameMidlet.k.s = 0;
         } else if (k4.d(8)) {
            if (!c(this.A, this.B + 1)) {
               ++this.B;
            }

            if (this.B >= gx.g) {
               this.B = gx.g - 1;
            }

            var1 = 1;
         }

         if (k4.h) {
            var1 = (cl.b().c + k4.j) / (gx.j * ev.a);
            int var2 = (cl.b().d + k4.k) / (gx.j * ev.a);
            if (var1 == this.A && var2 == this.B && super.f != null) {
               super.f.a();
            }

            this.A = var1;
            this.B = var2;
            var1 = 1;
            k4.h = false;
         }

         if (var1) {
            GameMidlet.k.a = this.A * 24 + 12;
            GameMidlet.k.b = this.B * 24 + 12;
            if (this.L != -1 && this.I.size() > 0) {
               iq var4;
               (var4 = (iq)this.I.elementAt(this.L)).a = this.A * 24;
               var4.b = this.B * 24;
               gx.b(gx.m);
            }
         }
      }
   }

   private static boolean c(int var0, int var1) {
      return gx.e[var1 * gx.f + var0] == gx.d.d - 2 || gx.e[var1 * gx.f + var0] == -1;
   }

   public final void b() {
      AutoController.h().b();
      if (!N && !H && super.g == null && AutoController.h().g != null) {
         super.g = gx.v;
      }
   }

   public final void b(Graphics var1) {
      this.a(var1);
      super.b(var1);
      k4.b(var1);
   }

   public final void a(Graphics var1) {
      k4.A.c(var1);
      if (N && k4.w == null) {
         Graphics var2 = var1;
         fg var3 = this;
         if (!H && this.L == -1) {
            if (this.C != -1) {
               for(int var8 = 0; var8 < gx.h.length; ++var8) {
                  if (var3.K == 0 && gx.e[var8] >= G && gx.e[var8] < var3.O.length && (var3.O[gx.e[var8]].d != -1 || var3.O[gx.e[var8]].c != -1)
                     || var3.K == 1 && gx.e[var8] < G) {
                     var3.b(var2, 2 + var8 % gx.f * 24, 2 + var8 / gx.f * 24, 0, 20);
                  }
               }

               gx.d.b(var3.C, var3.A * 24 * ev.a, var3.B * 24 * ev.a, 0, 0, var2);
            }
         } else if (this.C != -1) {
            s var4;
            if ((var4 = (s)f5.k.elementAt(this.C)).j != 2 && var4.j != 4) {
               for(int var7 = 0; var7 < gx.h.length; ++var7) {
                  if (gx.h[var7] == 80 && (var7 % gx.f != var3.A || var7 / gx.f != var3.B)) {
                     var3.b(var2, 2 + var7 % gx.f * 24, 2 + var7 / gx.f * 24, 0, 20);
                  }
               }
            } else {
               for(int var6 = 0; var6 < gx.e.length; ++var6) {
                  if (var6 > 0 && gx.e[var6] < G && gx.e[var6 - gx.f] >= G) {
                     var3.b(var2, 2 + var6 % gx.f * 24, 2 + var6 / gx.f * 24, 0, 20);
                  }
               }
            }
         }

         var3.b(var2, var3.A * 24, var3.B * 24, 1, 24);
      }

      k4.A.e(var1);
      if (N) {
         if (H && this.C != -1) {
            s var5 = (s)f5.k.elementAt(this.C);
            f5.b(var1, var5.c, (this.A * 24 + var5.f) * ev.a, (this.B * 24 + var5.g) * ev.a, 0);
         }

         if (k4.w == null) {
            var1.drawImage(this.S, (this.A * 24 + 12) * ev.a, (this.B * 24 + this.ab) * ev.a, 33);
         }

         if (this.K != -1) {
            k4.T
               .b(var1, this.O[this.C].b + "(" + k4.b(this.O[this.C].c, this.O[this.C].d, true) + ")", (this.A * 24 + 12) * ev.a, (this.B * 24 - 40) * ev.a, 2);
         }

         ++this.ab;
         if (this.ab > 5) {
            this.ab = 0;
         }
      }

      k4.d(var1);
      gx.b(var1);
   }

   private void b(Graphics var1, int var2, int var3, int var4, int var5) {
      var1.setColor(this.V[var4]);
      var1.drawRect(var2 * ev.a, var3 * ev.a, (var5 - 1) * ev.a, (var5 - 1) * ev.a);
   }

   static boolean c(iq var0) {
      if (f5.c(var0.i).j != 2 && f5.c(var0.i).j != 4) {
         int var1 = (var0.b / 24 - 1) * gx.f + var0.a / 24;
         if (gx.e[var1] >= G && gx.e[var0.b / 24 * gx.f + var0.a / 24] < G) {
            return true;
         }
      }

      return false;
   }

   t o() {
      DataInputStream var1;
      if ((var1 = f5.b(bb[0])) == null) {
         return null;
      } else {
         this.R = new t();

         try {
            this.R.c = var1.readShort();
            G = var1.readShort();
            byte[] var2 = new byte[var1.available()];
            var1.read(var2);
            t var10000 = this.R;
            new b2();
            var10000.f = b2.c(var2);
            var1.close();
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         return this.R;
      }
   }

   public final void b(byte[] var1, int var2) {
      G = (short)var2;
      t var10000 = this.R;
      new b2();
      var10000.f = b2.c(var1);
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);

      try {
         var4.writeShort(this.R.c);
         var4.writeShort(var2);
         var4.write(var1);
         new b2();
         b2.b(bb[3], var3.toByteArray());
         var4.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      AutoController.h();
      if (AutoController.X != -1) {
         h4 var6 = h4.b();
         AutoController.h();
         var6.e(AutoController.X);
         AutoController.h();
         AutoController.X = -1;
      } else {
         k4.h();
      }
   }

   static boolean p() {
      return gx.b == 70 || gx.b == 69 || gx.b == 68 || gx.b == 110;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            if (this.C != -1) {
               var2 = this.B * gx.f + this.A;
               if (this.O[gx.e[var2]].d == -1 && this.O[gx.e[var2]].c == -1) {
                  k4.c(hq.cC);
                  return;
               }

               if (this.C < G && gx.e[var2] >= G || this.C >= G && gx.e[var2] < G) {
                  k4.c(hq.cC);
                  return;
               }

               this.T = this.A;
               this.U = this.B;
               gx.e[this.B * gx.f + this.A] = (short)this.C;
            }

            return;
         case 1:
            this.C = -1;
            this.K = -1;
            this.T = -1;
            this.U = -1;
            boolean var12 = false;

            for(int var15 = 0; var15 < this.aa.length; ++var15) {
               if (this.aa[var15] != gx.e[var15]) {
                  var12 = true;
                  break;
               }
            }

            if (var12) {
               h4.b().b(gx.e, 0);
               k4.i();
            }

            this.i();
            N = false;
            this.h();
            super.g = null;
            return;
         case 2:
            Vector var18 = new Vector();
            if (this.M == GameMidlet.k.f) {
               var18.addElement(new ag(hq.b0, 1));
               var18.addElement(new ag(hq.cu, 2));
               String[] var5 = bb;
               var18.addElement(new ag(var5[4] + kq.b(ag), 20));
               var18.addElement(new ag(var5[1] + kq.b(ah), 21));
               var1 = 0;

               for(int var14 = 0; var14 < gx.n.size(); ++var14) {
                  if (((ik)gx.n.elementAt(var14)).d == 0) {
                     ++var1;
                  }
               }

               if (var1 > 1) {
                  var18.addElement(new ag(hq.w, 3));
               }

               var18.addElement(new ag(hq.u, 4));
            }

            var18.addElement(new ag(hq.y, 5));
            f1.d().b(var18, 0);
            return;
         case 3:
            Vector var3;
            (var3 = new Vector()).addElement(new ag(hq.cz, 11));
            var3.addElement(new ag(hq.cA, 12));
            var3.addElement(new ag(hq.a7, 13));
            f1.d().b(var3, 2);
            f1 var10 = f1.d();
            var2 = this.A * 24 * ev.a - cl.b().c - f1.d().t / 2 + 12;
            int var17 = this.B * 24 * ev.a - cl.b().d - f1.d().u - 12;
            var10.r = var2;
            var10.s = var17;
            if (var10.r < 0) {
               var10.r = 0;
            }

            if (var10.s < 0) {
               var10.s = 0;
            }

            return;
         case 4:
            this.m();
            return;
         case 5:
            this.l();
            return;
         case 8:
            e5.e();
            k4.D = null;
            return;
         case 50:
            h4.b().b(gx.e, 1);
            k4.i();
            return;
         case 51:
            gx.e = this.aa;
            this.aa = null;
            hz.b();
            return;
         case 53:
            hx.b().l(0);
            k4.i();
            return;
         case 100:
            h4 var19 = h4.b();
            e1 var8 = k4.x;
            cs var9 = k4.x.o;
            var19.b(k4.x.o.o, 0, 0);
            k4.h();
            return;
         case 101:
            hx var10000 = hx.b();
            e1 var6 = k4.x;
            cs var7 = k4.x.o;
            var10000.b(k4.x.o.o);
      }
   }

   void d(iq var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.I.size(); ++var3) {
         iq var4;
         if ((var4 = (iq)this.I.elementAt(var3)).a / 24 == var1.a / 24 && var4.b / 24 == var1.b / 24) {
            ++var2;
         }
      }

      if (var2 == 1) {
         s var6 = f5.c(var1.i);

         for(int var7 = 0; var7 < var6.k.size(); ++var7) {
            cn var5 = (cn)var6.k.elementAt(var7);
            gx.h[(var1.b / 24 + var5.c) * gx.f + var1.a / 24 + var5.b] = 80;
         }
      }
   }

   public final void e(iq var1) {
      s var2 = f5.c(var1.i);
      byte var3 = 88;
      if (var2.b == this.Z) {
         var3 = 112;
      } else if (var2.b == this.Y) {
         var3 = 111;
      } else if (var2.d == 1) {
         var3 = 79;
      } else if (var2.d == 2) {
         var3 = 67;
      }

      for(int var4 = 0; var4 < var2.k.size(); ++var4) {
         cn var5 = (cn)var2.k.elementAt(var4);
         gx.h[(var1.b / 24 + var5.c) * gx.f + var1.a / 24 + var5.b] = var3;
      }
   }

   public final void a(int var1) {
      e3.e().b(var1, this);
      super.a(var1);
   }

   public final void b(String var1) {
      if (!var1.trim().equals("")) {
         hv.b().b(var1);
      }
   }

   public final void q() {
      if (fd.E == null) {
         k4.i();
         h1.b().e();
         fd.G = 2;
      } else if (fd.H) {
         fd.H = false;
         k4.i();
         h4.b().f(1);
      } else {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < fd.E.size(); ++var2) {
            i3 var3;
            if ((var3 = (i3)fd.E.elementAt(var2)).Q == this.J) {
               var1.addElement(var3);
            }
         }

         if (var1.size() == 0) {
            if (k4.u == fd.g()) {
               fd.g().A.d();
            }

            k4.c(hq.cF);
         } else {
            fd.g().d();
            fd.C = var1;
            fd.g().h();
            fd.g().j();
         }
      }
   }

   public final void a(int var1, int var2) {
      Object var3 = -1;

      Object var4;
      for(var4 = 0; !(var4 >= this.I.size()); ++var4) {
         iq var5;
         if ((var5 = (iq)this.I.elementAt((int)var4)).a / 24 == this.A && var5.b / 24 == this.B) {
            var3 = var4;
            break;
         }
      }

      iq var20 = null;
      if (var3 != -1) {
         var20 = (iq)this.I.elementAt((int)var3);
      }

      switch(var1) {
         case 1:
            hx var13;
            (var13 = hx.b()).a((byte)-87);
            var13.a();
            return;
         case 2:
            Vector var12;
            (var12 = new Vector()).addElement(new ag(hq.cv, 6));
            var12.addElement(new ag(hq.cw, 7));
            if (this.I.size() > 0) {
               var12.addElement(new ag(hq.cx, 8));
            }

            f1.d().b(var12, 2);
            return;
         case 3:
            Vector var11 = new Vector();

            for(int var16 = 0; var16 < gx.n.size(); ++var16) {
               it var18;
               if ((var18 = (it)gx.n.elementAt(var16)).d == 0 && var18.f != GameMidlet.k.f) {
                  var11.addElement(new ag(var18.g, 16, var16));
               }
            }

            f1.d().b(var11, 0);
            return;
         case 4:
            k4.x.b(hq.bA + ":", 100, 2);
            return;
         case 5:
            AutoController.h().j();
            return;
         case 6:
            this.n();
            return;
         case 7:
            N = true;
            if (this.O == null) {
               if (this.O == null) {
                  hw.b();
                  h4 var10;
                  (var10 = h4.b()).a((byte)-43);
                  var10.a();
                  k4.i();
               }

               return;
            }

            this.l();
            return;
         case 8:
            this.j();
            return;
         case 9:
         case 10:
         case 19:
         default:
            return;
         case 11:
            if (var3 == -1) {
               k4.c(hq.cy);
               return;
            }

            this.L = (int)var3;

            for(int var9 = 0; var9 < f5.k.size(); ++var9) {
               if (((s)f5.k.elementAt(var9)).b == var20.i) {
                  this.C = var9;
                  break;
               }
            }

            super.e = null;
            super.g = null;
            this.d(var20);
            this.P = new cn(this.A, this.B, var20.i);
            super.f = new ag(hq.A, new f7(this, var20));
            return;
         case 12:
            if (var3 == -1) {
               k4.c(hq.cy);
               return;
            }

            if (var20.j == 0) {
               var20.j = 2;
            } else {
               var20.j = 0;
            }

            h4.b().b(var20.i, this.A, this.B, this.A, this.B, var20.j);
            return;
         case 13:
            if (var3 != -1 && var20.i != this.Y) {
               k4.b(hq.cB, new f4(var20));
               return;
            }

            k4.c(hq.cy);
            return;
         case 14:
            fb.g().e();
            k4.c(hq.cl, 53);
            return;
         case 15:
            cs[] var8 = new cs[3];

            for(int var14 = 0; var14 < 3; ++var14) {
               var8[var14] = new cs();
               cs var10000 = var8[var14];
               byte var19 = 2;
               var10000.z = var19;
            }

            var8[0].b(true);
            ag var15 = new ag(hq.b_, new gf(var8));
            fb.g().e();
            e5.e().b(var8, hq.b9, hq.dV, var15);
            k4.D = e5.e();
            e5.e().e = new ag(hq.e, 8);
            return;
         case 16:
            if (var2 < gx.n.size()) {
               it var17 = (it)gx.n.elementAt(var2);
               h4.b().g(var17.f);
               return;
            }

            return;
         case 17:
            for(int var7 = 0; var7 < this.O.length; ++var7) {
               if (var7 == var2) {
                  if (this.T != -1) {
                     this.A = this.T;
                     this.B = this.U;
                     GameMidlet.k.a = this.T * 24;
                     GameMidlet.k.b = this.U * 24;
                     cl.b().b(GameMidlet.k.a * ev.a, GameMidlet.k.b * ev.a);
                  }

                  this.C = var7;
                  if (this.C < G) {
                     this.K = 1;
                  } else {
                     this.K = 0;
                  }
               }
            }

            return;
         case 18:
            for(int var6 = 0; var6 < f5.k.size(); ++var6) {
               if (var6 == var2
                  && ((s)(var3 = (s)f5.k.elementAt(var6))).j != 0
                  && (this.J != 4 && (((s)var3).j == 1 || ((s)var3).j == 2) || this.J == 4)
                  && (var4 = ((s)var3).h.indexOf(":")) != -1) {
                  var3 = ((s)var3).h.substring(0, (int)var4);
                  this.a((String)var3);
               }
            }

            return;
         case 20:
            ah = false;
            ag = !ag;
            return;
         case 21:
            ag = false;
            ah = !ah;
      }
   }

   public final void r() {
      this.ac = null;
      this.ad = null;
      hv.b().b(21, 0);
      gx.A = -1;
   }

   public final void b(Vector var1, Vector var2, int var3, byte var4) {
      this.ad = var1;
      this.ac = var2;
      this.ae = var3;
      this.af = var4;
      Vector var8 = AutoController.h().b(var1, GameMidlet.k.f, 3);
      var2 = AutoController.h().b(var2, GameMidlet.k.f, 2);
      if (k4.u != e_.z) {
         fb.g().ab = false;
         fb.g().b(new String[]{hq.bo, hq.b0}, new Vector[]{var8, var2}, null);
         ag var5 = AutoController.h().b(var1, 1, 1, false);
         ag var7 = new ag(hq.d, new dg());
         fb var10000 = fb.g();
         var4 = 0;
         var10000.P[var4] = var5;
         var10000 = fb.g();
         var4 = 1;
         var10000.P[var4] = var7;
         if (k4.u != fb.g()) {
            fb.g().d();
         }
      }
   }

   public static void s() {
      k4.x.b(hq.bA, 101, 2);
   }

   public final void b(boolean var1, String var2) {
      if (!var1) {
         k4.c(var2);
      } else {
         var1 = fb.L;
         int var6 = fb.T;
         if (var1 == 0) {
            gl var4 = (gl)this.ad.elementAt(var6);
            this.ac.addElement(var4);
            this.ad.removeElement(var4);
         } else {
            gl var5 = (gl)this.ac.elementAt(var6);
            this.ad.addElement(var5);
            this.ac.removeElement(var5);
         }

         this.t();
         k4.h();
      }
   }

   public final void t() {
      int var1 = fb.L;
      int var2 = fb.T;
      fb.g().e();
      this.b(this.ad, this.ac, this.ae, this.af);
      fb.L = var1;
      fb.g().l();
      if (var2 >= fb.g().N[var1].size()) {
         var2 = 0;
      }

      fb.T = var2;
      fb.g().o();
      k4.B.b(fb.T);
   }

   public final void b(byte var1, String var2, String[] var3, short[] var4, short[] var5, String[] var6, String[] var7, int[] var8, short[] var9) {
      AutoController.h();
      AutoController.h();
      AutoController.h();
      AutoController.g(GameMidlet.k);
      Vector var10 = new Vector();

      for(int var11 = 0; var11 < var3.length; ++var11) {
         String var10003 = hq.P;
         bv var10004 = new bv(var1, var5[var11], var7[var11]);
         String var10006 = var3[var11];
         short var10007 = var4[var11];
         short var10008 = var5[var11];
         String var12 = var6[var11];
         int var10009 = var8 == null ? -1 : var8[var11];
         String var10010 = var7[var11];
         var10.addElement(new a_(var10003, var10004, var11, var10006, var10007, var12, var10009, var9[var11]));
      }

      if (var10.size() > 0) {
         fb.g().d();
         fb.ad = true;
         fb.g().b(new String[]{var2}, new Vector[]{var10}, null);
      }
   }

   static void b(fg var0) {
      var0.k();
   }

   static int c(fg var0) {
      return var0.T;
   }

   static void b(fg var0, int var1) {
      var0.A = var1;
   }

   static int d(fg var0) {
      return var0.U;
   }

   static void c(fg var0, int var1) {
      var0.B = var1;
   }

   static void d(fg var0, int var1) {
      var0.C = var1;
   }

   static int e(fg var0) {
      return var0.A;
   }

   static void e(fg var0, int var1) {
      var0.T = var1;
   }

   static int f(fg var0) {
      return var0.B;
   }

   static void f(fg var0, int var1) {
      var0.U = var1;
   }

   static void b(fg var0, int var1, String var2) {
      s var3 = (s)f5.k.elementAt(var1);
      if (!var0.b(var3)) {
         k4.b(var3.i, var3.e, new c5(var0, var3, var2), new c2(var0, var3, var2), new dh(var0));
      }
   }

   static void g(fg var0) {
      var0.n();
   }

   static boolean b(fg var0, s var1) {
      return var0.b(var1);
   }

   static cn h(fg var0) {
      return var0.P;
   }

   static boolean f(iq var0) {
      return c(var0);
   }

   static void i(fg var0) {
      var0.j();
   }

   static void b(fg var0, String var1) {
      var0.a(var1);
   }

   static void j(fg var0) {
      var0.m();
   }

   private static char[] c(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'v');
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
               var10005 = 112;
               break;
            case 1:
               var10005 = 41;
               break;
            case 2:
               var10005 = 112;
               break;
            case 3:
               var10005 = 24;
               break;
            case 4:
               var10005 = 16;
               break;
            case 5:
               var10005 = 33;
               break;
            default:
               var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
