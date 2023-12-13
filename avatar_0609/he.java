import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class he implements gq, Runnable, CommandListener {
   private static String b;
   private static String c;
   private static String d;
   public static boolean e;
   private static boolean f;
   private Form g;
   private TextField h;
   private TextField i;
   private TextField j;
   private Command k;
   private Command l;
   private Alert m;
   private static final String[] a;

   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "PẎX\u0006WX\u0098|\bBXW\u0017WVỘz\u0003_ƝC\bPÍ_NŦẍ\r3";
      int var4 = "PẎX\u0006WX\u0098|\bBXW\u0017WVỘz\u0003_ƝC\bPÍ_NŦẍ\r3".length();
      char var1 = '\b';
      int var9 = -1;

      label36:
      while(true) {
         String var10000 = var2.substring(++var9, var9 + var1);
         byte var10001 = -1;

         while(true) {
            String var14 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var14;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     c = kq.o[12];
                     b = kq.o[13];
                     d = kq.o[14];

                     try {
                        String var6;
                        if ((var6 = b2.c(kq.n[2])) != null) {
                           b = b(var6, kq.l[1])[0];
                           c = b(var6, kq.l[1])[1];
                           d = b(var6, kq.l[1])[2];
                           return;
                        }
                     } catch (Exception var7) {
                        var7.printStackTrace();
                     }

                     return;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var14;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label36;
                  }

                  var2 = "ăÎ\u0016\u0002ǇOYpÍ_NŦẍ\r\bPẎX\u0006WX\u0098|";
                  var4 = "ăÎ\u0016\u0002ǇOYpÍ_NŦẍ\r\bPẎX\u0006WX\u0098|".length();
                  var1 = 14;
                  var9 = -1;
            }

            var10000 = var2.substring(++var9, var9 + var1);
            var10001 = 0;
         }
      }
   }

   public static boolean b(int var0) {
      if (var0 == Integer.parseInt(c)) {
         a();
         return true;
      } else {
         return false;
      }
   }

   static void a() {
      if (!b.equals(kq.o[13])) {
         if (e = !e) {
            k4.c(kq.o[2]);
            new Thread(new he()).start();
         } else {
            k4.c(kq.o[3]);
         }
      } else {
         k4.c(kq.o[4]);
      }
   }

   public static void c(int var0) {
      if (!f) {
         if (var0 == Integer.parseInt(c)) {
            f = true;
            e = false;
            new he().b();
         }
      }
   }

   public final void b() {
      String[] var1 = a;
      this.g = new Form(var1[3] + kq.o[0]);
      this.g.append(this.h = new TextField(kq.o[5], b, 500, 0));
      this.g.append(this.i = new TextField(kq.o[6], c, 50, 0));
      this.g.append(this.j = new TextField(kq.o[7], d, 50, 2));
      this.g.append(kq.o[8]);
      Form var10000 = this.g;
      fj.g();
      var10000.append(fj.G());
      this.g.addCommand(this.k = new Command(var1[2], 4, 1));
      this.g.addCommand(this.l = new Command(var1[1], 2, 1));
      this.g.setCommandListener(this);
      Display.getDisplay(GameMidlet.j).setCurrent(this.g);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.k) {
         String[] var6 = b(this.h.getString(), kq.l[2]);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            String[] var3 = b(var6[var7], kq.l[3]);

            for(int var4 = 0; var4 < var3.length; ++var4) {
               if (!b(var3[var4]) || var6[var7].indexOf(kq.l[3]) == -1) {
                  String[] var5 = a;
                  (this.m = new Alert(var5[5], kq.o[10], null, AlertType.ERROR)).setTimeout(-2);
                  Display.getDisplay(GameMidlet.j).setCurrent(this.m);
                  return;
               }
            }
         }

         if (!b(this.i.getString())) {
            String[] var8 = a;
            (this.m = new Alert(var8[0], kq.o[11], null, AlertType.ERROR)).setTimeout(-2);
            Display.getDisplay(GameMidlet.j).setCurrent(this.m);
            return;
         }

         b = this.h.getString();
         c = this.i.getString();
         d = this.j.getString();
         b2.b(kq.n[2], b + kq.l[1] + c + kq.l[1] + d);
         k4.c(a[4]);
      }

      f = false;
      Display.getDisplay(GameMidlet.j).setCurrent(k4.b);
   }

   private static boolean b(String var0) {
      try {
         Integer.parseInt(var0);
         return true;
      } catch (Exception var1) {
         return false;
      }
   }

   private static String[] b(String var0, String var1) {
      Vector var2 = new Vector();
      if (!var0.endsWith(var1)) {
         var0 = String.valueOf(var0) + var1;
      }

      int var3;
      for(int var4 = 0; (var3 = var0.indexOf(var1, var4)) != -1; var4 = var3 + var1.length()) {
         var2.addElement(var0.substring(var4, var3));
      }

      String[] var5 = new String[var2.size()];
      var2.copyInto(var5);
      return var5;
   }

   public final void run() {
      do {
         String[] var1 = b(b, kq.l[2]);

         for(int var2 = 0; var2 < var1.length && e; ++var2) {
            String[] var3 = b(var1[var2], kq.l[3]);
            k4.b.keyPressed(Integer.parseInt(var3[0]));
            k4.b.keyReleased(Integer.parseInt(var3[0]));
            fj.m(Math.abs(Integer.parseInt(var3[1]) * 1000));
            fj.m(Math.abs(Integer.parseInt(d)));
         }

         fj.m(Math.abs(50));
      } while(e);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'y');
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
               var10005 = 19;
               break;
            case 1:
               var10005 = 45;
               break;
            case 2:
               var10005 = 54;
               break;
            case 3:
               var10005 = 110;
               break;
            case 4:
               var10005 = 119;
               break;
            case 5:
               var10005 = 58;
               break;
            default:
               var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
