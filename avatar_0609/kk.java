import java.util.Vector;

final class kk implements gq {
   private kj b;
   private static final String[] a;

   kk(kj var1) {
      this.b = var1;
   }

   public final void b() {
      Vector var1;
      Vector var10000 = var1 = new Vector();
      StringBuffer var10003 = new StringBuffer(String.valueOf(kq.b(!kj.g)));
      String[] var2 = a;
      var10000.addElement(new ag(var10003.append(var2[4]).toString(), new kj(2)));
      ag var10001 = new ag;
      var10003 = new StringBuffer(var2[3]);
      String var10004;
      if (kj.o) {
         var10004 = var2[1];
      } else {
         var2 = a;
         var10004 = var2[0];
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10003.append(var10004).toString(), new kj(6));
      var1.addElement(var10001);
      var1.addElement(new ag(a[2], new kj(5)));
      f1.d().b(var1, 2);
   }

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = ".Ẻf\u00038Ẹf\u00079õ{(ļỹ{";
      int var4 = ".Ẻf\u00038Ẹf\u00079õ{(ļỹ{".length();
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

                  var2 = ";`fg\rşî\u0014}((\tZTg|BnA*V";
                  var4 = ";`fg\rşî\u0014}((\tZTg|BnA*V".length();
                  var1 = 11;
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
         var10000[0] = (char)(var10000[0] ^ 15);
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
               var10005 = 122;
               break;
            case 1:
               var10005 = 21;
               break;
            case 2:
               var10005 = 18;
               break;
            case 3:
               var10005 = 8;
               break;
            case 4:
               var10005 = 45;
               break;
            case 5:
               var10005 = 78;
               break;
            default:
               var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
