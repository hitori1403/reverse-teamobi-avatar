final class DeCaptchaResponseHandler implements ResponseHandler {
   private DeCaptcha b;
   private final gq c;
   private static final String[] a;
   // [Không thể lấy dữ liệu captcha, k5NZbgYM1FCYJfFzBqkWiuRIpKQ2rWgb, status, captcha, message]

   DeCaptchaResponseHandler(DeCaptcha var1, z var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void handle(String msg) {
      try {
         String[] var2 = a;
         ji var4;
         if ((var4 = new ji(new c6(var2[1]).c(msg))).d(var2[2]) == 1) {
            k4.x.o.b(var4.g(var2[3]));
            Thread.sleep(3000L);
            this.c.b();
         } else {
            GameMidlet.k.aU = true;
            Thread.sleep(3000L);
            k4.c(var4.g(a[4]));
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public final void handle() {
      k4.c(a[0]);
   }

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "}6\u0084@\u001aF@^ẝPBỘ\u001f\u0014RằPB\u0014ạA\u0016=\u0011^\t\u0005\\W ]k>t\u001f\u0001m{o6m$,Rp$2_\u00161]C\f9^67\u0006D\t\u0017L\u0006E*\u0011Z\b\u0015";
      int var4 = "}6\u0084@\u001aF@^ẝPBỘ\u001f\u0014RằPB\u0014ạA\u0016=\u0011^\t\u0005\\W ]k>t\u001f\u0001m{o6m$,Rp$2_\u00161]C\f9^67\u0006D\t\u0017L\u0006E*\u0011Z\b\u0015"
         .length();
      char var1 = 29;
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

                  var2 = "U?\u0000Z\u001e\u000eU\u0007[;\u0003]\u001c\u0001Q";
                  var4 = "U?\u0000Z\u001e\u000eU\u0007[;\u0003]\u001c\u0001Q".length();
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
         var10000[0] = (char)(var10000[0] ^ '4');
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
               var10005 = 54;
               break;
            case 1:
               var10005 = 94;
               break;
            case 2:
               var10005 = 112;
               break;
            case 3:
               var10005 = 46;
               break;
            case 4:
               var10005 = 125;
               break;
            case 5:
               var10005 = 102;
               break;
            default:
               var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
