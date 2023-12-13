import javax.microedition.lcdui.Graphics;

public final class i0 extends iy {
   public static int S;
   private cn T;
   private byte U = 0;
   private static final String[] V;

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u001d,\u001f\u0017\n;\b4\u001a\"o\n;\b4\u001a\"o\n;\b4\u001a\"o\u0007,";
      int var4 = "\u001d,\u001f\u0017\n;\b4\u001a\"o\n;\b4\u001a\"o\n;\b4\u001a\"o\u0007,".length();
      char var1 = 3;
      int var0 = -1;

      while(true) {
         String var10002 = b(b(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            V = var5;
            S = 5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public i0(int var1, byte var2) {
      super(var1, var2);
      super.Q = 0;
      super.R = 1;
      super.d = 7;
      this.T = new cn(-10, 0, b2.e(8));
   }

   public final void a() {
      if (this.T.d == 6 || this.T.b == -10) {
         this.T.b = super.a + (super.C == 2 && super.s == 0 ? 3 : -3);
         this.T.c = super.b + 2;
      }

      ++this.T.d;
      if (this.T.d > 17 * (3 - super.C) || this.U > 0) {
         this.T.d = 0;
      }

      n var1 = f8.d(super.J);
      super.L = var1.l[super.q][super.h];
      if (b2.e(100) == 2 && this.U <= 0 && super.q == 0) {
         this.U = 8;
      }

      if (this.U > 0) {
         super.L = (byte)(2 - this.U / 3 + 2);
         --this.U;
         super.K = this.U;
         if (super.K >= 4) {
            super.K = (byte)(4 - this.U % 4);
         }

         super.K = (byte)(super.K + 5);
         super.K = (byte)(-super.K);
      } else {
         super.K = 0;
      }

      super.a();
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (this.T.d < 16) {
         var1.setColor(de.x[gx.k]);
         var1.drawRoundRect(
            (this.T.b - this.T.d / 2) * ik.c, (this.T.c - this.T.d / 4) * ik.c, this.T.d * ik.c, this.T.d / 2 * ik.c, this.T.d * ik.c, this.T.d * ik.c
         );
      }
   }

   public final void c() {
      super.M = new cn();
      super.a = super.l = super.M.b = fj.ai.b + b2.e(fj.Z - 1) * 24;
      super.b = super.m = super.M.c = fj.ai.c + 12 + b2.e(2) * 24;
      String[] var1 = V;
      new StringBuffer(var1[1]).append(super.a).append(var1[0]).append(super.b);
   }

   public final void h() {
      super.M = new cn(fj.ai.b + 30 + b2.e(fj.Z - 2) * 24, fj.ai.c + 12 + b2.e(2) * 24);
   }

   public final void b(cn var1) {
      super.M = new cn(var1.b - 10 + b2.e(20), var1.c - 10 + b2.e(20));
   }

   public final boolean c(int var1, int var2) {
      if (super.q == -1) {
         super.n = 0;
         super.o = 0;
         return true;
      } else if (super.q != 0 && super.q != 1) {
         super.n = 0;
         super.o = 0;
         return true;
      } else {
         super.q = 1;
         int var3 = super.l;
         int var4 = super.m;
         if (!gx.e(var3 + var1, var4 + var2)) {
            if (var1 != 0) {
               if (var1 > 0) {
                  super.n = super.p;
               } else {
                  super.n = -super.p;
               }
            }

            if (var2 != 0) {
               if (var2 > 0) {
                  super.o = super.p;
               } else {
                  super.o = -super.p;
               }
            }

            return false;
         } else {
            super.n = 0;
            super.o = 0;
            return true;
         }
      }
   }

   public final is j() {
      is var1;
      return !gx.e((var1 = (is)fj.K[super.R].elementAt(b2.e(fj.K[super.R].size()))).a, var1.b) && var1.g == 0 ? var1 : null;
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'X');
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
               var10005 = 61;
               break;
            case 1:
               var10005 = 12;
               break;
            case 2:
               var10005 = 63;
               break;
            case 3:
               var10005 = 3;
               break;
            case 4:
               var10005 = 45;
               break;
            case 5:
               var10005 = 21;
               break;
            default:
               var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
