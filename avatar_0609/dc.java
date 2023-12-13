import java.util.Vector;

public final class dc {
   public boolean b;
   public String c;
   public ag d;
   public ag e;
   public Vector f = new Vector();
   public String g = "";
   public int h;
   public boolean i;
   public int j;
   static int k = k4.V.b();
   public static int l;
   static int m;
   static int n;
   static int o;
   public static int p;
   int q = 0;
   int r;
   int s;
   boolean t = false;
   long u;
   long v;
   private static final String w;

   static {
      String var10002 = a(a("t7"));
      boolean var10001 = true;
      w = var10002;
   }

   public dc(String var1, int var2, ag var3, ag var4, boolean var5) {
      this.c = var1;
      this.h = var2;
      this.d = var3;
      this.i = var5;
      if (var4 == null && fm.E != null) {
         this.e = fm.E.H;
      } else {
         this.e = var4;
      }

      this.a();
      this.c();
      this.b = true;
   }

   private void a() {
      this.j = ib.b().f - ib.t - (ev.b << 1) - 7 - (this.i ? fm.D.e : 0);
   }

   public final void b(String var1, String var2) {
      this.b = true;
      this.b(var1 + w + var2);
   }

   public final void b(String var1) {
      Vector var4;
      int var2 = (var4 = k4.V.c(var1, k4.o - ((fm.F << 1) + 30 + 10 * (ev.a - 1)))).size();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.f.addElement(var4.elementAt(var3));
         if (this.f.size() > 100) {
            this.f.removeElementAt(0);
         }
      }

      if (fm.g().d(fm.g().C) == this) {
         this.b();
      }
   }

   public final void b() {
      int var1 = this.f.size();
      gt.b().b(var1 * k, this.j);
      if ((p = var1 * k - this.j) < 0) {
         p = 0;
      }

      if (b2.f(l - p) <= k) {
         l = p;
      }
   }

   public final void c() {
      this.a();
      m = 0;
      l = 0;
      this.b();
      l = m;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '?');
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
               var10005 = 78;
               break;
            case 1:
               var10005 = 23;
               break;
            case 2:
               var10005 = 17;
               break;
            case 3:
               var10005 = 75;
               break;
            case 4:
               var10005 = 26;
               break;
            case 5:
               var10005 = 46;
               break;
            default:
               var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
