import java.util.Arrays;

public class GameMidlet {
    public static String[][][] a;
    public static String[][][] b;
    public static int[][][] c;
    public static int e;
    public static byte f;

    private static char[] c(String var0) {
        char[] var10000 = var0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }

        return var10000;
    }

    private static String a(char[] var0) {
        int var10002 = var0.length;

        for (int var1 = 0; var10002 > var1; ++var1) {
            char var10004 = var0[var1];
            byte var10005 = switch (var1 % 7) {
                case 0 -> 33;
                case 1 -> 55;
                case 2 -> 60;
                case 3 -> 51;
                case 4 -> 26;
                case 5 -> 54;
                default -> 88;
            };

            var0[var1] = (char) (var10004 ^ var10005);
        }

        return new String(var0);
    }

    public static void main(String[] args) {
        String[] var5 = new String[39];
        int var3 = 0;
        String var2 = "u_]]r\u0016\bIX\u001cgrW6\u0001cT\\{_\ryB\u001c`u\u0016\u001cHRI\u0013QO\u000e\u0010\u0006\u000e\u001d(\u0007k\u000f\u000f\t\u001d+\u0006i\u0014hYHVhX9U^S]{ZxrRNE\u007fD\u000fu_]]r\u0016\bIX\u001c`o\u0016\fT+ICHC \u0019wUESPrY1E^X\\tQvTD\u0013@h@1QD\u0013RlW,@Ecp4B U\u000e\u0010\u0006\u000e\u001d(\u0007k\u000f\u000f\t\u001d+\u0006n\u0011u_]]r\u0016\bIX\u001c{uW6\u0001zE\u000e\u0010\u0006\u000e\u001d(\u0007k\u000f\u000f\t\u001d+\u0007h\u000e\u0010\u0006\u000e\u001d(\u0007k\u000f\u000f\t\u001d+\u0006j0ICHC \u0019wUESPrY1E^X\\tQvTD\u0013@h@1QD\u0013RlW,@EU]nS*~t\u0012GbB\n`EUVi\u0016\u001bHCE\n\u000eV[VtBvUOH\u000e\u0010\u0006\u000e\u001d(\u0007k\u000f\u000f\t\u001d+\u0006k\u000b\u0010\u0006\u000e\u001d-\u000ev\u0010\u0019\u000e\u0006+ICHC \u0019wUR]^uT1\u000fTS^5E*W^L@5W.@C]AsX,DEX\u00014B U\u000fyB\u001c`u\u0016\fIVR\u0013N_=O%ICHC \u0019wUR]^uT1\u000fTS^5E*W^L@5W.@C]A(\u0018,YC\fbXRG\u007fX,\fcEC\u007f\u0013\u000e\u0018HVbB\u0015HYU~{FxQ[]Zt\u000f\u0013\u0006\f\u001d(\u0007i\u000f\u0006\f\n4\u0007i\u0018\u0011u_]]r\u0016\bIX\u001c~uX?\u0001zS\u0012u_]]r\u0016\bIX\u001cq{Yxc^R[\u0005B[S@\u007f\u0005mvlaU\u0006@A]G{D\u0012u_]]r\u0016\bIX\u001c{uWxc^R[\u0011u_]]r\u0016\bIX\u001c}rW6\u0001z]\u000e\u0010\u0006\u000e\u001d(\u0007k\u000f\u000f\t\u001d+\u0006l\n\u0013\u0000\u0012\u00034\u0007l\u000f\u0000\u000b\u0011u_]]r\u0016\bIX\u001cwsS-\u0001|E\u0012u_]]r\u0016\bIX\u001cg{[xf^]\\\u0005tcz\u001e\"\r\u000eGN\\l_<DE\u0012GbB\u0010u_]]r\u0016\bIX\u001cgh_xjN\nbXR]\u007fU,HXR\u0003frh";
        int var4 = var2.length();
        char var1 = 20;
        int var0 = -1;

        label24:
        while (true) {
            ++var0;
            String var10000 = var2.substring(var0, var0 + var1);
            byte var10001 = -1;

            while (true) {
                String var10 = a(c(var10000));
                if (var10001 == 0) {
                    var5[var3++] = var10;
                    if ((var0 += var1) >= var4) {
                        String[][][] var8 = new String[2][][];
                        String[][] var10003 = new String[2][];
                        String[] var10006 = new String[8];
                        var10006[0] = var5[1];
                        var10006[1] = var5[7];
                        var10006[2] = var5[31];
                        var10006[3] = var5[0];
                        var10006[4] = var5[34];
                        var10006[5] = var5[26];
                        var10006[6] = var5[30];
                        var10006[7] = var5[21];
                        var10003[0] = var10006;
                        var10003[1] = new String[]{var5[16], var5[22], var5[27], var5[4]};
                        var8[0] = var10003;
                        var8[1] = new String[][]{{var5[3], var5[11]}};
                        a = var8;
                        b = new String[][][]{{{var5[9], var5[28], var5[29], var5[6], var5[8], var5[2], var5[13]}, {var5[37], var5[20], var5[38]}}, {{var5[14]}}};
                        c = new int[][][]{{{19128, 19128, 19128, 19128, 19128, 19128, 19128, 19128, 19128}, {19128, 19128, 18128}}, {{19128}}};
                        String[][] d = new String[][]{{var5[17], var5[5]}, {var5[15], var5[10]}};
                        e = 8;
                        f = -1;
                        System.out.println(Arrays.toString(var5));
                        return;
                    }

                    var1 = var2.charAt(var0);
                } else {
                    var5[var3++] = var10;
                    if ((var0 += var1) < var4) {
                        var1 = var2.charAt(var0);
                        continue label24;
                    }

                    var2 = "\u0010\u0006\t\u001d\"\u0002v\u0010\u000f\u000f\u001d)\u000e\u000f\u0013\u0006\f\u001d(\u0007i\u000f\u0006\f\n4\u0007i\u0018";
                    var4 = "\u0010\u0006\t\u001d\"\u0002v\u0010\u000f\u000f\u001d)\u000e\u000f\u0013\u0006\f\u001d(\u0007i\u000f\u0006\f\n4\u0007i\u0018".length();
                    var1 = '\r';
                    var0 = -1;
                }

                ++var0;
                var10000 = var2.substring(var0, var0 + var1);
                var10001 = 0;
            }
        }
    }
}
