final class k1 extends Thread {
   private final int b;
   private static final String[] a;

   k1(int var1) {
      this.b = var1;
   }

   public final void run() {
      for(int var1 = this.b; var1 > 0; --var1) {
         String[] var2 = a;
         k4.c(var2[1] + var1 + var2[0], new j0(this));

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var3) {
            break;
         }
      }

      GameMidlet.j.r = null;
      k4.G.removeAllElements();
      k4.h();
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "{ZQÏ\u0019\u001b\rHQ\r\fö)<\u001dĩĮ\u000ecg5Uẕ]@hỦ2\u001dKL\u0015$";
      int var4 = "{ZQÏ\u0019\u001b\rHQ\r\fö)<\u001dĩĮ\u000ecg5Uẕ]@hỦ2\u001dKL\u0015$".length();
      char var1 = 5;
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
         var10000[0] = (char)(var10000[0] ^ 'G');
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
               var10005 = 91;
               break;
            case 1:
               var10005 = 61;
               break;
            case 2:
               var10005 = 56;
               break;
            case 3:
               var10005 = 45;
               break;
            case 4:
               var10005 = 96;
               break;
            case 5:
               var10005 = 4;
               break;
            default:
               var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
