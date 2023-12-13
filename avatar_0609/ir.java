import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ir extends il {
   private Image h;
   private static final String i;

   public ir(int var1, int var2, int var3) {
      super(var1, var2, var3, 0);
      bp.c(hq.au);
      this.h = bp.b(String.valueOf(var1));
      if (this.h != null) {
         this.h.getWidth();
      }

      bp.b();
   }

   public final void a() {
   }

   public final void b(Graphics var1) {
      if (this.h == null) {
         super.g = f5.d((short)super.f).c;
         f5.b(var1, super.f, super.a * ik.c, super.b * ik.c, 33);
      } else {
         var1.drawImage(this.h, super.a * ik.c, super.b * ik.c, 33);
      }

      if (super.f == 846) {
         k4.V.b(var1, String.valueOf(AutoController.B), super.a * ik.c, super.b * ik.c - 30 * ik.c, 2);
      } else {
         if (super.f == 1029 && fj.aX != 0) {
            b5 var2 = fj.g(f8.c(fj.aX).c);
            String var3 = "";
            int var4;
            if ((var4 = fj.aW / 3600) > 0) {
               var3 = var4 + ":";
            }

            int var5;
            if ((var5 = (fj.aW - var4 * 3600) / 60) > 0 || var4 > 0) {
               var3 = var3 + var5 + ":";
            }

            var4 = fj.aW - var4 * 3600 - var5 * 60;
            var3 = var3 + var4;
            if (fj.aW == 0) {
               var3 = i;
            }

            fj.a0 = super.a - k4.Y.b(var3) / 2 / ik.c;
            fj.a1 = super.b - f5.d((short)super.f).d / ik.c - 10;
            f8.b(var1, var2.c, super.a * ik.c - k4.Y.b(var3) / 2, super.b * ik.c - f5.d((short)super.f).d - 10 * ik.c, 3);
            k4.Y.b(var1, var3, super.a * ik.c - k4.Y.b(var3) / 2 + 10 * ik.c, super.b * ik.c - f5.d((short)super.f).d - 10 * ik.c - ev.k / 2 + 2, 0);
         }
      }
   }

   static {
      String var10002 = a(a("[<1\u0017G3;R=8"));
      boolean var10001 = true;
      i = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'S');
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
               var10005 = 51;
               break;
            case 1:
               var10005 = 83;
               break;
            case 2:
               var10005 = 80;
               break;
            case 3:
               var10005 = 121;
               break;
            case 4:
               var10005 = 103;
               break;
            case 5:
               var10005 = 71;
               break;
            default:
               var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
