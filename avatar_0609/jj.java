final class jj {
   private static final String a;

   private jj() {
   }

   public final boolean equals(Object var1) {
      return var1 == null || var1 == this;
   }

   public final String toString() {
      return a;
   }

   jj(byte var1) {
      this();
   }

   static {
      String var10002 = a(a("\u001f7ex"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '\b');
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
               var10005 = 113;
               break;
            case 1:
               var10005 = 66;
               break;
            case 2:
               var10005 = 9;
               break;
            case 3:
               var10005 = 20;
               break;
            case 4:
               var10005 = 23;
               break;
            case 5:
               var10005 = 106;
               break;
            default:
               var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
