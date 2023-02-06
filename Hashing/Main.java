public class Main {
  public static void main(String[] args) {
    DirectChaining directChaining = new DirectChaining(15);
    directChaining.insertHashTable("The");
    directChaining.insertHashTable("quick");
    directChaining.insertHashTable("brown");
    directChaining.insertHashTable("brown");
    directChaining.insertHashTable("fox");
    directChaining.insertHashTable("over");
    directChaining.displayHashTable();
    directChaining.searchHashTable("fox");
    directChaining.searchHashTable("foxes");
    directChaining.deleteKeyHashTable("The");
    directChaining.displayHashTable();

    LinearProbing lp = new LinearProbing(13);
    lp.insertInHashTable("The");
    lp.insertInHashTable("quick");
    lp.insertInHashTable("brown");
    lp.insertInHashTable("fox");
    lp.insertInHashTable("over");
    lp.displayHashTable();
    lp.searchHashTable("fox");
    lp.deleteKeyHashTable("over");
    lp.displayHashTable();
  }
}