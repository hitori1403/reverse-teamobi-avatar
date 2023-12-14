import javax.microedition.lcdui.Image;

public final class hz extends hs implements h7 {
   public static hz d;
   private static final String[] e;

   public static void b() {
      if (d == null) {
         d = new hz();
      }

      DeCaptcha.b().f = d;
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final void b(ij var1) {
      try {
         byte var5;
         switch(var1.b) {
            case -69:
               k4.c(hq.cM, new hn());
               return;
            case -68:
               byte var38 = var1.b().readByte();
               int var27 = var1.b().readInt();
               AutoController.h();
               k4.h();
               i3 var57;
               if ((var57 = gx.l(var27)) != null) {
                  if (var38 == 0) {
                     k4.b(hq.cQ + var57.g + e[2] + hq.cR, new gp(var27));
                     return;
                  }

                  if (var38 == 1) {
                     AutoController.X = var27;
                     hx.b().g(11);
                     k4.i();
                  }
               }

               return;
            case 51:
               AutoController.h();
               AutoController.b(c(var1));
               return;
            case 53:
               int var26 = var1.b().readInt();
               AutoController.h();
               AutoController.d(var26);
               return;
            case 54:
               DeCaptcha.f(var1);
               return;
            case 55:
               DeCaptcha.g(var1);
               return;
            case 57:
               int var37 = var1.b().readInt();
               byte var25 = var1.b().readByte();
               AutoController.h();
               AutoController.b(var37, var25);
               return;
            case 58:
               int var36 = var1.b().readInt();
               int var46 = var1.b().readInt();
               short var56 = var1.b().readShort();
               String var62 = "";
               if (var56 == -1) {
                  var62 = var1.b().readUTF();
               }

               int var65 = var1.b().readInt();
               var1.b().readByte();
               String[] var70 = e;
               new StringBuffer(var70[1]).append(var1.b().available());
               int var67 = var1.b().readInt();
               int var69 = var1.b().readInt();
               int var23 = var1.b().readInt();
               AutoController var24 = AutoController.h();
               if (var56 == -1) {
                  k4.c(var62);
                  return;
               }

               if (var36 == GameMidlet.k.f) {
                  var70 = e;
                  var70[0].concat(String.valueOf(var65));
                  GameMidlet.k.b(var67, var69, var23);
               }

               var24.b(0, var36, var46, var56, 0);
               return;
            case 59:
               int var35 = var1.b().readInt();
               int var45 = var1.b().readInt();
               short var55 = var1.b().readShort();
               String var61 = "";
               short var64 = 0;
               if (var55 == -1) {
                  var61 = var1.b().readUTF();
               } else {
                  var64 = var1.b().readShort();
               }

               AutoController var22 = AutoController.h();
               if (var55 == -1) {
                  k4.c(var61);
                  return;
               }

               var22.b(1, var35, var45, var55, var64);
               return;
            case 60:
               byte var34;
               int[] var43 = new int[var34 = var1.b().readByte()];

               for(int var53 = 0; var53 < var34; ++var53) {
                  var43[var53] = var1.b().readByte();
               }

               AutoController var21 = AutoController.h();
               fn var44;
               (var44 = fn.g()).A = var43;
               k4.B
                  .b(
                     k4.q - (var44.D * var44.C + 10) / 2 + 4,
                     k4.r - var44.D * var44.E / 2,
                     var44.D,
                     var44.D,
                     var44.C * var44.D,
                     var44.A.length / var44.C * var44.D,
                     var44.D * var44.C,
                     var44.D * var44.E - (k4.ah == 0 ? 30 : 0),
                     var43.length
                  );
               fn.g().b(var21);
               k4.h();
               return;
            case 78:
               return;
            case 82:
               int var50 = var1.b().readInt();
               fs var20 = fs.g();
               i3 var42;
               if ((var42 = gx.l(var50)) != null) {
                  de var51;
                  if ((var51 = fs.d(var42.f)) != null) {
                     kp.c();
                     AutoController.N.removeElement(var51);
                  }

                  de var52 = new de();
                  if (var42.f == GameMidlet.k.f) {
                     k4.h();
                     var20.F = var52;
                  } else {
                     var52 = new de();
                  }

                  kp.c();
                  AutoController.N.addElement(var52);
                  if (var42.q != 2) {
                     if (var42.f != GameMidlet.k.f) {
                        var52.d = var42;
                        var52.r = true;
                     }

                     return;
                  }

                  var52.b(var42);
               }

               return;
            case 84:
               int var33 = var1.b().readInt();
               short var18 = var1.b().readShort();
               fs var19 = fs.g();
               de var49;
               if ((var49 = fs.d(var33)) != null) {
                  if (var49.d.q != 2 && var49.d.q != 13) {
                     kp.c();
                     AutoController.N.removeElement(var49);
                     return;
                  }

                  if (var18 < 0) {
                     k4.b(hq.cc, var49.d.a, var49.d.b - 60, 1, -1);
                  }

                  if (var33 == GameMidlet.k.f && var18 > 0) {
                     e7.e().b(0, -1);
                     if (fs.ab) {
                        hx.b().b(9, (byte)0, 1);
                     }
                  }

                  var49.n = var18;
                  var49.q = true;
                  var49.b(0);
                  if (var49.d.f == GameMidlet.k.f) {
                     var19.g = var19.C;
                     k4.h();
                     var19.b(1, -1);
                  }
               }

               return;
            case 85:
               int var16 = var1.b().readInt();
               fs var17 = fs.g();
               de var40 = fs.d(var16);
               if (var16 == GameMidlet.k.f) {
                  var17.f = var17.A;
                  var17.g = var17.B;
                  k4.h();
                  if (k4.u == var17) {
                     var17.b(0, -1);
                  }
               }

               if (var40 != null) {
                  jx var48;
                  if (var40.n > 0 && (var48 = (jx)f5.b((short)var40.n)) != null) {
                     int var10002 = var40.d.b + var40.d.H - 50;
                     int var10004 = var5_2.d * ev.a;
                     int var10005 = var5_2.e * ev.a;
                     int var10006 = var5_2.f * ev.a;
                     hp var60;
                     k4.b(1, var40.d.a, var10002, Image.createImage(f5.b((var60 = f5.d[var48.c]).c).f, var10004, var10005, var10006, var60.g * ev.a, 0), -1);
                  }

                  kp.c();
                  AutoController.N.removeElement(var40);
               }

               return;
            case 86:
               boolean var66 = var1.b().readBoolean();
               String var68 = "";
               if (!var66) {
                  var68 = var1.b().readUTF();
               }

               fs.g().b(var66, var68);
               return;
            case 87:
               int var31 = var1.b().readInt();
               byte var15 = var1.b().readByte();
               fs.g();
               fs.e(var31, var15);
               return;
            case 88:
               int var30 = var1.b().readInt();
               byte var39 = var1.b().readByte();
               byte var47 = var1.b().readByte();
               var5 = var1.b().readInt();
               short var14 = var1.b().readShort();
               fs.g().b(var30, var39, var47, var5, var14);
               return;
            case 91:
               int var28 = var1.b().readInt();
               short var3 = var1.b().readShort();
               short var4 = var1.b().readShort();
               byte[][] var6 = new byte[var5 = var1.b().readByte()][];

               for(int var7 = 0; var7 < var5; ++var7) {
                  short var8 = var1.b().readShort();
                  var6[var7] = new byte[var8];
                  var1.b().read(var6[var7]);
               }

               fs var10000 = fs.g();
               byte[][] var58 = var6;
               fs var13 = var10000;
               de var63;
               if ((var63 = fs.d(var28)) != null && var63.k != 0) {
                  if (var63.d.q != 13 && var63.d.q != 2 || var63.p) {
                     kp.c();
                     AutoController.N.removeElement(var63);
                     return;
                  }

                  if (var4 == -1) {
                     var63.n = var3;
                     var63.q = true;
                     var63.b(0);
                     if (var63.d.f == GameMidlet.k.f) {
                        var13.b(1, -1);
                     }

                     return;
                  }

                  var63.p = true;
                  var63.b(0);
                  var63.d.q = 2;
                  var63.n = var3;
                  if (var4 != -1) {
                     k4.b(hq.cb, var63.d.a, var63.d.b - 60, 1, -1);
                  }

                  if (var28 == GameMidlet.k.f) {
                     var13.M = System.currentTimeMillis();
                     var13.K = 0;
                     var13.O = 2;
                     var13.J = new Image[var6.length];
                     var13.L = new byte[var6.length];

                     for(int var29 = 0; var29 < var13.J.length; ++var29) {
                        Image[] var72 = var13.J;
                        kp.b();
                        var72[var29] = b2.c(var58[var29]);
                     }

                     var13.N = var4;
                     var13.G = var13.F.f[var13.F.c - 2].b;
                     var13.H = var13.F.f[var13.F.c - 2].c - 30;
                     if (GameMidlet.k.enableAutoFish) {
                        var13.b(var13.J);
                        return;
                     }

                     String[] var10 = e;
                     k4.c(var10[3]);
                  }
               }

               return;
            case 92:
               if (AutoController.U = var1.b().readBoolean()) {
                  GameMidlet.k.al = var1.b().readShort();
                  return;
               }
               break;
            case 93:
               int var2 = var1.b().readInt();
               int var12 = var1.b().readInt();
               AutoController.h().f(var2, var12);
               return;
            default:
               return;
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      }
   }

   public static i3 c(ij var0) {
      i3 var1;
      (var1 = new i3()).f = var0.f.readInt();
      var1.b(var0.f.readUTF());
      byte var2 = var0.f.readByte();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.b(new gl(var0.f.readShort()));
      }

      var1.a = var1.l = var0.f.readShort();
      var1.b = var1.m = var0.f.readShort();
      var1.ap = var0.f.readByte();
      var1.ai = (byte)(100 - var0.f.readByte());
      var1.aj = var0.f.readShort();
      var1.am = var0.f.readShort();
      return var1;
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "j6\u0018*zvbl.6-{8\u0005\u0014D\u000e\u001e\u0017]PzB\u0011\u0019\u0017CElS\u0011\u0011\u0004&\"";
      int var4 = "j6\u0018*zvbl.6-{8\u0005\u0014D\u000e\u001e\u0017]PzB\u0011\u0019\u0017CElS\u0011\u0011\u0004&\"".length();
      char var1 = 14;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(b(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     e = var5;
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

                  var2 = "+xUGỹ1cwjÑk?\u007f7tề\u0005a¡1$<aMỬ;\u007f-ğlB%;½6<aÄ+x\t6u\"I÷68chjJä,\u007f$}o@%*Ẍ*<tÅjx4+i\"Vl67chjÄlx+1ƬộF+";
                  var4 = "+xUGỹ1cwjÑk?\u007f7tề\u0005a¡1$<aMỬ;\u007f-ğlB%;½6<aÄ+x\t6u\"I÷68chjJä,\u007f$}o@%*Ẍ*<tÅjx4+i\"Vl67chjÄlx+1ƬộF+".length();
                  var1 = 2;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '%');
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
               var10005 = 5;
               break;
            case 1:
               var10005 = 88;
               break;
            case 2:
               var10005 = 95;
               break;
            case 3:
               var10005 = 67;
               break;
            case 4:
               var10005 = 28;
               break;
            case 5:
               var10005 = 2;
               break;
            default:
               var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
