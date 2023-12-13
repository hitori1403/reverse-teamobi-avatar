final class q implements gq {
   private p b;
   private static final String[] a;

   q(p var1) {
      this.b = var1;
   }

   public final void b() {
      eb.g = !eb.g;
      String[] var1 = a;
      StringBuffer var10000 = new StringBuffer(var1[0]);
      String var10001;
      if (eb.g) {
         var10001 = var1[1];
      } else {
         var1 = a;
         var10001 = var1[3];
      }

      k4.c(var10000.append(var10001).append(a[2]).toString());
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Ł\u0081{\u0003\u0013ỏ/";
      int var4 = "Ł\u0081{\u0003\u0013ỏ/".length();
      char var1 = 3;
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

                  var2 = "q\n»mITţẈ\f<#U\u0006\u0013>BŊỖHT\u0004Ẋ\u000b{pỰT\u001eǡẁ5d\u000f\u0003\u0005ọ/";
                  var4 = "q\n»mITţẈ\f<#U\u0006\u0013>BŊỖHT\u0004Ẋ\u000b{pỰT\u001eǡẁ5d\u000f\u0003\u0005ọ/".length();
                  var1 = '!';
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
         var10000[0] = (char)(var10000[0] ^ 'r');
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
               var10005 = 81;
               break;
            case 1:
               var10005 = 98;
               break;
            case 2:
               var10005 = 91;
               break;
            case 3:
               var10005 = 3;
               break;
            case 4:
               var10005 = 33;
               break;
            case 5:
               var10005 = 116;
               break;
            default:
               var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
