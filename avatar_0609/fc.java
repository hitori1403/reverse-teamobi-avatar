import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class fc extends e8 {
   public static fc z;
   private g_ A;
   public g_ B;
   private byte[] C;
   private Vector D;
   private byte E;
   private byte F;
   private byte G = 16;
   public int H;
   public int I;
   private static Image J;
   private static Image K;
   public int L;
   private static int M;
   public static int N;
   private static int O;
   private static int P;
   private static int Q;
   private static int R;
   public static int S;
   private static int T;
   private static int U;
   private static int V;
   public gq W;
   public static String X;
   private boolean Y;
   public static boolean Z;
   public static Image[] aa;
   private static Vector ab;
   private static g_ ac;
   public ag ad;
   private ag ae;
   private int af;
   private int ag;
   private int ah;
   private int ai;
   boolean aj = false;
   private int ak;
   private int al;
   private long am;
   private long an;
   public static gq ao;
   public static byte ap;
   private static final String[] bb;

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "\u0016\u00058o4\u0011S\r\u000e\u0018H*=M\u0018\u0002\u00060s\u0010:\u0003\u001fsẐ\u0016\u0000\r\u008b\u0003*8\u0010OỚ\u0005\u0002\f\u001b\u0003\n\"\t\u0003YKJ\u0013ũŨ\u0004ms\u0013ÝY\u001f\u0002ê=\u0010\u0000\u001a\u009f\u0004m}";
      int var4 = "\u0016\u00058o4\u0011S\r\u000e\u0018H*=M\u0018\u0002\u00060s\u0010:\u0003\u001fsẐ\u0016\u0000\r\u008b\u0003*8\u0010OỚ\u0005\u0002\f\u001b\u0003\n\"\t\u0003YKJ\u0013ũŨ\u0004ms\u0013ÝY\u001f\u0002ê=\u0010\u0000\u001a\u009f\u0004m}"
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
                     Z = false;
                     aa = new Image[2];
                     ab = new Vector();
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

                  var2 = "\u001b4\u001a\t-\u0019\u000fes?A\u0014\u000e";
                  var4 = "\u001b4\u001a\t-\u0019\u000fes?A\u0014\u000e".length();
                  var1 = 3;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fc g() {
      return z == null ? (z = new fc()) : z;
   }

   public final void d() {
      super.d();
      if (!ih.b) {
         k4.h();
      }

      if (gx.G != -1) {
         k4.h();
      }

      super.e = this.ad;
      if (k4.N) {
         (k4.H = new ew()).e();
         super.e = null;
      } else if (e8.u > 0 && ap == 1) {
         fm.g().b(k4.u);
      }

      if (k4.O == 0) {
         k4.O = 1;
      }

      k4.E.removeAllElements();
      this.j();
      AutoController.h();
      AutoController.an = -1;
   }

   public fc() {
      bp.c(hq.ax);
      String[] var1 = bb;
      this.B = g_.b(var1[2], 13 * ev.a, 11 * ev.a);
      bp.b();
      bp.c(hq.aw);
      J = bp.b(var1[3]);
      K = bp.b(var1[6]);
      bp.b();
      this.ad = new ag(hq.d, 0);
      super.e = this.ad;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            if (k4.H == null || !ew.y) {
               Vector var4;
               Vector var10000 = var4 = new Vector();
               String[] var3 = bb;
               var10000.addElement(new ag(var3[7], new cu(this)));
               var4.addElement(new ag(var3[1], new ke()));
               if (k4.ah == 0) {
                  var4.addElement(AutoController.h().F);
               }

               var4.addElement(new ag(hq.ac, 1));
               var4.addElement(new ag(hq.b8, 2));
               if (!fi.ac) {
                  var4.addElement(new ag(hq.b9, 3));
               }

               var4.addElement(new ag(hq.cg, 4));
               var4.addElement(new ag(hq.ck, 5));
               var4.addElement(new ag(hq.y, 6));
               f1.d().b(var4, 0);
            }

            return;
         case 1:
            AutoController.h().d();
            ac = null;
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 1:
            fa.g().d();
            return;
         case 2:
            hx.b().b((byte)6, "");
            return;
         case 3:
            AutoController var7 = AutoController.h();
            cs[] var9 = new cs[3];

            for(int var10 = 0; var10 < 3; ++var10) {
               var9[var10] = new cs();
               cs var10000 = var9[var10];
               byte var5 = 2;
               var10000.z = var5;
            }

            var9[0].b(true);
            ag var11 = new ag(hq.b_, new jz(var7, var9));
            e5.e().b(var9, hq.b9, hq.dV, var11);
            k4.D = e5.e();
            return;
         case 4:
            Form var6 = new Form(hq.ch);
            TextField var8 = new TextField(hq.ci, "", 50, 3);
            var6.append(var8);
            var6.append(hq.cj);
            Command var3 = new Command(hq.A, 4, 1);
            var6.addCommand(var3);
            Command var4 = new Command(hq.e, 2, 1);
            var6.addCommand(var4);
            var6.setCommandListener(new f2(var3, var8));
            Display.getDisplay(GameMidlet.j).setCurrent(var6);
            return;
         case 5:
            hx.b().b((byte)3, null);
            return;
         case 6:
            AutoController.h().z();
            return;
         case 7:
            ew.m();
            (k4.H = new ew()).e();
            super.e = null;
      }
   }

   public final void e() {
      if (!Z && k4.u != ff.z) {
         AutoController.h().d();
         ac = null;
      } else {
         AutoController.h().z();
      }
   }

   public final void b(g_ var1, byte[] var2, Vector var3, int var4, ag var5) {
      f5.d((short)839);
      GameMidlet.k.t = false;
      this.G = (byte)var4;
      this.A = var1;
      this.C = var2;
      this.D = var3;
      this.E = 34;
      this.ae = var5;
      if (k4.ah == 0) {
         super.f = var5;
      }

      this.F = (byte)(var2.length / this.E);
      super.g = null;
      this.h();
      this.W = null;
      ab.removeAllElements();

      for(int var6 = 0; var6 < 7; ++var6) {
         Vector var10000 = ab;
         int var10003 = var6 * this.E * this.G / 10 + 50;
         new b2();
         int var10004 = b2.e(10) * (this.F * this.G / 10) + 20;
         new b2();
         var10000.addElement(new cn(var10003, var10004, b2.e(2)));
      }

      R = S = N = M = this.L = 0;
      this.j();
      if (Z) {
         bp.c(hq.aw);
         ac = new g_(bp.b("k"), 40 * ev.a, 40 * ev.a);
         bp.b();
      }
   }

   public final void h() {
      this.H = (k4.o - this.E * this.G) / 2;
      this.I = (k4.s - k4.ab - this.F * this.G) / 2;
      if (this.H < 0) {
         this.H = 0;
      }

      if (this.I < 0) {
         this.I = 0;
      }

      Q = this.E * this.G - k4.o;
      V = this.F * this.G - k4.s;
      if (Q < 0) {
         N = 0;
         Q = 0;
      }

      if (V < 0) {
         S = 0;
         V = 0;
      }
   }

   public final void b() {
      if (this.af != 0) {
         if (S < 0 || S > V) {
            this.af -= this.af / 4;
            S += this.af / 20;
            if (this.af / 10 <= 1) {
               this.af = 0;
            }
         }

         R = S += this.af / 10;
         this.af -= this.af / 10;
         if (this.af / 10 == 0) {
            this.af = 0;
         }
      }

      if (S < 0) {
         R = 0;
         this.af = 0;
      } else if (S > V) {
         R = V;
         this.af = 0;
      }

      if (this.ag != 0) {
         if (N < 0 || N > Q) {
            this.ag -= this.ag / 4;
            N += this.ag / 20;
            if (this.ag / 10 <= 1) {
               this.ag = 0;
            }
         }

         N += this.ag / 10;
         this.ag -= this.ag / 10;
         M = N;
         if (this.ag / 10 == 0) {
            this.ag = 0;
         }
      }

      if (N < 0) {
         M = 0;
         this.ag = 0;
      } else if (N > Q) {
         M = Q;
         this.ag = 0;
      }

      if (S != R) {
         U = R - S << 2;
         T += U;
         S += T >> 4;
         T &= 15;
      }

      if (N != M) {
         P = M - N << 2;
         O += P;
         N += O >> 4;
         O &= 15;
      }

      if (R < 0 || S < 0) {
         S = 0;
         R = 0;
      }

      if (R > V || S > V) {
         R = S = V;
      }

      if (M < 0 || N < 0) {
         N = 0;
         M = 0;
      }

      if (M > Q || N > Q) {
         M = N = Q;
      }

      for(int var1 = 0; var1 < ab.size(); ++var1) {
         cn var2;
         cn var10000 = var2 = (cn)ab.elementAt(var1);
         var10000.b -= var2.d + (k4.n % 5 == 1 ? 1 : 0);
         if (var2.b < -this.H - 50) {
            int var10001 = this.H;
            new b2();
            var2.b = var10001 + b2.e(4) * 50 + this.E * this.G;
            new b2();
            var2.c = b2.e(10) * (this.F * this.G / 10) + 10;
            new b2();
            var2.d = b2.e(2);
         }
      }
   }

   public static void i() {
      fj.M = "e";
      fb.S = "f";
      fi.Z = "a";
      AutoController.h();
      AutoController.L = k4.b(X, -2);
   }

   public final void c() {
      ++this.an;
      if (k4.H == null || !ew.y) {
         super.c();
      }

      this.aj = false;
      if (k4.d(0, 0, k4.o, k4.p)) {
         int var1 = k4.k();
         int var2 = k4.l();
         if (k4.H == null && k4.i) {
            k4.i = false;

            for(int var3 = 0; var3 < this.D.size(); ++var3) {
               ho var4 = (ho)this.D.elementAt(var3);
               if (k4.d(this.H + var4.b * this.G + this.G / 2 - 24 * ev.a - N, this.I + var4.c * this.G - 56 * ev.a - S, 48 * ev.a, 56 * ev.a)) {
                  this.L = var3;
                  return;
               }
            }
         }

         if (k4.g) {
            if (k4.n % 3 == 0) {
               this.ak = k4.k;
               this.al = k4.j;
               this.am = this.an;
            }

            this.af = 0;
            this.ag = 0;
            if (!this.Y) {
               this.Y = true;
               this.ah = N;
               this.ai = S;
            }

            R = this.ai + var2;
            M = this.ah + var1;
            k();
            S = R;
            N = M;
         }

         if (k4.h) {
            int var5 = (int)(this.an - this.am);
            int var6 = this.ak - k4.k;
            if (var5 < 10) {
               if (R >= 0 && R < V) {
                  this.af = var6 / var5 * 10;
               }

               var6 = this.al - k4.j;
               if (M >= 0 && M < Q) {
                  this.ag = var6 / var5 * 10;
               }
            }

            this.am = -1L;
            this.Y = false;
            new b2();
            if (b2.f(var1) < 10) {
               new b2();
               if (b2.f(var2) < 10) {
                  ho var8 = (ho)this.D.elementAt(this.L);
                  if (k4.d(this.H + var8.b * this.G + this.G / 2 - 24 * ev.a - N, this.I + var8.c * this.G - 56 * ev.a - S, 48 * ev.a, 56 * ev.a)) {
                     this.ae.a();
                     return;
                  }

                  M = k4.j + N - k4.q;
                  R = k4.k + S - k4.r;
                  k();
               }
            }
         }
      }

      if (this.W == null) {
         if (k4.d(2) || k4.d(4)) {
            --this.L;
            if (this.L < 0) {
               this.L = this.D.size() - 1;
            }

            this.aj = true;
         } else if (k4.d(8) || k4.d(6)) {
            ++this.L;
            if (this.L >= this.D.size()) {
               this.L = 0;
            }

            this.aj = true;
         }
      } else if (k4.H == null) {
         this.W.b();
      }

      if (this.aj) {
         this.j();
      }
   }

   private void j() {
      ho var1;
      M = (var1 = (ho)this.D.elementAt(this.L)).b * this.G - k4.o / 2;
      R = var1.c * this.G - k4.s / 2;
      k();
   }

   private static void k() {
      if (R < 0) {
         R = 0;
      }

      if (R > V) {
         R = V;
      }

      if (M < 0) {
         M = 0;
      }

      if (M > Q) {
         M = Q;
      }
   }

   public final void b(Graphics var1) {
      this.a(var1);
      if (k4.H == null || !ew.y) {
         super.b(var1);
      }

      k4.b(var1);
   }

   public final void a(Graphics var1) {
      k4.d(var1);
      var1.setColor(0);
      var1.fillRect(0, 0, k4.o, k4.s);
      var1.translate(this.H, this.I);
      var1.translate(-N, -S);

      for(int var2 = 0; var2 < this.C.length; ++var2) {
         byte var4;
         int var3 = (var4 = this.C[var2]) / this.A.d;
         this.A.c(var3, var4 % this.A.d, var2 % this.E * this.G, var2 / this.E * this.G, var1);
      }

      for(int var8 = 0; var8 < this.D.size(); ++var8) {
         ho var12 = (ho)this.D.elementAt(var8);
         if (var8 == this.L) {
            var1.drawImage(K, var12.b * this.G + this.G / 2, var12.c * this.G, 33);
            if (Z) {
               ac.b(var8, var12.b * this.G + this.G / 2, var12.c * this.G - 12 * ev.a, 0, 33, var1);
            } else {
               f5.b(var1, var12.e, var12.b * this.G + this.G / 2, var12.c * this.G - 12 * ev.a, 33);
            }
         } else {
            var1.drawImage(J, var12.b * this.G + this.G / 2, var12.c * this.G - var12.f / 3, 33);
            ++var12.f;
            if (var12.f >= 9) {
               var12.f = 0;
            }
         }
      }

      Graphics var13 = var1;
      fc var9 = this;

      for(int var10 = 0; var10 < var9.D.size(); ++var10) {
         ho var5;
         int var6 = (var5 = (ho)var9.D.elementAt(var10)).b * var9.G;
         int var7;
         if ((var7 = var5.c * var9.G) < S + 50) {
            var7 = S + 50;
         }

         if (var7 > S + k4.s - 20) {
            var7 = S + k4.s - 20;
         }

         if (var6 < N + 20) {
            var6 = N + 20;
         }

         if (var6 > N + k4.o - 47) {
            var6 = N + k4.o - 47;
         }

         k4.T.b(var13, var5.d, var6 + 10, var7 - (var10 == var9.L ? 70 * ev.a : 35 * ev.a) - var5.f / 3, 2);
      }

      Graphics var14 = var1;

      for(int var11 = 0; var11 < ab.size(); ++var11) {
         cn var15;
         if ((var15 = (cn)ab.elementAt(var11)).b > N - 30 && var15.b < N + 30 + k4.o && var15.c > S - 20 && var15.c < S + 20 + k4.p) {
            var14.drawImage(aa[var15.d], var15.b, var15.c, 3);
         }
      }

      k4.d(var1);
   }

   public final void b(byte var1, String var2, String var3, String var4) {
      String[] var5 = bb;
      new StringBuffer(var5[0]).append(var3).append(var5[4]).append(var4);
      if (var1 == 0) {
         ao = new c_(this, var2);
      } else if (var1 == 1) {
         ao = new b4(this, var2);
      } else {
         if (var1 == 2) {
            fi.g().A.b(var3);
            fi.g().B.b(var4);
            fi.g().p();
            k4.c(bb[5]);
            ao = null;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ ' ');
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
               var10005 = 121;
               break;
            case 1:
               var10005 = 107;
               break;
            case 2:
               var10005 = 106;
               break;
            case 3:
               var10005 = 10;
               break;
            case 4:
               var10005 = 83;
               break;
            case 5:
               var10005 = 120;
               break;
            default:
               var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
