public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
         System.out.println("Total goals: " + barcelona.goals());
          barcelona.printPlayers();
        barcelona.addPlayer(pekka);
         System.out.println("Total goals: " + barcelona.goals());
          barcelona.printPlayers();
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
        barcelona.printPlayers();

        System.out.println("Total goals: " + barcelona.goals());
    }
}