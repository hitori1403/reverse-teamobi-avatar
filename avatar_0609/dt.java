final class dt implements gq {
   private final cs[] b;
   private static final String[] a;

   dt(cs[] var1) {
      this.b = var1;
   }

   public final void b() {
      cs var1;
      if ((var1 = this.b[0]).o.equals("")) {
         String[] var10 = a;
         k4.c(var10[1]);
      } else if (!(var1 = this.b[1]).o.equals("") && !(var1 = this.b[2]).o.equals("")) {
         if (!(var1 = this.b[1]).o.equals((var1 = this.b[2]).o)) {
            k4.c(a[0]);
         } else {
            k4.D = null;
            cs var8;
            cs var9;
            hx.b().d((var1 = this.b[0]).o.toLowerCase(), (var8 = this.b[1]).o.toLowerCase(), (var9 = this.b[3]).o);
         }
      } else {
         String[] var2 = a;
         k4.c(var2[2]);
      }
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u000b\n\u001bh&ẫ`c\u0000\u001aỡ>&\u007f+\u009f\u001c/ka}Ẓ\u0005\u0015h%nu6\u0011\u0001Ị\u001ch(nƤ\"K\u001c Ủv47\u0081\u001c\u0016\u0001Ị\u001ch(nƤ\"K\u001c Ủv4.Ệ\u0006h nẽ6";
      int var4 = "\u000b\n\u001bh&ẫ`c\u0000\u001aỡ>&\u007f+\u009f\u001c/ka}Ẓ\u0005\u0015h%nu6\u0011\u0001Ị\u001ch(nƤ\"K\u001c Ủv47\u0081\u001c\u0016\u0001Ị\u001ch(nƤ\"K\u001c Ủv4.Ệ\u0006h nẽ6"
         .length();
      char var1 = 29;
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
         var10000[0] = (char)(var10000[0] ^ 20);
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
               var10005 = 67;
               break;
            case 1:
               var10005 = 107;
               break;
            case 2:
               var10005 = 114;
               break;
            case 3:
               var10005 = 72;
               break;
            case 4:
               var10005 = 75;
               break;
            case 5:
               var10005 = 6;
               break;
            default:
               var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
