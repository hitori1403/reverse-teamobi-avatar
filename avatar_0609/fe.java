import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fe extends e8 implements c4 {
   public static fe z;
   private ag A;
   private ag B;
   public ag C;
   private ag D;
   private ag E;
   private ag F;
   public i1[] G;
   private short H;
   boolean I;
   public boolean J;
   private boolean K;
   private long L;
   public byte M = 0;
   public byte N = 1;
   public byte O;
   public static Image P;
   public static Image Q;
   public static Image[] R;
   public static Image[] S;
   private dq T;
   public e6 U;
   public static byte[][] V;
   private int W;
   private int X;
   private int Y;
   private int Z;
   private int aa;
   private int ab;
   private int ac;
   private int ad;
   private int ae;
   private int af;
   private int ag;
   private int ah;
   private int ai;
   private int aj;
   private int ak;
   private int al;
   private g_ am;
   private g_ an;
   private g_ ao;
   private g_ ap;
   private boolean aq = false;
   private byte ar = 0;
   private byte as;
   public short at = 0;
   public long au;
   public Vector av = new Vector();
   private int aw;
   private int ax;
   private int ay = -1;
   private int az = 0;
   private int aA = 0;
   private byte aB;
   private boolean aC = false;
   private long aD;
   private long aE;
   private int[] aF = new int[]{100, 500, 1000, 2000, 5000, 10000, 20000, 30000, 50000};
   boolean aG = false;
   short aH;
   short aI;
   String aJ;
   byte aK;
   byte aL;
   byte aM;
   private static final String[] bb;

   public static fe g() {
      return z == null ? (z = new fe()) : z;
   }

   public fe() {
      (V = new byte[3][])[0] = new byte[]{0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1};
      V[1] = new byte[]{2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3};
      V[2] = new byte[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
      this.A = new ag(hq.bp, 3, this);
      this.D = new ag(hq.ds, 1, this);
      this.B = new ag(hq.d, 7, this);
      this.E = new ag(hq.A, 6, this);
      this.F = new ag(hq.e, 8, this);
      this.C = new ag(hq.y, 2, this);
      this.W = 220 * ev.a;
      this.X = 240 * ev.a;
      this.aa = 8 * ev.a;
      this.ab = this.af = 23 * ev.a;
      this.ac = 105 * ev.a;
      this.ad = this.ah = 211 * ev.a;
      this.ag = 95 * ev.a;
      this.ae = this.W - this.ag - 8 * ev.a;
      this.ak = 180 * ev.a + 10 * ev.a + 10 * ev.a;
      this.al = 110 * ev.a;
      this.ai = (k4.o - this.ak) / 2;
      this.aj = (k4.p - this.al) / 2;
   }

   public final void d() {
      super.d();
   }

   public final void b(i1[] var1, short var2, boolean var3, boolean var4) {
      this.K = false;
      this.N = 1;
      this.aw = -1;
      k4.y = null;
      k4.D = null;
      this.aq = false;
      if (P == null) {
         try {
            StringBuffer var10003 = new StringBuffer(String.valueOf(hq.b()));
            String[] var7 = bb;
            this.am = new g_(Image.createImage(var10003.append(var7[5]).toString()), 20 * ev.a, 20 * ev.a);
            this.an = new g_(Image.createImage(hq.b() + var7[0]), 31 * ev.a, 31 * ev.a);
            this.ap = new g_(Image.createImage(hq.b() + var7[2]), 60 * ev.a, 24 * ev.a);
            this.ao = new g_(Image.createImage(hq.b() + var7[3]), 14 * ev.a, 14 * ev.a);
            P = Image.createImage(hq.b() + var7[6]);
            Q = Image.createImage(hq.b() + var7[9]);
            R = new Image[5];

            for(int var5 = 0; var5 < 5; ++var5) {
               Image[] var10000 = R;
               StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
               var7 = bb;
               var10000[var5] = Image.createImage(var10002.append(var7[1]).append(var5).append(var7[4]).toString());
            }

            S = new Image[3];

            for(int var10 = 0; var10 < 3; ++var10) {
               Image[] var18 = S;
               StringBuffer var19 = new StringBuffer(String.valueOf(hq.b()));
               var7 = bb;
               var18[var10] = Image.createImage(var19.append(var7[7]).append(var10).append(var7[8]).toString());
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      if (!var3) {
         if (var4) {
            for(int var11 = 0; var11 < gx.n.size(); ++var11) {
               ik var6;
               if ((var6 = (ik)gx.n.elementAt(var11)).d == 10) {
                  gx.b(var6);
               }
            }
         }

         if (z != k4.u) {
            gx.b(gx.n);
            g().d();
            gx.A = -1;
            this.c(1);
            this.c(2);
            k4.A.f(108);
            gx.d(GameMidlet.k);
            fe var12 = g();
            cl.b().c(gx.b);
            var12.Y = (k4.o - var12.W) / 2;
            var12.Z = (k4.p - var12.X) / 2;
            var12.as = (byte)(35 * ev.a);
            if (k4.b.getHeight() <= 240) {
               var12.as = 30;
               var12.X = 215;
               var12.ad = var12.ah = 185;
            }

            cl.q = false;
         }

         this.G = null;
         this.G = var1;
         if (var1 != null) {
            for(int var13 = 0; var13 < 6; ++var13) {
               this.G[var13].a = 20;
               this.G[var13].b = 80 + var13 * 12;
               gx.n.addElement(this.G[var13]);
            }

            cl.b().r = this.G[2];
            this.O = 3;
         }

         GameMidlet.k.a = GameMidlet.k.l = 0;
      }

      GameMidlet.k.b = GameMidlet.k.m = 96 * ev.a;
      this.J = var3;
      this.I = var4;
      this.H = var2;
      this.L = System.currentTimeMillis();
      if (var3) {
         this.M = 48;
         super.f = null;
         super.g = this.A;
         super.e = this.B;
      } else {
         super.e = this.B;
         super.g = null;
         super.f = null;
         if (!var4) {
            super.g = this.A;

            for(int var14 = 0; var14 < 6; ++var14) {
               int var15 = 0;

               for(int var9 = 0; var9 < this.G[var14].I.length; ++var9) {
                  var15 += this.G[var14].I[var9];
                  this.G[var14].a += this.G[var14].J[var9] * this.G[var14].I[var9];
                  ++this.G[var14].A;
                  if (var15 >= (var2 - 4) * 20) {
                     break;
                  }
               }
            }
         } else {
            hx.b().n(this.G[0].f);
            super.f = this.D;
         }
      }

      this.T = new dq();
   }

   private void c(int var1) {
      Vector var2 = new Vector();
      Vector var3 = new Vector();
      Vector var4 = new Vector();
      Vector var5 = new Vector();
      Vector var6 = new Vector();

      for(int var7 = 0; var7 < f5.e.length; ++var7) {
         jv var8;
         jw var9;
         if ((var8 = f5.e[var7]).a == -1 && var8.b < 2000 && var8.f > 0 && ((var9 = (jw)var8).i == var1 || var9.i == 0)) {
            if (var9.e == 10) {
               var2.addElement(var9);
            } else if (var8.e == 20) {
               var3.addElement(var9);
            } else if (var8.e == 30) {
               var4.addElement(var9);
            } else if (var8.e == 40) {
               var5.addElement(var9);
            } else if (var8.e == 50) {
               var6.addElement(var9);
            }
         }
      }

      for(int var10 = 0; var10 < 10; ++var10) {
         i3 var11;
         (var11 = new i3()).D = (byte)var1;
         gl var12;
         (var12 = new gl()).b = ((jv)var2.elementAt(b2.e(var2.size()))).b;
         var11.b(var12);
         (var12 = new gl()).b = ((jv)var3.elementAt(b2.e(var3.size()))).b;
         var11.b(var12);
         (var12 = new gl()).b = ((jv)var4.elementAt(b2.e(var4.size()))).b;
         var11.b(var12);
         (var12 = new gl()).b = ((jv)var5.elementAt(b2.e(var5.size()))).b;
         var11.b(var12);
         (var12 = new gl()).b = ((jv)var6.elementAt(b2.e(var6.size()))).b;
         var11.b(var12);
         var11.i();
         this.av.addElement(var11);
      }
   }

   public final void b(int var1) {
      while(true) {
         switch(var1) {
            case 0:
               hx var4;
               (var4 = hx.b()).a((byte)8);
               var4.a();
               k4.i();
               return;
            case 1:
               if (this.az >= 0) {
                  this.aq = true;
                  super.f = this.E;
                  super.e = null;
                  super.g = this.F;
                  return;
               }
               break;
            case 2:
               ds var3 = new ds();
               if (this.J) {
                  k4.b(hq.d5, var3);
                  return;
               }

               k4.b(hq.du, var3);
               return;
            case 3:
               cl.b().r = this.G[this.O++];
               if (this.O >= 6) {
                  this.O = 0;
                  return;
               }
            case 4:
            default:
               break;
            case 5:
               if (this.J || !this.I) {
                  super.e = this.A;
               }

               super.g = null;
               return;
            case 6:
               hx.b().d(this.G[this.az].f, this.aF[this.aA]);
               var1 = 8;
               this = this;
               continue;
            case 7:
               Vector var2;
               (var2 = new Vector()).addElement(new ag(hq.dt, 0, this));
               var2.addElement(new ag(hq.y, 2, this));
               f1.d().b(var2, 0);
               return;
            case 8:
               super.f = this.D;
               super.e = this.B;
               super.g = null;
               this.aq = false;
         }

         return;
      }
   }

   public final void b() {
      if (this.aB >= 0) {
         --this.aB;
         if (this.aB == 0) {
            this.h();
         }
      }

      if ((this.J || !this.I) && System.currentTimeMillis() - this.au >= 1000L) {
         this.au = System.currentTimeMillis();
         --this.at;
         if (this.at < 0) {
            this.at = 0;
         }
      }

      GameMidlet.k.b(cl.b().c + k4.q, cl.b().d + k4.p - 40 * ev.a);
      if (System.currentTimeMillis() - this.L >= 1000L) {
         this.L = System.currentTimeMillis();
         --this.H;
         if (this.H < 0) {
            this.H = 0;
         } else {
            ++this.ax;
            if (this.I && !this.J && this.ax > 0) {
               this.ax = 0;
               if (this.az >= 0 && this.G != null && this.az < 6 && this.G[this.az] != null && this.G[this.az].f != this.aw) {
                  this.aw = this.G[this.az].f;
                  hx.b().n(this.aw);
               }
            }
         }
      }

      if (this.G != null) {
         int var1 = 0;

         for(int var2 = 0; var2 < 6; ++var2) {
            if ((this.J || !this.I) && this.G[var2].A >= this.G[var2].J.length) {
               ++var1;
            }
         }

         if (!this.K && var1 == 6) {
            this.K = true;

            for(int var6 = 0; var6 < 6; ++var6) {
               gx.b(this.G[var6]);
            }
         }

         if (this.K && this.U != null) {
            this.K = false;
            k4.D = this.U;
            GameMidlet.k.A[0] += this.U.u;
            k4.b(this.U.u, k4.q, k4.p - 30 * ev.a, -1);
            this.U = null;
         }
      }

      k4.A.c();
      if (this.J && this.M > 0) {
         --this.M;
      }

      if (this.T != null && this.T.b()) {
         this.T.h = null;
      }

      if (this.J || !this.I) {
         for(int var5 = 0; var5 < gx.n.size(); ++var5) {
            it var7;
            if ((var7 = (it)gx.n.elementAt(var5)).d == 9) {
               i3 var8 = (i3)var7;
               if (System.currentTimeMillis() / 1000L - (long)var8.N > (long)var8.aA) {
                  var8.N = (int)(System.currentTimeMillis() / 1000L);
                  var8.aA = (short)(b2.e(10) + 6);
                  int var3;
                  if ((var3 = b2.e(6)) == 1) {
                     byte var4 = 0;
                     var8.q = var4;
                  } else if (var3 == 3) {
                     byte var9 = 0;
                     var8.q = var9;
                     var8.h();
                  } else if (var3 == 2) {
                     byte var10 = 7;
                     var8.q = var10;
                  } else {
                     byte var11 = 2;
                     var8.q = var11;
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

   public final void c() {
      super.c();
      ++this.aD;
      if (k4.H == null || !ew.y) {
         super.c();
      }

      if (k4.d(2)) {
         if (this.aq) {
            if (this.aA / 3 > 0) {
               this.aA -= 3;
            }
         } else {
            --this.az;
            if (this.az < 0) {
               this.az = 0;
            }
         }
      } else if (k4.d(8)) {
         if (this.aq) {
            if (this.aA / 3 < 2) {
               this.aA += 3;
            }
         } else {
            ++this.az;
            if (this.az > 5) {
               this.az = 5;
            }
         }
      } else if (k4.d(4)) {
         if (this.aq && this.aA % 3 > 0) {
            --this.aA;
         }
      } else if (k4.d(6) && this.aq && this.aA % 3 < 2) {
         ++this.aA;
      }

      if (k4.i && this.G != null && !this.J && this.I) {
         if (this.aq) {
            if (k4.e(this.ai + this.ak - 30 * ev.a, this.aj, 30 * ev.a, 30 * ev.a)) {
               k4.i = false;
               this.ar = 5;
               this.aC = true;
               this.aE = this.aD;
            } else {
               for(int var1 = 0; var1 < 9; ++var1) {
                  if (k4.e(
                     this.ai + 5 * ev.a + var1 % 3 * (5 * ev.a + this.ap.b),
                     this.aj + (this.al - 29 * ev.a * 3) + var1 / 3 * 29 * ev.a - 1 * ev.a,
                     60 * ev.a,
                     26 * ev.a
                  )) {
                     this.aA = var1;
                     k4.i = false;
                     this.aC = true;
                     this.aE = this.aD;
                     break;
                  }
               }
            }
         } else {
            for(int var2 = 0; var2 < 6; ++var2) {
               if (k4.e(
                  this.Y + this.ae + 32 * ev.a / 2 - 15 * ev.a,
                  this.Z + this.af + 3 * ev.a + 35 * ev.a * var2 + 31 * ev.a / 2 - 15 * ev.a,
                  31 * ev.a,
                  31 * ev.a
               )) {
                  this.ay = var2;
                  this.aC = true;
                  k4.i = false;
                  this.aE = this.aD;
                  break;
               }

               if (k4.e(
                  this.Y + this.ae + this.ag - 1 * ev.a - this.ap.b,
                  this.Z + this.af + 3 * ev.a + 35 * ev.a * var2 + 31 * ev.a / 2 - 15 * ev.a,
                  60 * ev.a,
                  31 * ev.a
               )) {
                  this.az = var2;
                  this.aC = true;
                  k4.i = false;
                  this.aE = this.aD;
                  break;
               }
            }
         }
      }

      if (this.aC) {
         if (k4.g) {
            if (this.aA != -1) {
               if (!k4.e(
                  this.ai + 5 * ev.a + this.aA % 3 * (5 * ev.a + this.ap.b),
                  this.aj + (this.al - 29 * ev.a * 3) + this.aA / 3 * 29 * ev.a - 1 * ev.a,
                  60 * ev.a,
                  26 * ev.a
               )) {
                  this.aA = -1;
               }
            } else if (this.ar != 0) {
               if (!k4.e(this.ai + this.ak - 30 * ev.a, this.aj, 30 * ev.a, 30 * ev.a)) {
                  this.ar = 0;
               }
            } else if (this.ay != -1) {
               if (!k4.e(
                  this.Y + this.ae + 32 * ev.a / 2 - 15 * ev.a,
                  this.Z + this.af + 3 * ev.a + 35 * ev.a * this.ay + 31 * ev.a / 2 - 15 * ev.a,
                  31 * ev.a,
                  31 * ev.a
               )) {
                  this.ay = -1;
               }
            } else if (this.az != -1
               && !this.aq
               && !k4.e(
                  this.Y + this.ae + this.ag - 1 * ev.a - this.ap.b,
                  this.Z + this.af + 3 * ev.a + 35 * ev.a * this.az + 31 * ev.a / 2 - 15 * ev.a,
                  60 * ev.a,
                  31 * ev.a
               )) {
               this.az = -1;
            }
         }

         if (k4.h) {
            if (this.aD - this.aE <= 4L) {
               this.aB = 5;
            } else {
               this.h();
            }

            this.aC = false;
            k4.h = false;
         }
      }

      if (this.J || !this.I) {
         k4.A.b();
      }
   }

   private void h() {
      if (this.aA != -1) {
         hx.b().d(this.G[this.az].f, this.aF[this.aA]);
         this.aA = -1;
         this.az = -1;
         this.aq = false;
         this.b(8);
      } else if (this.ar > 0) {
         this.ar = 0;
         this.aq = false;
         this.az = -1;
      } else if (this.ay != -1) {
         hx.b().n(this.G[this.ay].f);
         this.ay = -1;
      } else {
         if (this.az != -1) {
            this.aq = true;
            super.f = this.E;
            super.e = null;
            super.g = this.F;
         }
      }
   }

   private static void b(Graphics var0, int var1, int var2, int var3, int var4, g_ var5, int var6) {
      var5.b(0, var1, var2, 0, var0);
      var5.b(2, var1 + var3 - var5.b, var2, 0, var0);
      var5.b(5, var1, var2 + var4 - var5.c, 0, var0);
      var5.b(7, var1 + var3 - var5.b, var2 + var4 - var5.c, 0, var0);

      for(int var7 = 0; var7 < (var3 - (var5.b << 1)) / var5.b; ++var7) {
         var5.b(1, var1 + (var7 + 1) * var5.b, var2, 0, var0);
         var5.b(6, var1 + (var7 + 1) * var5.b, var2 + var4 - var5.c, 0, var0);
      }

      var5.b(1, var1 + var3 - (var5.b << 1), var2, 0, var0);
      var5.b(6, var1 + var3 - (var5.b << 1), var2 + var4 - var5.c, 0, var0);

      for(int var8 = 0; var8 < (var4 - (var5.c << 1)) / var5.c; ++var8) {
         var5.b(3, var1, var2 + (var8 + 1) * var5.c, 0, var0);
         var5.b(4, var1 + var3 - var5.b, var2 + (var8 + 1) * var5.c, 0, var0);
      }

      var5.b(3, var1, var2 + var4 - (var5.c << 1), 0, var0);
      var5.b(4, var1 + var3 - var5.b, var2 + var4 - (var5.c << 1), 0, var0);
      if (var6 != -1) {
         var0.setColor(var6);
         var0.fillRect(var1 + var5.b, var2 + var5.c, var3 - (var5.b << 1), var4 - (var5.c << 1));
      }
   }

   public final void b(Graphics var1) {
      this.a(var1);
      k4.d(var1);
      if (this.I) {
         k4.aa.b(var1, this.Y, this.Z, this.W, this.X, ib.e[2], ib.e[3], 1);
         var1.translate(this.Y, this.Z);
         k4.S.b(var1, hq.ds, this.W / 2, 6 * ev.a, 2);
         b(var1, this.aa, this.ab, this.ac, this.ad, this.am, -1);
         b(var1, this.ae, this.af, this.ag, this.ah, f0.n, -12335933);

         for(int var2 = 0; var2 < 6; ++var2) {
            this.an.b(this.ay == var2 ? 1 : 0, this.ae + 32 * ev.a / 2, this.af + 3 * ev.a + this.as * var2 + 31 * ev.a / 2, 0, 3, var1);
            f5.b(var1, this.G[var2].H, this.ae + 32 * ev.a / 2, this.af + 3 * ev.a + this.as * var2 + 31 * ev.a / 2, 3);
            k4.U
               .b(
                  var1,
                  "x" + this.G[var2].z,
                  this.ae + 32 * ev.a / 2 + this.an.b / 2 - 5 * ev.a,
                  this.af + 3 * ev.a + this.as * var2 + 31 * ev.a / 2 + this.an.c / 2 - ev.h,
                  2
               );
            this.ap.b(this.az == var2 ? 1 : 0, this.ae + this.ag - 1 * ev.a - this.ap.b, this.af + 7 * ev.a + this.as * var2, 0, var1);
            if (this.G[var2].K > 0) {
               k4.S
                  .b(
                     var1,
                     "" + this.G[var2].K,
                     this.ae + this.ag - 1 * ev.a - this.ap.b / 2,
                     this.af + 7 * ev.a + this.as * var2 + this.ap.c / 2 - ev.j / 2 - ev.a - 1,
                     2
                  );
            } else {
               k4.S.b(var1, hq.ds, this.ae + this.ag - 1 * ev.a - this.ap.b / 2, this.af + 7 * ev.a + this.as * var2 + this.ap.c / 2 - ev.j / 2 - ev.a - 1, 2);
            }
         }

         if (this.aG && this.G != null) {
            k4.S.b(var1, this.aJ, this.aa + this.ac / 2, this.ab + 6 * ev.a, 2);
            f5.b(var1, this.aH, this.aa + this.ac / 2, this.ab + 40 * ev.a, 3);
            int var4 = this.ab + 70 * ev.a;
            k4.S.b(var1, hq.aQ, this.aa + 5 * ev.a, var4, 0);
            k4.V.b(var1, this.aI + "%", this.aa + this.ac - 8 * ev.a, var4 + ev.j / 2 - ev.h / 2, 1);
            var4 += ev.j;
            k4.S.b(var1, hq.dw, this.aa + 5 * ev.a, var4, 0);
            k4.V.b(var1, "X" + this.aK, this.aa + this.ac - 8 * ev.a, var4 + ev.j / 2 - ev.h / 2, 1);
            var4 += ev.j;
            k4.S.b(var1, hq.dx, this.aa + 5 * ev.a, var4, 0);
            k4.V.b(var1, hq.dS[this.aL], this.aa + this.ac - 8 * ev.a, var4 + ev.j / 2 - ev.h / 2, 1);
            var4 += ev.j;
            k4.S.b(var1, hq.d6, this.aa + 5 * ev.a, var4, 0);
            k4.V.b(var1, hq.dS[this.aM], this.aa + this.ac - 8 * ev.a, var4 + ev.j / 2 - ev.h / 2, 1);
            this.ao.b(0, this.aa + this.ao.b / 2 + 8 * ev.a, this.ab + this.ad - ev.i - this.ao.c - 8 * ev.a, 0, 3, var1);
            k4.S.b(var1, String.valueOf(this.H), this.aa + 8 * ev.a + this.ao.b + 2 * ev.a, this.ab + this.ad - ev.i - this.ao.c - 8 * ev.a - k4.S.b() / 2, 0);
            this.ao.b(1, this.aa + this.ao.b / 2 + 8 * ev.a, this.ab + this.ad - ev.i - ev.a, 0, 3, var1);
            k4.S.b(var1, String.valueOf(GameMidlet.k.A[0]), this.aa + 8 * ev.a + this.ao.b + 2 * ev.a, this.ab + this.ad - ev.i - ev.a - ev.j / 2, 0);
         }

         if (this.aq) {
            Graphics var3 = var1;
            fe var5 = this;
            k4.d(var1);
            k4.aa.b(var1, this.ai, this.aj, this.ak, this.al, ib.e[2], ib.e[3], 1);
            var1.translate(this.ai, this.aj);
            k4.S.b(var1, hq.dv, this.ak / 2, 10 * ev.a, 2);

            for(int var11 = 0; var11 < 9; ++var11) {
               var5.ap.b(var5.aA == var11 ? 1 : 0, 5 * ev.a + var11 % 3 * (5 * ev.a + var5.ap.b), var5.al - 29 * ev.a * 3 + var11 / 3 * 29 * ev.a, 0, var3);
               k4.Y
                  .b(
                     var3,
                     String.valueOf(var5.aF[var11]),
                     5 * ev.a + var11 % 3 * (5 * ev.a + var5.ap.b) + var5.ap.b / 2,
                     var5.al - 29 * ev.a * 3 + var11 / 3 * 29 * ev.a + var5.ap.c / 2 - ev.k / 2,
                     2
                  );
            }
         }
      } else {
         dm var6;
         if (this.J && this.M > 0 && (var6 = f5.d((short)1065)).e != -1) {
            int var7 = var6.d / 4;
            var1.drawRegion(var6.b, 0, (3 - this.M / 12) * var7, var6.c, var7, 0, k4.o / 2, k4.p / 2, 3);
         }
      }

      k4.d(var1);
      if (this.T != null && this.T.h != null) {
         this.T.b(var1);
      }

      if (k4.H == null || !ew.y) {
         super.b(var1);
      }

      if ((this.J || !this.I) && k4.y == null && this.K) {
         k4.T.b(var1, String.valueOf(this.at), k4.q, 5, 2);
      }

      k4.b(var1);
   }

   public final void a(Graphics var1) {
      k4.d(var1);
      k4.A.c(var1);

      for(int var2 = 0; var2 < 6; ++var2) {
         if (cl.b().c <= 4 * gx.j * ev.a) {
            gx.d.c(0, var2 % 2 == 0 ? 2 : 3, 3 * gx.j * ev.a, (var2 + 6) * gx.j * ev.a, 0, var1);
         }

         if (cl.b().c + k4.o >= (gx.f - 3) * gx.j * ev.a) {
            gx.d.c(0, var2 % 2 == 0 ? 2 : 3, (gx.f - 3) * gx.j * ev.a, (var2 + 6) * gx.j * ev.a, 0, var1);
         }
      }

      k4.A.e(var1);
      k4.d(var1);
   }

   public final void b(String var1) {
      if (!var1.equals("")) {
         this.T = new dq(50, var1, (byte)0);
         this.T.b = k4.q;
         this.T.c = k4.p - this.T.d - e8.v - e3.e().o.e;
         hx var3;
         (var3 = hx.b()).a((byte)9);
         var3.a(var1);
         var3.a();
      }
   }

   static {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "6\u0011\u0002\nw-cv\u0013\u0016\u0019=`g(M\u0013\u0007u\f6\u0011\u0002\nw-ql\nL\r\"\u00136\u0011\u0002\nw-cv\u0013\u0016\u0019=`g)M\u0013\u0007u\u00146\u0011\u0002\nw-cv\u0013\u0016\u0019=vzt\u0006M\u0019|e\u00047\u0013\r\u000e\u00156\u0011\u0002\nw-cv\u0013\u0016\u0019=vzu\u0006RGblt\f6\u0011\u0002\nw-!!M\u0013\u0007u\u000b6\u0011\u0002\nw-ql\nL\u001e";
      int var4 = "6\u0011\u0002\nw-cv\u0013\u0016\u0019=`g(M\u0013\u0007u\f6\u0011\u0002\nw-ql\nL\r\"\u00136\u0011\u0002\nw-cv\u0013\u0016\u0019=`g)M\u0013\u0007u\u00146\u0011\u0002\nw-cv\u0013\u0016\u0019=vzt\u0006M\u0019|e\u00047\u0013\r\u000e\u00156\u0011\u0002\nw-cv\u0013\u0016\u0019=vzu\u0006RGblt\f6\u0011\u0002\nw-!!M\u0013\u0007u\u000b6\u0011\u0002\nw-ql\nL\u001e"
         .length();
      char var1 = 19;
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

                  var2 = "7\u0013\r\u000e\f6\u0011\u0002\nw-! M\u0013\u0007u";
                  var4 = "7\u0013\r\u000e\f6\u0011\u0002\nw-! M\u0013\u0007u".length();
                  var1 = 4;
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
         var10000[0] = (char)(var10000[0] ^ 19);
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
               var10005 = 25;
               break;
            case 1:
               var10005 = 99;
               break;
            case 2:
               var10005 = 99;
               break;
            case 3:
               var10005 = 105;
               break;
            case 4:
               var10005 = 18;
               break;
            case 5:
               var10005 = 2;
               break;
            default:
               var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
