import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fi extends e8 {
   public static fi z;
   public cs A = new cs();
   public cs B = new cs();
   public cs C = new cs();
   public cs D = new cs();
   private int E;
   private int F;
   private int G;
   private ag H;
   ag I;
   private ag J;
   ag K;
   boolean L = true;
   ag M;
   public boolean N = false;
   String O;
   public int P;
   public int Q;
   public int R;
   public int S;
   public int T;
   public int U;
   public int V;
   public int W;
   public long X;
   public static int Y;
   public static String Z;
   public static boolean aa;
   public static boolean ab;
   public static boolean ac;
   private String[] ad;
   public int ae;
   public int af;
   private byte ag;
   String ah;
   String ai;
   private boolean aj;
   private static final String[] bb;

   static {
      String[] var5 = new String[36];
      int var3 = 0;
      String var2 = "\u0005k\u00143f`\u0012\b'uǙ5!dầ\r\u0005V3Mr9\b\u0005k\u0019(`{/2\t'uǙ5!}\u0015ớmF\fi\f,;&S\u0013|\brul\u001d\tr\u001a5/j\u0013\t\"\u00112gfA\u0007u\u001d?j|\f\u0000|\f9'n\u001d\txEd'\u007f\u0019\u0016n\u00113o4NJ(Vd'y\u000e\u000bk\u00118d{A\u0003D=X\u00120u\u00921!}\u009c\r=\u00134nẪ\u0012Ds\u0098%\u000b\frỏ?!l\u0011\u0005t\u0014f\u0010\u000bs43f`\u0012*x\u000f\u001b`d\u0019^=\t'uǙ5!}\u0015ớm)\fi\f,;&S\u0013|\brul\u001d\tr\u001a5/j\u0013\t2\u001e=pzR\u0014u\bcq{\u0013\u0012t\u001c9s4\u0005V3Mr9\u0005(\\(\u000eN\u0004\u0010x\u0014f\u00880ý\u0011|ja\u0013ệsX?Ủh\\\u0006Ẽ\u0016|baǌ\u0005=ũǬỢj\\ŵĞ\u0016;!b\u0091Dq\u0011¶o)\u0017ớiX*Ớ`\\\tỄ\f|ué\u0015Dv\u00103Ảg\\0x\u00191/)>ễsX/Ẽ)\u0011ềiX(á`\\\u000fu\u0017ỿo)ŭ\u0005s\u001f|baǝ\r=\u0016ợt)\b\rẢ\b|uỬ\u001fJ=:ỽo)\u001f\u0097=\u0015)Ốg\\\u0010tệ,!}ẙ\u0007=G\u0006KqV,on \fi\f,;&S\u0010x\u00191nk\u0015J~\u00171.m\u0015\u0001h\u00134nh\u0012Ju\f1\u0002H=\u00880ý\u0011|ja\u0013ệsX?Ủh\\\u0006Ẽ\u0016|baǌ\u0005=ũǬỢj\\ŵĞ\u0016;!b\u0091Dq\u0011¶o)\u0017ớiX*Ớ`\\\tỄ\f|ué\u0015Dv\u00103Ảg\\0x\u00191/)>ễsX/Ẽ)\u0011ềiX(á`\\\u000fu\u0017ỿo)ŭ\u0005s\u001f|baǝ\r=\u0016ợt)\b\rẢ\b|uỬ\u001fJ=:ỽo)\u001f\u0097=\u0015)Ốg\\\u0010tệ,!}ẙ\u0007=G\u0002H=\u0004D=X|\bU$Hl7?MT\b0ä\u0001|baằ\n\u0004D=X|\u0007B|\u001f9o}A\u000bKq\u001f%dh\u0014Jm\u0016;\u000e\u0007q\u0011?jG\u0019\u0013Z\u00191d3\\\u0007\br\u001f5o3\\\n7ỌX8h)ŭẽs\u001f\rŴỈ\u0011|ué\u0015Dv\u00103Ảg\b'uǙ5!dầ\r\u0010'u\r%Ểg\\\u0010ý\u0011|ja\u0013ệs\u0092&Ẽ\u0016|oã\u0012DČ\u0011ẝo)\u001f\fð\u00164!q\u009d\u0007=\u000bẍ!m\u0015DČạ2f)\u0014\u000bẪ\u001b|dd\u001d\rqV|Ja\u0015Dl\r¶o)\u0011ỉiX7iẠ\tH=\u001aỽo)\u000fộ=\u001c¥on\\\nîXōỂ)\u0010ềdX0Ạ`RD_ộ2!j\u008fD~\u0010ỳb)\u001f\fẲ\u0016|Đê\\ŵtẹ2!zậDy\u0011|ĐỐ\u0012\u0003=W|dd\u001d\rqXōûg\u001bD~\u0010Ǭ`6";
      int var4 = "\u0005k\u00143f`\u0012\b'uǙ5!dầ\r\u0005V3Mr9\b\u0005k\u0019(`{/2\t'uǙ5!}\u0015ớmF\fi\f,;&S\u0013|\brul\u001d\tr\u001a5/j\u0013\t\"\u00112gfA\u0007u\u001d?j|\f\u0000|\f9'n\u001d\txEd'\u007f\u0019\u0016n\u00113o4NJ(Vd'y\u000e\u000bk\u00118d{A\u0003D=X\u00120u\u00921!}\u009c\r=\u00134nẪ\u0012Ds\u0098%\u000b\frỏ?!l\u0011\u0005t\u0014f\u0010\u000bs43f`\u0012*x\u000f\u001b`d\u0019^=\t'uǙ5!}\u0015ớm)\fi\f,;&S\u0013|\brul\u001d\tr\u001a5/j\u0013\t2\u001e=pzR\u0014u\bcq{\u0013\u0012t\u001c9s4\u0005V3Mr9\u0005(\\(\u000eN\u0004\u0010x\u0014f\u00880ý\u0011|ja\u0013ệsX?Ủh\\\u0006Ẽ\u0016|baǌ\u0005=ũǬỢj\\ŵĞ\u0016;!b\u0091Dq\u0011¶o)\u0017ớiX*Ớ`\\\tỄ\f|ué\u0015Dv\u00103Ảg\\0x\u00191/)>ễsX/Ẽ)\u0011ềiX(á`\\\u000fu\u0017ỿo)ŭ\u0005s\u001f|baǝ\r=\u0016ợt)\b\rẢ\b|uỬ\u001fJ=:ỽo)\u001f\u0097=\u0015)Ốg\\\u0010tệ,!}ẙ\u0007=G\u0006KqV,on \fi\f,;&S\u0010x\u00191nk\u0015J~\u00171.m\u0015\u0001h\u00134nh\u0012Ju\f1\u0002H=\u00880ý\u0011|ja\u0013ệsX?Ủh\\\u0006Ẽ\u0016|baǌ\u0005=ũǬỢj\\ŵĞ\u0016;!b\u0091Dq\u0011¶o)\u0017ớiX*Ớ`\\\tỄ\f|ué\u0015Dv\u00103Ảg\\0x\u00191/)>ễsX/Ẽ)\u0011ềiX(á`\\\u000fu\u0017ỿo)ŭ\u0005s\u001f|baǝ\r=\u0016ợt)\b\rẢ\b|uỬ\u001fJ=:ỽo)\u001f\u0097=\u0015)Ốg\\\u0010tệ,!}ẙ\u0007=G\u0002H=\u0004D=X|\bU$Hl7?MT\b0ä\u0001|baằ\n\u0004D=X|\u0007B|\u001f9o}A\u000bKq\u001f%dh\u0014Jm\u0016;\u000e\u0007q\u0011?jG\u0019\u0013Z\u00191d3\\\u0007\br\u001f5o3\\\n7ỌX8h)ŭẽs\u001f\rŴỈ\u0011|ué\u0015Dv\u00103Ảg\b'uǙ5!dầ\r\u0010'u\r%Ểg\\\u0010ý\u0011|ja\u0013ệs\u0092&Ẽ\u0016|oã\u0012DČ\u0011ẝo)\u001f\fð\u00164!q\u009d\u0007=\u000bẍ!m\u0015DČạ2f)\u0014\u000bẪ\u001b|dd\u001d\rqV|Ja\u0015Dl\r¶o)\u0011ỉiX7iẠ\tH=\u001aỽo)\u000fộ=\u001c¥on\\\nîXōỂ)\u0010ềdX0Ạ`RD_ộ2!j\u008fD~\u0010ỳb)\u001f\fẲ\u0016|Đê\\ŵtẹ2!zậDy\u0011|ĐỐ\u0012\u0003=W|dd\u001d\rqXōûg\u001bD~\u0010Ǭ`6"
         .length();
      char var1 = 7;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     bb = var5;
                     Y = 0;
                     aa = false;
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

                  var2 = ",r\f0hg\u0019^=\rŴỈ\u0011|ué\u0015Dv\u00103Ảg";
                  var4 = ",r\f0hg\u0019^=\rŴỈ\u0011|ué\u0015Dv\u00103Ảg".length();
                  var1 = '\t';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fi g() {
      if (z == null) {
         z = new fi();
      }

      return z;
   }

   public final void e() {
      k4.c(hq.Q, 54);
   }

   public final void d() {
      this.a();
      super.d();
      k4.h();
      if (k4.M) {
         this.ag = 0;
      }

      ab = true;
      super.f = this.K;
      if (this.ah.equals("")) {
         cs var1 = this.A;
         if (this.A.o.equals("")) {
            String[] var7 = new String[2];
            String[] var6 = bb;
            var7[0] = var6[1];
            var7[1] = var6[30];
            this.ad = var7;
            return;
         }
      }

      String[] var10001 = new String[3];
      String[] var2 = bb;
      StringBuffer var10004 = new StringBuffer(var2[4]);
      cs var3 = this.A;
      String var8;
      if (!this.A.o.equals("")) {
         StringBuffer var10005 = new StringBuffer(var2[20]);
         var3 = this.A;
         var8 = var10005.append(this.A.o).toString();
      } else {
         var8 = "";
      }

      var10001[0] = var10004.append(var8).toString();
      var2 = bb;
      var10001[1] = var2[1];
      var10001[2] = var2[30];
      this.ad = var10001;
   }

   public final void h() {
      this.X = System.currentTimeMillis();
      bp.c(hq.ax);

      try {
         if (GameMidlet.g == 6) {
            String[] var2 = bb;
            e8.o = Image.createImage(var2[26]);
         } else {
            e8.o = Image.createImage(hq.b() + bb[16]);
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      this.B.b();
      this.F = -50;
      k4.A.f(26);
      GameMidlet.k.a = GameMidlet.k.l = gx.f * 24 / 2 + 30;
      cl.b().c = cl.b().e = 200;
      this.A.b(true);
      this.B.b(false);
      this.E = 0;
      this.A.b(true);
   }

   public final void a() {
      this.M = new ag(hq.d, 0);
      this.J = new ag(hq.cU, 3);
      this.I = new ag(hq.P, 1);
      this.H = new ag(hq.bq, 2);
      this.K = new ag(hq.P, 104);
      super.e = this.M;
   }

   public fi() {
      String[] var3 = bb;
      this.O = var3[22];
      this.X = 0L;
      this.ad = new String[]{var3[1], var3[4], var3[30]};
      this.ah = "";
      this.ai = "";
      this.i();
      this.A.b(true);
      byte var2 = 0;
      cs var1 = this.A;
      this.A.z = var2;
      var2 = 2;
      var1 = this.B;
      this.B.z = var2;
      var2 = 2;
      var1 = this.C;
      this.C.z = var2;
      var2 = 0;
      var1 = this.D;
      this.D.z = var2;
      this.D.H = var3[23];
      this.E = 0;
      new b2();
      new b2();
      if (b2.c(b2.f) == null) {
         f5.f();
      }
   }

   public final void i() {
      if (k4.p > 200) {
         this.G = k4.r - 80;
      } else {
         this.G = k4.r - 65;
      }

      this.F = -50;
      this.V = k4.o - 30;
      if (this.V < 70) {
         this.V = 70;
      }

      if (this.V > 99) {
         this.V = 99;
      }

      this.W = (k4.o - this.V >> 1) + 29;
      if (k4.o <= 128) {
         this.V = 80;
         this.W = (k4.o - this.V >> 1) + 20;
      }

      this.W -= (ev.a - 1) * 40;
      k4.aa.b(this);
      this.G = this.Q / 2;
      this.F = this.G;
      cl.b().r = GameMidlet.k;
      cl.b().e();
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 0:
            this.N = true;
            k4.aa.b(this);
            return;
         case 1:
            this.N = false;
            k4.aa.b(this);
            return;
         case 2:
            k4.c(hq.Q, 54);
            return;
         case 3:
            k4.b(hq.cV, 55, null);
            return;
         case 4:
            k4.x.b(hq.br, 100, 3);
            return;
         case 5:
            fa.g().d();
            return;
         case 6:
            String[] var6 = bb;
            GameMidlet.c(var6[11] + GameMidlet.g);
            return;
         case 7:
            String[] var3 = bb;
            GameMidlet.c(var3[5] + GameMidlet.g + var3[25] + GameMidlet.h);
            return;
         case 8:
            if (!this.O.equals("")) {
               GameMidlet.c(bb[14] + this.O);
               return;
            }

            if (!jp.b().g) {
               k4.d(hq.N);
               k4.d();
            } else {
               k4.i();
            }

            hx.b().b((byte)5, null);
            return;
         case 9:
            k4.c(hq.bt + hq.bs);
            f5.b();
            return;
         case 10:
            cs var4 = this.A;
            String var10000 = this.A.o.toLowerCase();
            cs var5 = this.B;
            ke.b(var10000, this.B.o);
            return;
         case 11:
            return;
      }
   }

   private void j() {
      if (!this.L) {
         this.L = true;
         this.H.b = hq.bv;
      } else {
         this.L = false;
         this.H.b = hq.bq;
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            Vector var7 = new Vector();
            ag var8 = new ag(hq.y, 2);
            cs var17 = this.A;
            if (!this.A.o.equals("")) {
               var17 = this.B;
               if (!this.B.o.equals("")) {
                  String[] var22 = bb;
                  var7.addElement(new ag(var22[7], 10));
               }
            }

            String[] var23 = bb;
            var7.addElement(new ag(var23[32], new ke()));
            var7.addElement(new ag(hq.ac, 5));
            var7.addElement(new ag(hq.bs, 9));
            var7.addElement(var8);
            f1.d().b(var7, 0);
            return;
         case 1:
            ab = true;
            super.e = this.M;
            super.f = this.K;
            this.ag = 0;
            String[] var10001 = new String[3];
            String[] var20 = bb;
            StringBuffer var10004 = new StringBuffer(var20[10]);
            cs var15 = this.A;
            String var24;
            if (!this.A.o.equals("")) {
               StringBuffer var10005 = new StringBuffer(var20[18]);
               var15 = this.A;
               var24 = var10005.append(this.A.o).toString();
            } else {
               var24 = "";
            }

            var10001[0] = var10004.append(var24).toString();
            var20 = bb;
            var10001[1] = var20[31];
            var10001[2] = var20[35];
            this.ad = var10001;
            return;
         case 2:
            this.j();
            return;
         case 3:
            cs var9 = this.A;
            if (this.A.o.equals("")) {
               k4.c(hq.dE[0]);
               return;
            } else {
               var9 = this.B;
               if (this.B.o.equals("")) {
                  k4.c(hq.dE[1]);
                  return;
               } else {
                  var9 = this.C;
                  if (this.C.o.equals("")) {
                     k4.c(hq.dE[2]);
                     return;
                  } else {
                     var9 = this.B;
                     var9 = this.C;
                     if (!this.B.o.equals(this.C.o)) {
                        k4.c(hq.dE[3]);
                        return;
                     } else {
                        k4.h();
                        this.X = System.currentTimeMillis();
                        var9 = this.D;
                        if (this.D.o.equals("")) {
                           l();
                           return;
                        }

                        String[] var19 = bb;
                        k4.c(var19[33], 102);
                        return;
                     }
                  }
               }
            }
         case 50:
            k4.c(hq.bu);
            return;
         case 51:
            this.k();
            return;
         case 52:
            return;
         case 53:
            String[] var4 = bb;
            GameMidlet.c(var4[17]);
            return;
         case 54:
            GameMidlet.b();
            return;
         case 55:
            aa = false;
            this.p();
            f5.c(bb[3]);
            GameMidlet.b();
            return;
         case 100:
            e1 var3 = k4.x;
            cs var5 = k4.x.o;
            String var6 = k4.x.o.o;
            if (k4.x.o.o.equals("")) {
               return;
            }

            new j2(var6).b();
            return;
         case 101:
            this.k();
            return;
         case 102:
            l();
            return;
         case 103:
            return;
         case 104:
            this.n();
      }
   }

   private void k() {
      k4.i();
      k4.d();
      hx var10000 = hx.b();
      cs var1 = this.A;
      String var10001 = this.A.o.toLowerCase();
      var1 = this.B;
      String var10002 = this.B.o.toLowerCase();
      var1 = this.D;
      var10000.d(var10001, var10002, this.D.o);
      this.N = false;
      super.f = this.I;
      k4.aa.b(this);
   }

   private static void l() {
      Vector var0;
      (var0 = new Vector()).addElement(new ag(hq.f, 51));
      var0.addElement(new ag(hq.bw, 52));
      var0.addElement(new ag(hq.bx, 53));
      k4.b(hq.by, var0);
   }

   public final void b() {
      if ((System.currentTimeMillis() - this.X) / 1000L < -5L) {
         GameMidlet.j.notifyDestroyed();
      }

      if (!ab && this == k4.u && k4.w == null && !ab) {
         this.A.f();
         this.B.f();
         if (this.N) {
            this.C.f();
            this.D.f();
         }

         cs var1 = this.A;
         if (this.A.f) {
            super.g = this.A.b();
         } else {
            var1 = this.B;
            if (this.B.f) {
               super.g = this.B.b();
            } else {
               var1 = this.C;
               if (this.C.f) {
                  super.g = this.C.b();
               }
            }
         }
      } else {
         super.g = null;
      }

      if (this.G != this.F) {
         this.F += this.G - this.F >> 1;
      }

      if (this.N) {
         super.f = this.J;
      } else if (this.E == 2) {
         super.g = this.H;
      }

      k4.A.c();
   }

   public final void a(int var1) {
      cs var2 = this.A;
      if (this.A.f) {
         this.A.f(var1);
      } else {
         var2 = this.B;
         if (this.B.f) {
            this.B.f(var1);
         } else {
            var2 = this.C;
            if (this.C.f) {
               this.C.f(var1);
            } else {
               var2 = this.D;
               if (this.D.f) {
                  this.D.f(var1);
               }
            }
         }
      }

      super.a(var1);
   }

   public final void b(Graphics var1) {
      this.a(var1);
      super.b(var1);
      k4.b(var1);
   }

   public final void a(Graphics var1) {
      k4.A.c(var1);
      k4.A.e(var1);
      k4.d(var1);
      if (ab) {
         Graphics var3 = var1;
         fi var4 = this;
         k4.aa.b(var1, this.P, this.Q, this.R, this.S, 0);
         var1.translate(this.P, this.Q + this.af);
         if (this.ag != -1) {
            k4.aa.c(var1, 5 * ev.a, this.ag * this.ae, this.R - 10 * ev.a, this.ae);
         }

         for(int var2 = 0; var2 < var4.ad.length; ++var2) {
            k4.S.b(var3, var4.ad[var2], var4.R / 2, var2 * var4.ae + var4.ae / 2 - k4.S.b() / 2, 2);
         }
      } else if (k4.y == null && this == k4.u) {
         k4.aa.b(var1, this.P, this.Q, this.R, this.S, 0);
         var1.setClip(this.P + 4, this.Q + 4, this.R - 8, this.S - 8);
         if (!this.O.equals("") && fa.g().D[4] == 0) {
            String[] var5 = bb;
            k4.aa.b(var1, var5[34] + this.O, this.P + this.R - 8, this.Q + this.S - ev.j - 4, 1);
         }

         this.A.b(var1);
         var1.setClip(this.P + 4, this.Q + 4, this.R - 8, this.S - 8);
         int var6;
         if ((var6 = k4.S.b(hq.bz + ":")) < this.A.b - this.P) {
            var6 = (this.A.b - this.P - var6) / 2 + ev.b;
         } else {
            var6 = this.A.b - var6 - 5;
         }

         k4.aa.b(var1, hq.bz, this.P + var6, this.A.c + this.A.e / 2 - ev.j / 2, 0);
         k4.aa.b(var1, hq.bA + ":", this.P + var6, this.B.c + this.A.e / 2 - ev.j / 2, 0);
         if (!this.N) {
            k4.aa.b(var1, this.T, this.U, this.E, this.L);
         } else {
            k4.aa.b(var1, hq.cf, this.P + var6, this.C.c + this.A.e / 2 - ev.j, 0);
            k4.aa.b(var1, hq.bA + ":", this.P + var6, this.C.c + this.A.e / 2, 0);
            String[] var8 = bb;
            k4.aa.b(var1, var8[29], this.P + var6, this.D.c + this.A.e / 2 - ev.j, 0);
            k4.aa.b(var1, var8[8], this.P + var6, this.D.c + this.A.e / 2, 0);
            this.C.b(var1);
            this.D.b(var1);
         }

         this.B.b(var1);
      }

      k4.d(var1);
      var1.drawImage(e8.o, k4.q, this.F, 3);
   }

   public final void c() {
      if (ab) {
         if (k4.d(2)) {
            --this.ag;
            if (this.ag < 0) {
               this.ag = (byte)(this.ad.length - 1);
            }
         } else if (k4.d(8)) {
            ++this.ag;
            if (this.ag >= this.ad.length) {
               this.ag = 0;
            }
         }

         if (k4.i) {
            for(int var1 = 0; var1 < this.ad.length; ++var1) {
               if (k4.e(this.P, this.Q + this.af + var1 * this.ae, this.R, this.ae)) {
                  this.ag = (byte)var1;
                  k4.i = false;
                  this.aj = true;
                  break;
               }
            }
         }

         if (this.aj) {
            if (k4.g && !k4.e(this.P, this.Q + this.af + this.ag * this.ae, this.R, this.ae)) {
               this.ag = -1;
            }

            if (k4.h) {
               k4.h = false;
               this.aj = false;
               if (this.ag != -1) {
                  this.n();
               }
            }
         }

         super.c();
      } else {
         if (k4.h && k4.d(0, 0, k4.o, k4.p) && k4.d(this.T - 10, this.U, 70, e8.n * ev.a + 10)) {
            this.j();
         }

         if (k4.d[2]) {
            if (this.E > 0) {
               --this.E;
            } else if (this.N) {
               this.E = 3;
            } else {
               this.E = 2;
            }
         }

         if (k4.d[8]) {
            if (this.E < (this.N ? 3 : 2)) {
               ++this.E;
            } else {
               this.E = 0;
            }
         }

         if (k4.d[2] || k4.d[8]) {
            k4.e();
            if (this.E == 0) {
               this.A.b(true);
               this.B.b(false);
               this.C.b(false);
               this.D.b(false);
            } else if (this.E == 1) {
               this.A.b(false);
               this.B.b(true);
               this.C.b(false);
               this.D.b(false);
            } else if (this.E == 2) {
               this.A.b(false);
               this.B.b(false);
               super.g = null;
               if (this.N) {
                  this.C.b(true);
                  this.D.b(false);
               }
            } else {
               this.A.b(false);
               this.B.b(false);
               this.C.b(false);
               this.D.b(true);
            }
         }

         super.c();
      }
   }

   private void n() {
      String[] var3 = bb;
      new StringBuffer(var3[27]).append(ac).append(var3[21]).append(this.ag);
      switch(this.ag) {
         case 0:
            if (this.ad.length == 2) {
               new ie().b();
               return;
            } else if (ac) {
               ff.g().d();
               return;
            } else {
               cs var5 = this.A;
               String var4 = this.A.o.toLowerCase().trim();
               var5 = this.B;
               String var7 = this.B.o;
               if (!var4.equals("")) {
                  if (var7.equals("")) {
                     this.E = 1;
                     this.A.b(false);
                     this.B.b(true);
                     return;
                  }

                  ff.g().d();
               }

               return;
            }
         case 1:
            if (this.ad.length != 2) {
               ie var1 = new ie();
               if (!this.ah.equals("")) {
                  cs var2 = this.A;
                  if (this.A.o.equals("")) {
                     k4.b(bb[19], var1);
                     return;
                  }
               }

               var1.b();
               return;
            }
         case 2:
            this.o();
      }
   }

   private void o() {
      cf var1 = new cf(this);
      if (!this.ah.equals("")) {
         cs var2 = this.A;
         if (this.A.o.equals("")) {
            k4.b(bb[15], var1);
            return;
         }
      }

      var1.b();
   }

   public final void p() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(var1);

      try {
         String[] var4 = bb;
         var2.writeUTF(var4[13]);
         var2.writeByte(super.t);
         var2.writeUTF(this.O);
         var2.writeUTF(this.ah);
         var2.writeUTF(this.ai);
         if (this.L) {
            var2.writeUTF(g().A.o);
            var2.writeUTF(g().B.o);
         }

         var2.writeInt(Y);
         var2.writeBoolean(aa);
         var2.writeBoolean(ac);
         new b2();
         b2.b(bb[0], var1.toByteArray());
         var2.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public final void b(String var1) {
      this.O = var1;
   }

   public final void q() {
      k4.d();
      hx.b().i(g().O.hashCode());
      String[] var2 = bb;
      new StringBuffer(var2[28]).append(ab).append(var2[24]).append(this.ag);
      if (!ab || (this.ag != 0 || this.ad.length != 2) && (this.ag != 1 || this.ad.length != 3)) {
         cs var3 = this.A;
         if (this.A.o.equals("")) {
            hx var7 = hx.b();
            var2 = bb;
            var7.b(this.ah, this.ai, var2[12]);
            ac = true;
         } else {
            ac = false;
            this.ah = "";
            this.ai = "";
            hx var10000 = hx.b();
            var3 = this.A;
            String var10001 = this.A.o.toLowerCase();
            var3 = this.B;
            var10000.b(var10001, this.B.o, bb[2]);
         }
      } else {
         hx var1 = hx.b();
         var1.a((byte)-12);
         var1.a();
      }
   }

   public final void b(String var1, String var2) {
      String[] var3 = bb;
      new StringBuffer(var3[9]).append(var1).append(var3[6]).append(var2);
      this.ah = var1;
      this.ai = var2;
      this.A.b("");
      this.B.b("");
      ac = true;
      ab = false;
      this.q();
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '|');
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
               var10005 = 100;
               break;
            case 1:
               var10005 = 29;
               break;
            case 2:
               var10005 = 120;
               break;
            case 3:
               var10005 = 92;
               break;
            case 4:
               var10005 = 1;
               break;
            case 5:
               var10005 = 9;
               break;
            default:
               var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
