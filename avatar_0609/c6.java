public final class c6 {
   private byte[] b;
   private byte[] c;
   private static final String[] a;

   public c6(String var1) {
      this.b = var1.getBytes();
      this.c = new byte[16];
   }

   public final String b(String var1) {
      byte[] var4 = var1.getBytes(a[1]);
      ja var2 = new ja();
      j6 var6;
      (var6 = new j6(new jb(var2))).b(true, new jf(new je(this.b), this.c));
      byte[] var3 = new byte[var6.c(var4.length)];
      int var5 = var6.b(var4, 0, var4.length, var3, 0);
      var6.b(var3, var5);
      return new String(c7.b(var3));
   }

   public final String c(String var1) {
      byte[] var4 = c7.b(var1);
      ja var2 = new ja();
      j6 var6;
      (var6 = new j6(new jb(var2))).b(false, new jf(new je(this.b), this.c));
      byte[] var3 = new byte[var6.c(var4.length)];
      int var5 = var6.b(var4, 0, var4.length, var3, 0);
      var6.b(var3, var5);
      return new String(var3, a[0]);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "y\f\u0011%!\u0005y\f\u0011%!";
      int var4 = "y\f\u0011%!\u0005y\f\u0011%!".length();
      char var1 = 5;
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
         var10000[0] = (char)(var10000[0] ^ 'H');
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
               var10005 = 44;
               break;
            case 1:
               var10005 = 88;
               break;
            case 2:
               var10005 = 87;
               break;
            case 3:
               var10005 = 8;
               break;
            case 4:
               var10005 = 25;
               break;
            case 5:
               var10005 = 53;
               break;
            default:
               var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
