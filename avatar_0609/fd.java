import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fd extends e8 {
   public static fd z;
   public e8 A;
   private int B;
   public static Vector C = new Vector();
   private ag D;
   public static Vector E;
   private int F;
   public static byte G = 0;
   public static boolean H = false;
   public int I;
   public static String J;
   public static Hashtable K = new Hashtable();
   private boolean L = false;
   private String M;
   private boolean N = false;
   private int O = -20;
   private ag P;

   static {
      String var10002 = c(a("/W3*?\u0006\" V."));
      boolean var10001 = true;
      String var0 = var10002;
      J = var0;
   }

   public static fd g() {
      if (z == null) {
         z = new fd();
      }

      return z;
   }

   public final void d() {
      this.I = 0;
      this.D = new ag(hq.e, 1);
      super.g = this.D;
      this.A = null;
      if (k4.u != e_.g() && k4.u != fb.g() && k4.u != g()) {
         this.A = k4.u;
      }

      this.i();
      super.d();
      if (k4.ah > 0) {
         this.N = true;
      }
   }

   public final void h() {
      k4.B.b(20, ib.b().i + ib.t + ev.b, k4.o - 40, this.F, k4.o - 40, C.size() * this.F, k4.o - 40, ib.b().f - 5 - (ib.t + 2 * ev.b), C.size());
      if (C.size() > 0) {
         gt.b().b(C.size() * this.F, ib.b().f - 5 - (ib.t + 2 * ev.b));
      }
   }

   public final void i() {
      if (k4.ah == 0) {
         ib.b().b(this.M, k4.o - 20, k4.s - k4.ab - 20, 1);
      } else {
         ib.b().b(this.M, k4.o - 20 * ev.a, k4.p - k4.al - k4.ab - 10 + (fp.O ? 7 * ev.a : 0), 1);
      }

      ib.b().i = 10 + k4.al;
      if (C != null) {
         this.h();
      }
   }

   public fd() {
      this.B = 0;
      this.F = 40 * ev.a;
   }

   public final void b(int var1, boolean var2) {
      if (var2 && var1 == this.I) {
         this.b(this.P);
      }

      this.O = -20;
      if (var1 >= 0 && var1 < C.size()) {
         this.I = var1;
      }
   }

   public final void b(boolean var1) {
      this.N = var1;
   }

   public final void b(Graphics var1) {
      var1.setClip(0, 0, k4.o, k4.p);
      if (this.A != null) {
         this.A.a(var1);
      } else {
         AutoController.h().a(var1);
      }

      ib.b().b(var1);
      var1.translate(0, ib.b().i + ib.t + ev.b);
      var1.setClip(0, 0, k4.o, k4.p);
      int var2;
      if ((var2 = g5.r / this.F) < 0) {
         var2 = 0;
      }

      int var3;
      if ((var3 = var2 + (k4.p - 40) / this.F + 1) > C.size()) {
         var3 = C.size();
      }

      if (this.B == 5) {
         int var5 = var3;
         Graphics var13 = var1;
         fd var11 = this;
         int var6 = 0 + this.F * var2;

         for(int var7 = var2; var7 < var5; ++var7) {
            var13.setClip(10 * ev.a + 4 + ev.a, 0, ib.b().g - 8 - (ev.a << 1), ib.b().f - 5 - (ib.t + 2 * ev.b));
            var13.translate(0, -g5.r);
            in var15 = (in)C.elementAt(var7);
            int var8 = 0;
            if (!var11.N && var7 == var11.I) {
               k4.aa.c(var13, 10 * ev.a + 3 + 2 * ev.a, var6 + 2, k4.o - 20 * ev.a - 6 - 4 * ev.a, var11.F - 4);
               if (var15.j > ib.b().g - 40) {
                  var11.O += 2;
                  if (var11.O > var15.j - (ib.b().g - 40)) {
                     var11.O = -20;
                  }
               }

               var8 = var11.O;
               if (var11.O < 0) {
                  var8 = 0;
               }
            }

            int var9 = f5.d((short)var15.l).d + 4;
            f5.b(var13, var15.l, 10 * ev.a + 10 + var9 / 2, var6 + var11.F / 2 - 12 * ev.a + ev.j / 2, 3);
            k4.S.b(var13, var15.h, 10 * ev.a + 10 + var9, var6 + var11.F / 2 - 12 * ev.a, 0);
            k4.V.b(var13, var15.i, 10 * ev.a + 10 - var8, var6 + var11.F / 2 + 3 * ev.a, 0);
            var6 += var11.F;
            var13.translate(0, g5.r);
         }
      } else if (this.B == 6 || this.B == 0) {
         int var17 = var3;
         int var16 = var2;
         Graphics var14 = var1;
         fd var12 = this;
         int var19 = 0;

         for(int var18 = 0 + this.F * var2; var16 < var17; ++var16) {
            var14.setClip(10 * ev.a + 4, 0, ib.b().g - 8, ib.b().f - 5 - (ib.t + 2 * ev.b));
            var14.translate(0, -g5.r);
            i3 var20 = (i3)C.elementAt(var16);
            int var21 = 0;
            if (!var12.N && var16 == var12.I) {
               k4.aa.c(var14, 10 * ev.a + 3 + 2 * ev.a, var18 + 2, k4.o - 20 * ev.a - 6 - 4 * ev.a, var12.F - 4);
               int var10;
               int var10000 = var10 = k4.V.b(var20.M);
               int var10003 = ev.a - 1;
               if (var10000 > ib.b().g - (57 + var10003 * 30)) {
                  var12.O += 2;
                  int var10004 = ev.a - 1;
                  if (var12.O > var10 - (ib.b().g - (57 + var10004 * 30))) {
                     var12.O = -20;
                  }
               }

               var21 = var12.O;
               if (var12.O < 0) {
                  var21 = 0;
               }
            }

            var20.b(var14, 10 * ev.a + 25 + (ev.a - 1) * 20, var18 + var12.F - 5 * ev.a, false);
            int var22 = 0;
            if (var20.aj != -1) {
               var22 = 6 * ev.a;
               f5.b(var14, var20.aj, 60 + (ev.a - 1) * 30 + var22, var18 + var12.F / 2 - 12 * ev.a + ev.j / 2, 3);
            }

            int var10001 = 60 + (ev.a - 1) * 30;
            int var10005 = ev.a - 1;
            var14.setClip(var10001, g5.r, ib.b().g - (47 + var10005 * 30), ib.b().f - 5 - (ib.t + 2 * ev.b));
            k4.S.b(var14, var20.g, 60 + (var22 << 1) + (ev.a - 1) * 30, var18 + var12.F / 2 - 12 * ev.a, 0);
            if (var20.am != -1) {
               f5.b(var14, var20.am, 60 + 6 * ev.a + (var22 << 1) + (ev.a - 1) * 30 + k4.S.b(var20.g), var18 + var12.F / 2 - 12 * ev.a + ev.j / 2, 3);
            }

            if (var20.an != -1) {
               var19 = 12 * ev.a;
               f5.b(var14, var20.an, 60 - var21 + (ev.a - 1) * 30 + 6 * ev.a, var18 + var12.F / 2 + 3 * ev.a + ev.h / 2, 3);
            }

            k4.V.b(var14, var20.M, 60 - var21 + (ev.a - 1) * 30 + var19, var18 + var12.F / 2 + 3 * ev.a, 0);
            var18 += var12.F;
            var14.translate(0, g5.r);
         }
      }

      gt.b().b(var1, k4.o - 10 * ev.a - 9 - ev.a);
      k4.d(var1);
      if (fp.O) {
         fp.b(var1, super.e, super.f, super.g);
      } else {
         super.b(var1);
      }
   }

   public final void c() {
      if (fp.O && k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }

   public final void b() {
      if (this.A != null) {
         this.A.b();
      }

      gt.b().c(g5.r, g5.s);
   }

   private void b(Vector var1, e8 var2) {
      if (k4.u != g()) {
         this.A = var2;
      }

      switch(this.B) {
         case 0:
            H = true;
            E = var1;
            if (G == 1) {
               AutoController.h();
               AutoController.e(AutoController.J);
            } else if (G == 2) {
               H = false;
               k4.i();
               h4.b().f(1);
            } else if (k4.u != this) {
               this.d();
            }

            G = 0;
      }

      C = null;
      C = var1;
      if (this.B != 5) {
         for(int var4 = 0; var4 < C.size(); ++var4) {
            i3 var3;
            (var3 = (i3)C.elementAt(var4)).j();
            var3.i();
         }
      }

      this.I = 0;
      super.g = this.D;
      this.h();
   }

   public final void a(boolean var1) {
      this.B = 0;
      if (E == null) {
         k4.i();
         h1.b().e();
      } else {
         this.A = k4.u;
         this.b(J);
         if (k4.u != this) {
            this.d();
         }
      }

      if (var1) {
         this.L = true;
         this.P = new ag(hq.P, 4);
         if (k4.ah == 0) {
            super.f = this.P;
         }
      }
   }

   public static i3 c(int var0) {
      int var1 = E.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         i3 var3;
         if ((var3 = (i3)E.elementAt(var2)).f == var0) {
            return var3;
         }
      }

      return null;
   }

   public final boolean b(String var1) {
      byte[] var2 = (byte[])K.get(var1);
      k4.h();
      if (var2 == null) {
         return false;
      } else {
         this.b(var2, var1);
         return true;
      }
   }

   public final void b(byte[] var1, String var2) {
      String[] var3 = null;
      byte[] var4 = null;
      ByteArrayInputStream var15 = new ByteArrayInputStream(var1);
      DataInputStream var16 = new DataInputStream(var15);

      try {
         String var5 = var16.readUTF();
         int var6 = var16.readInt();
         byte var7 = var16.readByte();
         byte var8 = var16.readByte();
         short var9 = var16.readShort();
         Vector var10 = new Vector();
         if (var7 == 0) {
            this.B = 5;

            for(int var17 = 0; var17 < var9; ++var17) {
               in var11;
               (var11 = new in()).l = var16.readShort();
               var11.h = var16.readUTF();
               var11.i = var16.readUTF();
               var11.j = k4.V.b(var11.i);
               var10.addElement(var11);
            }
         } else {
            this.B = 6;

            for(int var18 = 0; var18 < var9; ++var18) {
               i3 var20;
               (var20 = new i3()).s = 0;
               byte var12 = var16.readByte();
               var20.E = new Vector();

               for(int var13 = 0; var13 < var12; ++var13) {
                  var20.b(new gl(var16.readShort()));
               }

               var20.f = var16.readInt();
               var20.aj = var16.readShort();
               if (var2.equals(J)) {
                  var20.am = var16.readShort();
                  var20.an = var16.readShort();
               }

               var20.g = var16.readUTF();
               var20.M = var16.readUTF();
               var10.addElement(var20);
            }
         }

         if ((var7 = var16.readByte()) > 0) {
            var3 = new String[var7];
            var4 = new byte[var7];

            for(int var21 = 0; var21 < var7; ++var21) {
               var4[var21] = var16.readByte();
               var3[var21] = var16.readUTF();
            }
         }

         if (var2.equals(J)) {
            this.B = 0;
         }

         g().b(var10, k4.u);
         this.M = var5;
         this.i();
         if (k4.u != this) {
            this.d();
         }

         super.e = null;
         if (var7 > 0) {
            super.e = new ag(hq.d, new gm(this, var2, var3, var6, var8, var4));
         }

         if (!this.L) {
            if (var2.equals(J)) {
               this.P = new ag(hq.M, 0);
               if (k4.ah == 0) {
                  super.f = this.P;
               }
            } else if (!this.L) {
               this.P = new ag(hq.P, new g6(this, var6, var8));
               if (k4.ah == 0) {
                  super.f = this.P;
               }
            }
         }

         this.L = false;
      } catch (IOException var14) {
         var14.printStackTrace();
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            if (this.I >= 0 && this.I < C.size()) {
               i3 var4 = (i3)C.elementAt(this.I);
               fm.g().b(var4.f, var4.g);
               fm.g().b(this.A);
               return;
            }

            return;
         case 1:
            super.f = null;
            super.g = null;
            super.e = null;
            C = null;
            k4.B.w = false;
            if (this.A == null) {
               AutoController.h().d();
               return;
            }

            this.A.d();
            return;
         case 2:
            return;
         case 3:
            i3 var3 = (i3)C.elementAt(g().I);
            h4.b().e(var3.f);
            k4.i();
            return;
         case 4:
            k4.i();
            fj.g().a(((i3)E.elementAt(this.I)).f, true);
      }
   }

   public final void j() {
      this.P = new ag(hq.P, 3);
      if (k4.ah == 0) {
         super.f = this.P;
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 50:
            h1.b().e();
      }
   }

   public static void k() {
      K.remove(J);
      E = null;
   }

   static boolean b(fd var0) {
      return var0.L;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'N');
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
               var10005 = 73;
               break;
            case 1:
               var10005 = 37;
               break;
            case 2:
               var10005 = 90;
               break;
            case 3:
               var10005 = 79;
               break;
            case 4:
               var10005 = 81;
               break;
            case 5:
               var10005 = 98;
               break;
            default:
               var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
