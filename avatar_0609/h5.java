import java.util.Vector;

public final class h5 extends hs implements h7 {
   public static h5 d;
   private static final String[] e;

   public final void b(ij var1) {
      try {
         switch(var1.b) {
            case 51:
               byte var63;
               short[] var85 = new short[var63 = var1.b().readByte()];
               short[] var94 = new short[var63];

               for(int var102 = 0; var102 < var63; ++var102) {
                  var85[var102] = var1.b().readShort();
                  var94[var102] = var1.b().readShort();
               }

               int var103 = var1.b().readInt();
               int var29 = var1.b().readInt();
               f8.b(var63, var94, var103, var29);
               return;
            case 52:
            case 53:
            case 57:
            case 58:
            case 59:
            case 68:
            case 87:
            case 88:
            case 89:
            default:
               return;
            case 54:
               short var62 = var1.b().readShort();
               short var84 = var1.b().readShort();
               int var93;
               byte[] var101 = new byte[var93 = var1.b().readUnsignedShort()];

               for(int var107 = 0; var107 < var93; ++var107) {
                  var101[var107] = var1.b().readByte();
               }

               f8.b(var62, var84, var101);
               return;
            case 55:
               byte[] var106 = new byte[var1.b().available()];
               var1.b().read(var106);
               f8.d(var106);
               return;
            case 56:
               byte[] var61 = new byte[var1.b().available()];
               var1.b().read(var61);
               f8.b(var61);
               return;
            case 60:
               byte var56 = var1.b().readByte();
               Vector var83 = new Vector();
               Vector var90 = new Vector();

               for(int var95 = 0; var95 < var56; ++var95) {
                  df var104;
                  (var104 = new df()).b = var1.b().readByte();
                  var104.f = var1.b().readShort();
                  if (var104.b > 100) {
                     var90.addElement(var104);
                  } else {
                     var83.addElement(var104);
                  }
               }

               byte var96 = var1.b().readByte();
               Vector var105 = new Vector();

               for(int var57 = 0; var57 < var96; ++var57) {
                  df var91;
                  (var91 = new df()).b = var1.b().readByte();
                  var91.f = var1.b().readShort();
                  var105.addElement(var91);
               }

               GameMidlet.k.A[0] = var1.b().readInt();
               GameMidlet.k.V = var1.b().readByte();
               GameMidlet.k.T = var1.b().readByte();
               var56 = var1.b().readByte();
               var90 = new Vector();

               for(int var97 = 0; var97 < var56; ++var97) {
                  df var108;
                  (var108 = new df()).b = var1.b().readShort();
                  var108.f = var1.b().readShort();
                  var90.addElement(var108);
               }

               var96 = var1.b().readByte();
               Vector var109 = new Vector();

               for(int var59 = 0; var59 < var96; ++var59) {
                  df var8;
                  (var8 = new df()).b = var1.b().readShort();
                  var8.f = var1.b().readShort();
                  var109.addElement(var8);
               }

               var56 = var1.b().readByte();
               var1.b().readInt();
               boolean var110 = var1.b().readBoolean();
               GameMidlet.k.V = var1.b().readShort();
               GameMidlet.k.T = var1.b().readByte();
               var96 = var1.b().readByte();
               var105.removeAllElements();

               for(int var112 = 0; var112 < var96; ++var112) {
                  df var10;
                  (var10 = new df()).b = var1.b().readShort();
                  var10.f = var1.b().readInt();
                  var105.addElement(var10);
               }

               var109.removeAllElements();
               var96 = var1.b().readByte();

               for(int var113 = 0; var113 < var96; ++var113) {
                  df var114;
                  (var114 = new df()).b = var1.b().readShort();
                  String[] var11 = e;
                  new StringBuffer(var11[0]).append(var114.b).append(var11[1]).append(var114.f);
                  var114.f = var1.b().readInt();
                  var109.addElement(var114);
               }

               fj.g();
               fj.b(var83, var105, var90, var109, var56, var110);
               if (f8.n == 0 && b() && gx.b != 25) {
                  f8.c();
                  hv.b().b(25, 0);
                  fj.h();
                  fj.g().a(GameMidlet.k.f, false);
                  return;
               }
               break;
            case 61:
               a(var1);
               return;
            case 62:
               df var111;
               (var111 = new df()).b = var1.b().readShort();
               var111.f = var1.b().readByte();
               var1.b().readInt();
               var1.b().readByte();
               int var55 = var1.b().readInt();
               int var82 = var1.b().readInt();
               int var28 = var1.b().readInt();
               fj.g();
               fj.b(var111, var55, var82, var28);
               return;
            case 63:
               int var54 = var1.b().readInt();
               int var81 = var1.b().readInt();
               short var27 = var1.b().readShort();
               fj.g().b(var54, var81, var27);
               return;
            case 64:
               var1.b().readInt();
               byte var53 = var1.b().readByte();
               byte var26 = var1.b().readByte();
               fj.g().g(var53, var26);
               return;
            case 65:
               var1.b().readByte();
               short var25;
               df var52;
               if (fj.g(var25 = var1.b().readShort()) != null && (var52 = df.b(fj.E, var25)) != null) {
                  --var52.f;
                  if (var52.f <= 0) {
                     fj.E.removeElement(var52);
                     return;
                  }
               }
               break;
            case 66:
               byte var51 = var1.b().readByte();
               short var24 = var1.b().readShort();
               fj.g();
               fj.h(var51, var24);
               return;
            case 67:
               fj.g();
               var1.b().readInt();
               fj.A();
               return;
            case 69:
               fj.g();
               fj.b(var1.b().readUTF());
               return;
            case 70:
               int var50 = var1.b().readInt();
               int var80 = var1.b().readInt();
               byte var89 = var1.b().readByte();
               String var5 = var1.b().readUTF();
               int var6 = var1.b().readInt();
               int var7 = var1.b().readInt();
               int var23 = var1.b().readInt();
               fj.g();
               fj.b(var50, var80, var89, var5, var6, var7, var23);
               return;
            case 71:
               df var49;
               (var49 = new df()).b = var1.b().readByte();
               var1.b().readInt();
               var1.b().readByte();
               int var79 = var1.b().readInt();
               int var88 = var1.b().readInt();
               int var22 = var1.b().readInt();
               fj.g();
               fj.b(var49, var79, var88, var22);
               return;
            case 72:
               byte var48 = var1.b().readByte();
               String var21 = var1.b().readUTF();
               fj.g().b(var48, var21);
               return;
            case 73:
               var1.b().readInt();
               byte var47 = var1.b().readByte();
               int var20 = var1.b().readInt();
               fj.g();
               fj.k(var47, var20);
               return;
            case 74:
               byte var46 = var1.b().readByte();
               short var19 = var1.b().readShort();
               fj.g();
               fj.i(var46, var19);
               return;
            case 75:
               int var45 = var1.b().readInt();
               int var78 = var1.b().readInt();
               GameMidlet.k.b(var45);
               GameMidlet.k.A[1] = var78;
               k4.c(var1.b().readUTF());
               return;
            case 76:
               hu.f(var1);
               return;
            case 77:
               hu.g(var1);
               return;
            case 78:
               if (b()) {
                  return;
               }

               byte var44 = var1.b().readByte();
               im var77;
               (var77 = (im)fj.C.elementAt(var44)).j = var1.b().readByte();
               b(var77, var1);
               fj.g().h(var44);
               return;
            case 79:
               if (b()) {
                  return;
               }

               byte var42 = var1.b().readByte();
               byte var76;
               if ((var76 = var1.b().readByte()) == -1) {
                  return;
               }

               iu var43;
               (var43 = fj.i(var42)).J = var76;
               b(var43, var1);
               fj.g();
               fj.v();
               return;
            case 80:
               if (var1.b().readByte() == 0) {
                  String var18 = var1.b().readUTF();
                  Vector var41;
                  (var41 = new Vector()).addElement(new ag(hq.D, 3, fj.z));
                  var41.addElement(new ag(hq.E, 4, fj.z));
                  var41.addElement(k4.ar);
                  k4.b(var18, var41);
                  return;
               }

               var1.b().readByte();
               var1.b().readInt();
               int var75 = var1.b().readInt();
               int var87 = var1.b().readInt();
               int var40 = var1.b().readInt();
               GameMidlet.k.b(var75, var87, var40);
               k4.O = 1;
               fj.g().a(GameMidlet.k.f, true);
               fj.aT = true;
               return;
            case 81:
               if (var1.b().readByte() == 0) {
                  String var39 = var1.b().readUTF();
                  Vector var74;
                  (var74 = new Vector()).addElement(new ag(hq.D, 5, fj.z));
                  var74.addElement(new ag(hq.E, 6, fj.z));
                  var74.addElement(k4.ar);
                  k4.b(var39, var74);
                  return;
               }

               var1.b().readByte();
               var1.b().readInt();
               k4.O = 1;
               new StringBuffer(e[2]).append(var1.b().available());
               int var86 = var1.b().readInt();
               int var38 = var1.b().readInt();
               int var73 = var1.b().readInt();
               GameMidlet.k.b(var86, var38, var73);
               fj.g().a(GameMidlet.k.f, true);
               fj.aT = true;
               return;
            case 82:
               short var37 = var1.b().readShort();
               byte[] var4 = new byte[var1.b().readShort()];
               var1.b().read(var4);
               f8.m.put(String.valueOf((int)var37), new dm(b2.c(var4)));
               return;
            case 83:
               if (var1.b().readBoolean()) {
                  fj.aC.i = var1.b().readShort();
                  ++fj.aC.h;
                  return;
               }
               break;
            case 84:
               if (var1.b().readByte() == 0) {
                  k4.b(var1.b().readUTF(), 7, fj.z);
                  return;
               }

               int var72 = var1.b().readInt();
               short var17 = var1.b().readShort();
               GameMidlet.k.A[0] -= var72;
               fj.aC.l = var17 * 60;
               fj.aC.o = System.currentTimeMillis();
               k4.b(-var72, GameMidlet.k.a, GameMidlet.k.b, -1);
               return;
            case 85:
               short var71 = var1.b().readShort();
               short var16 = var1.b().readShort();
               fj.g();
               fj.b(var71, var16);
               return;
            case 86:
               if (var1.b().readByte() == 0) {
                  k4.b(var1.b().readUTF(), 8, fj.z);
                  return;
               }

               var1.b().readInt();
               fj.aC.i = var1.b().readShort();
               fj.aC.l = 0;
               ++fj.aC.h;
               int var36 = var1.b().readInt();
               int var70 = var1.b().readInt();
               GameMidlet.k.b(GameMidlet.k.A[0], var36, var70);
               return;
            case 90:
               if (var1.b().readByte() == 0) {
                  String var35 = var1.b().readUTF();
                  Vector var69;
                  (var69 = new Vector()).addElement(new ag(hq.D, 9, fj.z));
                  var69.addElement(new ag(hq.E, 10, fj.z));
                  var69.addElement(k4.ar);
                  k4.b(var35, var69);
                  return;
               }

               var1.b().readByte();
               var1.b().readInt();
               byte var34 = var1.b().readByte();
               k4.c(var1.b().readUTF());
               ++((im)fj.C.elementAt(var34)).u;
               fj.g().b(fj.A, fj.C, fj.J, fj.aR, fj.aS, fj.aX, fj.aW);
               int var68 = var1.b().readInt();
               int var15 = var1.b().readInt();
               GameMidlet.k.b(GameMidlet.k.A[0], var68, var15);
               return;
            case 91:
               short var67;
               if ((var67 = var1.b().readShort()) == -1) {
                  fj.aX = 0;
               } else {
                  short var33 = var1.b().readShort();
                  fj.aX = var67;
                  fj.aW = var33 * 60;
               }

               k4.h();
               return;
            case 92:
               g3 var32;
               b5 var66 = fj.g((var32 = f8.c(fj.aX)).c);
               df var14;
               if ((var14 = fj.k(var32.c)) != null) {
                  ++var14.f;
               } else {
                  df var9;
                  (var9 = new df()).b = var32.c;
                  var9.f = 1;
                  fj.F.addElement(var9);
               }

               k4.c(0, fj.a0, fj.a1, var66.c);
               fj.aX = 0;
               return;
            case 93:
               if (var1.b().readByte() == 0) {
                  k4.b(var1.b().readUTF(), 11, fj.z);
                  return;
               }

               int var31 = var1.b().readInt();
               GameMidlet.k.A[2] -= var31;
               fj.aW = 0;
               int var65 = var1.b().readInt();
               int var13 = var1.b().readInt();
               GameMidlet.k.b(GameMidlet.k.A[0], var65, var13);
               return;
            case 94:
               if (var1.b().readByte() == 0) {
                  String var64 = var1.b().readUTF();
                  Vector var30;
                  (var30 = new Vector()).addElement(new ag(hq.D, 13, fj.z));
                  var30.addElement(new ag(hq.E, 14, fj.z));
                  var30.addElement(k4.ar);
                  k4.b(var64, var30);
                  return;
               }

               byte var3 = var1.b().readByte();
               int var2 = var1.b().readInt();
               if (var3 == 1) {
                  GameMidlet.k.A[0] -= var2;
               } else {
                  GameMidlet.k.A[2] -= var2;
               }

               var1.b().readInt();
               ++fj.aQ;
               k4.c(var1.b().readUTF());
               fj.g().b(fj.A, fj.C, fj.J, fj.aR, fj.aS, fj.aX, fj.aW);
               return;
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }
   }

   private static boolean b() {
      return gx.b != 24 && gx.b != 53;
   }

   private static void b(im var0, ij var1) {
      short var2 = var1.f.readShort();
      fj.b(var0.k, var2, var0, null);
      var0.k = var2;
      var0.m = (long)(var0.k * 60);
      byte var5 = var1.f.readByte();
      fj.b(var0.s, var5, var0, null);
      var0.s = var5;
      var0.r = var1.f.readByte();
      var0.n = var1.f.readBoolean();
      boolean var6 = var1.f.readBoolean();
      int var3 = -1;
      if (!var6 && var0.o) {
         var3 = 0;
      }

      var0.o = var6;
      boolean var4;
      if (!(var4 = var1.f.readBoolean()) && var0.p) {
         var3 = 9 * ev.a;
      }

      var0.p = var4;
      if (var3 >= 0) {
         k4.b(0, var0.h * gx.j + 11, var0.i * gx.j, b2.b(0, var3, 13 * ev.a, 9 * ev.a, fj.R.e), -1);
      }
   }

   private static void b(iu var0, ij var1) {
      var0.F = var1.f.readInt();
      byte var2 = var1.f.readByte();
      fj.b(var0.G, var2, null, var0);
      var0.G = var2;
      var1.f.readByte();
      var0.N = var1.f.readByte();
      var0.H = var1.f.readBoolean();
      boolean var5 = var1.f.readBoolean();
      boolean var4 = var1.f.readBoolean();
      int var3 = -1;
      if (!var5 && var0.I[0]) {
         var3 = 0;
      }

      if (!var4 && var0.I[1]) {
         var3 = 13 * ev.a;
      }

      if (var3 >= 0) {
         k4.b(0, var0.a, var0.b - var0.e, b2.b(0, var3, 9 * ev.a, 13 * ev.a, fj.V.e), -1);
      }

      var0.I[0] = var5;
      var0.I[1] = var4;
   }

   private static void a(ij var0) {
      int var1 = var0.f.readInt();
      Vector var2 = new Vector();
      Vector var3 = new Vector();
      byte var4 = 0;
      if (var1 != -1) {
         var4 = var0.f.readByte();

         for(int var5 = 0; var5 < var4; ++var5) {
            im var6;
            (var6 = new im()).j = var0.f.readByte();
            if (var6.j == -1) {
               var2.addElement(var6);
            } else {
               b(var6, var0);
               var2.addElement(var6);
            }
         }

         byte var10 = var0.f.readByte();
         if (gx.b != 24 || GameMidlet.k.f != var1) {
            iv.S = 0;
            iw.R = 0;
            iz.S = 0;
            fj.J.removeAllElements();
         }

         for(int var12 = 0; var12 < var10; ++var12) {
            Object var7 = null;
            byte var8 = var0.f.readByte();
            int var9 = fj.J.size();
            if (gx.b == 24 && var9 != 0 && var9 == var10) {
               fj.i(var12);
               var7 = (iu)fj.J.elementAt(var12);
            } else {
               n var17 = f8.d(var8);
               if (var8 != -1) {
                  switch(var17.d) {
                     case 1:
                        var7 = new iz(var12, var8);
                        break;
                     case 2:
                        var7 = new iv(var12, var8);
                        break;
                     case 3:
                        var7 = new iw(var12, var8);
                        break;
                     case 4:
                        var7 = new i0(var12, var8);
                  }
               }
            }

            if (var8 != -1 && var7 != null) {
               ((iu)var7).J = var8;
               b((iu)var7, var0);
               var3.addElement(var7);
            }
         }
      }

      byte var11 = var0.f.readByte();
      byte var13 = var0.f.readByte();
      (fj.aC = new ip()).h = var0.f.readShort();
      fj.aC.i = var0.f.readShort();
      fj.aC.j = var0.f.readShort();
      fj.aC.k = var0.f.readShort();
      var0.f.readShort();
      var0.f.readShort();
      fj.aC.l = var0.f.readShort() * 60;
      fj.aC.o = System.currentTimeMillis();

      for(int var14 = 0; var14 < var4; ++var14) {
         ((im)var2.elementAt(var14)).u = var0.f.readByte();
      }

      short var15 = 0;
      int var16 = 0;
      if (var0.f.available() > 0) {
         var15 = var0.f.readShort();
         var16 = var0.f.readShort() * 60;
      }

      fj.g().b(var1, var2, var3, var11, var13, var15, var16);
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "yR\u007f&\u00190?y\u0018/\u0004)\u0002/v\u0012\\rK\u0017=\u0005\u0010Oc]\u001b6\u0006\u0006Zj5v";
      int var4 = "yR\u007f&\u00190?y\u0018/\u0004)\u0002/v\u0012\\rK\u0017=\u0005\u0010Oc]\u001b6\u0006\u0006Zj5v".length();
      char var1 = '\n';
      int var0 = -1;

      while(true) {
         String var10002 = b(b(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            e = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'O');
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
               var10005 = 9;
               break;
            case 1:
               var10005 = 34;
               break;
            case 2:
               var10005 = 15;
               break;
            case 3:
               var10005 = 86;
               break;
            case 4:
               var10005 = 105;
               break;
            case 5:
               var10005 = 64;
               break;
            default:
               var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
