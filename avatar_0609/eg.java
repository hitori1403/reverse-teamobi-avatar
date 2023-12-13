import java.util.Hashtable;

final class eg implements Handler {
   private final long b;
   private static final String[] a;

   eg(long var1) {
      this.b = var1;
   }

   public final void handle(String msg) {
      try {
         String[] var4 = a;
         ji var6 = new ji(new c6(c8.b(var4[5])).c(msg));
         if (var6.f(var4[6]) != this.b) {
            k4.c(var4[3]);
         } else {
            var4 = a;
            jh var2 = var6.e(var4[10]);

            for(int var3 = 0; var3 < var2.b(); ++var3) {
               Hashtable var10000 = ce.e;
               ji var10003 = var2.c(var3);
               var4 = a;
               var10000.put(new String(c7.b(var10003.g(var4[12])), var4[8]), var2.c(var3).g(var4[11]));
            }

            var4 = a;
            jh var8 = var6.e(var4[9]);

            for(int var7 = 0; var7 < var8.b(); ++var7) {
               Hashtable var13 = ce.f;
               ji var14 = var8.c(var7);
               var4 = a;
               var13.put(new String(c7.b(var14.g(var4[0])), var4[4]), new String(c7.b(var8.c(var7).g(var4[7])), var4[4]));
            }

            ce.h = true;
            k4.c(a[1]);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public final void handle() {
      k4.c(a[2]);
   }

   static {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "\u0014fHC\u0017\u001a9\u000b\u001bŵð\r\\Ệ\nv\u001d|CWC\u0017ẹE\u007fDỷ\u0016S5\u00913JY\u0082\u001c*.ẬY\u0010\rẢ?EgEẕ\u0017S4Ễz\rX\u0080\nv\u000ezỮ]C\u0007$\u00043Aẑ\nS?\u000bgHB\r\u0016\"\u000e&à\r\\Ẵ\u001av\u001dẰT\u0010\u0011\u0012w\u00050Gk\u001d[\n:tHD\"\u0005\u0012\u0004gL\u0004\u0011z@U\u0006\u0004}^G\u0006\u0001\u00050Gk\u001d[\u0007\u0013zHD\r\u0012;\u0007\u0000}J\\\n\u0000>";
      int var4 = "\u0014fHC\u0017\u001a9\u000b\u001bŵð\r\\Ệ\nv\u001d|CWC\u0017ẹE\u007fDỷ\u0016S5\u00913JY\u0082\u001c*.ẬY\u0010\rẢ?EgEẕ\u0017S4Ễz\rX\u0080\nv\u000ezỮ]C\u0007$\u00043Aẑ\nS?\u000bgHB\r\u0016\"\u000e&à\r\\Ẵ\u001av\u001dẰT\u0010\u0011\u0012w\u00050Gk\u001d[\n:tHD\"\u0005\u0012\u0004gL\u0004\u0011z@U\u0006\u0004}^G\u0006\u0001\u00050Gk\u001d[\u0007\u0013zHD\r\u0012;\u0007\u0000}J\\\n\u0000>"
         .length();
      char var1 = '\b';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     a = var5;
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var12;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "\u0004}^G\u0006\u0001\b\u0014fHC\u0017\u001a9\u000b";
                  var4 = "\u0004}^G\u0006\u0001\b\u0014fHC\u0017\u001a9\u000b".length();
                  var1 = 6;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'V');
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
               var10005 = 101;
               break;
            case 1:
               var10005 = 19;
               break;
            case 2:
               var10005 = 45;
               break;
            case 3:
               var10005 = 48;
               break;
            case 4:
               var10005 = 99;
               break;
            case 5:
               var10005 = 115;
               break;
            default:
               var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
