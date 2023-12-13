public final class j6 extends j5 {
   private jc h;
   private static final String[] i;

   private j6(j4 var1, jd var2) {
      super.e = var1;
      this.h = var2;
      super.b = new byte[var1.b()];
      super.c = 0;
   }

   public j6(jb var1) {
      this(var1, new jd());
   }

   public final void b(boolean var1, jf var2) {
      super.d = var1;
      this.c();
      super.e.b(var1, var2);
   }

   public final int c(int var1) {
      int var2;
      if ((var2 = (var1 = var1 + super.c) % super.b.length) == false) {
         return super.d ? var1 + super.b.length : var1;
      } else {
         return var1 - var2 + super.b.length;
      }
   }

   public final int b(int var1) {
      int var2;
      int var3;
      return (var2 = (var3 = var1 + super.c) % super.b.length) == 0 ? var3 - super.b.length : var3 - var2;
   }

   public final int b(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var3 < 0) {
         String[] var8 = i;
         throw new IllegalArgumentException(var8[2]);
      } else {
         var5 = this.b();
         int var6;
         if ((var6 = this.b(var3)) > 0 && var6 + 0 > var4.length) {
            throw new kt(i[1]);
         } else {
            var6 = 0;
            int var7 = super.b.length - super.c;
            if (var3 > var7) {
               System.arraycopy(var1, 0, super.b, super.c, var7);
               var6 = 0 + super.e.b(super.b, 0, var4, 0);
               super.c = 0;
               var3 -= var7;

               for(var2 = var7 + 0; var3 > super.b.length; var2 += var5) {
                  var6 += super.e.b(var1, var2, var4, var6 + 0);
                  var3 -= var5;
               }
            }

            System.arraycopy(var1, var2, super.b, super.c, var3);
            super.c += var3;
            return var6;
         }
      }
   }

   public final int b(byte[] var1, int var2) {
      int var3 = super.e.b();
      int var4 = 0;
      if (super.d) {
         if (super.c == var3) {
            if (var2 + 2 * var3 > var1.length) {
               this.c();
               String[] var5 = i;
               throw new kt(var5[0]);
            }

            var4 = super.e.b(super.b, 0, var1, var2);
            super.c = 0;
         }

         this.h.b(super.b, super.c);
         var4 += super.e.b(super.b, 0, var1, var2 + var4);
         this.c();
      } else {
         if (super.c != var3) {
            this.c();
            throw new kt(i[3]);
         }

         var4 = super.e.b(super.b, 0, super.b, 0);
         super.c = 0;

         try {
            var4 -= this.h.b(super.b);
            System.arraycopy(super.b, 0, var1, var2, var4);
         } finally {
            this.c();
         }
      }

      return var4;
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "p\u000e\u0004teV3}\u000e\u0016buP3k\u0014\u001f$cJ|m\u000f\u0017p\u000e\u0004teV3}\u000e\u0016buP3k\u0014\u001f$cJ|m\u000f";
      int var4 = "p\u000e\u0004teV3}\u000e\u0016buP3k\u0014\u001f$cJ|m\u000f\u0017p\u000e\u0004teV3}\u000e\u0016buP3k\u0014\u001f$cJ|m\u000f".length();
      char var1 = 23;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(b(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     i = var5;
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var12;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "\\\u001a\u001e#d\u0002{~\r\u0015$q\u0002}z\u001c\u0011pyTv?\u0012\u001eteV3s\u001e\u001ecdJ2#s\u001a\u0003p0@\u007fp\u0018\u001b$yLpp\u0016\u0000huVv?\u0012\u001e$tGpm\u0002\u0000pyM}";
                  var4 = "\\\u001a\u001e#d\u0002{~\r\u0015$q\u0002}z\u001c\u0011pyTv?\u0012\u001eteV3s\u001e\u001ecdJ2#s\u001a\u0003p0@\u007fp\u0018\u001b$yLpp\u0016\u0000huVv?\u0012\u001e$tGpm\u0002\u0000pyM}"
                     .length();
                  var1 = '#';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   private static String b(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 31;
               break;
            case 1:
               var10005 = 123;
               break;
            case 2:
               var10005 = 112;
               break;
            case 3:
               var10005 = 4;
               break;
            case 4:
               var10005 = 16;
               break;
            case 5:
               var10005 = 34;
               break;
            default:
               var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
