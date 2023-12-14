import java.util.Vector;

public final class h3 extends hs implements h7 {
   public static h3 d = new h3();
   public h7 e;
   public static ft f;

   public static void b() {
      DeCaptcha.b().f = d;
   }

   public final void b(ij var1) {
      try {
         switch(var1.b) {
            case 6:
               Vector var26 = new Vector();

               while(var1.b().available() > 0) {
                  b8 var41;
                  (var41 = new b8()).b = var1.f.readByte();
                  var41.c = var1.f.readByte();
                  var1.f.readByte();
                  var41.d = var1.b().readByte();
                  var26.addElement(var41);
               }

               fh var10000 = fh.g();
               var26 = var26;
               fh var20 = var10000;

               for(int var34 = 0; var34 < var26.size(); ++var34) {
                  b8 var42 = (b8)var26.elementAt(var34);

                  for(int var46 = var34; var46 < var26.size(); ++var46) {
                     b8 var52;
                     if ((var52 = (b8)var26.elementAt(var46)).d < var42.d) {
                        var26.setElementAt(var42, var46);
                        var26.setElementAt(var52, var34);
                        var42 = var52;
                     }
                  }
               }

               var20.B = new Vector();
               byte var35 = -1;

               for(int var43 = 0; var43 < var26.size(); ++var43) {
                  b8 var47 = (b8)var26.elementAt(var43);
                  if (var35 == -1 || var47.d != var35) {
                     var20.B.addElement(new b8((byte)-1, var47.d));
                  }

                  var20.B.addElement(var47);
                  var35 = var47.d;
               }

               if (k4.ah != 0) {
                  fh var28 = var20;

                  for(int var36 = 0; var36 < var28.B.size(); ++var36) {
                     b8 var44;
                     if ((var44 = (b8)var28.B.elementAt(var36)).b == -1) {
                        int var48;
                        if ((var48 = var28.H - var36 % var28.H) != var28.H) {
                           for(int var53 = 0; var53 < var48; ++var53) {
                              var28.B.insertElementAt(new b8((byte)-2, var44.d), var36);
                           }

                           var36 += var48;
                        }

                        for(int var54 = 0; var54 < var28.H - 1; ++var54) {
                           var28.B.insertElementAt(new b8((byte)-2, var44.d), var36 + 1);
                        }

                        var36 += var28.H;
                     }
                  }

                  boolean var64 = false;
               }

               var20.D = 1;
               var20.h();
               fh.g().d();
               k4.h();
               return;
            case 7:
               Vector var40 = new Vector();
               byte var33 = var1.b().readByte();

               while(var1.b().available() > 0) {
                  ck var51;
                  (var51 = new ck()).b = var1.b().readByte();
                  int var25 = var1.b().readUnsignedByte();
                  var51.c = (byte)(var25 % 16);
                  var51.d = (byte)(var25 / 16);
                  int var56 = var1.b().readUnsignedByte();
                  var51.e = (var56 & 1) != 0;
                  var51.f = (var56 & 2) != 0;
                  var51.g = var1.b().readInt();
                  var51.h = k4.e(var51.g) + hq.l();
                  var40.addElement(var51);
               }

               fr.g().M = var33;
               fr.g().J = var40;
               fr.g().d();
               fr.g().k();
               k4.h();
               return;
            case 8:
               try {
                  j7.p = 0L;
                  k4.O = 0;
                  byte var32 = var1.b().readByte();
                  byte var39 = var1.b().readByte();
                  int var45 = var1.b().readInt();
                  int var24 = var1.b().readInt();

                  Vector var50;
                  i3 var55;
                  for(var50 = new Vector(); var1.b().available() > 0; var50.addElement(var55)) {
                     (var55 = new i3()).f = var1.b().readInt();
                     if (var55.f == -1) {
                        var55.b("");
                     } else {
                        if (var55.f == GameMidlet.k.f) {
                           var55 = GameMidlet.k;
                        }

                        var55.b(var1.b().readUTF());
                        var55.c(var1.b().readInt());
                        byte var57 = var1.b().readByte();

                        for(int var59 = 0; var59 < var57; ++var59) {
                           gl var62 = new gl(var1.b().readShort());
                           if (var55.f != GameMidlet.k.f) {
                              var55.b(var62);
                           }
                        }

                        int var60 = var1.b().readInt();
                        var55.e(var60);
                        var55.O = var1.b().readBoolean();
                        var55.e(var60);
                        var55.c(var55.c());
                        var55.aj = var1.b().readShort();
                     }
                  }

                  f.b(var32, var39, var45, var24, var50);
                  fv.u().m();
                  fv.u().aC = true;
                  ft.B = false;
                  int var58 = var50.size();

                  for(int var61 = 0; var61 < var58; ++var61) {
                     i3 var63;
                     if ((var63 = (i3)var50.elementAt(var61)).f == var45) {
                        var63.O = true;
                     }

                     if (var63.f == GameMidlet.k.f) {
                        GameMidlet.k.c(var63.c());
                     }
                  }

                  if (fr.C != 0) {
                     ;
                  }

                  ft var19 = f;
                  f.t();
                  f.d();
                  fv.u();
                  fv.y();
                  k4.h();
                  k4.O = 1;
                  return;
               } catch (Exception var11) {
                  if (ft.A && ft.ae == 2) {
                     f.a(hq.K);
                  }

                  fv.u().aC = true;
                  k4.h();
                  k4.O = 1;
                  return;
               }
            case 9:
               byte var31 = var1.b().readByte();
               byte var38 = var1.b().readByte();
               int var5 = var1.b().readInt();
               String var18 = var1.b().readUTF();
               if (ft.b(var31, var38)) {
                  ft.b(var5, var18);
                  return;
               }
               break;
            case 11:
               byte var30 = var1.b().readByte();
               byte var37 = var1.b().readByte();
               int var17 = var1.b().readInt();
               k4.y = null;
               if (ft.b(var30, var37)) {
                  if (var17 == GameMidlet.k.f) {
                     da var49 = new da();
                     k4.c(hq.I, var49);
                     j7.o = true;
                     return;
                  }

                  ft.z.c(var17);
                  return;
               }
               break;
            case 12:
               i3 var6 = new i3();
               byte var7 = var1.b().readByte();
               var6.f = var1.b().readInt();
               var6.b(var1.b().readUTF());
               var6.c(var1.b().readInt());
               byte var8 = var1.b().readByte();

               for(int var23 = 0; var23 < var8; ++var23) {
                  var6.b(new gl(var1.b().readShort()));
               }

               var6.s = 0;
               var6.e(var1.b().readInt());
               var6.aj = var1.b().readShort();
               var6.O = false;
               fv.u().aC = true;
               var6.O = false;
               ft var16 = f;
               ft.D.setElementAt(var6, var7);
               var16.s();
               var16.t();
               return;
            case 14:
               int var22 = var1.b().readInt();
               int var15 = var1.b().readInt();
               if (ft.A && ft.ae == 2) {
                  f.a(hq.K);
               }

               fv.u().aC = true;
               ft.z.c(var22);
               ft.d(var15);
               return;
            case 16:
               int var21 = var1.b().readInt();
               boolean var9 = var1.b().readBoolean();
               if (var21 == GameMidlet.k.f) {
                  k4.h();
               }

               ft.a(var21, var9);
               return;
            case 19:
               byte var29 = var1.b().readByte();
               byte var4 = var1.b().readByte();
               int var14 = var1.b().readInt();
               if (ft.b(var29, var4)) {
                  ft.e(var14);
                  return;
               }
               break;
            case 52:
               var1.b().readByte();
               var1.b().readByte();
               int var2 = var1.b().readInt();
               int var10 = var1.b().readInt();
               String var13 = var1.b().readUTF();
               i3 var3 = ft.f(var2);
               if (var10 != 0 && var3 != null) {
                  var3.c(var3.c() + var10);
                  if (GameMidlet.k.f == var2) {
                     GameMidlet.k.c(var3.c());
                  }

                  ft.b(var2, var13);
                  ft.c(var2, var10);
                  return;
               }

               return;
            case 61:
               switch(var1.b().readByte()) {
                  case 3:
                     hy.b();
                     break;
                  case 7:
                     ht.b();
                     break;
                  case 21:
                     h0.b();
                     break;
                  case 22:
                     ft.ae = 5;
                     fr.C = fr.B;
                     fh.b(3, fx.u());
                     if (dd.b == null) {
                        dd.b = new dd();
                     }

                     d.e = dd.b;
                     break;
                  default:
                     return;
               }

               k4.d(hq.c);
               h1.b().c();
               return;
            default:
               this.e.b(var1);
               return;
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }
   }
}
