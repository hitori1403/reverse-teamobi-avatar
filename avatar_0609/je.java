public final class je implements i6 {
   public byte[] b;

   public je(byte[] var1) {
      this(var1, 0, var1.length);
   }

   private je(byte[] var1, int var2, int var3) {
      this.b = new byte[var3];
      System.arraycopy(var1, 0, this.b, 0, var3);
   }
}
