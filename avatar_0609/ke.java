import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public final class ke implements gq, CommandListener {
   private static Vector b;
   private TextField c = new TextField(hq.bz, null, 20, 0);
   private TextField d = new TextField(hq.bA, null, 20, 65536);
   private List e;
   private Form f;
   private Command g;
   private Command h;
   private Command i;
   private Command j;
   private Command k;
   private Command l;
   private Command m;
   private static int n;
   private static boolean o;
   private static final String[] a;

   static {
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "+Ỽ2\u0002Z WXz;Mẍ.\u0015,ñ:\u0002E(Qớ\u007fsĳÍ`Jẫ\u007fsVẏ)\u0010\b;Ẳ=J\u000e\"ß\u0017\tŨĒ=E\u000e.Vổa\u0010;y&[ử.\u001e\fñ:\u0002E(Qớ\u007f\b)d2[\u000e,ẟ\u0011\u0004,y¹O\u0015,ñ:\u0002E(Qớ\u007fsĳÍ`Jẫ\u007fsVẏ)\u0010\u0003+Ỽ2\u001cŨòsNƞ5\u001e\fñ:\u0002E(Qớ\u007fsVF P\u001010Ö@'\u0010\u0003 â2\u0004Ũâ=E\u000e,y¹O\u000e4Þ\u001118JAợP&:Ằ=\u0002M(Ǝ\u00191=Jẃ0\u001e\fñ:\u0002E(Qớ\u007fsJAỷ]X|ỾV\u000e+Vốd}\b;Ẳ=J\u000e\"ß\u0017\u000f<p=J\u000e3ß\u001bysV\\ẑP\u001f\u00034ơ&";
      int var4 = "+Ỽ2\u0002Z WXz;Mẍ.\u0015,ñ:\u0002E(Qớ\u007fsĳÍ`Jẫ\u007fsVẏ)\u0010\b;Ẳ=J\u000e\"ß\u0017\tŨĒ=E\u000e.Vổa\u0010;y&[ử.\u001e\fñ:\u0002E(Qớ\u007f\b)d2[\u000e,ẟ\u0011\u0004,y¹O\u0015,ñ:\u0002E(Qớ\u007fsĳÍ`Jẫ\u007fsVẏ)\u0010\u0003+Ỽ2\u001cŨòsNƞ5\u001e\fñ:\u0002E(Qớ\u007fsVF P\u001010Ö@'\u0010\u0003 â2\u0004Ũâ=E\u000e,y¹O\u000e4Þ\u001118JAợP&:Ằ=\u0002M(Ǝ\u00191=Jẃ0\u001e\fñ:\u0002E(Qớ\u007fsJAỷ]X|ỾV\u000e+Vốd}\b;Ẳ=J\u000e\"ß\u0017\u000f<p=J\u000e3ß\u001bysV\\ẑP\u001f\u00034ơ&"
         .length();
      char var1 = '\r';
      int var9 = -1;

      label36:
      while(true) {
         String var10000 = var2.substring(++var9, var9 + var1);
         byte var10001 = -1;

         while(true) {
            String var15 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var15;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new Vector();
                     String var6;
                     if ((var6 = b2.c(kq.n[0])) != null) {
                        String[] var10 = kq.b(var6, kq.l[0]);

                        for(int var7 = 0; var7 < var10.length; ++var7) {
                           b.addElement(var10[var7]);
                        }
                     }

                     return;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var15;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label36;
                  }

                  var2 = ":Ằ=\u0002M(Ǝ\u00191=Jẃ0\u001e\fñ:\u0002E(Qớ\u007fsJAỷ]X|ỾV\u000e+Vốd}\u000e,y¹O\u000e4Þ\u001118JAợP";
                  var4 = ":Ằ=\u0002M(Ǝ\u00191=Jẃ0\u001e\fñ:\u0002E(Qớ\u007fsJAỷ]X|ỾV\u000e+Vốd}\u000e,y¹O\u000e4Þ\u001118JAợP".length();
                  var1 = '&';
                  var9 = -1;
            }

            var10000 = var2.substring(++var9, var9 + var1);
            var10001 = 0;
         }
      }
   }

   public ke() {
      String[] var1 = a;
      this.g = new Command(var1[16], 4, 1);
      this.h = new Command(var1[3], 4, 1);
      this.i = new Command(var1[5], 2, 2);
      this.j = new Command(var1[10], 1, 2);
      this.k = new Command(var1[8], 1, 2);
      this.l = new Command(var1[6], 1, 2);
      this.m = new Command(var1[11], 3, 2);
      this.f = new Form("");
      this.f.append(this.c);
      this.f.append(this.d);
      this.f.addCommand(this.g);
      this.f.addCommand(this.m);
      this.f.setCommandListener(this);
   }

   private static void b(Displayable var0) {
      Display.getDisplay(GameMidlet.j).setCurrent(var0);
   }

   public final void b() {
      b.removeAllElements();
      String var1;
      if ((var1 = b2.c(kq.n[0])) != null) {
         String[] var4 = kq.b(var1, kq.l[0]);

         for(int var2 = 0; var2 < var4.length; ++var2) {
            b.addElement(var4[var2]);
         }
      }

      if (b.size() > 0) {
         String[] var8 = a;
         this.e = new List(var8[4], 3);

         for(int var6 = 0; var6 < b.size(); ++var6) {
            String[] var7 = kq.b((String)b.elementAt(var6), kq.l[1]);
            this.e.append(var7[0], null);
            if (var7[0].equals(fi.g().A.o)) {
               n = var6;
            }
         }

         this.e.addCommand(this.h);
         this.e.addCommand(this.i);
         this.e.addCommand(this.k);
         this.e.addCommand(this.j);
         this.e.addCommand(this.l);
         this.e.setSelectedIndex(n, true);
         this.e.setCommandListener(this);
         b(this.e);
      } else {
         String[] var3 = a;
         Form var5;
         (var5 = new Form(var3[18])).append(var3[15]);
         var5.addCommand(this.i);
         var5.addCommand(this.l);
         var5.setCommandListener(this);
         b(var5);
      }
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var2 == this.e) {
         n = this.e.getSelectedIndex();
         if (var1 == this.h || var1 == List.SELECT_COMMAND) {
            if (j7.c) {
               j7.b().b(false);
            }

            AutoController.A();
            String[] var9 = kq.b((String)b.elementAt(n), kq.l[1]);
            fi.g().A.b(var9[0]);
            fi.g().B.b(var9[1]);
            fi.g().d();
            k4.e(hq.O);
            fi.g().X = System.currentTimeMillis();
            fi.g().q();
            b(k4.b);
            return;
         }

         if (var1 == this.j) {
            if (b.size() > 0) {
               for(int var8 = 0; var8 < b.size(); ++var8) {
                  if (var8 == n) {
                     b.removeElementAt(var8);
                  }
               }
            }

            a();
            n = 0;
            this.b();
            return;
         }

         if (var1 == this.k) {
            o = true;
            String[] var12 = a;
            this.f.setTitle(var12[0]);
            String[] var7 = kq.b((String)b.elementAt(n), kq.l[1]);
            this.c.setString(var7[0]);
            this.d.setString(var7[1]);
            b(this.f);
            return;
         }
      }

      if (var2 == this.f) {
         if (var1 == this.g) {
            String var6 = this.c.getString().trim();
            String var10 = this.d.getString().trim();
            if (!var6.equals("") && !var10.equals("")) {
               if (b.size() > 0) {
                  for(int var3 = 0; var3 < b.size(); ++var3) {
                     String[] var4 = kq.b((String)b.elementAt(var3), kq.l[1]);
                     if (o) {
                        if (n == var3) {
                           b.setElementAt(var6.toLowerCase() + kq.l[1] + var10, var3);
                        }
                     } else if (var6.toLowerCase().equals(var4[0])) {
                        String[] var11 = a;
                        b(new Alert(var11[14], var11[7], null, AlertType.WARNING));
                        return;
                     }
                  }

                  if (!o) {
                     b.addElement(var6.toLowerCase() + kq.l[1] + var10);
                  }
               } else {
                  b.addElement(var6.toLowerCase() + kq.l[1] + var10);
               }

               a();
               this.b();
               return;
            }

            String[] var5 = a;
            b(new Alert(var5[2], var5[17], null, AlertType.WARNING));
            return;
         }

         if (var1 == this.m) {
            this.b();
            return;
         }
      }

      if (var1 == this.l) {
         o = false;
         this.f.setTitle(a[12]);
         this.c.setString("");
         this.d.setString("");
         b(this.f);
      } else {
         b(k4.b);
      }
   }

   private static void a() {
      String var0 = "";
      if (b.size() > 0) {
         for(int var1 = 0; var1 < b.size(); ++var1) {
            var0 = var0 + (String)b.elementAt(var1);
            if (var1 < b.size() - 1) {
               var0 = var0 + kq.l[0];
            }
         }
      }

      b2.b(kq.n[0], var0);
   }

   static void b(String var0, String var1) {
      if (!var0.equals("") && !var1.equals("")) {
         if (b.size() > 0) {
            for(int var2 = 0; var2 < b.size(); ++var2) {
               String[] var3 = kq.b((String)b.elementAt(var2), kq.l[1]);
               if (var0.toLowerCase().equals(var3[0])) {
                  String[] var6 = a;
                  k4.c(var6[1]);
                  return;
               }
            }
         }

         var0 = var0 + "|" + var1;
         b.addElement(var0);
         a();
         if (GameMidlet.n.getCurrent() == k4.b) {
            k4.c(a[9]);
         }
      } else {
         String[] var4 = a;
         k4.c(var4[13]);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '>');
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
               var10005 = 17;
               break;
            case 2:
               var10005 = 83;
               break;
            case 3:
               var10005 = 34;
               break;
            case 4:
               var10005 = 46;
               break;
            case 5:
               var10005 = 64;
               break;
            default:
               var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
