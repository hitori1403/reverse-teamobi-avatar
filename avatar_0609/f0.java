import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f0 extends fz {
   public static g_ n;

   static {
      String var10002 = b(a("~\u0018Tnt\f'>\u001a@}>W>=\u000f\u0005#aM0"));
      boolean var10001 = true;
      String var0 = var10002;

      try {
         n = new g_(Image.createImage(hq.b() + var0), 20 * ev.a, 20 * ev.a);
      } catch (IOException var1) {
         var1.printStackTrace();
      }
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            throw null;
         case 1:
            k4.w = null;
      }
   }

   public final void b() {
      throw null;
   }

   public final void c() {
      super.c();
      throw null;
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      throw null;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'W');
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
               var10005 = 81;
               break;
            case 1:
               var10005 = 106;
               break;
            case 2:
               var10005 = 53;
               break;
            case 3:
               var10005 = 13;
               break;
            case 4:
               var10005 = 17;
               break;
            case 5:
               var10005 = 35;
               break;
            default:
               var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
