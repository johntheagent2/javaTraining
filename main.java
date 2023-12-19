import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class main{
    public static void main(String[] args) throws IOException {

        Integer[] arr = {1,1,0,2,3,4,5};

        print("array List");
        List<Integer> arrList = new ArrayList<>();
        
        arrList = Arrays.asList(arr);

        print(arrList.subList(0,3));
        print(arrList);
        printDevider();

        print("Linked list");
        LinkedList<Integer> linkedList = new LinkedList<>(arrList);
        print(linkedList);
        print(linkedList.pop());
        print(linkedList.pop());
        print(linkedList);
        printDevider();

        print("stack");
        Stack<Integer> stack = new Stack<>();
        for(Integer temp : arr){
            stack.push(temp);
        }
        print(stack);
        System.out.println(stack.peek());
        print(stack);
        System.out.println(stack.pop());;
        System.out.println(stack.pop());;
        print(stack);
        printDevider();

        print("hash map");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "foo");
        map.put(2, "bar");
        map.put(null, null);
        print(map);
        System.out.println(map.get(2));
        printDevider();

        print("hash table"); //no null key or value allowed
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "foo");
        table.put(2, "bar");
        // table.put(null, null);
        print(table);
        System.out.println(table.get(2));
        printDevider();

        print("Set");
        Set<Integer> set = new HashSet<>();
        set.addAll(arrList);
        print(set);
        printDevider();

        print("date");
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        printDevider();
        
        print("collections");
        Set<Integer> set2 = new HashSet<>();

        Collections.addAll(set2, arr);
        Collections.sort(arrList);
        print(arrList);
        Collections.shuffle(arrList);
        print(arrList);
        Collections.sort(arrList);

        print(Collections.frequency(arrList, 1));
        print(arrList);
        print(set2);
        printDevider();

        print("Vector");
        Vector vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add("Hello");
        vector.add(3);

        print(vector);
        vector.remove(1);
        print(vector);
        printDevider();

        print("Properties");
        FileReader reader = new FileReader("test.txt");

        Properties properties = new Properties();
        properties.load(reader);

        Set tempSet = properties.entrySet();  

        Iterator itr = tempSet.iterator();  
        while(itr.hasNext()){  
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey()+" = "+entry.getValue());  
        }  

        print(properties.getProperty("email"));
        print(properties.getProperty("password"));

        properties.store(new FileWriter("test.txt"), "test");
        printDevider();

        print("Resource Bundle");
        Locale localeEn = new Locale("en");
        Locale localeVn = new Locale("vn");
        ResourceBundle labelsUS = ResourceBundle.getBundle("lang/label", localeEn);
        ResourceBundle labelsVN = ResourceBundle.getBundle("lang/label", localeVn);
        System.out.println(labelsUS.getString("GREETING"));
        System.out.println(labelsVN.getString("GREETING"));
        printDevider();

        print("Calender");
        
    }

    public static void print(Object object){
        System.out.println(object);
    }

    public static void printDevider(){
        System.out.println("==================");
    }
}