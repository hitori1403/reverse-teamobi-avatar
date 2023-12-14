import java.util.Vector;

public final class hw extends hs implements h7 {
   public static hw d = new hw();

   public static void b() {
      DeCaptcha.b().f = d;
   }

   public final void b(ij var1) {
      try {
         switch(var1.b) {
            case -75:
               int var17 = var1.b().readInt();
               k4.x.b(hq.u, new j(var17), 0);
            default:
               return;
            case -73:
               short var56 = var1.b().readShort();
               byte[] var68 = new byte[var1.b().readInt()];
               var1.b().read(var68);
               fg.g().b(var68, var56);
               return;
            case -67:
               byte var24 = var1.b().readByte();
               byte var32 = -1;
               short var39 = 0;
               Vector var46 = null;
               if (var24 == 0) {
                  var39 = var1.b().readShort();
                  var32 = var1.b().readByte();
               } else {
                  var46 = new Vector();
                  short var53 = var1.b().readShort();

                  for(int var61 = 0; var61 < var53; ++var61) {
                     i3 var67;
                     (var67 = new i3()).f = var1.b().readInt();
                     var67.Q = var1.b().readByte();
                     var46.addElement(var67);
                  }
               }

               fg var72 = fg.g();
               var46 = var46;
               fg var16 = var72;
               if (var24 != 0) {
                  for(int var25 = 0; var25 < var46.size(); ++var25) {
                     i3 var55;
                     i3 var63 = fd.c((var55 = (i3)var46.elementAt(var25)).f);
                     if (var55 != null && var63 != null) {
                        var63.Q = var55.Q;
                     }
                  }

                  k4.h();
                  var16.q();
                  return;
               } else {
                  boolean var54;
                  label245: {
                     GameMidlet.k.Q = (byte)var32;
                     kp.c().d();
                     if (var16.R == null) {
                        var16.o();
                        if (var16.R == null || var39 != var16.R.c) {
                           if (var16.R == null) {
                              var16.R = new t();
                              var16.R.c = var39;
                           }

                           h4 var62;
                           (var62 = h4.b()).a((byte)-73);
                           var62.a();
                           var54 = false;
                           break label245;
                        }
                     }

                     var54 = true;
                  }

                  if (var54) {
                     kp.c();
                     if (AutoController.X != -1) {
                        h4 var73 = h4.b();
                        kp.c();
                        var73.e(AutoController.X);
                        kp.c();
                        AutoController.X = -1;
                        return;
                     } else {
                        k4.O = 1;
                        k4.h();
                        return;
                     }
                  } else {
                     k4.O = 1;
                     return;
                  }
               }
            case -66:
               iq var23;
               (var23 = new iq()).i = var1.b().readShort();
               var23.a = var1.b().readByte();
               var23.b = var1.b().readByte();
               fg var15 = fg.g();
               iq var31 = var23;
               fg var38 = var15;
               int var45 = 0;

               iq var52;
               while(true) {
                  if (var45 >= var38.I.size()) {
                     var52 = null;
                     break;
                  }

                  iq var60;
                  if ((var60 = (iq)var38.I.elementAt(var45)).a / 24 == var31.a && var60.b / 24 == var31.b && var60.i == var31.i) {
                     var52 = var60;
                     break;
                  }

                  ++var45;
               }

               gx.m.removeElement(var52);
               var15.I.removeElement(var52);
               var15.d(var52);
               hz.b();
               k4.h();
               return;
            case -65:
               byte var34 = var1.b().readByte();
               int var18 = var1.b().readInt();
               short var5;
               short[] var27 = new short[var5 = var1.b().readShort()];

               for(int var6 = 0; var6 < var5; ++var6) {
                  var27[var6] = var1.b().readByte();
               }

               int var47 = var1.b().readByte();
               Vector var40 = new Vector();
               short var7 = var1.b().readShort();

               for(int var8 = 0; var8 < var7; ++var8) {
                  iq var69;
                  (var69 = new iq()).i = var1.b().readShort();
                  var69.a = var1.b().readByte() * 24;
                  var69.b = var1.b().readByte() * 24;
                  var69.j = var1.b().readByte();
                  var40.addElement(var69);
               }

               Vector var64 = DeCaptcha.c(var1);
               hz.b();
               fg var70 = fg.g();
               Vector var57 = var64;
               byte var41 = (byte)var47;
               fg var14 = var70;
               var70.J = var34;
               var14.M = var18;
               var14.I = var40;
               gx.f = (short)var47;
               gx.g = (short)(var27.length / var47);
               gx.e = var27;
               if (var14.J == 4) {
                  k4.A.f(111);
               } else {
                  k4.A.f(68 + var14.J);
               }

               gx.A = -1;
               var18 = -1;
               int var29 = 0;

               for(int var36 = 0; var36 < var41; ++var36) {
                  for(int var49 = 0; var49 < gx.g; ++var49) {
                     if (gx.e[var49 * var41 + var36] < fg.G) {
                        gx.h[var49 * var41 + var36] = 80;
                     } else {
                        gx.h[var49 * var41 + var36] = 88;
                     }
                  }

                  if (gx.e[(gx.g - 1) * var41 + var36] == var14.R.f.getHeight() / (24 * ev.a) - 1) {
                     gx.e[(gx.g - 1) * var41 + var36] = gx.e[(gx.g - 2) * var41 + var36];
                     gx.h[(gx.g - 1) * var41 + var36] = 21;
                     ++var29;
                     if (var18 == -1) {
                        var18 = var36 * 24;
                     }
                  }
               }

               var14.Q = new cn(var18 + var29 * 24 / 2, gx.g * 24 - 30);
               GameMidlet.k.a = var14.Q.b;
               GameMidlet.k.b = var14.Q.c;
               ix var21;
               if ((var21 = gx.m(GameMidlet.k.f)) != null) {
                  var21.b(GameMidlet.k.a, GameMidlet.k.b);
                  var21.i();
               }

               ko.b().c(70 + var14.J);
               gx.d = new g_(var14.R.f, 24 * ev.a, 24 * ev.a);

               for(int var50 = 0; var50 < var57.size(); ++var50) {
                  i3 var42;
                  i3 var71 = var42 = (i3)var57.elementAt(var50);
                  var71.l = var71.a;
                  var42.m = var42.b;
                  if (var42.f != GameMidlet.k.f) {
                     gx.c(var42);
                  }
               }

               var47 = 0;
               var18 = 0;

               for(int var30 = 0; var30 < var14.I.size(); ++var30) {
                  iq var43;
                  if ((var43 = (iq)var14.I.elementAt(var30)).a == 0 && var43.b == 0) {
                     boolean var58 = false;

                     for(int var65 = 0; var65 < gx.e.length; ++var65) {
                        if (gx.h[var65] == 80) {
                           var43.a = var65 % gx.f * 24;
                           var43.b = var65 / gx.f * 24;
                           var47 = var43.a;
                           var18 = var43.b;
                           var58 = true;
                           var14.e(var43);
                           h4.b().b(var43.i, 0, 0, var43.a / 24, var43.b / 24, var43.j);
                           break;
                        }
                     }

                     if (!var58) {
                        var43.a = var47;
                        var43.b = var18;
                        h4.b().b(var43.i, 0, 0, var43.a / 24, var43.b / 24, var43.j);
                     }
                  }

                  if (fg.c(var43)) {
                     ++var43.b;
                  }
               }

               kp.c();
               AutoController.s();
               Vector var44 = var14.I;
               fg var59 = var14;

               for(int var37 = 0; var37 < var44.size(); ++var37) {
                  iq var66 = (iq)var44.elementAt(var37);
                  gx.m.addElement(var66);
                  var59.e(var66);
               }

               gx.b(gx.m);
               var14.d();
               k4.h();
               return;
            case -46:
               short var9 = var1.b().readShort();
               String var12 = var1.b().readUTF();
               fg var13 = fg.g();
               k4.h();
               if (var9 == 0) {
                  Vector var33;
                  (var33 = new Vector()).addElement(new ag(hq.p, 50));
                  var33.addElement(new ag(hq.q, 51));
                  k4.b(var12, var33);
                  return;
               }

               k4.c(var12);
               if (var9 == 2) {
                  gx.e = var13.aa;
               }

               var13.aa = null;
               hz.b();
               GameMidlet.k.a = var13.Q.b;
               GameMidlet.k.b = var13.Q.c;
               var13.f = kp.c().E;
               ko.b().c(70 + var13.J);
               return;
            case -43:
               short var2;
               g2[] var3 = new g2[var2 = var1.b().readShort()];

               for(int var4 = 0; var4 < var2; ++var4) {
                  var3[var4] = new g2();
                  var3[var4].b = var1.b().readUTF();
                  var3[var4].c = var1.b().readInt();
                  var3[var4].d = var1.b().readInt();
               }

               fg var11;
               (var11 = fg.g()).O = var3;
               var11.l();
               k4.h();
               return;
            case 51:
               AutoController.h();
               AutoController.b(hz.c(var1));
               return;
            case 76:
               DeCaptcha.f(var1);
               return;
            case 77:
               DeCaptcha.g(var1);
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }
}
