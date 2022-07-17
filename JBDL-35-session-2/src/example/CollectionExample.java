package example;

import java.util.*;

public class CollectionExample {

    public void arrayExample(){
        List<Integer> array = new ArrayList<>();
       //List<Integer> array = new Vector<>();

        array.add(30);
        array.add(995);
        array.add(101);
        array.add(20);

        for(int i =0;i<array.size();i++){
            System.out.println(array.get(i));
        }

        for(int i : array){
            System.out.println(i);
        }

        array.forEach(x->System.out.println(x));
        Collections.sort(array, new ReverseSortInt() );
        System.out.println();
        array.forEach(x->System.out.println(x));

    }

    public void LinkedListExample(){
        List<Integer> array = new LinkedList<>();
        array.add(30);
        array.add(995);
        array.add(101);
        array.add(20);
        for(int i =0;i<array.size();i++){
            System.out.println(array.get(i));
        }
        for(int i : array){
            System.out.println(i);
        }
        array.forEach(x->System.out.println(x));
        Collections.sort(array, new ReverseSortInt() );
        System.out.println();
        array.forEach(x->System.out.println(x));

    }

    public void SetExample(){
        Collection<Integer> array = new TreeSet<>();
        array.add(311);
        array.add(391);
        array.add(323);
        array.add(321);
        array.add(345);
        array.add(398);
        array.add(321);
        array.add(307);
        array.add(309);


        for(int i : array){
            System.out.println(i);
        }
        array.forEach(x->System.out.println(x));
        System.out.println();
        array.forEach(x->System.out.println(x));

    }

    public void pQExample(){
        Queue<Song> top10 = new PriorityQueue<>((song1,song2)->Integer.compare(song2.likes,song1.likes));
        top10.add(new Song(10));
        top10.add(new Song(110));
        top10.add(new Song(1110));
        top10.add(new Song(1220));
        top10.add(new Song(11320));
        top10.add(new Song(1220));
        top10.add(new Song(12130));
        top10.add(new Song(13230));
        top10.add(new Song(123230));
        top10.add(new Song(1320));
        top10.add(new Song(154540));
        top10.add(new Song(16650));
        top10.add(new Song(13440));

        //top1
        int i = 0;
      while(i<10){
          System.out.println(top10.poll().likes);
          i++;
      }


    }


}
