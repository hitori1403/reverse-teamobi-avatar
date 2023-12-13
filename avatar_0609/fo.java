import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fo extends e8 {
   public static fo z;
   private static int A;
   private static Image B;
   public static ji C;
   private static final String[] D;

   static {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "9\r$\u0007?\u001e<7%\u00171\u0005\u0012)\u0000\n\r\u0007q\u00047v2\u00108\b?\u001e1,#\f\f\b\u000e9\r$\u001c'\u0018>+\u0004$\u001c#\n>\u0007?\u001e<7%\u00171\b?\u001e1,#\f\f\b";
      int var4 = "9\r$\u0007?\u001e<7%\u00171\u0005\u0012)\u0000\n\r\u0007q\u00047v2\u00108\b?\u001e1,#\f\f\b\u000e9\r$\u001c'\u0018>+\u0004$\u001c#\n>\u0007?\u001e<7%\u00171\b?\u001e1,#\f\f\b"
         .length();
      char var1 = 3;
      int var9 = -1;

      label32:
      while(true) {
         String var10000 = var2.substring(++var9, var9 + var1);
         byte var10001 = -1;

         while(true) {
            String var14 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var14;
                  if ((var9 += var1) >= var4) {
                     D = var5;
                     A = 20;

                     try {
                        B = Image.createImage(hq.b() + D[3]);
                        return;
                     } catch (IOException var7) {
                        var7.printStackTrace();
                        return;
                     }
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var14;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label32;
                  }

                  var2 = "6\u001c$(xQp+\u0018(-l\u0010:* 5]\u001e\u0002 \u0019\u0006\u0013Y\u0016\u001b\u001b49\u0018\u0012\u0012)))6+:\u0019(\t/m,?7:";
                  var4 = "6\u001c$(xQp+\u0018(-l\u0010:* 5]\u001e\u0002 \u0019\u0006\u0013Y\u0016\u001b\u001b49\u0018\u0012\u0012)))6+:\u0019(\t/m,?7:"
                     .length();
                  var1 = 15;
                  var9 = -1;
            }

            var10000 = var2.substring(++var9, var9 + var1);
            var10001 = 0;
         }
      }
   }

   public static fo g() {
      return z == null ? (z = new fo()) : z;
   }

   public final void d() {
      fp.O = false;
      A = 0;
      if (fp.R != 0) {
         B = e8.o;
      }

      super.d();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 50:
            c(0);
            return;
         case 51:
            c(1);
      }
   }

   public final void b() {
      if (A > 51) {
         if (fp.R != 0) {
            if (fp.R == 2) {
               AutoController.h().d();
               B = null;
               fp.R = 0;
               k4.aa.h();
            }
         } else if (A == 52) {
            fi var1 = fi.g();
            String[] var4 = D;
            DataInputStream var2;
            if ((var2 = f5.b(var4[6])) != null) {
               String var3 = "";

               try {
                  var3 = var2.readUTF();
                  var1.t = var2.readByte();
                  var1.O = var2.readUTF();
                  var1.ah = var2.readUTF();
                  var1.ai = var2.readUTF();
                  if (var1.L) {
                     var1.A.b(var2.readUTF());
                     var1.B.b(var2.readUTF());
                  }

                  fi.Y = var2.readInt();
                  fi.aa = var2.readBoolean();
                  fi.ac = var2.readBoolean();
                  var2.close();
               } catch (Exception var6) {
                  var4 = D;
                  f5.c(var4[1]);
               }

               if (!fi.aa) {
                  var4 = D;
                  f5.c(var4[7]);
               }

               var4 = D;
               if (!var4[2].equals(var3)) {
                  f5.b();
               }
            }

            fa.g().i();
            if (!fi.aa) {
               fi.aa = true;
               var4 = D;
               f5.c(var4[4]);
               f5.k();
               c(0);
            } else {
               f5.k();
               fi.g().h();
               if (ff.g() != k4.u) {
                  fi.g().d();
               }

               B = null;
            }
         }

         String[] var12 = D;
         c6 var7 = new c6(var12[9]);

         try {
            new Thread(new makeRequest(var12[0], var12[8], var12[5], new hi(this, var7))).start();
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      } else if (fp.R != 0 && A == 0) {
         AutoController.h().d();
         B = null;
         fp.R = 0;
         k4.aa.h();
      }

      ++A;
   }

   private static void c(int var0) {
      k4.i();
      fa.g().D[4] = var0;
      fa.g().c(0);
      fi.g().h();
      fi.g().d();
      B = null;
   }

   public final void b(Graphics var1) {
      ib.b(0, 0, k4.o, k4.b.getHeight(), 0, var1);
      if (A > 1 && B != null) {
         var1.drawImage(B, k4.o >> 1, k4.p >> 1, 3);
      }

      k4.b(var1);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '_');
      }

      return var10000;
   }

   private static String c(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 94;
               break;
            case 1:
               var10005 = 104;
               break;
            case 2:
               var10005 = 80;
               break;
            case 3:
               var10005 = 88;
               break;
            case 4:
               var10005 = 66;
               break;
            case 5:
               var10005 = 126;
               break;
            default:
               var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
