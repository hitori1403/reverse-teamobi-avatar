import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

final class d0 implements CommandListener {
   private dz b;
   private final ChoiceGroup c;
   private final TextField d;
   private static final String[] a;

   d0(dz var1, ChoiceGroup var2, TextField var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getCommandType() == 4) {
         boolean[] var5 = new boolean[4];
         this.c.getSelectedFlags(var5);
         j7.n = var5[0];
         j7.k = var5[1];
         j7.g = var5[2];
         j7.f = var5[3];
         if (var5[0]) {
            j7.d = Short.parseShort(this.d.getString());
         }

         i5.b = var5[1];
         if (var5[1]) {
            String[] var4 = a;
            Form var6 = new Form(var4[1]);
            ChoiceGroup var7;
            (var7 = new ChoiceGroup("", 2)).append(var4[3], null);
            var7.append(var4[6], null);
            var7.append(var4[0], null);
            var7.setSelectedIndex(0, j7.m);
            var7.setSelectedIndex(1, fu.aR);
            var7.setSelectedIndex(2, fu.aS);
            var6.append(var7);
            TextField var3 = new TextField(var4[2], String.valueOf(j7.q), 100, 5);
            var6.append(var3);
            var6.addCommand(new Command(var4[4], 4, 0));
            var6.addCommand(new Command(var4[5], 3, 0));
            var6.setCommandListener(new d1(this, var7, var3));
            GameMidlet.j.b(var6);
            return;
         }
      }

      GameMidlet.j.b(k4.b);
   }

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\u000fặxĨẓum{$ẗ\u0019\u0004SH\u000f\b#,M#um{5(\\)rk7\u0013\u000f.ẅPj|c:(x[«u\"+.¢Mc\u0011\u000fặxĨẓum{ŗ1\u0019(úd{ŗ¹\u0003\u0017Ƕ-";
      int var4 = "\u000fặxĨẓum{$ẗ\u0019\u0004SH\u000f\b#,M#um{5(\\)rk7\u0013\u000f.ẅPj|c:(x[«u\"+.¢Mc\u0011\u000fặxĨẓum{ŗ1\u0019(úd{ŗ¹\u0003\u0017Ƕ-".length();
      char var1 = 14;
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

                  var2 = "\u0013ạ!\u000e\u000fặxĨẓum{$ẗ\u0019\u0001XR";
                  var4 = "\u0013ạ!\u000e\u000fặxĨẓum{$ẗ\u0019\u0001XR".length();
                  var1 = 3;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '\n');
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
               var10005 = 91;
               break;
            case 1:
               var10005 = 70;
               break;
            case 2:
               var10005 = 88;
               break;
            case 3:
               var10005 = 57;
               break;
            case 4:
               var10005 = 74;
               break;
            case 5:
               var10005 = 27;
               break;
            default:
               var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
