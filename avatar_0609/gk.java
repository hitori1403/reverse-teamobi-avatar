import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.Ticker;

public final class gk implements gq, CommandListener {
   static boolean b;
   public static String c;
   public static long d;
   static int e;
   public static int f;
   private Ticker g;
   private TextBox h;
   private Command i;
   private Command j;
   private int k;
   private static final String[] a;

   static {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "\u0015ƌ\u001f\b\bI\u000b\u0017\u001chỸ0\b8I\u001e\u0001_l8-\u0003ŉßJ\u000by]\u001f\u001aS$:1]\u001eO\b8I\u001e\u0001_l8-\u000eŉßJ\u0002ƌqy:Ü\u0003Nĭẳ-\u0002vR";
      int var4 = "\u0015ƌ\u001f\b\bI\u000b\u0017\u001chỸ0\b8I\u001e\u0001_l8-\u0003ŉßJ\u000by]\u001f\u001aS$:1]\u001eO\b8I\u001e\u0001_l8-\u000eŉßJ\u0002ƌqy:Ü\u0003Nĭẳ-\u0002vR"
         .length();
      char var1 = 3;
      int var8 = -1;

      label29:
      while(true) {
         String var10000 = var2.substring(++var8, var8 + var1);
         byte var10001 = -1;

         while(true) {
            String var14 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var14;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     f = 5;
                     String[] var9 = a;
                     c = var9[8];
                     String var6;
                     if ((var6 = b2.c(var9[2])) != null) {
                        c = var6;
                     }

                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var14;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label29;
                  }

                  var2 = "\u0018J\u000b\u001a]vv7h\u000f\u000fQk;0\u000eŉßJ\u0002ƌqy:Ü\u0003Nĭẳ-";
                  var4 = "\u0018J\u000b\u001a]vv7h\u000f\u000fQk;0\u000eŉßJ\u0002ƌqy:Ü\u0003Nĭẳ-".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = var2.substring(++var8, var8 + var1);
            var10001 = 0;
         }
      }
   }

   public gk(int var1) {
      this.k = var1;
   }

   public final void b() {
      switch(this.k) {
         case 1:
            this.g = new Ticker(k4.b.av);
            this.h = new TextBox(kq.s[1], c, 1000, 0);
            String[] var8 = a;
            this.j = new Command(var8[0], 4, 0);
            this.i = new Command(var8[1], 2, 0);
            this.h.setTicker(this.g);
            this.h.addCommand(this.j);
            this.h.addCommand(this.i);
            this.h.setCommandListener(this);
            Display.getDisplay(GameMidlet.j).setCurrent(this.h);
            return;
         case 2:
            Vector var7;
            (var7 = new Vector()).addElement(new ag(kq.b(!b), new gk(4)));
            var7.addElement(new ag(kq.s[2], new gk(3)));
            var7.addElement(new ag(kq.s[1], new gk(1)));
            var7.addElement(new ag(kq.s[4], new gk(5)));
            f1.d().b(var7, 2);
            return;
         case 3:
            k4.x.b(kq.s[2] + "(" + kq.s[3] + ")", new gk(6), 1);
            k4.x.o.b(true);
            k4.x.o.b(String.valueOf(f));
            return;
         case 4:
            b = !b;
            AutoController var10000 = AutoController.h();
            String[] var2 = a;
            var10000.c(var2[3] + kq.b(b) + var2[4]);
            return;
         case 5:
            k4.c(kq.s[5]);
            return;
         case 6:
            try {
               e1 var1 = k4.x;
               cs var4 = k4.x.o;
               if (k4.x.o.o.equals("")) {
                  return;
               }

               var1 = k4.x;
               cs var6 = k4.x.o;
               f = Math.abs(Integer.parseInt(k4.x.o.o));
               AutoController.h().c(a[6]);
               new gk(2).b();
               return;
            } catch (Exception var3) {
            }
      }
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var2 == this.h) {
         if (var1 == this.j) {
            String var10000 = this.h.getString();
            String[] var3 = a;
            c = kq.b(var10000, "\n", var3[7]);
            b2.b(var3[5], c);
            AutoController.h().c(var3[9]);
            new gk(2).b();
         }

         Display.getDisplay(GameMidlet.j).setCurrent(k4.b);
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
               var10005 = 89;
               break;
            case 1:
               var10005 = 60;
               break;
            case 2:
               var10005 = 106;
               break;
            case 3:
               var10005 = 110;
               break;
            case 4:
               var10005 = 60;
               break;
            case 5:
               var10005 = 4;
               break;
            default:
               var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
