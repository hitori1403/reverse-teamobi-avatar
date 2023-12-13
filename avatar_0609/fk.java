import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fk extends e8 {
   private static fk z;
   private Image A;
   private Image B;
   private Image C;
   private Image D;
   private g_ E;
   private int F;
   private int G;
   private int H;
   private int I;
   private int J;
   private int K;
   private int L;
   private cn M;
   private boolean N;
   private boolean O;
   private boolean P = false;
   private e8 Q;
   private short R;
   private ag S;
   private ag T;
   private ag U;
   private ag V;
   private Vector W = new Vector();
   private long X = 0L;
   private boolean[] Y;
   private Vector Z;
   static boolean aa;
   static short ab;
   static int ac;
   static long ad;
   private static int ae;
   static boolean af;
   static boolean ag;
   private static final String[] bb;

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\tẘ\u00066Ổq\u0003+<G#I?\u0002)=\u0002\"9\u0002)8\t\u001eẢH=SnV;0";
      int var4 = "\tẘ\u00066Ổq\u0003+<G#I?\u0002)=\u0002\"9\u0002)8\t\u001eẢH=SnV;0".length();
      char var1 = '\r';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     bb = var5;
                     ag = true;
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

                  var2 = "z1V\u00029+";
                  var4 = "z1V\u00029+".length();
                  var1 = 3;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fk g() {
      return z == null ? (z = new fk()) : z;
   }

   public final void b(e8 var1, short var2) {
      this.Q = var1;
      this.R = var2;
      k4.f[5] = false;
      super.d();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.P = true;
            return;
         case 1:
            return;
         case 2:
            this.Q.d();
            fk var4 = this;
            this.O = false;
            super.f = this.S;

            for(int var5 = 0; var5 < 3; ++var5) {
               var4.Y[var5] = false;
            }

            var4.Z.removeAllElements();

            try {
               b(var4.W, GameMidlet.k, 0);
            } catch (Exception var3) {
            }

            ae = 0;
            return;
         case 3:
            aa = false;
            super.f = this.T;
            return;
      }
   }

   public fk() {
      bp.c(hq.ay);
      this.A = bp.b("c");
      String[] var1 = bb;
      this.C = bp.b(var1[3]);
      this.D = bp.b("q");
      this.E = g_.b(var1[1], 11 * ev.a, 11 * ev.a);
      this.B = bp.b(var1[6]);
      bp.b();
      if (k4.o < 200) {
         this.F = 80;
      } else {
         this.F = 90;
      }

      this.M = new cn(k4.o, k4.r);
      this.H = 30;
      this.K = 360 / this.H;
      this.S = new ag(hq.cW, 0);
      this.T = new ag(hq.c, 1);
      this.U = new ag(hq.e, 2);
      this.V = new ag(bb[4], 3);
      super.f = this.S;
      this.J = 90;
      this.Y = new boolean[3];
      this.Z = new Vector();
   }

   private static void b(Vector var0, i3 var1, int var2) {
      try {
         for(int var3 = 0; var3 < var0.size(); ++var3) {
            id var4 = (id)var0.elementAt(var3);
            String var5 = "";
            switch(var4.c) {
               case 1:
                  jv var8 = f5.b(var4.b);
                  hp var9 = f5.d[var8.c];
                  int var10001 = var1.a;
                  int var10002 = var1.b - 50;
                  new b2();
                  k4.b(0, var10001, var10002, b2.b(var9.d * ev.a, var9.e * ev.a, var9.f * ev.a, var9.g * ev.a, f5.b(var9.c).f), var2);
                  break;
               case 2:
                  var5 = "+" + var4.d + hq.D;
                  var1.b(var1.A[0] + var4.d);
                  var2 += 20;
                  break;
               case 3:
                  var5 = "+" + var4.g + bb[5];
                  var1.e(var1.N + var4.g);
                  var2 += 20;
                  break;
               case 4:
                  var5 = "+" + var4.h + hq.E;
                  int[] var6 = var1.A;
                  var1.A[2] += var4.h;
                  var2 += 20;
            }

            if (!var5.equals("")) {
               k4.b(var5, var1.a, var1.b - 50, 1, var2);
            }
         }
      } catch (Exception var7) {
      }
   }

   public final void b() {
      this.Q.b();
      if (this.I > 0) {
         this.G -= this.I;
         if (this.G < 0) {
            this.G += 7200;
         }

         if (this.I < 10) {
            if (this.G / 20 % 30 == 0) {
               this.I = 0;
            }
         } else {
            --this.I;
         }

         if (k4.n % 8 == 4) {
            new b2();
            int var1 = b2.e(this.K);
            int var2;
            if ((var2 = this.G / 20 + var1 * this.H) > 360) {
               var2 -= 360;
            }

            new b2();
            var2 = b2.d(var2);
            int var10000 = this.F;
            new b2();
            var1 = var10000 * b2.c(var2) >> 10;
            var10000 = this.F;
            new b2();
            var2 = -(var10000 * b2.b(var2)) >> 10;
            this.c(this.M.b + var1, this.M.c + var2);
         }
      } else if (this.N) {
         fk var3 = this;
         this.N = false;
         this.O = true;
         this.P = false;
         this.X = System.currentTimeMillis() / 100L;

         for(int var15 = 0; var15 < var3.W.size(); ++var15) {
            id var4 = (id)var3.W.elementAt(var15);
            short var7;
            if (var15 == 0) {
               var7 = 150;
            } else if (var15 == 1) {
               var7 = 180;
            } else {
               var7 = 210;
            }

            new b2();
            var7 = b2.d(var7);
            int var20 = var3.F;
            new b2();
            int var5 = var20 * b2.c(var7) >> 10;
            var20 = var3.F;
            new b2();
            var7 = -(var20 * b2.b(var7)) >> 10;
            var4.e = var3.M.b + var5;
            var4.f = var3.M.c + var7;
         }
      }

      if (super.f == this.T) {
         int var10 = 0;

         for(int var16 = 0; var16 < this.Y.length; ++var16) {
            if (this.Y[var16]) {
               ++var10;
            }
         }

         if (var10 == 3) {
            super.f = this.U;
         }
      }

      for(int var11 = 0; var11 < this.Z.size(); ++var11) {
         is var17;
         is var22 = var17 = (is)this.Z.elementAt(var11);
         var22.a += var17.g;
         if (var17.g > 1 || var17.g < -1) {
            int var10001 = var17.g;
            int var10002 = var17.g;
            new b2();
            var17.g = var10001 - var10002 / b2.f(var17.g);
         }

         var17.b += var17.j;
         ++var17.j;
         ++var17.k;
         if (var17.k > 20) {
            this.Z.removeElement(var17);
         }
      }

      if (this.O) {
         for(int var12 = 0; var12 < this.W.size(); ++var12) {
            if (!this.Y[var12] && System.currentTimeMillis() / 100L - this.X > (long)((var12 + 1) * 5)) {
               this.Y[var12] = true;
               id var18 = (id)this.W.elementAt(var12);
               this.c(var18.e, var18.f);
            }
         }
      }
   }

   private void c(int var1, int var2) {
      for(int var3 = 0; var3 < 10; ++var3) {
         byte var4 = 1;
         if (var3 % 2 == 0) {
            var4 = -1;
         }

         is var5;
         (var5 = new is(var1, var2)).k = 0;
         new b2();
         var5.g = var4 * (b2.e(80) / 10);
         new b2();
         var5.j = -b2.e(70) / 10;
         this.Z.addElement(var5);
      }
   }

   public final void c() {
      if (!this.O) {
         if (k4.aa.e() == 1) {
            if (k4.g) {
               k4.f[5] = true;
            }

            if (k4.h) {
               k4.e[5] = true;
            }
         }

         if (k4.f[5] && !this.N && this.P) {
            if (this.J < 270) {
               this.J += 3;
            }
         } else if (this.J > 90) {
            this.J -= 3;
         }

         if (k4.e[5]) {
            if (this.J > 90 && !this.N && this.P) {
               this.L = this.J;
               ab = this.R;
               ac = this.L - 90;
               aa = true;
               kf.g = false;
               k4.i();
            }

            k4.e[5] = false;
         }
      }

      super.c();
   }

   public final void b(int var1, int var2, Vector var3) {
      if (var1 != GameMidlet.k.f) {
         i3 var4;
         if ((var4 = gx.l(var1)) != null) {
            b(var3, var4, var2 + 100 + 20);
            return;
         }
      } else {
         ++ae;
         super.f = aa ? this.V : this.T;
         this.W = var3;
         this.I = 100 + (this.L - 90);
         this.N = true;
         k4.h();
      }
   }

   public final void h() {
      super.f = aa ? this.V : this.T;
      this.I = 100 + (this.L - 90);
      this.N = true;

      for(int var1 = 0; var1 < 3; ++var1) {
         this.Y[var1] = true;
      }

      k4.h();
   }

   public final void b(Graphics var1) {
      this.Q.a(var1);
      k4.d(var1);
      int var2 = this.G / 20;

      for(int var3 = 0; var3 < this.K; ++var3) {
         int var4;
         if ((var4 = var2 + var3 * this.H) > 360) {
            var4 -= 360;
         }

         if (var4 >= 82 && var4 <= 278) {
            new b2();
            int var5 = b2.d(var4);
            int var10000 = this.F;
            new b2();
            int var6 = var10000 * b2.c(var5) >> 10;
            var10000 = this.F;
            new b2();
            int var7 = -(var10000 * b2.b(var5)) >> 10;
            var1.drawImage(this.B, this.M.b + var6, this.M.c + var7, 3);
         }
      }

      if (this.O) {
         Graphics var8 = var1;
         fk var9 = this;

         for(int var20 = 0; var20 < var9.W.size(); ++var20) {
            if (System.currentTimeMillis() / 100L - var9.X > (long)((var20 + 1) * 5)) {
               id var15;
               switch((var15 = (id)var9.W.elementAt(var20)).c) {
                  case 1:
                     f5.b(var15.b).a(var8, var15.e, var15.f, 3);
                     k4.T.b(var8, var15.i, var15.e - 17, var15.f - 7, 1);
                     break;
                  case 2:
                     k4.T.b(var8, hq.D, var15.e, var15.f - ev.i / 2, 2);
                     k4.T.b(var8, String.valueOf(var15.d), var15.e - 17, var15.f - 8, 1);
                     break;
                  case 3:
                     String[] var10 = bb;
                     k4.T.b(var8, var10[2], var15.e, var15.f - ev.i / 2, 2);
                     k4.T.b(var8, String.valueOf(var15.g), var15.e - 17, var15.f - 8, 1);
                     break;
                  case 4:
                     k4.T.b(var8, hq.E, var15.e, var15.f - ev.i / 2, 2);
                     k4.T.b(var8, String.valueOf(var15.h), var15.e - 17, var15.f - 8, 1);
               }
            }
         }
      }

      int var16 = 0;

      for(int var18 = 0; var18 < this.K; ++var18) {
         int var21;
         if ((var21 = var2 + var18 * this.H) > 360) {
            var21 -= 360;
         }

         if (var21 >= 82 && var21 <= 278) {
            new b2();
            int var25 = b2.d(var21);
            int var36 = this.F;
            new b2();
            int var28 = var36 * b2.c(var25) >> 10;
            var36 = this.F;
            new b2();
            var25 = -(var36 * b2.b(var25)) >> 10;
            long var30 = System.currentTimeMillis() / 100L - this.X;
            if (!this.O || var21 < 150 || var21 > 210 || var30 <= (long)((var16 + 1) * 5) && var30 > (long)((var16 + 1) * 5 - 5)) {
               var1.drawImage(this.D, this.M.b + var28, this.M.c + var25, 3);
            } else {
               ++var16;
            }

            var1.drawImage(this.A, this.M.b + var28, this.M.c + var25, 3);
         }
      }

      var1.drawRegion(this.C, 0, 0, 64, 62, 0, this.M.b, this.M.c, 40);
      var1.drawRegion(this.C, 0, 0, 64, 62, 1, this.M.b, this.M.c, 24);
      new b2();
      int var22 = b2.d(this.J);
      int var38 = this.F / 3 + 2;
      new b2();
      int var27 = var38 * b2.c(var22) >> 10;
      var38 = this.F / 3 + 2;
      new b2();
      int var29 = -(var38 * b2.b(var22)) >> 10;
      if ((var2 = this.J + 90) > 360) {
         var2 -= 360;
      }

      new b2();
      var2 = b2.d(var2);
      new b2();
      var22 = 6 * b2.c(var2) >> 10;
      new b2();
      var2 = -(6 * b2.b(var2)) >> 10;
      int var31;
      if ((var31 = this.J - 90) < 0) {
         var31 += 360;
      }

      new b2();
      var31 = b2.d(var31);
      new b2();
      int var34 = 6 * b2.c(var31) >> 10;
      new b2();
      var31 = -(6 * b2.b(var31)) >> 10;
      var1.setColor(14483456);
      var1.fillTriangle(this.M.b + var27, this.M.c + var29, this.M.b + var22, this.M.c + var2, this.M.b + var34, this.M.c + var31);
      var1.fillRoundRect(this.M.b - 6, this.M.c - 6, 12, 12, 12, 12);
      if (this.O || this.I > 0) {
         Graphics var17 = var1;
         fk var14 = this;

         for(int var19 = 0; var19 < var14.Z.size(); ++var19) {
            is var24 = (is)var14.Z.elementAt(var19);
            var14.E.b(var24.k / 5, var24.a, var24.b, 0, 3, var17);
         }
      }

      k4.T.b(var1, bb[0] + ae, k4.q, 14, 2);
      super.b(var1);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '#');
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
               var10005 = 73;
               break;
            case 2:
               var10005 = 38;
               break;
            case 3:
               var10005 = 90;
               break;
            case 4:
               var10005 = 115;
               break;
            case 5:
               var10005 = 31;
               break;
            default:
               var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
