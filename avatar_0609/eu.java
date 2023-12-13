import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class eu implements dl {
   private static g_ b;
   private static Image c;
   private static Image d;
   private static Image e;
   private static Image f;
   private static Image[] g;
   private static g_[] h;
   private static g_ i;
   private static g_ j;
   private static Image[] k;
   private static g_ l;
   private static g_ m;
   private static byte[][] n;
   private static int o;
   private byte p;
   private byte q;
   private byte r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static final String[] a;

   static {
      String[] var5 = new String[38];
      int var3 = 0;
      String var2 = "O\fV\u0003\u0003\u0002J\u0004O\u0018W2\u000b\u0002\u0002Jd9-]YCK%\f\u0002\u0002Jd86IC\t\n$$\tI\fQ#%8HE\u0004\u000e\u0002\u0002Jd#4[o\fJ~d6R\u0002^\\\u0007\u0002\u000eE9.v_\u0007L\u001fV$=,L\bY\u001fE%9-]O\u0003L\u001fb\u0010\u0002\u0002Jd>+]C\nP#+0\u0012B\u0003\u0002N\u0001\r\u0002\u000fE9\u00076RH\u0014\n;$>\u0002Y\u000f\u0004\u0003\u001dJ,\u0003L\u001f\u0016\u0002^_\u0013\u0002\u0002Jd#4[~\bH.)-^L\u0003\n$$\u000e\u0002\u0002Jd#4[o\fJyd6R\r\u0002\u000eE9.v_O_\n;$>\u000b\u0002\u0002Jd'*[\u001dCK%\u000b\u0002\\\u0016\u001b&,O\u0003\u001dJ,\r\u0002\u000eE9.v_O\\\n;$>\u0005N\u0005A(!\u000e\u0002\u0002Jd#4[o\fJ\u007fd6R\u0005_\u0002Q%.\u000b\u0002\u000eE9.v[\u0003\u001dJ,\u000e\u0002\u0002Jd#4[i\u0002K9d6R\u0004D\u000eK%\u000b\u0002\u000eE9.vZ\u0003\u001dJ,\f\u0002\u0002Jd#4[}\u0002T>:\u0003L\u001fs\t\u0002\u0002Jd(>\u0012B\u0003\f\u0002\u000eE9.v_OCT%-";
      int var4 = "O\fV\u0003\u0003\u0002J\u0004O\u0018W2\u000b\u0002\u0002Jd9-]YCK%\f\u0002\u0002Jd86IC\t\n$$\tI\fQ#%8HE\u0004\u000e\u0002\u0002Jd#4[o\fJ~d6R\u0002^\\\u0007\u0002\u000eE9.v_\u0007L\u001fV$=,L\bY\u001fE%9-]O\u0003L\u001fb\u0010\u0002\u0002Jd>+]C\nP#+0\u0012B\u0003\u0002N\u0001\r\u0002\u000fE9\u00076RH\u0014\n;$>\u0002Y\u000f\u0004\u0003\u001dJ,\u0003L\u001f\u0016\u0002^_\u0013\u0002\u0002Jd#4[~\bH.)-^L\u0003\n$$\u000e\u0002\u0002Jd#4[o\fJyd6R\r\u0002\u000eE9.v_O_\n;$>\u000b\u0002\u0002Jd'*[\u001dCK%\u000b\u0002\\\u0016\u001b&,O\u0003\u001dJ,\r\u0002\u000eE9.v_O\\\n;$>\u0005N\u0005A(!\u000e\u0002\u0002Jd#4[o\fJ\u007fd6R\u0005_\u0002Q%.\u000b\u0002\u000eE9.v[\u0003\u001dJ,\u000e\u0002\u0002Jd#4[i\u0002K9d6R\u0004D\u000eK%\u000b\u0002\u000eE9.vZ\u0003\u001dJ,\f\u0002\u0002Jd#4[}\u0002T>:\u0003L\u001fs\t\u0002\u0002Jd(>\u0012B\u0003\f\u0002\u000eE9.v_OCT%-"
         .length();
      char var1 = 3;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     a = var5;
                     n = new byte[][]{
                        {4, 6, 17, 0, 27, 14, 0, 27, 36},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 27, 36},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 36, 0, 37, 36},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 36, 0, 37, 36, 0, 27, 30},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 28, 0, 37, 28},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 28, 0, 37, 28, 0, 27, 36},
                        {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 28, 0, 37, 28, 0, 27, 20},
                        {4, 6, 17, 8, 27, 36},
                        {4, 6, 17, 9, 27, 36},
                        {4, 6, 17, 10, 27, 36},
                        {4, 6, 17, 0, 27, 36},
                        {4, 6, 17, 0, 27, 14}
                     };
                     cs.K = 0;
                     ib.e = new int[]{6201499, 2378578, 8705740, 2716523, 16701696, 7042560};
                     o = 0;
                     s = 35217;
                     t = 32382;
                     u = 23135;
                     v = 14414578;
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

                  var2 = "N\u0000@\u0005_\u0002Q%.";
                  var4 = "N\u0000@\u0005_\u0002Q%.".length();
                  var1 = 3;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public eu() {
      try {
         StringBuffer var10000 = new StringBuffer(String.valueOf(hq.b()));
         String[] var2 = a;
         k4.ag = Image.createImage(var10000.append(var2[23]).toString());
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      bp.c(hq.aw);
      i3.aD = g_.b("5", 50, 48);
      i3.aE = g_.b("2", 11, 10);
      String[] var5 = a;
      k4.ak = bp.b(var5[10]);
      ix.Y[0] = bp.b(var5[7]);
      ix.Y[1] = bp.b(var5[18]);
      ib.b = g_.b(var5[9], 9, 6);
      e2.D = g_.b(var5[2], 16, 16);
      f1.x = g_.b(var5[36], 24, 24);
      AutoController.M = bp.b(var5[0]);
      AutoController.C = bp.b(var5[11]);
      g_.b(var5[30], 17, 19);
      i3.ar = new g_(bp.b(var5[5]), 9, 9);
      i = g_.b(var5[25], 12, 12);
      cs.I = g_.b(var5[15], 4, 19);
      b = g_.b(var5[27], 8, 8);
      ib.c = g_.b(var5[17], 4, 6);
      j = new g_(bp.b(var5[33]), 6, 11);

      for(int var1 = 0; var1 < 2; ++var1) {
         var5 = a;
         fc.aa[var1] = bp.b(var5[13].concat(String.valueOf(var1)));
      }

      bp.b();

      try {
         StringBuffer var8 = new StringBuffer(String.valueOf(hq.b()));
         var5 = a;
         e8.q = Image.createImage(var8.append(var5[22]).toString());
         fh.A = new g_(Image.createImage(hq.b() + var5[3]), 11, 11);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5, cs var6, boolean var7) {
      if (var7) {
         cs.I.b(2, var2 + 1, var3 + 1, 0, var1);
         cs.I.b(3, var2 + var4 - 5, var3 + 1, 0, var1);
         ib.b(var2 + 4, var3 + 1, var4 - 8, 2, 2716523, var1);
         var1.fillRect(var2 + 4, var3 + 18, var4 - 8, 2);
         ib.b(var2 + 4, var3 + 3, var4 - 8, 1, 2704964, var1);
         ib.b(var2 + 4, var3 + 4, var4 - 8, 1, 5014141, var1);
         ib.b(var2 + 4, var3 + 5, var4 - 8, 13, 6201499, var1);
      } else {
         cs.I.b(0, var2 + 1, var3 + 1, 0, var1);
         cs.I.b(1, var2 + var4 - 5, var3 + 1, 0, var1);
         ib.b(var2 + 4, var3 + 2, var4 - 9, 1, 11074288, var1);
         var1.fillRect(var2 + 4, var3 + 18, var4 - 9, 1);
         ib.b(var2 + 4, var3 + 3, var4 - 9, 1, 2704964, var1);
         ib.b(var2 + 4, var3 + 4, var4 - 9, 1, 5014141, var1);
         ib.b(var2 + 4, var3 + 5, var4 - 9, 13, 6201499, var1);
      }

      var1.setClip(var2 + 3, var3 + 1, var4 - 8, var5 - 2);
      var1.setColor(0);
      if (var6.q.equals("")) {
         k4.S.b(var1, var6.H, 5 + var6.u + var2, var3 + (var5 - ev.h) / 2, 0);
      } else {
         k4.U.b(var1, var6.q, 5 + var6.u + var2, var3 + (var5 - ev.h) / 2 + 1, 0);
      }

      if (var6.f && var6.w == 0 && (var6.y > 0 || var6.s / 5 % 2 == 0)) {
         var1.setColor(16777215);
         var1.fillRect(5 + var6.u + var2 + k4.U.b(var6.q.substring(0, var6.r)) - 1 + 1, var3 + (var5 - cs.k) / 2 + 2, 1, var5 - 5 * ev.a);
      }

      if (var7 && k4.j() - cs.C < 2) {
         int var9 = k4.S.b(cs.D[cs.B]);
         var1.setClip(0, 0, k4.o, k4.p);
         ib.b(var2 + var4 - var9 - 4, var3 + 4, var9 + 1, var5 - 6, 8969676, var1);
         ib.b(var2 + var4 - var9 - 4, var3 + 4, var9 + 1, 1, 5614233, var1);
         k4.S.b(var1, cs.D[cs.B], var2 + var4 - 3, var3 + 3, 1);
      }
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      b.b(0 + (var8 << 2), var2, var3, 0, var1);
      b.b(1 + (var8 << 2), var2 + var4 - 8, var3, 0, var1);
      b.b(2 + (var8 << 2), var2, var3 + var5 - 8, 0, var1);
      b.b(3 + (var8 << 2), var2 + var4 - 8, var3 + var5 - 8, 0, var1);
      ib.b(var2 + 8, var3, var4 - 16, 8, var6, var1);
      var1.fillRect(var2 + 8, var3 + var5 - 8, var4 - 16, 7);
      var1.fillRect(var2, var3 + 8, var4, var5 - 16);
      ib.b(var2 + 8, var3, var4 - 16, 1, var7, var1);
      var1.fillRect(var2 + 8, var3 + var5 - 1, var4 - 16, 1);
      var1.fillRect(var2, var3 + 8, 1, var5 - 16);
      var1.fillRect(var2 + var4 - 1, var3 + 8, 1, var5 - 16);
   }

   public final void b(
      Graphics var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int[] var13,
      int[] var14,
      String var15
   ) {
      k4.d(var1);
      this.b(var1, var2, var3, var5, var4, ib.e[0], ib.e[1], 0);

      for(int var17 = var7; var17 < var6; ++var17) {
         var13[var17]++;
         if (var13[var17] > 20) {
            var13[var17] = 0;
         }

         int var18 = var14[var17];
         if (ib.b().r[var17] > 5) {
            var18 = 0;
         }

         int var16 = var17 - var7;
         b.b(var18 + 4, var2 + 3 + var16 * var8, var3 + 3, 0, var1);
         ib.b(var2 + 11 + var16 * var8, var3 + 3, var9 - 16, var10 - 2, ib.e[2 + var18 / 2], var1);
         var1.fillRect(var2 + 3 + var16 * var8, var3 + 11, var9 - 1, var10);
         ib.b(var2 + 11 + var16 * var8, var3 + 3, var9 - 16, 1, ib.e[3 + var18 / 2], var1);
         var1.fillRect(var2 + 3 + var16 * var8, var3 + 11, 1, var10 + 1);
         var1.fillRect(var2 + 2 + var9 + var16 * var8, var3 + 11, 1, var10 + 1);
      }

      int var21 = var11;
      if (var11 >= var12) {
         var21 = var12 + var7;
      }

      for(int var22 = var21 - 1; var22 >= var6; --var22) {
         var13[var22]++;
         if (var13[var22] > 20) {
            var13[var22] = 0;
         }

         var11 = var14[var22];
         if (var13[var22] > 5) {
            var11 = 0;
         }

         int var20 = var22 - var7;
         if (var22 == var6) {
            b.b(var11 + 4, var2 + 3 + var20 * var8, var3 + 3, 0, var1);
         }

         b.b(var11 + 5, var2 + 3 + var9 - 8 + var20 * var8, var3 + 3, 0, var1);
         ib.b(var2 + 11 + var20 * var8, var3 + 3, var9 - 16, 8, ib.e[2 + var11 / 2], var1);
         var1.fillRect(var2 + 3 + var20 * var8, var3 + 11, var9 - 1, 15);
         ib.b(var2 + 11 + var20 * var8, var3 + 3, var9 - 16, 1, ib.e[3 + var11 / 2], var1);
         var1.fillRect(var2 + 3 + var20 * var8, var3 + 11, 1, 20);
         var1.fillRect(var2 + 2 + var9 + var20 * var8, var3 + 11, 1, 15);
      }

      this.b(var1, var2 + 3, var3 + var10, var5 - 6, var4 - var10 - 3, ib.e[2], ib.e[3], 1);
      ib.b(var2 + 4 + (var6 - var7) * var8, var3 + var10 / 2, var9 - 2, var10, ib.e[2], var1);
      k4.S.b(var1, var15, var2 + 3 + var9 / 2 + (var6 - var7) * var8, var3 + var10 / 2 - ev.j / 2, 2);
   }

   public final void b(Graphics var1, ag var2, ag var3, ag var4) {
      if (var2 != null && var2.b != null) {
         k4.T.b(var1, var2.b, k4.as[0].b + 2, k4.as[0].c + k4.ab / 2 - ev.i / 2, 0);
      }

      if (var3 != null && var3.b != null) {
         k4.T.b(var1, var3.b, k4.as[1].b + e8.w / 2, k4.as[1].c + k4.ab / 2 - ev.i / 2, 2);
      }

      if (var4 != null && var4.b != null) {
         k4.T.b(var1, var4.b, k4.as[2].b + e8.w - 2, k4.as[2].c + k4.ab / 2 - ev.i / 2, 1);
      }
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      this.b(var1, var2, var3, var4, var5, 0);
   }

   public final void c() {
      if (c == null) {
         try {
            g = new Image[14];
            h = new g_[2];

            for(int var1 = 0; var1 < 14; ++var1) {
               Image[] var10000 = g;
               StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
               String[] var5 = a;
               var10000[var1] = Image.createImage(var10002.append(var5[8]).append(var1).append(var5[16]).toString());
            }

            int var7 = g[12].getWidth();
            int var2 = g[12].getHeight();
            Image var3;
            Graphics var4;
            (var4 = (var3 = Image.createImage(var7 << 1, var2 << 1)).getGraphics()).setColor(-523560);
            var4.fillRect(0, 0, var7 << 1, var2 << 1);
            var4.drawImage(g[12], 0, 0, 0);
            var4.drawRegion(g[12], 0, 0, var7, var2, 2, var7, 0, 0);
            var4.drawRegion(g[12], 0, 0, var7, var2, 1, 0, var2, 0);
            var4.drawRegion(g[12], 0, 0, var7, var2, 3, var7, var2, 0);
            var3 = b2.b(var3, -65315);
            g[12] = var3;
            g_[] var10 = h;
            StringBuffer var10004 = new StringBuffer(String.valueOf(hq.b()));
            String[] var9 = a;
            var10[0] = new g_(Image.createImage(var10004.append(var9[31]).toString()), 8, 9);
            h[1] = new g_(Image.createImage(hq.b() + var9[28]), 8, 9);
            c = Image.createImage(hq.b() + var9[35]);
            d = Image.createImage(hq.b() + var9[24]);
            e = Image.createImage(hq.b() + var9[21]);
            return;
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }
   }

   public final void b(Graphics var1, b3 var2) {
      if (var2.c == -1) {
         var1.drawImage(g[12], var2.d - 27, var2.e - 36, 0);
      } else {
         var1.drawImage(d, var2.d - 27, var2.e - 36, 0);
         a(var1, var2);
      }
   }

   public final void c(Graphics var1, b3 var2) {
      if (var2.c == -1) {
         var1.drawImage(g[12], var2.d - 27, var2.e - 36, 0);
      } else {
         var1.drawImage(c, var2.d - 27, var2.e - 36, 0);
         a(var1, var2);
      }
   }

   private static void a(Graphics var0, b3 var1) {
      int var2 = 0;

      while(var2 < 2) {
         int var3;
         if ((var3 = n[var1.i[var1.k]][var2++]) == 0 || var3 == 4) {
            var3 += var1.j;
         }

         if (var1.j == 0 && var1.i[var1.k] == 11 && var3 == 0) {
            var3 = 11;
         }

         byte var4 = n[var1.i[var1.k]][var2++];
         byte var5 = n[var1.i[var1.k]][var2++];
         var0.drawImage(g[var3], var1.d - 27 + var4, var1.e - 36 + var5, 3);
      }

      h[var1.l].b(var1.i[var1.k], var1.d - 27 + 5, var1.e - 36 + 7, 0, 3, var0);
   }

   public final void d(Graphics var1, b3 var2) {
      if (var2.c == -1) {
         var1.drawImage(g[12], var2.d - 27, var2.e - 36, 0);
      } else {
         var1.drawImage(c, var2.d - 27, var2.e - 36, 0);
         int var3 = 0;

         while(var3 < n[var2.i[var2.k]].length) {
            int var4;
            if ((var4 = n[var2.i[var2.k]][var3++]) == 0 || var4 == 4) {
               var4 += var2.j;
            }

            if (var2.j == 0 && var2.i[var2.k] == 11 && var4 == 0) {
               var4 = 11;
            }

            byte var5 = n[var2.i[var2.k]][var3++];
            byte var6 = n[var2.i[var2.k]][var3++];
            var1.drawImage(g[var4], var2.d - 27 + var5, var2.e - 36 + var6, 3);
            if (var6 < 30) {
               var1.drawRegion(g[var4], 0, 0, g[var4].getWidth(), g[var4].getHeight(), 1, var2.d + 27 - var5, var2.e + 36 - var6, 3);
            }
         }

         h[var2.l].b(var2.i[var2.k], var2.d - 27 + 5, var2.e - 36 + 7, 0, 3, var1);
         h[var2.l].b(var2.i[var2.k], var2.d + 27 - 5, var2.e + 36 - 7, 3, 3, var1);
      }
   }

   public final void b(Graphics var1, b3 var2, boolean var3) {
      if (var2.c == -1) {
         var1.drawImage(g[12], var2.d - 13, var2.e - 16, 0);
      } else {
         var1.drawImage(e, var2.d - 13, var2.e - 16, 0);
         h[var2.l].b(var2.i[var2.k], var2.d - 13 + 6, var2.e - 16 + 7, 0, 3, var1);
         if (var3) {
            var1.drawImage(g[var2.j + 4], var2.d - 13 + 6 + 7, var2.e - 16 + 7, 3);
         } else {
            var1.drawImage(g[var2.j + 4], var2.d - 13 + 6, var2.e - 16 + 17, 3);
         }

         var1.drawImage(g[var2.j], var2.d - 13 + 17, var2.e - 16 + 17, 3);
      }
   }

   public final void b() {
      ev.b = 5;
   }

   public final void b(Graphics var1) {
      byte var2 = 0;
      if (k4.u == fi.z || k4.u == fc.z) {
         var2 = 14;
      }

      if (e8.u > 0 && k4.y == null) {
         var1.drawImage(e8.q, k4.o - 8 * ev.a - 2, var2 + 2, 17);
         k4.T.b(var1, "" + e8.u, k4.o - 16 * ev.a - 4, 1 + 6 * ev.a - ev.i / 2 + var2, 1);
      }

      if (e8.r != null && k4.m()) {
         var1.drawImage(e8.r, 25, 25, 3);
         if (GameMidlet.f == 9) {
            var1.drawImage(e8.s, 75, 25, 3);
         }
      }
   }

   public final void d() {
      e8.x = k4.p / 12;
      if ((e8.v = k4.p / 18) < 18) {
         e8.v = 18;
      }

      if (e8.v > 45) {
         e8.v = 45;
      }

      if (k4.M) {
         e8.v = 35;
      }

      ev.d = 0;
      int var1 = k4.ab = e8.v;
      if (e8.x < 20 || k4.b == null || !k4.M) {
         e8.x = 20;
      }

      if (e8.x > 50) {
         e8.x = 50;
      }

      e8.w = k4.o / 4;
      k4.as[0] = new cn(2, k4.p - var1, 2);
      k4.as[1] = new cn(k4.q - e8.w / 2, k4.p - var1, 2);
      k4.as[2] = new cn(k4.o - e8.w - 2, k4.p - var1, 2);
      k4.at = new cn(k4.o - 2, 1, 1);
   }

   public final int e() {
      for(int var1 = 0; var1 < 3; ++var1) {
         if (k4.d(k4.as[var1].b, k4.as[var1].c, e8.w, k4.ab)) {
            return var1;
         }
      }

      return -1;
   }

   public final void b(fi var1) {
      var1.R = 176;
      if (var1.N) {
         var1.S = 170;
      } else {
         var1.S = 130;
      }

      if (var1.R > k4.o) {
         var1.R = k4.o;
         var1.S = 100;
      }

      var1.ae = (var1.S - 20) / 3;
      var1.af = 10;
      var1.P = k4.q - var1.R / 2;
      var1.Q = k4.r - var1.S / 2 + 5;
      int var2 = var1.Q + 15 + 4;
      var1.A.c = var2;
      var1.A.b = var1.B.b = var1.C.b = var1.D.b = var1.W;
      var1.A.d = var1.B.d = var1.C.d = var1.D.d = var1.V;
      var2 += var1.A.e + 15;
      var1.B.c = var2;
      var2 += var1.A.e + 15;
      var1.C.c = var2;
      var1.U = var2 - 10;
      var2 += var1.A.e + 15;
      var1.D.c = var2;
      var1.T = var1.B.b - 40;
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      this.b(var1, var2, var3, var4, var5, ib.e[var6], ib.e[var6 + 1], 0);
      this.b(var1, var2 + 3, var3 + 3, var4 - 6, var5 - 6, ib.e[2], ib.e[3], 1);
   }

   public final void b(Graphics var1, int var2, int var3, int var4, boolean var5) {
      byte var6 = 0;
      if (var4 == 2) {
         var6 = 1;
      }

      i.b(var6, var2, var3 + ev.j / 2, 0, var1);
      if (var5) {
         i.b(2, var2, var3 + ev.j / 2, 0, var1);
      }

      k4.S.b(var1, hq.bC, var2 + 15, var3 + i.c / 2, 0);
   }

   public final void b(Graphics var1, int var2, int var3, int var4) {
      var1.setColor(15530985);
      var1.fillRect(0, var2, var3, var4);
   }

   public final void c(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      ib.c.b(var5, var2 - o / 5, var3 - 3, 0, 3, var1);
      ib.c.b(var6, var2 + var4 + o / 5, var3 - 3, 3, 3, var1);
      if (++o >= 15) {
         o = 0;
      }
   }

   public final void b(Graphics var1, String var2, int var3, int var4, int var5) {
      k4.S.b(var1, var2, var3, var4, var5);
   }

   public final void c(Graphics var1, int var2, int var3, int var4, int var5) {
      var1.setColor(14279153);
      var1.fillRect(var2, var3, var4, var5);
   }

   public final void b(int var1) {
      if (var1 == 14 || var1 == 15 || var1 == 16) {
         if (ev.m) {
            cs.A = true;
         }

         fa.I = true;
         k4.b.sizeChanged(0, 0);
      }
   }

   public final void f() {
      int var1 = k4.p;
      cn[] var10000 = new cn[]{new cn(k4.q + 5, 5, 0), new cn(5, var1 / 2, 0), new cn(k4.q + 5, var1 - 50, 0), new cn(k4.o - 5, var1 / 2, 1)};
      var10000 = new cn[]{new cn(k4.q, 2, 3), new cn(10, var1 / 2, 20), new cn(k4.q - 10, var1 - 75 - e8.v, 3), new cn(k4.o - 60, var1 / 2, 3)};
      int var2 = k4.p - 24;
      var1 = var1 - 15 - k4.ab;
      if (k4.o < 200) {
         fw.ao = new cn[]{
            new cn(k4.q, ft.S / 2, 0), new cn(ft.R / 2, var2 / 2, 0), new cn(k4.q, var1 - ft.S + 20, 0), new cn(k4.o - ft.R / 2 - 3, var2 / 2, 0)
         };
         fw.ap = new cn[]{new cn(k4.q, ft.S, 0), new cn(ft.R + 3, var2 / 2, 0), new cn(k4.q, var1 - ft.S / 2 + 20, 0), new cn(k4.o - 3, var2 / 2, 0)};
         fw.an = new cn[]{
            new cn(k4.q, ft.S + ft.S / 2 + 2, 2),
            new cn(ft.R / 4 * 3 + ft.R / 2 + 5, var2 / 2, 0),
            new cn(k4.q, var1 - ft.S - ev.k - 5, 2),
            new cn(k4.o - ft.R - 5, var2 / 2 - 5, 1)
         };
      } else {
         fw.ao = new cn[]{new cn(k4.q, ft.S / 2, 0), new cn(ft.R / 2, var2 / 2, 0), new cn(k4.q, var1 - ft.S / 2, 0), new cn(k4.o - ft.R / 2, var2 / 2, 0)};
         fw.ap = new cn[]{
            new cn(k4.q, 0, 0), new cn(ft.R / 4 * 3, var2 / 2, 0), new cn(k4.q, var1 - ft.S / 2 + ft.S / 4, 0), new cn(k4.o - ft.R / 4, var2 / 2, 0)
         };
         fw.an = new cn[]{
            new cn(k4.q, ft.S + 2, 2),
            new cn(ft.R / 4 * 3 + ft.R / 2 + 5, var2 / 2 - 10, 0),
            new cn(k4.q, var1 - ft.S - ev.k - 1, 2),
            new cn(k4.o - ft.R - 5, var2 / 2 - 10, 1)
         };
      }
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String var9, int var10, int var11) {
      int var12 = var2 % var3 * var4;
      var3 = (var2 / var3 + 1) * var4;
      var4 = var12 + var4 / 2;
      var1.setClip(var4 - var5 / 2, var3, var5, var6);
      var12 = (var6 - (ev.b << 1)) / 4;
      this.b(var1, var4 - var5 / 2, var3, var5, var6, 0);
      var3 += ev.b + 8;
      if (var7 == 1) {
         ((b5)f8.k.elementAt(var2)).b(var1, var4, var3 + var12 / 2);
      } else {
         f8.g[var2].b(var1, 7, var4, var3 + var12 / 2, 3);
      }

      k4.T.b(var1, String.valueOf(var8), var4, var3 + var12 / 2 + var12 - 2, 2);
      k4.S.b(var1, var9, var4, var3 + var12 / 2 + (var12 << 1), 2);
      var2 = var3 + var12 / 2 + var12 + ev.j / 2;
      j.b(var10 / 3, var4 - 17, var2 + 1, 2, 3, var1);
      j.b(var11 / 3, var4 - 17 + 35, var2, 0, 3, var1);
   }

   public final void b(Graphics var1, int var2, int var3, int var4, boolean var5, int var6, int[] var7) {
      k4.V.b(var1, hq.aY + var6, k4.q, k4.r + var2 * var4 / 2 - 20, 2);
      var1.translate(k4.q - (var2 * var3 + 10) / 2 + 4, k4.r - var2 * var4 / 2 + 4);
      var1.setClip(0, 3, var2 * var3 + 2, var2 * var4 - 32);
      var1.translate(1, -g5.r);
      if (!var5) {
         k4.aa.c(var1, var6 % var3 * var2, var6 / var3 * var2, var2, var2);
      }

      if ((var5 = (var4 = g5.r / var2 * var3) + var2 * 7 / var2 * var3 + var3) > var7.length) {
         var5 = var7.length;
      }

      while(var4 < var5) {
         fh.A.b(var7[var4], var4 % var3 * var2 + var2 / 2, var4 / var3 * var2 + var2 / 2, 0, 3, var1);
         ++var4;
      }
   }

   public final void c(Graphics var1) {
      for(int var2 = 0; var2 < k4.o / 50 + 1; ++var2) {
         for(int var3 = 0; var3 < k4.s / 71 + 1; ++var3) {
            var1.drawImage(f, var2 * 50, var3 * 71, 0);
         }
      }
   }

   public final void b(Graphics var1, int var2, int var3) {
      var1.drawImage(fy.B, var2, var3, 3);
   }

   public final void b(Graphics var1, String var2, String var3, String var4) {
      var1.setClip(0, 0, k4.o, k4.p);
      k4.aa.c(var1);
      k4.Z.b(var1, var2, k4.q, 2, 2);
      var1.setColor(6192786);
      var1.fillRect(0, 25, k4.o, e8.n);
      k4.U.b(var1, var3, 10, 28, 0);
      k4.U.b(var1, var4, k4.o - 10, 28, 1);
   }

   public final void c(int var1) {
      try {
         if (var1 == 0) {
            StringBuffer var5 = new StringBuffer(String.valueOf(hq.b()));
            String[] var4 = a;
            fr.D = new g_(Image.createImage(var5.append(var4[20]).toString()), 60, 46);
         } else if (var1 == 1) {
            StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
            String[] var2 = a;
            fr.D = new g_(Image.createImage(var10002.append(var2[26]).toString()), 60, 46);
         } else {
            fr.D = new g_(Image.createImage(hq.b() + a[6]), 60, 46);
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public final void g() {
      try {
         ib.e = new int[]{21080, 12313816, 8703190, 2713971, 5107863, 4559225};
         StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
         String[] var2 = a;
         b = new g_(Image.createImage(var10002.append(var2[4]).toString()), 8, 8);
         f = Image.createImage(hq.b() + var2[34]);
         k = new Image[8];

         for(int var1 = 0; var1 < 8; ++var1) {
            Image[] var10000 = k;
            var10002 = new StringBuffer(String.valueOf(hq.b()));
            var2 = a;
            var10000[var1] = Image.createImage(var10002.append(var2[32]).append(var1).append(var2[1]).toString());
         }

         m = new g_(Image.createImage(hq.b() + a[14]), 10, 10);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public final void h() {
      ib.e = new int[]{6201499, 2378578, 8705740, 2716523, 16701696, 7042560};
      bp.c(hq.aw);
      b = g_.b(a[37], 8, 8);
      bp.b();
      f = null;
      m = null;
      fp.z = null;
      fv.ai = null;
      fw.ai = null;
      fy.z = null;
      ft.z = null;
      h3.f = null;
   }

   public final void i() {
      try {
         StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
         String[] var2 = a;
         l = new g_(Image.createImage(var10002.append(var2[29]).toString()), 45, 44);
         new g_(Image.createImage(hq.b() + var2[12]), 11, 4);
         fr.P = Image.createImage(hq.b() + var2[19]);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public final void j() {
      fh.z = null;
      fr.z = null;
      ft.z = null;
      fu.ai = null;
      fx.ai = null;
   }

   public final void d(Graphics var1, int var2, int var3, int var4, int var5) {
      var1.setColor(12442838);
      byte var6 = 0;
      byte var7 = 30;
      if (var2 > 0) {
         var7 = 50;
         var6 = 40;
      }

      var1.fillRect(4, ib.t + 20 + ev.h / 2 + var6 - var7 / 2, ib.b().g - 8, var7);
      k4.S.b(var1, var3 == 1 ? hq.dI[0] : hq.dI[1], ib.b().g / 2, ib.t + 20, 2);
      ib.b.b(0, ib.b().g / 2 - 35 - var4 / 2, ib.t + 20 + ev.h / 2 + var6, 4, 3, var1);
      ib.b.b(0, ib.b().g / 2 + 35 + var5 / 2, ib.t + 20 + ev.h / 2 + var6, 7, 3, var1);
      GameMidlet.k.b(var1, ib.b().g / 2 + 1, ib.t + 87, false);
      k4.S.b(var1, hq.aB + GameMidlet.k.g, ib.b().g / 2, ib.t + 100, 2);
      k4.S.b(var1, hq.ap + GameMidlet.k.C, ib.b().g / 2, ib.t + 115, 2);
   }

   public final void k() {
      if (k4.i) {
         if (k4.e(ib.b().h + ib.b().g / 2 - 20, ib.b().i + ib.t + ev.h / 2, 40, 40)) {
            fl.g().c(0);
            k4.i = false;
         } else if (k4.e(ib.b().h + ib.b().g / 2 - 20, ib.b().i + ib.t + 95 - GameMidlet.k.e / 2 - 20, 40, 45)) {
            fl.g().c(1);
            k4.i = false;
         } else if (k4.e(ib.b().h + ib.b().g / 2 - 20 - 40, ib.b().i + ib.t + ev.h / 2 + 50 * fl.g().B, 40, 40)) {
            fl.g().d(-1);
            fl.g().D = 6;
            k4.i = false;
         } else if (k4.e(ib.b().h + ib.b().g / 2 - 20 + 40, ib.b().i + ib.t + ev.h / 2 + 50 * fl.g().B, 40, 40)) {
            fl.g().d(1);
            fl.g().E = 6;
            k4.i = false;
         }
      }

      if (k4.d(2)) {
         fl.g().c(fl.g().B - 1);
      } else if (k4.d(4)) {
         fl.g().d(-1);
         fl.g().D = 6;
      } else if (k4.d(6)) {
         fl.g().d(1);
         fl.g().E = 6;
      } else {
         if (k4.d(8)) {
            fl.g().c(fl.g().B + 1);
         }
      }
   }

   public final void c(Graphics var1, ag var2, ag var3, ag var4) {
      int var5 = k4.s - k4.ab / 2 - ev.i / 2;
      if (var2 != null && var2.b != "") {
         k4.T.b(var1, var2.b, 4, var5, 0);
      }

      if (var3 != null && var3.b != "") {
         k4.T.b(var1, var3.b, k4.q, var5, 2);
      }

      if (var4 != null && var4.b != "") {
         k4.T.b(var1, var4.b, k4.o - 4, var5, 1);
      }
   }

   public final void e(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = k[0].getWidth();
      int var7 = k[0].getHeight();
      var1.drawImage(k[0], var2, var3, 0);

      for(int var8 = 1; var8 < var4 / var6 - 1; ++var8) {
         var1.drawImage(k[1], var2 + var6 * var8, var3, 0);
      }

      var1.drawImage(k[1], var2 + var4 - (var6 << 1), var3, 0);
      var1.drawImage(k[2], var2 + var4 - var6, var3, 0);
      if (var5 / var7 > 2) {
         for(int var9 = 1; var9 < var5 / var7; ++var9) {
            var1.drawImage(k[3], var2, var3 + var7 * var9, 0);
            var1.drawImage(k[4], var2 + var4 - var6, var3 + var7 * var9, 0);
         }

         var1.drawImage(k[3], var2, var3 + var5 - (var7 << 1), 0);
         var1.drawImage(k[4], var2 + var4 - var6, var3 + var5 - (var7 << 1), 0);
      }

      if (var5 > (var7 << 1) - 20 && var5 <= var7 * 3) {
         var1.drawImage(k[3], var2, var3 + var5 / 2 - var7 / 2, 0);
         var1.drawImage(k[4], var2 + var4 - var6, var3 + var5 / 2 - var7 / 2, 0);
      }

      var1.drawImage(k[5], var2, var3 + var5 - var7, 0);

      for(int var10 = 1; var10 < var4 / var6 - 1; ++var10) {
         var1.drawImage(k[6], var2 + var6 * var10, var3 + var5 - var7, 0);
      }

      var1.drawImage(k[6], var2 + var4 - (var6 << 1), var3 + var5 - var7, 0);
      var1.drawImage(k[7], var2 + var4 - var6, var3 + var5 - var7, 0);
      var1.setColor(u);
      var1.fillRect(var2 + 10, var3 + 10, var4 - 20, var5 - 20);
   }

   public final void c(Graphics var1, int var2, int var3, int var4) {
      if (ev.a == 1) {
         var1.setColor(t);
         var1.fillRect(0, var2 + 1, var3, var4 - var2 + 1);
      } else {
         var1.setColor(t);
         var1.fillRect(0, var2 + 1, var3, var4 - var2 + 2);
      }
   }

   public final void d(Graphics var1, int var2, int var3, int var4) {
      var1.setColor(s);
      var1.fillRect(2, var2, var3, var4);
   }

   public final void d(Graphics var1) {
      var1.setColor(t);
      var1.fillRect(0, k4.s - k4.ab + 1, k4.o, k4.ab);
      var1.setColor(v);
      var1.fillRect(0, k4.s - k4.ab, k4.o, 1);
   }

   public final void b(ag var1, ag var2, ag var3) {
      if (k4.i) {
         switch(c(var1, var2, var3)) {
            case 1:
               this.p = 1;
               k4.i = false;
               break;
            case 2:
               this.q = 1;
               k4.i = false;
               break;
            case 3:
               this.r = 1;
               k4.i = false;
         }
      }

      if (k4.g) {
         switch(c(var1, var2, var3)) {
            case 1:
               this.q = this.r = 0;
               break;
            case 2:
               this.p = this.r = 0;
               break;
            case 3:
               this.q = this.p = 0;
               break;
            default:
               this.q = this.p = this.r = 0;
         }
      }

      if (k4.h) {
         switch(c(var1, var2, var3)) {
            case 1:
               if (this.p == 1) {
                  var1.a();
                  k4.h = false;
                  this.p = 0;
                  return;
               }
               break;
            case 2:
               if (this.q == 1) {
                  this.q = 0;
                  var2.a();
                  k4.h = false;
                  return;
               }
               break;
            case 3:
               if (this.r == 1) {
                  this.r = 0;
                  var3.a();
                  k4.h = false;
               }
         }
      }
   }

   private static int c(ag var0, ag var1, ag var2) {
      if (var0 != null && !var0.b.equals("") && k4.d(0, k4.s - k4.ab, 95, k4.ab)) {
         return 1;
      } else if (var1 != null && !var1.b.equals("") && k4.d(k4.o / 2 - 43 - 8, k4.s - k4.ab, 95, k4.ab)) {
         return 2;
      } else {
         return var2 != null && !var2.b.equals("") && k4.d(k4.o - 87 - 8, k4.s - k4.ab, 95, k4.ab) ? 3 : 0;
      }
   }

   public final void b(Graphics var1, Vector var2, int var3, int var4) {
      k4.d(var1);
      var1.translate(0, k4.B.m);
      var1.translate(0, -g5.r);
      int var5 = (var3 - ev.i) / 2;
      int var6;
      if ((var6 = g5.r / var3 - 2) < 0) {
         var6 = 0;
      }

      int var7;
      if ((var7 = var6 + (k4.p - 40) / var3 + 3) > var2.size()) {
         var7 = var2.size();
      }

      for(int var8 = 4 + var6 * var3; var6 < var7; ++var6) {
         b8 var9 = (b8)var2.elementAt(var6);
         if (var6 == var4 && var9.b != -1) {
            k4.aa.d(var1, var8, k4.o - 4, var3);
         }

         if (var9.b == -1) {
            k4.T.b(var1, hq.dM[var9.d], 15, var8 + 8 + (k4.ah == 0 ? -4 : 0), 0);
            k4.aa.c(var1, var8 + 25, k4.o, var8 + 25);
         } else {
            l.b(0, 22, var8 + var3 / 2 + 1, 0, 3, var1);
            k4.U.b(var1, hq.W + var9.b, 50, var8 + var5, 0);
            if (var9.c >= 0 && var9.c <= 2) {
               fh.A.b(var9.c, k4.o - 20, var8 + var3 / 2, 0, 3, var1);
            }
         }

         var8 += var3;
      }
   }

   public final void f(Graphics var1, int var2, int var3, int var4, int var5) {
      m.b(0, var2, var3, 0, var1);
      m.b(1, var2 + var4 - 10, var3, 0, var1);
      m.b(2, var2, var3 + var5 - 10, 0, var1);
      m.b(3, var2 + var4 - 10, var3 + var5 - 10, 0, var1);
      var1.setColor(29555);
      var1.fillRect(var2 + 10, var3 + 1, var4 - 20, var5 - 2);
      var1.fillRect(var2 + 1, var3 + 10, 9, var5 - 20);
      var1.fillRect(var2 + var4 - 10, var3 + 10, 9, var5 - 20);
      var1.setColor(16777215);
      var1.fillRect(var2 + 10, var3, var4 - 20, 1);
      var1.fillRect(var2 + 10, var3 + var5 - 1, var4 - 20, 1);
      var1.fillRect(var2, var3 + 10, 1, var5 - 20);
      var1.fillRect(var2 + var4 - 1, var3 + 10, 1, var5 - 20);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '<');
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
               var10005 = 45;
               break;
            case 1:
               var10005 = 109;
               break;
            case 2:
               var10005 = 36;
               break;
            case 3:
               var10005 = 75;
               break;
            case 4:
               var10005 = 74;
               break;
            case 5:
               var10005 = 89;
               break;
            default:
               var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
