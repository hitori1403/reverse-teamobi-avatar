import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class dq {
   private int a;
   public int b;
   public int c;
   public int d;
   private int f;
   private static short g;
   public String[] h;
   private static g_[] i;
   private static Image[] j;
   private byte k = 0;

   static {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "\u0010X\u0003\u0012h\f\u0002\u0012h";
      int var5 = "\u0010X\u0003\u0012h\f\u0002\u0012h".length();
      char var2 = 2;
      int var1 = -1;

      while(true) {
         String var10002 = a(a(var3.substring(++var1, var1 + var2)));
         boolean var10001 = true;
         var6[var4++] = var10002;
         if ((var1 += var2) >= var5) {
            i = new g_[2];
            j = new Image[2];
            bp.c(hq.ax);
            g = 8;
            i[0] = g_.b("c", g, g);
            i[1] = g_.b(var6[0], g, g);
            j[0] = bp.b(var6[2]);
            j[1] = bp.b(var6[1]);
            bp.b();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   public dq() {
   }

   public dq(int var1, String var2, byte var3) {
      this.k = var3;
      this.b(var1, var2);
   }

   public final void b(int var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   public final boolean b() {
      if (this.a > 0) {
         --this.a;
      }

      if (this.a == 0) {
         return true;
      } else {
         if (k4.u == ft.z) {
            if (this.c - this.d < 0) {
               this.c = this.d + 10;
            }

            if (this.b - 30 < 0) {
               this.b = 32;
            }

            if (this.b + 30 > k4.o) {
               this.b = k4.o - 40;
            }
         }

         return false;
      }
   }

   public final void b(int var1, String var2) {
      this.f = 80 * ev.a;
      this.h = k4.V.b(var2, this.f - 25);
      this.d = ev.h * this.h.length + 4 + 4;
      if (this.d < g << 1) {
         this.d = g << 1;
      }

      if (this.h.length == 1) {
         this.f = k4.V.b(this.h[0]) + 20;
      }

      if (this.f < 30 * ev.a) {
         this.f = 30 * ev.a;
      }

      this.a = var1;
   }

   public final void b(Graphics var1) {
      int var2 = ev.a;
      if (k4.u == ft.z) {
         var2 = 1;
      }

      b(var1, this.b * var2 - this.f / 2, this.c * var2 - this.d, this.f, this.d, this.k == 1 ? 16773580 : 16777215, this.k == 1 ? 14957056 : 1, this.k);
      var1.drawImage(j[this.k], this.b * var2, this.c * var2 - 1, 17);
      byte var3 = ev.h;

      for(int var4 = 0; var4 < this.h.length; ++var4) {
         k4.V.b(var1, this.h[var4], this.b * var2 - this.f / 2 + this.f / 2, this.c * var2 - this.d / 2 + var4 * var3 - this.h.length * var3 / 2, 2);
      }
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      i[var7].b(0, var1, var2, 0, var0);
      i[var7].b(1, var1 + var3 - g, var2, 0, var0);
      i[var7].b(3, var1, var2 + var4 - g, 0, var0);
      i[var7].b(2, var1 + var3 - g, var2 + var4 - g, 0, var0);
      var0.setColor(var5);
      var0.fillRect(var1 + g, var2, var3 - (g << 1), g);
      var0.fillRect(var1 + g, var2 + var4 - g, var3 - (g << 1), g - 1);
      var0.fillRect(var1, var2 + g, var3, var4 - (g << 1));
      var0.setColor(var6);
      var0.fillRect(var1 + g, var2, var3 - (g << 1), 1);
      var0.fillRect(var1 + g, var2 + var4 - 1, var3 - (g << 1), 1);
      var0.fillRect(var1, var2 + g, 1, var4 - (g << 1));
      var0.fillRect(var1 + var3 - 1, var2 + g, 1, var4 - (g << 1));
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '=');
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
               var10005 = 115;
               break;
            case 1:
               var10005 = 26;
               break;
            case 2:
               var10005 = 109;
               break;
            case 3:
               var10005 = 64;
               break;
            case 4:
               var10005 = 1;
               break;
            case 5:
               var10005 = 85;
               break;
            default:
               var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
