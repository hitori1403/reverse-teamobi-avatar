import javax.microedition.lcdui.Graphics;

public final class e3 extends ev {
   public static e3 n;
   public cs o;
   public static boolean p = false;
   public c4 q;
   private long r;
   public static int s = 2000;
   private static final String t;

   static {
      String var10002 = b(a("4-\u0018v"));
      boolean var10001 = true;
      t = var10002;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.o.b("");
            p = false;
            this.o.b(true);
            i.e = 0;
            return;
         case 1:
            long var3;
            if ((var3 = System.currentTimeMillis()) - this.r < (long)s) {
               return;
            } else if (this.q != null) {
               cs var5 = this.o;
               this.q.b(this.o.o);
               this.o.b("");
               p = false;
               this.o.b(true);
               this.r = var3;
               i.e = 0;
            }
      }
   }

   protected e3() {
      super.e = new ag(hq.e, 0);
      super.f = new ag(hq.a1, 1);
      this.o = new cs();
      this.o.h = false;
      this.o.b(true);
      this.d();
      this.o.b = (k4.o - this.o.d) / 2;
      cs var1 = this.o;
      this.o.t = 40;
      super.g = this.o.b();
   }

   public final void d() {
      this.o.c = k4.s - k4.ab - this.o.e - 5;
      if (fp.O) {
         this.o.c -= 2 * ev.a;
      }

      this.o.d = k4.o - 10;
   }

   public static e3 e() {
      return n == null ? (n = new e3()) : n;
   }

   public final void b(int var1, c4 var2) {
      if (k4.D == null) {
         if (i.d == 1 && var1 == 432) {
            var1 = 119;
         }

         this.o.f(var1);
         cs var3 = this.o;
         if (!this.o.o.equals("")) {
            this.q = var2;
            p = true;
         }

         this.d();
         t.concat(String.valueOf(var1));
      }
   }

   public final void c() {
      this.o.f();
      if (fp.O && k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }
   }

   public final void b(Graphics var1) {
      if (fp.O) {
         fp.b(var1, super.e, super.f, super.g);
      } else {
         super.b(var1);
      }

      this.o.b(var1);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '/');
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
               var10005 = 93;
               break;
            case 1:
               var10005 = 67;
               break;
            case 2:
               var10005 = 108;
               break;
            case 3:
               var10005 = 75;
               break;
            case 4:
               var10005 = 109;
               break;
            case 5:
               var10005 = 36;
               break;
            default:
               var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
