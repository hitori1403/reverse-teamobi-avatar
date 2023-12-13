public final class i {
   private static final String[] b;
   private static final String[] c;
   public static int d;
   static int e;
   private static final String[] f;

   static {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "M\u0004V!\u0012\u000e_\u0003A6\u0017\f\t\u007f#a\u00167,)\u000eI\u0003A6\u000f\u000e\ti#a\u0016/.)\u000eĽ\u0080Î\u00adǙǉżļ î\u008dǘǖŽ\u000e\u0006T\u0012oONT\u0006T\u0012oONT\u0005\u000fP\u0017mM\u0018_\u0007K0\u0001\fŮÜ\u0088ÐǸǈ8(q+}\fź»§êǂƋ";
      int var4 = "M\u0004V!\u0012\u000e_\u0003A6\u0017\f\t\u007f#a\u00167,)\u000eI\u0003A6\u000f\u000e\ti#a\u0016/.)\u000eĽ\u0080Î\u00adǙǉżļ î\u008dǘǖŽ\u000e\u0006T\u0012oONT\u0006T\u0012oONT\u0005\u000fP\u0017mM\u0018_\u0007K0\u0001\fŮÜ\u0088ÐǸǈ8(q+}\fź»§êǂƋ"
         .length();
      char var1 = 5;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var14 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var14;
                  if ((var7 += var1) >= var4) {
                     f = var5;
                     String[] var10 = new String[2];
                     String[] var8 = f;
                     var10[0] = var8[0];
                     var10[1] = var8[5];
                     b = var10;
                     c = new String[]{var8[2], var8[4]};
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var14;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "ß\u0082ẇºộ\u0090\u0085ẅởẝª\u008aẶ\u0098ỳ\u008fÈẐőẲ\u0090ọẕờẬ\u0082\u0080ẊŗẇẋỨịỌỚẛễẍỲổỆẬỽầợẈẫẬẺủẹỹẆẙẚẄổẏịẨ¹¹ỏýỂí\u0091Ểễổí°Ừ\u008cẴ´¡ỶŊỮ\u0084ẊẏẕỊ¸ýếĐẝểẎỐẐữỜởễẔỎẚẙẺẽẫỮẰỰẏẠảằỠẂỆằẒẕẃỎ\u0002Ǝǃ";
                  var4 = "ß\u0082ẇºộ\u0090\u0085ẅởẝª\u008aẶ\u0098ỳ\u008fÈẐőẲ\u0090ọẕờẬ\u0082\u0080ẊŗẇẋỨịỌỚẛễẍỲổỆẬỽầợẈẫẬẺủẹỹẆẙẚẄổẏịẨ¹¹ỏýỂí\u0091Ểễổí°Ừ\u008cẴ´¡ỶŊỮ\u0084ẊẏẕỊ¸ýếĐẝểẎỐẐữỜởễẔỎẚẙẺẽẫỮẰỰẏẠảằỠẂỆằẒẕẃỎ\u0002Ǝǃ"
                     .length();
                  var1 = 'x';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static String b(String var0) {
      if ((d == 1 || d == 2) && var0.length() > 0) {
         var0.length();
         if (var0.length() < 2) {
            return var0;
         } else {
            String var1 = var0.substring(var0.length() - 2, var0.length());

            for(int var2 = 0; var2 < 24; ++var2) {
               StringBuffer var3 = new StringBuffer();
               StringBuffer var4 = new StringBuffer();
               if (var2 < 14) {
                  String[] var6 = f;
                  var4.append(var6[1].charAt(var2));
                  var4.append(c[d - 1].charAt(var2));
                  if (var1.equals(var4.toString())) {
                     var3.append(var6[3].charAt(var2));
                     String var8;
                     if ((var8 = var0.substring(0, var0.length() - 2) + var3.toString()).length() >= 2
                        && var8.charAt(var8.length() - 1) == 417
                        && var8.charAt(var8.length() - 2) == 'u') {
                        return var8.substring(0, var8.length() - 2) + var6[8];
                     }

                     return var8;
                  }
               }

               for(int var7 = 0; var7 < b[d - 1].length(); ++var7) {
                  StringBuffer var5;
                  StringBuffer var10000 = var5 = new StringBuffer();
                  String[] var9 = f;
                  var10000.append(var9[6].charAt(var2));
                  var5.append(b[d - 1].charAt(var7));
                  if (var1.equals(var5.toString())) {
                     var3.append(var9[7].charAt(var2 * b[d - 1].length() + var7));
                     return var0.substring(0, var0.length() - 2) + var3.toString();
                  }
               }
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'm');
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
               var10005 = 62;
               break;
            case 1:
               var10005 = 98;
               break;
            case 2:
               var10005 = 36;
               break;
            case 3:
               var10005 = 89;
               break;
            case 4:
               var10005 = 120;
               break;
            case 5:
               var10005 = 121;
               break;
            default:
               var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
