import java.util.Random;

public final class h {
   private static h b;
   private Random c = new Random();

   public static h b() {
      return b == null ? new h() : b;
   }

   public final int b(int var1, int var2) {
      if (this.c == null) {
         this.c = new Random();
      }

      return var1 + this.c.nextInt(var2 - var1 + 1);
   }
}
