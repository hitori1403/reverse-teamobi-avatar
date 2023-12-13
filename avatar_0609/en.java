final class en implements gq {
   private em b;
   private final int c;
   private final int d;
   private static final String[] a;

   en(em var1, int var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final void b() {
      try {
         e1 var1 = k4.x;
         cs var4 = k4.x.o;
         int var5;
         if ((var5 = Integer.parseInt(k4.x.o.o)) > fj.C.size()) {
            String[] var2 = a;
            k4.c(var2[0]);
         } else {
            new k0(this, this.c, this.d, var5).start();
         }
      } catch (Exception var3) {
         k4.c(a[1]);
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "&ỏ\nBe\u001fứ\rN\n\nẸ\u0007j\n\u0006ẫB}ǖ$D\u001dẵBáWśề\u001aD\n|Ằ$Dſ\u0005\frW)\u0097\u0018&ỏ\nBe\u001fứ\rN\n\nẸ\u0007j\u0012\u008e\u000bBxẮ>D\u001dẵ";
      int var4 = "&ỏ\nBe\u001fứ\rN\n\nẸ\u0007j\n\u0006ẫB}ǖ$D\u001dẵBáWśề\u001aD\n|Ằ$Dſ\u0005\frW)\u0097\u0018&ỏ\nBe\u001fứ\rN\n\nẸ\u0007j\u0012\u008e\u000bBxẮ>D\u001dẵ"
         .length();
      char var1 = '+';
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
         var10000[0] = (char)(var10000[0] ^ 'J');
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
               var10005 = 100;
               break;
            case 1:
               var10005 = 110;
               break;
            case 2:
               var10005 = 100;
               break;
            case 3:
               var10005 = 98;
               break;
            case 4:
               var10005 = 21;
               break;
            case 5:
               var10005 = 119;
               break;
            default:
               var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
