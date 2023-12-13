import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class g0 extends gz {
   private static g_ d;
   private static g_ e;
   private byte f = 0;
   private int g = 0;
   public int h;
   private int i;
   private static int j;
   private static int k;
   private static int l;
   private Vector m = new Vector();
   private static final String[] a;

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "~xi\u0001h\u0005ibr\u0005e";
      int var4 = "~xi\u0001h\u0005ibr\u0005e".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            j = 5;
            l = b2.c(1, -1);
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public final void c() {
      super.c();
   }

   public g0(int var1, int var2) {
      this.f = (byte)var1;
      this.g = var2 * 10;
      if (ev.a == 1) {
         this.g = var2 * 5;
      }

      this.i = (int)(System.currentTimeMillis() / 1000L);
      switch(var1) {
         case 0:
            this.g = k4.o * k4.p / 1000 + 50;
            break;
         case 1:
            this.g = 30;
            if (d == null) {
               bp.c(hq.aw);
               String[] var5 = a;
               d = g_.b(var5[1], 16 * ev.a, 10 * ev.a);
               bp.b();
            }
         case 2:
         default:
            break;
         case 3:
            this.g = k4.o * k4.p / 1000;
            bp.c(hq.aw);
            g_.b(a[0], 5 * ev.a, 5 * ev.a);
            bp.b();
            e = d;
      }

      for(int var7 = 0; var7 < this.g; ++var7) {
         is var3;
         (var3 = new is(0, (cl.b().d - (k4.p << 1) + b2.e(k4.p << 1)) * 10)).a = (-k4.o / 2 + b2.e(gx.f * gx.j + k4.o)) * 10;
         if (var1 != 3 && this.f != 2) {
            var3.j = b2.e(4);
         } else {
            var3.j = b2.e(3);
         }

         var3.l = 16 + (b2.e(3) << 2);
         var3.h = b2.c(-1, 1);
         var3.k = b2.e(var3.l);
         var3.n = (byte)b2.e(20);
         this.m.addElement(var3);
      }

      if (var1 == 2) {
         for(int var8 = 0; var8 < this.m.size() - 1; ++var8) {
            is var9 = (is)this.m.elementAt(var8);

            for(int var6 = var8 + 1; var6 < this.m.size(); ++var6) {
               is var4 = (is)this.m.elementAt(var6);
               if (var9.j > var4.j) {
                  this.m.setElementAt(var9, var6);
                  this.m.setElementAt(var4, var8);
                  var9 = var4;
               }
            }
         }
      }
   }

   public final void b(Graphics var1) {
      k4.d(var1);
      var1.translate(-cl.b().c, -cl.b().d);
      switch(this.f) {
         case 0:
            Graphics var9 = var1;
            g0 var7 = this;
            var1.setColor(14540253);

            for(int var12 = 0; var12 < var7.g; ++var12) {
               is var15 = (is)var7.m.elementAt(var12);
               int var10001 = 2 - var15.j;
               int var5 = cl.b().c * var10001 * 20 / 120;
               var9.fillRect(var5 + var15.a / 10, var15.b / 10, 1, var15.j + 1);
            }

            return;
         case 1:
            Graphics var8 = var1;
            g0 var6 = this;

            for(int var11 = 0; var11 < var6.g; ++var11) {
               is var14;
               if ((var14 = (is)var6.m.elementAt(var11)).a * ev.a / 10 > cl.b().c && var14.a * ev.a / 10 < cl.b().c + k4.o && var14.b * ev.a / 10 > cl.b().d) {
                  d.b(var14.k / (var14.l / 4), var14.a * ev.a / 10, var14.b * ev.a / 10, 0, 3, var8);
               }
            }

            return;
         case 2:
            if (super.c == -1) {
               return;
            } else {
               w var2 = f5.e(super.c);

               for(int var10 = 0; var10 < this.g; ++var10) {
                  is var13;
                  ++(var13 = (is)this.m.elementAt(var10)).m;
                  if (var13.a * ev.a / 10 > cl.b().c
                     && var13.a * ev.a / 10 < cl.b().c + k4.o
                     && var13.b * ev.a / 10 > cl.b().d
                     && var13.b * ev.a / 10 < cl.b().d + k4.s) {
                     if (var2 != null) {
                        if (var13.m >= var2.b.length) {
                           var13.m = 0;
                        }

                        var2.b(var1, var13.a / 10, var13.b / 10, var13.m);
                     }

                     ++var13.n;
                     if (var13.n >= 20) {
                        var13.n = 0;
                     }
                  }
               }

               return;
            }
         case 3:
            for(int var3 = 0; var3 < this.g; ++var3) {
               is var4;
               if ((var4 = (is)this.m.elementAt(var3)).a * ev.a / 10 > cl.b().c && var4.a * ev.a / 10 < cl.b().c + k4.o && var4.b * ev.a / 10 > cl.b().d) {
                  e.b(2 - var4.j, var4.a * ev.a / 10, var4.b * ev.a / 10, 0, var1);
               }
            }
      }
   }

   public final void a() {
      int var1 = 1;
      if (k4.n % 6 == 3) {
         var1 = b2.e(15);
      }

      if (var1 == 0 && j == 5) {
         j = 5 + b2.e(20);
         k = 50 + b2.e(100);
      }

      if (k > 0) {
         --k;
      }

      if (k == 0 && j > 5 && k4.n % 4 == 2) {
         --j;
      }

      switch(this.f) {
         case 0:
            g0 var8 = this;

            for(int var12 = 0; var12 < var8.g; ++var12) {
               is var15;
               is var18 = var15 = (is)var8.m.elementAt(var12);
               var18.b += (var15.j + 1) * 15 + (3 - var15.j) * 3;
               ++var15.g;
               var15.a += var15.j + 1 << 2;
               if (var15.b / 10 > cl.b().d + k4.p - (4 - var15.j) * 50) {
                  var8.b(var15);
               }

               int var10001 = 2 - var15.j;
               int var4 = cl.b().c * var10001 * 20 / 120;
               if (var15.a / 10 + var4 < cl.b().c - 10) {
                  var15.a += (k4.o + 20) * 10;
               }

               if (var15.a / 10 + var4 > cl.b().c + k4.o + 10) {
                  var15.a -= (k4.o + 20) * 10;
               }
            }

            return;
         case 1:
            g0 var7 = this;

            for(int var11 = 0; var11 < var7.g; ++var11) {
               is var14;
               is var17 = var14 = (is)var7.m.elementAt(var11);
               var17.b += 10;
               var14.a += var14.h * 10 + j * l;
               ++var14.k;
               if (var14.k >= var14.l) {
                  var14.k = 0;
               }

               if (var14.b / 10 > gx.g * gx.j - (4 - var14.j) * 20) {
                  var7.b(var14);
               }
            }

            return;
         case 2:
            g0 var6 = this;
            if (System.currentTimeMillis() / 1000L - (long)this.i > (long)this.h) {
               ++this.h;

               for(int var9 = 0; var9 < 5; ++var9) {
                  var6.m.removeElementAt(0);
                  var6.g = var6.m.size();
                  if (var6.g == 0) {
                     var6.c();
                     return;
                  }
               }
            }

            for(int var10 = 0; var10 < var6.g; ++var10) {
               is var13;
               is var16 = var13 = (is)var6.m.elementAt(var10);
               var16.b += (var13.j + 2) * 5;
               var13.a += (var13.j + 1 << 1) + j * l;
               if (var13.b / 10 > gx.g * gx.j - (4 - var13.j) * 20) {
                  var6.b(var13);
               }
            }

            return;
         case 3:
            g0 var5 = this;

            for(int var2 = 0; var2 < var5.g; ++var2) {
               is var3;
               is var10000 = var3 = (is)var5.m.elementAt(var2);
               var10000.b += (var3.j + 4) * 3;
               var3.a += (var3.j + 1 << 1) + j * l;
               if (var3.b / 10 > gx.g * gx.j - (4 - var3.j) * 20) {
                  var5.b(var3);
               }
            }
      }
   }

   private void b(is var1) {
      if (super.b) {
         this.m.removeElement(var1);
         this.g = this.m.size();
         if (this.m.size() == 0) {
            super.c();
            return;
         }
      } else {
         var1.b = (cl.b().d - k4.r + b2.e(k4.p << 1)) * 10;
         var1.a = (-k4.o / 2 + b2.e(gx.f * gx.j + k4.o)) * 10;
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 's');
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
               var10005 = 10;
               break;
            case 1:
               var10005 = 13;
               break;
            case 2:
               var10005 = 16;
               break;
            case 3:
               var10005 = 100;
               break;
            case 4:
               var10005 = 28;
               break;
            case 5:
               var10005 = 103;
               break;
            default:
               var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
