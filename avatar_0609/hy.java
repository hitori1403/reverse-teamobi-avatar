import java.util.Vector;

public final class hy extends hs implements h7 {
   private static hy d = new hy();
   private static final String e;

   static {
      String var10002 = b(b("Jv\u0014{[Bx\u0004?"));
      boolean var10001 = true;
      e = var10002;
   }

   public static void b() {
      ft.ae = 4;
      fr.C = fr.A;
      fh.b(0, fv.u());
      h3.d.e = d;
   }

   public final void b(ij var1) {
      try {
         int var2 = var1.f.readByte();
         int var3 = var1.f.readByte();
         if (!ft.b((byte)var2, (byte)var3)) {
            return;
         }

         new StringBuffer(e).append(var1.b);
         switch(var1.b) {
            case 20:
               byte var33 = var1.f.readByte();
               Vector var40 = new Vector();

               for(int var47 = 0; var47 < 13; ++var47) {
                  var40.addElement(new b3(var1.f.readByte()));
               }

               int var48 = var1.f.readInt();
               k4.h();
               ft.r();
               fv.u().b(var48, var33, var40);
               h1 var24 = h1.b();

               try {
                  var24.c((byte)53);
               } catch (Exception var16) {
               }

               var24.a();
               return;
            case 21:
               int var50 = var1.f.readInt();
               byte var30;
               byte[] var38 = new byte[var30 = var1.f.readByte()];

               for(int var45 = 0; var45 < var30; ++var45) {
                  var38[var45] = var1.f.readByte();
               }

               int var46 = var1.f.readInt();
               ft.B = true;
               fv var23;
               (var23 = fv.u()).aB = false;
               if (var50 != -1) {
                  var50 = ft.g(var50);
                  int var7 = ft.P[var50];
                  byte[] var6 = var38;
                  fv var52 = var23;
                  int var8 = 0;
                  int var9 = 0;
                  switch(var7) {
                     case 0:
                        var8 = k4.q;
                        var9 = -27;
                        break;
                     case 1:
                        var8 = -10;
                        var9 = (k4.p + k4.ab) / 2 - 20;
                        break;
                     case 2:
                        var8 = k4.q;
                        var9 = k4.p + k4.ab - 20;

                        for(int var55 = var23.ap.size() - 1; var55 >= 0; --var55) {
                           b3 var10 = (b3)var52.ap.elementAt(var55);

                           for(int var11 = 0; var11 < var6.length; ++var11) {
                              if (var10.c == var6[var11]) {
                                 var8 = var10.d;
                                 var9 = var10.e;
                                 break;
                              }
                           }
                        }
                        break;
                     case 3:
                        var8 = k4.o + 10;
                        var9 = (k4.p + k4.ab) / 2 - 20;
                  }

                  var7 = k4.q + b2.b.nextInt(20);
                  int var58 = k4.p / 2 - 20 * ev.a + b2.b.nextInt(25);
                  int var59 = var6.length;
                  int var12;
                  if ((var12 = (k4.o - 60) / var59 + 1) > 12) {
                     var12 = 12;
                  }

                  int var13 = (var12 * var59 >> 1) + 6;
                  var52.as = true;
                  var52.aj = new Vector();
                  var52.ak = var6;

                  for(int var14 = 0; var14 < var59; ++var14) {
                     b3 var15;
                     (var15 = new b3(var6[var14])).d = var8 + var14 * var52.Q;
                     var15.e = var9;
                     var15.n = var7 - var13;
                     var15.m = var58;
                     var13 -= var12 * ev.a;
                     var52.aj.addElement(var15);
                  }

                  var52.al = db.c(var52.ak);
               }

               if (var50 == GameMidlet.k.f) {
                  byte[] var39 = var38;
                  fv var32 = var23;

                  for(int var53 = var23.ap.size() - 1; var53 >= 0; --var53) {
                     b3 var54 = (b3)var32.ap.elementAt(var53);

                     for(int var57 = 0; var57 < var39.length; ++var57) {
                        if (var54.c == var39[var57]) {
                           var32.ap.removeElementAt(var53);
                        }
                     }
                  }

                  var23.F = 0;
                  var23.c(false);
               }

               var23.E = var46;
               if (var23.E == GameMidlet.k.f) {
                  if (var23.z().length == 0) {
                     var23.g = var23.aq;
                  } else {
                     var23.g = ft.X;
                  }
               } else {
                  var23.g = null;
               }

               if (ft.N == 0) {
                  ft.N = 30;
               }

               ft.L = System.currentTimeMillis() + (long)(ft.N * 1000);
               fv.u().t();
               return;
            case 49:
               var2 = var1.f.readInt();
               var3 = var1.f.readInt();
               boolean var21 = var1.f.readBoolean();
               fv var22 = fv.u();
               if (var21) {
                  e8.f();
               }

               i3 var29;
               String var49;
               if ((var29 = ft.f(var2)).g.equals("")) {
                  var49 = hq.v;
               } else {
                  var49 = hq.C;
               }

               ft.b(var49, 60, var29.f);
               var22.E = var3;
               if (var21) {
                  var22.aj = new Vector();
                  var22.al = -1;
                  var22.ak = new byte[0];
               }

               if (var22.E == GameMidlet.k.f) {
                  if (var22.z().length == 0) {
                     var22.g = var22.aq;
                  } else {
                     var22.g = ft.X;
                  }
               } else {
                  var22.g = null;
               }

               ft.L = System.currentTimeMillis() + (long)(ft.N * 1000);
               return;
            case 50:
               fv.u().aC = false;
               fv.u();
               fv.x();
               if (var1.f.available() > 0) {
                  var2 = var1.f.readInt();
                  byte var36;
                  byte[] var43 = new byte[var36 = var1.f.readByte()];

                  for(int var5 = 0; var5 < var36; ++var5) {
                     var43[var5] = var1.f.readByte();
                  }

                  fv.u().b(var2, var43);
                  return;
               }
               break;
            case 51:
               var2 = var1.f.readInt();
               var3 = var1.f.readByte();
               int var42 = var1.f.readInt();
               int var20 = var1.f.readInt();
               fv.u();
               fv.b(var2, var3, var42, var20);
               return;
            case 53:
               var3 = var1.f.readInt();
               byte[] var25 = new byte[13];

               try {
                  for(int var41 = 0; var41 < 13; ++var41) {
                     var25[var41] = var1.f.readByte();
                  }
               } catch (Exception var17) {
                  var25 = null;
               }

               k4.h();
               fv.u();
               fv.x();
               if (var25 != null) {
                  fv.u().b(var3, var25);
               }

               ft.b(var3, hq.L);
               return;
            case 54:
               String var4 = var1.f.readUTF();
               fv var19 = fv.u();
               ft.b(var4, 100, GameMidlet.k.f);
               var19.E = GameMidlet.k.f;
            default:
               return;
         }
      } catch (Exception var18) {
         var18.printStackTrace();
      }
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
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
               var10005 = 62;
               break;
            case 1:
               var10005 = 31;
               break;
            case 2:
               var10005 = 113;
               break;
            case 3:
               var10005 = 21;
               break;
            case 4:
               var10005 = 55;
               break;
            case 5:
               var10005 = 39;
               break;
            default:
               var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
