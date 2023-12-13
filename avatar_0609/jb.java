public final class jb implements j4 {
   private byte[] b;
   private byte[] c;
   private byte[] d;
   private int e;
   private j4 f = null;
   private boolean g;
   private static final String[] a;

   public jb(ja var1) {
      this.f = var1;
      this.e = var1.b();
      this.b = new byte[this.e];
      this.c = new byte[this.e];
      this.d = new byte[this.e];
   }

   public final void b(boolean var1, i6 var2) {
      boolean var3 = this.g;
      this.g = var1;
      if (var2 instanceof jf) {
         byte[] var4;
         jf var6;
         if ((var4 = (var6 = (jf)var2).b).length != this.e) {
            String[] var7 = a;
            throw new IllegalArgumentException(var7[2]);
         }

         System.arraycopy(var4, 0, this.b, 0, var4.length);
         this.c();
         if (var6.c == null) {
            if (var3 != var1) {
               String[] var5 = a;
               throw new IllegalArgumentException(var5[0]);
            }

            return;
         }

         this.f.b(var1, var6.c);
      } else {
         this.c();
         if (var2 != null) {
            this.f.b(var1, var2);
            return;
         }

         if (var3 != var1) {
            throw new IllegalArgumentException(a[1]);
         }
      }
   }

   public final int b() {
      return this.f.b();
   }

   public final int b(byte[] var1, int var2, byte[] var3, int var4) {
      if (this.g) {
         int var15 = var2;
         byte[] var13 = var1;
         jb var9 = this;
         if (var2 + this.e > var1.length) {
            String[] var7 = a;
            throw new kt(var7[3]);
         } else {
            for(int var19 = 0; var19 < var9.e; ++var19) {
               var9.c[var19] ^= var13[var15 + var19];
            }

            int var20 = var9.f.b(var9.c, 0, var3, var4);
            System.arraycopy(var3, var4, var9.c, 0, var9.c.length);
            return var20;
         }
      } else {
         int var5 = var4;
         byte[] var16 = var3;
         jb var8 = this;
         if (var2 + this.e > var1.length) {
            throw new kt(a[4]);
         } else {
            System.arraycopy(var1, var2, this.d, 0, this.e);
            int var6 = this.f.b(var1, var2, var3, var4);

            for(int var11 = 0; var11 < var8.e; ++var11) {
               var16[var5 + var11] ^= var8.c[var11];
            }

            byte[] var12 = var8.c;
            var8.c = var8.d;
            var8.d = var12;
            return var6;
         }
      }
   }

   public final void c() {
      System.arraycopy(this.b, 0, this.c, 0, this.b.length);
      jg.b(this.d, (byte)0);
      this.f.c();
   }

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0019?eu\u0016av\u00196ju\u001epv\u001f0hi\u0000e\"\u00130l;\na7\u000e;+l\u0010a>\u0015+\u007f;\tg9\f7or\u0017rv\u0011;r55\u0019?eu\u0016av\u00196ju\u001epv\u001f0hi\u0000e\"\u00130l;\na7\u000e;+l\u0010a>\u0015+\u007f;\tg9\f7or\u0017rv\u0011;r5;\u00130bo\u0010t:\u0013-jo\u0010z8Z(nx\rz$Z3~h\r54\u001f~\u007fs\u001c5%\u001b3n;\u0015p8\u001d*c;\u0018fv\u00182dx\u00125%\u0013$n";
      int var4 = "\u0019?eu\u0016av\u00196ju\u001epv\u001f0hi\u0000e\"\u00130l;\na7\u000e;+l\u0010a>\u0015+\u007f;\tg9\f7or\u0017rv\u0011;r55\u0019?eu\u0016av\u00196ju\u001epv\u001f0hi\u0000e\"\u00130l;\na7\u000e;+l\u0010a>\u0015+\u007f;\tg9\f7or\u0017rv\u0011;r5;\u00130bo\u0010t:\u0013-jo\u0010z8Z(nx\rz$Z3~h\r54\u001f~\u007fs\u001c5%\u001b3n;\u0015p8\u001d*c;\u0018fv\u00182dx\u00125%\u0013$n"
         .length();
      char var1 = '5';
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

                  var2 = "\u00130{n\r54\u000f8m~\u000b5\"\u00151+h\u0011z$\u000e\u0016\u00130{n\r54\u000f8m~\u000b5\"\u00151+h\u0011z$\u000e";
                  var4 = "\u00130{n\r54\u000f8m~\u000b5\"\u00151+h\u0011z$\u000e\u0016\u00130{n\r54\u000f8m~\u000b5\"\u00151+h\u0011z$\u000e".length();
                  var1 = 22;
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
         var10000[0] = (char)(var10000[0] ^ 'V');
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
               var10005 = 122;
               break;
            case 1:
               var10005 = 94;
               break;
            case 2:
               var10005 = 11;
               break;
            case 3:
               var10005 = 27;
               break;
            case 4:
               var10005 = 121;
               break;
            case 5:
               var10005 = 21;
               break;
            default:
               var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
