import java.io.IOException;

public class hs {
   private g7 b = jp.b();
   protected ij c;
   private static final String a;

   protected final void a(int var1) {
      try {
         ij var2 = this.c;
         this.c.d.writeInt(var1);
      } catch (IOException var3) {
      }
   }

   protected final void b(int var1) {
      try {
         ij var2 = this.c;
         this.c.d.writeByte(var1);
      } catch (IOException var3) {
      }
   }

   protected final void c(int var1) {
      try {
         ij var2 = this.c;
         this.c.d.writeShort(var1);
      } catch (IOException var3) {
      }
   }

   public final void a(String var1) {
      try {
         ij var2 = this.c;
         this.c.d.writeUTF(var1);
      } catch (IOException var3) {
      }
   }

   public final void a() {
      this.b.b(this.c);
      ij var1 = this.c;

      try {
         if (var1.f != null) {
            var1.f.close();
         }

         if (var1.d != null) {
            var1.d.close();
            return;
         }
      } catch (IOException var2) {
      }
   }

   public final void a(byte var1) {
      if (var1 != -97 && var1 != -98 && var1 != 54 && var1 != 55 && var1 != -80 && var1 != 51 && var1 != 53 && var1 != 57) {
         a.concat(String.valueOf((int)var1));
      }

      this.c = new ij(var1);
   }

   static {
      String var10002 = a(d("\u0003&\u0005\u0002A\u0018y\u0014~"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] d(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
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
               var10005 = 112;
               break;
            case 1:
               var10005 = 67;
               break;
            case 2:
               var10005 = 107;
               break;
            case 3:
               var10005 = 102;
               break;
            case 4:
               var10005 = 97;
               break;
            case 5:
               var10005 = 123;
               break;
            default:
               var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
