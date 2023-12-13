import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fm extends e8 {
   private Vector z = new Vector();
   private e8 A;
   public dc B;
   public int C;
   public static cs D;
   public static fm E;
   public static int F;
   private static int G;
   public ag H;
   private boolean I = true;
   private static final String[] J;

   public static fm g() {
      if (E == null) {
         E = new fm();
      }

      return E;
   }

   public final void b(e8 var1) {
      this.A = var1;
      e8.u = 0;
      g().C = g().z.size() - 1;
      this.h();
      ib.b().n = this.C;
      g().j();
      this.I = this.d(this.C).i;
      this.i();
      ib.b().b(this.d(this.C).c, this.C);
      super.d();
   }

   private void h() {
      if (fp.O && k4.ah == 0) {
         ib var3 = ib.b();
         int var4 = k4.o - (F << 1);
         var3.b(this.d(this.C).c, var4, k4.s - k4.ab - (F << 1), this.z.size());
      } else {
         ib var10000 = ib.b();
         int var10002 = k4.o - (F << 1);
         int var10003 = k4.p - k4.al - k4.ab - 10;
         var10000.b(this.d(this.C).c, var10002, var10003 + (fp.O && this.A != ft.z ? -20 : 0), this.z.size());
         ib var1 = ib.b();
         int var2 = 10 + k4.al;
         var1.i = var2;
         G = var2;
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 2:
            this.A.d();
            this.A = null;
            return;
         case 10:
            this.b(this.d(this.C));
            return;
      }
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 1:
            hv var10000 = hv.b();
            cs var11 = D;
            var10000.b(D.o);
            D.b("");
            return;
         case 2:
            this.A.d();
            this.A = null;
            return;
         case 3:
            cs var7 = D;
            if (!D.o.equals("")) {
               dc var6 = this.d(this.C);
               cs var8 = D;
               String var9 = D.o;
               String[] var4 = J;
               if (D.o.indexOf(var4[6]) != -1) {
                  var6.b(String.valueOf(GameMidlet.k.g) + var4[0] + var9);
                  String var10 = String.valueOf(var9) + " ";

                  for(int var3 = 0; var3 < var6.f.size(); ++var3) {
                     var10 = String.valueOf(var10) + (String)var6.f.elementAt(var3);
                  }

                  hx.b().c(var6.h, var10);
                  D.b("");
                  return;
               }

               hx.b().b(var6.h, var9);
               D.b("");
               StringBuffer var10001 = new StringBuffer("(").append(k());
               var4 = J;
               var6.b(var10001.append(var4[4]).append(String.valueOf(GameMidlet.k.g)).append(var4[5]).append(var9).toString());
            }

            return;
         case 4:
            this.A.d();
            this.A = null;
            return;
         case 5:
            Vector var5 = new Vector();
            if (this.d(this.C) != this.B) {
               var5.addElement(new ag(hq.bT, 10));
            }

            var5.addElement(new ag(hq.e, 2));
            f1.d().b(var5, 0);
            return;
         case 6:
         case 7:
         case 8:
         case 9:
         default:
            return;
         case 10:
            this.b(this.d(this.C));
      }
   }

   public final void a() {
      if (k4.ah == 0) {
         if (fp.O) {
            super.e = new ag(hq.e, 4);
         } else {
            super.e = new ag(hq.d, 5);
         }
      } else if (this.d(this.C) == this.B) {
         super.e = new ag(hq.e, 4);
      } else {
         super.e = new ag(hq.bT, 10);
      }

      this.B = new dc(hq.bS, -1, null, null, false);
   }

   public fm() {
      this.H = new ag(hq.bT, 10);
      if (k4.ah == 0) {
         G = 10;
         F = 10;
      } else {
         F = G = ev.c;
      }

      (D = new cs()).b = F + 5;
      this.i();
      D.b(true);
      cs var1 = D;
      D.t = 40;
      this.a();
      dc var2 = this.B;
      this.B.j += 20;
      this.z.addElement(this.B);
      this.C = 0;
      this.j();
   }

   public final void i() {
      if (k4.u == this) {
         this.h();
         this.d(this.C).c();
      }

      D.c = ib.b().i + ib.b().f - D.e - 6;
      D.d = k4.o - (ib.b().h << 1) - 10;
   }

   private void j() {
      this.d(this.C).b = false;
      super.f = this.d(this.C).d;
      super.g = this.d(this.C).e;
      if (super.f != null) {
         D.b(this.d(this.C).g);
      }

      this.I = this.d(this.C).i;
      this.d(this.C).c();
      if (k4.u == this) {
         ib.b().b(this.d(this.C).c, this.C);
      }
   }

   public final void b(int var1, String var2, String var3) {
      dc var4;
      if ((var4 = this.c(var1)) == null) {
         String[] var5 = J;
         ag var10004 = var2.equals(var5[2]) ? null : new ag(hq.a1, 3);
         var5 = J;
         ag var10005 = var2.equals(var5[1]) ? null : D.b();
         var5 = J;
         var4 = new dc(var2, var1, var10004, var10005, !var2.equals(var5[1]));
         this.c(var4);
      } else {
         var4.b = true;
         if (k4.u == this) {
            this.l();
         }
      }

      var4.b("(" + k() + J[7] + var2, var3);
   }

   public static String k() {
      Calendar var0 = Calendar.getInstance();
      TimeZone var1 = TimeZone.getTimeZone(J[3]);
      var0.setTimeZone(var1);
      return var0.get(11) + ":" + var0.get(12);
   }

   private dc c(int var1) {
      for(int var2 = 0; var2 < this.z.size(); ++var2) {
         if (((dc)this.z.elementAt(var2)).h == var1) {
            return (dc)this.z.elementAt(var2);
         }
      }

      return null;
   }

   public final dc d(int var1) {
      return var1 < this.z.size() ? (dc)this.z.elementAt(var1) : null;
   }

   public final void b(Graphics var1) {
      this.A.a(var1);
      k4.d(var1);
      ib.b().b(var1);
      var1.translate(F, G + ib.t + ev.b);
      dc var10000 = this.d(this.C);
      Graphics var3 = var1;
      dc var2 = var10000;
      gt.b().b(var1, k4.o - 50);
      var1.setClip(0, 0, k4.o - (F << 1), var2.j + 4);
      var1.translate(0, -dc.m);
      int var4;
      if ((var4 = dc.m / dc.k) < 0) {
         var4 = 0;
      }

      int var5;
      if ((var5 = var4 + var2.j / dc.k + 1) > var2.f.size()) {
         var5 = var2.f.size();
      }

      while(var4 < var5) {
         String var6 = (String)var2.f.elementAt(var4);
         k4.V.b(var3, var6, 10 * ev.a, var4 * dc.k + 5, 0);
         ++var4;
      }

      if (this.I) {
         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
         D.b(var1);
      }

      if (fp.O) {
         fp.b(var1, super.e, super.f, super.g);
      } else {
         super.b(var1);
      }
   }

   private void e(int var1) {
      dc var10000 = this.d(this.C);
      cs var2 = D;
      var10000.g = D.o;
      this.C += var1;
      if (this.C < 0) {
         this.C = this.z.size() - 1;
      }

      if (this.C >= this.z.size()) {
         this.C = 0;
      }

      this.j();
      this.d(this.C).b();
      dc.l = dc.p;
   }

   public final void a(int var1) {
      if (var1 == -3) {
         this.e(-1);
      }

      if (var1 == -4) {
         this.e(1);
      }

      if (this.I) {
         int var2 = var1;
         if (i.d == 1 && var1 == 432) {
            var2 = 119;
         }

         D.f(var2);
         if (i.d > 0) {
            cs var3;
            (var3 = D).b(i.b(D.o));
         }
      }

      super.a(var1);
   }

   public final void c() {
      if (fp.O && k4.ah != 0) {
         k4.aa.b(super.e, super.f, super.g);
      } else {
         super.c();
      }

      int var1;
      if (k4.i && (var1 = ib.b().e()) != false) {
         this.e(var1);
         k4.i = false;
      }

      dc var5;
      ++(var5 = this.d(this.C)).u;
      boolean var2 = false;
      if (k4.f[2]) {
         var2 = true;
         dc.l -= dc.k;
      } else if (k4.f[8]) {
         dc.l += dc.k;
         var2 = true;
      }

      if (k4.i) {
         k4.i = false;
         var5.q = dc.m;
         var5.t = true;
         var5.r = 0;
      }

      if (var5.t) {
         if (k4.g) {
            if (k4.n % 3 == 0) {
               var5.s = k4.k;
               var5.v = var5.u;
            }

            var5.r = 0;
            if ((dc.l = var5.q + k4.l()) < 0 || dc.l > dc.p) {
               dc.l = var5.q + k4.l() / 2;
            }

            dc.m = dc.l;
         }

         if (k4.h) {
            int var3 = (int)(var5.u - var5.v);
            int var4;
            if (b2.f(var4 = var5.s - k4.k) > 40 && var3 < 10 && dc.l > 0 && dc.l < dc.p) {
               var5.r = var4 / var3 * 10;
            }

            var5.v = -1L;
         }
      }

      if (var2) {
         if (dc.l < 0) {
            dc.l = 0;
         }

         if (dc.l > dc.p) {
            dc.l = dc.p;
         }
      }

      if (var5.r != 0) {
         if (dc.m < 0 || dc.m > dc.p) {
            var5.r -= var5.r / 4;
            dc.m += var5.r / 20;
            if (var5.r / 10 <= 1) {
               var5.r = 0;
            }
         }

         if (dc.m < 0) {
            if (dc.m < -var5.j / 2) {
               dc.m = -var5.j / 2;
               dc.l = 0;
               var5.r = 0;
            }
         } else if (dc.m > dc.p) {
            if (dc.m < dc.p + var5.j / 2) {
               dc.m = dc.p + var5.j / 2;
               dc.l = dc.p;
               var5.r = 0;
            }
         } else {
            dc.m += var5.r / 10;
         }

         dc.l = dc.m;
         var5.r -= var5.r / 10;
         if (var5.r / 10 == 0) {
            var5.r = 0;
         }
      } else if (dc.m < 0) {
         dc.l = 0;
      } else if (dc.m > dc.p) {
         dc.l = dc.p;
      }

      if (dc.m != dc.l) {
         dc.o = dc.l - dc.m << 2;
         dc.n += dc.o;
         dc.m += dc.n >> 4;
         dc.n &= 15;
      }

      gt.b().c(dc.m, dc.l);
   }

   public final void b() {
      if (this.I) {
         D.f();
      }

      if (this.A != null) {
         this.A.b();
      }
   }

   public final void b(dc var1) {
      this.z.removeElement(var1);
      if (this.C >= this.z.size()) {
         this.C = this.z.size() - 1;
      }

      ib.b().n = this.C;
      ib.b().b(this.z.size());
      this.l();
      this.j();
   }

   public final void b(int var1, String var2) {
      dc var3;
      if ((var3 = this.c(var1)) == null) {
         var3 = new dc(var2, var1, new ag(hq.a1, 3), D.b(), true);
         this.c(var3);
         var3.b(String.valueOf(hq.bU) + var2);
      }

      for(int var4 = 0; var4 < this.z.size(); ++var4) {
         if (this.z.elementAt(var4) == var3) {
            this.C = var4;
         }
      }

      this.j();
   }

   public final void c(dc var1) {
      this.z.addElement(var1);
      if (k4.u == this) {
         ib.b().b(this.z.size());
         this.l();
      }
   }

   private void l() {
      for(int var1 = 0; var1 < this.z.size(); ++var1) {
         if (this.d(var1).b) {
            ib.b().b(4, var1);
         } else {
            ib.b().b(0, var1);
         }
      }
   }

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "/\r\u0005tI ?2\u0005tI ?2\u0010T^$7sfcJn%?\u0003ce{E\u0002<\r\u0002/\r";
      int var4 = "/\r\u0005tI ?2\u0005tI ?2\u0010T^$7sfcJn%?\u0003ce{E\u0002<\r\u0002/\r".length();
      char var1 = 2;
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
                     J = var5;
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

                  var2 = "}L.=\u0002<\r";
                  var4 = "}L.=\u0002<\r".length();
                  var1 = 4;
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
         var10000[0] = (char)(var10000[0] ^ '\f');
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
               var10005 = 21;
               break;
            case 1:
               var10005 = 45;
               break;
            case 2:
               var10005 = 77;
               break;
            case 3:
               var10005 = 86;
               break;
            case 4:
               var10005 = 92;
               break;
            case 5:
               var10005 = 46;
               break;
            default:
               var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
