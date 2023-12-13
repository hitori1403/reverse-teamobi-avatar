public final class b6 {
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   public String[] p;
   private String[] q;
   public String[] r;
   private String[] s;
   public String[] t;
   private byte[] u;
   public int v = -1;
   public boolean w = false;
   private boolean x = false;
   private long y;
   public String[] z;
   public byte[] A;
   private static final String[] B;

   public b6() {
      String[] var10001 = new String[4];
      String[] var2 = B;
      var10001[0] = var2[24];
      var10001[1] = var2[14];
      var10001[2] = var2[9];
      var10001[3] = var2[5];
      this.z = var10001;
      this.A = new byte[]{4, 7, 0, 2};
      if (k4.p >= k4.o) {
         k4.L = false;
         this.e = k4.p / 6 << 1;
         k4.p -= this.e;
         this.b = 0;
         this.c = k4.p + 4;
         this.e -= 4;
         this.d = k4.o;
         this.f = this.d / 4;
         this.g = this.e / 2;
         this.h = this.b;
         this.i = this.c;
         this.j = this.e / 3;
         this.k = this.d / 4;
         this.l = 4;
         this.m = 2;
         this.n = 4;
         this.o = 3;
         this.p = new String[]{"-", var2[25], var2[4], "-", var2[6], var2[13], var2[17], var2[18]};
         this.q = new String[]{var2[7], var2[19], var2[12], hq.a2, var2[0], var2[2], var2[20], hq.b_, var2[16], var2[3], var2[21], "0"};
         this.r = new String[12];

         for(int var1 = 0; var1 < 12; ++var1) {
            this.r[var1] = this.q[var1].toUpperCase();
         }

         this.r[3] = this.q[3];
         this.s = new String[]{"1", "2", "3", hq.a2, "4", "5", "6", hq.b_, "7", "8", "9", "0"};
         this.u = new byte[]{-6, -1, 0, -7, -3, -2, -4, -5};
      } else {
         k4.L = true;
         this.d = k4.o / 6 << 1;
         k4.o -= this.d + 1;
         this.c = 1;
         this.e = k4.b.getHeight();
         this.b = k4.o + 4;
         this.d -= 4;
         this.f = this.d / 2;
         this.g = this.e / 4;
         this.h = this.b;
         this.i = this.c;
         this.j = this.e / 4;
         this.k = this.d / 3;
         this.l = 2;
         this.m = 4;
         this.n = 3;
         this.o = 4;
         var10001 = new String[]{"-", null, null, null, null, null, null, null};
         var2 = B;
         var10001[1] = var2[29];
         var10001[2] = var2[8];
         var10001[3] = var2[25];
         var10001[4] = var2[6];
         var10001[5] = var2[17];
         var10001[6] = "-";
         var10001[7] = var2[13];
         this.p = var10001;
         this.q = new String[]{var2[22], var2[10], var2[27], var2[26], var2[23], var2[1], var2[28], var2[11], var2[15], hq.b_, "0", hq.a2};
         this.r = new String[12];

         for(int var3 = 0; var3 < 11; ++var3) {
            this.r[var3] = this.q[var3].toUpperCase();
         }

         this.r[11] = this.q[11];
         this.s = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", hq.b_, "0", hq.a2};
         this.u = new byte[]{-7, -5, 0, -1, -3, -4, -6, -2};
      }

      this.y = -1L;
      this.d();
   }

   private static void a() {
      if (k4.ah > 0) {
         cs.L.b();
      } else if (e3.p) {
         e3.e().g.a();
      } else {
         if (k4.u.g != null && k4.u.g.b.equals(hq.a2)) {
            k4.u.g.c.b();
         }
      }
   }

   public final void b() {
      if (!this.w) {
         if (this.x && k4.h) {
            this.x = false;
            if (System.currentTimeMillis() / 10L - this.y > 40L) {
               cs.d();
               this.d();
            } else {
               this.v = -1;
               this.w = true;
            }
         }

         if (k4.d(this.b, this.c, this.d, this.e)) {
            if (k4.g) {
               int var4 = (k4.j - this.b) / this.f;
               int var6 = (k4.k - this.c) / this.g;
               this.v = var6 * this.l + var4;
               var6 = this.v;
               if (var6 == 2) {
                  this.y = System.currentTimeMillis() / 10L;
                  this.x = true;
               } else {
                  k4.b.keyPressed(this.u[var6]);
               }

               k4.g = false;
            }

            if (k4.h && this.v != -1) {
               int var8 = this.v;
               if (var8 != 2 && var8 < this.u.length) {
                  k4.b.keyReleased(this.u[var8]);
               }

               this.v = -1;
               k4.h = false;
            }
         }
      } else {
         if (k4.d(this.h, this.i, this.d, this.e)) {
            if (k4.g) {
               int var2 = (k4.j - this.h) / this.k;
               int var3 = (k4.k - this.i) / this.j;
               this.v = var3 * this.n + var2;
               var3 = this.v;
               if (k4.L && var3 < 9) {
                  k4.b.keyPressed(var3 + 49);
               } else if (!k4.L && var3 % 4 != 3) {
                  k4.b.keyPressed(var3 + 49 - var3 / 4);
               } else {
                  switch(var3) {
                     case 3:
                        a();
                     case 4:
                     case 5:
                     case 6:
                     case 8:
                     default:
                        break;
                     case 7:
                     case 9:
                        this.w = false;
                        break;
                     case 10:
                        k4.b.keyPressed(48);
                        break;
                     case 11:
                        if (k4.L) {
                           a();
                        } else {
                           k4.b.keyPressed(48);
                        }
                  }
               }

               k4.g = false;
            }

            if (k4.h && this.v != -1) {
               this.v = -1;
               k4.h = false;
            }
         }
      }
   }

   private void d() {
      switch(cs.B) {
         case 0:
         case 1:
            this.t = this.q;
            return;
         case 2:
            this.t = this.r;
            return;
         case 3:
            this.t = this.s;
      }
   }

   static {
      String[] var5 = new String[30];
      int var3 = 0;
      String var2 = "LI5A\u0004FO3C\u0004AJ0@\u0004_T*M\u0003jc\u001f\u0005yH;\u001dQ\u0004gD:\u0001\u0005\u0005\rcT\u0014\u0003jc\u001f\u0004gD:\u0001\u0004JC?G\u0004_T*M\u0004OD:F\u0004oN+\u001b\u0004oN+\u001b\u0005\\Y%\u000f\u001c\u0005[P.\u0006\u0012\u0005yH;\u001dQ\u0002dj\u0004JC?G\u0004FO3C\u0005\\Y%\u000f\u001c\u0005\u0005\rcT\u0014\u0004AJ0@\u0003\u007fN,\u0003\u007fN,\u0004LI5A\u0004OD:F";
      int var4 = "LI5A\u0004FO3C\u0004AJ0@\u0004_T*M\u0003jc\u001f\u0005yH;\u001dQ\u0004gD:\u0001\u0005\u0005\rcT\u0014\u0003jc\u001f\u0004gD:\u0001\u0004JC?G\u0004_T*M\u0004OD:F\u0004oN+\u001b\u0004oN+\u001b\u0005\\Y%\u000f\u001c\u0005[P.\u0006\u0012\u0005yH;\u001dQ\u0002dj\u0004JC?G\u0004FO3C\u0005\\Y%\u000f\u001c\u0005\u0005\rcT\u0014\u0004AJ0@\u0003\u007fN,\u0003\u007fN,\u0004LI5A\u0004OD:F"
         .length();
      char var1 = 4;
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
                     B = var5;
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

                  var2 = "[P.\u0006\u0012\u0002dj";
                  var4 = "[P.\u0006\u0012\u0002dj".length();
                  var1 = 5;
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
         var10000[0] = (char)(var10000[0] ^ '&');
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
               var10005 = 43;
               break;
            case 1:
               var10005 = 33;
               break;
            case 2:
               var10005 = 92;
               break;
            case 3:
               var10005 = 117;
               break;
            case 4:
               var10005 = 37;
               break;
            case 5:
               var10005 = 73;
               break;
            default:
               var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
