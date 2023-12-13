import java.util.Vector;

public final class h0 extends hs implements h7 {
   private static h0 d;
   private static final String[] e;

   static {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "I\u000f|\u0011\u0014p\u001e\u0002*@\u0002*@";
      int var4 = "I\u000f|\u0011\u0014p\u001e\u0002*@\u0002*@".length();
      char var1 = 7;
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
                     d = new h0();
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

                  var2 = "*@1X\u00020@";
                  var4 = "*@1X\u00020@".length();
                  var1 = 4;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static void b() {
      ft.ae = 2;
      fr.C = 0;
      fh.b(2, fu.u());
      h3.d.e = d;
   }

   public final void b(ij var1) {
      try {
         int var2 = var1.b().readByte();
         int var3 = var1.b().readByte();
         if (ft.b(var2, var3)) {
            switch(var1.b) {
               case 20:
                  var2 = var1.b().readByte();
                  var3 = var1.b().readInt();
                  byte[][] var44 = new byte[8][8];

                  for(int var53 = 0; var53 < 8; ++var53) {
                     for(int var62 = 0; var62 < 8; ++var62) {
                        var44[var53][var62] = var1.b().readByte();
                     }
                  }

                  for(int var54 = 0; var54 < 2; ++var54) {
                     i3 var65;
                     (var65 = ft.f(var1.b().readInt())).aA = var1.b().readShort();
                     var65.aw = var65.ax = 0;
                     var65.au = var65.ay = var1.b().readShort();
                     var65.av = var1.b().readShort();
                     var65.az = var1.b().readShort();
                     var65.p <<= 1;
                     var65.f(4);
                  }

                  fu.u().b(var3, var2, var44);
                  return;
               case 21:
                  int var51 = var1.b().readInt();
                  byte var68 = var1.b().readByte();
                  byte var38 = var1.b().readByte();
                  fu var17;
                  if (!(var17 = fu.u()).aB) {
                     i3 var52;
                     if ((var52 = ft.f(var51)) != null && var52.q == 4) {
                        var52.q = 0;
                     }

                     if (var51 == GameMidlet.k.f) {
                        var17.aL = true;
                        var17.y();
                        var17.aM = true;
                        return;
                     }

                     var17.f = ft.Z;
                     var17.g = null;
                     var17.an = var68;
                     var17.az = var38;
                     var17.x();
                     if (var51 == -1) {
                        var17.at = false;
                        var17.an = -1;
                     }
                  }

                  return;
               case 24:
                  var2 = var1.b().readInt();
                  byte[][] var37 = new byte[8][8];

                  for(int var43 = 0; var43 < 8; ++var43) {
                     for(int var50 = 0; var50 < 8; ++var50) {
                        var37[var43][var50] = var1.b().readByte();
                     }
                  }

                  fu var16;
                  (var16 = fu.u()).T = var2;
                  if (var2 == GameMidlet.k.f) {
                     var16.aD = true;
                  }

                  var16.b(var37);
                  return;
               case 49:
                  int var14 = var1.b().readInt();
                  fu var15;
                  if (!(var15 = fu.u()).aB) {
                     var15.an = -1;
                     ft.L = System.currentTimeMillis() + (long)(ft.N * 1000);
                     var15.T = var14;
                     var15.aM = false;
                     if (var14 == GameMidlet.k.f) {
                        if (!var15.w()) {
                           h1.b().j();
                           return;
                        }

                        var15.g = var15.aw;
                        var15.f = var15.av;
                        if (i5.b) {
                           var15.aN = new i5(var15.aj);
                           if (var15.aN.d() != -1) {
                              var15.az = var15.aN.c();
                              var15.an = var15.aN.d();
                              var15.au = false;
                              var15.x();
                              return;
                           }

                           var15.v();
                           return;
                        }
                     } else {
                        var15.aL = false;
                        var15.f = null;
                        var15.g = null;
                     }
                  }

                  return;
               case 51:
                  Vector var42 = new Vector();

                  for(int var49 = 0; var49 < 2; ++var49) {
                     var2 = var1.b().readInt();
                     var3 = var1.b().readInt();
                     i3 var26;
                     i3 var75 = var26 = ft.f(var2);
                     var75.p /= 2;
                     var26.q = 0;
                     var26.c(var26.c() + var3);
                     if (var3 != 0) {
                        k4.b(var3, var26.a, var26.b, 30);
                        StringBuffer var76 = new StringBuffer(String.valueOf(var26.g));
                        String[] var72 = e;
                        String var60 = var76.append(var72[4]).toString();
                        if (var3 > 0) {
                           fu.u().aA = var26.f;
                           var60 = var60 + hq.aQ + var72[3] + var3 + hq.D;
                        } else {
                           StringBuffer var77 = new StringBuffer(String.valueOf(var60)).append(hq.aR);
                           var72 = e;
                           var60 = var77.append(var72[2]).append(var3).append(hq.D).toString();
                        }

                        var42.addElement(e[1]);
                        var42.addElement(var60);
                     }
                  }

                  fu.u().b(var42);
                  return;
               case 64:
                  byte var45;
                  byte[] var6 = new byte[var45 = var1.b().readByte()];
                  cn[] var7 = new cn[var45];

                  for(int var21 = 0; var21 < var45; ++var21) {
                     var7[var21] = new cn();
                     var6[var21] = var1.b().readByte();
                     var7[var21].d = var1.b().readByte();
                     var7[var21].e = var1.b().readByte();
                  }

                  byte var22 = var1.b().readByte();
                  byte var33 = var1.b().readByte();
                  Vector var40 = new Vector();

                  for(int var46 = 0; var46 < var33; ++var46) {
                     String var8 = var1.b().readUTF();
                     var40.addElement(var8);
                  }

                  for(int var47 = 0; var47 < 2; ++var47) {
                     i3 var34;
                     (var34 = ft.f(var1.b().readInt())).as = var1.b().readByte();
                     var34.aA = var1.b().readShort();
                     var34.aw = (short)(var1.b().readShort() - var34.au);
                     var34.ax = (short)(var1.b().readShort() - var34.av);
                     var34.aq = var1.b().readBoolean();
                     if (var34.aq) {
                        fu.u().aC = true;
                     }
                  }

                  fu var74 = fu.u();
                  Vector var48 = var40;
                  cn[] var35 = var7;
                  byte[] var23 = var6;
                  fu var13 = var74;

                  for(int var55 = 0; var55 < var23.length; ++var55) {
                     var13.aj[var23[var55] / 8][var23[var55] % 8].q = true;
                     if (k4.p > 300) {
                        boolean var66 = false;

                        for(int var63 = 0; var63 < var13.aK.size(); ++var63) {
                           is[] var10001 = var13.aj[var23[var55] / 8];
                           is var9;
                           if ((var9 = (is)var13.aK.elementAt(var63)).o == var10001[var23[var55] % 8].o) {
                              var9.l += 20;
                              var66 = true;
                              ++var9.n;
                              break;
                           }
                        }

                        if (!var66) {
                           is var69;
                           (var69 = new is()).o = var13.aj[var23[var55] / 8][var23[var55] % 8].o;
                           var69.l = 40;
                           var69.n = 1;
                           var69.k = var13.T;
                           var13.aK.addElement(var69);
                        }
                     }
                  }

                  fu var67 = var13;

                  for(int var70 = 0; var70 < 8; ++var70) {
                     for(int var56 = 0; var56 < 8; ++var56) {
                        if (var67.aj[var70][var56].q) {
                           var67.aj[var70][var56].q = false;
                           var67.b(var67.aj[var70][var56].a + 12, var67.aj[var70][var56].b + 12, var67.aj[var70][var56].o);
                           var67.aj[var70][var56].o = -1;
                        }
                     }
                  }

                  var67.z();

                  for(int var57 = 0; var57 < var35.length; ++var57) {
                     int var64 = var35[var57].d;
                     var13.aj[var64 / 8][var64 % 8].o = var35[var57].e;
                  }

                  if (var22 > 1) {
                     String[] var10 = e;
                     k4.b(var10[0].concat(String.valueOf((int)var22)), k4.q, k4.r, 1, 20);
                  }

                  if (var40.size() > 0) {
                     for(int var58 = 0; var58 < var48.size(); ++var58) {
                        k4.b((String)var48.elementAt(var58), k4.q, k4.r + 40, 1, var58 * 30);
                     }
                  }

                  for(int var59 = 0; var59 < 2; ++var59) {
                     i3 var71;
                     (var71 = (i3)ft.D.elementAt(var59)).f(4);
                     if (var71.f != var13.T && var71.as > 0) {
                        i3 var24;
                        if ((var24 = ft.f(var13.T)).Z != -1) {
                           var24.a(var71.a, var71.b);
                        }

                        var24.Z = -1;
                        if (var71.aA > 0) {
                           var71.at = 20;
                        }
                     }
                  }

                  k4.h();
                  return;
               case 71:
                  byte[][] var5 = new byte[8][];

                  for(int var18 = 0; var18 < 8; ++var18) {
                     var5[var18] = new byte[8];
                  }

                  for(int var19 = 0; var19 < 8; ++var19) {
                     for(int var31 = 0; var31 < 8; ++var31) {
                        var5[var19][var31] = var1.b().readByte();
                     }
                  }

                  fu var10000 = fu.u();
                  byte[][] var20 = var5;
                  fu var12 = var10000;

                  for(int var32 = 7; var32 >= 0; --var32) {
                     for(int var4 = 7; var4 >= 0; --var4) {
                        var12.aj[var32][var4].o = var20[var32][var4];
                     }
                  }

                  return;
            }
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      }
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'f');
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
               var10005 = 10;
               break;
            case 1:
               var10005 = 96;
               break;
            case 2:
               var10005 = 17;
               break;
            case 3:
               var10005 = 115;
               break;
            case 4:
               var10005 = 123;
               break;
            case 5:
               var10005 = 80;
               break;
            default:
               var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
