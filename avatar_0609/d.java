public final class d extends Exception {
   private Throwable b;

   public d(String var1) {
      super(var1);
   }

   public d(Exception var1) {
      super(var1.getMessage());
      this.b = var1;
   }
}
