import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fr extends e8 {
   public static fr z;
   public static byte A;
   public static byte B;
   public static byte C;
   public static g_ D;
   private static Image E;
   private static Image F;
   private static Image G;
   private static Image H;
   private int I;
   Vector J;
   private int K;
   private int L;
   public byte M;
   private short N;
   private ag O = new ag(hq.P, 1);
   public static Image P;
   int Q;
   private static final String[] R;

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\u001cwờ\u001f\u0004\u001bẑ=>xỐJO[<êt\u0016\u0004žỗtFò\u001fCOġẗ>n\u0019E\u0002\u00103w{QI\u008f^t}rǐMC\u00106ếtQG\u009c\u00109kị\u001f\u0004\u0001ẑ$>n\u0019Î\u0002\u0010\föt\u0016\u0004\u0004X p}N\u000e{qt^M\u0002W\u0004r{\b\n\u0000^\u0013{qt^M\u0002W\u001akw!H\u000eI1l4\u001eJ\u0006\u0004vè\u001fCO\u0007ńạtQF\u008f^";
      int var4 = "\u001cwờ\u001f\u0004\u001bẑ=>xỐJO[<êt\u0016\u0004žỗtFò\u001fCOġẗ>n\u0019E\u0002\u00103w{QI\u008f^t}rǐMC\u00106ếtQG\u009c\u00109kị\u001f\u0004\u0001ẑ$>n\u0019Î\u0002\u0010\föt\u0016\u0004\u0004X p}N\u000e{qt^M\u0002W\u0004r{\b\n\u0000^\u0013{qt^M\u0002W\u001akw!H\u000eI1l4\u001eJ\u0006\u0004vè\u001fCO\u0007ńạtQF\u008f^"
         .length();
      char var1 = 'Q';
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
                     R = var5;
                     A = 1;
                     B = 2;
                     C = A;
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

                  var2 = "{qt^M\u0002W\u0018qy\u001a\n\u0000^\u0014{qt^M\u0002W?vo\u001fC\u001c_6\u007ft_K\u0001";
                  var4 = "{qt^M\u0002W\u0018qy\u001a\n\u0000^\u0014{qt^M\u0002W?vo\u001fC\u001c_6\u007ft_K\u0001".length();
                  var1 = 14;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fr g() {
      return z == null ? (z = new fr()) : z;
   }

   public final void d() {
      fp.k();
      e8.f();
      super.t = 0;
      k4.aa.c(C);
      if (E == null) {
         try {
            StringBuffer var10000 = new StringBuffer(String.valueOf(hq.b()));
            String[] var1 = R;
            E = Image.createImage(var10000.append(var1[6]).toString());
            F = Image.createImage(hq.b() + var1[2]);
            G = Image.createImage(hq.b() + var1[1]);
            H = Image.createImage(hq.b() + var1[5]);
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }

      k4.O = 1;
      super.l = true;
      GameMidlet.k.t = false;
      super.d();
   }

   public fr() {
      super.g = new ag(hq.e, 2);
      if (k4.ah != 0) {
         super.f = new ag(hq.j, 5);
      } else {
         super.f = this.O;
      }

      super.e = new ag(hq.d, 6);
      this.N = (short)(110 * ev.a);
      if (k4.ah == 1) {
         this.N = 95;
      } else if (k4.ah == 0) {
         this.N = (short)(k4.o / 4);
         if (this.N < 70) {
            this.N = (short)(k4.o / 3);
         }

         if (k4.o < 180) {
            this.N = (short)(k4.o / 2);
         }
      }

      this.I = k4.o / this.N + 1;
      if (this.I * this.N > k4.o - this.N / 2) {
         --this.I;
      }

      this.K = this.N / 2;
      this.L = this.N / 2;
      this.L += 10;
      if (k4.o > this.I * this.N) {
         this.K = (k4.o - this.I * this.N) / 2 + this.N / 2;
      }
   }

   public final void e() {
      k4.i();
      j();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 1:
            ck var4 = (ck)this.J.elementAt(super.t);
            if (AutoController.W && var4.g > GameMidlet.k.A[3]) {
               g().i();
               return;
            } else {
               if (var4.e) {
                  k4.x.b(hq.Y, new c1(this), 2);
                  return;
               }

               h1.b().b(this.M, var4.b, "");
               k4.i();
               return;
            }
         case 2:
            j();
            return;
         case 3:
            this.a(1, -1);
            return;
         case 4:
            this.h();
            return;
         case 5:
            k4.i();
            h1.b().d();
            return;
         case 6:
            Vector var3;
            (var3 = new Vector()).addElement(new ag(hq.j, 5));
            var3.addElement(new ag(R[4], 6));
            var3.addElement(AutoController.h().F);
            var3.addElement(new ag(hq.an, 7));
            f1.d().b(var3, 0);
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 1:
            k4.d(hq.c);
            h1.b().b(this.M);
            return;
         case 3:
            k4.i();
            hx.b().d(GameMidlet.k.f);
            return;
         case 4:
            j();
            return;
         case 5:
            k4.i();
            h1.b().d();
            return;
         case 6:
            this.h();
            return;
         case 7:
            k4.i();
            hx.b().d(GameMidlet.k.f);
         case 2:
      }
   }

   private void h() {
      k4.x.b(hq.ao, new cy(this), 3);
   }

   public final void i() {
      k4.b(R[0], new cz());
   }

   private static void j() {
      k4.B.w = false;
      h1.b().c();
      k4.i();
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      fh.b(var1, R[3] + fh.C + " " + this.M);
      Graphics var3 = var1;
      fr var2 = this;
      var1.translate(this.K, this.L);
      var1.translate(0, -g5.r);
      int var4;
      if ((var4 = g5.r / this.N * this.I - this.I) < 0) {
         var4 = 0;
      }

      int var5;
      if ((var5 = var4 + k4.p / this.N * this.I + (this.I << 1) + this.I) > this.J.size()) {
         var5 = this.J.size();
      }

      for(; var4 < var5; ++var4) {
         int var6 = var4 % var2.I * var2.N;
         int var7 = var4 / var2.I * var2.N;
         ck var8 = (ck)var2.J.elementAt(var4);
         if ((!k4.M || !var2.l) && var4 == var2.t) {
            var3.drawImage(P, var6, var7, 3);
         }

         D.b(var8.c, var6, var7, 0, 3, var3);
         var3.drawImage(E, var6 - var2.N / 4, var7 - 30 * ev.a, 3);
         k4.Y.b(var3, "" + var8.b, var6 - var2.N / 4, var7 - 30 * ev.a - ev.k / 2, 2);
         if (var8.g > 0) {
            k4.Y.b(var3, var8.h, var6, var7 - 30 * ev.a - ev.k / 2, 2);
         }

         if (C == A && var8.d < 4) {
            var3.drawImage(F, var6 + var2.N / 4, var7 - 30 * ev.a, 3);
            k4.X.b(var3, "" + var8.d, var6 + var2.N / 4, var7 - 30 * ev.a - ev.k / 2, 2);
         }

         if (var8.f) {
            var3.drawImage(F, var6 - var2.N / 4, var7 + var2.N / 3, 3);
            var3.drawImage(G, var6 - var2.N / 4, var7 + var2.N / 3, 3);
         }

         if (var8.e) {
            var3.drawImage(F, var6 + var2.N / 4, var7 + var2.N / 3, 3);
            var3.drawImage(H, var6 + var2.N / 4, var7 + var2.N / 3, 3);
         }
      }

      fp.b(var1, super.e, super.f, super.g);
      k4.c(var1);
   }

   public final void c() {
      if (fp.O && k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }

   public final void k() {
      int var1 = this.J.size() / this.I;
      if (this.J.size() % this.I != 0) {
         ++var1;
      }

      this.L = 100 * ev.a;
      if (k4.o < 200) {
         this.L = 50;
      }

      k4.B
         .b(
            this.K - this.N / 2,
            this.L - this.N / 2,
            this.N,
            this.N,
            this.I * this.N,
            var1 * this.N + 10,
            this.I * this.N,
            k4.p - (this.L - this.N / 2) - 4,
            this.J.size()
         );
   }

   public final void b(int var1, boolean var2) {
      if (var2 && super.t == var1 && this.O != null) {
         this.O.a();
      }

      if (var1 >= 0 && var1 < this.J.size()) {
         super.b(var1, var2);
      }
   }

   public final void b() {
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '0');
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
               var10005 = 84;
               break;
            case 1:
               var10005 = 30;
               break;
            case 2:
               var10005 = 26;
               break;
            case 3:
               var10005 = 113;
               break;
            case 4:
               var10005 = 36;
               break;
            case 5:
               var10005 = 111;
               break;
            default:
               var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
