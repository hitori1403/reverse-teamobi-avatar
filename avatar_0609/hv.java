import java.io.IOException;

public final class hv extends hs {
   private static hv d;
   private static final String[] e;

   public static hv b() {
      if (d == null) {
         d = new hv();
      }

      return d;
   }

   public final void b(int var1, int var2) {
      String[] var4 = e;
      new StringBuffer(var4[4]).append(var1).append(var4[0]).append(var2);
      if (fp.R == 0) {
         k4.i();
      }

      this.a((byte)50);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
         var3 = super.c;
         super.c.d.writeShort(gx.N);
         var3 = super.c;
         super.c.d.writeShort(gx.O);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      this.a();
   }

   public final void b(int var1, int var2, int var3, int var4) {
      this.a((byte)54);

      try {
         ij var5 = super.c;
         super.c.d.writeShort(var1);
         var5 = super.c;
         super.c.d.writeShort(var2);
         var5 = super.c;
         super.c.d.writeByte(var3);
         var5 = super.c;
         super.c.d.writeShort(var4);
      } catch (IOException var6) {
      }

      this.a();
   }

   public final void b(String var1) {
      if (GameMidlet.f == 10) {
         this.a((byte)77);
      } else {
         this.a((byte)55);
      }

      this.a(var1);
      this.a();
   }

   public final void d(int var1) {
      this.a((byte)-21);
      this.a(var1);
      this.a();
   }

   public final void b(int var1, boolean var2) {
      this.a((byte)-19);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeBoolean(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void b(int var1, int var2, int var3) {
      String[] var5 = e;
      new StringBuffer(var5[3]).append(var1).append(var5[2]).append(GameMidlet.k.f);
      this.a((byte)58);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeShort(var2);
         var4 = super.c;
         super.c.d.writeByte(var3);
      } catch (IOException var6) {
      }

      this.a();
   }

   public final void c(int var1, int var2) {
      this.a((byte)59);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeShort(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void e(int var1) {
      e[1].concat(String.valueOf(var1));
      this.a((byte)-22);
      this.a(var1);
      this.a();
   }

   public final void b(byte var1) {
      this.a((byte)60);
      this.b(var1);
      this.a();
   }

   public final void b(short var1) {
      this.a((byte)-38);
      this.c(var1);
      this.a();
   }

   public final void b(byte[] var1) {
      this.a((byte)84);

      try {
         ij var3 = super.c;
         super.c.d.writeBoolean(true);
         var3 = super.c;
         super.c.d.writeByte(var1.length);

         for(int var2 = 0; var2 < var1.length; ++var2) {
            var3 = super.c;
            super.c.d.writeByte(var1[var2]);
         }
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void c() {
      this.a((byte)85);
      this.a();
   }

   public final void d(int var1, int var2) {
      this.a((byte)-68);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeInt(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void c(int var1, int var2, int var3) {
      this.a((byte)-77);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeByte(var3);
      } catch (Exception var5) {
      }

      this.a();
   }

   public final void d(int var1, int var2, int var3) {
      this.a((byte)-78);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeShort(var3);
      } catch (Exception var5) {
      }

      this.a();
   }

   public final void f(int var1) {
      this.a((byte)89);

      try {
         ij var2 = super.c;
         super.c.d.writeByte(0);
         var2 = super.c;
         super.c.d.writeInt(var1);
      } catch (Exception var3) {
      }

      this.a();
   }

   public final void e(int var1, int var2) {
      this.a((byte)93);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.a();
   }

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u001fTo\u0013[\u001b\u001dNWGVL\u0000\u0016DS@zQ\u0012 \u0011\u0006\u0004\u001fTo\u000b";
      int var4 = "\u001fTo\u0013[\u001b\u001dNWGVL\u0000\u0016DS@zQ\u0012 \u0011\u0006\u0004\u001fTo\u000b".length();
      char var1 = 3;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(c(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     e = var5;
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

                  var2 = "[\u001b\bB@FtV\u0002&EA\b\u0013\f[\u001b\u0005DO\\c^\u0006$\u0011\u0006";
                  var4 = "[\u001b\bB@FtV\u0002&EA\b\u0013\f[\u001b\u0005DO\\c^\u0006$\u0011\u0006".length();
                  var1 = 14;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] c(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '3');
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
               var10005 = 63;
               break;
            case 1:
               var10005 = 116;
               break;
            case 2:
               var10005 = 79;
               break;
            case 3:
               var10005 = 43;
               break;
            case 4:
               var10005 = 38;
               break;
            case 5:
               var10005 = 50;
               break;
            default:
               var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
