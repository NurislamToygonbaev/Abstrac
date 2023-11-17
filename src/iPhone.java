public abstract class iPhone {


    public static void menuLOck(){
        System.out.println(STR."""
                |----------------------|
                |      |_(0)_|         |
                |                      |
                |        🔒            |
                |                      |
                |                      |
                |       Locked         |
                |                      |
                |                      |
                |                      |
                |______________________|
                """);
    }


    public static void menu(){
        System.out.println(STR."""
                |----------------------|
                |      |_(0)_|         |
                |        🔓            |
                |                      |
                |     1. Calculate     |
                |                      |
                |     2. Notes         |
                |                      |
                |     3. Mbank         |
                |                      |
                |     4. Block         |
                |______________________|
                """);
    }


    public static void bankMenu(){
        System.out.println(STR."""
                |----------------------|
                |      |_(0)_|         |
                |       MBank          |
                |                      |
                |1. Балансты текшеруу  |
                |                      |
                |2. Баланска ачка салуу|
                |                      |
                |      3. Exit         |
                |                      |
                |                      |
                |______________________|
                """);
    }
}
