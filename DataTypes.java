class DataTypes{
	public static void main( String[] args){
	System.out.print("S.No   Data type   Size   MIN_VALUE   MAX_VALUE \n");
	System.out.println("1      int         "+ Integer.SIZE/8    +  "    " + Integer.MIN_VALUE     +  "      " + Integer.MAX_VALUE );
	System.out.println("2      float       "+ Float.SIZE/8      +  "    " + Float.MIN_VALUE      +   "       " + Float.MAX_VALUE );
	System.out.println("3      double      "+ Double.SIZE/8     + "    "  + Double.MIN_VALUE      + "       "  + Double.MAX_VALUE);
	System.out.println("4      character   "+ Character.SIZE/8  +  "    " +(Character.MIN_VALUE+0)     + "            " +(Character.MAX_VALUE+0));
	System.out.println("5      long        "+ Long.SIZE/8       +  "   " + Long.MIN_VALUE          + "      "  +Long.MAX_VALUE );
	System.out.println("6      short       "+ Short.SIZE/8      + "     "  + Short.MIN_VALUE         + "              " +  Short.MAX_VALUE);

	}
}