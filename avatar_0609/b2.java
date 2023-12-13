import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class b2 {
   public static Random b;
   private static short[] c;
   private static short[] d;
   private static int[] e;
   public static String f;
   private static final String[] a;

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0004q2# \u0005\u001dd$\\W";
      int var4 = "\u0004q2# \u0005\u001dd$\\W".length();
      char var1 = 5;
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
                     b = new Random();
                     c = new short[]{
                        0,
                        18,
                        36,
                        54,
                        71,
                        89,
                        107,
                        125,
                        143,
                        160,
                        178,
                        195,
                        213,
                        230,
                        248,
                        265,
                        282,
                        299,
                        316,
                        333,
                        350,
                        367,
                        384,
                        400,
                        416,
                        433,
                        449,
                        465,
                        481,
                        496,
                        512,
                        527,
                        543,
                        558,
                        573,
                        587,
                        602,
                        616,
                        630,
                        644,
                        658,
                        672,
                        685,
                        698,
                        711,
                        724,
                        737,
                        749,
                        761,
                        773,
                        784,
                        796,
                        807,
                        818,
                        828,
                        839,
                        849,
                        859,
                        868,
                        878,
                        887,
                        896,
                        904,
                        912,
                        920,
                        928,
                        935,
                        943,
                        949,
                        956,
                        962,
                        968,
                        974,
                        979,
                        984,
                        989,
                        994,
                        998,
                        1002,
                        1005,
                        1008,
                        1011,
                        1014,
                        1016,
                        1018,
                        1020,
                        1022,
                        1023,
                        1023,
                        1024,
                        1024
                     };
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

                  var2 = "\u0004q2# \u0005\u001dd$\\W";
                  var4 = "\u0004q2# \u0005\u001dd$\\W".length();
                  var1 = 5;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static void b() {
      d = new short[91];
      e = new int[91];

      for(int var0 = 0; var0 <= 90; ++var0) {
         d[var0] = c[90 - var0];
         if (d[var0] == 0) {
            e[var0] = Integer.MAX_VALUE;
         } else {
            e[var0] = (c[var0] << 10) / d[var0];
         }
      }
   }

   public static final int b(int var0) {
      if ((var0 = d(var0)) >= 0 && var0 < 90) {
         return c[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return c[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -c[var0 - 180] : -c[360 - var0];
      }
   }

   public static final int c(int var0) {
      if ((var0 = d(var0)) >= 0 && var0 < 90) {
         return d[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return -d[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -d[var0 - 180] : d[360 - var0];
      }
   }

   public static final int b(int var0, int var1) {
      int var10000;
      if (var0 == 0) {
         var10000 = var1 > 0 ? 90 : 270;
      } else {
         int var2 = Math.abs((var1 << 10) / var0);
         int var3 = 0;

         while(true) {
            if (var3 > 90) {
               var2 = 0;
            } else {
               if (e[var3] < var2) {
                  ++var3;
                  continue;
               }

               var2 = var3;
            }

            var2 = var2;
            if (var1 >= 0 && var0 < 0) {
               var2 = 180 - var2;
            }

            if (var1 < 0 && var0 < 0) {
               var2 += 180;
            }

            if (var1 >= 0 || var0 < 0) {
               return var2;
            }

            var10000 = 360 - var2;
            break;
         }
      }

      return var10000;
   }

   public static final int d(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   public static int c() {
      return b.nextInt() % 2;
   }

   public static int e(int var0) {
      return b.nextInt(var0);
   }

   public static int c(int var0, int var1) {
      return b.nextInt(2) == 0 ? var0 : var1;
   }

   public static int f(int var0) {
      return var0 >= 0 ? var0 : -var0;
   }

   public static void d() {
      GameMidlet.q = c(ib.m);
      fb.S = c(GameMidlet.p);
      AutoController.L = c(f);
   }

   public static int b(int var0, int var1, int var2, int var3) {
      if ((var0 = (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)) <= 0) {
         return 0;
      } else {
         var1 = (var0 + 1) / 2;

         do {
            var2 = var1;
            var1 = var1 / 2 + var0 / (var1 << 1);
         } while(Math.abs(var2 - var1) > 1);

         return var1;
      }
   }

   private static byte[] b(byte[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            var0[var1] = (byte)(~var0[var1]);
         }
      }

      return var0;
   }

   public static void b(String var0, byte[] var1) {
      try {
         var1 = b(var1);
         RecordStore var3;
         if ((var3 = RecordStore.openRecordStore(a[2].concat(String.valueOf(var0)), true)).getNumRecords() > 0) {
            var3.setRecord(1, var1, 0, var1.length);
         } else {
            var3.addRecord(var1, 0, var1.length);
         }

         var3.closeRecordStore();
      } catch (Exception var2) {
         var2.getMessage();
      }
   }

   public static byte[] b(String var0) {
      try {
         RecordStore var1;
         var3 = (var1 = RecordStore.openRecordStore(a[0].concat(String.valueOf(var0)), false)).getRecord(1);
         var1.closeRecordStore();
      } catch (Exception var2) {
         return null;
      }

      return b(var3);
   }

   public static void b(String var0, String var1) {
      try {
         b(var0, var1.getBytes(a[1]));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static String c(String var0) {
      byte[] var2;
      if ((var2 = b(var0)) == null) {
         return null;
      } else {
         try {
            return new String(var2, a[3]);
         } catch (Exception var1) {
            return new String(var2);
         }
      }
   }

   public static Image b(int var0, int var1, int var2, int var3, Image var4) {
      int[] var5 = new int[var2 * var3];
      var4.getRGB(var5, 0, var2, var0, var1, var2, var3);
      return Image.createRGBImage(var5, var2, var3, true);
   }

   public static Image c(byte[] var0) {
      return Image.createImage(var0, 0, var0.length);
   }

   public static void e() {
      fi.Y = 1;

      for(int var0 = 0; var0 < fj.g().aF.size(); ++var0) {
         ag var1 = (ag)fj.g().aF.elementAt(var0);
         fi.Y += var1.b.hashCode();
      }

      fi.g().p();
   }

   public static Image b(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[var0.length + var1.length];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return Image.createImage(var2, 0, var2.length);
   }

   public static InputStream d(String var0) {
      return "".getClass().getResourceAsStream(var0);
   }

   public static Image b(Image var0, int var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int[] var4 = new int[var2 * var3];
      var0.getRGB(var4, 0, var2, 0, 0, var2, var3);

      for(int var5 = 0; var5 < var4.length; ++var5) {
         if (var4[var5] == var1) {
            var4[var5] = 16777215;
         }
      }

      return Image.createRGBImage(var4, var2, var3, true);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'b');
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
               var10005 = 72;
               break;
            case 1:
               var10005 = 48;
               break;
            case 2:
               var10005 = 98;
               break;
            case 3:
               var10005 = 113;
               break;
            case 4:
               var10005 = 111;
               break;
            case 5:
               var10005 = 94;
               break;
            default:
               var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
