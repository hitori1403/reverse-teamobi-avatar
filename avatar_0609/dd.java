import java.util.Vector;

public final class dd implements h7 {
   public static dd b;
   private static final String a;

   public final void b(ij var1) {
      try {
         byte var2 = var1.f.readByte();
         int var3 = var1.f.readByte();
         if (!ft.b(var2, (byte)var3)) {
            return;
         }

         switch(var1.b) {
            case 20:
               var2 = var1.f.readByte();
               fx.ai.aE = var2;
               fx.ai.b(var2);
               return;
            case 21:
               if ((var2 = var1.f.readByte()) == -1) {
                  fx.ai.C();
                  fx.ai.aL = false;
                  return;
               }

               if (var2 != -1) {
                  for(int var46 = 0; var46 < 6; ++var46) {
                     fx.ai.aC[var2][var46] = var1.f.readByte();
                  }

                  fx var18 = fx.ai;
                  fx.ai.ax = var2;
                  var18.aB[var18.ax] = true;
                  var18.A();
                  return;
               }
               break;
            case 37:
               byte[] var44 = new byte[3];

               for(int var28 = 0; var28 < 3; ++var28) {
                  var44[var28] = var1.f.readByte();
               }

               fx var16 = fx.ai;
               fx.ai.aD = var44;
               Vector var29 = new Vector();

               for(int var45 = 0; var45 < 6; ++var45) {
                  h8 var52 = new h8();
                  if (var45 == var16.aD[0]) {
                     var52.c = 6;
                  }

                  var29.addElement(var52);
               }

               h1.b().b(var29);
               fx var17;
               if ((var17 = var16).am.size() <= 0) {
                  if (k4.o > 200) {
                     int var54 = k4.o / 2 - 64 * ev.a;

                     for(int var31 = 0; var31 < 3; ++var31) {
                        var17.b(var54 + (var31 << 6) * ev.a, 10, var31, var31);
                     }
                  } else {
                     int var53 = k4.o / 2 - 49;

                     for(int var30 = 0; var30 < 3; ++var30) {
                        var17.b(var53 + var30 * 49, 0, var30, var30);
                     }
                  }
               }

               ft.j();
               return;
            case 49:
               return;
            case 51:
               int[] var26 = new int[ft.D.size()];

               for(int var42 = 0; var42 < var26.length; ++var42) {
                  var26[var42] = var1.f.readInt();
               }

               fx var15 = fx.ai;
               fx.ai.aM = var26;
               var15.aK = true;
               ft.C = true;
               var15.g = null;
               var15.aJ = false;
               var15.aF = 0;
               var15.f = var15.ap;
               fx var27 = var15;

               for(byte var43 = 0; var43 < 5; ++var43) {
                  i3 var51;
                  if ((var51 = (i3)ft.D.elementAt(var43)).f != -1) {
                     ft.b(var51.f, String.valueOf(var27.aM[var43]));
                     var51.c(var51.c() + var27.aM[var43]);
                  }
               }

               return;
            case 60:
               var2 = var1.f.readByte();
               var3 = var1.f.readByte();
               int var11 = var1.f.readInt();
               fx var12 = fx.ai;
               fx var25 = fx.ai;
               if (var11 != 0) {
                  i3 var39 = (i3)ft.D.elementAt(var2);
                  i3 var50 = (i3)ft.D.elementAt(var3);
                  is var5;
                  (var5 = new is(var39.a, var39.b)).t = (short)var11;
                  var5.k = b2.e(3);
                  var3 = b2.b(var50.a - var39.a, -(var50.a - var39.b));
                  var5.g = var3;
                  var5.d = (byte)b2.c(-1, 1);
                  var5.j = b2.d(var5.g + var5.d * 90);
                  var3 = 10 * b2.c(var5.j) >> 10;
                  int var14 = -(10 * b2.b(var5.j)) >> 10;
                  var5.s = (short)var50.a;
                  var5.r = (short)var50.b;
                  var5.a += var3;
                  var5.b += var14;
                  var5.k = 0;
                  var5.n = (byte)(b2.e(4) + 2);
                  var5.e = (short)(8 + b2.e(5));
                  var25.aR.addElement(var5);
               }

               return;
            case 62:
               var2 = var1.f.readByte();
               fx.ai.aE = var2;

               for(int var36 = 0; var36 < ft.D.size(); ++var36) {
                  for(int var22 = 0; var22 < 6; ++var22) {
                     fx.ai.aC[var36][var22] = var1.f.readByte();
                  }
               }

               fx var10 = fx.ai;
               ft.A = false;
               ft.B = true;
               var10.al.removeAllElements();
               var10.t();

               for(int var23 = 0; var23 < ft.D.size(); ++var23) {
                  if (((i3)ft.D.elementAt(var23)).f != ft.I) {
                     var10.al.addElement(String.valueOf(var23));
                  }
               }

               var10.A();
               var10.f = ft.Z;
            default:
               return;
            case 65:
               var2 = var1.f.readByte();
               byte var35 = var1.f.readByte();
               byte var47 = var1.f.readByte();
               byte var8 = var1.f.readByte();
               if (var35 != var47 && var8 > 0) {
                  fx.ai.aC[var2][var47] = var8;
                  fx var9 = fx.ai;
                  if (var35 != var47) {
                     var9.ax = var2;
                     var9.av = var35;
                     var9.aw = var47;
                     var9.aI = true;
                     var9.aG = 3;
                  }

                  return;
               }
               break;
            case 100:
               var2 = var1.f.readByte();
               fx var7 = fx.ai;
               var3 = ft.g(GameMidlet.k.f);
               i3 var4 = (i3)ft.D.elementAt(var2);
               if (var3 == var2) {
                  var7.aB[var3] = false;
                  var7.aH = true;
                  var7.g = null;
                  var7.aG = 2;
                  var7.aL = false;
               }

               var7.E = var4.f;
               ft.N = var7.aE;
               ft.M = (long)k4.j();
               if (!var7.aJ) {
                  var7.aJ = true;
               }

               if (GameMidlet.k.f != ft.I && var3 == var2) {
                  var7.f = ft.X;
                  var7.f.b = a;
                  var7.g = var7.ao;
               }

               return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   static {
      String var10002 = a(a("IvẌ!"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'v');
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
               var10005 = 30;
               break;
            case 2:
               var10005 = 65;
               break;
            case 3:
               var10005 = 79;
               break;
            case 4:
               var10005 = 55;
               break;
            case 5:
               var10005 = 112;
               break;
            default:
               var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
