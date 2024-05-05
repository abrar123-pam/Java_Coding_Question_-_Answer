public class tower_of_hanoi {

    public static int toh(int disks, int source, int destination, int auxiliary) {
        if (disks == 1) {
            System.out.println("move disk 1 from rod " + source + " to rod " + destination);
            return 1;
        }

        int count1 = toh(disks - 1, source, auxiliary, destination);
        System.out.println("move disk " + disks + " from rod " + source + " to rod " + destination);
        int count2 = toh(disks - 1, auxiliary, destination, source);

        return count1 + count2 + 1;
    }

    public static void main(String[] args) {
        int n = 3;
        int total = toh(n,1,2,3);
        System.out.println(total);
    }
}