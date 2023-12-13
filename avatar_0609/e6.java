import javax.microedition.lcdui.Graphics;

public final class e6 extends e4 {
   public String n;
   public byte o;
   private int p = 200;
   private int q = ev.j * 11;
   public int r;
   public int s;
   public int t;
   public int u;
   private static final String[] v;

   public e6() {
      super.e = fe.g().C;
   }

   public final void b(Graphics var1) {
      k4.aa.b(var1, (k4.o - this.p) / 2, (k4.p - this.q) / 2, this.p, this.q, ib.e[2], ib.e[3], 1);
      var1.translate((k4.o - this.p) / 2, (k4.p - this.q) / 2);
      int var2;
      k4.S.b(var1, String.valueOf(fe.g().at), this.p / 2, (var2 = 0 + ev.j) - ev.j / 2 - 2 * ev.a, 2);
      String[] var6 = v;
      int var7;
      k4.S.b(var1, var6[1], this.p / 2, var7 = var2 + ev.j / 2 + 2 * ev.a, 2);
      k4.T.b(var1, this.n, this.p / 2, var2 = var7 + ev.j + 6 * ev.a, 2);
      var2 += ev.j << 1;

      for(int var3 = 0; var3 < 6; ++var3) {
         dm var4;
         if (this.o == fe.g().G[var3].f && (var4 = f5.d(fe.g().G[var3].G)).e != -1) {
            int var5 = var4.d / 5;
            var1.drawRegion(var4.b, 0, fe.V[0][0] * var5, var4.c, var5, 0, this.p / 2, var2 + ev.j / 2, 3);
         }
      }

      var2 += ev.j / 2;
      var6 = v;
      int var11;
      k4.S.b(var1, var6[3], 10, var11 = var2 + ev.j, 0);
      k4.Y.b(var1, "" + this.r, this.p - 20, var11 + ev.j / 2 - ev.k / 2, 1);
      k4.S.b(var1, var6[0], 10, var2 = var11 + ev.j, 0);
      k4.Y.b(var1, "" + this.s, this.p - 20, var2 + ev.j / 2 - ev.k / 2, 1);
      int var13;
      k4.S.b(var1, var6[4], 10, var13 = var2 + ev.j, 0);
      k4.Y.b(var1, "" + this.t, this.p - 20, var13 + ev.j / 2 - ev.k / 2, 1);
      k4.S.b(var1, var6[2], 10, var2 = var13 + ev.j, 0);
      k4.Y.b(var1, "" + this.u, this.p - 20, var2 + ev.j / 2 - ev.k / 2, 1);
      super.b(var1);
   }

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "tsặ\u0001\"đT\u001a:\u0013tr\u008cOēg[\u0000y\u001e\u0006ẽ|\u001aTrộ\u0001e\u0010tsặ\u0001\"|RẍtVžƲựY\u001a:";
      int var4 = "tsặ\u0001\"đT\u001a:\u0013tr\u008cOēg[\u0000y\u001e\u0006ẽ|\u001aTrộ\u0001e\u0010tsặ\u0001\"|RẍtVžƲựY\u001a:".length();
      char var1 = '\t';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     v = var5;
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

                  var2 = "tsặ\u0001\"qƊểyLO\u000btsặ\u0001\"fRUấLO";
                  var4 = "tsặ\u0001\"qƊểyLO\u000btsặ\u0001\"fRUấLO".length();
                  var1 = 11;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ ':');
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
               var10005 = 32;
               break;
            case 1:
               var10005 = 26;
               break;
            case 2:
               var10005 = 118;
               break;
            case 3:
               var10005 = 111;
               break;
            case 4:
               var10005 = 2;
               break;
            case 5:
               var10005 = 18;
               break;
            default:
               var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
