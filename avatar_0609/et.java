final class et implements Runnable {
   private jp b;
   private static final String a;

   et(jp var1) {
      this.b = var1;
   }

   public final void run() {
      try {
         while(true) {
            jp var5 = this.b;
            if (this.b.g) {
               et var1 = this;
               byte var2 = this.b.d.readByte();
               if (this.b.n) {
                  var2 = jp.b(this.b, var2);
               }

               int var3;
               if (this.b.n) {
                  byte var4 = this.b.d.readByte();
                  byte var17 = this.b.d.readByte();
                  var3 = (jp.b(this.b, var4) & 255) << 8 | jp.b(this.b, var17) & 255;
               } else {
                  var3 = this.b.d.readUnsignedShort();
               }

               byte[] var14 = new byte[var3];
               int var18 = 0;
               int var6 = 0;

               while(var18 != -1 && var6 < var3) {
                  if ((var18 = var1.b.d.read(var14, var6, var3 - var6)) > 0) {
                     var6 += var18;
                     var1.b.m += var6 + 5;
                     int var7 = jp.b().m + jp.b().l;
                     var1.b.s = var7 / 1024 + "." + var7 % 1024 / 102 + a;
                  }
               }

               if (var1.b.n) {
                  for(int var19 = 0; var19 < var14.length; ++var19) {
                     var14[var19] = jp.b(var1.b, var14[var19]);
                  }
               }

               ij var10 = new ij(var2, var14);

               try {
                  if (var10.b != -27) {
                     this.b.e.b(var10);
                  } else {
                     ij var12 = var10;
                     var1 = this;
                     byte var13 = var10.f.readByte();
                     this.b.o = new byte[var13];

                     for(int var15 = 0; var15 < var13; ++var15) {
                        var1.b.o[var15] = var12.f.readByte();
                     }

                     for(int var16 = 0; var16 < var1.b.o.length - 1; ++var16) {
                        var1.b.o[var16 + 1] ^= var1.b.o[var16];
                     }

                     var1.b.n = true;
                  }
               } catch (Exception var8) {
                  var8.printStackTrace();
               }
               continue;
            }
         }
      } catch (Exception var9) {
      }

      if (this.b.g) {
         if (this.b.e != null) {
            if (System.currentTimeMillis() - this.b.r > 500L) {
               this.b.e.c();
            } else {
               this.b.e.b();
            }
         }

         if (jp.b(this.b) != null) {
            jp.d(this.b);
         }
      }
   }

   static {
      String var10002 = a(a("\u0006Y"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '1');
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
               var10005 = 77;
               break;
            case 1:
               var10005 = 59;
               break;
            case 2:
               var10005 = 113;
               break;
            case 3:
               var10005 = 110;
               break;
            case 4:
               var10005 = 12;
               break;
            case 5:
               var10005 = 98;
               break;
            default:
               var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
