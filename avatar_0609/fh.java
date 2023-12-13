import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fh extends e8 {
   public static fh z;
   public static g_ A;
   Vector B;
   public static String C;
   int D;
   private int E;
   private ag F;
   private ag G;
   int H = 0;
   private static final String I;

   public static fh g() {
      if (z == null) {
         z = new fh();
      }

      return z;
   }

   public final void d() {
      k4.aa.i();
      super.d();
      super.g = this.G;
      if (k4.ah == 0) {
         super.f = new ag(hq.P, 3);
      } else {
         super.f = new ag(hq.j, 1);
      }

      super.l = true;
      this.h();
      fp.g();
      this.D = this.H;
      k4.B.b(this.D);
   }

   public fh() {
      this.h();
      this.a();
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 1:
            k4.i();
            h1.b().d();
            return;
         case 2:
            k4.i();
            h1.b().c();
            return;
         case 3:
            k4.i();
            hx.b().d(GameMidlet.k.f);
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            Vector var3;
            (var3 = new Vector()).addElement(new ag(hq.j, 1));
            var3.addElement(new ag(hq.g, 2));
            if (k4.ah == 0) {
               var3.addElement(AutoController.h().F);
            }

            var3.addElement(new ag(hq.an, 3));
            f1.d().b(var3, 0);
            return;
         case 1:
            this.i();
            return;
         case 2:
            hx.b().g(9);
            k4.i();
            return;
         case 3:
            this.i();
      }
   }

   public final void a() {
      this.F = new ag(hq.d, 0);
      new ag(hq.P, 1);
      this.G = new ag(hq.e, 2);
      super.e = this.F;
      super.g = this.G;
   }

   public static void b(int var0, ft var1) {
      if (!fp.O) {
         C = hq.dA[var0];
      } else {
         C = hq.dP[var0];
      }

      h3.f = var1;
   }

   public final void h() {
      if (k4.ah == 0) {
         this.E = 50;
         this.H = 1;
      } else {
         if (k4.ah == 1) {
            this.E = 80;
         } else if (k4.ah == 2) {
            this.E = 150;
         }

         this.H = k4.o / this.E;
      }

      if (this.B != null) {
         if (this.E != 0) {
            if (k4.ah == 0) {
               k4.B
                  .b(
                     0,
                     k4.o < 200 ? this.E / 2 : 50,
                     k4.o,
                     this.E,
                     k4.o,
                     this.B.size() * this.E,
                     k4.o,
                     k4.p - (k4.o < 200 ? this.E / 2 : 50) - 4,
                     this.B.size()
                  );
            } else {
               k4.B
                  .b(
                     (k4.o - this.E * this.H) / 2,
                     50 * ev.a,
                     this.E,
                     this.E,
                     k4.o,
                     (this.B.size() / this.H + 2) * this.E,
                     k4.o,
                     k4.p - 50 * ev.a - 4,
                     this.B.size()
                  );
            }

            k4.B.b(this.D);
         }
      }
   }

   private void i() {
      byte var1;
      if ((var1 = ((b8)this.B.elementAt(this.D)).b) != true) {
         h1.b().b(var1);
         k4.i();
      }
   }

   public final void b(Graphics var1) {
      this.a(var1);
      fp.b(var1, super.e, super.f, super.g);
      k4.c(var1);
   }

   public final void a(Graphics var1) {
      k4.aa.c(var1);
      b(var1, I + C);
      k4.aa.b(var1, this.B, this.E, this.D);
   }

   public static void b(Graphics var0, String var1) {
      k4.aa.c(var0);
      if (k4.o > 200) {
         k4.aa.e(var0, k4.q - 100 * ev.a, 5 * ev.a - g5.r, 200 * ev.a, 44 * ev.a);
         c9 var2 = k4.W;
         if (k4.ah == 0) {
            var2 = k4.T;
         }

         var2.b(var0, var1, k4.q, 5 * ev.a - g5.r + 22 * ev.a - var2.b() / 2, 2);
      }
   }

   public final void b(int var1, boolean var2) {
      if (var2 && this.D == var1) {
         this.i();
      }

      if (k4.ah == 0) {
         if (this.D > 0 && this.D < this.B.size()) {
            b8 var3;
            if ((var3 = (b8)this.B.elementAt(var1)).b != -1 && var3.b != -1) {
               if (var1 >= 0 && var1 < this.B.size()) {
                  this.D = var1;
               }
            } else if (var1 > this.D) {
               this.D = var1 + this.H;
            } else {
               this.D = var1 - this.H;
            }

            k4.B.b(this.D);
            if (this.D <= 0) {
               this.D = this.B.size() - 1;
               k4.B.b(this.D);
               return;
            }
         }
      } else {
         this.D = var1;
      }
   }

   public final void c() {
      if (k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }

   public final void b() {
   }

   static {
      String var10002 = c(a(">\u001bð_eC"));
      boolean var10001 = true;
      I = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'k');
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
               var10005 = 110;
               break;
            case 1:
               var10005 = 115;
               break;
            case 2:
               var10005 = 2;
               break;
            case 3:
               var10005 = 49;
               break;
            case 4:
               var10005 = 2;
               break;
            case 5:
               var10005 = 99;
               break;
            default:
               var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
