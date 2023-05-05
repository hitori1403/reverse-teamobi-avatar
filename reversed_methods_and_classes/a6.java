//  Tra loi co giao tieng anh

import java.util.Arrays;

public final class a6 {
    static boolean f;
    private static char[] d(String var0) {
        char[] var10000 = var0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 107);
        }

        return var10000;
    }
    private static String a(char[] var0) {
        int var10000 = var0.length;

        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var0[var1];
            byte var10005 = switch (var1 % 7) {
                case 0 -> 57;
                case 1 -> 91;
                case 2 -> 11;
                case 3 -> 117;
                case 4 -> 20;
                case 5 -> 35;
                default -> 107;
            };

            var0[var1] = (char) (var10004 ^ var10005);
        }

        return new String(var0);
    }

    public static void main(String[] args) {
        String[] var5 = new String[87];
        int var3 = 0;
        String var2 = "]:{\u0014z\u0003V4y\u0003X:a\u0003X,m\u0002L=\u0003V4x\u0003\\>x\u0003V4m\u0002@#\u0003V4a\u0002L#\u0002X(\u0003\\>y\tM2n\u001bs\r\nW3\u0003L,a\u0002P#\u0002V1\u0003X,y\u0002]?\u0002L,\u0003L,s\u0002X=\u0007Z4%\u0012}B\u0004\u0002X,\u0002X1\u0002\\>\u0002@1\bX-j\u0001uQ*o\u0003V,x\u0002X:\u0003\\>s\u0002X)\u0002L(\u0002]?\u0005l\u000fMX,\u0003V,a\u0003\\>m\u0003\\>a\u0002P)\u0003V,y\u0003X,a\u0002\\#\u0003X,s\u0003\u0017u%\u0003X:s\u0002P(\u0003V,x\u0005l\u000fMX,\u0003\\>s\u0002V=\u0003V4m\u0002\\12Q/\u007f\u0005.\fDU:{\u0007{\r\u001dWtJ\u001b|u\u0002\\/$\u001fuU\n\u0016+y\u001awF\u0018J2e\u0012:S\u0003Idz\u0000qQ\u0012\u0004\u0003L,y\u0003X:y\u0002L)\u0003X:m\u0002@=\u0002X#\n\u001f)n\u0006dL\u0005J>6CĨ¢ñẒŽỆẀỐẶỤẄüÊỐẄỢỊỊỗỦẬË¨Ễ\u0080ộỰẺỬẌỒẨỏỼẊỚ»êỖ÷ẂỌẜỲẠỘấẌỘẌỬç\u0098ờĊẠƉ±ÿǔöĠẘÄẬỲẀ\nM2n\u001bs\r\u001dP>\u007f\u0003X:x\u0003L,m\u0003L,x\u0002V(,Q/\u007f\u0005.\fDU:{\u0007{\r\u001dWtJ\u001b|u\u0002\\/$\u001fuU\n\u0016(j\u0003q\r\u001bQ+4\u0004aF\u0019@f\u0002@)\u0002V#\u0002V4\u0003V4s\u0002V,B].~\u0000aV\u001eL.~\u0000qF\u000e\\>n\u0010qF\u000eV4d\u001a{L\u0004V4d\u001a{L\u0004V:j\u0014uB\nX:j\u0014uB\nX:b\u001c}J\u0002L>d\u001auZ\u0012@\"r\u0003V,s\u0002V)\u0003V,m\u0003V,m\u0002P1\u0002P=\u0002@(\u0003X,x\u0002\\(\u0002V1\u0003\\>y\u0002\\=";
        int var4 = "]:{\u0014z\u0003V4y\u0003X:a\u0003X,m\u0002L=\u0003V4x\u0003\\>x\u0003V4m\u0002@#\u0003V4a\u0002L#\u0002X(\u0003\\>y\tM2n\u001bs\r\nW3\u0003L,a\u0002P#\u0002V1\u0003X,y\u0002]?\u0002L,\u0003L,s\u0002X=\u0007Z4%\u0012}B\u0004\u0002X,\u0002X1\u0002\\>\u0002@1\bX-j\u0001uQ*o\u0003V,x\u0002X:\u0003\\>s\u0002X)\u0002L(\u0002]?\u0005l\u000fMX,\u0003V,a\u0003\\>m\u0003\\>a\u0002P)\u0003V,y\u0003X,a\u0002\\#\u0003X,s\u0003\u0017u%\u0003X:s\u0002P(\u0003V,x\u0005l\u000fMX,\u0003\\>s\u0002V=\u0003V4m\u0002\\12Q/\u007f\u0005.\fDU:{\u0007{\r\u001dWtJ\u001b|u\u0002\\/$\u001fuU\n\u0016+y\u001awF\u0018J2e\u0012:S\u0003Idz\u0000qQ\u0012\u0004\u0003L,y\u0003X:y\u0002L)\u0003X:m\u0002@=\u0002X#\n\u001f)n\u0006dL\u0005J>6CĨ¢ñẒŽỆẀỐẶỤẄüÊỐẄỢỊỊỗỦẬË¨Ễ\u0080ộỰẺỬẌỒẨỏỼẊỚ»êỖ÷ẂỌẜỲẠỘấẌỘẌỬç\u0098ờĊẠƉ±ÿǔöĠẘÄẬỲẀ\nM2n\u001bs\r\u001dP>\u007f\u0003X:x\u0003L,m\u0003L,x\u0002V(,Q/\u007f\u0005.\fDU:{\u0007{\r\u001dWtJ\u001b|u\u0002\\/$\u001fuU\n\u0016(j\u0003q\r\u001bQ+4\u0004aF\u0019@f\u0002@)\u0002V#\u0002V4\u0003V4s\u0002V,B].~\u0000aV\u001eL.~\u0000qF\u000e\\>n\u0010qF\u000eV4d\u001a{L\u0004V4d\u001a{L\u0004V:j\u0014uB\nX:j\u0014uB\nX:b\u001c}J\u0002L>d\u001auZ\u0012@\"r\u0003V,s\u0002V)\u0003V,m\u0003V,m\u0002P1\u0002P=\u0002@(\u0003X,x\u0002\\(\u0002V1\u0003\\>y\u0002\\=".length();
        char var1 = 5;
        int var0 = -1;

        label24:
        while (true) {
            ++var0;
            String var10000 = var2.substring(var0, var0 + var1);
            byte var10001 = -1;

            while (true) {
                String var10 = a(d(var10000));
                var5[var3++] = var10;
                if (var10001 == 0) {
                    if ((var0 += var1) >= var4) {
                        f = true;
                        System.out.println(Arrays.toString(var5));
                        return;
                    }

                    var1 = var2.charAt(var0);
                } else {
                    if ((var0 += var1) < var4) {
                        var1 = var2.charAt(var0);
                        continue label24;
                    }

                    var2 = "\\)\u0002L1";
                    var4 = "\\)\u0002L1".length();
                    var1 = 2;
                    var0 = -1;
                }

                ++var0;
                var10000 = var2.substring(var0, var0 + var1);
                var10001 = 0;
            }
        }
    }
}