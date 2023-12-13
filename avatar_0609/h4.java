import java.io.IOException;

public final class h4 extends hs {
   private static h4 d;
   private static final String e;

   public static h4 b() {
      if (d == null) {
         d = new h4();
      }

      return d;
   }

   public final void c() {
      this.a((byte)-11);
      this.a(fi.Y);
      this.a();
   }

   public final void b(short var1) {
      this.a((byte)-14);
      this.c(var1);
      this.a();
      k4.d(hq.aN);
   }

   public final void d() {
      this.a((byte)-15);
      this.a();
      k4.d(hq.aN);
   }

   public final void e() {
      this.a((byte)-16);
      this.a();
      k4.d(hq.aN);
   }

   public final void f() {
      this.a((byte)-37);
      this.a();
      k4.d(hq.aN);
   }

   public final void g() {
      this.a((byte)-40);
      this.a();
   }

   public final void h() {
      this.a((byte)-41);
      this.a();
   }

   public final void d(int var1) {
      if (GameMidlet.f == 9 || GameMidlet.f == 11) {
         this.a((byte)57);
         this.b(var1);
         this.a();
      }
   }

   public final void b(int var1, int var2) {
      this.a((byte)-24);

      try {
         ij var3 = super.c;
         super.c.d.writeShort(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(short[] var1, int var2) {
      this.a((byte)-46);

      try {
         ij var3 = super.c;
         super.c.d.writeShort(var2);
         var3 = super.c;
         super.c.d.writeShort(var1.length);

         for(int var5 = 0; var5 < var1.length; ++var5) {
            var3 = super.c;
            super.c.d.writeByte(var1[var5]);
         }

         var3 = super.c;
         super.c.d.writeShort(0);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(iq var1) {
      new StringBuffer(e).append(var1.i);
      this.a((byte)-74);

      try {
         ij var2 = super.c;
         super.c.d.writeShort(var1.i);
         var2 = super.c;
         super.c.d.writeByte(var1.a / 24);
         var2 = super.c;
         super.c.d.writeByte(var1.b / 24);
         var2 = super.c;
         super.c.d.writeByte(var1.f);
      } catch (IOException var3) {
      }

      this.a();
   }

   public final void e(int var1) {
      k4.i();
      this.a((byte)-65);
      this.a(var1);
      this.a();
   }

   public final void c(iq var1) {
      this.a((byte)-66);

      try {
         ij var2 = super.c;
         super.c.d.writeShort(var1.i);
         var2 = super.c;
         super.c.d.writeByte(var1.a / 24);
         var2 = super.c;
         super.c.d.writeByte(var1.b / 24);
         var2 = super.c;
         super.c.d.writeByte(var1.j);
      } catch (Exception var3) {
      }

      this.a();
   }

   public final void f(int var1) {
      this.a((byte)-67);
      this.b(var1);
      this.a();
   }

   public final void g(int var1) {
      this.a((byte)-69);
      this.a(var1);
      this.a();
   }

   public final void h(int var1) {
      this.a((byte)-70);
      this.a(var1);
      this.a();
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a((byte)-71);

      try {
         ij var7 = super.c;
         super.c.d.writeShort(var1);
         var7 = super.c;
         super.c.d.writeByte(var2);
         var7 = super.c;
         super.c.d.writeByte(var3);
         var7 = super.c;
         super.c.d.writeByte(var4);
         var7 = super.c;
         super.c.d.writeByte(var5);
         var7 = super.c;
         super.c.d.writeByte(var6);
      } catch (IOException var8) {
      }

      this.a();
   }

   public final void b(String var1, int var2, int var3) {
      this.a((byte)-75);

      try {
         ij var4 = super.c;
         super.c.d.writeByte(var3);
         var4 = super.c;
         super.c.d.writeUTF(var1);
         if (var3 == 1) {
            var4 = super.c;
            super.c.d.writeInt(var2);
         }
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void c(short var1) {
      this.a((byte)-80);
      this.c(var1);
      this.a();
   }

   public final void d(short var1) {
      this.a((byte)-84);
      this.b(var1);
      this.a();
   }

   public final void i(int var1) {
      this.a((byte)-104);
      this.a(var1);
      this.a();
   }

   static {
      String var10002 = b(b("\u0001\t\u0016,d-C\u0000\u000b\u001c6h\u0017R^F"));
      boolean var10001 = true;
      e = var10002;
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '7');
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
               var10005 = 101;
               break;
            case 1:
               var10005 = 102;
               break;
            case 2:
               var10005 = 84;
               break;
            case 3:
               var10005 = 89;
               break;
            case 4:
               var10005 = 29;
               break;
            case 5:
               var10005 = 100;
               break;
            default:
               var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
