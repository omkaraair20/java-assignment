import java.util.ArrayList;

class ArrayListExample {
      public static void main(String[] args) {
             ArrayList<String> names=new ArrayList<>();

             names.add("Pankaj");
             names.add("Alok");
             names.add("Omji");

             String firstPerson=names.get(0);
             System.out.println("First person:"+firstPerson);

             System.out.print("Names:");
             for(String name:names){
                System.out.println(name+"");
             }
             System.out.println();

             boolean containsAlok=names.contains("alok");
             System.out.println("Does the list contain 'Alok'?"+containsAlok);

             names.remove("Omji");

             int size=names.size();
             System.out.println("Size of the ArrayList:"+size);

             names.clear();

             boolean isEmpty=names.isEmpty();
             System.out.println("It is ArrayList empty?"+isEmpty);
      }
    
}