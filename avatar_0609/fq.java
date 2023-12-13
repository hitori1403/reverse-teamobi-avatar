import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fq extends e8 {
   public static fq z;
   private Vector A;
   private int B = 0;
   private int C = 0;
   private e8 D;
   private ag E;
   private ag F;
   private ag G;
   private Image H;
   private int I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private static final String[] P;

   public static fq g() {
      if (z == null) {
         z = new fq();
      }

      return z;
   }

   public final void b(e8 var1) {
      this.h();
      this.C = 0;
      super.t = 0;
      this.D = var1;
      this.a();
      super.d();
   }

   public final void h() {
      if (this.H == null) {
         bp.c(hq.av);
         this.H = bp.b(P[3]);
         bp.b();
      }

      String var1;
      if (gx.b == 25) {
         this.B = 1;
         var1 = hq.dK[1];
         h2.b().f(0, 0);
         k4.i();
      } else {
         var1 = hq.dK[0];
         this.B = 0;
      }

      this.j();
      ib.b().b(var1, this.K, this.L, 2);
      if (fp.O) {
         ib.b().i = 25 + e8.n + 1;
      }

      this.J = ib.b().i;
      this.i();
   }

   public final void b(int var1, boolean var2) {
      if (var2 && super.t == var1) {
         if (super.f != null) {
            super.f.a();
         } else if (super.e != null) {
            super.e.a();
         }
      }

      super.b(var1, var2);
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            k4.B.w = false;
            this.D.d();
            this.H = null;
            return;
         case 1:
         case 2:
            if (this.B == 0) {
               es var12;
               if ((var12 = (es)this.A.elementAt(super.t)).d.indexOf(hq.aI) != -1) {
                  String var19 = k4.S.b(var12.d, hq.aJ, GameMidlet.k.g);
                  k4.b(hq.cm, new bx(var19));
                  return;
               }

               String[] var7 = P;
               if (var12.d.indexOf(var7[4]) != -1) {
                  String var16 = var12.d.substring(0, var12.d.indexOf(var7[5]) + 7);
                  var16 = k4.S.b(var12.d, var16, "");
                  String var18 = var12.b;
                  cs[] var4;
                  (var4 = new cs[2])[0] = new cs();
                  var4[1] = new cs();
                  cs var22 = var4[0];
                  byte var6 = 0;
                  var22.z = var6;
                  var22 = var4[1];
                  var6 = 1;
                  var22.z = var6;
                  e5.e().b(var4, var18, hq.dX, new ag(hq.b_, new bw(this, var16, var4)));
                  k4.D = e5.e();
                  return;
               }

               var7 = P;
               if (var12.d.indexOf(var7[1]) != -1) {
                  String var3 = var12.d.substring(0, var12.d.indexOf(var7[0]) + 10);
                  var3 = k4.S.b(var12.d, var3, "");
                  h4 var11;
                  (var11 = h4.b()).a((byte)-76);
                  var11.a(var3);
                  var11.a();
                  k4.i();
                  return;
               }

               k4.i();
               hx var10000 = hx.b();
               String var13 = var12.c;
               hx var10 = var10000;
               var10000.a((byte)-91);
               var10.a(var13);
               var10.a();
               return;
            }

            k4.x.b(hq.az, 100, 1);
            return;
         case 100:
            try {
               if (k4.x.d().equals("")) {
                  return;
               }

               var1 = Integer.parseInt(k4.x.d());
               h2.b().f(var1, super.t == 0 ? 1 : 0);
               k4.i();
               return;
            } catch (Exception var8) {
            }
      }
   }

   public final void a() {
      this.E = new ag(hq.dK[0], 1);
      super.e = this.E;
      this.F = new ag(hq.P, 2);
      super.f = this.F;
      this.G = new ag(hq.e, 0);
      super.g = this.G;
   }

   public fq() {
      new cn(0, 1);
      this.N = 0;
      this.O = -1;
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      if (fp.O) {
         k4.aa.c(var1);
         k4.aa.b(var1, hq.bR.toUpperCase(), GameMidlet.k.A[0] + hq.D, GameMidlet.k.A[2] + hq.E);
      } else if (this.D != null) {
         this.D.a(var1);
      }

      if (e5.n == null || k4.D != e5.n) {
         if (!fp.O) {
            ib.b().b(var1);
            var1.translate(0, this.J + ib.t + ev.b);
            var1.setClip(this.I + 5, 0, this.K - 10, ib.b().f - ib.t - 2 * ev.b);
         } else {
            var1.translate(0, this.J);
            var1.setClip(this.I + 5, 0, this.K - 10, this.L);
         }

         if (this.C == 1) {
            int var2 = (this.L - ib.t + (ev.b << 1)) / 6;
            k4.V.b(var1, hq.aB + GameMidlet.k.g, this.I + this.K / 2, var2 / 2, 2);
            if (!fj.ae) {
               k4.V.b(var1, hq.aK + P[2] + GameMidlet.k.C, this.I + this.K / 2, var2 / 2 + var2, 2);
            }

            k4.V.b(var1, GameMidlet.k.A[2] + hq.E, this.I + this.K / 2, var2 / 2 + (var2 << 1), 2);
            if (fj.ae) {
               k4.V.b(var1, AutoController.w(), this.I + this.K / 2, var2 / 2 + var2 * 3, 2);
            }
         } else {
            var1.translate(0, -g5.r);
            if (this.B == 0) {
               Graphics var3 = var1;
               fq var8 = this;
               int var4 = this.H.getWidth() + 14;
               int var5 = this.A.size();

               for(int var6 = 0; var6 < var5; ++var6) {
                  if (var6 == var8.t && !var8.l) {
                     if (fp.O) {
                        var3.setColor(14328855);
                        var3.fillRect(var8.I, var6 * var8.M, var8.K - 3 * ev.a, var8.M);
                     } else {
                        k4.aa.c(var3, var8.I + 6, var6 * var8.M, var8.K - 6 * ev.a, var8.M);
                     }
                  }

                  var3.drawImage(var8.H, var8.I + var4 / 2, var6 * var8.M + var8.M / 2, 3);
               }

               for(int var12 = 0; var12 < var5; ++var12) {
                  es var7 = (es)var8.A.elementAt(var12);
                  var3.setClip(var8.I + var4 - 3, g5.r, var8.K - var4 - 2, var8.L - (!fp.O ? ib.t + 2 * ev.b : 0));
                  k4.S.b(var3, var7.b, var8.I + var4, var12 * var8.M + var8.M / 2 - ev.j / 2, 0);
               }
            } else {
               Graphics var10 = var1;
               fq var9 = this;

               for(int var11 = 0; var11 < 2; ++var11) {
                  if (!var9.l && var11 == var9.t) {
                     k4.aa.c(var10, var9.I + 3 * ev.a, var11 * var9.M + 5, var9.K - 6 * ev.a, var9.M);
                  }

                  k4.S.b(var10, hq.dL[var11], var9.I + 10 + (var9.t == var11 ? var9.N : 0), var11 * var9.M + 5 + var9.M / 2 - ev.j / 2, 0);
               }
            }
         }

         if (k4.H == null || !ew.y) {
            super.b(var1);
         }

         k4.b(var1);
      }
   }

   public final void b(Vector var1) {
      this.j();
      this.A = var1;
      this.i();
      this.N = 0;
   }

   private void i() {
      if (this.A != null) {
         this.A.size();
         int var1 = this.A.size() * this.M;
         int var2 = this.A.size();
         if (gx.b == 25) {
            var1 = this.M << 1;
            var2 = 2;
         }

         k4.B.b(this.I, this.J + (!fp.O ? ib.t + ev.b : 0), this.K, this.M, this.K, var1, this.K, this.L - (ib.t + 2 * ev.b) - ev.b, var2);
      }
   }

   private void j() {
      if (fp.O) {
         this.K = k4.o + 8;
         this.L = k4.p - 25 - e8.n + (ev.b << 1);
      } else {
         this.K = fi.g().R;
         this.L = fi.g().S;
      }

      this.M = e8.x;
      this.I = k4.q - this.K / 2;
   }

   public final void c() {
      super.c();
      if (!fp.O) {
         if (k4.d[4] || k4.d[6]) {
            this.k();
         }

         if (k4.i && k4.d(0, ib.b().i, k4.o, ib.t)) {
            k4.i = false;
            this.k();
         }
      }
   }

   private void k() {
      String var1;
      if (this.C == 0) {
         this.C = 1;
         super.e = null;
         var1 = hq.dK[2];
      } else {
         if (this.B == 1) {
            var1 = hq.dK[1];
         } else {
            var1 = hq.dK[0];
         }

         this.C = 0;
      }

      ib.b().b(var1, this.C);
   }

   public final void a(int var1) {
   }

   public final void b() {
      if (this.D != null) {
         this.D.b();
      }

      int var2;
      if (this.B == 0) {
         es var1 = (es)this.A.elementAt(super.t);
         var2 = k4.S.b(var1.b);
      } else {
         var2 = k4.S.b(hq.dL[super.t]);
      }

      if (var2 > this.K - 20) {
         this.N += this.O;
         if (this.N <= -(var2 - (this.K - 30))) {
            this.O = 1;
         }

         if (this.N > 0) {
            this.O = -1;
         }
      } else {
         this.N = 0;
      }

      if (this.C == 0) {
         if (gx.b != 25) {
            super.e = this.E;
            super.f = null;
         } else {
            super.e = null;
            super.f = this.F;
         }
      } else {
         super.e = null;
         super.f = null;
      }
   }

   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "l\u0014P5'\f,^\u0001\u0018\nl\u0014P5'\f,^\u0001\u0018\u0002\u0005Q\u0004\\\u001eK-";
      int var4 = "l\u0014P5'\f,^\u0001\u0018\nl\u0014P5'\f,^\u0001\u0018\u0002\u0005Q\u0004\\\u001eK-".length();
      char var1 = '\n';
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
                     P = var5;
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

                  var2 = "Q\u0010R7*\u001bX\u0007Q\u0010R7*\u001bX";
                  var4 = "Q\u0010R7*\u001bX\u0007Q\u0010R7*\u001bX".length();
                  var1 = 7;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'b');
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
               var10005 = 63;
               break;
            case 1:
               var10005 = 113;
               break;
            case 2:
               var10005 = 34;
               break;
            case 3:
               var10005 = 67;
               break;
            case 4:
               var10005 = 66;
               break;
            case 5:
               var10005 = 126;
               break;
            default:
               var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
