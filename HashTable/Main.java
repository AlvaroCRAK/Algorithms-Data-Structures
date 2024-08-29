public class Main{
  public static void main(String[] args){
    HashTable<String, Integer> hashTable = new HashTable<>();

    hashTable.put("Alvaro", 1);
    hashTable.put("Enrique", 2);
    hashTable.put("Cencia", 3);

    System.out.println(hashTable.get("Alvaro"));
    System.out.println(hashTable.get("Enrique"));
    System.out.println(hashTable.get("Cencia"));

    System.out.println(hashTable.remove("Alvaro");
  
    System.out.println(hashTable.get("Alvaro"));

    System.out.println(hashTable.size());
  }
}
