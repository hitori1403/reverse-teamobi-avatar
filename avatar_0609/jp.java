import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.SocketConnection;

public final class jp implements g7 {
   private static jp b = new jp();
   private DataOutputStream c;
   public DataInputStream d;
   public c0 e;
   public SocketConnection f;
   public boolean g;
   public boolean h;
   private final b0 i = new b0(this);
   public Thread j;
   public Thread k;
   public int l;
   public int m;
   public boolean n;
   public byte[] o = null;
   private byte p;
   private byte q;
   long r;
   public String s = "";
   public static boolean t;

   public static jp b() {
      return b;
   }

   public final boolean c() {
      return this.g;
   }

   public final void b(ij var1) {
      b0 var3 = this.i;
      this.i.b.addElement(var1);
   }

   private synchronized void a(ij var1) {
      byte[] var2 = var1.c.toByteArray();

      try {
         if (this.n) {
            byte var5 = this.b(var1.b);
            this.c.writeByte(var5);
         } else {
            this.c.writeByte(var1.b);
         }

         if (var2 != null) {
            int var6 = var2.length;
            if (this.n) {
               byte var3 = this.b((byte)(var6 >> 8));
               this.c.writeByte(var3);
               byte var7 = this.b((byte)var6);
               this.c.writeByte(var7);
            } else {
               this.c.writeShort(var6);
            }

            if (this.n) {
               for(int var8 = 0; var8 < var2.length; ++var8) {
                  var2[var8] = this.b(var2[var8]);
               }
            }

            this.c.write(var2);
            this.l += 5 + var2.length;
         } else {
            this.c.writeShort(0);
            this.l += 5;
         }

         this.c.flush();
      } catch (IOException var4) {
      }
   }

   private byte b(byte var1) {
      var1 = (byte)(this.o[this.q++] & 255 ^ var1 & 255);
      if (this.q >= this.o.length) {
         this.q = (byte)(this.q % this.o.length);
      }

      return var1;
   }

   public void d() {
      this.o = null;
      this.p = 0;
      this.q = 0;

      try {
         this.g = false;
         this.h = false;
         if (this.f != null) {
            this.f.close();
            this.f = null;
         }

         if (this.c != null) {
            this.c.close();
            this.c = null;
         }

         if (this.d != null) {
            this.d.close();
            this.d = null;
         }

         this.k = null;
         System.gc();
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   static SocketConnection b(jp var0) {
      return var0.f;
   }

   static b0 c(jp var0) {
      return var0.i;
   }

   static void b(jp var0, SocketConnection var1) {
      var0.f = var1;
   }

   static void b(jp var0, DataOutputStream var1) {
      var0.c = var1;
   }

   static void b(jp var0, ij var1) {
      var0.a(var1);
   }

   static void d(jp var0) {
      var0.d();
   }

   static byte b(jp var0, byte var1) {
      var1 = (byte)(var0.o[var0.p++] & 255 ^ var1 & 255);
      if (var0.p >= var0.o.length) {
         var0.p = (byte)(var0.p % var0.o.length);
      }

      return var1;
   }
}
