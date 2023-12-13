public final class i_ extends i9 {
   private int e;
   private int f;
   private int g;
   private int h;
   private int[] i = new int[16];
   private int j;

   public i_() {
      this.c();
   }

   public final int b() {
      return 16;
   }

   protected final void b(byte[] var1, int var2) {
      this.i[this.j++] = var1[var2] & 255 | (var1[var2 + 1] & 255) << 8 | (var1[var2 + 2] & 255) << 16 | (var1[var2 + 3] & 255) << 24;
      if (this.j == 16) {
         this.d();
      }
   }

   protected final void b(long var1) {
      if (this.j > 14) {
         this.d();
      }

      this.i[14] = (int)var1;
      this.i[15] = (int)(var1 >>> 32);
   }

   private static void b(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)var0;
      var1[var2 + 1] = (byte)(var0 >>> 8);
      var1[var2 + 2] = (byte)(var0 >>> 16);
      var1[var2 + 3] = (byte)(var0 >>> 24);
   }

   public final int b(byte[] var1, int var2) {
      this.b();
      b(this.e, var1, 0);
      b(this.f, var1, 4);
      b(this.g, var1, 8);
      b(this.h, var1, 12);
      this.c();
      return 16;
   }

   public final void c() {
      super.c();
      this.e = 1732584193;
      this.f = -271733879;
      this.g = -1732584194;
      this.h = 271733878;
      this.j = 0;

      for(int var1 = 0; var1 != this.i.length; ++var1) {
         this.i[var1] = 0;
      }
   }

   private static int b(int var0, int var1) {
      return var0 << var1 | var0 >>> 32 - var1;
   }

   private static int b(int var0, int var1, int var2) {
      return var0 & var1 | ~var0 & var2;
   }

   private static int c(int var0, int var1, int var2) {
      return var0 & var2 | var1 & ~var2;
   }

   private static int d(int var0, int var1, int var2) {
      return var1 ^ (var0 | ~var2);
   }

   protected final void d() {
      int var1 = this.e;
      int var2 = this.f;
      int var3 = this.g;
      int var4 = this.h;
      var1 = b(var1 + b(var2, var3, var4) + this.i[0] + -680876936, 7) + var2;
      var4 = b(var4 + b(var1, var2, var3) + this.i[1] + -389564586, 12) + var1;
      var3 = b(var3 + b(var4, var1, var2) + this.i[2] + 606105819, 17) + var4;
      var2 = b(var2 + b(var3, var4, var1) + this.i[3] + -1044525330, 22) + var3;
      var1 = b(var1 + b(var2, var3, var4) + this.i[4] + -176418897, 7) + var2;
      var4 = b(var4 + b(var1, var2, var3) + this.i[5] + 1200080426, 12) + var1;
      var3 = b(var3 + b(var4, var1, var2) + this.i[6] + -1473231341, 17) + var4;
      var2 = b(var2 + b(var3, var4, var1) + this.i[7] + -45705983, 22) + var3;
      var1 = b(var1 + b(var2, var3, var4) + this.i[8] + 1770035416, 7) + var2;
      var4 = b(var4 + b(var1, var2, var3) + this.i[9] + -1958414417, 12) + var1;
      var3 = b(var3 + b(var4, var1, var2) + this.i[10] + -42063, 17) + var4;
      var2 = b(var2 + b(var3, var4, var1) + this.i[11] + -1990404162, 22) + var3;
      var1 = b(var1 + b(var2, var3, var4) + this.i[12] + 1804603682, 7) + var2;
      var4 = b(var4 + b(var1, var2, var3) + this.i[13] + -40341101, 12) + var1;
      var3 = b(var3 + b(var4, var1, var2) + this.i[14] + -1502002290, 17) + var4;
      var2 = b(var2 + b(var3, var4, var1) + this.i[15] + 1236535329, 22) + var3;
      var1 = b(var1 + c(var2, var3, var4) + this.i[1] + -165796510, 5) + var2;
      var4 = b(var4 + c(var1, var2, var3) + this.i[6] + -1069501632, 9) + var1;
      var3 = b(var3 + c(var4, var1, var2) + this.i[11] + 643717713, 14) + var4;
      var2 = b(var2 + c(var3, var4, var1) + this.i[0] + -373897302, 20) + var3;
      var1 = b(var1 + c(var2, var3, var4) + this.i[5] + -701558691, 5) + var2;
      var4 = b(var4 + c(var1, var2, var3) + this.i[10] + 38016083, 9) + var1;
      var3 = b(var3 + c(var4, var1, var2) + this.i[15] + -660478335, 14) + var4;
      var2 = b(var2 + c(var3, var4, var1) + this.i[4] + -405537848, 20) + var3;
      var1 = b(var1 + c(var2, var3, var4) + this.i[9] + 568446438, 5) + var2;
      var4 = b(var4 + c(var1, var2, var3) + this.i[14] + -1019803690, 9) + var1;
      var3 = b(var3 + c(var4, var1, var2) + this.i[3] + -187363961, 14) + var4;
      var2 = b(var2 + c(var3, var4, var1) + this.i[8] + 1163531501, 20) + var3;
      var1 = b(var1 + c(var2, var3, var4) + this.i[13] + -1444681467, 5) + var2;
      var4 = b(var4 + c(var1, var2, var3) + this.i[2] + -51403784, 9) + var1;
      var3 = b(var3 + c(var4, var1, var2) + this.i[7] + 1735328473, 14) + var4;
      var2 = b(var2 + c(var3, var4, var1) + this.i[12] + -1926607734, 20) + var3;
      var1 = b(var1 + (var2 ^ var3 ^ var4) + this.i[5] + -378558, 4) + var2;
      var4 = b(var4 + (var1 ^ var2 ^ var3) + this.i[8] + -2022574463, 11) + var1;
      var3 = b(var3 + (var4 ^ var1 ^ var2) + this.i[11] + 1839030562, 16) + var4;
      var2 = b(var2 + (var3 ^ var4 ^ var1) + this.i[14] + -35309556, 23) + var3;
      var1 = b(var1 + (var2 ^ var3 ^ var4) + this.i[1] + -1530992060, 4) + var2;
      var4 = b(var4 + (var1 ^ var2 ^ var3) + this.i[4] + 1272893353, 11) + var1;
      var3 = b(var3 + (var4 ^ var1 ^ var2) + this.i[7] + -155497632, 16) + var4;
      var2 = b(var2 + (var3 ^ var4 ^ var1) + this.i[10] + -1094730640, 23) + var3;
      var1 = b(var1 + (var2 ^ var3 ^ var4) + this.i[13] + 681279174, 4) + var2;
      var4 = b(var4 + (var1 ^ var2 ^ var3) + this.i[0] + -358537222, 11) + var1;
      var3 = b(var3 + (var4 ^ var1 ^ var2) + this.i[3] + -722521979, 16) + var4;
      var2 = b(var2 + (var3 ^ var4 ^ var1) + this.i[6] + 76029189, 23) + var3;
      var1 = b(var1 + (var2 ^ var3 ^ var4) + this.i[9] + -640364487, 4) + var2;
      var4 = b(var4 + (var1 ^ var2 ^ var3) + this.i[12] + -421815835, 11) + var1;
      var3 = b(var3 + (var4 ^ var1 ^ var2) + this.i[15] + 530742520, 16) + var4;
      var2 = b(var2 + (var3 ^ var4 ^ var1) + this.i[2] + -995338651, 23) + var3;
      var1 = b(var1 + (var3 ^ (var2 | ~var4)) + this.i[0] + -198630844, 6) + var2;
      var4 = b(var4 + (var2 ^ (var1 | ~var3)) + this.i[7] + 1126891415, 10) + var1;
      var3 = b(var3 + d(var4, var1, var2) + this.i[14] + -1416354905, 15) + var4;
      var2 = b(var2 + d(var3, var4, var1) + this.i[5] + -57434055, 21) + var3;
      var1 = b(var1 + d(var2, var3, var4) + this.i[12] + 1700485571, 6) + var2;
      var4 = b(var4 + d(var1, var2, var3) + this.i[3] + -1894986606, 10) + var1;
      var3 = b(var3 + d(var4, var1, var2) + this.i[10] + -1051523, 15) + var4;
      var2 = b(var2 + d(var3, var4, var1) + this.i[1] + -2054922799, 21) + var3;
      var1 = b(var1 + d(var2, var3, var4) + this.i[8] + 1873313359, 6) + var2;
      var4 = b(var4 + d(var1, var2, var3) + this.i[15] + -30611744, 10) + var1;
      var3 = b(var3 + d(var4, var1, var2) + this.i[6] + -1560198380, 15) + var4;
      var2 = b(var2 + d(var3, var4, var1) + this.i[13] + 1309151649, 21) + var3;
      var1 = b(var1 + d(var2, var3, var4) + this.i[4] + -145523070, 6) + var2;
      var4 = b(var4 + d(var1, var2, var3) + this.i[11] + -1120210379, 10) + var1;
      var3 = b(var3 + d(var4, var1, var2) + this.i[2] + 718787259, 15) + var4;
      var2 = b(var2 + d(var3, var4, var1) + this.i[9] + -343485551, 21) + var3;
      this.e += var1;
      this.f += var2;
      this.g += var3;
      this.h += var4;
      this.j = 0;

      for(int var24 = 0; var24 != this.i.length; ++var24) {
         this.i[var24] = 0;
      }
   }
}
