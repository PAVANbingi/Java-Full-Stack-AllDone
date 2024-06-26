
public class Collections {
    public static void main(String args[]){
        // List:
        List<String> list=new ArrayList<>();
        list.add("pavankumar bingi");
        list.add("bingi");
        // 
        list.remove(1);
        System.out.println(list);
        // Set
        Set<String> set=new HashSet<>();
        set.add("Viany kumar bingi");
        // Map
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"bingipavankumar");
        // Queue
        Queue<String>queue=new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        System.out.println(queue);
        queue.poll();   //it retrives and removes the head of the queue/    last yeedhe vunti adhi estadhi.:)/
        System.out.println("queue after poll :"+queue);

        System.out.println("queue peek "+queue.peek());//retrives but doesnot removes the head of the queue


    }
    
}
