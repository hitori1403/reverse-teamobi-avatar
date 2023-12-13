public final class c7 {
   private static char[] b;
   private static byte[] c;
   private static final String[] a;

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u001bY/\"tTyrV+&aTv&P1gz[5\u0010T0\"%\u000157[ (wPqrQ\"3r\u001b)\u001bY/\"tTyrV+&aTv&P1gz[5\u0010T0\"%\u000157[ (wPqrQ\"3r\u001b=\u001eP- g]5=Sc\u0005rFpd\u0001c\"}Vz6P'gz[e'Ac4gG|<Rc.`\u0015{=Ac&3X`>A*7\u007fP5=Scs=";
      int var4 = "\u001bY/\"tTyrV+&aTv&P1gz[5\u0010T0\"%\u000157[ (wPqrQ\"3r\u001b)\u001bY/\"tTyrV+&aTv&P1gz[5\u0010T0\"%\u000157[ (wPqrQ\"3r\u001b=\u001eP- g]5=Sc\u0005rFpd\u0001c\"}Vz6P'gz[e'Ac4gG|<Rc.`\u0015{=Ac&3X`>A*7\u007fP5=Scs="
         .length();
      char var1 = ')';
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new char[64];
            int var6 = 0;
            char var7 = 'A';

            while(var7 <= 'Z') {
               b[var6++] = var7++;
            }

            var7 = 'a';

            while(var7 <= 'z') {
               b[var6++] = var7++;
            }

            var7 = '0';

            while(var7 <= '9') {
               b[var6++] = var7++;
            }

            b[var6++] = '+';
            b[var6] = '/';
            c = new byte[128];

            for(int var10 = 0; var10 < c.length; ++var10) {
               c[var10] = -1;
            }

            for(int var11 = 0; var11 < 64; ++var11) {
               c[b[var11]] = (byte)var11;
            }

            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static char[] b(byte[] var0) {
      int var1 = var0.length;
      var0 = var0;
      int var2 = ((var1 << 2) + 2) / 3;
      char[] var3 = new char[(var1 + 2) / 3 << 2];
      int var4 = 0;

      for(int var5 = 0; var4 < var1; ++var5) {
         int var6 = var0[var4++] & 255;
         int var7 = var4 < var1 ? var0[var4++] & 255 : 0;
         int var8 = var4 < var1 ? var0[var4++] & 255 : 0;
         int var9 = var6 >>> 2;
         var6 = (var6 & 3) << 4 | var7 >>> 4;
         var7 = (var7 & 15) << 2 | var8 >>> 6;
         var8 &= 63;
         var3[var5++] = b[var9];
         var3[var5++] = b[var6];
         var3[var5] = var5 < var2 ? b[var7] : 61;
         var3[var5] = var5 < var2 ? b[var8] : 61;
         ++var5;
      }

      return var3;
   }

   public static byte[] b(String var0) {
      int var1;
      char[] var11;
      if ((var1 = (var11 = var0.toCharArray()).length) % 4 != 0) {
         String[] var20 = a;
         throw new IllegalArgumentException(var20[2]);
      } else {
         while(var1 > 0 && var11[var1 - 1] == '=') {
            --var1;
         }

         int var2;
         byte[] var3 = new byte[var2 = var1 * 3 / 4];
         int var4 = 0;
         int var5 = 0;

         while(var4 < var1) {
            int var6 = var11[var4++];
            int var7 = var11[var4++];
            int var8 = var4 < var1 ? var11[var4++] : 65;
            char var9 = var4 < var1 ? var11[var4++] : 65;
            if (var6 <= 127 && var7 <= 127 && var8 <= 127 && var9 <= 127) {
               byte var13 = c[var6];
               byte var15 = c[var7];
               byte var17 = c[var8];
               byte var19 = c[var9];
               if (var13 >= 0 && var15 >= 0 && var17 >= 0 && var19 >= 0) {
                  var6 = var13 << 2 | var15 >>> 4;
                  var7 = (var15 & 15) << 4 | var17 >>> 2;
                  var8 = (var17 & 3) << 6 | var19;
                  var3[var5++] = (byte)var6;
                  if (var5 < var2) {
                     var3[var5++] = (byte)var7;
                  }

                  if (var5 < var2) {
                     var3[var5++] = (byte)var8;
                  }
                  continue;
               }

               throw new IllegalArgumentException(a[1]);
            }

            String[] var10 = a;
            throw new IllegalArgumentException(var10[0]);
         }

         return var3;
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
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
               var10005 = 82;
               break;
            case 1:
               var10005 = 53;
               break;
            case 2:
               var10005 = 67;
               break;
            case 3:
               var10005 = 71;
               break;
            case 4:
               var10005 = 19;
               break;
            case 5:
               var10005 = 53;
               break;
            default:
               var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
