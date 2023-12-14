final class AutoFishServerResponseHandler implements ResponseHandler {
   private AutoController b;
   private final long c;
   private static final String[] a;
   // [_getFishing, message, Có lỗi xảy ra!, time, Kết nối thất bại hãy kiểm tra lại internet, color, message, status]

   AutoFishServerResponseHandler(AutoController var1, long currentTime) {
      this.b = var1;
      this.c = currentTime;
   }

   public final void handle(String msg) {
      try {
         String[] var3 = a;
         ji var5 = new ji(new c6(c8.b(var3[0])).c(msg));
         if (var5.f(var3[3]) != this.c) {
            k4.c(var3[2]);
         } else {
            var3 = a;
            if (var5.d(var3[7]) != 1) {
               GameMidlet.k.enableAutoFish = false;
               k4.c(var5.g(a[6]));
            } else {
               GameMidlet.k.enableAutoFish = true;
               GameMidlet.k.aW = new int[3];

               for(int var2 = 0; var2 < 3; ++var2) {
                  var3 = a;
                  GameMidlet.k.aW[var2] = var5.e(var3[5]).b(var2);
               }

               var3 = a;
               k4.c(var5.g(var3[1]));
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void handle() {
      k4.c(a[4]);
   }

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "z^q.\r?~MPz=\u0007H\\g)*1h\u000efÊ46ẜ?-]ẚmz97,\u0004QPy?*nẆ`z%ẇd\u0005M|ỿ?voẄP42¨/-NPỗ7k\"\u007fD\u0019xỻ\"vdKMq(%3y\u0005FVx59";
      int var4 = "z^q.\r?~MPz=\u0007H\\g)*1h\u000efÊ46ẜ?-]ẚmz97,\u0004QPy?*nẆ`z%ẇd\u0005M|ỿ?voẄP42¨/-NPỗ7k\"\u007fD\u0019xỻ\"vdKMq(%3y\u0005FVx59".length();
      char var1 = 11;
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

                  var2 = "H\\g)*1h\u0006VMu.>%";
                  var4 = "H\\g)*1h\u0006VMu.>%".length();
                  var1 = 7;
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
         var10000[0] = (char)(var10000[0] ^ '\r');
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
               var10005 = 37;
               break;
            case 1:
               var10005 = 57;
               break;
            case 2:
               var10005 = 20;
               break;
            case 3:
               var10005 = 90;
               break;
            case 4:
               var10005 = 75;
               break;
            case 5:
               var10005 = 86;
               break;
            default:
               var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
