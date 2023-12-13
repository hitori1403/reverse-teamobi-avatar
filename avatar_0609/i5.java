public final class i5 {
   static boolean b = false;
   static long c;
   private is[][] d;
   int e = 0;
   int f = -1;

   i5(is[][] var1) {
      this.d = var1;
      i5 var7 = this;
      short[] var2 = new short[64];
      int var3 = 0;

      for(int var6 = 0; var6 < 8; ++var6) {
         for(int var4 = 0; var4 < 8; ++var4) {
            var2[var3] = var7.d[var6][var4].o;
            ++var3;
         }
      }

      int var10 = 0;

      for(int var5 = 0; var5 < 8; ++var5) {
         for(int var8 = 0; var8 < 8; ++var8) {
            if (var8 < 7 && var2[var10] == var2[var10 + 1]) {
               if (var8 > 1 && var2[var10] == var2[var10 - 2]) {
                  var7.e = var10 - 2;
                  var7.f = var10 - 1;
               }

               if (var8 < 5 && var2[var10] == var2[var10 + 3]) {
                  var7.e = var10 + 3;
                  var7.f = var10 + 2;
               }

               if (var5 > 0) {
                  if (var8 > 0 && var2[var10] == var2[var10 - 9]) {
                     var7.e = var10 - 9;
                     var7.f = var10 - 1;
                  }

                  if (var8 < 6 && var2[var10] == var2[var10 - 6]) {
                     var7.e = var10 - 6;
                     var7.f = var10 + 2;
                  }
               }

               if (var5 < 7) {
                  if (var8 > 0 && var2[var10] == var2[var10 + 7]) {
                     var7.e = var10 + 7;
                     var7.f = var10 - 1;
                  }

                  if (var8 < 6 && var2[var10] == var2[var10 + 10]) {
                     var7.e = var10 + 10;
                     var7.f = var10 + 2;
                  }
               }
            }

            if (var8 < 6 && var2[var10] == var2[var10 + 2]) {
               if (var5 > 0 && var2[var10] == var2[var10 - 7]) {
                  var7.e = var10 - 7;
                  var7.f = var10 + 1;
               }

               if (var5 < 7 && var2[var10] == var2[var10 + 9]) {
                  var7.e = var10 + 9;
                  var7.f = var10 + 1;
               }
            }

            ++var10;
         }
      }

      if (var7.f == -1) {
         int var12 = 0;
         var3 = 0;

         for(int var11 = 0; var11 < 8; ++var11) {
            for(int var13 = 0; var13 < 8; ++var13) {
               if (var11 < 7 && var2[var12] == var2[var12 + 8]) {
                  if (var11 > 1 && var2[var12] == var2[var12 - 16]) {
                     var7.e = var12 - 16;
                     var7.f = var12 - 8;
                  }

                  if (var11 < 5 && var2[var12] == var2[var12 + 24]) {
                     var7.e = var12 + 24;
                     var7.f = var12 + 16;
                  }

                  if (var11 > 0) {
                     if (var13 > 0 && var2[var12] == var2[var12 - 9]) {
                        var7.e = var12 - 9;
                        var7.f = var12 - 8;
                     }

                     if (var13 < 7 && var2[var12] == var2[var12 - 7]) {
                        var7.e = var12 - 7;
                        var7.f = var12 - 8;
                     }
                  }

                  if (var11 < 6) {
                     if (var13 > 0 && var2[var12] == var2[var12 + 15]) {
                        var7.e = var12 + 15;
                        var7.f = var12 + 16;
                     }

                     if (var13 < 7 && var2[var12] == var2[var12 + 17]) {
                        var7.e = var12 + 17;
                        var7.f = var12 + 16;
                     }
                  }
               }

               if (var11 < 6 && var2[var12] == var2[var12 + 16]) {
                  if (var13 > 0 && var2[var12] == var2[var12 + 7]) {
                     var7.e = var12 + 7;
                     var7.f = var12 + 8;
                  }

                  if (var13 < 7 && var2[var12] == var2[var12 + 9]) {
                     var7.e = var12 + 9;
                     var7.f = var12 + 8;
                  }
               }

               ++var12;
            }

            if (var3 > 3 && var7.f != -1) {
               break;
            }

            ++var3;
         }
      }
   }

   static void b() {
      if (c == 0L) {
         c = System.currentTimeMillis();
      } else {
         if (System.currentTimeMillis() - c >= 1000L) {
            ft.z.i();
            c = 0L;
         }
      }
   }

   public final int c() {
      return this.e;
   }

   public final int d() {
      return this.f;
   }
}
