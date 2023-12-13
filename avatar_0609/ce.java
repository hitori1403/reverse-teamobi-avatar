import java.util.Hashtable;

public final class ce {
   private static String b;
   static int c;
   static int d;
   public static Hashtable e;
   public static Hashtable f;
   static boolean g;
   public static boolean h;
   private static boolean i;
   private static final String[] a;

   static {
      String[] var5 = new String[37];
      int var3 = 0;
      String var2 = "\u0016Aq`\"cr\rSdw\u0004=[}s\rřÑ0uỪR$'Zẽbg\n\u0015$[sd(G` Fyy)\ft%Sdp(Pi\u0015$[sd(G` Fyy)\ft%Sdp(Pi\u0004\u001f[ỗb\u0006řÓ`6¦L\u000f!Fdf}\r+<BhciLa=\u0003\b\\x\u000f!Fdf}\r+<BhciLa=\u0007*]>q.Ck\u0014`\u0012fö(\u0002pẢ\u0012ā\u007fẄL$=[ắx \u0002\u000e\nÁ0zẐK$1ẑi65C%\u0004\u001f[ỗb\u0003g\u001c>\u0006(\\ca\"P\u001ařS~qgNạ0\u0012tỹgNmẎG0bẬ\u0002ĕ ự~8i\u0006$W}y5[\b8Gue3Kk'\u0007,\\wz.Ql\u0014`\u0012fö(\u0002pẢ\u0012ā\u007fẄL$=[ắx \u0002\t.WdW1fe=S\u0007?[ub)Ci\n:Sfs\u0006T@(Fq\u0007,\\wz.Ql\n=[ux \fr Wd\t=[ux \fe'Z\u0004'G|z\n\u0016Uub\u0006T@(Fq\b9^qb!Mv$\u0007?[ub)Ci\u0004=[}s\b(Dqb&PE\u001f\třÑ0b/Èii\u001a\u00159@\u007f`.Fa;s~r\u0004Nm,\\dB>Ra";
      int var4 = "\u0016Aq`\"cr\rSdw\u0004=[}s\rřÑ0uỪR$'Zẽbg\n\u0015$[sd(G` Fyy)\ft%Sdp(Pi\u0015$[sd(G` Fyy)\ft%Sdp(Pi\u0004\u001f[ỗb\u0006řÓ`6¦L\u000f!Fdf}\r+<BhciLa=\u0003\b\\x\u000f!Fdf}\r+<BhciLa=\u0007*]>q.Ck\u0014`\u0012fö(\u0002pẢ\u0012ā\u007fẄL$=[ắx \u0002\u000e\nÁ0zẐK$1ẑi65C%\u0004\u001f[ỗb\u0003g\u001c>\u0006(\\ca\"P\u001ařS~qgNạ0\u0012tỹgNmẎG0bẬ\u0002ĕ ự~8i\u0006$W}y5[\b8Gue3Kk'\u0007,\\wz.Ql\u0014`\u0012fö(\u0002pẢ\u0012ā\u007fẄL$=[ắx \u0002\t.WdW1fe=S\u0007?[ub)Ci\n:Sfs\u0006T@(Fq\u0007,\\wz.Ql\n=[ux \fr Wd\t=[ux \fe'Z\u0004'G|z\n\u0016Uub\u0006T@(Fq\b9^qb!Mv$\u0007?[ub)Ci\u0004=[}s\b(Dqb&PE\u001f\třÑ0b/Èii\u001a\u00159@\u007f`.Fa;s~r\u0004Nm,\\dB>Ra"
         .length();
      char var1 = 11;
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
                     b = a[32];
                     e = new Hashtable();
                     f = new Hashtable();
                     g = true;
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

                  var2 = "=K`s\u0003\b\\x";
                  var4 = "=K`s\u0003\b\\x".length();
                  var1 = 4;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   static void b(String var0, String var1) {
      if (g) {
         try {
            String[] var4 = a;
            if (var0.indexOf(var4[10]) != -1) {
               boolean var2 = var0.indexOf(var4[26]) != -1;
               var4 = a;
               boolean var6 = var0.indexOf(var4[25]) != -1;
               if (var2 && var1.toLowerCase().indexOf(GameMidlet.k.g.toLowerCase()) != -1) {
                  ++c;
               } else if (var6 && var1.toLowerCase().indexOf(GameMidlet.k.g.toLowerCase()) != -1) {
                  ++d;
               }

               if (var2) {
                  if (var1.indexOf("-") != -1) {
                     i = false;
                     k4.h();
                     b = var0 = var1.substring(0, var1.indexOf("-")).trim();
                     if (e.containsKey(var0)) {
                        hv.b().b((String)e.get(var0));
                     } else {
                        i = true;
                     }
                  }
               } else if (var6) {
                  var4 = a;
                  if (var1.indexOf(var4[14]) != -1) {
                     i = false;
                     k4.h();
                     b = var1;
                     if (f.containsKey(var1)) {
                        hv.b().b((String)f.get(var1));
                     } else {
                        i = true;
                     }
                  }
               }

               var4 = a;
               if (var1.indexOf(var4[6]) != -1) {
                  var0 = var1.substring(var1.lastIndexOf(32) + 1).trim();
                  Hashtable var3 = var2 ? e : f;
                  if (i) {
                     var4 = a;
                     StringBuffer var20 = new StringBuffer(var4[33]).append(var0).append(var4[20]);
                     String var22;
                     if (var2) {
                        var22 = var4[8];
                     } else {
                        var4 = a;
                        var22 = var4[13];
                     }

                     k4.c(var20.append(var22).toString());
                     new StringBuffer(String.valueOf(b)).append("-").append(var0);
                     String var21 = b;
                     String var23;
                     if (var2) {
                        var4 = a;
                        var23 = var4[19];
                     } else {
                        var4 = a;
                        var23 = var4[22];
                     }

                     b(var21, var0, var23);
                     var3.put(b, var0);
                     return;
                  }

                  if (var3.containsKey(var1) && !((String)var3.get(var1)).equals(var0)) {
                     var4 = a;
                     StringBuffer var10000 = new StringBuffer(var4[2]).append(var0).append(var4[11]);
                     String var10001;
                     if (var2) {
                        var10001 = var4[36];
                     } else {
                        var4 = a;
                        var10001 = var4[5];
                     }

                     k4.c(var10000.append(var10001).toString());
                     var3.put(b, var0);
                     new StringBuffer(String.valueOf(b)).append("-").append(var0);
                     String var19 = b;
                     String var10002;
                     if (var2) {
                        var4 = a;
                        var10002 = var4[24];
                     } else {
                        var10002 = a[30];
                     }

                     b(var19, var0, var10002);
                     return;
                  }
               }
            }
         } catch (Exception var5) {
         }
      }
   }

   private static void b(String var0, String var1, String var2) {
      ji var3 = new ji();
      long var4 = System.currentTimeMillis();

      try {
         String[] var6 = a;
         var3.b(var6[1], var4);
         var3.b(var6[18], var0);
         var3.b(var6[15], var1);
         var3.b(var6[35], var2);
      } catch (d var8) {
         var8.printStackTrace();
      }

      try {
         String[] var9 = a;
         new Thread(new makeRequest(new c6(c8.b(var9[0])).b(var3.toString()), var9[7], var9[23], new di())).start();
      } catch (Exception var7) {
      }
   }

   public static void b() {
      i = false;
      if (!h) {
         String[] var4 = a;
         k4.d(var4[16]);
         ji var0 = new ji();
         long var1 = System.currentTimeMillis();

         try {
            Runtime var3 = Runtime.getRuntime();
            var0.b(var4[31], var1);
            var0.b(var4[17], var3.totalMemory() / 1024L);
            var0.b(var4[34], fb.S + ":" + fc.X);
            String var10001 = var4[29];
            String var10002;
            if (System.getProperty(var4[4]) == null) {
               var10002 = var4[27];
            } else {
               var4 = a;
               var10002 = System.getProperty(var4[3]);
            }

            var0.b(var10001, var10002);
         } catch (d var5) {
            var5.printStackTrace();
         }

         try {
            var4 = a;
            new Thread(new makeRequest(new c6(c8.b(var4[28])).b(var0.toString()), var4[9], var4[21], new eg(var1))).start();
            return;
         } catch (Exception var6) {
            k4.c(a[12]);
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
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
               var10005 = 73;
               break;
            case 1:
               var10005 = 50;
               break;
            case 2:
               var10005 = 16;
               break;
            case 3:
               var10005 = 22;
               break;
            case 4:
               var10005 = 71;
               break;
            case 5:
               var10005 = 34;
               break;
            default:
               var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
