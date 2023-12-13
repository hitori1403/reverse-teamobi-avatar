import javax.microedition.lcdui.Graphics;

final class a0 extends ag {
   private final i3 g;
   private final ix h;
   private final in i;
   private static final String[] a;

   a0(i3 var1, ix var2, in var3) {
      super(null, null);
      this.g = var1;
      this.h = var2;
      this.i = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      this.g.b(var1, fb.D / 2, 37 * ev.a, true);
      if (this.h != null) {
         int var10002 = fb.D / 2 + 15 * ev.a;
         int var10003 = 37 * ev.a;
         short var6 = this.g.ai;
         int var5 = var10003;
         int var4 = var10002;
         ix var10 = this.h;
         jw var7;
         if ((var7 = (jw)f5.b(this.h.Q.ah)).b != -1) {
            int var8 = var5 + var7.l[ix.Z[var10.q][var10.h]];
            ib.b(var4 - 10, var8 - 10, 20, 3, 11381824, var1);
            var1.setColor(11072024);
            var1.drawRect(var4 - 10, var8 - 10, 20, 3);
            ib.b(var4 - 9, var8 - 9, var6 * 20 / 100, 2, 16644608, var1);
            if (var7.b >= 2000) {
               dm var15;
               if ((var15 = f5.c(var7.j[ix.Z[var10.q][var10.h]])).e != -1) {
                  var1.drawImage(ix.Y[var10.X ? 0 : 1], var4, var5 - 1, 3);
                  var1.drawRegion(
                     var15.b,
                     0,
                     0,
                     var15.c,
                     var15.d,
                     var10.s,
                     var4 + var7.k[ix.Z[var10.q][var10.h]] * ik.c - (var10.s == it.r ? (var7.k[ix.Z[var10.q][var10.h]] * ev.a << 1) + var15.c * ev.a : 0),
                     var8 + var10.V,
                     0
                  );
               }
            } else {
               hp var16 = f5.d[var7.j[ix.Z[var10.q][var10.h]]];
               var1.drawImage(ix.Y[var10.X ? 0 : 1], var4, var5 - 1, 3);
               var10002 = var16.d * ik.c;
               var10003 = var16.e * ik.c;
               int var10004 = var16.f * ik.c;
               int var10005 = var16.g * ik.c;
               int var10007 = var4 + var7.k[ix.Z[var10.q][var10.h]] * ik.c;
               var1.drawRegion(
                  f5.b(var16.c).f,
                  var10002,
                  var10003,
                  var10004,
                  var10005,
                  var10.s,
                  var10007 - (var10.s == it.r ? (var7.k[ix.Z[var10.q][var10.h]] * ev.a << 1) + var16.f * ev.a : 0),
                  var8 + var10.V,
                  0
               );
            }
         }
      }

      label77: {
         var2 = 40 * ev.a;
         var3 = 15 * ev.a;
         k4.V.b(var1, hq.aB + this.g.g, 0, var2, 0);
         StringBuffer var20;
         String var23;
         c9 var10000;
         Graphics var10001;
         if (this.g.f == GameMidlet.k.f) {
            if (GameMidlet.l.h <= 0 && GameMidlet.l.g <= 0) {
               break label77;
            }

            var10000 = k4.V;
            var10001 = var1;
            var20 = new StringBuffer(String.valueOf(hq.dC[0])).append(GameMidlet.l.h);
            String[] var9 = a;
            var20 = var20.append(var9[1]).append(GameMidlet.l.g);
            var23 = "%";
         } else {
            if (this.g.W <= 0 && this.g.S <= 0) {
               break label77;
            }

            var10000 = k4.V;
            var10001 = var1;
            var20 = new StringBuffer(String.valueOf(hq.dC[0])).append(this.g.W);
            String[] var17 = a;
            var20 = var20.append(var17[0]);
            var23 = this.g.S > 0 ? this.g.S + "%" : "";
         }

         var10000.b(var10001, var20.append(var23).toString(), 0, var2 += var3, 0);
      }

      if (this.g.V > 0 || this.g.T > 0) {
         k4.V.b(var1, hq.dC[1] + this.g.V + a[0] + (this.g.T > 0 ? this.g.T + "%" : ""), 0, var2 += var3, 0);
      }

      int var14 = 0;
      if (this.i.j > 125 * ev.a) {
         this.i.b(100 * ev.a);
         if (this.i.l >= 0) {
            var14 = this.i.l;
         }
      }

      int var12;
      k4.V.b(var1, this.i.h, 0 - var14, var12 = var2 + var3, 0);
      if (AutoController.W) {
         k4.V.b(var1, hq.c5 + this.g.A[3] + hq.m(), 0, var12 + var3, 0);
      }
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Sig\u0003Sig";
      int var4 = "Sig\u0003Sig".length();
      char var1 = 3;
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
         var10000[0] = (char)(var10000[0] ^ '$');
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
               var10005 = 115;
               break;
            case 1:
               var10005 = 66;
               break;
            case 2:
               var10005 = 71;
               break;
            case 3:
               var10005 = 79;
               break;
            case 4:
               var10005 = 69;
               break;
            case 5:
               var10005 = 71;
               break;
            default:
               var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
