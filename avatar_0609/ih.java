import java.util.Hashtable;
import java.util.Vector;

public final class ih {
   public static boolean b;
   private static final String[] a;

   public static void b(String var0) {
      k4.c(var0);
   }

   public static void b() {
      h6.b();
      if (f5.j == -1) {
         h4.b().c();
      } else {
         AutoController.h().y();
      }

      h4.b().h(GameMidlet.k.f);
      f5.p = new Hashtable();
      f5.q = new Hashtable();
   }

   public final void b(String var1, String var2) {
      cq var4 = new cq(var2);
      Vector var3;
      (var3 = new Vector()).addElement(new ag(hq.A, var4));
      var3.addElement(new ag(hq.e, new cr()));
      k4.v.b(false);
      k4.b(var1, var3);
      b = true;
   }

   public final void b(String var1, boolean var2) {
      if (var2) {
         k4.c(var1, new cm());
      } else {
         k4.c(var1);
      }
   }

   public static void b(byte var0) {
      if (GameMidlet.f == 9) {
         b = false;
      }

      String[] var3 = a;
      new StringBuffer(var3[0]).append((int)var0).append(var3[2]).append(AutoController.I);
      if (DeCaptcha.b().f != null) {
         switch(var0) {
            case 3:
               h3.b();
               AutoController.h();
               AutoController.r();
            case 4:
            case 5:
            case 6:
            case 7:
            default:
               break;
            case 8:
               AutoController.h().af = true;
               h6.b();
               if (AutoController.ak != -1) {
                  hx.b().m(AutoController.ak);
                  AutoController.ak = -1;
               } else if (AutoController.I != -1) {
                  k4.A.f(57 + AutoController.I);
                  if (k4.N && gx.b == 57) {
                     (k4.H = new ew()).c(AutoController.z);
                  }

                  byte var2 = 4;
                  i3 var5 = GameMidlet.k;
                  GameMidlet.k.ac = (short)var2;
                  k4.h();
               } else {
                  AutoController.h().y();
                  k4.h();
               }
               break;
            case 9:
               hz.b();
               if (gx.ab == -1) {
                  if (!fp.O) {
                     if (GameMidlet.f == 12) {
                        gx.j = 24;
                        gx.A = -1;
                        hv.b().b(AutoController.O, -1);
                     } else if (GameMidlet.f == 3) {
                        k4.aa.j();
                        hv.b().b(AutoController.O, -1);
                     } else if (AutoController.I != -1) {
                        AutoController.h();
                        AutoController.B();
                     } else if (AutoController.an != -1) {
                        k4.i();
                        hv.b().b(AutoController.an, -1);
                        AutoController.an = -1;
                     } else {
                        AutoController.h().x();
                     }
                  } else {
                     k4.aa.j();
                     fp.h().d();
                     k4.h();
                  }
               } else {
                  gx.G = -1;
               }
               break;
            case 10:
               if (h5.d == null) {
                  h5.d = new h5();
               }

               DeCaptcha.b().f = h5.d;
               if (f8.n == -1) {
                  h2 var4;
                  (var4 = h2.b()).a((byte)51);
                  var4.a(f5.t);
                  var4.a();
               } else if (fj.G == null) {
                  h2.b().e();
               } else {
                  hv.b().b(25, 0);
                  fj.h();
                  fj.g().a(GameMidlet.k.f, false);
               }
               break;
            case 11:
               hw.b();
               gx.b = -1;
               hv.b().b(21, 0);
               if (AutoController.X != -1) {
                  k4.i();
                  h4.b().f(0);
               }
               break;
            case 12:
               if (hl.b == null) {
                  hl.b = new hl();
               }

               DeCaptcha.b().f = hl.b;
               hx var1 = hx.b();
               k4.i();
               var1.a((byte)1);
               var1.a();
         }
      }

      GameMidlet.f = var0;
   }

   public final void b(int var1, byte var2, String[] var3) {
      if (k4.w != null) {
         k4.w = null;
      }

      k4.h();
      Vector var4 = new Vector();
      boolean var5 = false;

      for(int var6 = 0; var6 < var3.length; ++var6) {
         String var10000 = var3[var6];
         String[] var7 = a;
         if (var10000.equals(var7[1])) {
            var5 = true;
         } else if (var3[var6].indexOf(kq.z[3]) != -1) {
            var4.addElement(new ag(kq.z[4] + kq.b(fk.ag), new ii(this, 6)));
            var4.addElement(new ag(kq.z[5] + kq.b(fk.af), new ii(this, 7)));
            continue;
         }

         var4.addElement(new ag(var3[var6], new g4(var6, var1, var2)));
      }

      if (var5) {
         var4.insertElementAt(new ag(a[3], new ii(this, 1)), 0);
      }

      f1.d().b(var4, 2);
   }

   public final void b(byte var1, byte var2, String var3) {
      if (var2 == 0) {
         k4.b(var3, new co(var1));
      } else {
         k4.c(var3);
      }
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "yV\u001c~p3Gs]7~vA\u0006\u000eLL\"Ớj[ttÓ5|$/Ɩ";
      int var4 = "yV\u001c~p3Gs]7~vA\u0006\u000eLL\"Ớj[ttÓ5|$/Ɩ".length();
      char var1 = 14;
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

                  var2 = "=\u0019{;\bIPẜu$\u0096Eu";
                  var4 = "=\u0019{;\bIPẜu$\u0096Eu".length();
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
         var10000[0] = (char)(var10000[0] ^ '&');
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
               var10005 = 29;
               break;
            case 1:
               var10005 = 57;
               break;
            case 2:
               var10005 = 91;
               break;
            case 3:
               var10005 = 27;
               break;
            case 4:
               var10005 = 4;
               break;
            case 5:
               var10005 = 123;
               break;
            default:
               var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
