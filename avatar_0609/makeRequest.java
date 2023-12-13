import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

// ha.java
public final class makeRequest implements Runnable {
   private String url;
   private Handler handler;
   private String body;
   private String msgType;
   private static final String[] a;
   // [Connection, HTTP Error: , Content-Type, application/json; charset=utf-8, keep-alive, msgType, Content-length, POST]

   public makeRequest(String body, String url, String msgType, Handler handler) {
      this.handler = handler;
      this.body = body;
      this.url = url;
      this.msgType = msgType;
   }

   public final void run() {
      HttpConnection var1 = null;
      DataOutputStream var2 = null;
      DataInputStream var3 = null;

      try {
         String var5 = this.url;
         HttpConnection var6;
         HttpConnection var16 = var6 = (HttpConnection)Connector.open(var5, 3);
         String[] var7 = a;
         var16.setRequestProperty(var7[0], var7[4]);
         var6.setRequestProperty(var7[2], var7[3]);
         var6.setRequestProperty(var7[5], this.msgType);
         int var4 = this.body.toString().getBytes().length;
         var6.setRequestProperty(var7[6], String.valueOf(var4));
         var6.setRequestMethod(var7[7]);
         var1 = var6;
         (var2 = var6.openDataOutputStream()).write(this.body.getBytes());
         if (var6.getResponseCode() != 200) {
            Handler var17 = this.handler;
            new StringBuffer(a[1]).append(var6.getResponseCode());
            var17.handle();
         } else {
            var3 = var6.openDataInputStream();
            DataInputStream var14 = var3;
            ByteArrayOutputStream responseText = new ByteArrayOutputStream();

            while((var4 = var14.read()) != true) {
               responseText.write(var4);
            }

            String responseText1 = new String(responseText.toByteArray());
            b(responseText);
            this.handler.handle(responseText1);
         }

         return;
      } catch (Exception var10) {
         Handler var10000 = this.handler;
         var10.getMessage();
         var10000.handle();
      } finally {
         b(var2);
         b(var3);
         b(var1);
      }
   }

   private static void b(Object var0) {
      if (var0 != null) {
         try {
            if (var0 instanceof HttpConnection) {
               ((HttpConnection)var0).close();
               return;
            }

            if (var0 instanceof DataInputStream) {
               ((DataInputStream)var0).close();
               return;
            }

            if (var0 instanceof DataOutputStream) {
               ((DataOutputStream)var0).close();
               return;
            }

            if (var0 instanceof ByteArrayOutputStream) {
               ((ByteArrayOutputStream)var0).close();
               return;
            }
         } catch (IOException var1) {
         }
      }
   }

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "\u00169$Py\u001aj<9$\f\u001d\u0002\u001en<<l'98\u0004<\f\u00169$Jy\u0017jx\u00023Ny\u001f4&:Ru\u001a\u007f!?%P3\u0013m:8q\u001e\u007f\u0011\u007f'%/J!\fj3{r\n>3/N1\u0018r< /\u00078%-je\t{";
      int var4 = "\u00169$Py\u001aj<9$\f\u001d\u0002\u001en<<l'98\u0004<\f\u00169$Jy\u0017jx\u00023Ny\u001f4&:Ru\u001a\u007f!?%P3\u0013m:8q\u001e\u007f\u0011\u007f'%/J!\fj3{r\n>3/N1\u0018r< /\u00078%-je\t{"
         .length();
      char var1 = '\n';
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

                  var2 = "\u00169$Jy\u0017jx:/P{\rv\u0004\u0005\u0019\u0019j";
                  var4 = "\u00169$Jy\u0017jx:/P{\rv\u0004\u0005\u0019\u0019j".length();
                  var1 = 14;
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
         var10000[0] = (char)(var10000[0] ^ 30);
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
               var10005 = 85;
               break;
            case 1:
               var10005 = 86;
               break;
            case 2:
               var10005 = 74;
               break;
            case 3:
               var10005 = 62;
               break;
            case 4:
               var10005 = 28;
               break;
            case 5:
               var10005 = 121;
               break;
            default:
               var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
