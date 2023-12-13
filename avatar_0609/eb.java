final class eb implements gq {
   private String b;
   private int c;
   private int d;
   private int e;
   public static boolean f;
   public static boolean g;
   private static final String[] a;

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "uỦm\u000fƧễNA\rm\fR_\"M|OM\b_\"\u0002y";
      int var4 = "uỦm\u000fƧễNA\rm\fR_\"M|OM\b_\"\u0002y".length();
      char var1 = '\n';
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            g = false;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public eb(String var1, int var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final void b() {
      i3 var1;
      if ((var1 = gx.l(this.c)) != null) {
         String[] var3 = a;
         if (var1.g.equalsIgnoreCase(var3[1]) && this.d == 0) {
            if (this.e == 11) {
               this.c(1);
               return;
            }

            if (this.e == 12) {
               boolean var4 = true;
               eb var5 = this;

               for(int var2 = 0; var2 <= 0; ++var2) {
                  var5.c(3);
                  hv.b().d(var5.c, 0, 5);
               }

               return;
            }

            if (this.e == 7 || this.e == 8) {
               new Thread(new ee(this, this.e, this.c)).start();
               return;
            }
         }
      }

      if (g) {
         k4.x.b(a[0], new ed(this), 1);
         k4.x.o.b(true);
         k4.x.o.b(String.valueOf("1"));
      } else {
         new StringBuffer(String.valueOf(this.c)).append("-").append(this.d).append("-").append(this.e);
         hv.b().d(this.c, this.d, this.e);
      }
   }

   private void b(int var1) {
      for(int var2 = 0; var2 < 3; ++var2) {
         hv.b().d(this.c, 0, 9);
      }
   }

   private void c(int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         this.b(3);
         hv.b().d(this.c, 0, 4);
      }
   }

   static int b(eb var0) {
      return var0.c;
   }

   static int c(eb var0) {
      return var0.d;
   }

   static int d(eb var0) {
      return var0.e;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ ' ');
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
               var10005 = 38;
               break;
            case 1:
               var10005 = 55;
               break;
            case 2:
               var10005 = 77;
               break;
            case 3:
               var10005 = 99;
               break;
            case 4:
               var10005 = 23;
               break;
            case 5:
               var10005 = 38;
               break;
            default:
               var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
