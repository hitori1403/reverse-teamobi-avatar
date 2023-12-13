import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ez extends ex {
   private g_ n;
   public static ez o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int[] w;
   private static final String[] x;

   public static ez d() {
      return o == null ? (o = new ez()) : o;
   }

   public final void e() {
      ez var1 = this;
      if (this.n == null) {
         try {
            var1.n = new g_(Image.createImage(hq.b() + x[1]), ev.a == 2 ? 112 : 52, 16 * ev.a);
         } catch (IOException var2) {
            var2.printStackTrace();
         }

         this.r = this.n.b * 3 + 30 * ev.a;
         this.s = this.n.c * 3 + 60 * ev.a;
         this.p = (k4.o - this.r) / 2;
         this.q = (k4.p - this.s) / 2;
         this.t = this.s / 3;
         this.u = this.r / 3;
         this.w = new int[]{100, 1000, 10000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
         super.f = new ag(hq.P, 0, this);
         super.g = new ag(hq.e, 1, this);
      }

      k4.y = this;
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            k4.b(x[0], new ig(this));
            return;
         case 1:
            k4.y = null;
      }
   }

   public final void b() {
   }

   public final void c() {
      super.c();
      if (k4.d(2)) {
         if (this.v / 3 > 0) {
            this.v -= 3;
         }
      } else if (k4.d(4)) {
         if (this.v % 3 > 0) {
            --this.v;
         }
      } else if (k4.d(6)) {
         if (this.v % 3 < 2) {
            ++this.v;
         }
      } else if (k4.d(8) && this.v / 3 < 2) {
         this.v += 3;
      }

      if (k4.i) {
         for(int var1 = 0; var1 < this.w.length; ++var1) {
            if (k4.e(this.p + var1 % 3 * this.u, this.q + var1 / 3 * this.t, this.u, this.t)) {
               k4.i = false;
               this.v = var1;
               return;
            }
         }
      }
   }

   public final void b(Graphics var1) {
      k4.u.a(var1);
      k4.d(var1);
      k4.aa.f(var1, this.p, this.q, this.r, this.s);
      var1.translate(this.p, this.q);

      for(int var2 = 0; var2 < this.w.length; ++var2) {
         this.n.b(this.v == var2 ? 1 : 0, this.u / 2 + var2 % 3 * this.u, this.t / 2 + var2 / 3 * this.t, 0, 3, var1);
         k4.Y.b(var1, String.valueOf(this.w[var2]), this.u / 2 + var2 % 3 * this.u, this.t / 2 + var2 / 3 * this.t - ev.k / 2, 2);
      }

      k4.d(var1);
      fp.b(var1, super.e, super.f, super.g);
   }

   static int[] b(ez var0) {
      return var0.w;
   }

   static int c(ez var0) {
      return var0.v;
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "yẊ]2iµ\\XCẜq*+\tỪE\u0013qb3\u0005ỸE\u0013fcẇ\u0012\u001b@[æd!\\\u0004\u000b\u0014IFf~)\u0012\u0015[]u";
      int var4 = "yẊ]2iµ\\XCẜq*+\tỪE\u0013qb3\u0005ỸE\u0013fcẇ\u0012\u001b@[æd!\\\u0004\u000b\u0014IFf~)\u0012\u0015[]u".length();
      char var1 = '$';
      int var0 = -1;

      while(true) {
         String var10002 = b(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            x = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '|');
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
               var10005 = 59;
               break;
            case 1:
               var10005 = 43;
               break;
            case 2:
               var10005 = 51;
               break;
            case 3:
               var10005 = 18;
               break;
            case 4:
               var10005 = 10;
               break;
            case 5:
               var10005 = 70;
               break;
            default:
               var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
