import javax.microedition.lcdui.Graphics;

public final class im extends il {
   public int h;
   public int i;
   public int j;
   public short k;
   public short l = -1;
   public long m;
   public boolean n;
   public boolean o;
   public boolean p;
   public boolean q = false;
   public byte r;
   public byte s;
   public byte t;
   public byte u;
   public int v;
   private static final String w;

   public final void b(Graphics var1) {
      if (super.a * ik.c >= cl.b().c - 10 && this.h * ik.c <= cl.b().c + k4.o + 10) {
         if (this.q) {
            var1.drawImage(fj.P, (super.a - 13) * ik.c, (super.b - 18) * ik.c, 0);
         }

         int var2 = fj.af.b;
         int var3 = fj.af.c;
         if (this.h == var2 && this.i == var3) {
            k4.Y.b(var1, w + this.u, super.a * ik.c, (super.b - 44) * ik.c, 2);
         }

         if (this.j != -1) {
            br var4;
            (var4 = f8.c(this.j)).b(var1, this.v, super.a * ik.c, super.b * ik.c, 33);
            int var5 = var4.f * 60 + var4.g * 60;
            if ((this.k <= var5 || var4.g == -1) && this.r != 100 && this.k >= 0) {
               if (this.p) {
                  var1.drawImage(fj.L[1], (super.a + 5) * ik.c, (super.b - 12) * ik.c, 3);
               }

               if (this.o) {
                  var1.drawImage(fj.L[0], (super.a - 7) * ik.c, super.b * ik.c, 3);
               }

               if (this.h == var2 && this.i == var3 || this.l != -1 && this.l == fj.aq) {
                  var2 = var2 * 24 * ik.c;
                  var3 = var3 * 24 * ik.c;
                  if (this.l != -1 && this.l == fj.aq) {
                     var2 = this.h * 24 * ik.c;
                     var3 = this.i * 24 * ik.c;
                  }

                  var4.b(var1, 7, var2 - 3, var3 - 40 * ik.c, 33);
                  var1.setColor(1);
                  var1.fillRect(var2 - 4 * ik.c, var3 - 38 * ik.c, 31 * ik.c, 5 * ik.c);
                  var1.setColor(65280);
                  var1.fillRect(var2 - 3 * ik.c, var3 - 37 * ik.c, this.s * 30 / 100 * ik.c, 3 * ik.c);
                  var1.setColor(2512938);
                  var1.drawRect(var2 - 4 * ik.c, var3 - 38 * ik.c, 31 * ik.c, 4 * ik.c);
                  long var6 = (long)(var4.f * 60 * 60) - this.m;
                  long var8 = (long)(var4.f * 60 - this.k);
                  String var19 = "";
                  if (var6 < 0L) {
                     var6 = 0L;
                  }

                  long var10 = var6 / 60L / 60L;
                  long var12 = var6 / 60L % 60L;
                  long var14 = var6 % 60L;
                  String var20 = var19 + var10 + ":" + var12 + ":" + var14;
                  if (var8 <= 0L || var6 <= 0L) {
                     var20 = hq.bZ;
                  }

                  k4.Y.b(var1, var20, var2 + 5 * ik.c, var3 - 49 * ik.c, 0);
                  if ((var5 = this.k * 100 / (var4.f * 60) * 30 / 100) == false) {
                     var5 = 1;
                  }

                  if (var5 >= 30) {
                     var5 = 29;
                  }

                  if (var4.f * 60 - this.k < 0) {
                     var5 = 30;
                  }

                  var1.setColor(1);
                  var1.fillRect(var2 - 4 * ik.c, var3 - 32 * ik.c, 31 * ik.c, 5 * ik.c);
                  var1.setColor(255, 255, 0);
                  var1.fillRect(var2 - 3 * ik.c, var3 - 31 * ik.c, var5 * ik.c, 3 * ik.c);
                  var1.setColor(2512938);
                  var1.drawRect(var2 - 4 * ik.c, var3 - 32 * ik.c, 31 * ik.c, 4 * ik.c);
                  byte var18 = 0;
                  if (this.p) {
                     var18 = 1;
                     fj.R.b(1, var2 + (5 + (this.o ? 6 : 0)) * ik.c, var3 - 22 * ik.c, 0, var1);
                  }

                  if (this.o) {
                     fj.R.b(0, var2 + (4 - var18 * 6) * ik.c, var3 - 22 * ik.c, 0, var1);
                  }
               }
            }
         }
      }
   }

   static {
      String var10002 = a(a("|C"));
      boolean var10001 = true;
      w = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'P');
      }

      return var10000;
   }

   private static String a(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 16;
               break;
            case 1:
               var10005 = 53;
               break;
            case 2:
               var10005 = 25;
               break;
            case 3:
               var10005 = 32;
               break;
            case 4:
               var10005 = 78;
               break;
            case 5:
               var10005 = 42;
               break;
            default:
               var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
