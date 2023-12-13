import java.util.Vector;

public final class df {
   public short b;
   public short c;
   public byte d;
   public int[] e = new int[2];
   public int f;
   public String g = "";

   public static df b(Vector var0, int var1) {
      int var2 = var0.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         df var4;
         if ((var4 = (df)var0.elementAt(var3)).b == var1) {
            return var4;
         }
      }

      return null;
   }
}
