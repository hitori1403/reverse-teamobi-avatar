import java.io.IOException;

public final class h2 extends hs {
   private static h2 d;
   private static final String[] e;

   public static h2 b() {
      if (d == null) {
         d = new h2();
      }

      return d;
   }

   public final void b(short var1) {
      this.a((byte)54);
      this.c(var1);
      this.a();
      k4.d(hq.aM);
   }

   public final void c() {
      this.a((byte)55);
      this.a();
      k4.d(hq.aM);
   }

   public final void d() {
      this.a((byte)56);
      this.a();
      k4.d(hq.aM);
   }

   public final void e() {
      this.a((byte)60);
      this.a();
   }

   public final void d(int var1) {
      this.a((byte)61);
      this.a(var1);
      this.a();
   }

   public final void b(short var1, byte var2, int var3) {
      this.a((byte)62);

      try {
         ij var4 = super.c;
         super.c.d.writeShort(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeByte(var3);
      } catch (IOException var5) {
      }

      this.a();
      k4.h();
   }

   public final void c(short var1) {
      this.a((byte)63);
      this.c(var1);
      this.a();
   }

   public final void b(int var1, int var2, int var3) {
      this.a((byte)64);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeByte(var3);
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void c(int var1, int var2, int var3) {
      String[] var5 = e;
      new StringBuffer(var5[0]).append(var2).append(var5[2]).append(var3);
      this.a((byte)65);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeShort(var3);
      } catch (IOException var6) {
      }

      this.a();
   }

   public final void b(int var1, int var2) {
      String[] var4 = e;
      new StringBuffer(var4[1]).append(var1).append(var4[3]).append(var2);
      this.a((byte)66);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void c(int var1, int var2) {
      this.a((byte)70);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void e(int var1) {
      this.a((byte)69);
      this.a(var1);
      this.a();
   }

   public final void d(int var1, int var2) {
      this.a((byte)74);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(int var1, byte var2) {
      this.a((byte)73);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(n var1, int var2) {
      k4.h();
      this.a((byte)71);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(var1.b);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void e(int var1, int var2) {
      this.a((byte)72);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void f(int var1, int var2) {
      this.a((byte)75);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void g(int var1, int var2) {
      this.a((byte)80);
      this.b(var1);
      if (var1 == 1) {
         this.b(var2);
      }

      this.a();
   }

   public final void h(int var1, int var2) {
      this.a((byte)81);
      this.b(var1);
      if (var1 == 1) {
         this.b(var2);
      }

      this.a();
   }

   public final void d(short var1) {
      this.a((byte)82);
      this.c(var1);
      this.a();
   }

   public final void f(int var1) {
      this.a((byte)84);
      this.b(var1);
      this.a();
   }

   public final void g(int var1) {
      this.a((byte)86);
      this.b(var1);
      this.a();
   }

   public final void i(int var1, int var2) {
      this.a((byte)90);
      this.b(var1);
      if (var1 == 1) {
         this.b(var2);
      }

      this.a();
   }

   public final void j(int var1, int var2) {
      this.a((byte)94);
      this.b(var1);
      if (var1 == 1) {
         this.b(var2);
      }

      this.a();
   }

   public final void e(short var1) {
      k4.i();
      this.a((byte)91);
      this.c(var1);
      this.a();
   }

   public final void h(int var1) {
      this.a((byte)93);
      this.b(var1);
      this.a();
   }

   public final void f() {
      this.a((byte)96);
      this.b(0);
      this.a();
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "2XK\u0006#:L\u001fC{\u0018pt\u000b2XV\u00108\"N%C$U";
      int var4 = "2XK\u0006#:L\u001fC{\u0018pt\u000b2XV\u00108\"N%C$U".length();
      char var1 = '\r';
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

                  var2 = "v\u0017>U\u0003v\u0017>";
                  var4 = "v\u0017>U\u0003v\u0017>".length();
                  var1 = 4;
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
         var10000[0] = (char)(var10000[0] ^ '+');
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
               var10005 = 86;
               break;
            case 1:
               var10005 = 55;
               break;
            case 2:
               var10005 = 30;
               break;
            case 3:
               var10005 = 117;
               break;
            case 4:
               var10005 = 74;
               break;
            case 5:
               var10005 = 84;
               break;
            default:
               var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
