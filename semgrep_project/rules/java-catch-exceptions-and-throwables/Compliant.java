class Main {
    public static void numbers2()
    {
    try {
    int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Something went wrong.");
    }
    }
}