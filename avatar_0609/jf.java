public final class jf implements i6 {
   public byte[] b;
   public i6 c;

   public jf(je var1, byte[] var2) {
      this(var1, var2, 0, var2.length);
   }

   private jf(i6 var1, byte[] var2, int var3, int var4) {
      this.b = new byte[var4];
      this.c = var1;
      System.arraycopy(var2, 0, this.b, 0, var4);
   }
}
