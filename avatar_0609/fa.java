import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class fa extends e8 {
   public static fa z;
   private int A = 0;
   private int B = 0;
   private int C = 5;
   public int[] D;
   public int E = 0;
   private int F;
   private int G;
   private e8 H;
   public static boolean I;
   public static boolean J;
   private boolean[] K = new boolean[this.C];
   private static final String[] L;

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "C'=BwCNJ>+xw\\x\u000eC'=BwCNJ>+xw\\x";
      int var4 = "C'=BwCNJ>+xw\\x\u000eC'=BwCNJ>+xw\\x".length();
      char var1 = 14;
      int var0 = -1;

      while(true) {
         String var10002 = c(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            L = var5;
            I = false;
            J = false;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static fa g() {
      if (z == null) {
         z = new fa();
      }

      return z;
   }

   public final void d() {
      this.h();
      this.H = k4.u;
      super.d();
      this.i();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.c(this.E);
            this.H.d();
      }
   }

   public final void h() {
      super.e = new ag(hq.aW, 0);
      this.G = e8.x;
      this.F = k4.p;
      int var1 = ib.t + (ev.b << 1);
      if (this.K != null) {
         for(int var2 = 0; var2 < this.K.length; ++var2) {
            if (this.K[var2]) {
               var1 += this.G;
            }
         }

         int var4 = 176;
         if (k4.o < 176) {
            var4 = k4.o;
         }

         ib.b().b(hq.ac, var4 * ev.a, var1, 1);
         if (k4.u != this) {
            for(int var3 = 0; var3 < 3; ++var3) {
               this.K[var3] = true;
            }

            if (k4.I) {
               this.K[3] = true;
            }

            this.D = new int[this.C];
         }
      }
   }

   public final void c(int var1) {
      this.E = var1;
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      DataOutputStream var3 = new DataOutputStream(var2);

      try {
         var3.writeByte(var1);

         for(int var4 = 0; var4 < this.C; ++var4) {
            var3.writeByte(this.D[var4]);
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }

      try {
         b2.b(L[1], var2.toByteArray());
         var3.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      this.j();
      jn.c.b(var1 / 10);
   }

   public final void i() {
      this.h();
      String[] var3 = L;
      DataInputStream var1 = f5.b(var3[0]);
      I = false;
      if (var1 != null) {
         try {
            this.E = var1.readByte();
            this.D = new int[this.C];

            for(int var2 = 0; var2 < this.C; ++var2) {
               this.D[var2] = var1.readByte();
               if (this.D[var2] > 1) {
                  this.D[var2] = 0;
               }
            }

            var1.close();
         } catch (Exception var4) {
            f5.c(L[1]);
         }

         this.j();
         jn.c.b(this.E / 10);
      }
   }

   private void j() {
      if (k4.I) {
         J = this.D[3] == 1;
      }

      k4.b();
   }

   public final void c() {
      super.c();
      if (k4.d(2)) {
         this.d(-1);
      } else if (k4.d(8)) {
         this.d(1);
      } else if (k4.d(4)) {
         this.f(-1);
      } else if (k4.d(6)) {
         this.f(1);
      }

      if (k4.i && k4.d(ib.b().h, ib.b().i, ib.b().g, ib.b().f)) {
         k4.i = false;
         if (k4.d(ib.b().h, ib.b().i, ib.b().g, ib.b().f)) {
            int var1;
            for(int var2 = var1 = (k4.k - (ib.b().i + ib.t + ev.b)) / this.G; var2 >= 0; --var2) {
               if (!this.K[var2]) {
                  ++var1;
               }
            }

            if (var1 == this.B) {
               if (this.D[this.B] == 1) {
                  this.f(-1);
               } else {
                  this.f(1);
               }
            }

            if (var1 >= this.C) {
               var1 = this.C - 1;
            }

            this.B = var1;
         }
      }
   }

   private void d(int var1) {
      while(true) {
         this.B += var1;
         if (this.B < 0) {
            this.B = this.C - 1;
         }

         if (this.B >= this.C) {
            this.B = 0;
         }

         if (this.K[this.B]) {
            return;
         }

         var1 /= b2.f(var1);
         this = this;
      }
   }

   private void f(int var1) {
      if (this.B == 2) {
         this.E += var1 * 10;
         if (this.E < 0) {
            this.E = 100;
         }

         if (this.E > 100) {
            this.E = 0;
            return;
         }
      } else {
         if (this.D[this.B] == 0) {
            this.D[this.B] = 1;
            return;
         }

         this.D[this.B] = 0;
      }
   }

   public final void b() {
      this.H.b();
      if (this.F != 0) {
         this.F += -this.F >> 1;
         if (this.F < 0) {
            this.F = 0;
         }
      }
   }

   public final void b(Graphics var1) {
      this.H.a(var1);
      this.a(var1);
      super.b(var1);
   }

   public final void a(Graphics var1) {
      var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
      var1.translate(0, this.F);
      ib.b().b(var1);
      var1.translate(k4.q - 65, ib.b().i + ib.t + ev.b);
      if (this.A >= 4) {
         this.A = 0;
      }

      int var3 = -ev.j / 2 + this.G / 2;
      int var4 = 0;

      for(int var5 = 0; var5 < this.C; ++var5) {
         if (this.K[var5]) {
            k4.S.b(var1, hq.dW[var5][2], -50 * (ev.a - 1), var4 + var3, 0);
            k4.S.b(var1, hq.dW[var5][this.D[var5]], 52 + 50 * ev.a, var4 + var3 - 1, 2);
            byte var2 = 0;
            int var6;
            if ((var6 = k4.S.b(hq.dW[var5][this.D[var5]]) + 10 + 15 * (k4.ah + 1) + ib.c.b) < 25 * ev.a) {
               var6 = 25 * ev.a;
            }

            if (var5 == this.B) {
               var2 = 1;
            }

            int var7 = var4 + var3 + ev.j / 2 - ib.c.c / 2;
            ib.c.b(var2, 52 + 50 * ev.a - var6 / 2, var7, 0, var1);
            ib.c.b(var2, 52 + 50 * ev.a + var6 / 2 - ib.c.b, var7, 2, var1);
            var4 += this.G;
         }
      }

      k4.S.b(var1, String.valueOf(this.E), 52 + 50 * ev.a, 2 * this.G + var3, 2);
      ++this.A;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
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
               var10005 = 34;
               break;
            case 1:
               var10005 = 81;
               break;
            case 2:
               var10005 = 92;
               break;
            case 3:
               var10005 = 54;
               break;
            case 4:
               var10005 = 22;
               break;
            case 5:
               var10005 = 49;
               break;
            default:
               var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
