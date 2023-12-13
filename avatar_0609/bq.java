import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bq {
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private static byte g;
   private static byte h;
   public static cn i;
   public static boolean j = false;
   private static boolean k = false;
   private Image l;
   private static final String a;

   static {
      String var10002 = a(a("\u0002E3"));
      boolean var10001 = true;
      a = var10002;
   }

   public final void b(byte var1) {
      if (!j && GameMidlet.k.q != -1) {
         bp.c(hq.au);
         this.l = bp.b(a);
         bp.b();
         h = var1;
         if (var1 == 1) {
            cl.b().c = cl.b().e = i.b * ev.a - k4.q - 300;
         }

         this.c = gx.g * gx.j + (k4.ah != 0 ? k4.ab : 0) / ev.a + 20 * ev.a;
         this.b = i.b + 300;
         this.d = this.e = 15;
         this.f = 0;
         g = 1;
         j = true;
         byte var2 = -1;
         i3 var3 = GameMidlet.k;
         GameMidlet.k.q = var2;
         cl.p = true;
         k = false;
         if (h == 1) {
            GameMidlet.k.t = true;
         }
      }
   }

   public final void b() {
      if ((g == 1 && h == 1 || g == -1 && h == -1) && h == -1 && !k) {
         hx.b().g(8);
         GameMidlet.k.t = true;
         k = true;
      }

      this.b -= this.d;
      this.f += b2.f(this.e - this.d / 2);
      if (this.f >= 20) {
         this.f = 0;
         this.d -= g;
         if (this.d == 0) {
            g = -1;
            this.e = 8;
            GameMidlet.k.b(this.b, i.c);
            byte var2 = 0;
            i3 var1 = GameMidlet.k;
            GameMidlet.k.q = var2;
            cl.p = false;
            GameMidlet.k.t = false;
            if (k4.N && jp.b().g) {
               if (gx.b == 9) {
                  (k4.H = new ew()).f();
               } else if (h == 1 && gx.b == 25) {
                  (k4.H = new ew()).b(AutoController.z);
               } else if (gx.b == 13 && ew.u < 8) {
                  (k4.H = new ew()).i();
               } else if (h == 1 && gx.b == 23) {
                  (k4.H = new ew()).g();
               }
            }
         }
      }

      if ((this.b + 58) * ev.a < cl.b().c) {
         j = false;
         if (h == -1) {
            k4.i();
         }
      }
   }

   public final void b(Graphics var1) {
      int var2 = 0;
      if (this.d > 1) {
         var2 = k4.n % 6 < 3 ? 1 : 0;
      }

      var1.drawImage(this.l, this.b * ev.a, (this.c + var2) * ev.a - this.l.getHeight(), 17);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '^');
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
               var10005 = 58;
               break;
            case 1:
               var10005 = 118;
               break;
            case 2:
               var10005 = 10;
               break;
            case 3:
               var10005 = 24;
               break;
            case 4:
               var10005 = 17;
               break;
            case 5:
               var10005 = 88;
               break;
            default:
               var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
