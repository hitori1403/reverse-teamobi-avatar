import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fx extends ft {
   public static fx ai;
   private Vector aj = new Vector();
   private Vector ak = new Vector();
   Vector al = new Vector();
   Vector am = new Vector();
   private Vector an = new Vector();
   ag ao;
   ag ap;
   private int aq;
   private int ar;
   private byte as = -1;
   private byte at = -1;
   private byte au;
   byte av;
   byte aw;
   byte ax;
   private byte ay;
   public static int az;
   public static int aA;
   boolean[] aB = new boolean[6];
   public byte[][] aC = new byte[5][6];
   byte[] aD = new byte[3];
   public byte aE;
   byte aF = 0;
   byte aG;
   boolean aH;
   boolean aI;
   boolean aJ;
   boolean aK;
   public boolean aL;
   int[] aM;
   private Image aN;
   private static int aO;
   private static int aP;
   private static cn[] aQ;
   Vector aR = new Vector();
   private ag aS;
   private static final String[] bb;

   public static ft u() {
      return ai == null ? (ai = new fx()) : ai;
   }

   public final void d() {
      this.g();
      super.d();
   }

   private void v() {
      for(int var1 = 0; var1 < this.aD.length; ++var1) {
         this.aD[var1] = -1;
      }

      for(int var3 = 0; var3 < this.aB.length; ++var3) {
         this.aB[var3] = false;
      }

      for(int var4 = 0; var4 < this.aC.length; ++var4) {
         for(int var2 = 0; var2 < this.aC[var4].length; ++var2) {
            this.aC[var4][var2] = 0;
         }
      }
   }

   public fx() {
      try {
         this.aN = Image.createImage(hq.b() + bb[3]);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.v();
      this.aM = null;
      this.ao = new ag(hq.C, 7);
      this.ap = new ag(hq.x, 8);
      this.aS = new ag(hq.C, 9);
      if (k4.o > 200) {
         aA = 23;
         az = 23;
         aP = 48;
         aO = 48;
         if (ev.a == 2) {
            aP = 96;
            aO = 96;
         }
      } else {
         aA = 12;
         az = 12;
         aP = 32;
         aO = 32;
      }

      fx var1 = this;
      this.an.removeAllElements();
      this.aq = k4.o / 2 - aO - aO / 2 - 10;
      this.ar = k4.p / 2 - aP - 12;

      for(int var2 = 0; var2 < 6; ++var2) {
         h8 var3;
         (var3 = new h8()).b = var2;
         var3.d = var1.aq + var2 % 3 * (aO + 10);
         var3.e = var1.ar + var2 / 3 * (aP + 8);
         var1.an.addElement(var3);
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 7:
            y();
            break;
         case 8:
            this.o();
            this.aR.removeAllElements();
            ft.C = false;
            ft.A = false;
            ft.B = false;
            super.E = -1;
            this.aM = null;
            this.aj.removeAllElements();
            this.ak.removeAllElements();
            this.as = -1;
            this.at = -1;
            break;
         case 9:
            if (!this.aH) {
               if (!this.aB[ft.g(GameMidlet.k.f)]) {
                  this.aG = 1;
                  this.B();
               }
            } else if (this.as != -1) {
               this.as = -1;
               super.f.b = bb[1];
               super.g = this.ao;
            }
      }

      super.b(var1, var2);
   }

   public final void g() {
      super.g();
      if (k4.o > 150) {
         aQ = new cn[]{
            new cn(20 * ev.a, 50 + 30 * ev.a, 6),
            new cn(20 * ev.a, k4.r + 60, 6),
            new cn(k4.q, k4.s - k4.ab - 10, 33),
            new cn(k4.o - 14 * ev.a, k4.r + 60, 10),
            new cn(k4.o - 14 * ev.a, 50 + 30 * ev.a, 10)
         };
      } else {
         aQ = new cn[]{
            new cn(20, 13, 6), new cn(20, k4.r - 5, 6), new cn(k4.q, k4.s - k4.ab - 10, 33), new cn(k4.o - 14, k4.r - 5, 10), new cn(k4.o - 14, 13, 10)
         };
      }
   }

   private void w() {
      this.as = -1;
      this.at = -1;
      this.av = 0;
      this.aw = 0;
      this.ax = 0;
      this.aH = false;
      this.aI = false;
      this.aJ = false;
      this.aF = 0;
      this.aL = false;
      this.aj.removeAllElements();
      this.ak.removeAllElements();
      this.am.removeAllElements();
      this.ay = 0;
      this.aK = false;
      ft.A = false;
      super.E = -1;
      this.aG = 0;
      ft.B = false;
      this.v();

      for(int var1 = 0; var1 < this.an.size(); ++var1) {
         ((h8)this.an.elementAt(var1)).c = 0;
      }
   }

   private void x() {
      if (!this.aI) {
         ft.j();
         this.aL = true;
         h1.b().b(this.as, this.at);
         ft.B = true;
         super.E = -1;
      }
   }

   private static void y() {
      ft.j();
      ft.B = true;
      h1.b().k();
   }

   private void z() {
      ++((h8)this.an.elementAt(this.au)).c;
      fx var1 = this;

      for(int var2 = 0; var2 < 6; ++var2) {
         h8 var3 = (h8)var1.an.elementAt(var2);
         int var4 = b(var1.al, ft.g(GameMidlet.k.f));
         int var10001 = var3.d + aO / 2;
         int var10002 = var3.e + aP / 2;
         int var10003 = var3.c;
         int var7 = h(var4);
         int var6 = var10003;
         int var5 = var10002;
         var4 = var10001;
         d6 var9 = new d6(var4, var5, var6, var7);
         var1.aj.addElement(var9);
      }
   }

   void A() {
      for(int var1 = 0; var1 < 6; ++var1) {
         h8 var2 = (h8)this.an.elementAt(var1);
         int var3 = b(this.al, this.ax);
         this.b(var2.d, var2.e, var2.d, var2.e, this.aC[this.ax][var1], h(var3), var1, var1);
      }
   }

   private void d(Graphics var1) {
      if (this.am.size() > 0) {
         for(int var2 = 0; var2 < this.am.size(); ++var2) {
            dk var3 = (dk)this.am.elementAt(var2);
            if (f5.d((short)874).e != -1) {
               int var10003 = var3.d * dk.k;
               var1.drawRegion(f5.d((short)874).b, 0, var10003, dk.j, dk.k, 0, var3.b, var3.e, 17);
            }
         }
      }
   }

   private static int h(int var0) {
      switch(var0) {
         case 0:
            return 3;
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         default:
            return -1;
      }
   }

   void b(int var1, int var2, int var3, int var4) {
      dk var5 = new dk(var1, var2, var3, var4, false);
      this.am.addElement(var5);
   }

   private void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      js var9 = new js(var1, var2, var3, var4, var5, var6, var7, false);
      this.ak.addElement(var9);
   }

   public final void b(Graphics var1) {
      this.a(var1);
      k4.d(var1);
      Graphics var3 = var1;
      fx var2 = this;

      for(int var4 = 0; var4 < var2.aR.size(); ++var4) {
         is var5;
         if ((var5 = (is)var2.aR.elementAt(var4)).n >= 0) {
            k4.W.b(var3, "+" + var5.t, var5.a, var5.b, 2);
         }
      }

      super.b(var1);
   }

   public final void a(Graphics var1) {
      super.a(var1);
      if (ft.A || ft.B) {
         k4.d(var1);
         Graphics var4 = var1;
         fx var3 = this;
         if (this.an.size() > 0) {
            if (this.as != -1) {
               var1.setColor(16777215);
               if (k4.n % 20 > 10) {
                  var1.fillRect(this.aq + this.as % 3 * (aO + 10), this.ar + this.as / 3 * (aP + 8), aO, aP);
               }
            }

            if (this.at != -1) {
               var1.setColor(1112500);
               if (k4.n % 20 > 10) {
                  var1.fillRect(this.aq + this.at % 3 * (aO + 10), this.ar + this.at / 3 * (aP + 8), aO, aP);
               }
            }

            for(int var5 = 0; var5 < var3.an.size(); ++var5) {
               h8 var6 = (h8)var3.an.elementAt(var5);
               if (f5.d((short)(k4.o > 200 ? 872 : 873)).e != -1) {
                  int var10003 = var6.b * aP;
                  int var10007 = var3.aq + var5 % 3 * (aO + 10);
                  int var10008 = var3.ar + var5 / 3 * (aP + 8);
                  var4.drawRegion(f5.d((short)(k4.o > 200 ? 872 : 873)).b, 0, var10003, aO, aP, 0, var10007, var10008, 0);
               }
            }
         }
      }

      this.c(var1);
      if (ft.A || ft.B) {
         k4.d(var1);
         Graphics var13 = var1;
         fx var10 = this;

         for(int var14 = 0; var14 < ft.D.size(); ++var14) {
            i3 var16;
            if ((var16 = (i3)ft.D.elementAt(var14)).f == ft.I || var16.f != -1) {
               if (var10.E != var16.f || k4.n % 10 >= 5) {
                  k4.Y.b(var13, var16.c() + hq.l(), var16.a, var16.b + 5, 2);
               }

               int var7;
               if ((var7 = b(var10.al, ft.g(var16.f))) != -1 && f5.d((short)871).e != -1) {
                  var13.drawRegion(f5.d((short)871).b, 0, h(var7) * 12, 12, 12, 0, var16.a, var16.b + 5 + ev.k, 17);
               }
            }
         }

         if (ft.A || ft.B) {
            int var2;
            if ((var2 = (int)((long)ft.N - ft.L)) > 0 && !ft.C && this.am.size() <= 0) {
               k4.W.b(var1, String.valueOf(var2), k4.q, 10, 2);
            }

            if (this.aJ) {
               if (this.aF < 100) {
                  ++this.aF;
               } else {
                  this.aF = 100;
               }

               if (this.aF < 50) {
                  k4.T.b(var1, bb[0], k4.q, this.ar - 40, 2);
               }
            }
         }

         if (this.aj.size() > 0) {
            for(int var8 = 0; var8 < this.aj.size(); ++var8) {
               d6 var11;
               if ((var11 = (d6)this.aj.elementAt(var8)).c > 0) {
                  var11.b(var1);
               }
            }
         }

         if (this.ak.size() > 0) {
            for(int var9 = 0; var9 < this.ak.size(); ++var9) {
               js var12;
               if ((var12 = (js)this.ak.elementAt(var9)).d > 0 && !var12.i) {
                  c9 var15 = k4.W;
                  if (k4.o <= 200) {
                     var15 = k4.Y;
                  }

                  if (k4.ah > 0) {
                     var15 = k4.S;
                  }

                  int var17 = var12.b + aO / 4 + var12.e % 2 * aO / 2;
                  int var18 = var12.c + aP / 4 + var12.e / 2 * aP / 2;
                  if (f5.d((short)(k4.o > 200 ? 870 : 871)).e != -1) {
                     int var19 = var12.e * aA;
                     var1.drawRegion(f5.d((short)(k4.o > 200 ? 870 : 871)).b, 0, var19, az, aA, 0, var17, var18, 3);
                  }

                  var15.b(var1, String.valueOf(var12.d), var17, var18 - var15.b() / 2, 2);
               }
            }
         }

         if (GameMidlet.k.f != ft.I && ft.A && this.am.size() == 0) {
            var1.drawImage(this.aN, this.aq + aO / 2 + this.au % 3 * (aO + 10), this.ar + aP / 2 + this.au / 3 * (aP + 8) + k4.n % 4 + 5, 3);
         }

         this.d(var1);
      }
   }

   private void B() {
      ft.j();
      this.aL = true;
      h1.b().b(this.an);
      this.aj.removeAllElements();
   }

   public final void c() {
      super.c();
      if (!this.aB[ft.g(GameMidlet.k.f)] && GameMidlet.k.f != ft.I) {
         fx var2 = this;
         if (!this.aL && ft.A && !ft.C && this.an.size() > 0 && k4.i) {
            k4.i = false;

            for(int var3 = 0; var3 < var2.an.size(); ++var3) {
               h8 var4 = (h8)var2.an.elementAt(var3);
               if (k4.j >= var4.d && k4.j <= var4.d + aO && k4.k >= var4.e && k4.k <= var4.e + aP) {
                  var2.au = (byte)var3;
                  if (!var2.aH) {
                     if (!var2.aB[ft.g(GameMidlet.k.f)]) {
                        if (var2.ay < 6) {
                           var2.z();
                        }

                        ++var2.ay;
                     }
                  } else if (var2.at == -1) {
                     if (var2.as == -1) {
                        var2.as = var2.au;
                        var2.f.b = bb[4];
                        var2.D();
                     } else {
                        var2.at = var2.au;
                        var2.x();
                     }
                  }
                  break;
               }
            }
         }

         if (k4.d(6)) {
            ++this.au;
            if (this.au > 5) {
               this.au = 0;
            }

            return;
         }

         if (k4.d(4)) {
            --this.au;
            if (this.au < 0) {
               this.au = 5;
            }

            return;
         }

         if (k4.d(8)) {
            if (this.au / 3 <= 0) {
               this.au = (byte)(this.au + 3);
               return;
            }
         } else if (k4.d(2) && this.au > 2) {
            this.au = (byte)(this.au - 3);
         }
      }
   }

   protected final void i() {
      super.i();
      if (!ft.A && !ft.B) {
         this.w();
      }
   }

   public final void b() {
      super.b();
      if (!ft.A && !ft.B) {
         this.p();
      } else {
         ft.L = (long)((int)(System.currentTimeMillis() / 1000L - ft.M));
         if (ft.A && !ft.C && !ft.B && (long)ft.N - ft.L < 0L) {
            this.aL = true;
            if (GameMidlet.k.f != ft.I) {
               if (this.aG == 0) {
                  this.aG = 1;
                  this.B();
               }

               if (this.aG == 2) {
                  this.aG = 3;
                  y();
               }
            }
         }

         fx var1 = this;
         if (this.ak.size() > 0 && this.an.size() > 0) {
            for(int var2 = 0; var2 < var1.ak.size(); ++var2) {
               js var3;
               js var4;
               if ((var4 = var3 = (js)var1.ak.elementAt(var2)).b != var4.g) {
                  if (var4.g - var4.b >> 1 == 0) {
                     var4.b = var4.g;
                  } else {
                     var4.b += var4.g - var4.b >> 1;
                  }
               }

               if (var4.c != var4.h) {
                  if (var4.h - var4.c >> 1 == 0) {
                     var4.c = var4.h;
                  } else {
                     var4.c += var4.h - var4.c >> 1;
                  }
               }

               if (var4.j && var4.b == var4.g && var4.c == var4.h) {
                  var4.i = true;
               }

               if (var3.i) {
                  var1.ak.removeElement(var3);
                  if (var1.aI) {
                     h8 var11 = (h8)var1.an.elementAt(var1.aw);
                     int var5 = b(var1.al, var1.ax);
                     var1.b(var11.d, var11.e, var11.d, var11.e, var1.aC[var1.ax][var1.aw], h(var5), var1.aw, var1.aw);
                     var1.aI = false;
                  }
               }
            }

            h8 var8 = (h8)var1.an.elementAt(var1.aw);
            if (var1.aI) {
               for(int var12 = 0; var12 < var1.ak.size(); ++var12) {
                  js var16;
                  if ((var16 = (js)var1.ak.elementAt(var12)).f == var1.av) {
                     var16.g = var8.d;
                     var16.h = var8.e;
                     var16.j = true;
                  }
               }
            }
         }

         if (this.am.size() > 0) {
            for(int var6 = 0; var6 < this.am.size(); ++var6) {
               dk var9;
               dk var13;
               if (!(var13 = var9 = (dk)this.am.elementAt(var6)).i) {
                  if (k4.n % 2 == 0) {
                     ++var13.c;
                     if (var13.c > dk.h[var13.f].length - 1) {
                        var13.c = 0;
                     }
                  }

                  var13.d = dk.h[var13.f][var13.c];
               } else {
                  var13.d = var13.g;
               }

               if (this.aK) {
                  var9.g = this.aD[var6];
                  var9.i = true;
               }
            }
         }

         for(int var7 = 0; var7 < this.aR.size(); ++var7) {
            is var10;
            int var14;
            if (b2.f((var14 = b2.b((var10 = (is)this.aR.elementAt(var7)).s - var10.a, -(var10.r - var10.b))) - var10.j) > 10) {
               var10.j -= var10.e * var10.d;
               var10.j = b2.d(var10.j);
            } else {
               var10.j = var14;
               var10.n = (byte)(var10.n + 2);
            }

            if (var10.k >= 4) {
               var10.k = 0;
            }

            ++var10.k;
            var14 = var10.n * b2.c(var10.j) >> 10;
            int var17 = -(var10.n * b2.b(var10.j)) >> 10;
            if (b2.b(var10.a, var10.b, var10.s, var10.r) >= var10.n) {
               var10.a += var14;
               var10.b += var17;
            } else {
               this.aR.removeElement(var10);
            }
         }
      }
   }

   public final void k() {
      if (!this.aH) {
         if (!this.aB[ft.g(GameMidlet.k.f)]) {
            if (this.ay < 6) {
               this.z();
            }

            ++this.ay;
            return;
         }
      } else if (this.at == -1) {
         if (this.as == -1) {
            this.as = this.au;
            super.f.b = bb[6];
            this.D();
            return;
         }

         this.at = this.au;
         this.x();
      }
   }

   public final void C() {
      super.f = ft.X;
      super.g = this.aS;
      String[] var1 = bb;
      super.f.b = var1[7];
      super.g.b = var1[5];
   }

   private void D() {
      super.g = this.aS;
      super.g.b = bb[2];
   }

   private static int b(Vector var0, int var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if (((String)var0.elementAt(var2)).equals(String.valueOf(var1))) {
            return var2;
         }
      }

      return -1;
   }

   public final void s() {
      super.s();
      this.al.removeAllElements();

      for(int var1 = 0; var1 < ft.D.size(); ++var1) {
         if (((i3)ft.D.elementAt(var1)).f != ft.I) {
            this.al.addElement(String.valueOf(var1));
         }
      }
   }

   public final void b(byte var1) {
      this.s();
      k4.h();
      this.w();
      ft.r();
      this.al.removeAllElements();
      this.t();

      for(int var2 = 0; var2 < ft.D.size(); ++var2) {
         if (((i3)ft.D.elementAt(var2)).f != ft.I) {
            this.al.addElement(String.valueOf(var2));
         }
      }

      if (GameMidlet.k.f != ft.I) {
         this.C();
      } else {
         super.f = null;
         super.g = null;
      }

      ft.C = false;
      ft.A = true;
      ft.N = var1;
      ft.M = (long)k4.j();
   }

   public final void t() {
      for(int var1 = 0; var1 < ft.ae; ++var1) {
         i3 var2;
         if ((var2 = (i3)ft.D.elementAt(var1)).f != -1) {
            var2.H = 0;
            byte var4 = 0;
            var2.q = var4;
            var2.g(var2.q);
            var2.b(aQ[ft.P[var1]].b, aQ[ft.P[var1]].c);
            if (ft.P[var1] != 2 && ft.P[var1] != 3 && ft.P[var1] != 4) {
               var2.s = var2.U = 0;
            } else {
               var2.s = var2.U = it.r;
            }
         }
      }
   }

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "mẬ\u0001DŚẁm\u000fwỖ\u0004lkẸ\n\blkẸ\nkJẹF\b\u0000l\u001bK;\bwA\u0002{Ạ\u0004wl\u001b\u0003";
      int var4 = "mẬ\u0001DŚẁm\u000fwỖ\u0004lkẸ\n\blkẸ\nkJẹF\b\u0000l\u001bK;\bwA\u0002{Ạ\u0004wl\u001b\u0003".length();
      char var1 = '\n';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = d(d(var10000));
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

                  var2 = "{Ạ\u0003ĿẴ\u0001";
                  var4 = "{Ạ\u0003ĿẴ\u0001".length();
                  var1 = 2;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] d(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   private static String d(char[] var0) {
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
               var10005 = 3;
               break;
            case 2:
               var10005 = 117;
               break;
            case 3:
               var10005 = 100;
               break;
            case 4:
               var10005 = 75;
               break;
            case 5:
               var10005 = 38;
               break;
            default:
               var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
