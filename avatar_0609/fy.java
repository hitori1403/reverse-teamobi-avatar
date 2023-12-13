import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fy extends e8 {
   public static fy z;
   public int A = 0;
   public static Image B;
   public static boolean C;
   private static final String D;

   public static fy g() {
      return z == null ? (z = new fy()) : z;
   }

   public final void d() {
      k4.G.removeAllElements();
      k4.ac = 0;
      k4.b.c();
      fp.O = true;

      try {
         B = Image.createImage(hq.b() + D);
      } catch (IOException var1) {
         var1.printStackTrace();
      }

      super.d();
   }

   public final void b() {
      if (this.A > 21) {
         gx.N = GameMidlet.k.a;
         gx.O = GameMidlet.k.b;
         fp.h().d();
      } else if (this.A == 0) {
         k4.aa.g();
      }

      ++this.A;
   }

   public final void b(Graphics var1) {
      k4.aa.c(var1);
      if (this.A > 1) {
         var1.drawImage(B, k4.q, k4.s / 2, 3);
      }

      k4.b(var1);
   }

   static {
      String var10002 = c(a("\u001f\u000e\u007f+\u000b\u00064_O~j"));
      boolean var10001 = true;
      D = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'S');
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
               var10005 = 48;
               break;
            case 1:
               var10005 = 97;
               break;
            case 2:
               var10005 = 17;
               break;
            case 3:
               var10005 = 4;
               break;
            case 4:
               var10005 = 103;
               break;
            case 5:
               var10005 = 105;
               break;
            default:
               var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
