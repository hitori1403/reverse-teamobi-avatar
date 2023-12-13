import javax.microedition.lcdui.Image;

public final class dm {
   public Image b;
   public short c;
   public short d;
   public int e = -1;

   public dm() {
   }

   public dm(Image var1) {
      this.b = var1;
      this.e = 0;
      this.c = (short)var1.getWidth();
      this.d = (short)var1.getHeight();
   }
}
