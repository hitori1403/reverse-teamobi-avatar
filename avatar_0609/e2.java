import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class e2 extends ex {
   private Vector n;
   private String o = "";
   private Vector p = new Vector();
   private int q = 0;
   private int r;
   private int s;
   private int t;
   private int u;
   public boolean v = false;
   private int w = 0;
   private int x = 0;
   private int y;
   private int z;
   private int A = 0;
   private int B = 0;
   private int C;
   public static g_ D;
   private long E = -1L;
   private long F;
   private long G;
   private int H = 0;
   private static long I;
   private static final String[] J;

   public e2() {
      this.y = ev.h;
   }

   public final void b(String var1, ag var2, Vector var3) {
      if (e3.p) {
         e3 var4;
         (var4 = e3.e()).o.b("");
         e3.p = false;
         var4.o.b(true);
         if (fp.O && fa.I) {
            fa.I = false;
            fa.g().D[4] = 0;
            k4.b.c();
         }
      }

      String[] var5 = J;
      if (var1.indexOf(var5[0]) != -1) {
         DeCaptcha.b().c();
      }

      if (!var1.equals(hq.Z) || System.currentTimeMillis() - I >= 3000L) {
         if (var1.indexOf(J[1]) != -1) {
            I = System.currentTimeMillis();
         }

         this.C = e8.x;
         this.v = false;
         this.o = var1;
         super.f = var2;
         this.q = 0;
         this.p = var3;
         if (var3 != null) {
            ag var6 = (ag)var3.elementAt(this.q);
            super.f = var6;
            if (var6 != null) {
               super.f.c = var6.c;
               super.f.d = var6.d;
               super.f.e = var6.e;
            }

            this.H = 0;

            for(int var7 = 0; var7 < var3.size(); ++var7) {
               var2 = (ag)var3.elementAt(var7);
               if (k4.S.b(var2.b) > this.H) {
                  this.H = k4.S.b(var2.b) + (k4.M ? this.r / 3 : 0);
               }
            }
         } else {
            this.G = System.currentTimeMillis() / 100L;
         }

         this.x = 0;
         if (this.p != null) {
            this.x = this.p.size();
         }

         this.w = 0;
         this.E = -1L;
         this.d();
         k4.y = k4.v;
      }
   }

   public final void d() {
      this.r = k4.o - 80;
      if (k4.o < 200) {
         this.r = k4.o - 40;
         if (k4.o <= 128) {
            this.r = k4.o - 10;
         }
      }

      if (this.o.equals(hq.c)) {
         this.r = k4.q;
      }

      this.n = k4.U.c(this.o, this.r - 16);
      this.s = this.n.size() * this.y + 20;
      this.z = 0;
      if (super.f != null) {
         this.s += this.C + 15 * ev.a;
         this.z += this.C + 15 * ev.a;
      }

      if (this.s < this.C * 3 + (ev.a - 1) * 15) {
         this.s = this.C * 3 + (ev.a - 1) * 15;
      }

      this.t = k4.q - this.r / 2;
      this.u = k4.s - k4.ab - this.s - 10;
   }

   public final void b(boolean var1) {
      this.v = (boolean)var1;
      this.s = this.n.size() * this.y + 20;
      if (this.v) {
         this.s += 25 * ev.a + 4;
         this.z += 25 * ev.a + 4;
      }

      var1 = this.C * 3 + (ev.a - 1) * 15;
      if (this.s < var1) {
         this.s = var1;
      }

      this.u = k4.s - k4.ab - this.s - 10;
      this.F = (long)k4.j();
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      if (System.currentTimeMillis() / 100L - this.G >= 5L) {
         k4.aa.b(var1, this.t, this.u, this.r, this.s, ib.e[0], ib.e[1], 0);
         if (super.f != null) {
            ib.b(this.t + 1, this.u + this.s - (this.C + 15 * ev.a - 4), this.r - 2, this.C, 15530985, var1);
         }

         if (this.v) {
            D.b(
               this.w,
               this.t + this.r / 2,
               this.u + 4 + (this.s - this.z) / 2 + this.n.size() * ev.h / 2 + (this.s - (4 + (this.s - this.z) / 2 + this.n.size() * ev.h / 2)) / 2,
               0,
               3,
               var1
            );
         }

         if (this.x > 0) {
            ag var2 = (ag)this.p.elementAt(this.q);
            k4.S.b(var1, var2.b, k4.q, this.u + this.s - (this.C + 15 * ev.a - 4) + this.C / 2 - ev.j / 2, 2);
            if (this.x > 1) {
               k4.aa
                  .c(
                     var1,
                     k4.q - this.H / 2 - 11,
                     (k4.ah != 2 ? ev.j / 2 : 0) + this.u + this.s - (this.C + 15 * ev.a - 4) + e8.x / 2 + 1 + (k4.ah == 1 ? -7 : 0) + (k4.ah == 0 ? -3 : 0),
                     17 + this.H,
                     this.A / 3,
                     this.B / 3
                  );
            }
         } else if (super.f != null) {
            k4.S.b(var1, super.f.b, k4.q, this.u + this.s - (this.C + 15 * ev.a - 4) + this.C / 2 - ev.j / 2, 2);
         }

         for(int var3 = 0; var3 < this.n.size(); ++var3) {
            k4.U.b(var1, (String)this.n.elementAt(var3), k4.q, this.u + 4 + (this.s - this.z) / 2 - this.n.size() * ev.h / 2 + var3 * ev.h, 2);
         }
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case -2:
            AutoController.h();
            AutoController.h().z();
            return;
         case -1:
            this.v = false;
            k4.y = null;
            return;
         default:
            k4.u.b(var1, var2);
      }
   }

   private void c(int var1) {
      if (this.x > 0) {
         this.q += var1;
         if (this.q < 0) {
            this.q = this.x - 1;
         }

         if (this.q >= this.x) {
            this.q = 0;
         }

         ag var2 = (ag)this.p.elementAt(this.q);
         super.f = var2;
      }
   }

   public final void c() {
      if (this.v) {
         ++this.w;
         if (this.w >= 8) {
            this.w = 0;
         }

         if ((long)k4.j() - this.F > 30L) {
            String var1 = "";

            for(int var2 = 0; var2 < this.n.size(); ++var2) {
               var1 = var1 + (String)this.n.elementAt(var2) + " ";
            }

            k4.b(var1, -2, null);
         }
      }

      if (this.E != -1L && System.currentTimeMillis() / 100L - this.E > 0L) {
         k4.d[5] = true;
      }

      if (this.A > 0) {
         --this.A;
      }

      if (this.B > 0) {
         --this.B;
      }

      if (k4.d(4)) {
         this.c(-1);
         this.A = 5;
      } else if (k4.d(6)) {
         this.c(1);
         this.B = 5;
      }

      label60:
      if (k4.h) {
         int var3 = 0;
         if (this.p != null && this.p.size() > 0) {
            ag var5 = (ag)this.p.elementAt(this.q);
            var3 = k4.S.b(var5.b) + 20;
         } else if (super.f != null) {
            var3 = k4.S.b(super.f.b) + 20;
         }

         var3 *= ev.a;
         if (super.f != null && k4.d(k4.q - var3 / 2, this.u + this.s - (this.C + 18 * ev.a - 4), var3, this.C)) {
            k4.h();
            this.b(super.f);
         } else {
            if (!k4.d(this.t + 1, this.u + this.s - (this.C + 18 * ev.a - 4), this.r - 2, this.C)) {
               break label60;
            }

            int var6;
            if ((var6 = k4.q - k4.j) > var3 / 2) {
               this.c(-1);
               this.A = 5;
            } else if (var6 < -var3 / 2) {
               this.c(1);
               this.B = 5;
            }
         }

         k4.h = false;
      }

      super.c();
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ỹf\\ŎẂ\u007f:KỠ\\3&ớo\u001bMẮ\u0012\u007fŞğtH/\u00127Ợl:Yï\u0013\u007f;túAg\\/'ọ";
      int var4 = "Ỹf\\ŎẂ\u007f:KỠ\\3&ớo\u001bMẮ\u0012\u007fŞğtH/\u00127Ợl:Yï\u0013\u007f;túAg\\/'ọ".length();
      char var1 = 14;
      int var0 = -1;

      while(true) {
         String var10002 = b(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            J = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   private static String b(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 47;
               break;
            case 1:
               var10005 = 15;
               break;
            case 2:
               var10005 = 124;
               break;
            case 3:
               var10005 = 95;
               break;
            case 4:
               var10005 = 79;
               break;
            case 5:
               var10005 = 28;
               break;
            default:
               var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
