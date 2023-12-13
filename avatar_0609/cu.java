import java.util.Vector;

final class cu implements gq {
   private fc b;
   private static final String[] a;

   cu(fc var1) {
      this.b = var1;
   }

   public final void b() {
      Vector var1;
      Vector var10000 = var1 = new Vector();
      StringBuffer var10003 = new StringBuffer(String.valueOf(kq.b(!j7.c)));
      String[] var2 = a;
      var10000.addElement(new ag(var10003.append(var2[2]).toString(), new cv(this)));
      var1.addElement(new ag(var2[1], new cw(this)));
      var1.addElement(new ag(var2[0], new dz(this)));
      f1.d().b(var1, 0);
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "JÔ\u001bUŲỶ[\b]\\ắ\u001cC)Ẏg\u0005)u\u0007\u0001\f";
      int var4 = "JÔ\u001bUŲỶ[\b]\\ắ\u001cC)Ẏg\u0005)u\u0007\u0001\f".length();
      char var1 = 7;
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
         var10000[0] = (char)(var10000[0] ^ '/');
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
               var10005 = 9;
               break;
            case 1:
               var10005 = 52;
               break;
            case 2:
               var10005 = 114;
               break;
            case 3:
               var10005 = 117;
               break;
            case 4:
               var10005 = 99;
               break;
            case 5:
               var10005 = 65;
               break;
            default:
               var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
