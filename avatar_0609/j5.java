public class j5 {
   public byte[] b;
   public int c;
   public boolean d;
   public j4 e;
   private boolean f;
   private boolean g;
   private static final String[] a;

   public void b(boolean var1, jf var2) {
      this.d = var1;
      this.c();
      this.e.b(var1, var2);
   }

   public final int b() {
      return this.e.b();
   }

   public int b(int var1) {
      var1 += this.c;
      int var2 = var1 % this.b.length;
      return var1 - var2;
   }

   public int c(int var1) {
      return var1 + this.c;
   }

   public int b(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var3 < 0) {
         String[] var8 = a;
         throw new IllegalArgumentException(var8[0]);
      } else {
         var5 = this.b();
         int var6;
         if ((var6 = this.b(var3)) > 0 && var6 + 0 > var4.length) {
            throw new kt(a[1]);
         } else {
            var6 = 0;
            int var7 = this.b.length - this.c;
            if (var3 > var7) {
               System.arraycopy(var1, 0, this.b, this.c, var7);
               var6 = 0 + this.e.b(this.b, 0, var4, 0);
               this.c = 0;
               var3 -= var7;

               for(var2 = var7 + 0; var3 > this.b.length; var2 += var5) {
                  var6 += this.e.b(var1, var2, var4, var6 + 0);
                  var3 -= var5;
               }
            }

            System.arraycopy(var1, var2, this.b, this.c, var3);
            this.c += var3;
            if (this.c == this.b.length) {
               var6 += this.e.b(this.b, 0, var4, var6 + 0);
               this.c = 0;
            }

            return var6;
         }
      }
   }

   public int b(byte[] var1, int var2) {
      try {
         if (var2 + this.c > var1.length) {
            String[] var3 = a;
            throw new kt(var3[3]);
         }

         if (this.c != 0) {
            throw new kt(a[2]);
         }
      } finally {
         this.c();
      }

      return 0;
   }

   public final void c() {
      for(int var1 = 0; var1 < this.b.length; ++var1) {
         this.b[var1] = 0;
      }

      this.c = 0;
      this.e.c();
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "y[l{qV<[Lg|dV:_]c(l\u00001\u001aSl,p\u0002tV_l;q\u001eu\u0017UOv,p\u0002tXOd:`\u0004tNUm|v\u001e;HN";
      int var4 = "y[l{qV<[Lg|dV:_]c(l\u00001\u001aSl,p\u0002tV_l;q\u001eu\u0017UOv,p\u0002tXOd:`\u0004tNUm|v\u001e;HN".length();
      char var1 = '#';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     a = var5;
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

                  var2 = "^[v=%\u0018;N\u001a`0j\u0015?\u001aIk&`V5VSe2`\u0012%UOv,p\u0002tXOd:`\u0004tNUm|v\u001e;HN\":j\u0004t^UD5k\u00178\u0012\u0013";
                  var4 = "^[v=%\u0018;N\u001a`0j\u0015?\u001aIk&`V5VSe2`\u0012%UOv,p\u0002tXOd:`\u0004tNUm|v\u001e;HN\":j\u0004t^UD5k\u00178\u0012\u0013"
                     .length();
                  var1 = 27;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'T');
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
               var10005 = 58;
               break;
            case 1:
               var10005 = 58;
               break;
            case 2:
               var10005 = 2;
               break;
            case 3:
               var10005 = 92;
               break;
            case 4:
               var10005 = 5;
               break;
            case 5:
               var10005 = 118;
               break;
            default:
               var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
