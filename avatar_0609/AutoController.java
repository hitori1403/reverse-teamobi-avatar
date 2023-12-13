import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// e9.java
public final class AutoController extends e8 implements c4 {
   public static AutoController z;
   public static byte A;
   public static byte B;
   public static Image C;
   private ag D;
   public ag E;
   public ag F;
   private ag G;
   private ag H;
   public static byte I;
   public static i3 J;
   public static byte K;
   public static String L;
   public static Image M;
   public static Vector N;
   public static int O;
   public static Vector P;
   public static Vector Q;
   public static Vector R;
   public static Vector S;
   public static boolean T;
   public static boolean U;
   public static boolean V;
   public static boolean W;
   public static int X;
   static byte[] Y;
   private byte Z = 0;
   private byte aa = -1;
   public static boolean ab;
   private Vector ac = new Vector();
   private int ad;
   private int ae = 60;
   public boolean af = true;
   public static byte ag;
   public static byte ah;
   public static short[] ai;
   public static i3 aj;
   public static int ak;
   public static int al;
   public static int am;
   public static int an;
   static boolean ao;
   static long ap;
   static Vector aq;
   private static final String[] bb;
   // [dmw, time, onWeddingStart 2222222222222222222: , Khác,   , Tặng, Có lỗi xảy ra!, Đã có NPC này trong danh sách., Tự động cứu nữ hoàng, : , platform, Chuyển khu, 100, providerAndClientType, http://upxu.net, : , memory, Nón,      , )., ae.e(int, int) , .., Trang sức, updateWedding1111111111111: ,    , Đăng xuất, Quần, Menu, Đá, /citiMap, Thêm NPC , Danh sách NPC, Chuyển map, Nâng cao,  (, null,  tặng quà, Bỏ ra, Chuyển tài khoản, doJoinShop: , userName, microedition.platform, AAUftlKgzJ6]:pLiK, Xoá hết danh sách, microedition.platform, _getFishing, Tặng, typeJoin: , ptw, Áo, Cầm tay, ) , Auto anh - việt: , tho.kim.hoan, getFishing, ct]

   static {
      String[] var5 = new String[56];
      int var3 = 0;
      String var2 = "\u0003\u0011J\u0004\u0013\u0015P!$\b\u0012j!\u001a\u00013\t\u001bn0\u001f\u0017.GN\u000fvLWhUN\u000fvLWhUN\u000fvLW`G\u0004,\u0014Ü'\u0002G\\\u00043ịS#\u000e$\u008f\u001d(ẩ\fz\u001fởDd\f\u0004{\u001eŷ\u009f\u001d'\u008dE\u00147?\u001d*\u009e\u001cz\u0013\u000eR*\u0019E>\u0006\u0012Ud\r\u00849\u000fR\u00143ẍ\u001dŕầ\u000b=G\u001fỔ1^\u000bẵG\u0014R¤\u0010\u0002\u0002]\\\b\u0017\u0010\\0\u0018\n(\n\n$\u0014H=ẽ\u000bz\f\u0014H\u0003VL\r\u0015\u0017\u000eR2\u0017\u0001?\u0015=S =\t3\u0002\u0012I\u0010\u0007\u0015?\u000f\u000f\bI4DJu\u0012\fE1P\u000b?\u0013\u0002]\\\u0006\n\u0019P+\f\u001c\u0003)\u008fS\u0005G\\\u001dd^\u0002NR\u000f\u0006\u0019\u0013!V\f4\u0013P\u001d-\u0010\u0011sG\u0002IR\t3\u000e\\*\u0019E)Ẏ\u001f\u001c\u0012\fY%\n\u0000\r\u0002\u0018Y-\u0010\u0002kVM\fuOTkVM\fuO_z\u0003G\\\u001d\tŷſS#^\u001d/Ể\b\u00046\tẚ*\u0004*\u0019S1\u0002ŷ\u009d\bH\u001fT0\u0017(;\u0017\t3\u0014×)^+\n$\\\r#\u001dS,^\u0016»\u0004\u0014\u001d\n.&\n$\u0014H=ẽ\u000bz\n\u001dM\b)\u009eS#^\u0006;\b\u0002GT\u0004\t\tQ(\tG\bẊ*\u0019E+\u0012\u009c\u0005%ẳ\u001d6\u001f\u0010$\u0014H=ẽ\u000bz\u0013\u009cTd\u0015\r5Ễ\u0012\f\u0003\u0013w+\u0017\u000b\t\u000f\u0013M~^\b\u0012\u000fX60\u00047\u0002\u0015\n\u0015^6\u0011\u0000>\u000e\bT+\u0010K*\u000b\u001dI\"\u0011\u00177\u0011&=h\"\n\t\u0011\u0000\u0006wr#_*+\u0015v\u0011?\u0013Üd\u0016Ớ.G\u0018\\*\u0016E)\u0086\u001fU\u0015\n\u0015^6\u0011\u0000>\u000e\bT+\u0010K*\u000b\u001dI\"\u0011\u00177\u000b8\u001bX08\f)\u000f\u0015S#\u00043ịS#\n\u0013\u0005M!4\n3\tF\u001d\u0003\u0017\bJ\u0002¦\u0013\u0007$ớPd\n\u0004#\u0002N\\\u0011&\tI+^\u00044\u000f\\\u0010d\b\fẝ\u0013F\u001d\f\u0013\u0014Rj\u0015\f7I\u0014R%\u0010";
      int var4 = "\u0003\u0011J\u0004\u0013\u0015P!$\b\u0012j!\u001a\u00013\t\u001bn0\u001f\u0017.GN\u000fvLWhUN\u000fvLWhUN\u000fvLW`G\u0004,\u0014Ü'\u0002G\\\u00043ịS#\u000e$\u008f\u001d(ẩ\fz\u001fởDd\f\u0004{\u001eŷ\u009f\u001d'\u008dE\u00147?\u001d*\u009e\u001cz\u0013\u000eR*\u0019E>\u0006\u0012Ud\r\u00849\u000fR\u00143ẍ\u001dŕầ\u000b=G\u001fỔ1^\u000bẵG\u0014R¤\u0010\u0002\u0002]\\\b\u0017\u0010\\0\u0018\n(\n\n$\u0014H=ẽ\u000bz\f\u0014H\u0003VL\r\u0015\u0017\u000eR2\u0017\u0001?\u0015=S =\t3\u0002\u0012I\u0010\u0007\u0015?\u000f\u000f\bI4DJu\u0012\fE1P\u000b?\u0013\u0002]\\\u0006\n\u0019P+\f\u001c\u0003)\u008fS\u0005G\\\u001dd^\u0002NR\u000f\u0006\u0019\u0013!V\f4\u0013P\u001d-\u0010\u0011sG\u0002IR\t3\u000e\\*\u0019E)Ẏ\u001f\u001c\u0012\fY%\n\u0000\r\u0002\u0018Y-\u0010\u0002kVM\fuOTkVM\fuO_z\u0003G\\\u001d\tŷſS#^\u001d/Ể\b\u00046\tẚ*\u0004*\u0019S1\u0002ŷ\u009d\bH\u001fT0\u0017(;\u0017\t3\u0014×)^+\n$\\\r#\u001dS,^\u0016»\u0004\u0014\u001d\n.&\n$\u0014H=ẽ\u000bz\n\u001dM\b)\u009eS#^\u0006;\b\u0002GT\u0004\t\tQ(\tG\bẊ*\u0019E+\u0012\u009c\u0005%ẳ\u001d6\u001f\u0010$\u0014H=ẽ\u000bz\u0013\u009cTd\u0015\r5Ễ\u0012\f\u0003\u0013w+\u0017\u000b\t\u000f\u0013M~^\b\u0012\u000fX60\u00047\u0002\u0015\n\u0015^6\u0011\u0000>\u000e\bT+\u0010K*\u000b\u001dI\"\u0011\u00177\u0011&=h\"\n\t\u0011\u0000\u0006wr#_*+\u0015v\u0011?\u0013Üd\u0016Ớ.G\u0018\\*\u0016E)\u0086\u001fU\u0015\n\u0015^6\u0011\u0000>\u000e\bT+\u0010K*\u000b\u001dI\"\u0011\u00177\u000b8\u001bX08\f)\u000f\u0015S#\u00043ịS#\n\u0013\u0005M!4\n3\tF\u001d\u0003\u0017\bJ\u0002¦\u0013\u0007$ớPd\n\u0004#\u0002N\\\u0011&\tI+^\u00044\u000f\\\u0010d\b\fẝ\u0013F\u001d\f\u0013\u0014Rj\u0015\f7I\u0014R%\u0010"
         .length();
      char var1 = 3;
      int var9 = -1;

      label36:
      while(true) {
         String var10000 = var2.substring(++var9, var9 + var1);
         byte var10001 = -1;

         while(true) {
            String var15 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var15;
                  if ((var9 += var1) >= var4) {
                     bb = var5;
                     I = -1;
                     K = -1;
                     N = new Vector();
                     O = -1;
                     T = false;
                     U = false;
                     V = false;
                     W = false;
                     X = -1;
                     Y = new byte[]{10, 4, 3, 5};
                     ab = false;
                     ak = -1;
                     an = -1;
                     aq = new Vector();
                     new b2();
                     String var6;
                     if ((var6 = b2.c(kq.n[1])) != null) {
                        String[] var10 = kq.b(var6, kq.l[0]);

                        for(int var7 = 0; var7 < var10.length; ++var7) {
                           aq.addElement(var10[var7]);
                        }
                     }

                     return;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var15;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label36;
                  }

                  var2 = "\u0000\u0019I\u0002\u0017\u00162\u000e\u0012Z\u0002\u0004\b";
                  var4 = "\u0000\u0019I\u0002\u0017\u00162\u000e\u0012Z\u0002\u0004\b".length();
                  var1 = '\n';
                  var9 = -1;
            }

            var10000 = var2.substring(++var9, var9 + var1);
            var10001 = 0;
         }
      }
   }

   static void g() {
      String var0 = "";
      if (aq.size() > 0) {
         for(int var1 = 0; var1 < aq.size(); ++var1) {
            var0 = var0 + (String)aq.elementAt(var1);
            if (var1 < aq.size() - 1) {
               var0 = var0 + kq.l[0];
            }
         }
      }

      new b2();
      b2.b(kq.n[1], var0);
   }

   public final void d() {
      this.a();
      super.d();
   }

   public static AutoController h() {
      if (z == null) {
         z = new AutoController();
      }

      return z;
   }

   public final void a() {
      this.D = new ag(hq.d, 0, this);
      super.e = this.D;
      this.F = e_.g().b(hq.bD, new go(this), 15);
      this.E = new ag(k4.M ? (k4.ah == 0 ? hq.P : hq.d) : "", 1, this);
      if (k4.ah > 0 && k4.H == null) {
         super.e = this.E;
      }

      this.G = new ag(hq.y, 2, this);
      this.H = new ag(hq.bL, 2);
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            this.o();
            return;
         case 1:
            if (!V) {
               e_.g().j();
               return;
            }
         default:
            return;
         case 2:
            this.j();
            return;
         case 3:
            A();
            return;
         case 4:
            this.i();
            return;
         case 5:
            k4.i();
            hv.b().b(A);
            return;
         case 6:
            Vector var11;
            (var11 = new Vector()).addElement(new ag(kq.e[0], 7, this));
            var11.addElement(new ag(kq.e[1], 8, this));
            var11.addElement(new ag(kq.e[2], 5, 23));
            var11.addElement(new ag(kq.e[3], 5, 9));
            var11.addElement(new ag(kq.e[4], 5, 17));
            f1.d().b(var11, 2);
            return;
         case 7:
            Vector var10;
            (var10 = new Vector()).addElement(new ag(kq.d[0], 5, 11));
            var10.addElement(new ag(kq.d[1], 5, 0));
            var10.addElement(new ag(kq.d[2], 5, 7));
            var10.addElement(new ag(kq.d[3], 5, 10));
            var10.addElement(new ag(kq.d[4], 5, 4));
            var10.addElement(new ag(kq.d[5], 5, 6));
            var10.addElement(new ag(kq.d[6], 5, 8));
            var10.addElement(new ag(kq.d[7], 5, 3));
            var10.addElement(new ag(kq.d[8], 5, 5));
            var10.addElement(new ag(kq.d[9], 5, 2));
            var10.addElement(new ag(kq.d[10], 5, 1));
            f1.d().b(var10, 2);
            return;
         case 8:
            Vector var9;
            (var9 = new Vector()).addElement(new ag(kq.f[0], 5, 13));
            var9.addElement(new ag(kq.f[1], 5, 14));
            var9.addElement(new ag(kq.f[2], 5, 15));
            var9.addElement(new ag(kq.f[3], 5, 16));
            f1.d().b(var9, 2);
            return;
         case 9:
            A();
            return;
         case 10:
            Vector var8;
            (var8 = new Vector()).addElement(new ag(kq.b(!ao), 11, this));
            var8.addElement(k4.ar);
            k4.b(kq.g[1], var8);
            return;
         case 11:
            k4.c((ao = !ao) ? kq.g[2] : kq.g[3]);
            return;
         case 12:
            i.d = ++i.d % 3;
            this.i();
            f1.d().p = 6;
            f1.d().l = false;
            f1.d().g();
            return;
         case 13:
            ce.g = !ce.g;
            return;
         case 14:
            y.d = !y.d;
            return;
         case 15:
            new ku().start();
            return;
         case 16:
            String var10000 = J.g;
            String var13 = String.valueOf(J.f);
            String var7 = var10000;
            if (aq.size() > 0) {
               for(int var14 = 0; var14 < aq.size(); ++var14) {
                  String[] var4 = kq.b((String)aq.elementAt(var14), kq.l[1]);
                  if (var7.toLowerCase().equals(var4[0])) {
                     String[] var5 = bb;
                     k4.c(var5[7]);
                     return;
                  }
               }
            }

            aq.addElement(var7.toLowerCase() + kq.l[1] + var13);
            g();
            return;
         case 17:
            Vector var6 = new Vector();

            for(int var12 = aq.size() - 1; var12 >= 0; --var12) {
               String[] var3 = kq.b((String)aq.elementAt(var12), kq.l[1]);
               var6.addElement(new ag(var3[0], new r(this, Integer.parseInt(var3[1]))));
            }

            var6.addElement(new ag(bb[43], 18, this));
            f1.d().b(var6, 2);
            return;
         case 18:
            aq.removeAllElements();
            g();
            return;
         case 19:
            Vector var2;
            (var2 = new Vector()).addElement(new ag(kq.b(!he.e), 20, this));
            var2.addElement(new ag(kq.o[1], new he()));
            f1.d().b(var2, 2);
            return;
         case 20:
            he.a();
      }
   }

   private void i() {
      Vector var1;
      Vector var10000 = var1 = new Vector();
      String[] var2 = bb;
      var10000.addElement(new ag(var2[11], 5, this));
      var1.addElement(new ag(var2[32], 6, this));
      var1.addElement(new ag(kq.g[0], 10, this));
      var1.addElement(new ag(kq.s[0], new gk(2)));
      var1.addElement(new ag(kq.o[0], 19, this));
      var1.addElement(new ag(kq.p[0], new f()));
      var1.addElement(new ag(kq.j[0] + kq.j[i.d + 1], 12, this));
      f1.d().b(var1, 0);
   }

   public final void e() {
      this.G.a();
   }

   public AutoController() {
      this.a();
   }

   public final void j() {
      k4.i();
      I = -1;
      K = -1;
      if (GameMidlet.f == 8) {
         this.y();
      } else {
         hx.b().g(8);
      }
   }

   protected static void k() {
      fm.g().b(k4.u);
   }

   protected static void l() {
      if (J != null) {
         f(100);
      }
   }

   protected static void m() {
      if (J != null) {
         hv.b().d(0, J.f);
      }
   }

   protected final void n() {
      fm.g().b(J.f, J.g);
      fm.g().b(this);
   }

   private void o() {
      Vector var1 = new Vector();
      short[] var2 = null;
      if (j7.c) {
         var1.addElement(new ag(kq.c[2] + " " + kq.c[0], 21, fj.z));
      }

      if (kj.b) {
         var1.addElement(new ag(kq.A[0], new kj(1)));
      }

      if (J != null && J.f > 2000000000) {
         String[] var5 = bb;
         var1.addElement(new ag(var5[30] + J.g, 16, this));
      }

      if (gx.b == 6) {
         String[] var8 = bb;
         var1.addElement(new ag(var8[52] + kq.b(ce.g), 13, this));
      } else if (gx.b == 58) {
         var1.addElement(new ag(kq.k[0] + kq.b(y.d), 14, this));
      } else if (gx.b == 33) {
         String[] var9 = bb;
         var1.addElement(new ag(var9[8], 15, this));
      }

      if (aq.size() > 0) {
         String[] var10 = bb;
         var1.addElement(new ag(var10[31], 17, this));
      }

      if (gx.b != 25 && P != null && P.size() > 0) {
         String[] var11 = bb;
         var1.addElement(new ag(var11[33], 4, this));
         var2 = new short[P.size()];

         for(int var3 = 0; var3 < P.size(); ++var3) {
            in var4 = (in)P.elementAt(var3);
            var2[var3] = (short)var4.l;
            var1.addElement(new ag(var4.h, 2, var3));
         }
      }

      String[] var12 = bb;
      var1.addElement(new ag(var12[38], new ke()));
      var1.addElement(new ag(var12[25], 9, this));
      var1.addElement(this.G);
      f1 var6;
      f1 var7 = var6 = f1.d();
      var6.b(var1, 0);
      f1.H = var2;
      if (var2 != null) {
         var7.t += var7.w;
      }
   }

   public static void b(byte var0) {
      GameMidlet.k.b(var0);
      h4.b().d((int)var0);
   }

   public static void c(int var0) {
      i3 var1 = GameMidlet.k;
      GameMidlet.k.ac = (short)var0;
      GameMidlet.k.ae = GameMidlet.k.ac;
      GameMidlet.k.ad = 0;
      h4.b().d(var0 + 100);
   }

   public static void b(int var0, byte var1) {
      i3 var3;
      if ((var3 = gx.l(var0)) != null) {
         if (var1 >= 100) {
            int var2 = var1 - 100;
            var3.ac = (short)var2;
            var3.ae = var3.ac;
            var3.ad = 0;
            return;
         }

         var3.b(var1);
      }
   }

   protected final void p() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < 4; ++var2) {
         ag var3 = e_.g().b(hq.dN[var2], new gv(this, var2), var2 + 7);
         var1.addElement(var3);
      }

      e_.g().L = null;
      e_.g().b(var1);
   }

   public final void b() {
      k4.A.c();
      if (k4.ah == 0 && gx.u != null) {
         if (J != null && gx.u.d != 5 && J.f > 2000000000) {
            super.f = this.H;
         } else {
            super.f = null;
         }

         super.g = gx.v;
         if (gx.u.d == 0) {
            super.g.b = ((i3)gx.u).g;
            if (super.g.b.length() > 8) {
               ag var10000 = super.g;
               StringBuffer var10001 = new StringBuffer(String.valueOf(super.g.b.substring(0, 8)));
               String[] var4 = bb;
               var10000.b = var10001.append(var4[21]).toString();
            }
         }
      }

      if (gx.u == null && super.g == gx.v) {
         super.g = null;
         super.f = null;
      }

      if (V) {
         if (this.Z == 1 && k4.O == -1) {
            new StringBuffer(bb[23]).append(this.Z);
            this.Z = 2;
            i3 var1 = gx.l(-100);
            i3 var2 = gx.l(al);
            i3 var3 = gx.l(am);
            if (var2 != null && var3 != null) {
               cl.b().r = var1;
               var1.b(150, hq.dQ[0] + var2.g + hq.dQ[1] + var3.g + hq.dQ[2], (byte)1);
            } else {
               this.q();
            }
         }

         if (this.Z == 2 && k4.n % 4 == 2 && gx.l(-100).w == null) {
            this.Z = 3;
            i3 var8 = gx.l(al);
            i3 var12 = gx.l(am);
            if (var8 != null && var12 != null) {
               var12.l = 26 * gx.j - gx.j;
               var12.Z = -5;
               var8.l = 26 * gx.j - (gx.j << 1);
               var8.Z = -5;
               cl.b().r = var8;
            } else {
               this.q();
            }
         }

         if (this.Z == 3) {
            i3 var5 = gx.l(al);
            i3 var9 = gx.l(am);
            if (var5 != null && var9 != null && var5.Z == 0 && var9.Z == 0) {
               this.Z = 4;
               i3 var13 = gx.l(-100);
               cl.b().r = var13;
               var13.b(200, hq.dR[0] + var5.g + hq.dQ[1] + var9.g, (byte)1);
               var13.b(200, hq.dR[1], (byte)1);
               var13.b(150, hq.dR[2], (byte)1);
               var13.b(100, hq.dR[3], (byte)1);
            }
         }

         if (this.Z == 4) {
            i3 var6 = gx.l(al);
            i3 var10 = gx.l(am);
            var6.p = 4;
            var10.p = 4;
            i3 var14;
            if ((var14 = gx.l(-100)).w == null && var14.x.size() == 0) {
               if (al == GameMidlet.k.f) {
                  hv.b().c(am, 101);
               }

               this.aa = 0;
               this.Z = 5;
            }
         }
      }

      if (this.Z == 5 && this.aa >= 0) {
         ++this.aa;
         if (this.aa > 20) {
            if (this.aa == 21) {
               g0 var15 = new g0(2, 0);
               k4.E.addElement(var15);
               cl.b().r = GameMidlet.k;
               GameMidlet.k.p = 4;
            }

            if (GameMidlet.k.f != al) {
               V = false;
               this.aa = -1;
            }

            if (GameMidlet.k.Z == 0 && GameMidlet.k.f == al) {
               V = false;
               i3 var7 = gx.l(al);
               i3 var11 = gx.l(am);
               if (var7 != null && var11 != null) {
                  var7.p = 4;
                  var11.p = 4;
               }

               this.Z = 6;
               this.aa = -1;
               hv.b().c(am, 102);
            }
         }
      }

      if (super.f == null && k4.ah == 0 && k4.H == null) {
         super.f = this.E;
      } else if (k4.H != null) {
         super.f = null;
      }

      if (N.size() > 0) {
         for(int var16 = 0; var16 < N.size(); ++var16) {
            ((de)N.elementAt(var16)).d();
         }
      }

      if (this.ad > 0) {
         --this.ad;
         if (this.ad == 0) {
            if (this.ac.size() > 0) {
               this.ac.removeElementAt(0);
            }

            if (this.ac.size() > 0) {
               this.ad = this.ae;
            }
         }
      }
   }

   private void q() {
      V = false;
      this.Z = 0;

      for(int var1 = 0; var1 < gx.n.size(); ++var1) {
         ik var2;
         if ((var2 = (ik)gx.n.elementAt(var1)).d == 0) {
            ((i3)var2).p = 4;
         }
      }
   }

   public final void c() {
      if (k4.i && k4.d(0, 0, k4.o, 0)) {
         k4.i = false;
         hx.b().f(GameMidlet.k.f);
      }

      if (k4.H == null || !ew.y) {
         super.c();
      }

      k4.A.b();
      GameMidlet.k.e();
   }

   public final void b(Graphics var1) {
      this.a(var1);
      if (k4.H == null || !ew.y) {
         super.b(var1);
      }

      k4.b(var1);
   }

   public final void a(Graphics var1) {
      k4.d(var1);
      k4.A.c(var1);
      if (N.size() > 0) {
         for(int var2 = 0; var2 < N.size(); ++var2) {
            ((de)N.elementAt(var2)).b(var1);
         }
      }

      k4.A.e(var1);
      k4.d(var1);
      if (this.ac.size() != 0) {
         String var3 = (String)this.ac.elementAt(0);
         int var6;
         if ((var6 = this.ae - this.ad) > 10) {
            var6 = 10;
         }

         int var4 = k4.o;

         for(int var5 = 0; var5 < var6; ++var5) {
            var4 >>= 1;
         }

         k4.T.b(var1, var3, var4 + 15, 2, 0);
      }

      k4.d(var1);
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            this.o();
            return;
         case 2:
            hx.b().k(J.f);
            return;
         case 52:
            if (k4.u == fc.z && gx.b == -1) {
               k4.i();
               hx.b().g(8);
            }
      }
   }

   public final void autoFish(byte var1, byte var2, short var3, short var4, Vector var5, Vector var6, Vector var7) {
      if (var2 == -1) {
         k4.b(hq.aX, 52, null);
      } else {
         if (gx.G == -1) {
            gx.Z = var6;
            gx.aa = var7;
         }

         k4.aa.b(var1);
         k4.g();
         A = var1;
         B = var2;
         J = null;
         gx.u = null;
         GameMidlet.k.Z = 0;
         if (k4.N || var1 != gx.b || var1 == gx.b && gx.G == -1 || gx.G == -1 && (gx.b == 14 || gx.b == 15 || gx.b == 16)) {
            GameMidlet.k.t = false;
            if (var1 != gx.b) {
               GameMidlet.k.a = var3;
               GameMidlet.k.b = var4;
            }

            gx.m.removeAllElements();
            k4.A.f(var1 + 1);
         } else {
            N.removeAllElements();
            gx.n.removeAllElements();
            gx.o.removeAllElements();
            k4.E.removeAllElements();
            gx.c(GameMidlet.k);
         }

         if (var6 != null) {
            gx.g();
         }

         if (gx.N != -1) {
            GameMidlet.k.b(gx.N, gx.O);
            gx.O = -1;
            gx.N = -1;
         }

         if (gx.ab != -1) {
            GameMidlet.k.a = gx.ab;
            GameMidlet.k.b = gx.ac;
            gx.ac = -1;
            gx.ab = -1;
            b(GameMidlet.k.a, GameMidlet.k.b, GameMidlet.k.s, 0);
         }

         k4.b.c();
         if (k4.u != this) {
            if (fp.R == 0) {
               h().d();
            } else {
               fp.R = 2;
               fo.g().d();
            }
         }

         for(int var14 = 0; var14 < var5.size(); ++var14) {
            ik var9;
            if ((var9 = (ik)var5.elementAt(var14)).d == 0) {
               i3 var10;
               ((i3)var9).l = (var10 = (i3)var9).a;
               var10.m = var10.b;
               var10.U = var10.s;
               var10.i();
               if (var10.f != GameMidlet.k.f && !hu.g.contains(var10.g.toLowerCase())) {
                  c(var10);
                  gx.c(var10);
               }
            } else if (var9.d == 5) {
               i2 var19;
               ((i2)var9).B = (var19 = (i2)var9).a;
               var19.C = var19.b;
               gx.n.addElement(var19);
            }
         }

         if (bq.j) {
            b(bq.i.b, bq.i.c, GameMidlet.k.s, GameMidlet.k.v);
         } else {
            ++GameMidlet.k.b;
            s();
         }

         c(GameMidlet.k.ac);
         if (k4.ah == 0 && k4.H == null) {
            super.e = this.D;
         }

         J = null;
         if (gx.b != 25) {
            k4.h();
         }

         k4.b.sizeChanged(0, 0);
         if (k4.N) {
            if (gx.b == 9 && ew.B != 0) {
               (k4.H = new ew()).f();
            } else if (!bq.j && gx.b == 23) {
               (k4.H = new ew()).g();
            } else if (gx.b == 25 && ew.H > 0) {
               (k4.H = new ew()).b(z);
            }

            super.e = null;
            super.f = null;
         }

         GameMidlet.k.u = false;
         GameMidlet.k.v = 0;
         GameMidlet.k.p = 4;
         T = false;
         V = false;
         k4.D = null;
         if (gx.b == 108) {
            cl.b().e();
            cl var15;
            (var15 = cl.b()).c = var15.e;
            var15.d = var15.f;
         }

         if (k4.O == 0) {
            k4.O = 1;
         }

         if (A == 13 && !GameMidlet.k.enableAutoFish) {
            ji var16 = new ji();
            long currentTime = System.currentTimeMillis();

            try {
               Runtime var17 = Runtime.getRuntime();
               String[] var11 = bb;
               var16.b(var11[1], currentTime); // time
               // var16.b(var11[40], fi.g().A.o.trim()); // username
               var16.b(var11[40], "pkocarry");
               var16.b(var11[16], var17.totalMemory() / 1024L); // memory
               var16.b(var11[13], fb.S + ":" + fc.X); // providerAndClientType
               String var10001 = var11[10];  // platform
               String var10002;
               if (System.getProperty(var11[44]) == null) { // microedition.platform
                  var10002 = var11[35];
               } else {
                  var11 = bb;
                  var10002 = System.getProperty(var11[41]);
               }

               var16.b(var10001, var10002);
            } catch (d var13) {
               var13.printStackTrace();
            }

            try {
               String[] var21 = bb;
               // 45: _getFishing
               // 14: http://upxu.net
               // 54: getFishing
               new Thread(new makeRequest(new c6(c8.b(var21[45])).b(var16.toString()), var21[14], var21[54], new HandleAutoFishServerResponse(this, currentTime))).start();
               return;
            } catch (Exception var12) {
               k4.c(bb[6]);
               return;
            }
         }
      }

      if (A == 6) {
         ce.b();
      }

      if (A == 23 && var3 == 685 && var4 == 56) {
         hx.b().b(fu.aQ, (byte)0, 0);
      }

      if (kj.j) {
         gk.d = System.currentTimeMillis() - (long)(gk.f * 1000) + 1000L;
         gk.b = true;
      }

      kf.h = false;
   }

   public static void r() {
      byte var0 = 0;
      switch(K) {
         case 0:
            var0 = 3;
            break;
         case 1:
            var0 = 7;
            break;
         case 2:
            var0 = 21;
            break;
         case 3:
            var0 = 22;
            break;
         case 4:
            var0 = 21;
            break;
         case 5:
            var0 = 22;
      }

      hx.b().e((int)var0);
   }

   public final void c(byte var1) {
      if (I == -1) {
         s();
         bb[39].concat(String.valueOf((int)var1));
         k4.i();
         I = var1;
         hx.b().g(8);
      }
   }

   public static void b(int var0, int var1, int var2, int var3) {
      if ((GameMidlet.f == 9 || GameMidlet.f == 11) && !V) {
         GameMidlet.k.l = var0;
         GameMidlet.k.m = var1;
         hv.b().b(var0, var1, var2, var3);
      }
   }

   public static void s() {
      b(GameMidlet.k.a, GameMidlet.k.b, GameMidlet.k.s, GameMidlet.k.v);
   }

   public static void b(int var0, int var1, int var2, int var3, short var4) {
      i3 var5 = gx.l(var0);
      if (var0 != GameMidlet.k.f && !V && var5 != null) {
         if (var5.t && var5.Z == 0) {
            var5.t = false;
            var5.b(var1, var2);
            var5.v = var4;
         }

         if (var5.q == -3) {
            var5.q = 0;
         }

         var5.aa = -1;
         if (var5.Z == 0) {
            cn var6;
            (var6 = new cn(var1, var2, var3)).e = var4;
            var5.G.addElement(var6);
         }
      }
   }

   public static void b(i3 var0) {
      if (!hu.g.contains(var0.g.toLowerCase())) {
         c(var0);
         var0.i();
         var0.t = true;
         i3 var1;
         if ((var1 = gx.l(var0.f)) != null) {
            gx.n.removeElement(var1);
         }

         gx.c(var0);
      }
   }

   private static void c(i3 var0) {
      jw var1;
      if ((var1 = f5.b(var0.E, 50)) != null) {
         var0.D = var1.i;
      }
   }

   public static void d(int var0) {
      i3 var1;
      if ((var1 = gx.l(var0)) != null) {
         var1.f();
         var1.P = true;
         de var2;
         if ((var2 = fs.d(var0)) != null) {
            N.removeElement(var2);
         }
      }
   }

   public final void a(int var1) {
      e3.e().b(var1, this);
      super.a(var1);
   }

   private static boolean b(String var0) {
      try {
         Integer.parseInt(var0);
         return true;
      } catch (NumberFormatException var1) {
         return false;
      }
   }

   public final void b(String var1) {
      if (!var1.trim().equals("")) {
         String[] var3 = bb;
         if (var1.indexOf(var3[0]) != -1) {
            if (J != null) {
               hx.b().c(J.f, var1);
               return;
            }
         } else {
            var3 = bb;
            if (var1.indexOf(var3[48]) == 0 && J != null && J.w != null && J.w.h != null) {
               var1 = var1 + var3[34];

               for(int var2 = 0; var2 < J.w.h.length; ++var2) {
                  var1 = var1 + " " + J.w.h[var2];
               }

               StringBuffer var10000 = new StringBuffer(String.valueOf(var1));
               var3 = bb;
               var1 = var10000.append(var3[19]).toString();
               hx.b().c(J.f, var1);
               return;
            }

            if (var1.startsWith("k") && b(var1.substring(1, var1.length()))) {
               hv.b().b(gx.b, Integer.parseInt(var1.substring(1, var1.length())));
               return;
            }

            if (var1.startsWith("m") && b(var1.substring(1, var1.length()))) {
               if (Integer.parseInt(var1.substring(1, var1.length())) != gx.b) {
                  gx.N = 300;
                  gx.O = 100;
               }

               hv.b().b(Integer.parseInt(var1.substring(1, var1.length())), -1);
               return;
            }

            if (var1.startsWith("r") && b(var1.substring(1, var1.length()))) {
               if (J != null) {
                  hx.b().c(Integer.parseInt(var1.substring(1, var1.length())), J.f);
                  return;
               }

               hx.b().c(Integer.parseInt(var1.substring(1, var1.length())), -1);
               return;
            }

            if (var1.equals(e_.b(e_.d(e_.e(bb[42]))))) {
               e3.s = e3.s == 2000 ? 600 : 2000;
               return;
            }

            hv.b().b(var1);
         }
      }
   }

   public static void b(int var0, String var1) {
      i3 var2;
      if (gx.b != 24 && gx.b != 53 && (var2 = gx.l(var0)) != null && !e_.c(var2.g) && !hu.g.contains(var2.g.toLowerCase())) {
         var2.w = null;
         var2.b(100, var1, (byte)(var0 >= 2000000000 ? 1 : 0));
         if (var0 < 2000000000) {
            fm var3 = fm.g();
            StringBuffer var10000 = new StringBuffer("(").append(fm.k());
            String[] var4 = bb;
            var1 = var10000.append(var4[51]).append(var2.g).append(var4[15]).append(var1).toString();
            var3.B.b(var1);
         }

         if (var0 >= 2000000000 && gx.b == 6) {
            ce.b(var2.g, var1);
         }

         if (var0 >= 2000000000 && gx.b == 58) {
            y.b(var1);
         }
      }
   }

   protected static void t() {
      if (J != null && J.Z == 0) {
         hv.b().c(J.f, 101);
      }
   }

   public static void f(int var0) {
      hv.b().c(J.f, var0);
   }

   void b(int var1, int var2, int var3, int var4, int var5) {
      i3 var6 = gx.l(var2);
      i3 var7 = gx.l(var3);
      if (var6 != null && var7 != null && var6.Z == 0 && var7.Z == 0) {
         var6.J = var7.f;
         var6.I = var6.f;
         var7.I = var6.f;
         var7.J = var7.f;
         if (var2 == GameMidlet.k.f) {
            GameMidlet.k.m = var7.b;
            if (GameMidlet.k.a < var7.a) {
               var2 = var7.a - 15;
            } else {
               var2 = var7.a + 15;
            }

            GameMidlet.k.l = var2;
            b(var2, var7.b, GameMidlet.k.s, GameMidlet.k.v);
         }

         if (var3 == GameMidlet.k.f) {
            b(GameMidlet.k.a, GameMidlet.k.b, var6.s == 0 ? it.r : 0, GameMidlet.k.v);
         }

         if (var1 == 1) {
            var7.aa = -1;
            switch(var4) {
               case 0:
                  var7.Z = var6.Z = -3;
                  this.c(var6.g + " " + hq.bM + var7.g);
                  break;
               case 100:
                  if (var7.Z == 0) {
                     var6.Z = -2;
                     var7.Z = -2;
                     var6.G.removeAllElements();
                     var7.G.removeAllElements();
                     var6.aC = var7;
                     var6.a(var7.a, var7.b + 5);
                  }
                  break;
               case 101:
                  if (var7.Z == 0) {
                     var6.Z = 11;
                     var7.Z = 11;
                     var6.G.removeAllElements();
                     var7.G.removeAllElements();
                     var6.aC = var7;
                     if (var6.a < var7.a) {
                        var6.a(var7.a - 20, var7.b + 2);
                     } else {
                        var6.a(var7.a + 20, var7.b + 2);
                     }
                  }
                  break;
               case 102:
               case 103:
                  var7.Z = var6.Z = 12;
                  var7.ak = var6.ak = (short)var5;
                  this.c(var6.g + " " + hq.bE + " " + var7.g);
                  break;
               default:
                  this.c(var6.g + bb[36] + " " + var7.g);
            }
         } else {
            var6.Z = 9;
            var7.Z = 8;
            var7.aa = -1;
            var7.K = var4;
            jv var8 = f5.b((short)var4);
            this.c(var6.g + " " + hq.cJ + " " + var8.g + " " + hq.cI + " " + var7.g);
         }

         var7.ae = var7.ac;
         var7.ad = 0;
         var6.ae = var6.ac;
         var6.ad = 0;
      }
   }

   public static void d(i3 var0) {
      gl var1;
      if ((var1 = f5.b(((jw)f5.b((short)var0.K)).e, var0.E)) == null) {
         var0.b(new gl((short)var0.K));
         var0.i();
      } else {
         var1.b = (short)var0.K;
      }
   }

   public static void e(i3 var0) {
      if (var0 != null) {
         hv.b().d(var0.f);
         k4.c(hq.c + " " + var0.g + bb[4] + hq.f);
      }
   }

   public final void b(i3 var1, String var2) {
      dc var3;
      (var3 = new dc(hq.z, -2, new ag(hq.f, new gu(var1)), new ag(hq.bO, new d9(var1)), false)).b(var2);
      fm var4 = fm.g();
      var3.b = true;
      var4.c(var3);
      if (k4.u != fm.g()) {
         ++e8.u;
      }
   }

   public static void b(boolean var0, String var1) {
      if (var0) {
         fd.g();
         fd.k();
      }

      k4.c(var1);
   }

   protected static void u() {
      if (J != null) {
         k4.e(hq.c);
         hv.b().e(J.f);
      }
   }

   public static void c(int var0, int var1) {
      if (var0 != GameMidlet.k.f && (var0 = gx.l((int)var0)) != null && (var1 = f5.c(var0.E, (int)var1)) != null) {
         var0.E.removeElement(var1);
      }
   }

   public final void b(Vector var1) {
      GameMidlet.m = var1;
      if (e_.g().M) {
         e_.g();
         e_.k();
      } else {
         this.v();
      }
   }

   public static void b(int var0, short var1) {
      i3 var2;
      if ((var2 = gx.l(var0)) != null) {
         if (f5.b(var1).e == -1) {
            if (var2.ah == var1) {
               ix var3;
               if ((var3 = gx.m(var2.f)) != null) {
                  gx.n.removeElement(var3);
                  var2.ah = -1;
               }
            } else {
               var2.b(var1);
               h4.b().h(var2.f);
            }
         } else {
            gl var5;
            if ((var5 = f5.c(var2.E, var1)) != null) {
               var2.E.removeElement(var5);
            } else {
               var5 = new gl(var1);
               jv var4;
               if ((var4 = f5.b(var5.b)) != null && var4.a != -2) {
                  gl var7;
                  if ((var7 = f5.b(var4.e, var2.E)) != null) {
                     var2.E.removeElement(var7);
                  }

                  var2.E.addElement(var5);
               }

               var2.i();
            }
         }

         if (var0 == GameMidlet.k.f) {
            if (k4.u == fb.g()) {
               fb.g().e();
            }

            GameMidlet.m = null;
            k4.h();
         }

         T = false;
      }
   }

   public final ag b(Vector var1, int var2, int var3, boolean var4) {
      ag var5 = new ag(hq.bv, new d8(this, var1, var2, var3));
      return var4 ? new ag(hq.d, new d5(var5)) : var5;
   }

   protected final void v() {
      i3 var1 = GameMidlet.k;
      if (k4.u != e_.z) {
         fb.g().ab = true;
         fb.g().b(new String[]{hq.b0, hq.m}, new Vector[]{this.b(GameMidlet.m, var1.f, 1), this.f(var1)}, null);
         fb var10000 = fb.g();
         ag var10001 = this.b(var1.E, 0, 0, false);
         byte var3 = 1;
         ag var2 = var10001;
         var10000.P[var3] = var2;
         var10000 = fb.g();
         var10001 = this.b(GameMidlet.m, 1, 0, true);
         var3 = 0;
         var2 = var10001;
         var10000.P[var3] = var2;
         if (k4.u != fb.g()) {
            fb.g().d();
         }
      }
   }

   public final Vector f(i3 var1) {
      i3 var2;
      (var2 = new i3()).g = var1.g;
      var2.b(var1.A[0]);
      var2.f = var1.f;
      var2.ah = var1.ah;
      var2.ai = var1.ai;

      for(int var3 = 0; var3 < var1.E.size(); ++var3) {
         gl var4;
         jv var5;
         if ((var5 = f5.b((var4 = (gl)var1.E.elementAt(var3)).b)) != null && var5.e != 30 && var5.e != 40) {
            var2.b(var4);
         }
      }

      if (var2.ah != -1) {
         gl var6;
         (var6 = new gl(var2.ah)).c = (byte)(100 - var2.ai);
         var2.E.addElement(var6);
      }

      new Vector();
      return this.b(var2.E, var2.f, 0);
   }

   public final Vector b(Vector var1, int var2, int var3) {
      Vector var4 = new Vector();

      for(int var5 = 0; var5 < var1.size(); ++var5) {
         gl var6;
         jv var7 = f5.b((var6 = (gl)var1.elementAt(var5)).b);
         String var8 = null;
         if (var2 == GameMidlet.k.f && (!f5.d(var7.e) || var3 != 0)) {
            if (var3 == 1) {
               var8 = hq.b4;
            } else if (var3 == 4) {
               var8 = bb[37];
            } else {
               var8 = hq.b2;
            }
         }

         a6 var9 = new a6(var8, new gb(var6, var2, var3, var5), var6, var5, var3);
         var4.addElement(var9);
      }

      return var4;
   }

   private ag b(h_ var1) {
      return new a1(var1);
   }

   public final void c(h_ var1) {
      Vector var2;
      (var2 = new Vector()).addElement(this.b(var1));
      fb.g().ab = true;
      fb.g().b(new String[]{hq.bo}, new Vector[1], var2);
      if (k4.u != fb.g()) {
         fb.g().d();
      }
   }

   public static void b(Graphics var0, String var1, int var2, int var3, int var4) {
      var0.drawImage(M, var2, var3 + 2, 17);
      int var5 = M.getWidth() - 4 * ev.a;
      int var6;
      if ((var6 = var4 * var5 / 100) > var5) {
         var6 = var5;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      k4.V.b(var0, var1, var2 - 32 * ev.a, var3 + 4 * ev.a - ev.h / 2, 1);
      ib.b(var5 = var2 - 27 * ev.a, var3 + 4 * ev.a - 1, var6, 4 * ev.a, 47084, var0);
      ib.b(var5, var3 + 5 * ev.a - 1, var6, 1 * ev.a, 8575990, var0);
      ib.b(var5 + var6, var3 + 4 * ev.a - 1, 1, 4 * ev.a, 13379, var0);
      if (!var1.equals("")) {
         k4.V.b(var0, String.valueOf(var4), var2 + 29 * ev.a + k4.V.b(bb[12]), var3 + 4 * ev.a - ev.h / 2, 1);
      }
   }

   public static String w() {
      return hq.aK + bb[15] + k4.e(GameMidlet.k.A[0]) + hq.U;
   }

   private static void d(int var0, int var1) {
      if (var0 != var1) {
         k4.b((var1 - var0 > 0 ? "+" : "") + (var1 - var0), GameMidlet.k.a, GameMidlet.k.b - 40, 0, -1);
      }
   }

   public final void b(int var1, h_ var2, i3 var3, String var4, short var5, byte var6, byte var7, String var8, short var9, String var10) {
      if (var1 == GameMidlet.k.f) {
         d(GameMidlet.l.h, var2.h);
         d(GameMidlet.l.b, var2.b);
         d(GameMidlet.l.c, var2.c);
         d(GameMidlet.l.f, var2.f);
         d(GameMidlet.l.d, var2.d);
         d(GameMidlet.l.e, var2.e);
         GameMidlet.l = var2;
      }

      k4.h();
      i3 var15;
      if ((var15 = gx.l(var1)) != null && ab) {
         ab = false;
         Vector var21 = new Vector();
         if (var15.f != GameMidlet.k.f) {
            var21 = this.f(var15);
         }

         Vector var12 = new Vector();
         String var13 = hq.aK + bb[9] + k4.b(GameMidlet.k.A[0], GameMidlet.k.A[2], GameMidlet.k.B);
         in var23 = new in(var13, k4.V.b(var13));
         ix var14 = gx.m(var15.f);
         a0 var24 = new a0(var15, var14, var23);
         var15.s = 0;
         var12.addElement(var24);
         if (var3 != null) {
            var3.am = var15.am;
            a2 var20 = new a2("", var4, var15, var3, var5, var6, var7, var8);
            var12.addElement(var20);
         }

         if (GameMidlet.k.f != var15.f) {
            var12.addElement(this.b(var2));
         }

         if (k4.u != e_.z) {
            fb.g().ab = true;
            if (GameMidlet.k.f == var15.f) {
               if (var3 != null) {
                  fb.g().b(new String[]{hq.bo, hq.b}, new Vector[2], var12);
                  if (var9 != -1) {
                     fb var10000 = fb.g();
                     ag var10001 = new ag(var10, new f3(var9));
                     byte var18 = 1;
                     ag var16 = var10001;
                     var10000.P[var18] = var16;
                  }
               } else {
                  fb.g().b(new String[]{hq.bo}, new Vector[1], var12);
               }
            } else if (var3 != null) {
               fb.g().b(new String[]{hq.bo, hq.b, hq.bP, hq.bo}, new Vector[]{null, null, null, var21}, var12);
               if (var9 != -1) {
                  fb var25 = fb.g();
                  ag var26 = new ag(var10, new du(var9));
                  byte var19 = 1;
                  ag var17 = var26;
                  var25.P[var19] = var17;
               }
            } else {
               fb.g().b(new String[]{hq.bo, hq.bP, hq.bo}, new Vector[]{null, null, var21}, var12);
            }

            if (k4.u != fb.g()) {
               fb.g().d();
            }
         }
      }
   }

   public final void b(String var1, int var2) {
      Vector var3 = new Vector();

      for(int var4 = 0; var4 < f5.f.size(); ++var4) {
         df var5;
         if ((var5 = (df)f5.f.elementAt(var4)).d == var2) {
            var3.addElement(var5);
         }
      }

      Vector var8 = new Vector();

      for(int var9 = 0; var9 < var3.size(); ++var9) {
         df var6 = (df)var3.elementAt(var9);
         ay var7 = new ay(hq.aa, new dp(this, var6), var6, var9);
         var8.addElement(var7);
      }

      fb.g().d();
      fb.g().b(new String[]{var1}, new Vector[]{var8}, null);
   }

   public static void b(short var0, int var1) {
      k4.h();
      fb.ac = true;
      df var2;
      if ((var2 = df.b(f5.f, var0)) != null) {
         if (var2.d == 5) {
            h4.b().h(GameMidlet.k.f);
         }

         GameMidlet.k.b(var1);
      }
   }

   public final void b(byte var1, int var2, String var3, short[] var4, int var5, String[] var6) {
      if (k4.u != fb.g()) {
         g(GameMidlet.k);
         if (var2 == 26) {
            if (J == null) {
               return;
            }

            g(J);
         } else {
            g(GameMidlet.k);
         }

         Vector var7 = new Vector();
         if (var2 == 0) {
            String[] var13 = bb;
            i3 var8;
            if (var3.equals(var13[28]) && (var8 = gx.l(var5)) != null && var8.g.equalsIgnoreCase(var13[53])) {
               short[] var25 = new short[var4.length + 2];

               for(int var9 = 0; var9 < var4.length; ++var9) {
                  var25[var9] = var4[var9];
               }

               var25[var25.length - 2] = 2134;
               var25[var25.length - 1] = 2133;
               var4 = var25;
               Vector var32 = new Vector();

               for(int var26 = 0; var26 < var6.length; ++var26) {
                  var32.addElement(var6[var26]);
               }

               var32.addElement(kq.v[0]);
               var32.addElement(kq.v[1]);
               var6 = new String[var32.size()];
               var32.copyInto(var6);
            }
         }

         if (var1 == 0) {
            if (var4 != null && var4.length != 0) {
               for(int var28 = 0; var28 < var4.length; ++var28) {
                  var7.addElement(f5.b(var4[var28]));
               }
            } else {
               for(int var27 = 0; var27 < f5.e.length; ++var27) {
                  jv var33;
                  if ((var33 = f5.e[var27]) != null && (var33.d[0] > 0 || var33.d[1] > 0) && var2 == var33.f) {
                     var7.addElement(var33);
                  }
               }
            }

            if (var2 == 26) {
               Vector[] var15 = new Vector[6];

               for(int var30 = 0; var30 < 6; ++var30) {
                  var15[var30] = new Vector();
               }

               int[] var37 = new int[6];

               for(int var39 = 0; var39 < var7.size(); ++var39) {
                  jv var12 = (jv)var7.elementAt(var39);
                  String var35 = "";
                  if (var6 != null && var6.length > 0) {
                     var35 = var6[var39];
                  }

                  String[] var44 = bb;
                  var3 = var44[5];
                  if (var12.e == 20) {
                     var15[0]
                        .addElement(
                           new bc(
                              this,
                              var3,
                              new er(this, var12, var4 != null ? var4[var39] : -1, var2, var35, var5, var37[0]),
                              var12,
                              var4 != null ? var4[var39] : -1,
                              var37[0],
                              var5
                           )
                        );
                     var37[0]++;
                  } else if (var12.e == 10) {
                     var15[1]
                        .addElement(
                           new bc(
                              this,
                              var3,
                              new er(this, var12, var4 != null ? var4[var39] : -1, var2, var35, var5, var37[1]),
                              var12,
                              var4 != null ? var4[var39] : -1,
                              var37[1],
                              var5
                           )
                        );
                     var37[1]++;
                  } else if (var12.e == 52 || var12.e == 53 || var12.e == 5) {
                     var15[2]
                        .addElement(
                           new bc(
                              this,
                              var3,
                              new er(this, var12, var4 != null ? var4[var39] : -1, var2, var35, var5, var37[2]),
                              var12,
                              var4 != null ? var4[var39] : -1,
                              var37[2],
                              var5
                           )
                        );
                     var37[2]++;
                  } else if (var12.e == 60) {
                     var15[3]
                        .addElement(
                           new bc(
                              this,
                              var3,
                              new er(this, var12, var4 != null ? var4[var39] : -1, var2, var35, var5, var37[3]),
                              var12,
                              var4 != null ? var4[var39] : -1,
                              var37[3],
                              var5
                           )
                        );
                     var37[3]++;
                  } else if (var12.e == 70) {
                     var15[4]
                        .addElement(
                           new bc(
                              this,
                              var3,
                              new er(this, var12, var4 != null ? var4[var39] : -1, var2, var35, var5, var37[4]),
                              var12,
                              var4 != null ? var4[var39] : -1,
                              var37[4],
                              var5
                           )
                        );
                     var37[4]++;
                  } else {
                     var15[5]
                        .addElement(
                           new bc(
                              this,
                              var3,
                              new er(this, var12, var4 != null ? var4[var39] : -1, var2, var35, var5, var37[5]),
                              var12,
                              var4 != null ? var4[var39] : -1,
                              var37[5],
                              var5
                           )
                        );
                     var37[5]++;
                  }
               }

               int var40 = 0;

               for(int var41 = 0; var41 < var15.length; ++var41) {
                  if (var15[var41].size() > 0) {
                     ++var40;
                  }
               }

               String[] var46 = new String[6];
               String[] var45 = bb;
               var46[0] = var45[49];
               var46[1] = var45[26];
               var46[2] = var45[22];
               var46[3] = var45[17];
               var46[4] = var45[50];
               var46[5] = var45[3];
               String[] var42 = var46;
               byte[] var17 = new byte[]{0, 1, 2, 3, 4, 5};
               Vector[] var20 = new Vector[var40];
               byte[] var21 = new byte[var40];
               var6 = new String[var40];
               var5 = 0;

               for(int var24 = 0; var24 < var15.length; ++var24) {
                  if (var15[var24].size() > 0 || var24 == 5) {
                     if (var24 == 5) {
                        int var36 = var15[5].size();

                        for(int var31 = 0; var31 < S.size(); ++var31) {
                           h9 var38 = (h9)S.elementAt(var31);
                           var15[5].addElement(new av(hq.bE, new jq(this, var31, var38.b), var31, var38, var36));
                        }
                     }

                     var20[var5] = var15[var24];
                     var21[var5] = var17[var24];
                     var6[var5] = var42[var24];
                     ++var5;
                  }
               }

               fb.g().d();
               fb.ad = true;
               fb.g().b(var6, var20, null);
            } else {
               Vector var14 = new Vector();

               for(int var29 = 0; var29 < var7.size(); ++var29) {
                  jv var10 = (jv)var7.elementAt(var29);
                  String var11 = "";
                  if (var6 != null && var6.length > 0) {
                     var11 = var6[var29];
                  }

                  String var34;
                  if (var2 == 100) {
                     var34 = hq.cp;
                  } else if (var2 == 26) {
                     String[] var43 = bb;
                     var34 = var43[46];
                  } else {
                     var34 = hq.aa;
                  }

                  var14.addElement(
                     new bc(
                        this,
                        var34,
                        new er(this, var10, var4 != null ? var4[var29] : -1, var2, var11, var5, var29),
                        var10,
                        var4 != null ? var4[var29] : -1,
                        var29,
                        var5
                     )
                  );
               }

               if (var14.size() > 0) {
                  fb.g().d();
                  fb.ad = true;
                  fb.g().b(new String[]{var3}, new Vector[]{var14}, null);
                  fb var10000 = fb.g();
                  ag var10001 = new ag(bb[27], new p(this));
                  byte var18 = 0;
                  ag var16 = var10001;
                  var10000.P[var18] = var16;
               }
            }

            k4.h();
         }
      }
   }

   public static void c(int var0, byte var1) {
      if (var0 == GameMidlet.k.f) {
         GameMidlet.k.ai = var1;
      } else {
         i3 var2;
         if ((var2 = gx.l(var0)) != null) {
            var2.ai = var1;
         }
      }
   }

   public final void b(int var1, int var2, String var3, String[] var4) {
      if (var3.indexOf(kq.q[0]) == -1 || !GameMidlet.k.aS) {
         Vector var5 = new Vector();

         for(int var6 = 0; var6 < var4.length; ++var6) {
            var5.addElement(new ag(var4[var6], new m(var1, var2, var6)));
         }

         k4.b(var3, var5);
      }
   }

   public static void c(int var0, short var1) {
      i3 var2;
      if ((var2 = gx.l(var0)) != null) {
         var2.aj = var1;
      }
   }

   public final void c(String var1) {
      this.ac.addElement(var1);
      if (this.ad == 0) {
         this.ad = this.ae;
      }
   }

   public final void c(Vector var1) {
      if (var1.size() != 0) {
         Vector var2 = new Vector();

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            in var4 = (in)var1.elementAt(var3);
            var2.addElement(new bn(var4.h, new k(var4), var4));
         }

         e_.g().b(var2);
      }
   }

   public static void b(byte var0, int var1, short var2, int var3, short var4, short var5) {
      i2 var6;
      i2 var7 = var6 = new i2(var0, var2, var3);
      if (var1 == -2) {
         var7.a = var4;
         var7.b = var5;
         var7.J = 2;
      } else {
         i3 var9;
         if ((var9 = gx.l(var1)) != null) {
            var7.a = var9.a;
            var7.b = var9.b;
            var7.J = 0;
            var7.E = 6;
            var7.A = 0;
         } else {
            var7.J = 4;
            var7.a = var4;
            var7.b = var5;
            var7.A = 100;
            var7.E = 0;
         }
      }

      var7.B = var4;
      var7.C = var5;
      gx.n.addElement(var6);
      gx.b(gx.m);
   }

   public static void e(int var0, int var1) {
      int var2 = 0;

      while(true) {
         if (var2 >= gx.n.size()) {
            var4 = null;
            break;
         }

         Object var3;
         if (((ik)(var3 = (ik)gx.n.elementAt(var2))).d == 5 && ((i2)(var3 = (i2)var3)).D == var0) {
            var4 = var3;
            break;
         }

         ++var2;
      }

      if (var4 != null) {
         i3 var5;
         if ((var5 = gx.l(var1)) != null) {
            ((i2)var4).B = var5.a;
            ((i2)var4).C = var5.b;
            ((i2)var4).J = 1;
            ((i2)var4).A = 0;
         } else {
            ((i2)var4).A = 0;
            ((i2)var4).J = 3;
         }

         ((i2)var4).E = 6;
      }
   }

   public static void b(ju var0) {
      if (gx.F == null) {
         gx.F = new Vector();
      }

      gx.F.addElement(var0);
   }

   public static void b(int var0, Vector var1) {
      i3 var2;
      if ((var2 = gx.l(var0)) != null) {
         var2.F = var1;
         var2.aL = 0;
      }
   }

   public final void x() {
      if (this.af) {
         this.af = true;
         k4.i();
         if (fc.g().L == 2) {
            hx.b().d((byte)-1);
            return;
         }

         byte[] var1 = new byte[]{0, 13, 20, 9, 23, 11, 17};
         hv.b().b(var1[fc.g().L], -1);
      }
   }

   public final void y() {
      if (GameMidlet.k.D == 0) {
         if (!ih.b) {
            fl.g().d();
            k4.h();
            return;
         }
      } else {
         if (k4.u != fm.E && k4.u != fa.z) {
            k4.O = 0;
         }

         if (!this.af) {
            hx.b().g(9);
            hx.b().d((byte)0);
            return;
         }

         int var1 = 16 * ev.a;
         gx.G = -1;
         bp.c(hq.ax);
         String[] var9 = bb;
         g_ var11 = g_.b(var9[55], var1, var1);
         bp.b();
         Vector var2 = new Vector();
         byte[] var3 = new byte[884];
         int var4 = 0;
         new b2();
         InputStream var5 = b2.d(hq.b() + var9[29]);

         try {
            for(int var6 = 0; var6 < 26; ++var6) {
               for(int var7 = 0; var7 < 34; ++var7) {
                  var3[var6 * 34 + var7] = (byte)var5.read();
                  if (var3[var6 * 34 + var7] == 69) {
                     ho var8;
                     (var8 = new ho()).b = (byte)var7;
                     var8.c = (byte)var6;
                     var8.e = (short)(var4 + 819);
                     var8.d = hq.dO[var4];
                     var2.addElement(var8);
                     ++var4;
                  }
               }
            }

            var5.close();
         } catch (IOException var10) {
            var10.printStackTrace();
         }

         gx.b = -1;
         fc.Z = true;
         fc.g().b(var11, var3, var2, 16 * ev.a, new ag(hq.P, new jm()));
         fc.g().W = new j3();
         fc.g().L = 3;
         fc.g().d();
         k4.h();
         if (fc.ao != null && fc.ap == 0 && !k4.N) {
            fc.ao.b();
            fc.ap = 1;
         }
      }
   }

   public static boolean b(cs[] var0) {
      int var1 = -1;

      for(int var2 = 0; var2 < 3; ++var2) {
         cs var3;
         if ((var3 = var0[var2]).o.equals("")) {
            var1 = var2;
         }
      }

      cs var4;
      if (!(var4 = var0[1]).o.equals((var4 = var0[2]).o)) {
         var1 = 3;
      }

      if ((var4 = var0[0]).o.equals((var4 = var0[1]).o)) {
         var1 = 4;
      }

      if (var1 != -1) {
         k4.c(hq.dG[var1]);
         return false;
      } else {
         return true;
      }
   }

   public static void b(byte[] var0, byte var1, byte var2, byte var3, Image var4, short[] var5, Vector var6, Vector var7) {
      ai = var5;
      k4.O = 0;
      A = var1;
      gx.Z = var6;
      gx.aa = var7;
      ByteArrayInputStream var11 = new ByteArrayInputStream(var0);
      gx.e = new short[var0.length];
      gx.f = var3;
      gx.g = (short)(var0.length / var3);
      gx.c = var4;
      if (var4 != null) {
         int[] var9 = new int[4];
         var4.getRGB(var9, 0, 2, 0, 0, 2, 2);
         gx.z = var9[0];
      }

      try {
         for(int var10 = 0; var10 < gx.e.length; ++var10) {
            gx.e[var10] = (short)var11.read();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      if (var2 != gx.G) {
         hx.b().e(var2);
      } else {
         k4.A.k();
      }
   }

   public final void z() {
      k4.b(hq.Q, new jt());
   }

   public static void A() {
      if (GameMidlet.k.E != null) {
         GameMidlet.k.E.removeAllElements();
      }

      gx.A = -1;
      gx.d = null;
      gx.j = 24;
      jp.b().d();
      fi.g().d();
      fi.g().h();
      fp.O = false;
      fj.G = null;
      fp.R = 0;
      fd.E = null;
      gx.n.removeAllElements();
      GameMidlet.k = new i3();
      GameMidlet.l = new h_();
      k4.G.removeAllElements();
      hu.b().f = null;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 0:
            h4.b().e(GameMidlet.k.f);
            k4.i();
            return;
         case 1:
            fg.g().q();
            return;
         case 2:
            hx.b().k(var2);
            return;
         case 3:
            h().b(GameMidlet.k, 0);
            return;
         case 4:
            h().b(GameMidlet.k, 1);
            return;
         case 5:
            gx.N = 300;
            gx.O = 100;
            hv.b().b(var2, -1);
            return;
      }
   }

   public static void g(int var0) {
      fg.g().J = (byte)var0;
      if (GameMidlet.k.Q != var0 && GameMidlet.k.Q != -1) {
         fg.g().q();
      } else {
         Vector var1;
         (var1 = new Vector()).addElement(new ag(hq.cG, 0));
         var1.addElement(new ag(hq.cH, 1));
         f1.d().b(var1, 2);
      }
   }

   public static void g(i3 var0) {
      (aj = new i3()).E = new Vector();
      aj.s = 0;
      aj.D = var0.D;
      aj.W = var0.W;

      for(int var1 = 0; var1 < var0.E.size(); ++var1) {
         gl var2;
         (var2 = new gl()).b = ((gl)var0.E.elementAt(var1)).b;
         aj.b(var2);
      }
   }

   private void b(i3 var1, int var2) {
      g(var1);
      byte[] var3 = null;
      byte[] var4 = new byte[2];
      if (I == 3) {
         var4[0] = 3;
         var4[1] = 8;
      }

      new StringBuffer(bb[47]).append(I);
      byte[] var5;
      Vector[] var6;
      String[] var7;
      switch(I) {
         case 1:
         case 6:
            var3 = new byte[]{10, 20};
            (var6 = new Vector[2])[0] = new Vector();
            var6[1] = new Vector();
            (var7 = new String[2])[0] = hq.aC;
            var7[1] = hq.aD;
            var4[0] = 1;
            var4[1] = 6;
            var5 = new byte[2];
            break;
         case 2:
         case 7:
            var3 = new byte[]{40, 50};
            (var6 = new Vector[2])[0] = new Vector();
            var6[1] = new Vector();
            (var7 = new String[2])[0] = hq.aF;
            var7[1] = hq.aE;
            var5 = new byte[2];
            var4[0] = 2;
            var4[1] = 7;
            break;
         case 3:
         case 4:
         case 5:
         default:
            (var6 = new Vector[1])[0] = new Vector();
            (var7 = new String[1])[0] = hq.cZ;
            var5 = new byte[1];
      }

      for(int var8 = 0; var8 < f5.e.length; ++var8) {
         if (f5.e[var8].a != -2) {
            jv var9;
            byte var10;
            if ((var9 = f5.e[var8]).a >= 0) {
               var10 = ((jw)f5.e[var9.a]).i;
            } else {
               var10 = ((jw)var9).i;
            }

            if (var9 != null && (var9.d[0] > 0 || var9.d[1] > 0) && (var1.D == var10 || var10 == 0) && (var4[0] == var9.f || var4[1] == var9.f) && var9.a > -2) {
               if (var3 == null) {
                  var10 = var5[0];
                  var6[0].addElement(new a9(this, hq.P, new hm(this, var9), var9, var10));
                  ++var5[0];
               } else {
                  for(int var12 = 0; var12 < var6.length; ++var12) {
                     if (var3[var12] == var9.e) {
                        byte var11 = var5[var12];
                        var6[var12].addElement(new as(this, hq.P, new f6(this, var9), var9, var11));
                        ++var5[var12];
                     }
                  }
               }
            }
         }
      }

      fb.g().d();
      fb.ad = true;
      fb.g().b(var7, var6, null);
      fb.L = var2;
      fb.g().l();
      k4.h();
      if (gx.b == 57 && k4.N) {
         (k4.H = new ew()).c(fb.z);
      }
   }

   public static void b(jv var0) {
      (aj = new i3()).s = 0;
      aj.E = new Vector();
      boolean var1 = false;

      for(int var2 = 0; var2 < GameMidlet.k.E.size(); ++var2) {
         gl var3;
         (var3 = new gl()).b = ((gl)GameMidlet.k.E.elementAt(var2)).b;
         if (f5.b(var3.b).e == var0.e) {
            var3.b = var0.b;
            var1 = true;
         }

         aj.b(var3);
      }

      if (!var1) {
         gl var4;
         (var4 = new gl()).b = var0.b;
         aj.b(var4);
         aj.i();
      }
   }

   public static void h(int var0) {
      c(f5.b((short)var0));
   }

   public static void c(jv var0) {
      k4.b(var0.d[0], var0.d[1], new bz(var0), new by(var0), null);
   }

   public static void b(short var0, String var1, int var2, int var3, int var4) {
      k4.c(var1);
      GameMidlet.k.b(var2);
      i3 var6 = GameMidlet.k;
      GameMidlet.k.A[2] = var3;
      GameMidlet.k.B = var4;
      jv var5;
      if ((var5 = f5.b(var0)).a != -2) {
         gl var7;
         if ((var7 = f5.b(var5.e, GameMidlet.k.E)) != null) {
            var7.b = var0;
         } else if (var5.e == -1 && GameMidlet.k.ah != -1) {
            GameMidlet.k.b(var0);
            h4.b().h(GameMidlet.k.f);
         } else {
            GameMidlet.k.b(new gl(var0));
            GameMidlet.k.i();
         }

         byte var9 = 11;
         i3 var8 = GameMidlet.k;
         GameMidlet.k.ac = (short)var9;
         if (var5.e == -1 && GameMidlet.k.ah == -1) {
            GameMidlet.k.k();
            h4.b().h(GameMidlet.k.f);
         }
      }

      GameMidlet.m = null;
   }

   public static void B() {
      hv.b().b(A, -1);
      I = -1;
   }

   public final void C() {
      this.a(3, -1);
   }

   public final void b(byte var1, Vector var2, Vector var3, Vector var4) {
      byte[] var5 = new byte[]{59, 60, 58, 104, 105, 101, 102};
      gx.Z = var3;
      gx.aa = var4;
      k4.A.f(var5[var1]);
      if (var3 != null) {
         gx.g();
      }

      for(int var7 = 0; var7 < var2.size(); ++var7) {
         ik var8;
         if ((var8 = (ik)var2.elementAt(var7)).d == 0) {
            i3 var9;
            ((i3)var8).l = (var9 = (i3)var8).a;
            var9.m = var9.b;
            var9.U = var9.s;
            var9.i();
            if (var9.f != GameMidlet.k.f) {
               c(var9);
               gx.c(var9);
            }
         } else if (var8.d == 5) {
            i2 var10;
            ((i2)var8).B = (var10 = (i2)var8).a;
            var10.C = var10.b;
            gx.n.addElement(var10);
         }
      }

      if (bq.j) {
         b(bq.i.b, bq.i.c, GameMidlet.k.s, GameMidlet.k.v);
      } else {
         ++GameMidlet.k.b;
         s();
      }

      c(GameMidlet.k.ac);
      if (k4.N && var5[var1] == 101) {
         ew var6;
         if ((var6 = k4.H = new ew()).K == null) {
            var6.K = hq.f();
         }

         k4.H.b(var6.K[ew.I]);
         ++ew.I;
      }
   }

   public static void i(int var0) {
      ak = var0;
      an = gx.b;
      h();
      s();
      hx.b().g(8);
      k4.i();
   }

   public final void f(int var1, int var2) {
      String[] var7 = bb;
      new StringBuffer(var7[20]).append(var1).append(var7[24]).append(var2);
      if (k4.u == fb.z) {
         fb.g().e();
      }

      k4.O = 1;
      al = var1;
      am = var2;
      V = true;
      this.Z = 0;

      for(int var3 = 0; var3 < R.size() - 1; ++var3) {
         cn var5 = (cn)R.elementAt(var3);

         for(int var4 = var3 + 1; var4 < R.size(); ++var4) {
            cn var6 = (cn)R.elementAt(var4);
            if (var5.f > var6.f) {
               R.setElementAt(var6, var3);
               R.setElementAt(var5, var4);
               var5 = var6;
            }
         }
      }

      for(int var10 = 0; var10 < gx.n.size() - 1; ++var10) {
         ik var15;
         if ((var15 = (ik)gx.n.elementAt(var10)).d == 0) {
            for(int var13 = var10 + 1; var13 < gx.n.size(); ++var13) {
               ik var18;
               if ((var18 = (ik)gx.n.elementAt(var13)).d == 0 && ((i3)var15).f > ((i3)var18).f) {
                  gx.n.setElementAt(var18, var10);
                  gx.n.setElementAt(var15, var13);
                  var15 = var18;
               }
            }
         }
      }

      for(int var11 = 0; var11 < gx.n.size(); ++var11) {
         ik var16;
         if ((var16 = (ik)gx.n.elementAt(var11)).d == 0) {
            i3 var19;
            (var19 = (i3)var16).G.removeAllElements();
            if (var19.f == var2) {
               var19.a = var19.l = 0;
               var19.b = var19.m = 8 * gx.j + gx.j / 2 - gx.j / 2;
               var19.p = 2;
               this.Z = 1;
               var19.i(2475, 20);
               var19.i(2476, 10);
               var19.i(300, 60);
               var19.i(302, 70);
               var19.i();
            } else if (var19.f == var1) {
               var19.a = var19.l = 0;
               var19.b = var19.m = 8 * gx.j + gx.j / 2 + gx.j / 2;
               var19.p = 2;
               this.Z = 1;
               var19.i(2477, 20);
               var19.i(2478, 10);
               var19.i();
            }
         }
      }

      i3 var20 = gx.l(var1);
      i3 var8 = gx.l(var2);
      gx.n.removeElement(var20);
      gx.n.removeElement(var8);
      int var14 = 0;

      for(int var9 = 0; var9 < gx.n.size(); ++var9) {
         Object var12;
         if (((ik)(var12 = (ik)gx.n.elementAt(var9))).d == 0 && ((it)(var12 = (i3)var12)).f != -100) {
            cn var17;
            k4.j = k4.l = (var17 = (cn)R.elementAt(var14 / 2)).b - cl.b().c + gx.j / 2;
            k4.k = k4.m = var17.c - cl.b().d + gx.j / 2 + var9 % 2 * (gx.j - 5);
            ++var14;
            ((it)var12).b(k4.j + cl.b().c, k4.k + cl.b().d);
         }
      }

      gx.n.addElement(var20);
      gx.n.addElement(var8);
      gx.b(gx.n);
      k4.h();
      var7 = bb;
      new StringBuffer(var7[2]).append(V).append(var7[18]).append(this.Z);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'Z');
      }

      return var10000;
   }

   private static String c(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 103;
               break;
            case 1:
               var10005 = 124;
               break;
            case 2:
               var10005 = 61;
               break;
            case 3:
               var10005 = 68;
               break;
            case 4:
               var10005 = 126;
               break;
            case 5:
               var10005 = 101;
               break;
            default:
               var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
