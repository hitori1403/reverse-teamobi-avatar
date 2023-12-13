import java.util.Vector;

public final class ht extends hs implements h7 {
   private static ht d = new ht();

   public static void b() {
      ft.ae = 4;
      fr.C = fr.A;
      fh.b(1, fw.u());
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
                  Vector var49 = new Vector();

                  for(int var61 = 0; var61 < 9; ++var61) {
                     byte var69 = var1.b().readByte();
                     var49.addElement(new b3(var69));
                  }

                  int var62 = var1.b().readInt();
                  int var70 = var1.b().readInt();
                  k4.h();
                  ft.r();
                  fw.u().b(var2, var49, var62, var70);
                  return;
               case 21:
                  var2 = var1.b().readInt();
                  var3 = var1.b().readInt();
                  byte var60 = var1.b().readByte();
                  byte var68 = 0;
                  if (var60 != -1) {
                     var68 = var1.b().readByte();
                  }

                  k4.h();
                  fw var22 = fw.u();
                  if (var60 == -1) {
                     var22.y();
                     k4.c(hq.aZ);
                     return;
                  }

                  if (var2 == GameMidlet.k.f) {
                     var22.D();
                  }

                  var22.z();
                  ft.M = (long)k4.j();
                  int var75;
                  if ((var75 = ft.g(var3)) != -1) {
                     var22.am.b = ft.ab[ft.P[var75]].b;
                     if (var3 == GameMidlet.k.f) {
                        var22.am.b = var22.al.b + var22.F * fw.a0;
                     }

                     if (var2 == GameMidlet.k.f) {
                        if (fw.b(var22.ak[ft.K]) != -1 && fw.b(var22.ak[ft.K]) <= 3) {
                           var22.x();
                        }

                        var22.H();
                        var22.G();
                     }

                     var22.am.c = ft.ab[ft.P[var75]].c;
                     var22.aH = var60;
                     var22.E = var2;
                     var22.aG = var3;
                     var22.aC[var75] = var68;
                     var22.as = true;
                     var22.aj[var75]++;
                  }

                  return;
               case 49:
                  var2 = var1.b().readInt();
                  int var20 = var1.b().readInt();
                  fw var21 = fw.u();
                  if (ft.g(var2) != -1) {
                     var21.aI = var20;
                     if (var2 == GameMidlet.k.f && var21.E != var2) {
                        var21.x();
                        var21.a(false);
                     }

                     var21.E = var2;
                     ft.M = (long)k4.j();
                  }

                  return;
               case 51:
                  int[] var79 = new int[4];

                  for(int var33 = 0; var33 < 4; ++var33) {
                     var79[var33] = var1.b().readInt();
                  }

                  int[] var34 = new int[4];

                  for(int var45 = 0; var45 < 4; ++var45) {
                     var34[var45] = var1.b().readInt();
                  }

                  int[][] var46 = new int[4][11];

                  for(int var58 = 0; var58 < 4; ++var58) {
                     for(int var66 = 0; var66 < 11; ++var66) {
                        var46[var58][var66] = -1;
                     }
                  }

                  int var59 = 0;
                  int var67 = 0;

                  while(var1.b().available() > 0) {
                     byte var74;
                     if ((var74 = var1.b().readByte()) == -1) {
                        if (var59 < 3) {
                           ++var59;
                        }

                        var67 = 0;
                     } else {
                        var46[var59][var67] = var74;
                        if (var67 < 10) {
                           ++var67;
                        }
                     }
                  }

                  k4.h();
                  fw.u().b(var34, var46);
                  return;
               case 62:
                  byte var57 = var1.b().readByte();
                  var2 = var1.b().readInt();
                  var3 = var1.b().readInt();
                  int var65 = var1.b().readInt();
                  int[][] var73 = new int[4][4];
                  int[][] var78 = new int[4][3];

                  for(int var8 = 0; var8 < 4; ++var8) {
                     for(int var9 = 0; var9 < 4; ++var9) {
                        var73[var8][var9] = -1;
                        if (var9 < 3) {
                           var78[var8][var9] = -1;
                        }
                     }
                  }

                  int var80 = 0;
                  int var81 = 0;

                  byte var12;
                  for(int var10 = 0; var10 < 4; ++var10) {
                     for(int var11 = 0; var11 < 3 && (var12 = var1.b().readByte()) != -2 && var12 != -1; ++var11) {
                        var78[var10][var11] = var12;
                     }
                  }

                  while(var1.b().available() > 0) {
                     byte var82 = var1.b().readByte();
                     if (var80 < 3 && var82 == -1) {
                        ++var80;
                        var81 = 0;
                     } else {
                        var73[var80][var81] = var82;
                        if (var81 < 3) {
                           ++var81;
                        }
                     }
                  }

                  fw.u().b(var57, var2, var3, var73, var78, var65);
                  return;
               case 63:
                  byte var18 = var1.b().readByte();
                  k4.h();
                  fw var19;
                  (var19 = fw.u()).D();
                  fw var42 = var19;
                  int var56 = 0;

                  int var85;
                  while(true) {
                     if (var56 >= 10) {
                        var85 = -1;
                        break;
                     }

                     if (var42.au[var56].c == -1) {
                        var85 = var56;
                        break;
                     }

                     if (var42.k(var42.au[var56].b)) {
                        for(int var64 = 9; var64 > var56; --var64) {
                           var42.au[var64] = var42.au[var64 - 1];
                        }

                        var85 = var56;
                        break;
                     }

                     ++var56;
                  }

                  var3 = var85;
                  var19.bb = var3;
                  var19.aS = true;
                  var19.aV = new b3((byte)var18, true);
                  return;
               case 64:
                  var2 = var1.b().readInt();
                  boolean var41 = var1.b().readBoolean();
                  byte var55 = 0;
                  if (var41) {
                     var55 = var1.b().readByte();
                  }

                  byte var17 = var1.b().readByte();
                  k4.h();
                  fw.u().b(var41, var55, var2, var17);
                  return;
               case 65:
                  var2 = var1.b().readInt();
                  boolean var39 = var1.b().readBoolean();
                  boolean var50 = var1.b().readBoolean();
                  int[] var5 = new int[4];
                  int[] var71 = new int[12];
                  if (var39) {
                     for(int var7 = 0; var7 < 4; ++var7) {
                        var5[var7] = var1.b().readInt();
                     }

                     for(int var76 = 0; var76 < 12; ++var76) {
                        var71[var76] = -1;
                     }

                     for(int var77 = 0; var1.b().available() > 0; ++var77) {
                        var71[var77] = var1.b().readByte();
                     }
                  }

                  k4.h();
                  fw var83 = fw.u();
                  int[] var40 = var71;
                  fw var16 = var83;
                  int var72 = ft.g(var2);
                  if (!var39) {
                     k4.c(hq.ak);
                     return;
                  }

                  if (var2 == GameMidlet.k.f) {
                     var16.D();
                  }

                  var16.I();
                  var16.aN = var50;
                  var2 = 1;

                  for(int var51 = 0; var51 < var16.aw[var72].length; ++var51) {
                     if (var16.aw[var72][var51] == -1) {
                        if (var2 == 1) {
                           var2 = var51;
                           break;
                        }

                        var2 = 1;
                     } else {
                        var2 = 0;
                     }
                  }

                  for(int var52 = var2; var52 < var40.length; ++var52) {
                     if (var40[var52 - var2] != -1) {
                        var16.aw[var72][var52] = var40[var52 - var2];
                     }
                  }

                  if (GameMidlet.k.f == var2) {
                     var16.aO = true;

                     for(int var53 = 0; var53 < 10; ++var53) {
                        for(int var29 = 0; var29 < var40.length; ++var29) {
                           if (var16.au[var53].c == var40[var29]) {
                              var16.h(var53);
                              break;
                           }
                        }
                     }

                     var16.y();
                     var16.au = fw.c(var16.au);
                     if (var16.au[var16.F].c == -1) {
                        var16.F = var16.L() - 1;
                     }

                     var16.a(false);
                  }

                  if (var16.aN) {
                     var16.aL = true;
                     var16.B();
                  }

                  var16.az[var72] = 0;

                  for(int var54 = 0; var54 < var16.aw[var72].length; ++var54) {
                     if (var16.aw[var72][var54] != -1) {
                        var16.az[var72]++;
                     }
                  }

                  return;
               case 67:
                  boolean var6 = var1.b().readBoolean();
                  var2 = (byte)-1;
                  if (var6) {
                     var2 = var1.b().readByte();
                  }

                  k4.h();
                  fw.u().b(var6, var2);
                  return;
               case 68:
                  byte var14 = var1.b().readByte();
                  k4.h();
                  fw var15;
                  (var15 = fw.u()).D();
                  var15.aR = false;
                  if (var14 == 0) {
                     if (var15.a8 == -1) {
                        var15.au[var15.F] = var15.aJ;
                        var15.au[var15.F].b = 0;
                        var15.aJ = new b3((byte)-1, true);
                        if (var15.aK != var15.F) {
                           var15.H();
                           var15.G();
                        }

                        var15.aK = -1;
                     } else if (var15.a8 >= 0) {
                        var15.aJ = new b3((byte)-1, true);
                        if (var15.aK != var15.F) {
                           var15.au[var15.F].b = 0;
                           var15.H();
                           var15.G();
                        }
                     }
                  } else if (var15.a8 == -1) {
                     var15.h(var15.F);
                     var15.C();
                  } else if (var15.a8 >= 0) {
                     var15.h(var15.F);
                     var15.C();
                     var15.au[var15.aK].b = (byte)var15.a8;
                  }

                  var15.a8 = -2;
                  var15.a(false);
                  return;
               case 69:
                  var2 = var1.b().readInt();
                  int[] var38 = new int[4];

                  for(int var4 = 0; var4 < 4; ++var4) {
                     var38[var4] = var1.b().readInt();
                  }

                  fw.u().l(var2);
                  return;
               case 70:
                  var1.b().readInt();
                  fw.u().J();
            }
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }
   }
}
