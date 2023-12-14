final class kv extends Thread {
   private DeCaptcha b;
   private static final String a;

   kv(DeCaptcha var1) {
      this.b = var1;
   }

   public final void run() {
      fj.m(4000);
      k4.c(a);
   }

   static {
      String var10002 = a(a("Ć£OwịzK61\u001aò\u0000`^ú.\u00073AaXy`\ròN4Ľ÷`\u000b|\u0000dD÷4O{IồB6,Ẹz\u0000wịw`\u0004zM4OƦǡ\u0001t\u0000lMx(N"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ ',');
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
               var10005 = 22;
               break;
            case 1:
               var10005 = 64;
               break;
            case 2:
               var10005 = 111;
               break;
            case 3:
               var10005 = 19;
               break;
            case 4:
               var10005 = 32;
               break;
            case 5:
               var10005 = 20;
               break;
            default:
               var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
