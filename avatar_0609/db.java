public final class db {
   public static void b(byte[] var0) {
      for(int var1 = 0; var1 < var0.length - 1; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            if (var0[var1] > var0[var2]) {
               byte var3 = var0[var1];
               var0[var1] = var0[var2];
               var0[var2] = var3;
            }
         }
      }
   }

   public static byte c(byte[] var0) {
      if (var0.length == 1) {
         return 0;
      } else if (var0.length == 2 && var0[0] / 4 == var0[1] / 4) {
         return 2;
      } else if (var0.length == 3 && var0[0] / 4 == var0[1] / 4 && var0[1] / 4 == var0[2] / 4) {
         return 3;
      } else {
         byte[] var1 = var0;
         boolean var10000;
         if (var0.length != 6) {
            var10000 = false;
         } else {
            int var2 = 1;

            while(true) {
               if (var2 >= var1.length) {
                  var10000 = true;
                  break;
               }

               if (var2 % 2 == 1 && var1[var2 - 1] / 4 != var1[var2] / 4) {
                  var10000 = false;
                  break;
               }

               if (var2 % 2 == 0 && var1[var2 - 1] / 4 != var1[var2] / 4 - 1) {
                  var10000 = false;
                  break;
               }

               ++var2;
            }
         }

         if (var10000) {
            return 4;
         } else {
            var1 = var0;
            if (var0.length != 8) {
               var10000 = false;
            } else {
               int var5 = 1;

               while(true) {
                  if (var5 >= var1.length) {
                     var10000 = true;
                     break;
                  }

                  if (var5 % 2 == 1 && var1[var5 - 1] / 4 != var1[var5] / 4) {
                     var10000 = false;
                     break;
                  }

                  if (var5 % 2 == 0 && var1[var5 - 1] / 4 != var1[var5] / 4 - 1) {
                     var10000 = false;
                     break;
                  }

                  ++var5;
               }
            }

            if (var10000) {
               return 5;
            } else if (var0.length == 4 && var0[0] / 4 == var0[1] / 4 && var0[1] / 4 == var0[2] / 4 && var0[2] / 4 == var0[3] / 4) {
               return 6;
            } else {
               var1 = var0;
               if (var0.length < 3) {
                  var10000 = false;
               } else {
                  for(int var6 = 1; var6 < var1.length; ++var6) {
                     if (var1[var6 - 1] / 4 != var1[var6] / 4 - 1) {
                        return (byte)(false ? 1 : -1);
                     }
                  }

                  var10000 = var1[var1.length - 1] / 4 != 12;
               }

               return (byte)(var10000 ? 1 : -1);
            }
         }
      }
   }
}
