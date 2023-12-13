import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class j1 implements Runnable {
   private final String b;
   private final String c;
   private static final String d;

   public j1(String var1, String var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void run() {
      try {
         MessageConnection var1;
         TextMessage var2;
         (var2 = (TextMessage)(var1 = (MessageConnection)Connector.open(this.b)).newMessage(d)).setAddress(this.b);
         var2.setPayloadText(this.c);
         var1.send(var2);
         k4.c(hq.b5);
      } catch (Exception var3) {
         k4.c(hq.b6);
      }
   }

   static {
      String var10002 = a(a("\u000f/1o"));
      boolean var10001 = true;
      d = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'I');
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
               var10005 = 123;
               break;
            case 1:
               var10005 = 74;
               break;
            case 2:
               var10005 = 73;
               break;
            case 3:
               var10005 = 27;
               break;
            case 4:
               var10005 = 11;
               break;
            case 5:
               var10005 = 113;
               break;
            default:
               var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
