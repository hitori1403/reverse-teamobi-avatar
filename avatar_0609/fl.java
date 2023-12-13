import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fl extends e8 {
   private static fl z;
   private byte A = 1;
   public int B = 0;
   private int C;
   public int D;
   public int E;
   private Vector F;
   private Vector G;
   private Vector H;
   private int I = 0;
   private static final String J;

   public static fl g() {
      if (z == null) {
         z = new fl();
      }

      return z;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            Vector var3;
            (var3 = new Vector()).addElement(new ag(hq.p, 0, this));
            var3.addElement(new ag(hq.q, 1, this));
            k4.b(hq.c3, var3);
      }
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            i();
            return;
         case 1:
            i();
      }
   }

   public final void d() {
      GameMidlet.k.s = 0;
      GameMidlet.k.E = new Vector();
      this.h();
      super.f = new ag(hq.bV, 0);
      gl var1 = new gl();
      int var2 = b2.b.nextInt(this.H.size());
      var1.b = ((jw)this.H.elementAt(var2)).b;
      GameMidlet.k.b(var1);
      var1 = new gl();
      var2 = b2.b.nextInt(this.G.size());
      var1.b = ((jw)this.G.elementAt(var2)).b;
      GameMidlet.k.b(var1);
      (var1 = new gl()).b = 4;
      GameMidlet.k.b(var1);
      var1 = new gl();
      var2 = b2.b.nextInt(this.F.size());
      var1.b = ((jw)this.F.elementAt(var2)).b;
      GameMidlet.k.b(var1);
      GameMidlet.k.b(new gl((short)0));
      GameMidlet.k.i();
      ib.b().b(hq.bW, 150 * ev.a, 170 + (ev.a == 2 ? 120 : 0), 1);
      super.d();
   }

   private void h() {
      GameMidlet.k.D = this.A;
      if (this.F != null) {
         this.F.removeAllElements();
         this.G.removeAllElements();
         this.H.removeAllElements();
      }

      this.F = new Vector();
      this.G = new Vector();
      this.H = new Vector();

      for(int var1 = 0; var1 < f5.e.length; ++var1) {
         jw var2;
         if (f5.e[var1] instanceof jw && (var2 = (jw)f5.e[var1]) != null && (var2.i == this.A || var2.i == 0) && var2.h == 0) {
            if (var2.e == 50) {
               this.F.addElement(var2);
            } else if (var2.e == 20) {
               this.G.addElement(var2);
            } else if (var2.e == 10) {
               this.H.addElement(var2);
            }
         }
      }

      this.C = 0;
      this.j();
      if (GameMidlet.k.q != 10) {
         byte var4 = 1;
         i3 var3 = GameMidlet.k;
         GameMidlet.k.q = var4;
      }

      GameMidlet.k.i();
   }

   private static void i() {
      k4.N = true;
      k4.d(hq.bW + J);
      hx.b().e();
   }

   public final void b() {
      if (this.D > 0) {
         --this.D;
      }

      if (this.E > 0) {
         --this.E;
      }

      ++this.I;
      if (this.I > 50) {
         this.I = 0;
         int var1 = b2.b.nextInt(3);
         if (GameMidlet.k.q != 10) {
            if (var1 == 0) {
               byte var2 = 1;
               i3 var3 = GameMidlet.k;
               GameMidlet.k.q = var2;
            } else {
               byte var5 = 0;
               i3 var4 = GameMidlet.k;
               GameMidlet.k.q = var5;
            }
         }
      }

      GameMidlet.k.d();
   }

   public final void c(int var1) {
      this.B = var1;
      if (this.B < 0) {
         this.B = 1;
      }

      if (this.B > 1) {
         this.B = 0;
      }
   }

   public final void d(int var1) {
      this.C += var1;
      if (this.C < 0) {
         this.C = 1;
      }

      if (this.C > 1) {
         this.C = 0;
      }

      if (this.B == 0) {
         if (this.A == 1) {
            this.A = 2;
         } else {
            this.A = 1;
         }

         this.h();
      } else {
         this.j();
      }
   }

   public final void c() {
      k4.aa.k();
      super.c();
   }

   private void j() {
      for(int var1 = 0; var1 < GameMidlet.k.E.size(); ++var1) {
         gl var2;
         jw var3;
         if ((var3 = (jw)f5.b((var2 = (gl)GameMidlet.k.E.elementAt(var1)).b)).e == 50 && this.F.size() != 0 && this.C < this.F.size()) {
            var2.b = ((jw)this.F.elementAt(this.C)).b;
         }

         if (var3.e == 20 && this.G.size() != 0 && this.C < this.G.size()) {
            var2.b = ((jw)this.G.elementAt(this.C)).b;
         }

         if (var3.e == 10 && this.H.size() != 0 && this.C < this.H.size()) {
            var2.b = ((jw)this.H.elementAt(this.C)).b;
         }
      }

      GameMidlet.k.i();
   }

   public final void b(Graphics var1) {
      k4.A.c(var1);
      k4.A.e(var1);
      k4.d(var1);
      ib.b().b(var1);
      var1.translate(ib.b().h, ib.b().i);
      k4.aa.d(var1, this.B, this.A, this.D, this.E);
      super.b(var1);
   }

   public static void a(boolean var0) {
      k4.h();
      if (var0) {
         AutoController.h().y();
      } else {
         k4.c(hq.bX);
      }
   }

   static {
      String var10002 = c(a("b \u001f"));
      boolean var10001 = true;
      J = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'n');
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
               var10005 = 76;
               break;
            case 1:
               var10005 = 14;
               break;
            case 2:
               var10005 = 49;
               break;
            case 3:
               var10005 = 26;
               break;
            case 4:
               var10005 = 46;
               break;
            case 5:
               var10005 = 121;
               break;
            default:
               var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
