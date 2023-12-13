import javax.microedition.lcdui.Graphics;

public final class ip extends il {
   public short h;
   public short i;
   public short j;
   public short k;
   public int l;
   private int m = 0;
   private int n = 0;
   public long o;
   public byte[] p;
   public byte[] q;
   private static final String r;

   public final void a() {
      if (System.currentTimeMillis() - this.o >= 1000L) {
         if (this.l > 0) {
            --this.l;
            if (this.l == 0) {
               h2 var1;
               (var1 = h2.b()).a((byte)83);
               var1.a();
            }
         }

         this.o = System.currentTimeMillis();
         dm var4;
         if ((var4 = f8.b(this.i)).c > 0 && this.m == 0) {
            this.m = var4.c / 3 << 1;
            this.n = var4.d / 2;
            ip var5 = this;
            if (this.k > 0) {
               int var2 = b2.e(3) + 3;
               this.p = new byte[var2];
               this.q = new byte[var2];

               for(int var3 = 0; var3 < var2; ++var3) {
                  var5.p[var3] = (byte)(b2.e(var5.m - 10) - (var5.m - 10) / 2);
                  var5.q[var3] = (byte)(b2.e(var5.n - 10) - (var5.n - 10) / 2);
               }
            }
         }
      }
   }

   public final void b(Graphics var1) {
      if (super.f >= 0 || super.a * ik.c + this.m / 2 >= cl.b().c && super.a * ik.c - this.m / 2 <= cl.b().c + k4.o) {
         f8.b(var1, this.i, super.a * ik.c, super.b * ik.c, 33);
         if (this.k > 0 && this.p != null) {
            for(int var2 = 0; var2 < this.p.length; ++var2) {
               f8.b(var1, this.j, super.a * ik.c + this.p[var2], super.b * ik.c - (f8.b(this.i).d / 2 + 5) + this.q[var2], 3);
            }
         }

         int var6 = f8.b(this.i).d + ev.i;
         if (this.l > 0) {
            var6 += ev.k;
         }

         f8.b(var1, this.j, (super.a - 8) * ik.c, super.b * ik.c - var6, 3);
         k4.T.b(var1, r + this.h, super.a * ik.c, super.b * ik.c - var6 - ev.i / 2, 0);
         if (this.l > 0) {
            int var3 = this.l / 3600;
            int var4 = (this.l - var3 * 3600) / 60;
            int var5 = this.l - var3 * 3600 - var4 * 60;
            k4.Y.b(var1, var3 + ":" + var4 + ":" + var5, (super.a + 3) * ik.c, super.b * ik.c - var6 + k4.T.b() / 2 + 2 * ik.c, 2);
         }
      }
   }

   static {
      String var10002 = a(a("\u0000b"));
      boolean var10001 = true;
      r = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'i');
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
               var10005 = 76;
               break;
            case 1:
               var10005 = 20;
               break;
            case 2:
               var10005 = 45;
               break;
            case 3:
               var10005 = 32;
               break;
            case 4:
               var10005 = 108;
               break;
            case 5:
               var10005 = 80;
               break;
            default:
               var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
