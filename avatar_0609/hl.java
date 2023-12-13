import java.util.Vector;

public final class hl implements h7 {
   public static hl b;

   public final void b(ij var1) {
      try {
         switch(var1.b) {
            case 1:
               if (var1.f.readByte() == 0) {
                  i1[] var18 = new i1[6];

                  for(int var27 = 0; var27 < 6; ++var27) {
                     var18[var27] = new i1();
                     var18[var27].K = 0;
                     var18[var27].f = var1.f.readByte();
                     var18[var27].z = var1.f.readByte();
                     var18[var27].G = var1.f.readShort();
                     var18[var27].H = var1.f.readShort();
                  }

                  short var28 = var1.f.readShort();
                  fe.g().b(var18, var28, false, true);
                  return;
               } else if (!var1.f.readBoolean()) {
                  i1[] var26 = new i1[6];

                  for(int var33 = 0; var33 < 6; ++var33) {
                     var26[var33] = new i1();
                     var26[var33].K = 0;
                     var26[var33].f = var1.f.readByte();
                     var26[var33].G = var1.f.readShort();
                     byte var39 = var1.f.readByte();
                     var26[var33].I = new short[var39];
                     var26[var33].J = new short[var39];

                     for(int var42 = 0; var42 < var39; ++var42) {
                        var26[var33].I[var42] = var1.f.readShort();
                        var26[var33].J[var42] = var1.f.readShort();
                     }
                  }

                  short var34 = var1.f.readShort();
                  fe.g().at = var1.f.readShort();
                  fe.g().au = System.currentTimeMillis();
                  fe.g().b(var26, var34, false, false);
                  return;
               } else {
                  for(int var24 = 0; var24 < 6; ++var24) {
                     byte var32 = var1.f.readByte();
                     fe.g().G[var24].I = new short[var32];
                     fe.g().G[var24].J = new short[var32];

                     for(int var17 = 0; var17 < var32; ++var17) {
                        fe.g().G[var24].I[var17] = var1.f.readShort();
                        fe.g().G[var24].J[var17] = var1.f.readShort();
                        fe.g();
                     }
                  }

                  short var25 = var1.f.readShort();
                  fe.g().at = var1.f.readShort();
                  fe.g().au = System.currentTimeMillis();
                  fe.g().b(null, var25, true, false);
                  return;
               }
            case 2:
               short var37 = var1.f.readShort();
               String var15 = var1.f.readUTF();
               short var40 = var1.f.readShort();
               byte var22 = var1.f.readByte();
               byte var30 = var1.f.readByte();
               byte var11 = var1.f.readByte();
               fe var12;
               (var12 = fe.g()).aG = true;
               var12.aH = var37;
               var12.aJ = var15;
               var12.aI = var40;
               var12.aK = var22;
               var12.aL = var30;
               var12.aM = var11;
               return;
            case 5:
               byte var14 = var1.f.readByte();
               int var10 = var1.f.readInt();

               for(int var21 = 0; var21 < fe.g().G.length; ++var21) {
                  if (var14 == fe.g().G[var21].f) {
                     fe.g().G[var21].K = var10;
                     fe.g().O = (byte)var21;
                     break;
                  }
               }

               k4.h();
               return;
            case 8:
               byte var13;
               short[] var20 = new short[var13 = var1.f.readByte()];
               String[] var29 = new String[var13];

               for(int var36 = 0; var36 < var13; ++var36) {
                  var20[var36] = var1.f.readShort();
                  var29[var36] = var1.f.readUTF();
               }

               if (var13 > 0) {
                  k4.y = new e0(var20, var29);
                  return;
               }

               k4.h();
               return;
            case 9:
               String var3 = var1.f.readUTF();
               fe var9 = fe.g();
               Vector var19 = new Vector();
               int var4 = cl.b().e;
               if (var9.J || !var9.I) {
                  var4 += k4.o / 3;
               }

               for(int var5 = 0; var5 < gx.n.size(); ++var5) {
                  it var6;
                  if ((var6 = (it)gx.n.elementAt(var5)).d == 9 && var6.a * ev.a > var4 && var6.a * ev.a < var4 + k4.o) {
                     var19.addElement(var6);
                  }
               }

               if (var19.size() > 0) {
                  int var35 = b2.e(var19.size());
                  ((i3)var19.elementAt(var35)).w = new dq(50, var3, (byte)0);
               }

               return;
            case 10:
               fe.g().U = new e6();
               fe.g().U.o = var1.f.readByte();
               fe.g().U.n = var1.f.readUTF();
               fe.g();
               var1.f.readByte();
               fe.g().U.r = var1.f.readInt();
               fe.g().U.s = var1.f.readInt();
               fe.g().U.t = var1.f.readInt();
               fe.g().U.u = var1.f.readInt();
            case 3:
            case 4:
            case 6:
            case 7:
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }
}
