import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

final class dz implements gq {
   private cu b;
   private static final String[] a;

   dz(cu var1) {
      this.b = var1;
   }

   public final void b() {
      String[] var4 = a;
      Form var1 = new Form(var4[0]);
      ChoiceGroup var2 = new ChoiceGroup(var4[7], 2);
      TextField var3 = new TextField(var4[5], String.valueOf(j7.d), 100, 2);
      var2.append(var4[2], null);
      var2.append(var4[4], null);
      var2.append(var4[8], null);
      var2.append(var4[1], null);
      var2.setSelectedFlags(new boolean[]{j7.n, j7.k, j7.g, j7.f});
      var1.append(var2);
      if (j7.n) {
         var1.append(var3);
      }

      var4 = a;
      var1.append(var4[6]);
      var1.addCommand(new Command(var4[3], 4, 0));
      var1.addCommand(new Command(var4[9], 3, 1));
      var1.setCommandListener(new d0(this, var2, var3));
      var1.setItemStateListener(new d2(this, var2, var1, var3));
      GameMidlet.j.b(var1);
   }

   static {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "EGn\\\u001fl\u0017\rWWnGV@\u0091y\u0002~I\u0018j\tWWnGVD\u0011dO\u0003Zƒo\nWWnGVW\u00006zo\u000eBKwMV`\u0011uI:N\u0017p\u001d-WWnGV`\u0091y\u0002~I\u0018jPuJồ\b\u001emốb\u0002ċự\u0018eP}Js\b\u0014ắ\u00046Co\\\u0019\"\u0016wPw\u0006YRnA\u0019l";
      int var4 = "EGn\\\u001fl\u0017\rWWnGV@\u0091y\u0002~I\u0018j\tWWnGVD\u0011dO\u0003Zƒo\nWWnGVW\u00006zo\u000eBKwMV`\u0011uI:N\u0017p\u001d-WWnGV`\u0091y\u0002~I\u0018jPuJồ\b\u001emốb\u0002ċự\u0018eP}Js\b\u0014ắ\u00046Co\\\u0019\"\u0016wPw\u0006YRnA\u0019l"
         .length();
      char var1 = 7;
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

                  var2 = "WWnGVV\u0018c\u0002NA\u001b\u0003^ễc";
                  var4 = "WWnGVV\u0018c\u0002NA\u001b\u0003^ễc".length();
                  var1 = '\f';
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
         var10000[0] = (char)(var10000[0] ^ 'p');
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
               var10005 = 22;
               break;
            case 1:
               var10005 = 34;
               break;
            case 2:
               var10005 = 26;
               break;
            case 3:
               var10005 = 40;
               break;
            case 4:
               var10005 = 118;
               break;
            case 5:
               var10005 = 2;
               break;
            default:
               var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
