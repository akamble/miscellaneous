package multithreading;

import java.util.LinkedList;

class ProducerAndConsumer {

    int producerCapacity = 5;
    LinkedList<Integer> list = new LinkedList();

     void produce() throws InterruptedException {
         int value = 1;

         while ( true)
            {
                synchronized (this) {

                    while (list.size() == producerCapacity)
                        wait();
                    System.out.println("produce value "+ value);
                    list.add(value++);
//                    notify to the consumer thread that producer thread start producing..
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

    void consume() throws InterruptedException {

         while (true){

             synchronized (this) {
                 while ( list.size() == 0)
                     wait();

                 int value = list.removeFirst();

                 System.out.println("consume value " + value);
                 // to call producer thread to wake up
                 notify();
                 Thread.sleep(1000);

             }
         }
    }
}


public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        final ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();


        //create producer thread
        Thread producerThread = new Thread(new Runnable() {

            @Override
            public void run() {

               try{
                   producerAndConsumer.produce();
               }
               catch (InterruptedException e){
                   e.printStackTrace();
               }

            }

        });

        //create consumer thread
        Thread consumerThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try{
                    producerAndConsumer.consume();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });


//        start producer and consumer thread
        producerThread.start();
        consumerThread.start();

//        producerThread finish before consumerThread
        producerThread.join();
        consumerThread.join();

    }

}


