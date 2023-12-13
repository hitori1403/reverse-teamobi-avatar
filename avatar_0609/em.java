final class em implements gq {
   private fj b;
   private final int c;
   private static final String[] a;

   em(fj var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      try {
         e1 var1 = k4.x;
         cs var4 = k4.x.o;
         int var5;
         if ((var5 = Integer.parseInt(k4.x.o.o)) <= 0) {
            String[] var6 = a;
            k4.c(var6[0]);
         } else {
            String[] var2 = a;
            k4.x.b(var2[2], new en(this, this.c, var5), 1);
            k4.x.o.b(true);
            k4.x.o.b(String.valueOf(fj.C.size()));
         }
      } catch (Exception var3) {
         k4.c(a[1]);
      }
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "fỮ1y\b\"ỞMo11ổ:]\u0015o,ẈX&ẦJo7Ǹ\u0016jM\u0018fỮ1y\b\"ỞMo11ổ:]R¯0y\u0015ẓ\t\u0004<Ẏ\u0006ĴỰ1y\u008cp";
      int var4 = "fỮ1y\b\"ỞMo11ổ:]\u0015o,ẈX&ẦJo7Ǹ\u0016jM\u0018fỮ1y\b\"ỞMo11ổ:]R¯0y\u0015ẓ\t\u0004<Ẏ\u0006ĴỰ1y\u008cp".length();
      char var1 = 28;
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
         var10000[0] = (char)(var10000[0] ^ '}');
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
               var10005 = 36;
               break;
            case 1:
               var10005 = 79;
               break;
            case 2:
               var10005 = 95;
               break;
            case 3:
               var10005 = 89;
               break;
            case 4:
               var10005 = 120;
               break;
            case 5:
               var10005 = 74;
               break;
            default:
               var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
