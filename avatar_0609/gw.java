final class gw implements gq {
   private static final String[] a;

   public final void b() {
      cs[] var1 = new cs[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         var1[var2] = new cs();
      }

      cs var10000 = var1[0];
      byte var3 = 0;
      var10000.z = var3;
      var10000 = var1[1];
      var3 = 2;
      var10000.z = var3;
      var10000 = var1[2];
      var3 = 2;
      var10000.z = var3;
      var10000 = var1[3];
      var3 = 0;
      var10000.z = var3;
      String[][] var12 = new String[4][];
      String[] var10003 = new String[2];
      String[] var4 = a;
      var10003[0] = var4[4];
      var10003[1] = "";
      var12[0] = var10003;
      var12[1] = new String[]{var4[6], ""};
      var12[2] = new String[]{var4[2], var4[3]};
      var12[3] = new String[]{var4[0], var4[1]};
      String[][] var5 = var12;
      e5.e().b(var1, var4[5], var5, new ag(hq.b_, new dt(var1)));
      k4.D = e5.e();
   }

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "~ẛ\u000b+\u0012;ŎỴ$L\u000bE%ẜ,[~2L#Gu\bc\"Ẇ?[wỾD\t@ủ_o\u0010sỶXp\u0004y Eu";
      int var4 = "~ẛ\u000b+\u0012;ŎỴ$L\u000bE%ẜ,[~2L#Gu\bc\"Ẇ?[wỾD\t@ủ_o\u0010sỶXp\u0004y Eu".length();
      char var1 = '\n';
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

                  var2 = "ĽŉE([P¢\t`ủ_o\u0010sỶXp";
                  var4 = "ĽŉE([P¢\t`ủ_o\u0010sỶXp".length();
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
         var10000[0] = (char)(var10000[0] ^ '_');
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
               var10005 = 45;
               break;
            case 1:
               var10005 = 74;
               break;
            case 2:
               var10005 = 43;
               break;
            case 3:
               var10005 = 79;
               break;
            case 4:
               var10005 = 123;
               break;
            case 5:
               var10005 = 27;
               break;
            default:
               var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
