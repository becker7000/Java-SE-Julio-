public class Dado {

    public static void main(String[] args) {

        int dado = (int)(Math.random()*6+1);

        switch (dado){
            case 1 -> {
                System.out.print("\n\t +-----+");
                System.out.print("\n\t |  *  |");
                System.out.print("\n\t +-----+");
            }
            case 2 -> {
                System.out.print("\n\t +------+");
                System.out.print("\n\t | *    |");
                System.out.print("\n\t |    * |");
                System.out.print("\n\t +------+");
            }
            case 3 -> {
                System.out.print("\n\t +---------+");
                System.out.print("\n\t |  *      |");
                System.out.print("\n\t |    *    |");
                System.out.print("\n\t |      *  |");
                System.out.print("\n\t +---------+");
            }
            case 4 -> {
                System.out.print("\n\t +------+");
                System.out.print("\n\t | *  * |");
                System.out.print("\n\t | *  * |");
                System.out.print("\n\t +------+");
            }
            case 5 -> {
                System.out.print("\n\t +---------+");
                System.out.print("\n\t |  *   *  |");
                System.out.print("\n\t |    *    |");
                System.out.print("\n\t |  *   *  |");
                System.out.print("\n\t +---------+");
            }
            case 6 -> {
                System.out.print("\n\t +---------+");
                System.out.print("\n\t |  *   *  |");
                System.out.print("\n\t |  *   *  |");
                System.out.print("\n\t |  *   *  |");
                System.out.print("\n\t +---------+");
            }
        }

    }

}
