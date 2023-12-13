import javax.microedition.lcdui.Graphics;

final class bl extends ag {
   private final i3 g;
   private final byte h;
   private final byte i;
   private final int j;
   private final short k;
   private static final String[] a;

   bl(i3 var1, byte var2, byte var3, int var4, short var5) {
      super(null, 0);
      this.g = var1;
      this.h = var2;
      this.i = var3;
      this.j = var4;
      this.k = var5;
   }

   public final void b(Graphics var1, int var2, int var3) {
      k4.d(var1);
      var2 = ib.t + (ev.b << 1) + 10 * ev.a + 30 * (ev.a - 1) + fb.C;
      byte var6 = ev.j;
      this.g.b(var1, k4.o / 2, var2, false);
      k4.S.b(var1, hq.aB + this.g.g, k4.o / 2, var2 + var6, 2);
      c9 var10000 = k4.S;
      StringBuffer var10002 = new StringBuffer(String.valueOf(hq.dC[3])).append(this.h);
      String[] var4 = a;
      var10000.b(var1, var10002.append(var4[0]).append(this.i).append(var4[1]).toString(), k4.o / 2, var2 + (var6 << 1), 2);
      k4.S.b(var1, hq.cd + this.j, k4.o / 2, var2 + var6 * 3, 2);
      k4.S.b(var1, hq.ce + var4[2], k4.o / 2, var2 + (var6 << 2), 2);
      if (this.k != -1) {
         ((jx)f5.b(this.k)).a(var1, k4.o / 2, var2 + var6 * 6, 3);
      }
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ly\u0002ix\u0002vq";
      int var4 = "ly\u0002ix\u0002vq".length();
      char var1 = 2;
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '.');
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
               var10005 = 76;
               break;
            case 1:
               var10005 = 81;
               break;
            case 2:
               var10005 = 25;
               break;
            case 3:
               var10005 = 80;
               break;
            case 4:
               var10005 = 75;
               break;
            case 5:
               var10005 = 21;
               break;
            default:
               var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
