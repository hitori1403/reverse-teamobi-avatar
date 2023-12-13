import java.util.Vector;

final class p implements gq {
   private AutoController b;
   private static final String[] a;

   p(AutoController var1) {
      this.b = var1;
   }

   public final void b() {
      Vector var1;
      Vector var10000 = var1 = new Vector();
      ag var10001 = new ag;
      String var10003;
      if (!eb.g) {
         String[] var2 = a;
         var10003 = var2[1];
      } else {
         var10003 = a[0];
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10003, new q(this));
      var10000.addElement(var10001);
      f1.d().b(var1, 0);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "GỸ\u0012r\b\\ữcw\u0015ẃFXǲỰ9\u0001\u0011QỺ\u0012r\b\\ữcw\u0015ẃFXǲỰ9\u0001";
      int var4 = "GỸ\u0012r\b\\ữcw\u0015ẃFXǲỰ9\u0001\u0011QỺ\u0012r\b\\ữcw\u0015ẃFXǲỰ9\u0001".length();
      char var1 = 17;
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
         var10000[0] = (char)(var10000[0] ^ 'B');
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
               var10005 = 19;
               break;
            case 1:
               var10005 = 87;
               break;
            case 2:
               var10005 = 102;
               break;
            case 3:
               var10005 = 82;
               break;
            case 4:
               var10005 = 102;
               break;
            case 5:
               var10005 = 52;
               break;
            default:
               var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
