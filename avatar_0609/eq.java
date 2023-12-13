final class eq implements Runnable {
   private int b;
   private fj c;
   private static final String[] a;

   public final void run() {
      switch(this.b) {
         case 1:
            label67:
            for(int var7 = 0; var7 < fj.C.size(); ++var7) {
               im var9;
               (var9 = (im)fj.C.elementAt(var7)).q = false;
               kf.i = true;
               if (var9.u == 2) {
                  var9.t = 123;
               } else {
                  var9.t = 37;
               }

               var9.n = false;
               gx.e[var9.i * gx.f + var9.h] = var9.t;
               h2.b().c(fj.A, var7, 100);
               String[] var5 = a;
               k4.d(var5[2]);
               long var3 = System.currentTimeMillis();

               while(kf.i) {
                  if (System.currentTimeMillis() - var3 > 20000L) {
                     kf.i = false;
                     fj.m(1000);
                     var5 = a;
                     k4.c(var5[1]);
                     break label67;
                  }

                  fj.m(10);
               }

               fj.m(550);
            }

            String[] var11 = a;
            k4.c(var11[0]);
            return;
         case 2:
            for(int var1 = 0; var1 < fj.C.size(); ++var1) {
               im var2;
               (var2 = (im)fj.C.elementAt(var1)).q = false;
               if (var2.j != -1 && var2.v < 5) {
                  if (var2.o) {
                     fj.g().d(var1, 7);
                  }

                  if (var2.p) {
                     fj.g().d(var1, 3);
                  }

                  if (var2.s < 80) {
                     fj.g().d(var1, 2);
                  }
               }
            }

            for(int var6 = 0; var6 < fj.J.size(); ++var6) {
               iu var8;
               if ((var8 = (iu)fj.J.elementAt(var6)).I[1]) {
                  fj.g().b(var8, 120);
               }

               if (var8.I[0]) {
                  fj.g().b(var8, 121);
               }

               if (var8.G <= 80) {
                  fj.g().b(var8, 122);
                  if (var8.G <= 80) {
                     --var6;
                  }
               }
            }

            k4.c(a[3]);
      }
   }

   eq(fj var1, int var2) {
      this.c = var1;
      this.b = var2;
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "ōÜ[?ǸẄ }QǋẐ+\u007f12Q\u001cj\u000e\u001eÌ['ẟ6i%ẜ\u0002k:>g";
      int var4 = "ōÜ[?ǸẄ }QǋẐ+\u007f12Q\u001cj\u000e\u001eÌ['ẟ6i%ẜ\u0002k:>g".length();
      char var1 = 18;
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

                  var2 = "ō^\u0015,h+ǹẆV[%ǸẄ*s\u0011U\u0011ōÜ[( Ŝ$}L\u0088(h'&3XZ";
                  var4 = "ō^\u0015,h+ǹẆV[%ǸẄ*s\u0011U\u0011ōÜ[( Ŝ$}L\u0088(h'&3XZ".length();
                  var1 = 17;
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
         var10000[0] = (char)(var10000[0] ^ 'I');
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
               var10005 = 93;
               break;
            case 1:
               var10005 = 63;
               break;
            case 2:
               var10005 = 123;
               break;
            case 3:
               var10005 = 75;
               break;
            case 4:
               var10005 = 72;
               break;
            case 5:
               var10005 = 95;
               break;
            default:
               var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
