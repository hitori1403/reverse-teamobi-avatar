final class dy implements ResponseHandler {
   private cw b;
   private final long c;
   private static final String[] a;

   dy(cw var1, long var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void handle(String msg) {
      try {
         String[] var2 = a;
         ji var4 = new ji(new c6(c8.b(var2[4])).c(msg));
         if (var4.f(var2[3]) != this.c) {
            k4.c(var2[2]);
         } else {
            k4.c(var4.g(a[1]));
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
      String var2 = "lỷ\u0016\u00160Ẃd\u0007<\nẓ*soẆ!B^½*-L!ạ[~'\u007fFh\u000eẗ7sdI<\u0007D06y\u0007J-\u0011E?4h\u000ed»BZẉ:-_ừ\u001b\u0016,2,";
      int var4 = "lỷ\u0016\u00160Ẃd\u0007<\nẓ*soẆ!B^½*-L!ạ[~'\u007fFh\u000eẗ7sdI<\u0007D06y\u0007J-\u0011E?4h\u000ed»BZẉ:-_ừ\u001b\u0016,2,".length();
      char var1 = '*';
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

                  var2 = "S!\u000fS\u0011x/\u0007B\u000e6\u007fN'\u0006u?#yD \u0003";
                  var4 = "S!\u000fS\u0011x/\u0007B\u000e6\u007fN'\u0006u?#yD \u0003".length();
                  var1 = 4;
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
               var10005 = 39;
               break;
            case 1:
               var10005 = 72;
               break;
            case 2:
               var10005 = 98;
               break;
            case 3:
               var10005 = 54;
               break;
            case 4:
               var10005 = 94;
               break;
            case 5:
               var10005 = 83;
               break;
            default:
               var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
