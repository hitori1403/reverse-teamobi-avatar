import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cg implements c9 {
   private Image b;
   private String c;
   private byte[] d;
   private int e;
   private static String[] f;
   private char g;
   private char h;
   private static final String[] i;

   static {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "T'\u0014\u00140s\u0005X$\u0007\u001a:\u0005[:\u000f\u0018=\u0006\u0015.\t\u0017%0\u0006T=\u000b\u001b4m\bI%\u0007\u0015=M\u0010^\u000bI%\u0007\u0015=F\u0010V$\t\u000e";
      int var4 = "T'\u0014\u00140s\u0005X$\u0007\u001a:\u0005[:\u000f\u0018=\u0006\u0015.\t\u0017%0\u0006T=\u000b\u001b4m\bI%\u0007\u0015=M\u0010^\u000bI%\u0007\u0015=F\u0010V$\t\u000e"
         .length();
      char var1 = 6;
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
                     i = var5;
                     String[] var10 = new String[8];
                     String[] var8 = i;
                     var10[0] = var8[0];
                     var10[1] = var8[8];
                     var10[2] = var8[2];
                     var10[3] = var8[1];
                     var10[4] = var8[4];
                     var10[5] = var8[5];
                     var10[6] = var8[6];
                     var10[7] = var8[7];
                     f = var10;
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

                  var2 = "X!\u0001\u0006X'\u0014\u001d4m";
                  var4 = "X!\u0001\u0006X'\u0014\u001d4m".length();
                  var1 = 3;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public cg(int var1) {
      try {
         DataInputStream var2 = new DataInputStream(b2.d(hq.b() + i[3] + f[var1]));
         this.c = var2.readUTF();
         this.d = new byte[this.c.length()];

         for(int var3 = 0; var3 < this.d.length; ++var3) {
            this.d[var3] = var2.readByte();
         }

         this.e = var2.readByte();
         bp.c(hq.as);
         this.b = bp.b(String.valueOf(var1));
         bp.b();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void b(Graphics var1, String var2, int var3, int var4, int var5) {
      int var6 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.b(var2);
      } else {
         var5 = var3 - (this.b(var2) >> 1);
      }

      for(int var7 = 0; var7 < var6; ++var7) {
         this.g = var2.charAt(var7);
         if (this.g == ' ') {
            var5 += this.d[0] >> 1;
         } else {
            if ((var3 = this.c.indexOf(this.g)) == -1) {
               var3 = 0;
            }

            if (var3 >= 0) {
               var1.drawRegion(this.b, 0, var3 * this.e, this.b.getWidth(), this.e, 0, var5, var4, 20);
            }

            var5 += this.d[var3];
         }
      }
   }

   public final int b(String var1) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         this.h = var1.charAt(var4);
         if (this.h == ' ') {
            var3 += this.d[0] >> 1;
         } else {
            int var2;
            if ((var2 = this.c.indexOf(this.h)) == -1) {
               var2 = 0;
            }

            var3 += this.d[var2];
         }
      }

      return var3;
   }

   public final String[] b(String var1, int var2) {
      Vector var5;
      int var6;
      String[] var3 = new String[var6 = (var5 = this.c(var1, var2)).size()];

      for(int var4 = 0; var4 < var6; ++var4) {
         var3[var4] = (String)var5.elementAt(var4);
      }

      return var3;
   }

   public final Vector c(String var1, int var2) {
      Vector var3 = new Vector();
      int var4;
      if ((var4 = var1.length()) <= 1) {
         Vector var9;
         (var9 = new Vector()).addElement(var1);
         return var9;
      } else {
         String var5 = "";
         int var6 = 0;
         int var7 = 0;

         while(true) {
            while(this.b(var5) < var2) {
               var5 = var5 + var1.charAt(var7);
               if (var1.charAt(++var7) == '\n') {
                  break;
               }

               if (var7 >= var4 - 1) {
                  var7 = var4 - 1;
                  break;
               }
            }

            if (var7 != var4 - 1 && var1.charAt(var7 + 1) != ' ') {
               int var8 = var7;

               while(var1.charAt(var7 + 1) != '\n' && (var1.charAt(var7 + 1) != ' ' || var1.charAt(var7) == ' ') && var7 != var6) {
                  --var7;
               }

               if (var7 == var6) {
                  var7 = var8;
               }
            }

            var3.addElement(var1.substring(var6, var7 + 1));
            if (var7 == var4 - 1) {
               break;
            }

            var6 = var7 + 1;

            while(var6 != var4 - 1 && var1.charAt(var6) == ' ') {
               ++var6;
            }

            if (var6 == var4 - 1) {
               break;
            }

            var7 = var6;
            var5 = "";
         }

         return var3;
      }
   }

   public final String b(String var1, String var2, String var3) {
      StringBuffer var4 = new StringBuffer();
      int var5 = var1.indexOf(var2);
      int var6 = 0;

      for(int var7 = var2.length(); var5 != -1; var5 = var1.indexOf(var2, var6)) {
         var4.append(var1.substring(var6, var5)).append(var3);
         var6 = var5 + var7;
      }

      var4.append(var1.substring(var6, var1.length()));
      return var4.toString();
   }

   public final String[] b(String var1, String var2) {
      int var3 = 0;
      int var5 = var2.length();

      for(int var4 = var1.indexOf(var2, 0); var4 != -1; ++var3) {
         var4 += var5;
         var4 = var1.indexOf(var2, var4);
      }

      String[] var8 = new String[var3 + 1];
      int var10 = var1.indexOf(var2);
      int var6 = 0;

      int var7;
      for(var7 = 0; var10 != -1; ++var7) {
         var8[var7] = var1.substring(var6, var10);
         var6 = var10 + var5;
         var10 = var1.indexOf(var2, var6);
      }

      var8[var7] = var1.substring(var6, var1.length());
      return var8;
   }

   public final int b() {
      return this.e;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'u');
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
               var10005 = 58;
               break;
            case 1:
               var10005 = 72;
               break;
            case 2:
               var10005 = 102;
               break;
            case 3:
               var10005 = 121;
               break;
            case 4:
               var10005 = 81;
               break;
            case 5:
               var10005 = 31;
               break;
            default:
               var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
