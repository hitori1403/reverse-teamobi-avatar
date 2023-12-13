import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class bp {
   static bp b;
   String[] c;
   int[] d;
   int[] e;
   byte[] f;
   int g;
   private int h;
   private String i;
   private byte[] j = new byte[]{78, 103, 117, 121, 101, 110, 86, 97, 110, 77, 105, 110, 104};
   private int k = this.j.length;
   private DataInputStream l;
   private static final String m;

   public bp() {
   }

   public static void b() {
      b.c();
      b = null;
      System.gc();
   }

   public bp(String var1) {
      int var3 = 0;
      int var4 = 0;
      this.i = var1;
      this.h = 0;
      this.l = new DataInputStream(this.getClass().getResourceAsStream(this.i));

      try {
         this.g = this.l.readUnsignedByte();
         ++this.h;
         this.c = new String[this.g];
         this.d = new int[this.g];
         this.e = new int[this.g];

         for(int var5 = 0; var5 < this.g; ++var5) {
            byte var7;
            byte[] var2 = new byte[var7 = this.l.readByte()];
            this.l.read(var2);
            this.b(var2);
            this.c[var5] = new String(var2);
            this.d[var5] = var3;
            this.e[var5] = this.l.readUnsignedShort();
            var3 += this.e[var5];
            var4 += this.e[var5];
            this.h += var7 + 3;
         }

         this.f = new byte[var4];
         this.l.readFully(this.f);
         this.b(this.f);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

      this.c();
   }

   public static Image b(String var0) {
      bp var10000 = b;
      String var1 = var0 + m;
      bp var3 = var10000;

      for(int var2 = 0; var2 < var3.g; ++var2) {
         if (var3.c[var2].compareTo(var1) == 0) {
            return Image.createImage(var3.f, var3.d[var2], var3.e[var2]);
         }
      }

      return null;
   }

   public static void c(String var0) {
      b = new bp(hq.b() + var0);
   }

   private void b(byte[] var1) {
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3] ^= this.j[var3 % this.k];
      }
   }

   private void c() {
      try {
         if (this.l != null) {
            this.l.close();
            return;
         }
      } catch (IOException var1) {
      }
   }

   static {
      String var10002 = a(a("0\u000e\u0010f"));
      boolean var10001 = true;
      m = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '\\');
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
               var10005 = 30;
               break;
            case 1:
               var10005 = 126;
               break;
            case 2:
               var10005 = 126;
               break;
            case 3:
               var10005 = 1;
               break;
            case 4:
               var10005 = 65;
               break;
            case 5:
               var10005 = 7;
               break;
            default:
               var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
