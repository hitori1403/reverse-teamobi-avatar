import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
   public static String[][][] b;
   public static String[][][] c;
   public static int[][][] d;
   public static final String[][] e;
   public static int f;
   public static byte g;
   public static String h;
   private static k4 i;
   public static GameMidlet j;
   public static i3 k;
   public static h_ l;
   public static Vector m;
   public static Display n;
   public static int o;
   public static String p;
   public static String q;
   public Thread r;
   private static final String[] a;

   static {
      String[] var5 = new String[40];
      int var3 = 0;
      String var2 = "JWQM ^mVWH\nW\u0001\u0018\u0018`\u001bw\f\u0018\u000b\rIQJS6[wIXLS=W\n;\u000f\u0011\u0013k\f-\u0011\u000f\u0011\u0012,\b\u001e\u0013fO\t\u0010\u000f_?o\u0000y:\t\u0011\u0015\u000f,\b\u001e\u0013fO\t\u0010\u000f_.{O\r\r\u00141\u000e\u000b\u0018|\u00018\f\t\u0010\u0013o\u0003y+\u0005\r\u000bk\u001d\u00054!//A\u0006\u0019\u0016\u001e\to\u001d\u000eIQMS<^jVXJS?_o\u000eIQMS<^jVXJS?_h\u000eIQMS<^jVXJS?^i\u0012,\b\u001e\u0013fO\t\u0010\u000f_)o\u0002y?\t\u001e\u0012\u000fJQOS<^hVQOD ^hA\u0005\u001b\f\u0010\u000ek\u0010,\b\u001e\u0013fO\t\u0010\u000f_)|\u0006y3\u0019\u000bIQMS9WwINMH\u0005-49P6\u0013WO\u000b\u0018v\u001b\u0014\u0011\u000e\u00160o\u001fy\b\f\u001e\u0014`\u000fJQOS<^hVQOD ^hA\u000eIQMS<^jVXJS?_m\"\u0010\u0014\u000b\r4@v\r\u0010\u0007\b \u0001<\fO\u0019\u001c|\u0002t\u001c\u0001\u000b\u001c!\t8\n\rQ\rf\u001f\u0011,\b\u001e\u0013fO\t\u0010\u000f_0a\u0001>X-\u0010+\u0010\u0014\u000b\r4@v\f\u0012\u0010\u001ef\u00000\u001c\t\u001b\u0012`\bw\r\u0013P\u000e|\u00190\b\u0013P\u001cx\u000e-\u0019\u0012 > \u001b!\f\n9\u0012\u0016\u0018}O\u001a\u0011\u0014\u0006\u000eIQMS<^jVXJS?_j\u0011,\b\u001e\u0013fO\t\u0010\u000f_9g\n,X+\u0006\u0011,\b\u001e\u0013fO\t\u0010\u000f_3f\u000e7X-\u001e\u0014,\b\u001e\u0013fO\t\u0010\u000f_)f\u000e7X4\u0017\u0012o\u00060\u0010\u0014\u000b\r4@v\f\u0012\u0010\u001ef\u00000\u001c\t\u001b\u0012`\bw\r\u0013P\u000e|\u00190\b\u0013P\u001cx\u000e-\u0019\u0012\u0016\u0013z\n+'#Q\tv\u001b\r \u0015_.aO\u001d\u0011\u0005\n]E\u0016\u000f \u0015_.aO\r\u0010\u0001\u0011]Z\u0006<\u0016\rW\u0010\r\u0012x\u0006=\u001d\u0012Q\tv\u001b\f;\u000f\u0011\tk\u0001-U4\u0006\rk\u0011,\b\u001e\u0013fO\t\u0010\u000f_5a\u000e7X-\u0006%\u0010\u0014\u000b\r4@v\f\u0005\u001e\u0010a\r0V\u0003\u0010\u0010!\u001c+\u000e\t\u000f\u000e!\u000e/\u0019\u0014\u001e\u000f<A-\u0000\u0014+\u0010\u0014\u000b\r4@v\f\u0005\u001e\u0010a\r0V\u0003\u0010\u0010!\u001c+\u000e\t\u000f\u000e!\u000e/\u0019\u0014\u001e\u000fg\u0001-\u001d\u0012\u001bO \u001b!\f\u0012,\b\u001e\u0013fO\t\u0010\u000f_5a\u000ey:\t\u0011\u0015";
      int var4 = "JWQM ^mVWH\nW\u0001\u0018\u0018`\u001bw\f\u0018\u000b\rIQJS6[wIXLS=W\n;\u000f\u0011\u0013k\f-\u0011\u000f\u0011\u0012,\b\u001e\u0013fO\t\u0010\u000f_?o\u0000y:\t\u0011\u0015\u000f,\b\u001e\u0013fO\t\u0010\u000f_.{O\r\r\u00141\u000e\u000b\u0018|\u00018\f\t\u0010\u0013o\u0003y+\u0005\r\u000bk\u001d\u00054!//A\u0006\u0019\u0016\u001e\to\u001d\u000eIQMS<^jVXJS?_o\u000eIQMS<^jVXJS?_h\u000eIQMS<^jVXJS?^i\u0012,\b\u001e\u0013fO\t\u0010\u000f_)o\u0002y?\t\u001e\u0012\u000fJQOS<^hVQOD ^hA\u0005\u001b\f\u0010\u000ek\u0010,\b\u001e\u0013fO\t\u0010\u000f_)|\u0006y3\u0019\u000bIQMS9WwINMH\u0005-49P6\u0013WO\u000b\u0018v\u001b\u0014\u0011\u000e\u00160o\u001fy\b\f\u001e\u0014`\u000fJQOS<^hVQOD ^hA\u000eIQMS<^jVXJS?_m\"\u0010\u0014\u000b\r4@v\r\u0010\u0007\b \u0001<\fO\u0019\u001c|\u0002t\u001c\u0001\u000b\u001c!\t8\n\rQ\rf\u001f\u0011,\b\u001e\u0013fO\t\u0010\u000f_0a\u0001>X-\u0010+\u0010\u0014\u000b\r4@v\f\u0012\u0010\u001ef\u00000\u001c\t\u001b\u0012`\bw\r\u0013P\u000e|\u00190\b\u0013P\u001cx\u000e-\u0019\u0012 > \u001b!\f\n9\u0012\u0016\u0018}O\u001a\u0011\u0014\u0006\u000eIQMS<^jVXJS?_j\u0011,\b\u001e\u0013fO\t\u0010\u000f_9g\n,X+\u0006\u0011,\b\u001e\u0013fO\t\u0010\u000f_3f\u000e7X-\u001e\u0014,\b\u001e\u0013fO\t\u0010\u000f_)f\u000e7X4\u0017\u0012o\u00060\u0010\u0014\u000b\r4@v\f\u0012\u0010\u001ef\u00000\u001c\t\u001b\u0012`\bw\r\u0013P\u000e|\u00190\b\u0013P\u001cx\u000e-\u0019\u0012\u0016\u0013z\n+'#Q\tv\u001b\r \u0015_.aO\u001d\u0011\u0005\n]E\u0016\u000f \u0015_.aO\r\u0010\u0001\u0011]Z\u0006<\u0016\rW\u0010\r\u0012x\u0006=\u001d\u0012Q\tv\u001b\f;\u000f\u0011\tk\u0001-U4\u0006\rk\u0011,\b\u001e\u0013fO\t\u0010\u000f_5a\u000e7X-\u0006%\u0010\u0014\u000b\r4@v\f\u0005\u001e\u0010a\r0V\u0003\u0010\u0010!\u001c+\u000e\t\u000f\u000e!\u000e/\u0019\u0014\u001e\u000f<A-\u0000\u0014+\u0010\u0014\u000b\r4@v\f\u0005\u001e\u0010a\r0V\u0003\u0010\u0010!\u001c+\u000e\t\u000f\u000e!\u000e/\u0019\u0014\u001e\u000fg\u0001-\u001d\u0012\u001bO \u001b!\f\u0012,\b\u001e\u0013fO\t\u0010\u000f_5a\u000ey:\t\u0011\u0015"
         .length();
      char var1 = '\n';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var14 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var14;
                  if ((var7 += var1) >= var4) {
                     a = var5;
                     String[][][] var10 = new String[2][][];
                     String[][] var10003 = new String[2][];
                     String[] var10006 = new String[8];
                     String[] var8 = a;
                     var10006[0] = var8[30];
                     var10006[1] = var8[34];
                     var10006[2] = var8[12];
                     var10006[3] = var8[28];
                     var10006[4] = var8[15];
                     var10006[5] = var8[37];
                     var10006[6] = var8[26];
                     var10006[7] = var8[22];
                     var10003[0] = var10006;
                     var10003[1] = new String[]{var8[31], var8[4], var8[27], var8[5]};
                     var10[0] = var10003;
                     var10[1] = new String[][]{{var8[6], var8[24]}};
                     b = var10;
                     c = new String[][][]{{{var8[39], var8[20], var8[0], var8[9], var8[11], var8[10], var8[25]}, {var8[2], var8[19], var8[13]}}, {{var8[16]}}};
                     d = new int[][][]{{{19128, 19128, 19128, 19128, 19128, 19128, 19128, 19128, 19128}, {19128, 19128, 18128}}, {{19128}}};
                     e = new String[][]{{var8[35], var8[23]}, {var8[36], var8[29]}};
                     f = 8;
                     g = -1;
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var14;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "?%+\u000eIQMS<^jVXJS?_k";
                  var4 = "?%+\u000eIQMS<^jVXJS?_k".length();
                  var1 = 3;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public GameMidlet() {
      j = this;
      Class var10000 = this.getClass();
      String[] var4 = a;
      InputStream var1 = var10000.getResourceAsStream(var4[32]);
      StringBuffer var2 = new StringBuffer();

      try {
         int var3;
         while((var3 = var1.read()) != -1) {
            var2.append((char)var3);
         }

         g = Byte.parseByte(var2.toString());
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      if (g == -1) {
         f5.i();
      }

      var4 = a;
      InputStream var13 = b2.d(var4[1]);
      StringBuffer var8 = new StringBuffer();

      try {
         while((var10 = var13.read()) != -1) {
            var8.append((char)var10);
         }

         h = var8.toString();
      } catch (Exception var6) {
      }

      k4 var9 = i = new k4();
      if (!k4.aj) {
         new Thread(var9).start();
      }

      k4.aj = true;
      jp.b().d();
      k = new i3();
      l = new h_();
      fo.g().d();
      i.sizeChanged(0, 0);
      i.c();
      Display.getDisplay(this).setCurrent(i);
      jp var16 = jp.b();
      DeCaptcha var11 = DeCaptcha.b();
      var16.e = var11;
      var4 = a;
      String var12;
      if ((var12 = b2.c(var4[8])) == null || !var12.equals(var4[7])) {
         f5.b();
      }

      try {
         j7.r = new ji(b(a[21]));
      } catch (d var5) {
         var5.printStackTrace();
      }
   }

   public final void b(Displayable var1) {
      Display.getDisplay(this).setCurrent(var1);
   }

   public void destroyApp(boolean var1) {
      j.notifyDestroyed();
   }

   public static void b() {
      try {
         j.destroyApp(true);
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   protected void pauseApp() {
   }

   protected void startApp() {
      (n = Display.getDisplay(this)).setCurrent(i);
   }

   public static void b(String var0, String var1) {
      new Thread(new j1(var1, var0)).start();
   }

   public static String b(String var0) {
      try {
         HttpConnection var5;
         HttpConnection var10000 = var5 = (HttpConnection)Connector.open(var0);
         String[] var3 = a;
         var10000.setRequestMethod(var3[38]);
         var5.setRequestProperty(var3[33], var3[18]);
         var5.setRequestProperty(var3[3], var3[14]);
         if (var5.getResponseCode() != 200) {
            return null;
         } else {
            InputStream var6 = var5.openInputStream();
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            int var2;
            while((var2 = var6.read()) != true) {
               var1.write(var2);
            }

            var0 = new String(var1.toByteArray(), a[17]);
            var1.close();
            return var0;
         }
      } catch (IOException var4) {
         return null;
      }
   }

   public static void c(String var0) {
      try {
         j.platformRequest(var0);
         j.notifyDestroyed();
      } catch (ConnectionNotFoundException var1) {
         var1.printStackTrace();
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'Y');
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
               var10005 = 120;
               break;
            case 1:
               var10005 = 96;
               break;
            case 2:
               var10005 = 127;
               break;
            case 3:
               var10005 = 125;
               break;
            case 4:
               var10005 = 14;
               break;
            case 5:
               var10005 = 111;
               break;
            default:
               var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
