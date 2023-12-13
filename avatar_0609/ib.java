import javax.microedition.lcdui.Graphics;

public final class ib {
   public static g_ b;
   public static g_ c;
   public static ib d;
   public static int[] e;
   public int f;
   public int g;
   public int h;
   public int i;
   private int j;
   public int k;
   public int l = 10;
   public static String m;
   public int n;
   private int o = 0;
   private int p;
   public int[] q;
   public int[] r;
   private String s;
   public static byte t;
   private static final String[] a;

   public static ib b() {
      if (d == null) {
         d = new ib();
      }

      return d;
   }

   public ib() {
      t = (byte)(ev.j << 1);
      if (k4.b != null && k4.M) {
         this.l = 17;
      } else {
         this.l = 10;
      }

      if (k4.ah != 0) {
         this.l *= k4.ah + 1;
      }
   }

   public final void b(String var1, int var2, int var3, int var4) {
      this.g = var2;
      this.f = var3;
      this.j = var4;
      if (var1 != null) {
         this.s = var1;
         if (k4.S.b(this.s) > this.g / 2 && this.s.length() > 10) {
            this.s = this.s.substring(0, 10);
         }

         this.k = k4.S.b(this.s) + 10 + (k4.ah != 0 ? 35 * k4.ah : 0);
      }

      if (this.k < 40) {
         this.k = 40;
      }

      this.c();
      this.n = 0;
      this.q = new int[this.j];
      this.r = new int[this.j];
      this.p = (this.g - this.k) / this.l;
      this.o = 0;
   }

   public final void c() {
      this.h = k4.q - this.g / 2;
      this.i = (k4.s - k4.ab) / 2 - this.f / 2;
   }

   public final void b(int var1, int var2) {
      if (var2 != this.n) {
         this.q[var2] = var1;
         this.r[var2] = b2.e(20);
      }
   }

   public final void b(String var1, int var2) {
      if (this.q != null && var2 < this.q.length) {
         this.q[var2] = 0;
      }

      this.s = var1;
      int var3;
      if ((var3 = k4.S.b(this.s) + 10) > this.k) {
         this.k = var3;
         this.p = (this.g - this.k) / this.l;
      }

      this.n = var2;
      if (this.n >= this.p && this.p > 0) {
         this.o = this.n - (this.p - 1);
      }

      if (this.n < this.o) {
         this.o = this.n;
      }
   }

   public static void d() {
      String[] var0 = a;
      GameMidlet.q = var0[0];
      m = var0[1];
      fc.X = k4.b(GameMidlet.q, 5);
   }

   public final void b(int var1) {
      this.q = new int[var1];
      this.r = new int[var1];
      this.j = var1;
   }

   public final int e() {
      if (k4.i) {
         for(int var2 = this.n - 1; var2 >= this.o; --var2) {
            int var1 = var2 - this.o;
            if (k4.d(this.h + 3 + var1 * this.l, this.i + 3, this.l, t)) {
               return var2 - this.n;
            }
         }

         int var5 = this.j;
         if (this.j >= this.p) {
            var5 = this.p + this.o;
         }

         for(int var3 = this.n + 1; var3 < var5; ++var3) {
            int var4 = var3 - this.o;
            if (k4.d(this.h + 3 + var4 * this.l + (this.k - this.l), this.i + 3, this.l, t)) {
               return var3 - this.n;
            }
         }
      }

      return 0;
   }

   public final void b(Graphics var1) {
      k4.aa.b(var1, this.h, this.i, this.f, this.g, this.n, this.o, this.l, this.k, t, this.j, this.p, this.r, this.q, this.s);
      k4.d(var1);
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      b(var1, var2, var3, var4, e[0], var0);
      var0.setColor(e[2]);
      var0.drawRect(var1, var2, var3, var4);
      var0.setColor(12450472);
      var0.drawRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
      var0.setColor(5738823);
      var0.drawRect(var1 + 2, var2 + 2, var3 - 4, var4 - 4);
   }

   public static void b(int var0, int var1, int var2, int var3, int var4, Graphics var5) {
      var5.setColor(var4);
      var5.fillRect(var0, var1, var2, var3);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "9S\f\u0016\u0003 X4";
      int var4 = "9S\f\u0016\u0003 X4".length();
      char var1 = 4;
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
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
               var10005 = 80;
               break;
            case 1:
               var10005 = 52;
               break;
            case 2:
               var10005 = 83;
               break;
            case 3:
               var10005 = 58;
               break;
            case 4:
               var10005 = 35;
               break;
            case 5:
               var10005 = 23;
               break;
            default:
               var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
