import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e7 extends e4 {
   public static e7 n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private Vector t = new Vector();
   private Vector u = new Vector();
   private Hashtable v;
   private String w = "";
   private String x = "";
   private int y = 5;
   private int z = 5;
   private int A = 30;
   private byte B;
   private static int C;
   private static int D;
   private static int E;
   private static int F;
   private static int G;
   private static int H;
   private static int I = 14;
   private long J;
   private int K = 0;
   private int L = 0;
   private boolean M = false;
   private int N;
   private int O;
   private int P;
   private int Q;
   private static final String R;

   static {
      String var10002 = b(a("1\u0012\u0000"));
      boolean var10001 = true;
      R = var10002;
   }

   public static e7 e() {
      return n == null ? (n = new e7()) : n;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.t.removeAllElements();
            this.u.removeAllElements();
            this.v.clear();
            k4.D = null;
            k4.h();
            n = null;
            return;
         case 1:
            hx.b().c(this.B);
      }
   }

   public e7() {
      this.f();
      super.g = new ag(hq.e, 0);
      I = ev.h;
   }

   private void f() {
      this.r = k4.o - 20;
      this.s = k4.p - k4.ab - 20;
   }

   public final void g() {
      this.f();
      this.b(this.v, this.w, this.x, this.B);
   }

   private void b(String var1) {
      int var2;
      while((var2 = var1.indexOf("Ę")) != -1) {
         String var3 = var1.substring(0, var2);
         this.b(var3, "");
         if ((var2 = (var1 = var1.substring(var2 + 1)).indexOf("\n")) == true) {
            this.b(var1, "Ę");
            return;
         }

         var3 = var1.substring(0, var2);
         this.b(var3, "Ę");
         var1 = var1.substring(var2 + 1);
         this = this;
      }

      this.b(var1, "");
   }

   private void b(String var1, String var2) {
      while(!var1.equals("")) {
         int var3;
         if ((var3 = var1.indexOf("ę")) != -1) {
            String var4;
            if (!(var4 = var1.substring(0, var3)).equals("")) {
               this.b(var4, var2, 0);
            }

            int var7 = Integer.parseInt(var1.substring(var3 + 1, var3 + 2));
            if ((var3 = (var1 = var1.substring(var3 + 2, var1.length())).indexOf("\n")) != true) {
               this.b(var1.substring(0, var3), var2, var7);
               var1 = var1.substring(var3 + 1);
               this = this;
               continue;
            }

            this.b(var1, var2, var7);
            return;
         }

         this.b(var1, var2, 0);
         return;
      }
   }

   private void b(String var1, String var2, int var3) {
      boolean var4 = false;
      String[] var5;
      if (var1.indexOf(R) != -1) {
         var4 = true;
         var5 = k4.V.b(var1, this.r - 30 - 8 * ev.a);
      } else {
         var5 = k4.S.b(var1, this.r - 30 - 8 * ev.a);
      }

      for(int var6 = 0; var6 < var5.length; ++var6) {
         int var7;
         if (var4) {
            var7 = k4.V.b(var5[var6]);
         } else {
            var7 = k4.S.b(var5[var6]);
         }

         if (var7 > this.K) {
            this.K = var7;
         }

         in var8;
         (var8 = new in(this.y, this.z += I, var2 + var5[var6])).m = var3;
         this.t.addElement(var8);
      }
   }

   public final void b(Hashtable var1, String var2, String var3, byte var4) {
      this.O = 0;
      super.f = null;
      if (var4 != -1) {
         super.f = new ag(hq.P, 1);
      }

      this.B = var4;
      this.K = 0;
      this.A = k4.S.b(var2) + 20 * ev.a;
      if (this.A < 50 + 20 * ev.a) {
         this.A = 50 + 20 * ev.a;
      }

      this.v = var1;
      this.w = var2;
      this.x = var3;
      this.t.removeAllElements();
      this.u.removeAllElements();
      boolean var9 = false;
      this.y = 0;
      this.z = -10;

      label97:
      while((var10 = var3.indexOf("µ")) != -1) {
         String var16 = var3.substring(0, var10);
         var3 = var3.substring(var10 + 1, var3.length());
         if (var9) {
            int var11 = var16.indexOf(",");
            String var5 = var16.substring(0, var11);
            String var17;
            int var12 = (var17 = var16.substring(var11 + 1, var16.length())).indexOf(",");
            int var6 = Integer.parseInt(var17.substring(0, var12));
            boolean var13 = Integer.parseInt(var17.substring(var12 + 1, var17.length())) != 0;
            Image var18 = (Image)this.v.get(var5);
            byte var7 = 0;
            if (var6 == 17) {
               var7 = 1;
            } else if (var6 == 24) {
               var7 = 2;
            }

            j_ var19 = new j_(Integer.parseInt(var5), var7, this.z + I + 5, var6);
            var18.getWidth();
            var19.f = var18.getHeight();
            if (var13) {
               j_ var14 = (j_)this.u.elementAt(this.u.size() - 1);
               var6 = ((Image)this.v.get(String.valueOf(var14.e))).getHeight();
               if (var18.getHeight() > var6) {
                  var14.c += var18.getHeight() - var6;
               }

               var19.c = var14.c + var6 - var18.getHeight();
            }

            this.z = var19.c + var18.getHeight() - 10;
            this.u.addElement(var19);
            var16 = "";
         }

         var9 = !var9;

         while(true) {
            while((var15 = var16.indexOf("¶")) == -1) {
               if (!var16.equals("")) {
                  this.b(var16.substring(0, var16.length() - 1));
               }

               if (var3.indexOf("µ") != -1 || var3.indexOf("¶") == -1) {
                  continue label97;
               }

               var16 = var3;
               var3 = "";
            }

            String var20 = var16.substring(0, var15);
            var16 = var16.substring(var15 + 1, var16.length());

            try {
               Integer.parseInt(var20, 16);
               this.b("¶".concat(String.valueOf(var20)));
               this.z -= I / 2;
            } catch (Exception var8) {
               this.b(var20);
            }
         }
      }

      this.b(var3);
      this.p = 9 * ev.a;
      if (this.K < 140 * ev.a) {
         this.K = 140 * ev.a;
      }

      if (this.K >= 120 && this.K < this.r - 30) {
         this.r = this.K + 20 * ev.a;
         this.p = 10 * ev.a;
      }

      if (this.z + 10 + (I << 1) < this.s - 30) {
         this.s = this.z + 10 + (I << 1) + 20;
      }

      if (this.s < 80 * ev.a + e8.v) {
         this.s = 80 * ev.a + e8.v;
      }

      if ((G = this.z - (this.s - ib.t - 2 * ev.b - (I << 1))) < 0) {
         G = 0;
      }

      C = 0;
      D = 0;
      this.o = (k4.o - this.r) / 2;
      this.q = (k4.p - k4.ab - this.s) / 2;
      this.J = System.currentTimeMillis();
   }

   public final void c() {
      if (System.currentTimeMillis() - this.J >= 1000L) {
         this.J = System.currentTimeMillis();
      }

      ++this.O;
      boolean var1 = false;
      if (H != 0) {
         H += -H >> 1;
      }

      if (H == -1) {
         H = 0;
      }

      if (k4.i && k4.d(this.o, this.q, this.r, this.s) && !this.M) {
         this.L = D;
         this.M = true;
         this.N = 0;
      }

      if (this.M) {
         int var2 = k4.l();
         if (k4.g) {
            if (k4.n % 3 == 0) {
               this.Q = k4.k;
               this.P = this.O;
            }

            C = this.L + var2;
            this.N = 0;
            if (C < 0 || C > G) {
               C = this.L + var2 / 2;
            }

            D = C;
         }

         if (k4.h) {
            this.M = false;
            int var3 = this.O - this.P;
            int var4;
            if (b2.f(var4 = this.Q - k4.k) > 40 && var3 < 10 && C > 0 && C < G) {
               this.N = var4 / var3 * 10;
            }

            this.P = -1;
            if (Math.abs(var2) < 10) {
               C = this.L + var2;
            }
         }
      }

      if (k4.f[2]) {
         C -= 14;
         var1 = true;
      } else if (k4.f[8]) {
         var1 = true;
         C += 14;
      }

      if (var1) {
         if (C < 0) {
            C = 0;
         }

         if (C > G) {
            C = G;
         }
      }

      if (this.N != 0) {
         if (D < 0 || D > G) {
            this.N -= this.N / 4;
            D += this.N / 20;
            if (this.N / 10 <= 1) {
               this.N = 0;
            }
         }

         if (D < 0) {
            if (D < -this.s / 2) {
               D = -this.s / 2;
               C = 0;
               this.N = 0;
            }
         } else if (D > G) {
            if (D < G + this.s / 2) {
               D = G + this.s / 2;
               C = G;
               this.N = 0;
            }
         } else {
            D += this.N / 10;
         }

         C = D;
         this.N -= this.N / 10;
         if (this.N / 10 == 0) {
            this.N = 0;
         }
      } else if (D < 0) {
         C = 0;
      } else if (D > G) {
         C = G;
      }

      if (D != C) {
         F = C - D << 2;
         E += F;
         D += E >> 4;
         E &= 15;
      }

      super.c();
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      k4.aa.b(var1, this.o, this.q, this.s, this.r, 0, 0, ib.b().l, this.A, ib.t, 1, 1, ib.b().r, ib.b().q, this.w);
      var1.setClip(this.o + 4, this.q + ib.t + 4 * ev.a, this.r - 8, this.s - ib.t - 8 * ev.a);
      var1.translate(this.o + this.p, this.q + ib.t);
      var1.translate(0, -D);
      var1.setColor(0);

      for(int var2 = 0; var2 < this.t.size(); ++var2) {
         in var3;
         if ((var3 = (in)this.t.elementAt(var2)).b > D - 10 && var3.b < D + this.s) {
            if (var3.h.length() > 2 && var3.h.substring(0, 1).equals("¶")) {
               int var8 = Integer.parseInt(var3.h.substring(1, var3.h.length()), 16);
               ib.b(var3.a, var3.b, k4.o - (var3.a << 1), 1, var8, var1);
            } else {
               int var4 = var3.a;
               if (var3.m == 2) {
                  var4 += (this.r - 30) / 2 + 4;
               } else if (var3.m == 1) {
                  var4 += this.r - 30 + 10;
               }

               if (var3.h.length() > 2 && var3.h.substring(0, 1).equals("Ę")) {
                  k4.V.b(var1, var3.h.substring(1, var3.h.length()), var4, var3.b, var3.m);
               } else if (var3.h.length() > 1 && var3.h.substring(0, 1).equals("0")) {
                  var1.setColor(8654855);
                  int var5 = k4.U.b(var3.h.substring(1)) + 20;
                  var1.fillRect(var4 - var5 / 2, var3.b + ev.j / 2 - ev.k / 2 - 1, var5, k4.U.b());
                  k4.U.b(var1, var3.h.substring(1), var4, var3.b + ev.j / 2 - ev.h / 2, var3.m);
               } else {
                  k4.S.b(var1, var3.h, var4, var3.b, var3.m);
               }
            }
         }
      }

      for(int var6 = 0; var6 < this.u.size(); ++var6) {
         j_ var7;
         if ((var7 = (j_)this.u.elementAt(var6)).c + var7.f > D && var7.c < D + this.s) {
            var1.drawImage((Image)this.v.get(String.valueOf(var7.e)), var7.b * ((this.r - (this.p << 1)) / 2), var7.c, var7.d);
         }
      }

      super.b(var1);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'x');
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
               var10005 = 69;
               break;
            case 1:
               var10005 = 119;
               break;
            case 2:
               var10005 = 109;
               break;
            case 3:
               var10005 = 122;
               break;
            case 4:
               var10005 = 65;
               break;
            case 5:
               var10005 = 61;
               break;
            default:
               var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
