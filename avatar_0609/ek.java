final class ek implements gq {
   final fj b;
   private static final String[] a;

   ek(fj var1) {
      this.b = var1;
   }

   public final void b() {
      try {
         e1 var1 = k4.x;
         cs var4 = k4.x.o;
         int var5;
         if ((var5 = Integer.parseInt(k4.x.o.o)) <= 0) {
            String[] var6 = a;
            k4.c(var6[2]);
         } else {
            String[] var2 = a;
            k4.x.b(var2[0], new el(this, var5), 1);
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
      String var2 = "ĕỚ-_Ý.\u0018GỄ-_Y|ẵlE-\u0017Ẅd6s\u0085,_Dọb%\u0016Ẓ\u001cGỄ-_Y|ẵlE-\u0017Ẅd64E0Ắ\txọkE+ǞG4&";
      int var4 = "ĕỚ-_Ý.\u0018GỄ-_Y|ẵlE-\u0017Ẅd6s\u0085,_Dọb%\u0016Ẓ\u001cGỄ-_Y|ẵlE-\u0017Ẅd64E0Ắ\txọkE+ǞG4&".length();
      char var1 = 6;
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
         var10000[0] = (char)(var10000[0] ^ 22);
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
               var10005 = 5;
               break;
            case 1:
               var10005 = 101;
               break;
            case 2:
               var10005 = 67;
               break;
            case 3:
               var10005 = 127;
               break;
            case 4:
               var10005 = 41;
               break;
            case 5:
               var10005 = 20;
               break;
            default:
               var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
